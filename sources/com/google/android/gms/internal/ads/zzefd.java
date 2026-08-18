package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefd implements zzedc {
    private final Context zza;
    private final zzdfu zzb;
    private final VersionInfoParcel zzc;
    private final Executor zzd;

    public zzefd(Context context, VersionInfoParcel versionInfoParcel, zzdfu zzdfuVar, Executor executor) {
        this.zza = context;
        this.zzc = versionInfoParcel;
        this.zzb = zzdfuVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, final zzecz zzeczVar) throws zzfcq, zzegu {
        zzder zzderVarZze = this.zzb.zze(new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new zzdeu(new zzdgc() { // from class: com.google.android.gms.internal.ads.zzefc
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, Context context, zzcwg zzcwgVar) throws zzdgb {
                this.zza.zzc(zzeczVar, z, context, zzcwgVar);
            }
        }, null));
        zzderVarZze.zzd().zzo(new zzcma((zzfdh) zzeczVar.zzb), this.zzd);
        ((zzees) zzeczVar.zzc).zzc(zzderVarZze.zzk());
        return zzderVarZze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        zzfdh zzfdhVar = (zzfdh) zzeczVar.zzb;
        zzfcj zzfcjVar = zzfcaVar.zza.zza;
        String string = zzfboVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbs.zzm(zzfboVar.zzs);
        zzfdhVar.zzo(this.zza, zzfcjVar.zzd, string, strZzm, (zzbpk) zzeczVar.zzc);
    }

    public final /* synthetic */ void zzc(zzecz zzeczVar, boolean z, Context context, zzcwg zzcwgVar) throws zzdgb {
        try {
            ((zzfdh) zzeczVar.zzb).zzv(z);
            if (this.zzc.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaS)).intValue()) {
                ((zzfdh) zzeczVar.zzb).zzx();
            } else {
                ((zzfdh) zzeczVar.zzb).zzy(context);
            }
        } catch (zzfcq e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot show interstitial.");
            throw new zzdgb(e.getCause());
        }
    }
}
