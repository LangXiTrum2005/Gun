package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.Nullable;
import com.umeng.ccg.a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdjh {
    private final zzdrw zza;

    public zzdjh(zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    public final void zza(@Nullable View view, zzfbo zzfboVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmK)).booleanValue() || view == null) {
            return;
        }
        String str = true != com.google.android.gms.ads.internal.util.zzac.zza(view) ? "0" : "1";
        zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzb(a.w, "hcp");
        zzdrvVarZza.zzb("hcp", str);
        zzdrvVarZza.zzc(zzfboVar);
        zzdrvVarZza.zzg();
    }
}
