package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends zze {
    private final Map zza;
    private final Map zzb;
    private long zzc;

    public zzd(zzgd zzgdVar) {
        super(zzgdVar);
        this.zzb = new ArrayMap();
        this.zza = new ArrayMap();
    }

    public static /* synthetic */ void zza(zzd zzdVar, String str, long j) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        if (zzdVar.zzb.isEmpty()) {
            zzdVar.zzc = j;
        }
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num != null) {
            zzdVar.zzb.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zzdVar.zzb.size() >= 100) {
            DM.C(zzdVar.zzt, "Too many ads visible");
        } else {
            zzdVar.zzb.put(str, 1);
            zzdVar.zza.put(str, Long.valueOf(j));
        }
    }

    public static /* synthetic */ void zzb(zzd zzdVar, String str, long j) {
        zzdVar.zzg();
        Preconditions.checkNotEmpty(str);
        Integer num = (Integer) zzdVar.zzb.get(str);
        if (num == null) {
            zzdVar.zzt.zzaA().zzd().zzb("Call to endAdUnitExposure for unknown ad unit id", str);
            return;
        }
        zzir zzirVarZzj = zzdVar.zzt.zzs().zzj(false);
        int iIntValue = num.intValue() - 1;
        if (iIntValue != 0) {
            zzdVar.zzb.put(str, Integer.valueOf(iIntValue));
            return;
        }
        zzdVar.zzb.remove(str);
        Long l = (Long) zzdVar.zza.get(str);
        if (l == null) {
            DM.w(zzdVar.zzt, "First ad unit exposure time was never set");
        } else {
            long jLongValue = j - l.longValue();
            zzdVar.zza.remove(str);
            zzdVar.zzi(str, jLongValue, zzirVarZzj);
        }
        if (zzdVar.zzb.isEmpty()) {
            long j2 = zzdVar.zzc;
            if (j2 == 0) {
                DM.w(zzdVar.zzt, "First ad exposure time was never set");
            } else {
                zzdVar.zzh(j - j2, zzirVarZzj);
                zzdVar.zzc = 0L;
            }
        }
    }

    @WorkerThread
    private final void zzh(long j, zzir zzirVar) {
        if (zzirVar == null) {
            AbstractC3888ke0.p(this.zzt, "Not logging ad exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("_xt", j);
        zzlp.zzK(zzirVar, bundle, true);
        this.zzt.zzq().zzG("am", "_xa", bundle);
    }

    @WorkerThread
    private final void zzi(String str, long j, zzir zzirVar) {
        if (zzirVar == null) {
            AbstractC3888ke0.p(this.zzt, "Not logging ad unit exposure. No active activity");
            return;
        }
        if (j < 1000) {
            this.zzt.zzaA().zzj().zzb("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("_ai", str);
        bundle.putLong("_xt", j);
        zzlp.zzK(zzirVar, bundle, true);
        this.zzt.zzq().zzG("am", "_xu", bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zzj(long j) {
        Iterator it = this.zza.keySet().iterator();
        while (it.hasNext()) {
            this.zza.put((String) it.next(), Long.valueOf(j));
        }
        if (this.zza.isEmpty()) {
            return;
        }
        this.zzc = j;
    }

    public final void zzd(String str, long j) {
        if (str == null || str.length() == 0) {
            DM.w(this.zzt, "Ad unit id must be a non-empty string");
        } else {
            this.zzt.zzaB().zzp(new zza(this, str, j));
        }
    }

    public final void zze(String str, long j) {
        if (str == null || str.length() == 0) {
            DM.w(this.zzt, "Ad unit id must be a non-empty string");
        } else {
            this.zzt.zzaB().zzp(new zzb(this, str, j));
        }
    }

    @WorkerThread
    public final void zzf(long j) {
        zzir zzirVarZzj = this.zzt.zzs().zzj(false);
        for (String str : this.zza.keySet()) {
            zzi(str, j - ((Long) this.zza.get(str)).longValue(), zzirVarZzj);
        }
        if (!this.zza.isEmpty()) {
            zzh(j - this.zzc, zzirVarZzj);
        }
        zzj(j);
    }
}
