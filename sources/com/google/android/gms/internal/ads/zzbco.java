package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.MBridgeConstans;
import com.umeng.analytics.pro.bc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbco {
    private final String zza = (String) zzbef.zza.zze();
    private final Map zzb;
    private final Context zzc;
    private final String zzd;

    public zzbco(Context context, String str) {
        this.zzc = context;
        this.zzd = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzb = linkedHashMap;
        linkedHashMap.put(bc.aH, "gmob_sdk");
        linkedHashMap.put(bc.aK, ExifInterface.GPS_MEASUREMENT_3D);
        linkedHashMap.put(bc.x, Build.VERSION.RELEASE);
        linkedHashMap.put("api_v", Build.VERSION.SDK);
        com.google.android.gms.ads.internal.zzv.zzq();
        linkedHashMap.put("device", com.google.android.gms.ads.internal.util.zzs.zzs());
        linkedHashMap.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, context.getApplicationContext() != null ? context.getApplicationContext().getPackageName() : context.getPackageName());
        com.google.android.gms.ads.internal.zzv.zzq();
        linkedHashMap.put("is_lite_sdk", true != com.google.android.gms.ads.internal.util.zzs.zzF(context) ? "0" : "1");
        Future futureZzb = com.google.android.gms.ads.internal.zzv.zzn().zzb(context);
        try {
            linkedHashMap.put("network_coarse", Integer.toString(((zzbvo) futureZzb.get()).zzj));
            linkedHashMap.put("network_fine", Integer.toString(((zzbvo) futureZzb.get()).zzk));
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "CsiConfiguration.CsiConfiguration");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzli)).booleanValue()) {
            Map map = this.zzb;
            com.google.android.gms.ads.internal.zzv.zzq();
            map.put("is_bstar", true == com.google.android.gms.ads.internal.util.zzs.zzC(context) ? "1" : "0");
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjn)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzct)).booleanValue() || zzfve.zzd(com.google.android.gms.ads.internal.zzv.zzp().zzn())) {
                return;
            }
            this.zzb.put("plugin", com.google.android.gms.ads.internal.zzv.zzp().zzn());
        }
    }

    public final Context zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zza;
    }

    public final Map zzd() {
        return this.zzb;
    }
}
