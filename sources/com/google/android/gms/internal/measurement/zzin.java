package com.google.android.gms.internal.measurement;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzin implements Serializable, zzim {
    final zzim zza;
    volatile transient boolean zzb;

    @CheckForNull
    transient Object zzc;

    public zzin(zzim zzimVar) {
        zzimVar.getClass();
        this.zza = zzimVar;
    }

    public final String toString() {
        return DM.B("Suppliers.memoize(", (this.zzb ? DM.B("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzc;
    }
}
