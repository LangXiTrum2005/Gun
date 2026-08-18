package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
final class zzqh implements zzpp {
    final /* synthetic */ zzqm zza;

    public /* synthetic */ zzqh(zzqm zzqmVar, zzql zzqlVar) {
        this.zza = zzqmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zza(long j) {
        zzdo.zzf("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zzb(long j) {
        zzqm zzqmVar = this.zza;
        if (zzqmVar.zzp != null) {
            ((zzqq) zzqmVar.zzp).zza.zzc.zzv(j);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zzc(long j, long j2, long j3, long j4) {
        zzqm zzqmVar = this.zza;
        long jZzL = zzqmVar.zzL();
        long jZzM = zzqmVar.zzM();
        StringBuilder sbP = DM.p("Spurious audio timestamp (frame position mismatch): ", j, ", ");
        sbP.append(j2);
        sbP.append(", ");
        sbP.append(j3);
        sbP.append(", ");
        sbP.append(j4);
        sbP.append(", ");
        sbP.append(jZzL);
        sbP.append(", ");
        sbP.append(jZzM);
        zzdo.zzf("DefaultAudioSink", sbP.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zzd(long j, long j2, long j3, long j4) {
        zzqm zzqmVar = this.zza;
        long jZzL = zzqmVar.zzL();
        long jZzM = zzqmVar.zzM();
        StringBuilder sbP = DM.p("Spurious audio timestamp (system clock mismatch): ", j, ", ");
        sbP.append(j2);
        sbP.append(", ");
        sbP.append(j3);
        sbP.append(", ");
        sbP.append(j4);
        sbP.append(", ");
        sbP.append(jZzL);
        sbP.append(", ");
        sbP.append(jZzM);
        zzdo.zzf("DefaultAudioSink", sbP.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzpp
    public final void zze(int i, long j) {
        zzqm zzqmVar = this.zza;
        if (zzqmVar.zzp != null) {
            ((zzqq) this.zza.zzp).zza.zzc.zzx(i, j, SystemClock.elapsedRealtime() - zzqmVar.zzV);
        }
    }
}
