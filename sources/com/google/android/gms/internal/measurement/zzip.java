package com.google.android.gms.internal.measurement;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzip implements zzim {
    private static final zzim zza = new zzim() { // from class: com.google.android.gms.internal.measurement.zzio
        @Override // com.google.android.gms.internal.measurement.zzim
        public final Object zza() {
            throw new IllegalStateException();
        }
    };
    private volatile zzim zzb;

    @CheckForNull
    private Object zzc;

    public zzip(zzim zzimVar) {
        zzimVar.getClass();
        this.zzb = zzimVar;
    }

    public final String toString() {
        Object objB = this.zzb;
        if (objB == zza) {
            objB = DM.B("<supplier that returned ", String.valueOf(this.zzc), ">");
        }
        return DM.B("Suppliers.memoize(", String.valueOf(objB), ")");
    }

    @Override // com.google.android.gms.internal.measurement.zzim
    public final Object zza() {
        zzim zzimVar = this.zzb;
        zzim zzimVar2 = zza;
        if (zzimVar != zzimVar2) {
            synchronized (this) {
                try {
                    if (this.zzb != zzimVar2) {
                        Object objZza = this.zzb.zza();
                        this.zzc = objZza;
                        this.zzb = zzimVar2;
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
