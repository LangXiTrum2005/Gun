package com.google.android.gms.internal.ads;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import com.umeng.analytics.pro.f;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzavx implements zzfph {
    private final zzfnk zza;
    private final zzfob zzb;
    private final zzawk zzc;
    private final zzavw zzd;
    private final zzavg zze;
    private final zzawm zzf;
    private final zzawe zzg;
    private final zzavv zzh;

    public zzavx(@NonNull zzfnk zzfnkVar, @NonNull zzfob zzfobVar, @NonNull zzawk zzawkVar, @NonNull zzavw zzavwVar, @Nullable zzavg zzavgVar, @Nullable zzawm zzawmVar, @Nullable zzawe zzaweVar, @Nullable zzavv zzavvVar) {
        this.zza = zzfnkVar;
        this.zzb = zzfobVar;
        this.zzc = zzawkVar;
        this.zzd = zzavwVar;
        this.zze = zzavgVar;
        this.zzf = zzawmVar;
        this.zzg = zzaweVar;
        this.zzh = zzavvVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zzfnk zzfnkVar = this.zza;
        zzasy zzasyVarZzb = this.zzb.zzb();
        map.put(bc.aK, zzfnkVar.zzd());
        map.put("gms", Boolean.valueOf(this.zza.zzg()));
        map.put("int", zzasyVarZzb.zzh());
        map.put("attts", Long.valueOf(zzasyVarZzb.zzf().zza()));
        map.put("att", zzasyVarZzb.zzf().zzd());
        map.put("attkid", zzasyVarZzb.zzf().zzf());
        map.put(f.R, Boolean.valueOf(this.zzd.zza()));
        map.put(bc.aO, new Throwable());
        zzawe zzaweVar = this.zzg;
        if (zzaweVar != null) {
            map.put("tcq", Long.valueOf(zzaweVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
            zzavg zzavgVar = this.zze;
            if (zzavgVar != null) {
                map.put("nt", Long.valueOf(zzavgVar.zza()));
            }
            zzawm zzawmVar = this.zzf;
            if (zzawmVar != null) {
                map.put("vs", Long.valueOf(zzawmVar.zzc()));
                map.put("vf", Long.valueOf(this.zzf.zzb()));
            }
        }
        return map;
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    public final Map zza() {
        zzawk zzawkVar = this.zzc;
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(zzawkVar.zza()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    public final Map zzb() {
        Map mapZze = zze();
        zzasy zzasyVarZza = this.zzb.zza();
        mapZze.put("gai", Boolean.valueOf(this.zza.zzh()));
        mapZze.put("did", zzasyVarZza.zzg());
        mapZze.put("dst", Integer.valueOf(zzasyVarZza.zzal() - 1));
        mapZze.put("doo", Boolean.valueOf(zzasyVarZza.zzai()));
        return mapZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfph
    public final Map zzc() {
        zzavv zzavvVar = this.zzh;
        Map mapZze = zze();
        if (zzavvVar != null) {
            mapZze.put(CampaignEx.JSON_KEY_NEW_INTERSTITIAL_VST, zzavvVar.zza());
        }
        return mapZze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
