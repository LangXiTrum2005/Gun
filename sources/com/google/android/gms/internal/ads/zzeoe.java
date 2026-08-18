package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Strings;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeoe implements zzetr {

    @Nullable
    private final zzeym zza;

    public zzeoe(@Nullable zzeym zzeymVar) {
        this.zza = zzeymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 15;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        zzeym zzeymVar = this.zza;
        if (zzeymVar == null) {
            return zzgch.zzh(new zzeod(null));
        }
        String strZza = zzeymVar.zza();
        return Strings.isEmptyOrWhitespace(strZza) ? zzgch.zzh(new zzeod(null)) : zzgch.zzh(new zzeod(strZza));
    }
}
