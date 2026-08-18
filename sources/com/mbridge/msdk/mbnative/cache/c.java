package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map<Integer, b<String, List<Campaign>>> f1415a = new HashMap();

    public static b<String, List<Campaign>> a(int i) {
        if (f1415a.containsKey(Integer.valueOf(i))) {
            return f1415a.get(Integer.valueOf(i));
        }
        a aVar = new a(i);
        f1415a.put(Integer.valueOf(i), aVar);
        return aVar;
    }
}
