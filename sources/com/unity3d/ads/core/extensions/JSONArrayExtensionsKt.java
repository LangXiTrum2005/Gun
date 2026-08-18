package com.unity3d.ads.core.extensions;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4823vD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5175zD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public final class JSONArrayExtensionsKt {
    public static final Map<String, List<String>> getHeadersMap(JSONArray jSONArray) throws JSONException {
        AbstractC2995aW.q(jSONArray, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            AbstractC2995aW.o(obj, "null cannot be cast to non-null type org.json.JSONArray");
            JSONArray jSONArray2 = (JSONArray) obj;
            List arrayList = (List) linkedHashMap.get(jSONArray2.getString(0));
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            String string = jSONArray2.getString(1);
            AbstractC2995aW.p(string, "header.getString(1)");
            arrayList.add(string);
            String string2 = jSONArray2.getString(0);
            AbstractC2995aW.p(string2, "header.getString(0)");
            linkedHashMap.put(string2, arrayList);
        }
        return linkedHashMap;
    }

    public static final Object[] toTypedArray(JSONArray jSONArray) {
        AbstractC2995aW.q(jSONArray, "<this>");
        C5175zD c5175zDF0 = AbstractC3375el.f0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, c5175zDF0));
        Iterator it = c5175zDF0.iterator();
        while (it.hasNext()) {
            arrayList.add(jSONArray.get(((AbstractC4823vD) it).nextInt()));
        }
        return arrayList.toArray(new Object[0]);
    }
}
