package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.umeng.ccg.a;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkh implements zzbjp {
    private final zzbkg zza;

    public zzbkh(zzbkg zzbkgVar) {
        this.zza = zzbkgVar;
    }

    public static void zzb(zzcex zzcexVar, zzbkg zzbkgVar) {
        zzcexVar.zzag("/reward", new zzbkh(zzbkgVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        String str = (String) map.get(a.w);
        if (!"grant".equals(str)) {
            if ("video_start".equals(str)) {
                this.zza.zzc();
                return;
            } else {
                if ("video_complete".equals(str)) {
                    this.zza.zzb();
                    return;
                }
                return;
            }
        }
        zzbwi zzbwiVar = null;
        try {
            int i = Integer.parseInt((String) map.get(RewardPlus.AMOUNT));
            String str2 = (String) map.get("type");
            if (!TextUtils.isEmpty(str2)) {
                zzbwiVar = new zzbwi(str2, i);
            }
        } catch (NumberFormatException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Unable to parse reward amount.", e);
        }
        this.zza.zza(zzbwiVar);
    }
}
