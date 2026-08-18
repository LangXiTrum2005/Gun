package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Collections;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzffx {
    public static final zzfgd zza(Callable callable, Object obj, zzfgf zzfgfVar) {
        return zzb(callable, zzfgfVar.zzb, obj, zzfgfVar);
    }

    public static final zzfgd zzb(Callable callable, zzgcs zzgcsVar, Object obj, zzfgf zzfgfVar) {
        return new zzfgd(zzfgfVar, obj, zzfgf.zza, Collections.emptyList(), zzgcsVar.zzb(callable));
    }

    public static final zzfgd zzc(AI ai, Object obj, zzfgf zzfgfVar) {
        return new zzfgd(zzfgfVar, obj, zzfgf.zza, Collections.emptyList(), ai);
    }

    public static final zzfgd zzd(final zzffs zzffsVar, zzgcs zzgcsVar, Object obj, zzfgf zzfgfVar) {
        return zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzffw
            @Override // java.util.concurrent.Callable
            public final Object call() throws Exception {
                zzffsVar.zza();
                return null;
            }
        }, zzgcsVar, obj, zzfgfVar);
    }
}
