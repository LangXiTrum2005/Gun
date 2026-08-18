package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfiz implements zzgcd {
    final /* synthetic */ zzfgw zza;
    final /* synthetic */ zzfhh zzb;
    final /* synthetic */ zzfja zzc;

    public zzfiz(zzfja zzfjaVar, zzfgw zzfgwVar, zzfhh zzfhhVar) {
        this.zza = zzfgwVar;
        this.zzb = zzfhhVar;
        this.zzc = zzfjaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(@NonNull Throwable th) {
        this.zza.zzg(false);
        zzfhh zzfhhVar = this.zzb;
        if (zzfhhVar != null) {
            zzfhhVar.zza(this.zza);
            zzfhhVar.zzh();
        } else {
            this.zzc.zzf.zzb(this.zza.zzm());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzg(((com.google.android.gms.ads.internal.util.client.zzt) obj) == com.google.android.gms.ads.internal.util.client.zzt.SUCCESS);
        zzfhh zzfhhVar = this.zzb;
        if (zzfhhVar == null) {
            this.zzc.zzf.zzb(this.zza.zzm());
        } else {
            zzfhhVar.zza(this.zza);
            zzfhhVar.zzh();
        }
    }
}
