package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzjm implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjz zzb;

    public zzjm(zzjz zzjzVar, zzq zzqVar) {
        this.zzb = zzjzVar;
        this.zza = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.zzb;
        zzej zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            DM.w(zzjzVar.zzt, "Failed to send measurementEnabled to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzejVar.zzs(this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e) {
            this.zzb.zzt.zzaA().zzd().zzb("Failed to send measurementEnabled to the service", e);
        }
    }
}
