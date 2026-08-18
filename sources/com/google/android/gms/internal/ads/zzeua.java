package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzeua implements zzetq {
    public final boolean zza;
    public final boolean zzb;
    public final String zzc;
    public final boolean zzd;
    public final boolean zze;
    public final boolean zzf;
    public final String zzg;
    public final ArrayList zzh;

    @Nullable
    public final String zzi;

    @Nullable
    public final String zzj;
    public final String zzk;
    public final boolean zzl;
    public final String zzm;
    public final long zzn;
    public final boolean zzo;

    @Nullable
    public final String zzp;
    public final int zzq;

    public zzeua(boolean z, boolean z2, String str, boolean z3, boolean z4, boolean z5, String str2, ArrayList arrayList, @Nullable String str3, @Nullable String str4, String str5, boolean z6, String str6, long j, boolean z7, @Nullable String str7, int i) {
        this.zza = z;
        this.zzb = z2;
        this.zzc = str;
        this.zzd = z3;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = str2;
        this.zzh = arrayList;
        this.zzi = str3;
        this.zzj = str4;
        this.zzk = str5;
        this.zzl = z6;
        this.zzm = str6;
        this.zzn = j;
        this.zzo = z7;
        this.zzp = str7;
        this.zzq = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = ((zzcuv) obj).zzb;
        bundle.putBoolean("simulator", this.zzd);
        bundle.putInt("build_api_level", this.zzq);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("submodel", this.zzm);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        bundle.putBoolean("cog", this.zza);
        bundle.putBoolean("coh", this.zzb);
        bundle.putString("gl", this.zzc);
        bundle.putBoolean("simulator", this.zzd);
        bundle.putBoolean("is_latchsky", this.zze);
        bundle.putInt("build_api_level", this.zzq);
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkT)).booleanValue()) {
            bundle.putBoolean("is_sidewinder", this.zzf);
        }
        bundle.putString("hl", this.zzg);
        if (!this.zzh.isEmpty()) {
            bundle.putStringArrayList("hl_list", this.zzh);
        }
        bundle.putString("mv", this.zzi);
        bundle.putString("submodel", this.zzm);
        Bundle bundleZza = zzfcx.zza(bundle, "device");
        bundle.putBundle("device", bundleZza);
        bundleZza.putString("build", this.zzk);
        bundleZza.putLong("remaining_data_partition_space", this.zzn);
        Bundle bundleZza2 = zzfcx.zza(bundleZza, "browser");
        bundleZza.putBundle("browser", bundleZza2);
        bundleZza2.putBoolean("is_browser_custom_tabs_capable", this.zzl);
        if (!TextUtils.isEmpty(this.zzj)) {
            Bundle bundleZza3 = zzfcx.zza(bundleZza, "play_store");
            bundleZza.putBundle("play_store", bundleZza3);
            bundleZza3.putString("package_version", this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlj)).booleanValue()) {
            bundle.putBoolean("is_bstar", this.zzo);
        }
        if (!TextUtils.isEmpty(this.zzp)) {
            bundle.putString("v_unity", this.zzp);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzld)).booleanValue()) {
            zzfcx.zzg(bundle, "gotmt_l", true, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzla)).booleanValue());
            zzfcx.zzg(bundle, "gotmt_i", true, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkZ)).booleanValue());
        }
    }
}
