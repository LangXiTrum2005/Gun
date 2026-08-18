package com.bytedance.sdk.openadsdk.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.sLN;
import com.bytedance.sdk.openadsdk.core.CSn;
import com.bytedance.sdk.openadsdk.core.QAg;
import com.bytedance.sdk.openadsdk.core.STP;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TTDelegateActivity extends TTBaseActivity {
    private static final Map<String, com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb> lk = Collections.synchronizedMap(new HashMap());
    private CSn LD;
    private Intent Lxb;

    private void LD() {
        Window window = getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.alpha = 0.0f;
        window.setAttributes(attributes);
    }

    private void lk() {
        int intExtra = this.Lxb.getIntExtra("type", 0);
        if (intExtra != 1) {
            if (intExtra != 6) {
                finish();
                return;
            }
            Lxb(this.Lxb.getStringExtra("ext_info"), this.Lxb.getStringExtra("filter_words"), this.Lxb.getStringExtra("closed_listener_key"), this.Lxb.getStringExtra("creative_info"));
        }
    }

    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!STP.JXs()) {
            finish();
            return;
        }
        LD();
        this.Lxb = getIntent();
        if (kqm.Lxb() == null) {
            kqm.LD(this);
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        CSn cSn = this.LD;
        if (cSn != null) {
            cSn.LD();
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (kqm.Lxb() == null) {
            kqm.LD(this);
        }
        setIntent(intent);
        this.Lxb = intent;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        CSn cSn = this.LD;
        if ((cSn == null || ((com.bytedance.sdk.openadsdk.lk.lk) cSn).Lxb == null || !((com.bytedance.sdk.openadsdk.lk.lk) cSn).Lxb.isShowing()) && this.Lxb != null) {
            lk();
        }
    }

    public static void Lxb(tD tDVar, String str, com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb lxb) {
        if (tDVar == null) {
            return;
        }
        Intent intent = new Intent(kqm.Lxb(), (Class<?>) TTDelegateActivity.class);
        intent.addFlags(268435456);
        intent.putExtra("type", 6);
        intent.putExtra("ext_info", tDVar.Lv());
        intent.putExtra("filter_words", com.bytedance.sdk.openadsdk.tool.Lxb.Lxb(tDVar.Wi()));
        intent.putExtra("creative_info", tDVar.JD().toString());
        intent.putExtra("closed_listener_key", str);
        if (lxb != null) {
            if (com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                QAg.LD().Lxb(str, lxb);
            } else {
                lk.put(str, lxb);
            }
        }
        com.bytedance.sdk.component.utils.LD.Lxb(kqm.Lxb(), intent, null);
    }

    public static void Lxb(tD tDVar, String str) {
        Lxb(tDVar, str, null);
    }

    private void Lxb(String str, String str2, final String str3, String str4) {
        if (str2 != null && str != null && this.LD == null) {
            com.bytedance.sdk.openadsdk.lk.lk lkVar = new com.bytedance.sdk.openadsdk.lk.lk(this, str, com.bytedance.sdk.openadsdk.tool.Lxb.Lxb(str2), str4, "other");
            this.LD = lkVar;
            lkVar.Lxb(str3);
            this.LD.Lxb(new CSn.Lxb() { // from class: com.bytedance.sdk.openadsdk.activity.TTDelegateActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.CSn.Lxb
                public void Lxb(int i, String str5) {
                    com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb lxbJXs;
                    if (TTDelegateActivity.lk != null && TTDelegateActivity.lk.size() > 0 && !TextUtils.isEmpty(str3) && !com.bytedance.sdk.openadsdk.multipro.LD.lk()) {
                        com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb lxb = (com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb) TTDelegateActivity.lk.get(str3);
                        if (lxb != null) {
                            lxb.Lxb();
                        }
                    } else if (!TextUtils.isEmpty(str3) && (lxbJXs = QAg.LD().JXs(str3)) != null) {
                        lxbJXs.Lxb();
                        QAg.LD().lc(str3);
                    }
                    TTDelegateActivity.this.Lxb(str3);
                    TTDelegateActivity.this.finish();
                }

                @Override // com.bytedance.sdk.openadsdk.core.CSn.Lxb
                public void Lxb() {
                    if (!((com.bytedance.sdk.openadsdk.lk.lk) TTDelegateActivity.this.LD).lk()) {
                        TTDelegateActivity.this.Lxb(str3);
                        TTDelegateActivity.this.finish();
                    }
                    ((com.bytedance.sdk.openadsdk.lk.lk) TTDelegateActivity.this.LD).Lxb(false);
                }
            });
        }
        CSn cSn = this.LD;
        if (cSn != null) {
            cSn.Lxb();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Lxb(String str) {
        Map<String, com.bytedance.sdk.openadsdk.core.lk.ZU.Lxb> map = lk;
        if (map == null || TextUtils.isEmpty(str)) {
            return;
        }
        map.remove(str);
        if (sLN.ZU()) {
            map.size();
        }
    }
}
