package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdoi implements zzher {
    private final zzhfj zza;

    public zzdoi(zzhfj zzhfjVar) {
        this.zza = zzhfjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbbq.zza.EnumC0136zza enumC0136zza = ((zzcvk) this.zza).zza().zzo.zza == 3 ? zzbbq.zza.EnumC0136zza.REWARDED_INTERSTITIAL : zzbbq.zza.EnumC0136zza.REWARD_BASED_VIDEO_AD;
        zzhez.zzb(enumC0136zza);
        return enumC0136zza;
    }
}
