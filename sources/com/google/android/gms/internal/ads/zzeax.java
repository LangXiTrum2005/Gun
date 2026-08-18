package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeax {
    private final zzbbj zza;
    private final Context zzb;
    private final zzeac zzc;
    private final VersionInfoParcel zzd;

    public zzeax(Context context, VersionInfoParcel versionInfoParcel, zzbbj zzbbjVar, zzeac zzeacVar) {
        this.zzb = context;
        this.zzd = versionInfoParcel;
        this.zza = zzbbjVar;
        this.zzc = zzeacVar;
    }

    public final /* synthetic */ Void zza(boolean z, SQLiteDatabase sQLiteDatabase) throws Exception {
        if (z) {
            this.zzb.deleteDatabase("OfflineUpload.db");
        } else {
            ArrayList arrayList = new ArrayList();
            Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    arrayList.add(zzbbq.zzaf.zza.zzx(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
                } catch (zzgyg e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to deserialize proto from offline signals database:");
                    com.google.android.gms.ads.internal.util.client.zzo.zzg(e.getMessage());
                }
            }
            cursorQuery.close();
            Context context = this.zzb;
            zzbbq.zzaf.zzc zzcVarZzi = zzbbq.zzaf.zzi();
            zzcVarZzi.zzv(context.getPackageName());
            zzcVarZzi.zzy(Build.MODEL);
            zzcVarZzi.zzA(zzear.zza(sQLiteDatabase, 0));
            zzcVarZzi.zzh(arrayList);
            zzcVarZzi.zzE(zzear.zza(sQLiteDatabase, 1));
            zzcVarZzi.zzx(zzear.zza(sQLiteDatabase, 3));
            zzcVarZzi.zzF(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis());
            zzcVarZzi.zzB(zzear.zzb(sQLiteDatabase, 2));
            final zzbbq.zzaf zzafVarZzbr = zzcVarZzi.zzbr();
            int size = arrayList.size();
            long jZze = 0;
            for (int i = 0; i < size; i++) {
                zzbbq.zzaf.zza zzaVar = (zzbbq.zzaf.zza) arrayList.get(i);
                if (zzaVar.zzk() == zzbbq.zzq.ENUM_TRUE && zzaVar.zze() > jZze) {
                    jZze = zzaVar.zze();
                }
            }
            if (jZze != 0) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, Long.valueOf(jZze));
                sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = 'last_successful_request_time'", null);
            }
            this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzeav
                @Override // com.google.android.gms.internal.ads.zzbbi
                public final void zza(zzbbq.zzt.zza zzaVar2) {
                    zzaVar2.zzW(zzafVarZzbr);
                }
            });
            VersionInfoParcel versionInfoParcel = this.zzd;
            zzbbq.zzar.zza zzaVarZzd = zzbbq.zzar.zzd();
            zzaVarZzd.zzg(versionInfoParcel.buddyApkVersion);
            zzaVarZzd.zzi(this.zzd.clientJarVersion);
            zzaVarZzd.zzh(true != this.zzd.isClientJar ? 2 : 0);
            final zzbbq.zzar zzarVarZzbr = zzaVarZzd.zzbr();
            this.zza.zzb(new zzbbi() { // from class: com.google.android.gms.internal.ads.zzeaw
                @Override // com.google.android.gms.internal.ads.zzbbi
                public final void zza(zzbbq.zzt.zza zzaVar2) {
                    zzbbq.zzm.zza zzaVarZzbM = zzaVar2.zzg().zzbM();
                    zzaVarZzbM.zzw(zzarVarZzbr);
                    zzaVar2.zzK(zzaVarZzbM);
                }
            });
            this.zza.zzc(10004);
            zzear.zze(sQLiteDatabase);
        }
        return null;
    }

    public final void zzb(final boolean z) {
        try {
            this.zzc.zza(new zzffr() { // from class: com.google.android.gms.internal.ads.zzeau
                @Override // com.google.android.gms.internal.ads.zzffr
                public final Object zza(Object obj) throws Exception {
                    this.zza.zza(z, (SQLiteDatabase) obj);
                    return null;
                }
            });
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error in offline signals database startup: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
