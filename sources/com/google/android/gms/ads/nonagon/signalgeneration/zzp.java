package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeq;
import com.google.android.gms.internal.ads.zzdsb;

/* JADX INFO: loaded from: classes2.dex */
public final class zzp extends QueryInfoGenerationCallback {
    private final zzo zza;
    private final zzdsb zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();

    @Nullable
    private final Boolean zzf;

    public zzp(zzo zzoVar, boolean z, int i, @Nullable Boolean bool, zzdsb zzdsbVar) {
        this.zza = zzoVar;
        this.zzc = z;
        this.zzd = i;
        this.zzf = bool;
        this.zzb = zzdsbVar;
    }

    private static long zza() {
        return ((Long) zzbeq.zzf.zze()).longValue() + com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
    }

    private final long zzb() {
        return com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zze;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        Pair[] pairArr = new Pair[9];
        pairArr[0] = new Pair("sgf_reason", str);
        pairArr[1] = new Pair("se", "query_g");
        pairArr[2] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[3] = new Pair("rtype", Integer.toString(6));
        pairArr[4] = new Pair("scar", "true");
        pairArr[5] = new Pair("lat_ms", Long.toString(zzb()));
        pairArr[6] = new Pair("sgpc_rn", Integer.toString(this.zzd));
        pairArr[7] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        pairArr[8] = new Pair("tpc", true != this.zzc ? "0" : "1");
        zzaa.zzd(this.zzb, null, "sgpcf", pairArr);
        this.zza.zzf(this.zzc, new zzq(null, str, zza(), this.zzd));
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("se", "query_g");
        pairArr[1] = new Pair("ad_format", AdFormat.BANNER.name());
        pairArr[2] = new Pair("rtype", Integer.toString(6));
        pairArr[3] = new Pair("scar", "true");
        pairArr[4] = new Pair("lat_ms", Long.toString(zzb()));
        pairArr[5] = new Pair("sgpc_rn", Integer.toString(this.zzd));
        pairArr[6] = new Pair("sgpc_lsu", String.valueOf(this.zzf));
        pairArr[7] = new Pair("tpc", true != this.zzc ? "0" : "1");
        zzaa.zzd(this.zzb, null, "sgpcs", pairArr);
        this.zza.zzf(this.zzc, new zzq(queryInfo, "", zza(), this.zzd));
    }
}
