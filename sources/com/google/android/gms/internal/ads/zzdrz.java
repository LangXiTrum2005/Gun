package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrz implements zzfgo {
    private final zzdrq zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdrz(zzdrq zzdrqVar, Set set, Clock clock) {
        this.zzb = zzdrqVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdry zzdryVar = (zzdry) it.next();
            this.zzd.put(zzdryVar.zzc, zzdryVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfgh zzfghVar, boolean z) {
        zzdry zzdryVar = (zzdry) this.zzd.get(zzfghVar);
        if (zzdryVar == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        Map map = this.zza;
        zzfgh zzfghVar2 = zzdryVar.zzb;
        if (map.containsKey(zzfghVar2)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfghVar2)).longValue();
            this.zzb.zzb().put("label.".concat(zzdryVar.zza), str + jElapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzd(zzfgh zzfghVar, String str) {
        if (this.zza.containsKey(zzfghVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfghVar)).longValue();
            zzdrq zzdrqVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdrqVar.zzb().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfghVar)) {
            zze(zzfghVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdA(zzfgh zzfghVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdB(zzfgh zzfghVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfghVar)) {
            long jElapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfghVar)).longValue();
            zzdrq zzdrqVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdrqVar.zzb().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfghVar)) {
            zze(zzfghVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfgo
    public final void zzdC(zzfgh zzfghVar, String str) {
        this.zza.put(zzfghVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
