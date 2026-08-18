package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpi extends Exception {
    public final int zza;
    public final boolean zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    public zzpi(int i, int i2, int i3, int i4, zzab zzabVar, boolean z, @Nullable Exception exc) {
        String strValueOf = String.valueOf(zzabVar);
        StringBuilder sbT = AbstractC3950lJ.t("AudioTrack init failed ", i, " Config(", i2, ", ");
        AbstractC3888ke0.t(sbT, i3, ", ", i4, ") ");
        sbT.append(strValueOf);
        sbT.append(true != z ? "" : " (recoverable)");
        super(sbT.toString(), exc);
        this.zza = i;
        this.zzb = z;
    }
}
