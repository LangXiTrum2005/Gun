package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzzx {
    final /* synthetic */ zzaah zza;
    private zzab zzb;

    public /* synthetic */ zzzx(zzaah zzaahVar, zzaag zzaagVar) {
        this.zza = zzaahVar;
    }

    public final void zza(zzcd zzcdVar) {
        zzz zzzVar = new zzz();
        zzzVar.zzaf(zzcdVar.zzb);
        zzzVar.zzK(zzcdVar.zzc);
        zzzVar.zzaa("video/raw");
        this.zzb = zzzVar.zzag();
        Iterator it = this.zza.zzj.iterator();
        while (it.hasNext()) {
            ((zzaac) it.next()).zzA(this.zza, zzcdVar);
        }
    }

    public final void zzb(long j, long j2, boolean z) {
        if (z) {
            zzaah zzaahVar = this.zza;
            if (zzaahVar.zzm != null) {
                Iterator it = zzaahVar.zzj.iterator();
                while (it.hasNext()) {
                    ((zzaac) it.next()).zzy(this.zza);
                }
            }
        }
        if (this.zza.zzk != null) {
            zzab zzabVarZzag = this.zzb;
            if (zzabVarZzag == null) {
                zzabVarZzag = new zzz().zzag();
            }
            zzab zzabVar = zzabVarZzag;
            zzaah zzaahVar2 = this.zza;
            zzaahVar2.zzk.zza(j2, zzaahVar2.zzi.zzc(), zzabVar, null);
        }
        zzcw.zzb(null);
        throw null;
    }
}
