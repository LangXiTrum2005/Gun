package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.umeng.ccg.a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcpn implements zzcwn {

    @Nullable
    private final zzcex zza;
    private final zzdrw zzb;
    private final zzfbo zzc;

    public zzcpn(@Nullable zzcex zzcexVar, zzdrw zzdrwVar, zzfbo zzfboVar) {
        this.zza = zzcexVar;
        this.zzb = zzdrwVar;
        this.zzc = zzfboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        zzcex zzcexVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmK)).booleanValue() || (zzcexVar = this.zza) == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzac.zza(zzcexVar.zzF()) ? "0" : "1";
        zzdrv zzdrvVarZza = this.zzb.zza();
        zzdrvVarZza.zzb(a.w, "hcp");
        zzdrvVarZza.zzb("hcp", str);
        zzdrvVarZza.zzc(this.zzc);
        zzdrvVarZza.zzg();
    }
}
