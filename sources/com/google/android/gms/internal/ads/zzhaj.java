package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzhaj extends zzhah {
    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        zzgxr zzgxrVar = (zzgxr) obj;
        zzhai zzhaiVar = zzgxrVar.zzt;
        if (zzhaiVar != zzhai.zzc()) {
            return zzhaiVar;
        }
        zzhai zzhaiVarZzf = zzhai.zzf();
        zzgxrVar.zzt = zzhaiVarZzf;
        return zzhaiVarZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* synthetic */ Object zzb() {
        return zzhai.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* synthetic */ Object zzc(Object obj) {
        zzhai zzhaiVar = (zzhai) obj;
        zzhaiVar.zzh();
        return zzhaiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* bridge */ /* synthetic */ void zzd(Object obj, int i, int i2) {
        ((zzhai) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* bridge */ /* synthetic */ void zze(Object obj, int i, long j) {
        ((zzhai) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* bridge */ /* synthetic */ void zzf(Object obj, int i, Object obj2) {
        ((zzhai) obj).zzj((i << 3) | 3, (zzhai) obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* bridge */ /* synthetic */ void zzg(Object obj, int i, zzgwj zzgwjVar) {
        ((zzhai) obj).zzj((i << 3) | 2, zzgwjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* bridge */ /* synthetic */ void zzh(Object obj, int i, long j) {
        ((zzhai) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final void zzi(Object obj) {
        ((zzgxr) obj).zzt.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzhah
    public final /* synthetic */ void zzj(Object obj, Object obj2) {
        ((zzgxr) obj).zzt = (zzhai) obj2;
    }
}
