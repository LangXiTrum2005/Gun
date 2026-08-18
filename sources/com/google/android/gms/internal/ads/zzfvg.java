package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfvg implements Serializable, zzfvf {
    final zzfvf zza;
    volatile transient boolean zzb;

    @CheckForNull
    transient Object zzc;
    private final transient zzfvm zzd = new zzfvm();

    public zzfvg(zzfvf zzfvfVar) {
        this.zza = zzfvfVar;
    }

    public final String toString() {
        return DM.B("Suppliers.memoize(", (this.zzb ? DM.B("<supplier that returned ", String.valueOf(this.zzc), ">") : this.zza).toString(), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
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
