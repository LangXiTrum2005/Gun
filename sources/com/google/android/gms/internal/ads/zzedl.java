package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedl implements zzedc {
    private final Context zza;
    private final zzcoa zzb;
    private final Executor zzc;

    public zzedl(Context context, zzcoa zzcoaVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcoaVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, final zzecz zzeczVar) throws zzfcq, zzegu {
        zzcnx zzcnxVarZza = this.zzb.zza(new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new zzdeu(new zzdgc() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // com.google.android.gms.internal.ads.zzdgc
            public final void zza(boolean z, Context context, zzcwg zzcwgVar) throws zzdgb {
                zzecz zzeczVar2 = zzeczVar;
                try {
                    ((zzfdh) zzeczVar2.zzb).zzv(z);
                    ((zzfdh) zzeczVar2.zzb).zzw(context);
                } catch (zzfcq e) {
                    throw new zzdgb(e.getCause());
                }
            }
        }, null), new zzcny(zzfboVar.zzaa));
        zzcnxVarZza.zzd().zzo(new zzcma((zzfdh) zzeczVar.zzb), this.zzc);
        ((zzees) zzeczVar.zzc).zzc(zzcnxVarZza.zzk());
        return zzcnxVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        zzfdh zzfdhVar = (zzfdh) zzeczVar.zzb;
        zzfcj zzfcjVar = zzfcaVar.zza.zza;
        String string = zzfboVar.zzv.toString();
        zzfdhVar.zzl(this.zza, zzfcjVar.zzd, string, (zzbpk) zzeczVar.zzc);
    }
}
