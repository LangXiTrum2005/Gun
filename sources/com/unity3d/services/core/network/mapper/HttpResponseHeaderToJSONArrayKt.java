package com.unity3d.services.core.network.mapper;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpResponseHeaderToJSONArrayKt {
    public static final JSONArray toResponseHeadersMap(Map<String, ? extends List<String>> map) {
        Set<Map.Entry<String, ? extends List<String>>> setEntrySet;
        if (map == null || (setEntrySet = map.entrySet()) == null) {
            return new JSONArray();
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            jSONArray = jSONArray.put(new JSONArray((Collection) AbstractC2340Cl.K((String) entry.getKey(), (List) entry.getValue())));
            AbstractC2995aW.p(jSONArray, "acc.put(JSONArray(listOf(key, value)))");
        }
        return jSONArray;
    }
}
