package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.umeng.ccg.a;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkc implements zzbjp {
    private final zzdvs zza;

    public zzbkc(zzdvs zzdvsVar) {
        this.zza = zzdvsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjl)).booleanValue()) {
            String str = (String) map.get(a.w);
            String str2 = (String) map.get(HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.zza.zzh(str2, str4, str3);
            } else if (str.equals("show")) {
                this.zza.zzi(str2, str3);
            }
        }
    }
}
