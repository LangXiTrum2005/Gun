package com.google.android.gms.measurement.internal;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.WorkerThread;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class zzal {
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v2 */
    @WorkerThread
    public static void zza(zzet zzetVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) throws Throwable {
        Cursor cursorQuery;
        if (zzetVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        ?? r13 = 0;
        try {
            try {
                cursorQuery = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                try {
                    boolean zMoveToFirst = cursorQuery.moveToFirst();
                    cursorQuery.close();
                    if (!zMoveToFirst) {
                        sQLiteDatabase.execSQL(str2);
                    }
                } catch (SQLiteException e) {
                    e = e;
                    zzetVar.zzk().zzc("Error querying for table", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
                cursorQuery = null;
            } catch (Throwable th) {
                th = th;
                if (r13 != 0) {
                    r13.close();
                }
                throw th;
            }
            try {
                HashSet hashSet = new HashSet();
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                try {
                    Collections.addAll(hashSet, cursorRawQuery.getColumnNames());
                    cursorRawQuery.close();
                    for (String str4 : str3.split(",")) {
                        if (!hashSet.remove(str4)) {
                            throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                        }
                    }
                    if (strArr != null) {
                        for (int i = 0; i < strArr.length; i += 2) {
                            if (!hashSet.remove(strArr[i])) {
                                sQLiteDatabase.execSQL(strArr[i + 1]);
                            }
                        }
                    }
                    if (hashSet.isEmpty()) {
                        return;
                    }
                    zzetVar.zzk().zzc("Table has extra columns. table, columns", str, TextUtils.join(", ", hashSet));
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            } catch (SQLiteException e3) {
                zzetVar.zzd().zzb("Failed to verify columns on table that was just created", str);
                throw e3;
            }
        } catch (Throwable th3) {
            th = th3;
            r13 = str2;
            if (r13 != 0) {
                r13.close();
            }
            throw th;
        }
    }

    public static void zzb(zzet zzetVar, SQLiteDatabase sQLiteDatabase) {
        if (zzetVar == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            zzetVar.zzk().zza("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            zzetVar.zzk().zza("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            zzetVar.zzk().zza("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        zzetVar.zzk().zza("Failed to turn on database write permission for owner");
    }
}
