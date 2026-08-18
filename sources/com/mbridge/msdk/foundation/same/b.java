package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    private static volatile b b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Boolean f1178a = null;

    private b() {
    }

    public static b b() {
        if (b == null) {
            synchronized (b.class) {
                try {
                    if (b == null) {
                        b = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    private boolean c() {
        return q0.a().b("new_bridge_reward_show", false, false);
    }

    private boolean d() {
        boolean zB = q0.a().b("new_bridge_reward_video", false, false);
        this.f1178a = Boolean.valueOf(zB);
        return zB;
    }

    public Boolean a() {
        return this.f1178a;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("new_bridge_reward_video")) {
            return d();
        }
        if (str.equals("new_bridge_reward_show")) {
            return c();
        }
        return false;
    }
}
