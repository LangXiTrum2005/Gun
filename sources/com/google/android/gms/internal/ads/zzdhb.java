package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.bc;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzdhb implements zzdin {
    private com.google.android.gms.ads.internal.client.zzdd zzC;
    private final zzdjh zzD;
    private final Context zza;
    private final zzdiq zzb;
    private final JSONObject zzc;
    private final zzdnl zzd;
    private final zzdif zze;
    private final zzava zzf;
    private final zzcwl zzg;
    private final zzcvr zzh;
    private final zzddq zzi;
    private final zzfbo zzj;
    private final VersionInfoParcel zzk;
    private final zzfcj zzl;
    private final zzcnh zzm;
    private final zzdjl zzn;
    private final Clock zzo;
    private final zzddm zzp;
    private final zzfja zzq;
    private final zzdpb zzr;
    private final zzfhh zzs;
    private final zzebv zzt;
    private boolean zzv;
    private boolean zzu = false;
    private boolean zzw = false;
    private boolean zzx = false;
    private Point zzy = new Point();
    private Point zzz = new Point();
    private long zzA = 0;
    private long zzB = 0;

    public zzdhb(Context context, zzdiq zzdiqVar, JSONObject jSONObject, zzdnl zzdnlVar, zzdif zzdifVar, zzava zzavaVar, zzcwl zzcwlVar, zzcvr zzcvrVar, zzddq zzddqVar, zzfbo zzfboVar, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar, zzcnh zzcnhVar, zzdjl zzdjlVar, Clock clock, zzddm zzddmVar, zzfja zzfjaVar, zzfhh zzfhhVar, zzebv zzebvVar, zzdpb zzdpbVar, zzdjh zzdjhVar) {
        this.zza = context;
        this.zzb = zzdiqVar;
        this.zzc = jSONObject;
        this.zzd = zzdnlVar;
        this.zze = zzdifVar;
        this.zzf = zzavaVar;
        this.zzg = zzcwlVar;
        this.zzh = zzcvrVar;
        this.zzi = zzddqVar;
        this.zzj = zzfboVar;
        this.zzk = versionInfoParcel;
        this.zzl = zzfcjVar;
        this.zzm = zzcnhVar;
        this.zzn = zzdjlVar;
        this.zzo = clock;
        this.zzp = zzddmVar;
        this.zzq = zzfjaVar;
        this.zzs = zzfhhVar;
        this.zzt = zzebvVar;
        this.zzr = zzdpbVar;
        this.zzD = zzdjhVar;
    }

    @Nullable
    private final String zzE(View view) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
            return null;
        }
        try {
            return this.zzf.zzc().zzh(this.zza, view, null);
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting data.");
            return null;
        }
    }

    @Nullable
    private final String zzF(@Nullable View view, @Nullable Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int iZzc = this.zze.zzc();
        if (iZzc == 1) {
            return "1099";
        }
        if (iZzc == 2) {
            return "2099";
        }
        if (iZzc != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean zzG(String str) {
        JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("allow_pub_event_reporting");
        return jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optBoolean(str, false);
    }

    private final boolean zzH() {
        return this.zzc.optBoolean("allow_custom_click_gesture", false);
    }

    private final boolean zzI(@Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, boolean z, @Nullable View view) {
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put(bc.aC, this.zzc);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z);
            Context context = this.zza;
            JSONObject jSONObject7 = new JSONObject();
            com.google.android.gms.ads.internal.zzv.zzq();
            DisplayMetrics displayMetricsZzu = com.google.android.gms.ads.internal.util.zzs.zzu((WindowManager) context.getSystemService("window"));
            zzdha zzdhaVar = null;
            try {
                jSONObject7.put("width", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, displayMetricsZzu.widthPixels));
                jSONObject7.put("height", com.google.android.gms.ads.internal.client.zzbc.zzb().zzb(context, displayMetricsZzu.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzix)).booleanValue()) {
                this.zzd.zzl("/clickRecorded", new zzdgy(this, zzdhaVar));
            } else {
                this.zzd.zzl("/logScionEvent", new zzdgx(this, zzdhaVar));
            }
            this.zzd.zzl("/nativeImpression", new zzdgz(this, view, zzdhaVar));
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.zzu) {
                return true;
            }
            zzfbo zzfboVar = this.zzj;
            this.zzu = com.google.android.gms.ads.internal.zzv.zzt().zzn(this.zza, this.zzk.afmaVersion, zzfboVar.zzC.toString(), this.zzl.zzf);
            return true;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create impression JSON.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzA(@Nullable View view, @Nullable Map map) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (view != null) {
            this.zzp.zzb(view);
        }
        this.zzv = false;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzB() {
        if (zza() == 0) {
            return true;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
            return this.zzl.zzi.zzj;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzC() {
        return zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final boolean zzD(Bundle bundle) {
        if (zzG("impression_reporting")) {
            return zzI(null, null, null, null, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlo)).booleanValue() ? zzE(null) : null, com.google.android.gms.ads.internal.client.zzbc.zzb().zzk(bundle, null), false, null);
        }
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final int zza() {
        if (this.zzl.zzi == null) {
            return 0;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
            return this.zzl.zzi.zzi;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zze(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(context, view);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", jSONObjectZzd);
            jSONObject.put("ad_view_signal", jSONObjectZzg);
            jSONObject.put("scroll_view_signal", jSONObjectZzf);
            jSONObject.put("lock_screen_signal", jSONObjectZze);
            return jSONObject;
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native ad view signals JSON.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    @Nullable
    public final JSONObject zzf(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        JSONObject jSONObjectZze = zze(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.zzx && zzH()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (jSONObjectZze != null) {
                jSONObject.put("nas", jSONObjectZze);
            }
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create native click meta data JSON.", e);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzh() {
        try {
            com.google.android.gms.ads.internal.client.zzdd zzddVar = this.zzC;
            if (zzddVar != null) {
                zzddVar.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzi() {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzj() {
        this.zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzk(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) {
        try {
            if (this.zzw) {
                return;
            }
            if (zzdhVar == null) {
                zzdif zzdifVar = this.zze;
                if (zzdifVar.zzk() != null) {
                    this.zzw = true;
                    this.zzq.zzd(zzdifVar.zzk().zzf(), this.zzj.zzax, this.zzs);
                    zzh();
                    return;
                }
            }
            this.zzw = true;
            this.zzq.zzd(zzdhVar.zzf(), this.zzj.zzax, this.zzs);
            zzh();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzl(View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(context, view2);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(context, view2);
        String strZzF = zzF(view, map);
        zzo(true == ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdL)).booleanValue() ? view2 : view, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzF, com.google.android.gms.ads.internal.util.zzbv.zzc(strZzF, context, this.zzz, this.zzy), null, z, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzm(String str) {
        zzo(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzn(@Nullable Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Click data is null. No click is reported.");
        } else if (!zzG("click_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            zzo(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, com.google.android.gms.ads.internal.client.zzbc.zzb().zzk(bundle, null), false, false);
        }
    }

    @VisibleForTesting
    public final void zzo(@Nullable View view, @Nullable JSONObject jSONObject, @Nullable JSONObject jSONObject2, @Nullable JSONObject jSONObject3, @Nullable JSONObject jSONObject4, @Nullable String str, @Nullable JSONObject jSONObject5, @Nullable JSONObject jSONObject6, boolean z, boolean z2) {
        String strZzd;
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put(bc.aC, this.zzc);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.zze.zzc());
            jSONObject8.put("view_aware_api_used", z);
            zzbfl zzbflVar = this.zzl.zzi;
            jSONObject8.put("custom_mute_requested", zzbflVar != null && zzbflVar.zzg);
            jSONObject8.put("custom_mute_enabled", (this.zze.zzH().isEmpty() || this.zze.zzk() == null) ? false : true);
            if (this.zzn.zza() != null && this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.zzo.currentTimeMillis());
            if (this.zzx && zzH()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z2) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.zzb.zzc(this.zze.zzA()) != null);
            try {
                JSONObject jSONObjectOptJSONObject = this.zzc.optJSONObject("tracking_urls_and_actions");
                if (jSONObjectOptJSONObject == null) {
                    jSONObjectOptJSONObject = new JSONObject();
                }
                strZzd = this.zzf.zzc().zzd(this.zza, jSONObjectOptJSONObject.optString("click_string"), view);
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception obtaining click signals", e);
                strZzd = null;
            }
            jSONObject8.put("click_signals", strZzd);
            jSONObject8.put("open_chrome_custom_tab", true);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziB)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zziC)).booleanValue() && PlatformVersion.isAtLeastR()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put(CampaignEx.JSON_NATIVE_VIDEO_CLICK, jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long jCurrentTimeMillis = this.zzo.currentTimeMillis();
            jSONObject9.put("time_from_last_touch_down", jCurrentTimeMillis - this.zzA);
            jSONObject9.put("time_from_last_touch", jCurrentTimeMillis - this.zzB);
            jSONObject7.put("touch_signal", jSONObject9);
            if (this.zzj.zzb()) {
                JSONObject jSONObject10 = (JSONObject) this.zzc.get("tracking_urls_and_actions");
                String string = jSONObject10 != null ? jSONObject10.getString("gws_query_id") : null;
                if (string != null) {
                    this.zzt.zzq(string, this.zze);
                }
            }
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to create click JSON.", e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzp(@Nullable View view, @Nullable View view2, @Nullable Map map, @Nullable Map map2, boolean z, @Nullable ImageView.ScaleType scaleType, int i) {
        JSONObject jSONObject;
        boolean z2 = false;
        if (this.zzc.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzls)).booleanValue()) {
                z2 = true;
            }
        }
        if (!z2) {
            if (!this.zzx) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Custom click reporting failed. enableCustomClickGesture is not set.");
                return;
            } else if (!zzH()) {
                com.google.android.gms.ads.internal.util.client.zzo.zze("Custom click reporting failed. Ad unit id not in the allow list.");
                return;
            }
        }
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbv.zzd(this.zza, map, map2, view2, scaleType);
        JSONObject jSONObjectZzg = com.google.android.gms.ads.internal.util.zzbv.zzg(this.zza, view2);
        JSONObject jSONObjectZzf = com.google.android.gms.ads.internal.util.zzbv.zzf(view2);
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbv.zze(this.zza, view2);
        String strZzF = zzF(view, map);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbv.zzc(strZzF, this.zza, this.zzz, this.zzy);
        if (z2) {
            try {
                JSONObject jSONObject2 = this.zzc;
                Point point = this.zzz;
                Point point2 = this.zzy;
                try {
                    jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject3 = new JSONObject();
                        JSONObject jSONObject4 = new JSONObject();
                        if (point != null) {
                            jSONObject3.put("x", point.x);
                            jSONObject3.put("y", point.y);
                        }
                        if (point2 != null) {
                            jSONObject4.put("x", point2.x);
                            jSONObject4.put("y", point2.y);
                        }
                        jSONObject.put("start_point", jSONObject3);
                        jSONObject.put("end_point", jSONObject4);
                        jSONObject.put("duration_ms", i);
                    } catch (Exception e) {
                        e = e;
                        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while grabbing custom click gesture signals.", e);
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2.put("custom_click_gesture_signal", jSONObject);
            } catch (JSONException e3) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error occurred while adding CustomClickGestureSignals to adJson.", e3);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e3, "FirstPartyNativeAdCore.performCustomClickGesture");
            }
        }
        zzo(view2, jSONObjectZzg, jSONObjectZzd, jSONObjectZzf, jSONObjectZze, strZzF, jSONObjectZzc, null, z, true);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(bc.aC, this.zzc);
            zzbzz.zza(this.zzd.zzg("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzr(@Nullable View view, @Nullable Map map, @Nullable Map map2, @Nullable ImageView.ScaleType scaleType) {
        Context context = this.zza;
        zzI(com.google.android.gms.ads.internal.util.zzbv.zzg(context, view), com.google.android.gms.ads.internal.util.zzbv.zzd(context, map, map2, view, scaleType), com.google.android.gms.ads.internal.util.zzbv.zzf(view), com.google.android.gms.ads.internal.util.zzbv.zze(context, view), zzE(view), null, com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzj), view);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzs() {
        zzI(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzt(@Nullable View view, MotionEvent motionEvent, @Nullable View view2) {
        this.zzy = com.google.android.gms.ads.internal.util.zzbv.zza(motionEvent, view2);
        long jCurrentTimeMillis = this.zzo.currentTimeMillis();
        this.zzB = jCurrentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.zzr.zzb(motionEvent);
            this.zzA = jCurrentTimeMillis;
            this.zzz = this.zzy;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        Point point = this.zzy;
        motionEventObtain.setLocation(point.x, point.y);
        this.zzf.zzd(motionEventObtain);
        motionEventObtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzu(@Nullable Bundle bundle) {
        if (bundle == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!zzG("touch_reporting")) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        this.zzf.zzc().zzl((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzv(View view) {
        if (!this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        zzdjl zzdjlVar = this.zzn;
        if (view == null) {
            return;
        }
        view.setOnClickListener(zzdjlVar);
        view.setClickable(true);
        zzdjlVar.zzc = new WeakReference(view);
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzw() {
        this.zzx = true;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzx(com.google.android.gms.ads.internal.client.zzdd zzddVar) {
        this.zzC = zzddVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzy(zzbhq zzbhqVar) {
        if (this.zzc.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.zzn.zzc(zzbhqVar);
        } else {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdin
    public final void zzz(View view, @Nullable Map map, @Nullable Map map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.zzy = new Point();
        this.zzz = new Point();
        if (!this.zzv) {
            this.zzp.zza(view);
            this.zzv = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.zzm.zzi(this);
        boolean zZzi = com.google.android.gms.ads.internal.util.zzbv.zzi(this.zzk.clientJarVersion);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (zZzi) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (zZzi) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }
}
