package com.unity3d.ads.core.extensions;

import com.google.android.gms.ads.AdError;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.A40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class JSONObjectExtensionsKt {
    public static final Map<String, Object> toBuiltInMap(JSONObject jSONObject) {
        AbstractC2995aW.q(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC2995aW.p(itKeys, "keys()");
        InterfaceC4545s40 interfaceC4545s40G0 = A40.G0(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : interfaceC4545s40G0) {
            Object objOpt = jSONObject.opt((String) obj);
            if (objOpt == null || AbstractC2995aW.i(String.valueOf(objOpt), AdError.UNDEFINED_DOMAIN) || AbstractC2995aW.i(String.valueOf(objOpt), "null")) {
                objOpt = null;
            }
            linkedHashMap.put(obj, objOpt);
        }
        return linkedHashMap;
    }
}
