package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfje extends zzbaf {
    final /* synthetic */ zzgdb zza;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzft zzb;
    final /* synthetic */ zzfjf zzc;

    public zzfje(zzfjf zzfjfVar, zzgdb zzgdbVar, com.google.android.gms.ads.internal.client.zzft zzftVar) {
        this.zza = zzgdbVar;
        this.zzb = zzftVar;
        this.zzc = zzfjfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzb(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load app open ad with error parcel: " + zzeVar.zzb().toString() + " for ad unit: " + this.zzb.zza);
        this.zzc.zzA(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbag
    public final void zzd(zzbad zzbadVar) {
        zzfjd.zza(zzbadVar, this.zza);
    }
}
