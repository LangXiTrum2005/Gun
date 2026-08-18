package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzlg extends zztu {
    private final zzbp zzc;

    public zzlg(zzlh zzlhVar, zzbq zzbqVar) {
        super(zzbqVar);
        this.zzc = new zzbp();
    }

    @Override // com.google.android.gms.internal.ads.zztu, com.google.android.gms.internal.ads.zzbq
    public final zzbo zzd(int i, zzbo zzboVar, boolean z) {
        zzbo zzboVarZzd = this.zzb.zzd(i, zzboVar, z);
        if (this.zzb.zze(zzboVarZzd.zzc, this.zzc, 0L).zzb()) {
            zzboVarZzd.zzi(zzboVar.zza, zzboVar.zzb, zzboVar.zzc, zzboVar.zzd, 0L, zzb.zza, true);
        } else {
            zzboVarZzd.zzf = true;
        }
        return zzboVarZzd;
    }
}
