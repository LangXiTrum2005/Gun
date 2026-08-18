package com.google.android.gms.internal.measurement;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbj extends zzaw {
    @Override // com.google.android.gms.internal.measurement.zzaw
    public final zzap zza(String str, zzg zzgVar, List list) {
        if (str == null || str.isEmpty() || !zzgVar.zzh(str)) {
            throw new IllegalArgumentException(AbstractC3888ke0.i("Command not found: ", str));
        }
        zzap zzapVarZzd = zzgVar.zzd(str);
        if (zzapVarZzd instanceof zzai) {
            return ((zzai) zzapVarZzd).zza(zzgVar, list);
        }
        throw new IllegalArgumentException(DM.B("Function ", str, " is not defined"));
    }
}
