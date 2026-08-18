package com.mbridge.msdk.dycreator.viewobserver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends com.mbridge.msdk.dycreator.observable.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<Object> f1100a = new ArrayList();
    protected ConcurrentHashMap<Integer, Object> b = new ConcurrentHashMap<>();

    public synchronized void a(Object obj, int i) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.b.put(Integer.valueOf(i), obj);
            }
        }
    }

    public synchronized void a() {
        this.b.clear();
    }
}
