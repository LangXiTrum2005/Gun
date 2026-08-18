package com.google.android.gms.measurement.internal;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes3.dex */
final class zzkr extends zzan {
    final /* synthetic */ zzks zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkr(zzks zzksVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzksVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        this.zza.zza();
        AbstractC3888ke0.p(this.zza.zzt, "Starting upload from DelayedRunnable");
        this.zza.zzf.zzX();
    }
}
