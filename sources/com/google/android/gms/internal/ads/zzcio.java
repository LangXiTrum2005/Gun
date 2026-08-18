package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzcio implements zzcpp {
    private final zzcih zza;
    private zzezj zzb;
    private zzeym zzc;
    private zzdbm zzd;
    private zzcvc zze;
    private zzeiw zzf;
    private zzcqr zzg;
    private zzegz zzh;
    private zzcoj zzi;
    private zzdgl zzj;

    public /* synthetic */ zzcio(zzcih zzcihVar, zzcjm zzcjmVar) {
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

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* bridge */ /* synthetic */ zzcpp zzc(zzcoj zzcojVar) {
        this.zzi = zzcojVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* bridge */ /* synthetic */ zzcpp zzd(zzdgl zzdglVar) {
        this.zzj = zzdglVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* bridge */ /* synthetic */ zzcpp zze(zzeiw zzeiwVar) {
        this.zzf = zzeiwVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* bridge */ /* synthetic */ zzcpp zzf(zzdbm zzdbmVar) {
        this.zzd = zzdbmVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* bridge */ /* synthetic */ zzcpp zzg(zzcqr zzcqrVar) {
        this.zzg = zzcqrVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* bridge */ /* synthetic */ zzcpp zzi(zzcvc zzcvcVar) {
        this.zze = zzcvcVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcpp
    public final /* bridge */ /* synthetic */ zzcpp zzj(zzegz zzegzVar) {
        this.zzh = zzegzVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzcuy
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final zzcpq zzh() {
        zzhez.zzc(this.zzd, zzdbm.class);
        zzhez.zzc(this.zze, zzcvc.class);
        zzhez.zzc(this.zzf, zzeiw.class);
        zzhez.zzc(this.zzg, zzcqr.class);
        if (this.zzh == null) {
            this.zzh = zzehb.zza();
        }
        zzhez.zzc(this.zzi, zzcoj.class);
        zzhez.zzc(this.zzj, zzdgl.class);
        return new zzcip(this.zza, this.zzi, this.zzj, new zzcsf(), new zzfdo(), new zzcue(), new zzdsl(), this.zzd, this.zze, this.zzh, this.zzf, this.zzg, null, this.zzb, this.zzc, null);
    }
}
