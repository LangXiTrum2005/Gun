package com.unity3d.services.core.misc;

import com.unity3d.services.core.log.DeviceLog;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class JsonFlattener {
    private final JSONObject _jsonData;

    public JsonFlattener(JSONObject jSONObject) {
        this._jsonData = jSONObject;
    }

    private boolean shouldIncludeKey(String str, List<String> list, List<String> list2) {
        if (!list2.contains(str) && list.size() > 0) {
            return list.contains(str);
        }
        return false;
    }

    public JSONObject flattenJson(String str, JsonFlattenerRules jsonFlattenerRules) {
        return jsonFlattenerRules == null ? new JSONObject() : flattenJson(str, jsonFlattenerRules.getTopLevelToInclude(), jsonFlattenerRules.getReduceKeys(), jsonFlattenerRules.getSkipKeys());
    }

    public JSONObject flattenJson(String str, List<String> list, List<String> list2, List<String> list3) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        JSONObject jSONObject = new JSONObject();
        try {
            Iterator<String> itKeys = this._jsonData.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (shouldIncludeKey(next, list, list3)) {
                    Object objOpt = this._jsonData.opt(next);
                    if (objOpt instanceof JSONObject) {
                        new JsonFlattener((JSONObject) objOpt).flattenJson(str, next, jSONObject, list2, list3);
                    } else {
                        jSONObject.put(next, objOpt);
                    }
                }
            }
        } catch (JSONException e) {
            DeviceLog.error("Could not flatten JSON: %s", e.getMessage());
        }
        return jSONObject;
    }

    public void flattenJson(String str, String str2, JSONObject jSONObject, List<String> list, List<String> list2) throws JSONException {
        Iterator<String> itKeys = this._jsonData.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!list2.contains(next)) {
                Object obj = this._jsonData.get(next);
                String strI = list.contains(next) ? str2 : DM.i(str2, str, next);
                if (obj instanceof JSONObject) {
                    new JsonFlattener((JSONObject) obj).flattenJson(str, strI, jSONObject, list, list2);
                } else {
                    jSONObject.put(strI, obj);
                }
            }
        }
    }
}
