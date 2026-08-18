package com.mbridge.msdk.out.reveue;

import android.text.TextUtils;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class MBridgeRevenueParamsEntityForIronSource extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForIronSource(String str, String str2) {
        super(str, str2);
        setMediationName("IronSource");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    public void setIronSourceImpressionDataString(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            setMediationUnitId(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String strB = DM.B("{", str2, "}");
        try {
            setSourceData(strB, strB);
            JSONObject jSONObject = new JSONObject(strB);
            setNetworkName(jSONObject.optString("adNetwork", ""));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("instanceName", jSONObject.optString("instanceName", ""));
            jSONObject2.put("instanceId", jSONObject.optString("instanceId", ""));
            setNetworkInfo(jSONObject2);
            setAdType(jSONObject.optString(OutOfContextTestingActivity.AD_UNIT_KEY, ""));
            setRevenue(jSONObject.optString("revenue", ""));
            setPrecision(jSONObject.optString("precision", ""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
