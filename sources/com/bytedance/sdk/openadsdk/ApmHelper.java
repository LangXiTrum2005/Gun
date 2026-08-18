package com.bytedance.sdk.openadsdk;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.MonitorCrash;
import com.bytedance.sdk.component.OY.OY;
import com.bytedance.sdk.openadsdk.ZU.lk;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.core.sLN;
import com.bytedance.sdk.openadsdk.core.settings.lc;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.bytedance.sdk.openadsdk.utils.nJ;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ApmHelper {
    private static volatile boolean Lxb = false;
    private static boolean ZU;
    private static Lxb ebl;
    private static LD lc;
    private static String lk;
    private static final AtomicBoolean LD = new AtomicBoolean(false);
    private static boolean JXs = false;

    public interface LD {
        void Lxb(String str, String str2, Throwable th);
    }

    public static class Lxb {
        public final String LD;
        public final String Lxb;
        public final Throwable lk;

        public Lxb(String str, String str2, Throwable th) {
            this.Lxb = str;
            this.LD = str2;
            this.lk = th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map<String, String> QAg() {
        HashMap map = new HashMap();
        tD tDVarLxb = com.bytedance.sdk.openadsdk.utils.LD.Lxb();
        if (tDVarLxb != null) {
            map.put("adType", String.valueOf(tDVarLxb.op()));
            map.put("aid", String.valueOf(tDVarLxb.Pd()));
            map.put(BidResponsedEx.KEY_CID, tDVarLxb.bG());
            map.put("reqId", tDVarLxb.xNP());
            map.put("rit", tDVarLxb.CSn("-1"));
            int iId = tDVarLxb.id();
            if (tDVarLxb.eK() != 2) {
                iId = -1;
            }
            map.put("render_type", String.valueOf(iId));
        }
        return map;
    }

    public static void initApm(final Context context, final InitConfig initConfig) {
        if (LD.compareAndSet(false, true) && !Lxb) {
            hg.Lxb(new OY("init-apm") { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1
                @Override // java.lang.Runnable
                public void run() {
                    if (!ApmHelper.Lxb) {
                        lc lcVarZU = kqm.ZU();
                        boolean unused = ApmHelper.ZU = lcVarZU.VU();
                        if (ApmHelper.ZU && !TextUtils.isEmpty(lcVarZU.CG())) {
                            String unused2 = ApmHelper.lk = initConfig.getAppId();
                            String[] strArr = {"com.bytedance.sdk.component", "com.bytedance.sdk.mediation", BuildConfig.LIBRARY_PACKAGE_NAME, "com.com.bytedance.overseas.sdk", "com.pgl.ssdk", "com.bykv.vk", "com.iab.omid.library.bytedance2", "com.bytedance.adsdk"};
                            String strLxb = sLN.Lxb(context);
                            String strCG = lcVarZU.CG();
                            try {
                                final MonitorCrash monitorCrashInitSDK = MonitorCrash.initSDK(context, "10000001", 6504L, BuildConfig.VERSION_NAME, strArr);
                                monitorCrashInitSDK.setCustomDataCallback(new AttachUserData() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.1
                                    @Override // com.apm.insight.AttachUserData
                                    @Nullable
                                    public Map<? extends String, ? extends String> getUserData(CrashType crashType) {
                                        Map<? extends String, ? extends String> mapQAg = ApmHelper.QAg();
                                        if (mapQAg.containsKey("render_type")) {
                                            monitorCrashInitSDK.addTags("render_type", mapQAg.get("render_type"));
                                        } else {
                                            monitorCrashInitSDK.addTags("render_type", "-2");
                                        }
                                        return mapQAg;
                                    }
                                });
                                if (lcVarZU.xr()) {
                                    monitorCrashInitSDK.config().setSoList(new String[]{"libnms.so", "libtobEmbedPagEncrypt.so", "tt_ugen_layout.so"});
                                }
                                monitorCrashInitSDK.config().setDeviceId(strLxb);
                                monitorCrashInitSDK.setReportUrl(strCG);
                                monitorCrashInitSDK.addTags("host_appid", ApmHelper.lk);
                                monitorCrashInitSDK.addTags("sdk_version", BuildConfig.VERSION_NAME);
                                LD unused3 = ApmHelper.lc = new LD() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.2
                                    @Override // com.bytedance.sdk.openadsdk.ApmHelper.LD
                                    public void Lxb(String str, String str2, Throwable th) {
                                        monitorCrashInitSDK.reportCustomErr(str, str2, th);
                                    }
                                };
                                boolean unused4 = ApmHelper.Lxb = true;
                                ApmHelper.lk(strLxb, strCG);
                                monitorCrashInitSDK.registerCrashCallback(new ICrashCallback() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.1.3
                                    @Override // com.apm.insight.ICrashCallback
                                    public void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
                                        if (!ApmHelper.JXs) {
                                            ApmHelper.ZU(crashType.getName());
                                        }
                                        boolean unused5 = ApmHelper.JXs = true;
                                    }
                                }, CrashType.ALL);
                                Lxb lxb = ApmHelper.ebl;
                                Lxb unused5 = ApmHelper.ebl = null;
                                if (lxb != null) {
                                    ApmHelper.lc.Lxb(lxb.Lxb, lxb.LD, lxb.lk);
                                }
                            } catch (Throwable unused6) {
                                boolean unused7 = ApmHelper.Lxb = false;
                            }
                        }
                    }
                    ApmHelper.LD.set(false);
                }
            });
        }
    }

    public static boolean isIsInit() {
        return Lxb;
    }

    public static void reportCustomError(String str, String str2, Throwable th) {
        LD ld = lc;
        if (ld != null) {
            ld.Lxb(str, str2, th);
        } else {
            ebl = new Lxb(str, str2, th);
        }
    }

    public static void reportPvFromBackGround() {
        if (ZU) {
            LD(sLN.Lxb(kqm.Lxb()), kqm.ZU().CG());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void ZU(final String str) {
        final tD tDVarLxb = com.bytedance.sdk.openadsdk.utils.LD.Lxb();
        if (tDVarLxb != null) {
            String strLxb = nJ.Lxb(tDVarLxb);
            if (TextUtils.isEmpty(strLxb)) {
                return;
            }
            lk.Lxb(System.currentTimeMillis(), tDVarLxb, strLxb, "sdk_crash_info", new com.bytedance.sdk.openadsdk.STP.lk.Lxb() { // from class: com.bytedance.sdk.openadsdk.ApmHelper.2
                @Override // com.bytedance.sdk.openadsdk.STP.lk.Lxb
                public JSONObject Lxb() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("type", str);
                        jSONObject2.put("material", com.bytedance.sdk.component.utils.Lxb.Lxb(tDVarLxb.JD()).toString());
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                    } catch (JSONException unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lk(String str, String str2) {
        LD(str, str2);
    }

    private static void LD(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strB = DM.B("https://", str2, "/monitor/collect/c/session?version_code=6504&device_platform=android&aid=10000001");
        kqm.lk().Lxb(lk(str), strB);
    }

    private static JSONObject lk(String str) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("sdk_version", BuildConfig.VERSION_NAME);
            jSONObject3.put("host_app_id", lk);
            jSONObject2.putOpt("custom", jSONObject3);
            jSONObject2.put(bc.x, AnalyticsConstants.SDK_TYPE);
            jSONObject2.put(bc.y, Build.VERSION.RELEASE);
            jSONObject2.put("device_model", Build.MODEL);
            jSONObject2.put(bc.F, Build.BRAND);
            jSONObject2.put("sdk_version_name", "0.0.5");
            jSONObject2.put("aid", "10000001");
            jSONObject2.put("update_version_code", BuildConfig.VERSION_CODE);
            jSONObject2.put("bd_did", str);
            jSONObject.putOpt("header", jSONObject2);
            jSONObject.putOpt("local_time", Long.valueOf(System.currentTimeMillis()));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(new JSONObject().put("local_time_ms", System.currentTimeMillis()));
            jSONObject.putOpt("launch", jSONArray);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("ApmHelper", e.getMessage());
        }
        return jSONObject;
    }
}
