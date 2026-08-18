package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.badlogic.gdx.Net;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes.dex */
public class InvalidationTracker {
    private static final String CREATE_TRACKING_TABLE_SQL = "CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)";
    private static final String INVALIDATED_COLUMN_NAME = "invalidated";

    @VisibleForTesting
    static final String RESET_UPDATED_TABLES_SQL = "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ";

    @VisibleForTesting
    static final String SELECT_UPDATED_TABLES_SQL = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;";
    private static final String TABLE_ID_COLUMN_NAME = "table_id";
    private static final String[] TRIGGERS = {"UPDATE", Net.HttpMethods.DELETE, "INSERT"};
    private static final String UPDATE_TABLE_NAME = "room_table_modification_log";
    volatile SupportSQLiteStatement mCleanupStatement;
    final RoomDatabase mDatabase;
    private volatile boolean mInitialized;
    private final InvalidationLiveDataContainer mInvalidationLiveDataContainer;
    private MultiInstanceInvalidationClient mMultiInstanceInvalidationClient;
    private ObservedTableTracker mObservedTableTracker;

    @SuppressLint({"RestrictedApi"})
    @VisibleForTesting
    final SafeIterableMap<Observer, ObserverWrapper> mObserverMap;
    AtomicBoolean mPendingRefresh;

    @VisibleForTesting
    Runnable mRefreshRunnable;

    @NonNull
    final HashMap<String, Integer> mTableIdLookup;
    final String[] mTableNames;

    @NonNull
    private Map<String, Set<String>> mViewTables;

    public static class ObservedTableTracker {
        static final int ADD = 1;
        static final int NO_OP = 0;
        static final int REMOVE = 2;
        boolean mNeedsSync;
        boolean mPendingSync;
        final long[] mTableObservers;
        final int[] mTriggerStateChanges;
        final boolean[] mTriggerStates;

