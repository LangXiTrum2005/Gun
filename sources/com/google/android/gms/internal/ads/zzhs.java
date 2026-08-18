package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhs {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i = this.zza;
        int i2 = this.zzb;
        int i3 = this.zzc;
        int i4 = this.zzd;
        int i5 = this.zze;
        int i6 = this.zzf;
        int i7 = this.zzg;
        int i8 = this.zzh;
        int i9 = this.zzi;
        int i10 = this.zzj;
        long j = this.zzk;
        int i11 = this.zzl;
        Locale locale = Locale.US;
        StringBuilder sbT = AbstractC3950lJ.t("DecoderCounters {\n decoderInits=", i, ",\n decoderReleases=", i2, "\n queuedInputBuffers=");
        AbstractC3888ke0.t(sbT, i3, "\n skippedInputBuffers=", i4, "\n renderedOutputBuffers=");
        AbstractC3888ke0.t(sbT, i5, "\n skippedOutputBuffers=", i6, "\n droppedBuffers=");
        AbstractC3888ke0.t(sbT, i7, "\n droppedInputBuffers=", i8, "\n maxConsecutiveDroppedBuffers=");
        AbstractC3888ke0.t(sbT, i9, "\n droppedToKeyframeEvents=", i10, "\n totalVideoFrameProcessingOffsetUs=");
        sbT.append(j);
        sbT.append("\n videoFrameProcessingOffsetCount=");
        sbT.append(i11);
        sbT.append("\n}");
        return sbT.toString();
    }

    public final synchronized void zza() {
    }
}
