package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.badlogic.gdx.Net;

/* JADX INFO: loaded from: classes3.dex */
public final class zzetg implements zzetq {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;

    @Nullable
    public final String zzh;

    public zzetg(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3, @Nullable String str2) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = i;
        this.zzf = i2;
        this.zzg = i3;
        this.zzh = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        zzcuvVar.zzb.putString("js", this.zzc);
        zzcuvVar.zzb.putInt("target_api", this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        bundle.putString("js", this.zzc);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdP));
        bundle.putInt("target_api", this.zze);
        bundle.putInt("dv", this.zzf);
        bundle.putInt("lv", this.zzg);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfO)).booleanValue() && !TextUtils.isEmpty(this.zzh)) {
            bundle.putString("ev", this.zzh);
        }
        Bundle bundleZza = zzfcx.zza(bundle, "sdk_env");
        bundleZza.putBoolean("mf", ((Boolean) zzbel.zzc.zze()).booleanValue());
        bundleZza.putBoolean("instant_app", this.zza);
        bundleZza.putBoolean("lite", this.zzb);
        bundleZza.putBoolean("is_privileged_process", this.zzd);
        bundle.putBundle("sdk_env", bundleZza);
        Bundle bundleZza2 = zzfcx.zza(bundleZza, "build_meta");
        bundleZza2.putString("cl", "697668803");
        bundleZza2.putString("rapid_rc", "dev");
        bundleZza2.putString("rapid_rollup", Net.HttpMethods.HEAD);
        bundleZza.putBundle("build_meta", bundleZza2);
    }
}
