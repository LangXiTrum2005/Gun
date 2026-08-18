package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.ccg.a;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjl implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        String str = (String) map.get(a.w);
        if (CampaignEx.JSON_NATIVE_VIDEO_PAUSE.equals(str)) {
            zzcexVar.zzde();
        } else if (CampaignEx.JSON_NATIVE_VIDEO_RESUME.equals(str)) {
            zzcexVar.zzdf();
        }
    }
}
