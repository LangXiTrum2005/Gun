package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z, InterfaceC2766Sw interfaceC2766Sw) {
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T t = (T) interfaceC2766Sw.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return t;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z, InterfaceC2766Sw interfaceC2766Sw, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if (z) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object objInvoke = interfaceC2766Sw.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return objInvoke;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
