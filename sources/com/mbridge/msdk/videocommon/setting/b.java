package com.mbridge.msdk.videocommon.setting;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {
    private static ConcurrentHashMap<String, c> c = new ConcurrentHashMap<>();
    public static com.mbridge.msdk.videocommon.setting.a d = null;
    private static volatile b e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile boolean f2405a = false;
    private CopyOnWriteArrayList<String> b = new CopyOnWriteArrayList<>();

    public class a implements H5DownLoadManager.ZipDownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2406a;
        final /* synthetic */ String b;

        public a(String str, String str2) {
            this.f2406a = str;
            this.b = str2;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            j.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f2406a, this.b, 2, str2);
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z) {
            j.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f2406a, this.b, 1, "");
        }
    }

    private b() {
    }

    public static b b() {
        if (e == null) {
            synchronized (b.class) {
                try {
                    if (e == null) {
                        e = new b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return e;
    }

    public void a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.b.add(str);
        } catch (Exception unused) {
        }
    }

    public com.mbridge.msdk.videocommon.setting.a c() {
        com.mbridge.msdk.videocommon.setting.a aVar = d;
        if (aVar != null) {
            return aVar;
        }
        String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + com.mbridge.msdk.foundation.controller.c.n().b());
        if (TextUtils.isEmpty(strA)) {
            f(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
            return a();
        }
        com.mbridge.msdk.videocommon.setting.a aVarA = com.mbridge.msdk.videocommon.setting.a.a(strA);
        if (!a(aVarA)) {
            return aVarA;
        }
        f(com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c());
        return a();
    }

    public c d(String str, String str2) {
        c cVar;
        boolean zA;
        String strM = AbstractC5044xl.m("reward_", str, "_", str2);
        if (!c.containsKey(strM)) {
            c cVarA = c.a(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strM));
            if (a(cVarA)) {
                a(str, com.mbridge.msdk.foundation.controller.c.n().c(), str2, null);
                return null;
            }
            c.put(strM, cVarA);
            return cVarA;
        }
        try {
            cVar = c.get(strM);
            try {
                zA = a(cVar);
            } catch (Exception unused) {
                zA = false;
            }
        } catch (Exception unused2) {
            cVar = null;
        }
        if (zA) {
            a(str, com.mbridge.msdk.foundation.controller.c.n().c(), str2, null);
        }
        return cVar;
    }

    public boolean e() {
        return this.f2405a;
    }

    public void f(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.b.remove(str);
        } catch (Exception unused) {
        }
    }

    public void g(String str, String str2) {
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(AbstractC3888ke0.i("reward_", str), str2);
        d = com.mbridge.msdk.videocommon.setting.a.a(str2);
    }

    public void h(String str, String str2) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str + "_" + str2);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            a(str, str2, jSONObject.toString());
        } catch (Throwable th) {
            o0.b("RewardSettingManager", th.getMessage());
        }
    }

    public boolean e(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.b.contains(str);
    }

    public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.net.c cVar) {
        try {
            if (!TextUtils.isEmpty(str3) && !this.b.contains(str3)) {
                a(str3);
                new com.mbridge.msdk.videocommon.net.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3, cVar);
                return;
            }
            o0.a("test_reward_unit_setting", "unitID: " + str3 + " is requesting");
        } catch (Exception unused) {
        }
    }

    public void f(String str, String str2) {
        if (this.f2405a) {
            return;
        }
        this.f2405a = true;
        new com.mbridge.msdk.videocommon.net.a().a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2);
    }

    public c e(String str, String str2) {
        String strM = AbstractC5044xl.m("reward_", str, "_", str2);
        if (c.containsKey(strM)) {
            return c.get(strM);
        }
        c cVarA = c.a(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strM));
        if (cVarA != null) {
            c.put(strM, cVarA);
        }
        return cVarA;
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String strC = b().a(com.mbridge.msdk.foundation.controller.c.n().b(), str, false).c();
        if (TextUtils.isEmpty(strC) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(strC))) {
            return;
        }
        b(strC, str);
    }

    public c a(String str, String str2, boolean z) {
        c cVar;
        boolean zA;
        String strM = AbstractC5044xl.m("reward_", str, "_", str2);
        if (c.containsKey(strM)) {
            try {
                cVar = c.get(strM);
                try {
                    zA = a(cVar);
                } catch (Exception unused) {
                    zA = false;
                }
            } catch (Exception unused2) {
                cVar = null;
            }
            if (zA) {
                a(str, com.mbridge.msdk.foundation.controller.c.n().c(), str2, null);
            }
            return cVar;
        }
        c cVarA = c.a(com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strM));
        if (!a(cVarA)) {
            c.put(strM, cVarA);
            return cVarA;
        }
        if (cVarA != null) {
            return cVarA;
        }
        a(str, com.mbridge.msdk.foundation.controller.c.n().c(), str2, null);
        return a(z);
    }

    public void g(String str) {
        try {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("reward_" + str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(strA);
            jSONObject.put("current_time", System.currentTimeMillis());
            g(str, jSONObject.toString());
        } catch (Throwable th) {
            o0.b("RewardSettingManager", th.getMessage());
        }
    }

    public static boolean c(String str) {
        JSONArray jSONArrayOptJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (jSONArrayOptJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String strOptString = jSONArrayOptJSONArray.optJSONObject(0).optString("unitId");
                if (jSONArrayOptJSONArray.length() > 0 && !TextUtils.isEmpty(strOptString)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, 2, AbstractC3888ke0.i("alert url is exception ,url:", str));
        } else {
            H5DownLoadManager.getInstance().downloadH5Res(new com.mbridge.msdk.foundation.same.report.metrics.c(true), str, new a(str, str2));
        }
    }

    public String c(String str, String str2) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(AbstractC5044xl.m("reward_", str, "_", str2));
    }

    public String d(String str) {
        return com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(AbstractC3888ke0.i("reward_", str));
    }

    public void b(boolean z) {
        this.f2405a = z;
    }

    public com.mbridge.msdk.videocommon.setting.a d() {
        String str = "reward_" + com.mbridge.msdk.foundation.controller.c.n().b();
        if (d == null) {
            String strA = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(str);
            if (!TextUtils.isEmpty(strA)) {
                com.mbridge.msdk.videocommon.setting.a aVarA = com.mbridge.msdk.videocommon.setting.a.a(strA);
                if (aVarA != null) {
                    d = aVarA;
                }
                return aVarA;
            }
        }
        return d;
    }

    public boolean a(com.mbridge.msdk.videocommon.setting.a aVar) {
        if (aVar != null) {
            return aVar.b() + aVar.d() <= System.currentTimeMillis();
        }
        return true;
    }

    public final com.mbridge.msdk.videocommon.setting.a a() {
        com.mbridge.msdk.videocommon.setting.a aVar = new com.mbridge.msdk.videocommon.setting.a();
        HashMap map = new HashMap(5);
        map.put("1", 1000);
        map.put("9", 1000);
        map.put("8", 1000);
        HashMap map2 = new HashMap(3);
        map2.put("1", new com.mbridge.msdk.videocommon.entity.c("Virtual Item", 1));
        aVar.a(map);
        aVar.b(map2);
        aVar.c(43200L);
        aVar.e(5400L);
        aVar.d(3600L);
        aVar.b(3600L);
        aVar.f(5L);
        aVar.a(1);
        return aVar;
    }

    private final boolean a(c cVar) {
        com.mbridge.msdk.videocommon.setting.a aVarC = c();
        if (aVarC == null || cVar == null) {
            return true;
        }
        return cVar.j() + aVarC.h() <= System.currentTimeMillis();
    }

    public void a(String str, String str2, String str3) {
        String strM = AbstractC5044xl.m("reward_", str, "_", str2);
        com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(strM, str3);
        c cVarA = c.a(str3);
        c.put(strM, cVarA);
        if (com.mbridge.msdk.util.b.a() || TextUtils.isEmpty(cVarA.c())) {
            return;
        }
        b(cVarA.c(), str2);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str2))) {
            return;
        }
        b(str2, str);
    }

    public c a(boolean z) {
        c cVar = new c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new com.mbridge.msdk.videocommon.entity.b(1, 30, null));
            cVar.a((List<com.mbridge.msdk.videocommon.entity.b>) arrayList);
            cVar.b(1);
            cVar.e(1);
            cVar.E(1);
            cVar.h(1);
            cVar.u(1);
            cVar.n(1);
            cVar.D(3);
            cVar.C(80);
            cVar.y(100);
            cVar.i(0);
            cVar.o(2);
            cVar.G(-1);
            cVar.p(70);
            cVar.H(2);
            if (z) {
                cVar.I(5);
            } else {
                cVar.I(-1);
            }
            cVar.m(0);
            cVar.A(0);
            cVar.k(1);
            cVar.B(1);
            cVar.f(3);
            ArrayList<Integer> arrayList2 = new ArrayList<>();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.a(arrayList2);
            cVar.q(1);
            cVar.F(1);
            cVar.r(60);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return cVar;
    }
}
