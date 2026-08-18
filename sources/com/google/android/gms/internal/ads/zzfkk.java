package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfkk extends zzbwv {
    final /* synthetic */ zzgdb zza;
    final /* synthetic */ zzbwp zzb;
    final /* synthetic */ zzfkl zzc;

    public zzfkk(zzfkl zzfklVar, zzgdb zzgdbVar, zzbwp zzbwpVar) {
        this.zza = zzgdbVar;
        this.zzb = zzbwpVar;
        this.zzc = zzfklVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zze(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load rewarded ad with error: " + zzeVar.zzb().toString() + ", adUnitId: " + this.zzc.zze.zza);
        this.zzc.zzA(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbww
    public final void zzg() {
        zzfjd.zza(this.zzb, this.zza);
    }
}
