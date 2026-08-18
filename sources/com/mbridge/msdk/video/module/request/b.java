package com.mbridge.msdk.video.module.request;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b extends a {
    public b(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.video.module.request.a, com.mbridge.msdk.foundation.same.net.wrapper.c
    public void addExtraParams(String str, e eVar) {
        super.addExtraParams(str, eVar);
        if (AbstractC3888ke0.f(h.b()) != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (TextUtils.isEmpty(jSONObject.toString())) {
                    return;
                }
                String strB = i0.b(jSONObject.toString());
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                eVar.a("dvi", strB);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
