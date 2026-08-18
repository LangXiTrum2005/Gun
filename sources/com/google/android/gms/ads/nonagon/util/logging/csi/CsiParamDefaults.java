package com.google.android.gms.ads.nonagon.util.logging.csi;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzfve;
import com.mbridge.msdk.MBridgeConstans;
import com.umeng.analytics.pro.bc;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CsiParamDefaults {
    private final Context zza;
    private final String zzb;
    private final String zzc;

    public CsiParamDefaults(@NonNull Context context, @NonNull VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = context.getPackageName();
        this.zzc = versionInfoParcel.afmaVersion;
    }

    public void set(@NonNull Map<String, String> map) {
        map.put(bc.aH, "gmob_sdk");
        map.put(bc.aK, ExifInterface.GPS_MEASUREMENT_3D);
        map.put(bc.x, Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        zzv.zzq();
        map.put("device", zzs.zzs());
        map.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, this.zzb);
        zzv.zzq();
        map.put("is_lite_sdk", true != zzs.zzF(this.zza) ? "0" : "1");
        zzbcc zzbccVar = zzbcl.zza;
        List listZzb = zzbe.zza().zzb();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzgI)).booleanValue()) {
            listZzb.addAll(zzv.zzp().zzi().zzg().zzd());
        }
        map.put("e", TextUtils.join(",", listZzb));
        map.put("sdkVersion", this.zzc);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzli)).booleanValue()) {
            zzv.zzq();
            map.put("is_bstar", true != zzs.zzC(this.zza) ? "0" : "1");
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzct)).booleanValue()) {
                map.put("plugin", zzfve.zzc(zzv.zzp().zzn()));
            }
        }
    }
}
