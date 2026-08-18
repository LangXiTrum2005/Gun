package com.mbridge.msdk.tracker.network;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2050a;
    public final byte[] b;
    public final Map<String, String> c;
    public final List<h> d;
    public final boolean e;
    public final long f;

    public r(int i, byte[] bArr, boolean z, long j, List<h> list) {
        this(i, bArr, a(list), list, z, j);
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

    private r(int i, byte[] bArr, Map<String, String> map, List<h> list, boolean z, long j) {
        this.f2050a = i;
        this.b = bArr;
        this.c = map;
        if (list == null) {
            this.d = null;
        } else {
            this.d = Collections.unmodifiableList(list);
        }
        this.e = z;
        this.f = j;
    }
}
