package com.mbridge.msdk.foundation.controller;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, com.mbridge.msdk.foundation.cache.d> f1121a;

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.b$b, reason: collision with other inner class name */
    public static class C0163b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static b f1122a = new b();
    }

    public static b a() {
        return C0163b.f1122a;
    }

    public com.mbridge.msdk.foundation.cache.d b(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        Exception e;
        if (this.f1121a == null) {
            this.f1121a = new HashMap<>();
        }
        if (this.f1121a.containsKey(str)) {
            return this.f1121a.get(str);
        }
        if (jSONArray == null) {
            try {
                jSONArray2 = new JSONArray();
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("c_cb", 0);
                    jSONObject.put("t_disc", 0.95d);
                    jSONObject.put("u_disc", 0.95d);
                    jSONObject.put("max_ecppv_diff", 0);
                    jSONObject.put("max_cache_num", 20);
                    jSONObject.put("max_usage_limit", 10);
                    jSONObject.put("time_interval", 7200);
                    jSONArray2.put(jSONObject);
                } catch (Exception e2) {
                    e = e2;
                    e.getMessage();
                }
            } catch (Exception e3) {
                jSONArray2 = jSONArray;
                e = e3;
            }
            jSONArray = jSONArray2;
        }
        return a(str, jSONArray);
    }

    private b() {
        this.f1121a = new HashMap<>();
    }

    public com.mbridge.msdk.foundation.cache.d a(String str, JSONArray jSONArray) {
        if (this.f1121a == null) {
            this.f1121a = new HashMap<>();
        }
        if (this.f1121a.containsKey(str)) {
            return this.f1121a.get(str);
        }
        com.mbridge.msdk.foundation.cache.d dVar = new com.mbridge.msdk.foundation.cache.d(str, jSONArray);
        this.f1121a.put(str, dVar);
        return dVar;
    }
}
