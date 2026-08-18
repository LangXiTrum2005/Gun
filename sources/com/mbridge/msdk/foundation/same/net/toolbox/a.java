package com.mbridge.msdk.foundation.same.net.toolbox;

import com.mbridge.msdk.tracker.network.h;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f1210a;
    public final List<h> b;
    public final Map<String, String> c;
    public final int d;

    public a(int i, byte[] bArr, List<h> list) {
        this(i, bArr, a(list), list);
    }

    private static Map<String, String> a(List<h> list) {
        if (list == null) {
            return null;
        }
        if (list.isEmpty()) {
            return Collections.emptyMap();
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (h hVar : list) {
            treeMap.put(hVar.a(), hVar.b());
        }
        return treeMap;
    }

    private a(int i, byte[] bArr, Map<String, String> map, List<h> list) {
        this.d = i;
        this.f1210a = bArr;
        this.c = map;
        if (list == null) {
            this.b = null;
        } else {
            this.b = Collections.unmodifiableList(list);
        }
    }
}
