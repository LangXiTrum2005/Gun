package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfvi implements zzfvf {
    private static final zzfvf zza = new zzfvf() { // from class: com.google.android.gms.internal.ads.zzfvh
        @Override // com.google.android.gms.internal.ads.zzfvf
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private final zzfvm zzb = new zzfvm();
    private volatile zzfvf zzc;

    @CheckForNull
    private Object zzd;

    public zzfvi(zzfvf zzfvfVar) {
        this.zzc = zzfvfVar;
    }

    public final String toString() {
        Object objB = this.zzc;
        if (objB == zza) {
            objB = DM.B("<supplier that returned ", String.valueOf(this.zzd), ">");
        }
        return DM.B("Suppliers.memoize(", String.valueOf(objB), ")");
    }

    @Override // com.google.android.gms.internal.ads.zzfvf
    public final Object zza() {
        zzfvf zzfvfVar = this.zzc;
        zzfvf zzfvfVar2 = zza;
        if (zzfvfVar != zzfvfVar2) {
            synchronized (this.zzb) {
                try {
                    if (this.zzc != zzfvfVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzfvfVar2;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzd;
    }
}
