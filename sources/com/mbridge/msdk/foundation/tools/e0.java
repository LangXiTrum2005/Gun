package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f1275a;
    private com.mbridge.msdk.setting.j b;
    private long c;
    private final BroadcastReceiver d;
    IntentFilter e;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final e0 f1276a = new e0();
    }

    public static e0 a() {
        return b.f1276a;
    }

    public String b() {
        try {
            if (this.f1275a == null) {
                this.f1275a = new JSONObject();
            }
            if (this.f1275a.length() < 2) {
                try {
                    this.f1275a.put("KEY_INFO", (String) c.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", ""));
                } catch (Exception e) {
                    o0.b("NetAddressManager", e.getMessage());
                }
                try {
                    this.f1275a.put("KEY_TIME", ((Long) c.a(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e2) {
                    o0.b("NetAddressManager", e2.getMessage());
                }
            }
            String strOptString = this.f1275a.optString("KEY_INFO");
            if (TextUtils.isEmpty(strOptString)) {
                return "";
            }
            com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
            return System.currentTimeMillis() - this.f1275a.optLong("KEY_TIME") > (gVarB != null ? gVarB.R() : 3600L) * 1000 ? "" : strOptString;
        } catch (Exception e3) {
            o0.b("NetAddressManager", e3.getMessage());
            return "";
        }
    }

    public void c() {
        Context contextD;
        try {
            if (com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b()).S() != 1 || (contextD = com.mbridge.msdk.foundation.controller.c.n().d()) == null) {
                return;
            }
            IntentFilter intentFilter = new IntentFilter();
            this.e = intentFilter;
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            contextD.registerReceiver(this.d, this.e);
        } catch (Exception e) {
            o0.b("NetAddressManager", e.getMessage());
        }
    }

    public void d() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.c > 3000) {
            if (this.b == null) {
                this.b = new com.mbridge.msdk.setting.j();
            }
            this.b.c(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            this.c = jCurrentTimeMillis;
        }
    }

    public void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
        if (contextD != null) {
            try {
                contextD.unregisterReceiver(this.d);
            } catch (Exception e) {
                o0.b("NetAddressManager", e.getMessage());
            }
        }
    }

    private e0() {
        this.f1275a = new JSONObject();
        this.d = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.e = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    public void a(String str) {
        if (this.f1275a == null) {
            this.f1275a = new JSONObject();
        }
        try {
            if (!this.f1275a.optString("KEY_INFO", "").equals(str)) {
                this.f1275a.put("KEY_INFO", str);
                c.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_INFO", str);
            }
        } catch (Exception e) {
            o0.b("NetAddressManager", e.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f1275a.put("KEY_TIME", jCurrentTimeMillis);
            c.b(com.mbridge.msdk.foundation.controller.c.n().d(), "KEY_TIME", Long.valueOf(jCurrentTimeMillis));
        } catch (Exception e2) {
            o0.b("NetAddressManager", e2.getMessage());
        }
    }
}
