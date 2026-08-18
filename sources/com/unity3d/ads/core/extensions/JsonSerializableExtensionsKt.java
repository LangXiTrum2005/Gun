package com.unity3d.ads.core.extensions;

import com.unity3d.services.store.JsonSerializable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public final class JsonSerializableExtensionsKt {
    public static final JSONArray toJsonArray(List<? extends JsonSerializable> list) {
        AbstractC2995aW.q(list, "<this>");
        JSONArray jSONArray = new JSONArray();
        Iterator<? extends JsonSerializable> it = list.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJson());
        }
        return jSONArray;
    }
}
