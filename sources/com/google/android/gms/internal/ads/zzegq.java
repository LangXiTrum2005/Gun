package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegq {
    private final Clock zza;
    private final zzegs zzb;
    private final zzfja zzc;

    @GuardedBy("this")
    private final LinkedHashMap zzd = new LinkedHashMap();
    private final boolean zze = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgG)).booleanValue();
    private final zzedb zzf;
    private boolean zzg;
    private long zzh;
    private long zzi;

    public zzegq(Clock clock, zzegs zzegsVar, zzedb zzedbVar, zzfja zzfjaVar) {
        this.zza = clock;
        this.zzb = zzegsVar;
        this.zzf = zzedbVar;
        this.zzc = zzfjaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized boolean zzq(zzfbo zzfboVar) {
        zzegp zzegpVar = (zzegp) this.zzd.get(zzfboVar);
        if (zzegpVar == null) {
            return false;
        }
        return zzegpVar.zzc == 8;
    }

    public final synchronized long zza() {
        return this.zzh;
    }

    public final synchronized AI zzf(zzfca zzfcaVar, zzfbo zzfboVar, AI ai, zzfiv zzfivVar) {
        zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        long jElapsedRealtime = this.zza.elapsedRealtime();
        String str = zzfboVar.zzw;
        if (str != null) {
            this.zzd.put(zzfboVar, new zzegp(str, zzfboVar.zzaf, 9, 0L, null));
            zzgch.zzr(ai, new zzego(this, jElapsedRealtime, zzfbrVar, zzfboVar, str, zzfivVar, zzfcaVar), zzbzw.zzg);
        }
        return ai;
    }

    public final synchronized String zzg() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.zzd.entrySet().iterator();
            while (it.hasNext()) {
                zzegp zzegpVar = (zzegp) ((Map.Entry) it.next()).getValue();
                if (zzegpVar.zzc != Integer.MAX_VALUE) {
                    arrayList.add(zzegpVar.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    public final synchronized void zzi(@Nullable zzfbo zzfboVar) {
        try {
            this.zzh = this.zza.elapsedRealtime() - this.zzi;
            if (zzfboVar != null) {
                this.zzf.zze(zzfboVar);
            }
            this.zzg = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzj() {
        this.zzh = this.zza.elapsedRealtime() - this.zzi;
    }

    public final synchronized void zzk(List list) {
        this.zzi = this.zza.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzfbo zzfboVar = (zzfbo) it.next();
            if (!TextUtils.isEmpty(zzfboVar.zzw)) {
                this.zzd.put(zzfboVar, new zzegp(zzfboVar.zzw, zzfboVar.zzaf, Integer.MAX_VALUE, 0L, null));
            }
        }
    }

    public final synchronized void zzl() {
        this.zzi = this.zza.elapsedRealtime();
    }

    public final synchronized void zzm(zzfbo zzfboVar) {
        zzegp zzegpVar = (zzegp) this.zzd.get(zzfboVar);
        if (zzegpVar == null || this.zzg) {
            return;
        }
        zzegpVar.zzc = 8;
    }
}