        public ObservedTableTracker(int i) {
            long[] jArr = new long[i];
            this.mTableObservers = jArr;
            boolean[] zArr = new boolean[i];
            this.mTriggerStates = zArr;
            this.mTriggerStateChanges = new int[i];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        @Nullable
        public int[] getTablesToSync() {
            synchronized (this) {
                try {
                    if (this.mNeedsSync && !this.mPendingSync) {
                        int length = this.mTableObservers.length;
                        int i = 0;
                        while (true) {
                            int i2 = 1;
                            if (i >= length) {
                                this.mPendingSync = true;
                                this.mNeedsSync = false;
                                return this.mTriggerStateChanges;
                            }
                            boolean z = this.mTableObservers[i] > 0;
                            boolean[] zArr = this.mTriggerStates;
                            if (z != zArr[i]) {
                                int[] iArr = this.mTriggerStateChanges;
                                if (!z) {
                                    i2 = 2;
                                }
                                iArr[i] = i2;
                            } else {
                                this.mTriggerStateChanges[i] = 0;
                            }
                            zArr[i] = z;
                            i++;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean onAdded(int... iArr) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.mTableObservers;
                        long j = jArr[i];
                        jArr[i] = 1 + j;
                        if (j == 0) {
                            z = true;
                            this.mNeedsSync = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public boolean onRemoved(int... iArr) {
            boolean z;
            synchronized (this) {
                try {
                    z = false;
                    for (int i : iArr) {
                        long[] jArr = this.mTableObservers;
                        long j = jArr[i];
                        jArr[i] = j - 1;
                        if (j == 1) {
                            z = true;
                            this.mNeedsSync = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z;
        }

        public void onSyncCompleted() {
            synchronized (this) {
                this.mPendingSync = false;
            }
        }
    }

    public static class ObserverWrapper {
        final Observer mObserver;
        private final Set<String> mSingleTableSet;
        final int[] mTableIds;
        private final String[] mTableNames;

        public ObserverWrapper(Observer observer, int[] iArr, String[] strArr) {
            this.mObserver = observer;
            this.mTableIds = iArr;
            this.mTableNames = strArr;
            if (iArr.length != 1) {
                this.mSingleTableSet = null;
                return;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(strArr[0]);
            this.mSingleTableSet = Collections.unmodifiableSet(hashSet);
        }

        public void notifyByTableInvalidStatus(Set<Integer> set) {
            int length = this.mTableIds.length;
            Set<String> hashSet = null;
            for (int i = 0; i < length; i++) {
                if (set.contains(Integer.valueOf(this.mTableIds[i]))) {
                    if (length == 1) {
                        hashSet = this.mSingleTableSet;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet<>(length);
                        }
                        hashSet.add(this.mTableNames[i]);
                    }
                }
            }
            if (hashSet != null) {
                this.mObserver.onInvalidated(hashSet);
            }
        }

        public void notifyByTableNames(String[] strArr) {
            Set<String> set = null;
            if (this.mTableNames.length == 1) {
                for (String str : strArr) {
                    if (str.equalsIgnoreCase(this.mTableNames[0])) {
                        set = this.mSingleTableSet;
                        break;
                    }
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str2 : strArr) {
                    for (String str3 : this.mTableNames) {
                        if (str3.equalsIgnoreCase(str2)) {
                            hashSet.add(str3);
                            break;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.mObserver.onInvalidated(set);
            }
        }
    }

    public static class WeakObserver extends Observer {
        final WeakReference<Observer> mDelegateRef;
        final InvalidationTracker mTracker;

        public WeakObserver(InvalidationTracker invalidationTracker, Observer observer) {
            super(observer.mTables);
            this.mTracker = invalidationTracker;
            this.mDelegateRef = new WeakReference<>(observer);
        }

        @Override // androidx.room.InvalidationTracker.Observer
        public void onInvalidated(@NonNull Set<String> set) {
            Observer observer = this.mDelegateRef.get();
            if (observer == null) {
                this.mTracker.removeObserver(this);
            } else {
                observer.onInvalidated(set);
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase roomDatabase, String... strArr) {
        this(roomDatabase, new HashMap(), Collections.emptyMap(), strArr);
    }

    private static void appendTriggerName(StringBuilder sb, String str, String str2) {
        AbstractC5044xl.t(sb, "`", "room_table_modification_trigger_", str, "_");
        sb.append(str2);
        sb.append("`");
    }

    private String[] resolveViews(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.mViewTables.containsKey(lowerCase)) {
                hashSet.addAll(this.mViewTables.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    private void startTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        supportSQLiteDatabase.execSQL("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)");
        String str = this.mTableNames[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : TRIGGERS) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            appendTriggerName(sb, str, str2);
            AbstractC5044xl.t(sb, " AFTER ", str2, " ON `", str);
            AbstractC5044xl.t(sb, "` BEGIN UPDATE ", UPDATE_TABLE_NAME, " SET ", INVALIDATED_COLUMN_NAME);
            AbstractC5044xl.t(sb, " = 1", " WHERE ", TABLE_ID_COLUMN_NAME, " = ");
            sb.append(i);
            sb.append(" AND ");
            sb.append(INVALIDATED_COLUMN_NAME);
            sb.append(" = 0");
            sb.append("; END");
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    private void stopTrackingTable(SupportSQLiteDatabase supportSQLiteDatabase, int i) {
        String str = this.mTableNames[i];
        StringBuilder sb = new StringBuilder();
        for (String str2 : TRIGGERS) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            appendTriggerName(sb, str, str2);
            supportSQLiteDatabase.execSQL(sb.toString());
        }
    }

    private String[] validateAndResolveTableNames(String[] strArr) {
        String[] strArrResolveViews = resolveViews(strArr);
        for (String str : strArrResolveViews) {
            if (!this.mTableIdLookup.containsKey(str.toLowerCase(Locale.US))) {
                throw new IllegalArgumentException("There is no table with name ".concat(str));
            }
        }
        return strArrResolveViews;
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void addObserver(@NonNull Observer observer) {
        ObserverWrapper observerWrapperPutIfAbsent;
        String[] strArrResolveViews = resolveViews(observer.mTables);
        int[] iArr = new int[strArrResolveViews.length];
        int length = strArrResolveViews.length;
        for (int i = 0; i < length; i++) {
            Integer num = this.mTableIdLookup.get(strArrResolveViews[i].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrResolveViews[i]);
            }
            iArr[i] = num.intValue();
        }
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, strArrResolveViews);
        synchronized (this.mObserverMap) {
            observerWrapperPutIfAbsent = this.mObserverMap.putIfAbsent(observer, observerWrapper);
        }
        if (observerWrapperPutIfAbsent == null && this.mObservedTableTracker.onAdded(iArr)) {
            syncTriggers();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void addWeakObserver(Observer observer) {
        addObserver(new WeakObserver(this, observer));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public <T> LiveData<T> createLiveData(String[] strArr, Callable<T> callable) {
        return createLiveData(strArr, false, callable);
    }

    public boolean ensureInitialization() {
        if (!this.mDatabase.isOpen()) {
            return false;
        }
        if (!this.mInitialized) {
            this.mDatabase.getOpenHelper().getWritableDatabase();
        }
        return this.mInitialized;
    }

    public void internalInit(SupportSQLiteDatabase supportSQLiteDatabase) {
        synchronized (this) {
            try {
                if (this.mInitialized) {
                    return;
                }
                supportSQLiteDatabase.execSQL("PRAGMA temp_store = MEMORY;");
                supportSQLiteDatabase.execSQL("PRAGMA recursive_triggers='ON';");
                supportSQLiteDatabase.execSQL(CREATE_TRACKING_TABLE_SQL);
                syncTriggers(supportSQLiteDatabase);
                this.mCleanupStatement = supportSQLiteDatabase.compileStatement(RESET_UPDATED_TABLES_SQL);
                this.mInitialized = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting(otherwise = 3)
    public void notifyObserversByTableNames(String... strArr) {
        synchronized (this.mObserverMap) {
            try {
                for (Map.Entry<Observer, ObserverWrapper> entry : this.mObserverMap) {
                    if (!entry.getKey().isRemote()) {
                        entry.getValue().notifyByTableNames(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void refreshVersionsAsync() {
        if (this.mPendingRefresh.compareAndSet(false, true)) {
            this.mDatabase.getQueryExecutor().execute(this.mRefreshRunnable);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @WorkerThread
    public void refreshVersionsSync() {
        syncTriggers();
        this.mRefreshRunnable.run();
    }

    @SuppressLint({"RestrictedApi"})
    @WorkerThread
    public void removeObserver(@NonNull Observer observer) {
        ObserverWrapper observerWrapperRemove;
        synchronized (this.mObserverMap) {
            observerWrapperRemove = this.mObserverMap.remove(observer);
        }
        if (observerWrapperRemove == null || !this.mObservedTableTracker.onRemoved(observerWrapperRemove.mTableIds)) {
            return;
        }
        syncTriggers();
    }

    public void startMultiInstanceInvalidation(Context context, String str) {
        this.mMultiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, str, this, this.mDatabase.getQueryExecutor());
    }

    public void stopMultiInstanceInvalidation() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.mMultiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.stop();
            this.mMultiInstanceInvalidationClient = null;
        }
    }

    public void syncTriggers(SupportSQLiteDatabase supportSQLiteDatabase) {
        if (supportSQLiteDatabase.inTransaction()) {
            return;
        }
        while (true) {
            try {
                Lock closeLock = this.mDatabase.getCloseLock();
                closeLock.lock();
                try {
                    int[] tablesToSync = this.mObservedTableTracker.getTablesToSync();
                    if (tablesToSync == null) {
                        closeLock.unlock();
                        return;
                    }
                    int length = tablesToSync.length;
                    supportSQLiteDatabase.beginTransaction();
                    for (int i = 0; i < length; i++) {
                        try {
                            int i2 = tablesToSync[i];
                            if (i2 == 1) {
                                startTrackingTable(supportSQLiteDatabase, i);
                            } else if (i2 == 2) {
                                stopTrackingTable(supportSQLiteDatabase, i);
                            }
                        } catch (Throwable th) {
                            supportSQLiteDatabase.endTransaction();
                            throw th;
                        }
                    }
                    supportSQLiteDatabase.setTransactionSuccessful();
                    supportSQLiteDatabase.endTransaction();
                    this.mObservedTableTracker.onSyncCompleted();
                    closeLock.unlock();
                } catch (Throwable th2) {
                    closeLock.unlock();
                    throw th2;
                }
            } catch (SQLiteException | IllegalStateException unused) {
                return;
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public InvalidationTracker(RoomDatabase roomDatabase, Map<String, String> map, Map<String, Set<String>> map2, String... strArr) {
        this.mPendingRefresh = new AtomicBoolean(false);
        this.mInitialized = false;
        this.mObserverMap = new SafeIterableMap<>();
        this.mRefreshRunnable = new Runnable() { // from class: androidx.room.InvalidationTracker.1
            private Set<Integer> checkUpdatedTable() {
                HashSet hashSet = new HashSet();
                Cursor cursorQuery = InvalidationTracker.this.mDatabase.query(new SimpleSQLiteQuery(InvalidationTracker.SELECT_UPDATED_TABLES_SQL));
                while (cursorQuery.moveToNext()) {
                    try {
                        hashSet.add(Integer.valueOf(cursorQuery.getInt(0)));
                    } catch (Throwable th) {
                        cursorQuery.close();
                        throw th;
                    }
                }
                cursorQuery.close();
                if (!hashSet.isEmpty()) {
                    InvalidationTracker.this.mCleanupStatement.executeUpdateDelete();
                }
                return hashSet;
            }

            @Override // java.lang.Runnable
            public void run() {
                Lock closeLock = InvalidationTracker.this.mDatabase.getCloseLock();
                Set<Integer> setCheckUpdatedTable = null;
                try {
                    try {
                        closeLock.lock();
                        if (!InvalidationTracker.this.ensureInitialization()) {
                            closeLock.unlock();
                            return;
                        }
                        if (!InvalidationTracker.this.mPendingRefresh.compareAndSet(true, false)) {
                            closeLock.unlock();
                            return;
                        }
                        if (InvalidationTracker.this.mDatabase.inTransaction()) {
                            closeLock.unlock();
                            return;
                        }
                        RoomDatabase roomDatabase2 = InvalidationTracker.this.mDatabase;
                        if (roomDatabase2.mWriteAheadLoggingEnabled) {
                            SupportSQLiteDatabase writableDatabase = roomDatabase2.getOpenHelper().getWritableDatabase();
                            writableDatabase.beginTransaction();
                            try {
                                setCheckUpdatedTable = checkUpdatedTable();
                                writableDatabase.setTransactionSuccessful();
                                writableDatabase.endTransaction();
                            } catch (Throwable th) {
                                writableDatabase.endTransaction();
                                throw th;
                            }
                        } else {
                            setCheckUpdatedTable = checkUpdatedTable();
                        }
                        closeLock.unlock();
                        if (setCheckUpdatedTable == null || setCheckUpdatedTable.isEmpty()) {
                            return;
                        }
                        synchronized (InvalidationTracker.this.mObserverMap) {
                            try {
                                Iterator<Map.Entry<Observer, ObserverWrapper>> it = InvalidationTracker.this.mObserverMap.iterator();
                                while (it.hasNext()) {
                                    it.next().getValue().notifyByTableInvalidStatus(setCheckUpdatedTable);
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (SQLiteException | IllegalStateException unused) {
                    }
                } catch (Throwable th3) {
                    closeLock.unlock();
                    throw th3;
                }
            }
        };
        this.mDatabase = roomDatabase;
        this.mObservedTableTracker = new ObservedTableTracker(strArr.length);
        this.mTableIdLookup = new HashMap<>();
        this.mViewTables = map2;
        this.mInvalidationLiveDataContainer = new InvalidationLiveDataContainer(roomDatabase);
        int length = strArr.length;
        this.mTableNames = new String[length];
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.mTableIdLookup.put(lowerCase, Integer.valueOf(i));
            String str2 = map.get(strArr[i]);
            if (str2 != null) {
                this.mTableNames[i] = str2.toLowerCase(locale);
            } else {
                this.mTableNames[i] = lowerCase;
            }
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String value = entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = value.toLowerCase(locale2);
            if (this.mTableIdLookup.containsKey(lowerCase2)) {
                String lowerCase3 = entry.getKey().toLowerCase(locale2);
                HashMap<String, Integer> map3 = this.mTableIdLookup;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public <T> LiveData<T> createLiveData(String[] strArr, boolean z, Callable<T> callable) {
        return this.mInvalidationLiveDataContainer.create(validateAndResolveTableNames(strArr), z, callable);
    }

    public static abstract class Observer {
        final String[] mTables;

        public Observer(@NonNull String str, String... strArr) {
            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
            this.mTables = strArr2;
            strArr2[strArr.length] = str;
        }

        public boolean isRemote() {
            return false;
        }

        public abstract void onInvalidated(@NonNull Set<String> set);

        public Observer(@NonNull String[] strArr) {
            this.mTables = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
    }

    public void syncTriggers() {
        if (this.mDatabase.isOpen()) {
            syncTriggers(this.mDatabase.getOpenHelper().getWritableDatabase());
        }
    }
}
