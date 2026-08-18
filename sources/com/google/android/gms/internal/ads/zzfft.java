package com.google.android.gms.internal.ads;

import androidx.annotation.VisibleForTesting;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfft implements AI {
    private final Object zza;
    private final String zzb;
    private final AI zzc;

    @VisibleForTesting(otherwise = 3)
    public zzfft(Object obj, String str, AI ai) {
        this.zza = obj;
        this.zzb = str;
        this.zzc = ai;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI
    public final void addListener(Runnable runnable, Executor executor) {
        this.zzc.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.zzc.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException, InterruptedException {
        return this.zzc.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zzc.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zzc.isDone();
    }

    public final String toString() {
        return this.zzb + "@" + System.identityHashCode(this);
    }

    public final Object zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.zzc.get(j, timeUnit);
    }
}
