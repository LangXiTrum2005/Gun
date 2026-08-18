package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes3.dex */
public final class zzadk {
    public final zzadn zza;
    public final zzadn zzb;

    public zzadk(zzadn zzadnVar, zzadn zzadnVar2) {
        this.zza = zzadnVar;
        this.zzb = zzadnVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadk.class == obj.getClass()) {
            zzadk zzadkVar = (zzadk) obj;
            if (this.zza.equals(zzadkVar.zza) && this.zzb.equals(zzadkVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        zzadn zzadnVar = this.zza;
        return AbstractC5044xl.m("[", zzadnVar.toString(), zzadnVar.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString()), "]");
    }
}
