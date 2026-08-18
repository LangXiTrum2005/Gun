package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
final class zzbyh implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzbyh(zzbyi zzbyiVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(@NonNull Runnable runnable) {
        return new Thread(runnable, AbstractC3950lJ.p("AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}
