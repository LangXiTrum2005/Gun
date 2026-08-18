package com.bytedance.sdk.openadsdk.api.init;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.common.JXs;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.act.Lxb;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.lk;
import com.bytedance.sdk.openadsdk.core.sLN;
import com.bytedance.sdk.openadsdk.kqm.LD;
import com.bytedance.sdk.openadsdk.multipro.ZU.ZU;
import com.bytedance.sdk.openadsdk.utils.Ivz;
import com.bytedance.sdk.openadsdk.utils.eK;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PAGInitHelper {
    public static final List<PAGSdk.PAGInitCallback> CALLBACK_LIST = new ArrayList();
    public static float animationScale = 1.0f;

    private static void Lxb(Context context) {
        lk.Lxb(context).Lxb("uuid", eK.Lxb());
    }

    public static void initAPM() {
        if (JXs.Lxb()) {
            return;
        }
        try {
            String strZU = QAg.LD().ZU();
            if (TextUtils.isEmpty(strZU)) {
                return;
            }
            ApmHelper.initApm(kqm.Lxb(), new PAGConfig.Builder().appId(strZU).build());
        } catch (Exception unused) {
        }
    }

    public static void initAnimationScale(Context context) {
        try {
            float f = Settings.System.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f);
            animationScale = f;
            if (f <= 0.0f) {
                animationScale = 1.0f;
            }
        } catch (Throwable unused) {
            animationScale = 1.0f;
        }
    }

    public static void initMemoryData() {
        kqm.ZU();
        ZU.Lxb("ttopenadsdk", "a", 0);
        ZU.Lxb("sp_global_file", "a", 0);
        ZU.Lxb("sp_global_privacy", "a", 0);
        ZU.Lxb("sp_global_app_id", "a", 0);
        ZU.Lxb("sp_global_icon_id", "a", 0);
        ZU.Lxb(LD.Lxb, "a", 0);
        ZU.Lxb("tpl_fetch_model", "a", 0);
        ZU.Lxb("tt_sp", "a", 0);
        ZU.Lxb("tt_sdk_event_net_ad", "a", 0);
        ZU.Lxb("tt_sdk_event_net_state", "a", 0);
        ZU.Lxb("tt_sdk_event_net_trail", "a", 0);
        ZU.Lxb("tt_sdk_event_db_ad", "a", 0);
        ZU.Lxb("tt_sdk_event_db_state", "a", 0);
        ZU.Lxb("tt_sdk_event_db_trail", "a", 0);
        ZU.Lxb("pag_sp_bad_par", "did");
        ZU.Lxb("pag_sp_bad_par", "gaid");
    }

    public static void maybeAsyncInitTask(final Context context) {
        Lxb.Lxb(context);
        Ivz.Lxb();
        le.Lxb(context);
        Lxb(context);
        kqm.JXs();
        String strLxb = sLN.Lxb(context);
        com.bytedance.sdk.openadsdk.core.QAg.lk.LD(strLxb);
        com.bytedance.sdk.openadsdk.ZU.Lxb.ZU.Lxb(strLxb, true);
        com.bytedance.sdk.component.adexpress.Lxb.LD.LD.Lxb();
        com.bytedance.sdk.openadsdk.core.NXR.lk.Lxb.Lxb().LD();
        initAnimationScale(context);
        STP.LD().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.STP.lk.Lxb();
                com.bytedance.sdk.openadsdk.STP.lk.Lxb("android_act", false, new com.bytedance.sdk.openadsdk.STP.LD() { // from class: com.bytedance.sdk.openadsdk.api.init.PAGInitHelper.1.1
                    @Override // com.bytedance.sdk.openadsdk.STP.LD
                    public com.bytedance.sdk.openadsdk.STP.Lxb.lk getLogStats() throws Exception {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("act", Lxb.LD(context));
                            jSONObject.put("api_available", Lxb.LD());
                            jSONObject.put("act_signals_callback_available", Lxb.lk());
                            jSONObject.put("act_event", Lxb.Lxb());
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.sLN.Lxb("AsyncInitTask", "run: ", th);
                        }
                        return com.bytedance.sdk.openadsdk.STP.Lxb.ZU.LD().Lxb("android_act").LD(jSONObject.toString());
                    }
                });
            }
        }, WorkRequest.MIN_BACKOFF_MILLIS);
    }
}
