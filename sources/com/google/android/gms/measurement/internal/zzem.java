package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzem extends zzf {
    private final zzel zza;
    private boolean zzb;

    public zzem(zzgd zzgdVar) {
        super(zzgdVar);
        Context contextZzaw = this.zzt.zzaw();
        this.zzt.zzf();
        this.zza = new zzel(this, contextZzaw, "google_app_measurement_local.db");
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00f2 A[PHI: r8
  0x00f2: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:60:0x00f0, B:76:0x0122] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:80:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0132  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v9 */
    @WorkerThread
    private final boolean zzq(int i, byte[] bArr) throws Throwable {
        SQLiteDatabase sQLiteDatabaseZzh;
        ?? RawQuery;
        ?? r10;
        zzg();
        ?? r2 = 0;
        if (this.zzb) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", bArr);
        this.zzt.zzf();
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            ?? r8 = 0;
             = 0;
            ?? r9 = 0;
            sQLiteDatabase = null;
            SQLiteDatabase sQLiteDatabase = null;
            try {
                sQLiteDatabaseZzh = zzh();
                try {
                    if (sQLiteDatabaseZzh == null) {
                        this.zzb = true;
                        return r2;
                    }
                    sQLiteDatabaseZzh.beginTransaction();
                    RawQuery = sQLiteDatabaseZzh.rawQuery("select count(1) from messages", null);
                    long j = 0;
                    if (RawQuery != 0) {
                        try {
                            if (RawQuery.moveToFirst()) {
                                j = RawQuery.getLong(r2);
                            }
                        } catch (SQLiteDatabaseLockedException unused) {
                            r9 = RawQuery;
                            try {
                                SystemClock.sleep(i3);
                                i3 += 20;
                                if (r9 != 0) {
                                    r9.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                i2++;
                                r2 = 0;
                            } catch (Throwable th) {
                                th = th;
                                r8 = r9;
                                if (r8 != 0) {
                                    r8.close();
                                }
                                if (sQLiteDatabaseZzh != null) {
                                    sQLiteDatabaseZzh.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteFullException e) {
                            e = e;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            r10 = RawQuery;
                            this.zzt.zzaA().zzd().zzb("Error writing entry; local database full", e);
                            this.zzb = true;
                            if (r10 != 0) {
                                r10.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteDatabase = sQLiteDatabaseZzh;
                            RawQuery = RawQuery;
                            if (sQLiteDatabase != null) {
                                try {
                                    if (sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    sQLiteDatabaseZzh = sQLiteDatabase;
                                    r8 = RawQuery;
                                    if (r8 != 0) {
                                        r8.close();
                                    }
                                    if (sQLiteDatabaseZzh != null) {
                                        sQLiteDatabaseZzh.close();
                                    }
                                    throw th;
                                }
                            }
                            this.zzt.zzaA().zzd().zzb("Error writing entry to local database", e);
                            this.zzb = true;
                            if (RawQuery != 0) {
                                RawQuery.close();
                            }
                            if (sQLiteDatabase != null) {
                                sQLiteDatabase.close();
                            }
                            i2++;
                            r2 = 0;
                        } catch (Throwable th3) {
                            th = th3;
                            r8 = RawQuery;
                            if (r8 != 0) {
                                r8.close();
                            }
                            if (sQLiteDatabaseZzh != null) {
                                sQLiteDatabaseZzh.close();
                            }
                            throw th;
                        }
                    }
                    if (j >= 100000) {
                        this.zzt.zzaA().zzd().zza("Data loss, local db full");
                        String[] strArr = new String[1];
                        long j2 = 100001 - j;
                        strArr[r2] = Long.toString(j2);
                        long jDelete = sQLiteDatabaseZzh.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", strArr);
                        if (jDelete != j2) {
                            this.zzt.zzaA().zzd().zzd("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                        }
                    }
                    sQLiteDatabaseZzh.insertOrThrow("messages", null, contentValues);
                    sQLiteDatabaseZzh.setTransactionSuccessful();
                    sQLiteDatabaseZzh.endTransaction();
                    if (RawQuery != 0) {
                        RawQuery.close();
                    }
                    sQLiteDatabaseZzh.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused2) {
                } catch (SQLiteFullException e3) {
                    e = e3;
                    RawQuery = 0;
                } catch (SQLiteException e4) {
                    e = e4;
                    RawQuery = 0;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                sQLiteDatabaseZzh = null;
            } catch (SQLiteFullException e5) {
                e = e5;
                r10 = 0;
            } catch (SQLiteException e6) {
                e = e6;
                RawQuery = 0;
            } catch (Throwable th4) {
                th = th4;
                sQLiteDatabaseZzh = null;
                if (r8 != 0) {
                    r8.close();
                }
                if (sQLiteDatabaseZzh != null) {
                    sQLiteDatabaseZzh.close();
                }
                throw th;
            }
        }
        AbstractC3888ke0.p(this.zzt, "Failed to write entry to local database");
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzf
    public final boolean zzf() {
        return false;
    }

    @VisibleForTesting
    @WorkerThread
    public final SQLiteDatabase zzh() throws SQLiteException {
        if (this.zzb) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.zza.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.zzb = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x021e A[Catch: all -> 0x0222, TryCatch #1 {all -> 0x0222, blocks: (B:137:0x0218, B:139:0x021e, B:142:0x0224, B:158:0x0253, B:150:0x0240), top: B:174:0x0218 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0235  */
    /* JADX WARN: Code duplicated, block: B:153:0x0247  */
    /* JADX WARN: Code duplicated, block: B:155:0x024c A[PHI: r9 r15
  0x024c: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:145:0x0238, B:161:0x0267, B:154:0x024a] A[DONT_GENERATE, DONT_INLINE]
  0x024c: PHI (r15v7 android.database.sqlite.SQLiteDatabase) = 
  (r15v5 android.database.sqlite.SQLiteDatabase)
  (r15v6 android.database.sqlite.SQLiteDatabase)
  (r15v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:145:0x0238, B:161:0x0267, B:154:0x024a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x0264  */
    /* JADX WARN: Code duplicated, block: B:165:0x0271  */
    /* JADX WARN: Code duplicated, block: B:167:0x0276  */
    /* JADX WARN: Code duplicated, block: B:174:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x01fe A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x026a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x026a A[SYNTHETIC] */
    public final List zzi(int i) {
        SQLiteDatabase sQLiteDatabase;
        Cursor cursorQuery;
        SQLiteDatabase sQLiteDatabase2;
        Cursor cursorQuery2;
        long j;
        String str;
        String[] strArr;
        zzlk zzlkVarCreateFromParcel;
        zzac zzacVarCreateFromParcel;
        zzg();
        Cursor cursor = null;
        if (this.zzb) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (!zzl()) {
            return arrayList;
        }
        int i2 = 0;
        int i3 = 5;
        for (int i4 = 5; i2 < i4; i4 = 5) {
            try {
                SQLiteDatabase sQLiteDatabaseZzh = zzh();
                if (sQLiteDatabaseZzh == null) {
                    this.zzb = true;
                    return null;
                }
                try {
                    sQLiteDatabaseZzh.beginTransaction();
                    try {
                        try {
                            cursorQuery2 = sQLiteDatabaseZzh.query("messages", new String[]{"rowid"}, "type=?", new String[]{ExifInterface.GPS_MEASUREMENT_3D}, null, null, "rowid desc", "1");
                            try {
                                long j2 = -1;
                                if (cursorQuery2.moveToFirst()) {
                                    j = cursorQuery2.getLong(0);
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i3);
                                        i3 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            try {
                                                if (sQLiteDatabase.inTransaction()) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.close();
                                                }
                                                throw th;
                                            }
                                        }
                                        this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    cursorQuery2.close();
                                    j = -1;
                                }
                                if (j != -1) {
                                    str = "rowid<?";
                                    strArr = new String[]{String.valueOf(j)};
                                } else {
                                    str = null;
                                    strArr = null;
                                }
                                cursorQuery = sQLiteDatabaseZzh.query("messages", new String[]{"rowid", "type", "entry"}, str, strArr, null, null, "rowid asc", Integer.toString(100));
                                while (cursorQuery.moveToNext()) {
                                    try {
                                        j2 = cursorQuery.getLong(0);
                                        int i5 = cursorQuery.getInt(1);
                                        byte[] blob = cursorQuery.getBlob(2);
                                        if (i5 == 0) {
                                            Parcel parcelObtain = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain.unmarshall(blob, 0, blob.length);
                                                    parcelObtain.setDataPosition(0);
                                                    zzau zzauVarCreateFromParcel = zzau.CREATOR.createFromParcel(parcelObtain);
                                                    parcelObtain.recycle();
                                                    if (zzauVarCreateFromParcel != null) {
                                                        arrayList.add(zzauVarCreateFromParcel);
                                                    }
                                                } catch (SafeParcelReader.ParseException unused2) {
                                                    this.zzt.zzaA().zzd().zza("Failed to load event from local database");
                                                    parcelObtain.recycle();
                                                }
                                            } catch (Throwable th3) {
                                                parcelObtain.recycle();
                                                throw th3;
                                            }
                                        } else if (i5 == 1) {
                                            Parcel parcelObtain2 = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain2.unmarshall(blob, 0, blob.length);
                                                    parcelObtain2.setDataPosition(0);
                                                    zzlkVarCreateFromParcel = zzlk.CREATOR.createFromParcel(parcelObtain2);
                                                    parcelObtain2.recycle();
                                                } catch (SafeParcelReader.ParseException unused3) {
                                                    this.zzt.zzaA().zzd().zza("Failed to load user property from local database");
                                                    parcelObtain2.recycle();
                                                    zzlkVarCreateFromParcel = null;
                                                }
                                                if (zzlkVarCreateFromParcel != null) {
                                                    arrayList.add(zzlkVarCreateFromParcel);
                                                }
                                            } catch (Throwable th4) {
                                                parcelObtain2.recycle();
                                                throw th4;
                                            }
                                        } else if (i5 == 2) {
                                            Parcel parcelObtain3 = Parcel.obtain();
                                            try {
                                                try {
                                                    parcelObtain3.unmarshall(blob, 0, blob.length);
                                                    parcelObtain3.setDataPosition(0);
                                                    zzacVarCreateFromParcel = zzac.CREATOR.createFromParcel(parcelObtain3);
                                                    parcelObtain3.recycle();
                                                } catch (SafeParcelReader.ParseException unused4) {
                                                    this.zzt.zzaA().zzd().zza("Failed to load conditional user property from local database");
                                                    parcelObtain3.recycle();
                                                    zzacVarCreateFromParcel = null;
                                                }
                                                if (zzacVarCreateFromParcel != null) {
                                                    arrayList.add(zzacVarCreateFromParcel);
                                                }
                                            } catch (Throwable th5) {
                                                parcelObtain3.recycle();
                                                throw th5;
                                            }
                                        } else if (i5 == 3) {
                                            this.zzt.zzaA().zzk().zza("Skipping app launch break");
                                        } else {
                                            this.zzt.zzaA().zzd().zza("Unknown record type in local database");
                                        }
                                    } catch (SQLiteDatabaseLockedException unused5) {
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i3);
                                        i3 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (SQLiteFullException e3) {
                                        e = e3;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        }
                                        this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                                        cursor = cursorQuery;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                sQLiteDatabase2 = sQLiteDatabaseZzh;
                                try {
                                    if (sQLiteDatabase2.delete("messages", "rowid <= ?", new String[]{Long.toString(j2)}) < arrayList.size()) {
                                        this.zzt.zzaA().zzd().zza("Fewer entries removed from local database than expected");
                                    }
                                    sQLiteDatabase2.setTransactionSuccessful();
                                    sQLiteDatabase2.endTransaction();
                                    cursorQuery.close();
                                    sQLiteDatabase2.close();
                                    return arrayList;
                                } catch (SQLiteDatabaseLockedException unused6) {
                                    sQLiteDatabase = sQLiteDatabase2;
                                    SystemClock.sleep(i3);
                                    i3 += 20;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i2++;
                                } catch (SQLiteFullException e5) {
                                    e = e5;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i2++;
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (sQLiteDatabase != null) {
                                        if (sQLiteDatabase.inTransaction()) {
                                            sQLiteDatabase.endTransaction();
                                        }
                                    }
                                    this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                    this.zzb = true;
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    i2++;
                                } catch (Throwable th7) {
                                    th = th7;
                                    cursor = cursorQuery;
                                    sQLiteDatabase = sQLiteDatabase2;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase != null) {
                                        sQLiteDatabase.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                sQLiteDatabase2 = sQLiteDatabaseZzh;
                                if (cursorQuery2 != null) {
                                    try {
                                        cursorQuery2.close();
                                    } catch (SQLiteDatabaseLockedException unused7) {
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        SystemClock.sleep(i3);
                                        i3 += 20;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (SQLiteFullException e7) {
                                        e = e7;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        cursorQuery = null;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (sQLiteDatabase != null) {
                                            if (sQLiteDatabase.inTransaction()) {
                                                sQLiteDatabase.endTransaction();
                                            }
                                        }
                                        this.zzt.zzaA().zzd().zzb("Error reading entries from local database", e);
                                        this.zzb = true;
                                        if (cursorQuery != null) {
                                            cursorQuery.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        i2++;
                                    } catch (Throwable th9) {
                                        th = th9;
                                        sQLiteDatabase = sQLiteDatabase2;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                }
                                throw th;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            sQLiteDatabase2 = sQLiteDatabaseZzh;
                            cursorQuery2 = null;
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        sQLiteDatabase2 = sQLiteDatabaseZzh;
                    }
                } catch (SQLiteDatabaseLockedException unused8) {
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (SQLiteException e10) {
                    e = e10;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                } catch (Throwable th12) {
                    th = th12;
                    sQLiteDatabase2 = sQLiteDatabaseZzh;
                }
            } catch (SQLiteDatabaseLockedException unused9) {
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (SQLiteFullException e11) {
                e = e11;
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (SQLiteException e12) {
                e = e12;
                cursorQuery = null;
                sQLiteDatabase = null;
            } catch (Throwable th13) {
                th = th13;
                sQLiteDatabase = null;
            }
        }
        DM.C(this.zzt, "Failed to read events from database in reasonable time");
        return null;
    }

    @WorkerThread
    public final void zzj() {
        int iDelete;
        zzg();
        try {
            SQLiteDatabase sQLiteDatabaseZzh = zzh();
            if (sQLiteDatabaseZzh == null || (iDelete = sQLiteDatabaseZzh.delete("messages", null, null)) <= 0) {
                return;
            }
            this.zzt.zzaA().zzj().zzb("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e) {
            this.zzt.zzaA().zzd().zzb("Error resetting local analytics data. error", e);
        }
    }

    @WorkerThread
    public final boolean zzk() {
        return zzq(3, new byte[0]);
    }

    @VisibleForTesting
    public final boolean zzl() {
        Context contextZzaw = this.zzt.zzaw();
        this.zzt.zzf();
        return contextZzaw.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0069 A[PHI: r4
  0x0069: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:35:0x007c, B:32:0x0067, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    @WorkerThread
    public final boolean zzm() {
        zzg();
        if (!this.zzb && zzl()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        try {
                            SQLiteDatabase sQLiteDatabaseZzh = zzh();
                            if (sQLiteDatabaseZzh == null) {
                                this.zzb = true;
                                return false;
                            }
                            sQLiteDatabaseZzh.beginTransaction();
                            sQLiteDatabaseZzh.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                            sQLiteDatabaseZzh.setTransactionSuccessful();
                            sQLiteDatabaseZzh.endTransaction();
                            sQLiteDatabaseZzh.close();
                            return true;
                        } catch (SQLiteFullException e) {
                            this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e);
                            this.zzb = true;
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                        }
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    this.zzt.zzaA().zzd().zzb("Error deleting app launch break from local database", e2);
                    this.zzb = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            DM.C(this.zzt, "Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    public final boolean zzn(zzac zzacVar) {
        byte[] bArrZzap = this.zzt.zzv().zzap(zzacVar);
        if (bArrZzap.length <= 131072) {
            return zzq(2, bArrZzap);
        }
        this.zzt.zzaA().zzh().zza("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean zzo(zzau zzauVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzav.zza(zzauVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(0, bArrMarshall);
        }
        this.zzt.zzaA().zzh().zza("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean zzp(zzlk zzlkVar) {
        Parcel parcelObtain = Parcel.obtain();
        zzll.zza(zzlkVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return zzq(1, bArrMarshall);
        }
        this.zzt.zzaA().zzh().zza("User property too long for local database. Sending directly to service");
        return false;
    }
}
