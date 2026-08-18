package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbix implements zzbjp {
    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
            com.google.android.gms.ads.internal.util.zze.zza("Missing App Id, cannot show LMD Overlay without it");
            return;
        }
        zzfsx zzfsxVarZzl = zzfsy.zzl();
        zzfsxVarZzl.zzb((String) map.get("appId"));
        zzfsxVarZzl.zzh(zzcexVar.getWidth());
        zzfsxVarZzl.zzg(zzcexVar.zzF().getWindowToken());
        if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
            zzfsxVarZzl.zzd(Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY")));
        } else {
            zzfsxVarZzl.zzd(81);
        }
        if (map.containsKey("verticalMargin")) {
            zzfsxVarZzl.zze(Float.parseFloat((String) map.get("verticalMargin")));
        } else {
            zzfsxVarZzl.zze(0.02f);
        }
        if (map.containsKey("enifd")) {
            zzfsxVarZzl.zza((String) map.get("enifd"));
        }
        try {
            com.google.android.gms.ads.internal.zzv.zzk().zzj(zzcexVar, zzfsxVarZzl.zzi());
        } catch (NullPointerException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "DefaultGmsgHandlers.ShowLMDOverlay");
            com.google.android.gms.ads.internal.util.zze.zza("Missing parameters for LMD Overlay show request");
        }
    }
}
