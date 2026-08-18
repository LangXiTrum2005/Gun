package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgcz {
    public static zzgcs zza(ExecutorService executorService) {
        if (executorService instanceof zzgcs) {
            return (zzgcs) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new zzgcy((ScheduledExecutorService) executorService) : new zzgcv(executorService);
    }

    public static zzgct zzb(ScheduledExecutorService scheduledExecutorService) {
        return new zzgcy(scheduledExecutorService);
    }

    public static Executor zzc() {
        return zzgbv.INSTANCE;
    }

    public static Executor zzd(Executor executor, zzgax zzgaxVar) {
        executor.getClass();
        return executor == zzgbv.INSTANCE ? executor : new zzgcu(executor, zzgaxVar);
    }
}
