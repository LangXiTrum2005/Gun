package com.google.android.gms.internal.measurement;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzaj {
    public static zzap zza(zzal zzalVar, zzap zzapVar, zzg zzgVar, List list) {
        if (zzalVar.zzt(zzapVar.zzi())) {
            zzap zzapVarZzf = zzalVar.zzf(zzapVar.zzi());
            if (zzapVarZzf instanceof zzai) {
                return ((zzai) zzapVarZzf).zza(zzgVar, list);
            }
            throw new IllegalArgumentException(DM.h(zzapVar.zzi(), " is not a function"));
        }
        if (!"hasOwnProperty".equals(zzapVar.zzi())) {
            throw new IllegalArgumentException(AbstractC3888ke0.i("Object has no function ", zzapVar.zzi()));
        }
        zzh.zzh("hasOwnProperty", 1, list);
        return zzalVar.zzt(zzgVar.zzb((zzap) list.get(0)).zzi()) ? zzap.zzk : zzap.zzl;
    }

    public static Iterator zzb(Map map) {
        return new zzak(map.keySet().iterator());
    }
}
