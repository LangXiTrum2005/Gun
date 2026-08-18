package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzcjh implements zzdoe {
    private final zzcih zza;
    private zzezj zzb;
    private zzeym zzc;
    private zzdbm zzd;
    private zzcvc zze;

    public /* synthetic */ zzcjh(zzcih zzcihVar, zzcjm zzcjmVar) {
        this.zza = zzcihVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zza(@Nullable zzeym zzeymVar) {
        this.zzc = zzeymVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    public final /* synthetic */ zzcuy zzb(@Nullable zzezj zzezjVar) {
        this.zzb = zzezjVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final /* bridge */ /* synthetic */ zzdoe zzc(zzdbm zzdbmVar) {
        this.zzd = zzdbmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdoe
    public final /* bridge */ /* synthetic */ zzdoe zzd(zzcvc zzcvcVar) {
        this.zze = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzdof zzh() {
        zzhez.zzc(this.zzd, zzdbm.class);
        zzhez.zzc(this.zze, zzcvc.class);
        return new zzcji(this.zza, new zzcsf(), new zzfdo(), new zzcue(), new zzdsl(), this.zzd, this.zze, zzehb.zza(), null, this.zzb, this.zzc, null);
    }
}
