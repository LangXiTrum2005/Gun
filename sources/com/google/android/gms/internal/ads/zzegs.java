package com.google.android.gms.internal.ads;

import com.umeng.ccg.a;
import java.util.Iterator;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegs {
    private final zzfdb zza;
    private final zzdpj zzb;
    private final zzdrw zzc;

    public zzegs(zzfdb zzfdbVar, zzdpj zzdpjVar, zzdrw zzdrwVar) {
        this.zza = zzfdbVar;
        this.zzb = zzdpjVar;
        this.zzc = zzdrwVar;
    }

    public final void zza(zzfbr zzfbrVar, zzfbo zzfboVar, int i, @Nullable zzeda zzedaVar, long j) {
        zzdpi zzdpiVarZza;
        zzdrv zzdrvVarZza = this.zzc.zza();
        zzdrvVarZza.zzd(zzfbrVar);
        zzdrvVarZza.zzc(zzfboVar);
        zzdrvVarZza.zzb(a.w, "adapter_status");
        zzdrvVarZza.zzb("adapter_l", String.valueOf(j));
        zzdrvVarZza.zzb("sc", Integer.toString(i));
        if (zzedaVar != null) {
            zzdrvVarZza.zzb("arec", Integer.toString(zzedaVar.zzb().zza));
            String strZza = this.zza.zza(zzedaVar.getMessage());
            if (strZza != null) {
                zzdrvVarZza.zzb("areec", strZza);
            }
        }
        zzdpj zzdpjVar = this.zzb;
        Iterator it = zzfboVar.zzt.iterator();
        do {
            if (!it.hasNext()) {
                zzdpiVarZza = null;
                break;
            }
            zzdpiVarZza = zzdpjVar.zza((String) it.next());
        } while (zzdpiVarZza == null);
        if (zzdpiVarZza != null) {
            zzdrvVarZza.zzb("ancn", zzdpiVarZza.zza);
            zzbrs zzbrsVar = zzdpiVarZza.zzb;
            if (zzbrsVar != null) {
                zzdrvVarZza.zzb("adapter_v", zzbrsVar.toString());
            }
            zzbrs zzbrsVar2 = zzdpiVarZza.zzc;
            if (zzbrsVar2 != null) {
                zzdrvVarZza.zzb("adapter_sv", zzbrsVar2.toString());
            }
        }
        zzdrvVarZza.zzg();
    }
}
