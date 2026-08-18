package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: loaded from: classes3.dex */
final class zzfy extends FutureTask implements Comparable {
    final boolean zza;
    final /* synthetic */ zzga zzb;
    private final long zzc;
    private final String zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzga zzgaVar, Runnable runnable, boolean z, String str) {
        super(runnable, null);
        this.zzb = zzgaVar;
        Preconditions.checkNotNull(str);
        long andIncrement = zzga.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            DM.w(zzgaVar.zzt, "Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(@NonNull Object obj) {
        zzfy zzfyVar = (zzfy) obj;
        boolean z = this.zza;
        if (z == zzfyVar.zza) {
            long j = this.zzc;
            long j2 = zzfyVar.zzc;
            if (j < j2) {
                return -1;
            }
            if (j <= j2) {
                this.zzb.zzt.zzaA().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
                return 0;
            }
        } else if (z) {
            return -1;
        }
        return 1;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzt.zzaA().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfw) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfy(zzga zzgaVar, Callable callable, boolean z, String str) {
        super(callable);
        this.zzb = zzgaVar;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzga.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            DM.w(zzgaVar.zzt, "Tasks index overflow");
        }
    }
}
