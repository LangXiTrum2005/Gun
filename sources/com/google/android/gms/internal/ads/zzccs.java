package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import com.umeng.ccg.a;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzccs implements zzbjp {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzbc.zzb();
                i = com.google.android.gms.ads.internal.util.client.zzf.zzx(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sbR = DM.r("Parse pixels for ", str, ", got string ", str2, ", int ");
            sbR.append(i);
            sbR.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(sbR.toString());
        }
        return i;
    }

    private static void zzc(zzcbg zzcbgVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzcbgVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse buffer parameters in loadControl video GMSG: (" + str + ", " + str2 + ")");
                return;
            }
        }
        if (str2 != null) {
            zzcbgVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzcbgVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzcbgVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzcbgVar.zzD(Integer.parseInt(str5));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        int iMin;
        int iMin2;
        int i;
        zzcbs zzcbsVar = (zzcbs) obj;
        String str = (String) map.get(a.w);
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Action missing from video GMSG.");
            return;
        }
        Integer numValueOf = null;
        Integer numValueOf2 = map.containsKey("playerId") ? Integer.valueOf(Integer.parseInt((String) map.get("playerId"))) : null;
        Integer numZzb = zzcbsVar.zzo() != null ? zzcbsVar.zzo().zzb() : null;
        if (numValueOf2 != null && numZzb != null && !numValueOf2.equals(numZzb) && !str.equals("load")) {
            Locale locale = Locale.US;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Event intended for player " + numValueOf2 + ", but sent to player " + numZzb + " - event ignored");
            return;
        }
        if (com.google.android.gms.ads.internal.util.client.zzo.zzm(3)) {
            JSONObject jSONObject = new JSONObject(map);
            jSONObject.remove("google.afma.Notify_dt");
            com.google.android.gms.ads.internal.util.client.zzo.zze("Video GMSG: " + str + " " + jSONObject.toString());
        }
        if (str.equals("background")) {
            String str2 = (String) map.get("color");
            if (TextUtils.isEmpty(str2)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Color parameter missing from background video GMSG.");
                return;
            }
            try {
                zzcbsVar.setBackgroundColor(Color.parseColor(str2));
                return;
            } catch (IllegalArgumentException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Invalid color parameter in background video GMSG.");
                return;
            }
        }
        if (str.equals("playerBackground")) {
            String str3 = (String) map.get("color");
            if (TextUtils.isEmpty(str3)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Color parameter missing from playerBackground video GMSG.");
                return;
            }
            try {
                zzcbsVar.zzB(Color.parseColor(str3));
                return;
            } catch (IllegalArgumentException unused2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Invalid color parameter in playerBackground video GMSG.");
                return;
            }
        }
        int i2 = 0;
        if (str.equals("decoderProps")) {
            String str4 = (String) map.get("mimeTypes");
            if (str4 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No MIME types specified for decoder properties inspection.");
                HashMap map2 = new HashMap();
                map2.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
                map2.put("error", "missingMimeTypes");
                zzcbsVar.zzd("onVideoEvent", map2);
                return;
            }
            HashMap map3 = new HashMap();
            String[] strArrSplit = str4.split(",");
            int length = strArrSplit.length;
            while (i2 < length) {
                String str5 = strArrSplit[i2];
                map3.put(str5, com.google.android.gms.ads.internal.util.zzcj.zza(str5.trim()));
                i2++;
            }
            HashMap map4 = new HashMap();
            map4.put(NotificationCompat.CATEGORY_EVENT, "decoderProps");
            map4.put("mimeTypes", map3);
            zzcbsVar.zzd("onVideoEvent", map4);
            return;
        }
        zzcbh zzcbhVarZzo = zzcbsVar.zzo();
        if (zzcbhVarZzo == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not get underlay container for a video GMSG.");
            return;
        }
        boolean zEquals = str.equals("new");
        boolean zEquals2 = str.equals("position");
        if (zEquals || zEquals2) {
            Context context = zzcbsVar.getContext();
            int iZzb = zzb(context, map, "x", 0);
            int iZzb2 = zzb(context, map, "y", 0);
            int iZzb3 = zzb(context, map, "w", -1);
            zzbcc zzbccVar = zzbcl.zzdW;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                iMin = iZzb3 == -1 ? zzcbsVar.zzh() : Math.min(iZzb3, zzcbsVar.zzh());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder sbT = AbstractC3950lJ.t("Calculate width with original width ", iZzb3, ", videoHost.getVideoBoundingWidth() ", zzcbsVar.zzh(), ", x ");
                    sbT.append(iZzb);
                    sbT.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sbT.toString());
                }
                iMin = Math.min(iZzb3, zzcbsVar.zzh() - iZzb);
            }
            int i3 = iMin;
            int iZzb4 = zzb(context, map, bc.aM, -1);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                iMin2 = iZzb4 == -1 ? zzcbsVar.zzg() : Math.min(iZzb4, zzcbsVar.zzg());
            } else {
                if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                    StringBuilder sbT2 = AbstractC3950lJ.t("Calculate height with original height ", iZzb4, ", videoHost.getVideoBoundingHeight() ", zzcbsVar.zzg(), ", y ");
                    sbT2.append(iZzb2);
                    sbT2.append(".");
                    com.google.android.gms.ads.internal.util.zze.zza(sbT2.toString());
                }
                iMin2 = Math.min(iZzb4, zzcbsVar.zzg() - iZzb2);
            }
            int i4 = iMin2;
            try {
                i = Integer.parseInt((String) map.get("player"));
            } catch (NumberFormatException unused3) {
                i = 0;
            }
            boolean z = Boolean.parseBoolean((String) map.get("spherical"));
            if (!zEquals || zzcbhVarZzo.zza() != null) {
                zzcbhVarZzo.zzc(iZzb, iZzb2, i3, i4);
                return;
            }
            zzcbhVarZzo.zzd(iZzb, iZzb2, i3, i4, i, z, new zzcbr((String) map.get("flags")));
            zzcbg zzcbgVarZza = zzcbhVarZzo.zza();
            if (zzcbgVarZza != null) {
                zzc(zzcbgVarZza, map);
                return;
            }
            return;
        }
        zzcfz zzcfzVarZzq = zzcbsVar.zzq();
        if (zzcfzVarZzq != null) {
            if (str.equals("timeupdate")) {
                String str6 = (String) map.get("currentTime");
                if (str6 == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("currentTime parameter missing from timeupdate video GMSG.");
                    return;
                }
                try {
                    zzcfzVarZzq.zzt(Float.parseFloat(str6));
                    return;
                } catch (NumberFormatException unused4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse currentTime parameter from timeupdate video GMSG: ".concat(str6));
                    return;
                }
            }
            if (str.equals("skip")) {
                zzcfzVarZzq.zzu();
                return;
            }
        }
        zzcbg zzcbgVarZza2 = zzcbhVarZzo.zza();
        if (zzcbgVarZza2 == null) {
            HashMap map5 = new HashMap();
            map5.put(NotificationCompat.CATEGORY_EVENT, "no_video_view");
            zzcbsVar.zzd("onVideoEvent", map5);
            return;
        }
        if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_CLICK)) {
            Context context2 = zzcbsVar.getContext();
            int iZzb5 = zzb(context2, map, "x", 0);
            float fZzb = zzb(context2, map, "y", 0);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, iZzb5, fZzb, 0);
            zzcbgVarZza2.zzx(motionEventObtain);
            motionEventObtain.recycle();
            return;
        }
        if (str.equals("currentTime")) {
            String str7 = (String) map.get("time");
            if (str7 == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Time parameter missing from currentTime video GMSG.");
                return;
            }
            try {
                zzcbgVarZza2.zzw((int) (Float.parseFloat(str7) * 1000.0f));
                return;
            } catch (NumberFormatException unused5) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse time parameter from currentTime video GMSG: ".concat(str7));
                return;
            }
        }
        if (str.equals("hide")) {
            zzcbgVarZza2.setVisibility(4);
            return;
        }
        if (str.equals("remove")) {
            zzcbgVarZza2.setVisibility(8);
            return;
        }
        if (str.equals("load")) {
            zzcbgVarZza2.zzr(numValueOf2);
            return;
        }
        if (str.equals("loadControl")) {
            zzc(zzcbgVarZza2, map);
            return;
        }
        if (str.equals("muted")) {
            if (Boolean.parseBoolean((String) map.get("muted"))) {
                zzcbgVarZza2.zzs();
                return;
            } else {
                zzcbgVarZza2.zzI();
                return;
            }
        }
        if (str.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
            zzcbgVarZza2.zzu();
            return;
        }
        if (str.equals("play")) {
            zzcbgVarZza2.zzv();
            return;
        }
        if (str.equals("show")) {
            zzcbgVarZza2.setVisibility(0);
            return;
        }
        if (str.equals("src")) {
            String str8 = (String) map.get("src");
            if (map.containsKey("periodicReportIntervalMs")) {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt((String) map.get("periodicReportIntervalMs")));
                } catch (NumberFormatException unused6) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Video gmsg invalid numeric parameter 'periodicReportIntervalMs': ".concat(String.valueOf((String) map.get("periodicReportIntervalMs"))));
                }
            }
            String[] strArr = {str8};
            String str9 = (String) map.get("demuxed");
            if (str9 != null) {
                try {
                    JSONArray jSONArray = new JSONArray(str9);
                    String[] strArr2 = new String[jSONArray.length()];
                    while (i2 < jSONArray.length()) {
                        strArr2[i2] = jSONArray.getString(i2);
                        i2++;
                    }
                    strArr = strArr2;
                } catch (JSONException unused7) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Malformed demuxed URL list for playback: ".concat(str9));
                    strArr = new String[]{str8};
                }
            }
            if (numValueOf != null) {
                zzcbsVar.zzA(numValueOf.intValue());
            }
            zzcbgVarZza2.zzE(str8, strArr);
            return;
        }
        if (str.equals("touchMove")) {
            Context context3 = zzcbsVar.getContext();
            zzcbgVarZza2.zzH(zzb(context3, map, "dx", 0), zzb(context3, map, "dy", 0));
            if (this.zza) {
                return;
            }
            zzcbsVar.zzdg();
            this.zza = true;
            return;
        }
        if (!str.equals("volume")) {
            if (str.equals(MBridgeConstans.EXTRA_KEY_WM)) {
                zzcbgVarZza2.zzn();
                return;
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Unknown video action: ".concat(str));
                return;
            }
        }
        String str10 = (String) map.get("volume");
        if (str10 == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Level parameter missing from volume video GMSG.");
            return;
        }
        try {
            zzcbgVarZza2.zzG(Float.parseFloat(str10));
        } catch (NumberFormatException unused8) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse volume parameter from volume video GMSG: ".concat(str10));
        }
    }
}
