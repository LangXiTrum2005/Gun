package com.google.android.gms.internal.common;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import org.jspecify.nullness.NullMarked;

/* JADX INFO: loaded from: classes3.dex */
@NullMarked
public final class zzah {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(AbstractC3950lJ.p("at index ", i2));
            }
        }
        return objArr;
    }
}
