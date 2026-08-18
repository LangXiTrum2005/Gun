package com.bykv.vk.openvk.preload.a;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class k extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.bykv.vk.openvk.preload.a.b.g<String, h> f301a = new com.bykv.vk.openvk.preload.a.b.g<>();

    public final void a(String str, h hVar) {
        com.bykv.vk.openvk.preload.a.b.g<String, h> gVar = this.f301a;
        if (hVar == null) {
            hVar = j.f300a;
        }
        gVar.put(str, hVar);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof k) && ((k) obj).f301a.equals(this.f301a);
        }
        return true;
    }

    public final Set<Map.Entry<String, h>> g() {
        return this.f301a.entrySet();
    }

    public final int hashCode() {
        return this.f301a.hashCode();
    }
}
