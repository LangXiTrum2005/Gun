package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzaxr implements Callable {
    protected final zzawd zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzasc zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzaxr(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        this.zza = zzawdVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzascVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() throws Exception {
        zzk();
        return null;
    }

    public abstract void zza() throws IllegalAccessException, InvocationTargetException;

    public Void zzk() throws Exception {
        int i;
        try {
            long jNanoTime = System.nanoTime();
            Method methodZzj = this.zza.zzj(this.zzb, this.zzc);
            this.zze = methodZzj;
            if (methodZzj == null) {
                return null;
            }
            zza();
            zzauu zzauuVarZzd = this.zza.zzd();
            if (zzauuVarZzd == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzauuVarZzd.zzc(this.zzg, i, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
