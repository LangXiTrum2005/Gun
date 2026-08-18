package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2312Bj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4776uj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4864vj;

/* JADX INFO: loaded from: classes3.dex */
final class zzl {
    private final Application zza;
    private final zzam zzb;

    public zzl(Application application, zzam zzamVar) {
        this.zza = application;
        this.zzb = zzamVar;
    }

    public final zzcf zzc(Activity activity, C2312Bj c2312Bj) throws zzg {
        C4864vj c4864vj;
        C4864vj c4864vj2 = c2312Bj.c;
        if (c4864vj2 == null) {
            C4776uj c4776uj = new C4776uj(this.zza);
            boolean z = true;
            if (!zzcq.zza(true) && !c4776uj.f5095a.contains(zzci.zza(c4776uj.b))) {
                z = false;
            }
            c4864vj = new C4864vj(z, c4776uj);
        } else {
            c4864vj = c4864vj2;
        }
        return zzn.zza(new zzn(this, activity, c4864vj, c2312Bj, null));
    }
}
