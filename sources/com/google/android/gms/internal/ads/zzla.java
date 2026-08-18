package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzla {
    private final zzog zza;
    private final zzkz zze;
    private final zzlt zzh;
    private final zzdh zzi;
    private boolean zzj;

    @Nullable
    private zzgy zzk;
    private zzwb zzl = new zzwb(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();
    private final HashMap zzf = new HashMap();
    private final Set zzg = new HashSet();

    public zzla(zzkz zzkzVar, zzlt zzltVar, zzdh zzdhVar, zzog zzogVar) {
        this.zza = zzogVar;
        this.zze = zzkzVar;
        this.zzh = zzltVar;
        this.zzi = zzdhVar;
    }

    private final void zzr(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzky) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzs(zzky zzkyVar) {
        zzkx zzkxVar = (zzkx) this.zzf.get(zzkyVar);
        if (zzkxVar != null) {
            zzkxVar.zza.zzi(zzkxVar.zzb);
        }
    }

    private final void zzt() {
        Iterator it = this.zzg.iterator();
        while (it.hasNext()) {
            zzky zzkyVar = (zzky) it.next();
            if (zzkyVar.zzc.isEmpty()) {
                zzs(zzkyVar);
                it.remove();
            }
        }
    }

    private final void zzu(zzky zzkyVar) {
        if (zzkyVar.zze && zzkyVar.zzc.isEmpty()) {
            zzkx zzkxVar = (zzkx) this.zzf.remove(zzkyVar);
            zzkxVar.getClass();
            zzkxVar.zza.zzp(zzkxVar.zzb);
            zzkxVar.zza.zzs(zzkxVar.zzc);
            zzkxVar.zza.zzr(zzkxVar.zzc);
            this.zzg.remove(zzkyVar);
        }
    }

    private final void zzv(zzky zzkyVar) {
        zzub zzubVar = zzkyVar.zza;
        zzuh zzuhVar = new zzuh() { // from class: com.google.android.gms.internal.ads.zzkq
            @Override // com.google.android.gms.internal.ads.zzuh
            public final void zza(zzui zzuiVar, zzbq zzbqVar) {
                this.zza.zzf(zzuiVar, zzbqVar);
            }
        };
        zzkw zzkwVar = new zzkw(this, zzkyVar);
        this.zzf.put(zzkyVar, new zzkx(zzubVar, zzuhVar, zzkwVar));
        zzubVar.zzh(new Handler(zzei.zzz(), null), zzkwVar);
        zzubVar.zzg(new Handler(zzei.zzz(), null), zzkwVar);
        zzubVar.zzm(zzuhVar, this.zzk, this.zza);
    }

    private final void zzw(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzky zzkyVar = (zzky) this.zzb.remove(i2);
            this.zzd.remove(zzkyVar.zzb);
            zzr(i2, -zzkyVar.zza.zzC().zzc());
            zzkyVar.zze = true;
            if (this.zzj) {
                zzu(zzkyVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzbq zzb() {
        if (this.zzb.isEmpty()) {
            return zzbq.zza;
        }
        int iZzc = 0;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzky zzkyVar = (zzky) this.zzb.get(i);
            zzkyVar.zzd = iZzc;
            iZzc += zzkyVar.zza.zzC().zzc();
        }
        return new zzlh(this.zzb, this.zzl);
    }

    public final zzbq zzc(int i, int i2, List list) {
        zzcw.zzd(i >= 0 && i <= i2 && i2 <= zza());
        zzcw.zzd(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzky) this.zzb.get(i3)).zza.zzt((zzar) list.get(i3 - i));
        }
        return zzb();
    }

    public final /* synthetic */ void zzf(zzui zzuiVar, zzbq zzbqVar) {
        this.zze.zzh();
    }

    public final void zzg(@Nullable zzgy zzgyVar) {
        zzcw.zzf(!this.zzj);
        this.zzk = zzgyVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzky zzkyVar = (zzky) this.zzb.get(i);
            zzv(zzkyVar);
            this.zzg.add(zzkyVar);
        }
        this.zzj = true;
    }

    public final void zzh() {
        for (zzkx zzkxVar : this.zzf.values()) {
            try {
                zzkxVar.zza.zzp(zzkxVar.zzb);
            } catch (RuntimeException e) {
                zzdo.zzd("MediaSourceList", "Failed to release child source.", e);
            }
            zzkxVar.zza.zzs(zzkxVar.zzc);
            zzkxVar.zza.zzr(zzkxVar.zzc);
        }
        this.zzf.clear();
        this.zzg.clear();
        this.zzj = false;
    }

    public final void zzi(zzue zzueVar) {
        zzky zzkyVar = (zzky) this.zzc.remove(zzueVar);
        zzkyVar.getClass();
        zzkyVar.zza.zzG(zzueVar);
        zzkyVar.zzc.remove(((zzty) zzueVar).zza);
        if (!this.zzc.isEmpty()) {
            zzt();
        }
        zzu(zzkyVar);
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final zzbq zzk(int i, List list, zzwb zzwbVar) {
        if (!list.isEmpty()) {
            this.zzl = zzwbVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzky zzkyVar = (zzky) list.get(i2 - i);
                if (i2 > 0) {
                    zzky zzkyVar2 = (zzky) this.zzb.get(i2 - 1);
                    zzkyVar.zzc(zzkyVar2.zza.zzC().zzc() + zzkyVar2.zzd);
                } else {
                    zzkyVar.zzc(0);
                }
                zzr(i2, zzkyVar.zza.zzC().zzc());
                this.zzb.add(i2, zzkyVar);
                this.zzd.put(zzkyVar.zzb, zzkyVar);
                if (this.zzj) {
                    zzv(zzkyVar);
                    if (this.zzc.isEmpty()) {
                        this.zzg.add(zzkyVar);
                    } else {
                        zzs(zzkyVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzbq zzl(int i, int i2, int i3, zzwb zzwbVar) {
        zzcw.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzbq zzm(int i, int i2, zzwb zzwbVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzl = zzwbVar;
        zzw(i, i2);
        return zzb();
    }

    public final zzbq zzn(List list, zzwb zzwbVar) {
        zzw(0, this.zzb.size());
        return zzk(this.zzb.size(), list, zzwbVar);
    }

    public final zzbq zzo(zzwb zzwbVar) {
        int iZza = zza();
        if (zzwbVar.zzc() != iZza) {
            zzwbVar = zzwbVar.zzf().zzg(0, iZza);
        }
        this.zzl = zzwbVar;
        return zzb();
    }

    public final zzue zzp(zzug zzugVar, zzyk zzykVar, long j) {
        int i = zzlh.zzb;
        Object obj = zzugVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzug zzugVarZza = zzugVar.zza(((Pair) obj).second);
        zzky zzkyVar = (zzky) this.zzd.get(obj2);
        zzkyVar.getClass();
        this.zzg.add(zzkyVar);
        zzkx zzkxVar = (zzkx) this.zzf.get(zzkyVar);
        if (zzkxVar != null) {
            zzkxVar.zza.zzk(zzkxVar.zzb);
        }
        zzkyVar.zzc.add(zzugVarZza);
        zzty zztyVarZzI = zzkyVar.zza.zzI(zzugVarZza, zzykVar, j);
        this.zzc.put(zztyVarZzI, zzkyVar);
        zzt();
        return zztyVarZzI;
    }

    public final zzwb zzq() {
        return this.zzl;
    }
}
