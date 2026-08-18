package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpl extends Exception {
    public final int zza;
    public final boolean zzb;
    public final zzab zzc;

    public zzpl(int i, zzab zzabVar, boolean z) {
        super(AbstractC3950lJ.p("AudioTrack write failed: ", i));
        this.zzb = z;
        this.zza = i;
        this.zzc = zzabVar;
    }
}
