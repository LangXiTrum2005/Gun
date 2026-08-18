package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetk implements zzetr {
    private final boolean zza;

    public zzetk(@Nullable zzezj zzezjVar) {
        this.zza = zzezjVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 36;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return zzgch.zzh(new zzeti(this.zza, null));
    }
}
