package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaem implements zzacn {
    private final zzdy zza = new zzdy(4);
    private final zzado zzb = new zzado(-1, -1, "image/avif");

    private final boolean zza(zzaco zzacoVar, int i) throws IOException {
        this.zza.zzI(4);
        ((zzacc) zzacoVar).zzm(this.zza.zzN(), 0, 4, false);
        return this.zza.zzu() == ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(zzaco zzacoVar, zzadj zzadjVar) throws IOException {
        return this.zzb.zzb(zzacoVar, zzadjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ List zzd() {
        return zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(zzacq zzacqVar) {
        this.zzb.zze(zzacqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzb.zzf(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(zzaco zzacoVar) throws IOException {
        ((zzacc) zzacoVar).zzl(4, false);
        return zza(zzacoVar, 1718909296) && zza(zzacoVar, 1635150182);
    }
}
