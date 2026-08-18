package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes3.dex */
public final class zzpk extends Exception {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzpk(long j, long j2) {
        StringBuilder sbP = DM.p("Unexpected audio track timestamp discontinuity: expected ", j2, ", got ");
        sbP.append(j);
        super(sbP.toString());
    }
}
