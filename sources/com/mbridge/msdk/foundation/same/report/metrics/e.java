package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f1246a = new HashMap();

    public void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (!(obj instanceof String)) {
                this.f1246a.put(str, obj + "");
            } else if (!TextUtils.isEmpty((String) obj)) {
                this.f1246a.put(str, (String) obj);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public Object b(String str) {
        return this.f1246a.get(str);
    }

    public void c(String str) {
        if (this.f1246a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f1246a.remove(str);
    }

    public boolean a(String str) {
        return this.f1246a.containsKey(str);
    }

    public Map<String, String> a() {
        return this.f1246a;
    }

    public void a(e eVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (eVar == null || (map = eVar.f1246a) == null || (map2 = this.f1246a) == null) {
            return;
        }
        map2.putAll(map);
    }

    public void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f1246a.putAll(map);
    }
}
