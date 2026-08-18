package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import com.umeng.ccg.a;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnu {
    private final zzdrw zza;
    private final zzfca zzb;

    public zzcnu(zzdrw zzdrwVar, zzfca zzfcaVar) {
        this.zza = zzdrwVar;
        this.zzb = zzfcaVar;
    }

    public final void zza(long j, int i) {
        String str;
        zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzd(this.zzb.zzb.zzb);
        zzdrvVarZza.zzb(a.w, "ad_closed");
        zzdrvVarZza.zzb("show_time", String.valueOf(j));
        zzdrvVarZza.zzb("ad_format", "app_open_ad");
        int i2 = i - 1;
        if (i2 == 0) {
            str = bc.aM;
        } else if (i2 == 1) {
            str = "bb";
        } else if (i2 == 2) {
            str = a.f2615a;
        } else if (i2 != 3) {
            str = i2 != 4 ? bc.aN : CampaignEx.KEY_ACTIVITY_PATH_AND_NAME;
        } else {
            str = "cb";
        }
        zzdrvVarZza.zzb("acr", str);
        zzdrvVarZza.zzg();
    }
}
