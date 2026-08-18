package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaoj implements zzacn {
    private final zzdy zza = new zzdy(4);
    private final zzado zzb = new zzado(-1, -1, "image/webp");

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
        this.zza.zzI(4);
        zzacc zzaccVar = (zzacc) zzacoVar;
        zzaccVar.zzm(this.zza.zzN(), 0, 4, false);
        if (this.zza.zzu() == 1380533830) {
            zzaccVar.zzl(4, false);
            this.zza.zzI(4);
            zzaccVar.zzm(this.zza.zzN(), 0, 4, false);
            if (this.zza.zzu() == 1464156752) {
                return true;
            }
        }
        return false;
    }
}
