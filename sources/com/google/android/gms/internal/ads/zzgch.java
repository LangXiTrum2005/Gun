package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgch extends zzgcj {
    public static zzgcf zza(Iterable iterable) {
        return new zzgcf(false, zzfxn.zzk(iterable), null);
    }

    public static zzgcf zzb(Iterable iterable) {
        return new zzgcf(true, zzfxn.zzk(iterable), null);
    }

    @SafeVarargs
    public static zzgcf zzc(AI... aiArr) {
        return new zzgcf(true, zzfxn.zzm(aiArr), null);
    }

    public static AI zzd(Iterable iterable) {
        return new zzgbp(zzfxn.zzk(iterable), true);
    }

    public static AI zze(AI ai, Class cls, zzfuc zzfucVar, Executor executor) {
        zzgav zzgavVar = new zzgav(ai, cls, zzfucVar);
        ai.addListener(zzgavVar, zzgcz.zzd(executor, zzgavVar));
        return zzgavVar;
    }

    public static AI zzf(AI ai, Class cls, zzgbo zzgboVar, Executor executor) {
        zzgau zzgauVar = new zzgau(ai, cls, zzgboVar);
        ai.addListener(zzgauVar, zzgcz.zzd(executor, zzgauVar));
        return zzgauVar;
    }

    public static AI zzg(Throwable th) {
        th.getClass();
        return new zzgck(th);
    }

    public static AI zzh(Object obj) {
        return obj == null ? zzgcl.zza : new zzgcl(obj);
    }

    public static AI zzi() {
        return zzgcl.zza;
    }

    public static AI zzj(Callable callable, Executor executor) {
        zzgdi zzgdiVar = new zzgdi(callable);
        executor.execute(zzgdiVar);
        return zzgdiVar;
    }

    public static AI zzk(zzgbn zzgbnVar, Executor executor) {
        zzgdi zzgdiVar = new zzgdi(zzgbnVar);
        executor.execute(zzgdiVar);
        return zzgdiVar;
    }

    @SafeVarargs
    public static AI zzl(AI... aiArr) {
        return new zzgbp(zzfxn.zzm(aiArr), false);
    }

    public static AI zzm(AI ai, zzfuc zzfucVar, Executor executor) {
        zzgbd zzgbdVar = new zzgbd(ai, zzfucVar);
        ai.addListener(zzgbdVar, zzgcz.zzd(executor, zzgbdVar));
        return zzgbdVar;
    }

    public static AI zzn(AI ai, zzgbo zzgboVar, Executor executor) {
        int i = zzgbe.zzc;
        executor.getClass();
        zzgbc zzgbcVar = new zzgbc(ai, zzgboVar);
        ai.addListener(zzgbcVar, zzgcz.zzd(executor, zzgbcVar));
        return zzgbcVar;
    }

    public static AI zzo(AI ai, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return ai.isDone() ? ai : zzgdf.zzf(ai, j, timeUnit, scheduledExecutorService);
    }

    public static Object zzp(Future future) throws ExecutionException {
        if (future.isDone()) {
            return zzgdk.zza(future);
        }
        throw new IllegalStateException(zzfve.zzb("Future was expected to be done: %s", future));
    }

    public static Object zzq(Future future) {
        try {
            return zzgdk.zza(future);
        } catch (ExecutionException e) {
            if (e.getCause() instanceof Error) {
                throw new zzgbw((Error) e.getCause());
            }
            throw new zzgdj(e.getCause());
        }
    }

    public static void zzr(AI ai, zzgcd zzgcdVar, Executor executor) {
        zzgcdVar.getClass();
        ai.addListener(new zzgce(ai, zzgcdVar), executor);
    }
}
