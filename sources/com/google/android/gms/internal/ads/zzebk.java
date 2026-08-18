package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzebk extends zzfpy {
    private final Context zza;
    private final zzgcs zzb;

    public zzebk(Context context, zzgcs zzgcsVar) {
        super(context, "AdMobOfflineBufferedPings.db", null, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzik)).intValue(), zzfqa.zza);
        this.zza = context;
        this.zzb = zzgcsVar;
    }

    public static /* synthetic */ Void zzb(com.google.android.gms.ads.internal.util.client.zzu zzuVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        zzj(sQLiteDatabase, zzuVar);
        return null;
    }

    public static /* synthetic */ void zzf(SQLiteDatabase sQLiteDatabase, String str, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        zzj(sQLiteDatabase, zzuVar);
    }

    public static final void zzi(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void zzj(SQLiteDatabase sQLiteDatabase, com.google.android.gms.ads.internal.util.client.zzu zzuVar) throws Throwable {
        String str;
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("timestamp");
                int columnIndex2 = cursorQuery.getColumnIndex("url");
                if (columnIndex2 != -1) {
                    long j = cursorQuery.getLong(columnIndex);
                    String string = cursorQuery.getString(columnIndex2);
                    if (string == null) {
                        str = "";
                    } else {
                        Uri uri = Uri.parse(string);
                        long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - j;
                        String encodedQuery = uri.getEncodedQuery();
                        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                        builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                        str = String.valueOf(builderClearQuery.build()) + "&" + encodedQuery;
                    }
                    strArr[i] = str;
                }
                i++;
            }
            cursorQuery.close();
            try {
                sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase.setTransactionSuccessful();
                sQLiteDatabase.endTransaction();
                for (int i2 = 0; i2 < count; i2++) {
                    zzuVar.zza(strArr[i2]);
                }
            } catch (Throwable th) {
                th = th;
                sQLiteDatabase.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public final /* synthetic */ Void zza(zzebm zzebmVar, SQLiteDatabase sQLiteDatabase) throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(zzebmVar.zza));
        contentValues.put("gws_query_id", zzebmVar.zzb);
        contentValues.put("url", zzebmVar.zzc);
        contentValues.put("event_state", Integer.valueOf(zzebmVar.zzd - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzbr zzbrVarZzA = com.google.android.gms.ads.internal.util.zzs.zzA(this.zza);
        if (zzbrVarZzA != null) {
            try {
                zzbrVarZzA.zze(ObjectWrapper.wrap(this.zza));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zze.zzb("Failed to schedule offline ping sender.", e);
            }
        }
        return null;
    }

    public final void zzc(final String str) {
        zze(new zzffr(this) { // from class: com.google.android.gms.internal.ads.zzebi
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj) {
                zzebk.zzi((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void zzd(final zzebm zzebmVar) {
        zze(new zzffr() { // from class: com.google.android.gms.internal.ads.zzebe
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj) throws Exception {
                this.zza.zza(zzebmVar, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    public final void zze(zzffr zzffrVar) {
        zzgch.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzebg
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.getWritableDatabase();
            }
        }), new zzebj(this, zzffrVar), this.zzb);
    }

    public final void zzg(final SQLiteDatabase sQLiteDatabase, final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzebh
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzebk.zzf(sQLiteDatabase, str, zzuVar);
            }
        });
    }

    public final void zzh(final com.google.android.gms.ads.internal.util.client.zzu zzuVar, final String str) {
        zze(new zzffr() { // from class: com.google.android.gms.internal.ads.zzebf
            @Override // com.google.android.gms.internal.ads.zzffr
            public final Object zza(Object obj) {
                this.zza.zzg((SQLiteDatabase) obj, zzuVar, str);
                return null;
            }
        });
    }
}
