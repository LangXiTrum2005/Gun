package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzjo implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzau zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjz zze;

    public zzjo(zzjz zzjzVar, boolean z, zzq zzqVar, boolean z2, zzau zzauVar, String str) {
        this.zze = zzjzVar;
        this.zza = zzqVar;
        this.zzb = z2;
        this.zzc = zzauVar;
        this.zzd = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjz zzjzVar = this.zze;
        zzej zzejVar = zzjzVar.zzb;
        if (zzejVar == null) {
            DM.w(zzjzVar.zzt, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        this.zze.zzD(zzejVar, this.zzb ? null : this.zzc, this.zza);
        this.zze.zzQ();
    }
}
