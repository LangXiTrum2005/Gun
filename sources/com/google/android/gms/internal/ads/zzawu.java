package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawu extends zzaxr {
    private final long zzh;

    public zzawu(zzawd zzawdVar, String str, String str2, zzasc zzascVar, long j, int i, int i2) {
        super(zzawdVar, "y3qsDqWUxj+0NW9GzaLLQcml0WYfJuDlvc/LrtwTbAkNDXLpsSYbwYlOmoW50beE", "vyPJQ44Cs+DiV597MU4yHYF5mAH0rpjmfJE+rEowUe0=", zzascVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long jLongValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        synchronized (this.zzd) {
            try {
                this.zzd.zzt(jLongValue);
                long j = this.zzh;
                if (j != 0) {
                    this.zzd.zzT(jLongValue - j);
                    this.zzd.zzU(this.zzh);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
