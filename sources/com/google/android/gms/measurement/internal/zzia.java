package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class zzia implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ zzik zzb;

    public zzia(zzik zzikVar, AtomicReference atomicReference) {
        this.zzb = zzikVar;
        this.zza = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zza) {
            try {
                try {
                    this.zza.set(this.zzb.zzt.zzf().zzo(this.zzb.zzt.zzh().zzl(), zzeg.zzL));
                    this.zza.notify();
                } catch (Throwable th) {
                    this.zza.notify();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
