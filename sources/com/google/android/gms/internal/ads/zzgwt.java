package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class zzgwt extends IOException {
    public zzgwt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzgwt(long j, long j2, int i, Throwable th) {
        Locale locale = Locale.US;
        StringBuilder sbP = DM.p("Pos: ", j, ", limit: ");
        sbP.append(j2);
        sbP.append(", len: ");
        sbP.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbP.toString()), th);
    }

    public zzgwt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
