package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.umeng.analytics.pro.bc;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcnd implements zzbnz {
    private final Context zza;
    private final zzayg zzb;
    private final PowerManager zzc;

    public zzcnd(Context context, zzayg zzaygVar) {
        this.zza = context;
        this.zzb = zzaygVar;
        this.zzc = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzbnz
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final JSONObject zzb(zzcng zzcngVar) throws JSONException {
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzayj zzayjVar = zzcngVar.zzf;
        if (zzayjVar == null) {
            jSONObject = new JSONObject();
        } else {
            if (this.zzb.zzd() == null) {
                throw new JSONException("Active view Info cannot be null.");
            }
            boolean z = zzayjVar.zza;
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("afmaVersion", this.zzb.zzb()).put("activeViewJSON", this.zzb.zzd()).put("timestamp", zzcngVar.zzd).put("adFormat", this.zzb.zza()).put("hashCode", this.zzb.zzc()).put("isMraid", false).put("isStopped", false).put("isPaused", zzcngVar.zzb).put("isNative", this.zzb.zze()).put("isScreenOn", this.zzc.isInteractive()).put("appMuted", com.google.android.gms.ads.internal.zzv.zzs().zze()).put("appVolume", com.google.android.gms.ads.internal.zzv.zzs().zza()).put("deviceVolume", com.google.android.gms.ads.internal.util.zzab.zzb(this.zza.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.zza.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzayjVar.zzb).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzayjVar.zzc.top).put("bottom", zzayjVar.zzc.bottom).put(TtmlNode.LEFT, zzayjVar.zzc.left).put(TtmlNode.RIGHT, zzayjVar.zzc.right)).put("adBox", new JSONObject().put("top", zzayjVar.zzd.top).put("bottom", zzayjVar.zzd.bottom).put(TtmlNode.LEFT, zzayjVar.zzd.left).put(TtmlNode.RIGHT, zzayjVar.zzd.right)).put("globalVisibleBox", new JSONObject().put("top", zzayjVar.zze.top).put("bottom", zzayjVar.zze.bottom).put(TtmlNode.LEFT, zzayjVar.zze.left).put(TtmlNode.RIGHT, zzayjVar.zze.right)).put("globalVisibleBoxVisible", zzayjVar.zzf).put("localVisibleBox", new JSONObject().put("top", zzayjVar.zzg.top).put("bottom", zzayjVar.zzg.bottom).put(TtmlNode.LEFT, zzayjVar.zzg.left).put(TtmlNode.RIGHT, zzayjVar.zzg.right)).put("localVisibleBoxVisible", zzayjVar.zzh).put("hitBox", new JSONObject().put("top", zzayjVar.zzi.top).put("bottom", zzayjVar.zzi.bottom).put(TtmlNode.LEFT, zzayjVar.zzi.left).put(TtmlNode.RIGHT, zzayjVar.zzi.right)).put("screenDensity", this.zza.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzcngVar.zza);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzby)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzayjVar.zzk;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put(TtmlNode.LEFT, rect2.left).put(TtmlNode.RIGHT, rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzcngVar.zze)) {
                jSONObject3.put("doneReasonCode", bc.aN);
            }
            jSONObject = jSONObject3;
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
