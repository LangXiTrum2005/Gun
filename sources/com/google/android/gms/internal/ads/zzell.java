package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.core.content.ContextCompat;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzell implements zzetr {
    private final Context zza;

    public zzell(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return zzgch.zzh(new zzelm(ContextCompat.checkSelfPermission(this.zza, "com.google.android.gms.permission.AD_ID") == 0));
    }
}
