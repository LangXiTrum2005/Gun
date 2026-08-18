package com.mbridge.msdk.foundation.same.report.metrics;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class c implements Serializable, Cloneable {
    private int A;
    private CampaignEx B;
    private CopyOnWriteArrayList<CampaignEx> C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1244a;
    private Map<String, Map<String, String>> b;
    private Map<String, Map<String, String>> c;
    private Map<String, Long> d;
    private com.mbridge.msdk.foundation.error.b e;
    private String f;
    private CopyOnWriteArrayList<CampaignEx> g;
    private String h;
    private int i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private String q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private int y;
    private int z;

    public c() {
        this.f1244a = false;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = "";
        this.g = new CopyOnWriteArrayList<>();
        this.r = -1;
        this.t = false;
        this.v = false;
        this.C = new CopyOnWriteArrayList<>();
    }

    public boolean A() {
        return this.v;
    }

    public boolean B() {
        return this.u;
    }

    public boolean C() {
        return this.f1244a;
    }

    public void a(boolean z) {
        this.t = z;
    }

    public void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (!this.C.isEmpty()) {
                        this.C.clear();
                    }
                    this.C.addAll(list);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public String c() {
        return this.p;
    }

    @NonNull
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void d(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String str2 = this.f + str;
            Map<String, Map<String, String>> map = this.b;
            if (map == null || !map.containsKey(str2)) {
                return;
            }
            this.b.remove(str2);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void e(int i) {
        this.r = i;
    }

    public String f() {
        return this.j;
    }

    public List<CampaignEx> g() {
        return this.g;
    }

    public void h(String str) {
        this.f = str;
    }

    public void i(String str) {
        this.q = str;
    }

    public List<CampaignEx> j() {
        return this.C;
    }

    public void k(String str) {
        this.n = str;
    }

    public int l() {
        return this.r;
    }

    public void m(String str) {
        this.h = str;
    }

    public String n() {
        return this.o;
    }

    public String o() {
        return this.f;
    }

    public com.mbridge.msdk.foundation.error.b p() {
        return this.e;
    }

    public Map<String, Map<String, String>> q() {
        return this.c;
    }

    public Map<String, Map<String, String>> r() {
        return this.b;
    }

    public String s() {
        return this.q;
    }

    public String t() {
        return this.k;
    }

    public String u() {
        return this.n;
    }

    public String v() {
        return this.l;
    }

    public int w() {
        return this.A;
    }

    public String x() {
        Map<String, String> map;
        if (!TextUtils.isEmpty(this.h)) {
            return this.h;
        }
        try {
            if (TextUtils.isEmpty(this.h)) {
                String str = this.f + this.q;
                Map<String, Map<String, String>> map2 = this.b;
                if (map2 != null && map2.containsKey(str) && (map = this.b.get(str)) != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                    this.h = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return this.h;
    }

    public String y() {
        return this.m;
    }

    public boolean z() {
        return this.t;
    }

    public void a(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.isEmpty()) {
                    return;
                }
                if (!this.g.isEmpty()) {
                    this.g.clear();
                }
                this.g.addAll(list);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void c(String str) {
        if (this.d == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.d.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public void e(String str) {
        this.p = str;
    }

    public void f(String str) {
        this.j = str;
    }

    public void g(String str) {
        this.o = str;
    }

    public CampaignEx i() {
        return this.B;
    }

    public void j(String str) {
        this.k = str;
    }

    public int k() {
        return this.z;
    }

    public void l(String str) {
        this.l = str;
    }

    public int m() {
        return this.s;
    }

    public void n(String str) {
        this.m = str;
    }

    public int e() {
        return this.y;
    }

    public void f(int i) {
        this.s = i;
    }

    public void g(int i) {
        this.A = i;
    }

    public void c(boolean z) {
        this.u = z;
    }

    public void c(int i) {
        this.y = i;
    }

    public Map<String, String> b(String str) {
        com.mbridge.msdk.foundation.error.b bVarP;
        com.mbridge.msdk.foundation.error.b bVarP2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        e eVar = new e();
        try {
            this.q = str;
            eVar.a("ts", Long.valueOf(System.currentTimeMillis()));
            if (!TextUtils.isEmpty(x())) {
                eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, x());
            }
            if (this.i != 0) {
                eVar.a("adtp", Integer.valueOf(a()));
            }
            if (!TextUtils.isEmpty(n())) {
                eVar.a(CampaignEx.JSON_KEY_HB, n());
            }
            if (!TextUtils.isEmpty(f())) {
                eVar.a("bid_tk", f());
            }
            if (!TextUtils.isEmpty(str)) {
                eVar.a("key", str);
            }
            if (Arrays.asList(b.f1243a).contains(str)) {
                eVar.a("from_cache", z() ? "1" : "2");
            }
            if ("2000047".contains(str) && (bVarP2 = p()) != null) {
                eVar.a("type", Integer.valueOf(bVarP2.c()));
                eVar.a("reason", bVarP2.h());
                if (!TextUtils.isEmpty(bVarP2.i())) {
                    eVar.a("reason_d", bVarP2.i());
                    eVar.a("type_d", Integer.valueOf(bVarP2.l()));
                }
            }
            if ("2000048".contains(str) && (bVarP = p()) != null && !TextUtils.isEmpty(bVarP.i())) {
                eVar.a("type", Integer.valueOf(bVarP.l()));
                eVar.a("reason", bVarP.i());
            }
            if (this.i == 296) {
                eVar.a("auto_load", c());
                eVar.a("auto_refresh", Integer.valueOf(b()));
                eVar.a("auto_refresh_interval", Integer.valueOf(e()));
                eVar.a("content_type", Integer.valueOf(k()));
                eVar.a("temp_display_type", Integer.valueOf(w()));
            }
            a(eVar);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return eVar.a();
    }

    public void a(CampaignEx campaignEx) {
        this.B = campaignEx;
        if (campaignEx == null) {
            return;
        }
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.C;
            if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
                for (int i = 0; i < this.C.size(); i++) {
                    if (this.C.get(i) != null && this.C.get(i).getId().equals(campaignEx.getId())) {
                        this.C.set(i, campaignEx);
                        break;
                    }
                }
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.g;
            if (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.isEmpty()) {
                return;
            }
            for (int i2 = 0; i2 < this.g.size(); i2++) {
                if (this.g.get(i2) != null && this.g.get(i2).getId().equals(campaignEx.getId())) {
                    this.g.set(i2, campaignEx);
                    return;
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void d(boolean z) {
        this.w = z;
    }

    public void d(int i) {
        this.z = i;
    }

    public c(boolean z) {
        this.f1244a = false;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.f = "";
        this.g = new CopyOnWriteArrayList<>();
        this.r = -1;
        this.t = false;
        this.v = false;
        this.C = new CopyOnWriteArrayList<>();
        this.f1244a = z;
    }

    public int a() {
        return this.i;
    }

    public void a(int i) {
        this.i = i;
    }

    public void a(String str, e eVar) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f + str;
            Map<String, Map<String, String>> map2 = this.b;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.b.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.b.put(str2, eVar.a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str, e eVar, int i) {
        Map<String, String> map;
        if (TextUtils.isEmpty(str) || eVar == null) {
            return;
        }
        try {
            String str2 = this.f + "_" + i + "_" + str;
            Map<String, Map<String, String>> map2 = this.c;
            if (map2 != null) {
                if (map2.containsKey(str2) && (map = this.c.get(str2)) != null) {
                    map.putAll(eVar.a());
                } else {
                    this.c.put(str2, eVar.a());
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    private void a(e eVar) {
        if ("2000126".equals(this.q)) {
            String strA = com.mbridge.msdk.foundation.same.net.d.a(f());
            if (eVar != null) {
                eVar.a("dns_ty", Integer.valueOf(com.mbridge.msdk.setting.e.a().a(strA)));
                eVar.a("dns_hs", strA);
            }
        }
    }

    public long a(String str) {
        Map<String, Long> map;
        try {
            if (TextUtils.isEmpty(str) || (map = this.d) == null || !map.containsKey(str)) {
                return 0L;
            }
            Long l = this.d.get(str);
            return System.currentTimeMillis() - (l != null ? l.longValue() : 0L);
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return 0L;
            }
            e.printStackTrace();
            return 0L;
        }
    }

    public void b(boolean z) {
        this.v = z;
    }

    public int b() {
        return this.x;
    }

    public void b(int i) {
        this.x = i;
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        this.e = bVar;
    }
}
