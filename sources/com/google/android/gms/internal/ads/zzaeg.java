package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaeg implements zzaeb {
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzaeg(int i, int i2, int i3, int i4) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzaeg zzb(zzdy zzdyVar) {
        int iZzi = zzdyVar.zzi();
        zzdyVar.zzM(8);
        int iZzi2 = zzdyVar.zzi();
        int iZzi3 = zzdyVar.zzi();
        zzdyVar.zzM(4);
        int iZzi4 = zzdyVar.zzi();
        zzdyVar.zzM(12);
        return new zzaeg(iZzi, iZzi2, iZzi3, iZzi4);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zza() {
        return 1751742049;
    }
}
