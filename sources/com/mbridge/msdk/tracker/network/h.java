package com.mbridge.msdk.tracker.network;

import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;

/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f2046a;
    private final String b;

    public h(String str, String str2) {
        this.f2046a = str;
        this.b = str2;
    }

    public final String a() {
        return this.f2046a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return TextUtils.equals(this.f2046a, hVar.f2046a) && TextUtils.equals(this.b, hVar.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.f2046a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.f2046a);
        sb.append(",value=");
        return DM.m(sb, this.b, "]");
    }
}
