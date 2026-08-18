package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class zzggq extends zzgeu {
    private final int zza;
    private final zzggo zzb;

    public /* synthetic */ zzggq(int i, zzggo zzggoVar, zzggp zzggpVar) {
        this.zza = i;
        this.zzb = zzggoVar;
    }

    public static zzggn zzc() {
        return new zzggn(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggq)) {
            return false;
        }
        zzggq zzggqVar = (zzggq) obj;
        return zzggqVar.zza == this.zza && zzggqVar.zzb == this.zzb;
    }

    public final int hashCode() {
        return Objects.hash(zzggq.class, Integer.valueOf(this.zza), this.zzb);
    }

    public final String toString() {
        return AbstractC5044xl.o(AbstractC3950lJ.u("AesGcmSiv Parameters (variant: ", String.valueOf(this.zzb), ", "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgek
    public final boolean zza() {
        return this.zzb != zzggo.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggo zzd() {
        return this.zzb;
    }
}
