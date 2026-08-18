package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaww implements Callable {
    private final zzawd zza;
    private final zzasc zzb;

    public zzaww(zzawd zzawdVar, zzasc zzascVar) {
        this.zza = zzawdVar;
        this.zzb = zzascVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        if (this.zza.zzl() != null) {
            this.zza.zzl().get();
        }
        zzasy zzasyVarZzc = this.zza.zzc();
        if (zzasyVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                try {
                    this.zzb.zzaY(zzasyVarZzc.zzaV(), zzgxb.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzgyg | NullPointerException unused) {
            return null;
        }
    }
}
