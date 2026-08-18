package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaeh implements zzaeb {
    public final int zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    private zzaeh(int i, int i2, int i3, int i4, int i5, int i6) {
        this.zza = i;
        this.zzb = i3;
        this.zzc = i4;
        this.zzd = i5;
        this.zze = i6;
    }

    public static zzaeh zzb(zzdy zzdyVar) {
        int iZzi = zzdyVar.zzi();
        zzdyVar.zzM(12);
        int iZzi2 = zzdyVar.zzi();
        int iZzi3 = zzdyVar.zzi();
        int iZzi4 = zzdyVar.zzi();
        zzdyVar.zzM(4);
        int iZzi5 = zzdyVar.zzi();
        int iZzi6 = zzdyVar.zzi();
        zzdyVar.zzM(8);
        return new zzaeh(iZzi, iZzi2, iZzi3, iZzi4, iZzi5, iZzi6);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return 1752331379;
    }
}
