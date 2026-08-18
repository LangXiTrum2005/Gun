package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcoq implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;
    private final zzhfj zzf;
    private final zzhfj zzg;
    private final zzhfj zzh;
    private final zzhfj zzi;
    private final zzhfj zzj;

    public zzcoq(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5, zzhfj zzhfjVar6, zzhfj zzhfjVar7, zzhfj zzhfjVar8, zzhfj zzhfjVar9, zzhfj zzhfjVar10) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
        this.zze = zzhfjVar5;
        this.zzf = zzhfjVar6;
        this.zzg = zzhfjVar7;
        this.zzh = zzhfjVar8;
        this.zzi = zzhfjVar9;
        this.zzj = zzhfjVar10;
    }

    public static zzcop zzc(zzcqy zzcqyVar, Context context, zzfbp zzfbpVar, View view, @Nullable zzcex zzcexVar, zzcqx zzcqxVar, zzdiq zzdiqVar, zzddu zzdduVar, zzhel zzhelVar, Executor executor) {
        return new zzcop(zzcqyVar, context, zzfbpVar, view, zzcexVar, zzcqxVar, zzdiqVar, zzdduVar, zzhelVar, executor);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzcop zzb() {
        return new zzcop(((zzctf) this.zza).zzb(), (Context) this.zzb.zzb(), ((zzcow) this.zzc).zza(), ((zzcov) this.zzd).zza(), ((zzcpj) this.zze).zza(), ((zzcox) this.zzf).zza(), ((zzdgo) this.zzg).zza(), (zzddu) this.zzh.zzb(), zzheq.zza(zzhfc.zza(this.zzi)), (Executor) this.zzj.zzb());
    }
}
