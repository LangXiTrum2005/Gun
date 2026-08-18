package com.google.android.gms.internal.measurement;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzik extends zzii {
    private final Object zza;

    public zzik(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzik) {
            return this.zza.equals(((zzik) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return DM.B("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzii
    public final boolean zzb() {
        return true;
    }
}
