package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.h;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.f;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.interstitialvideo.out.MBInterstitialVideoHandler;
import com.mbridge.msdk.out.MBRewardVideoHandler;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.j;
import com.umeng.analytics.pro.bc;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class d {
    private static volatile d l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1123a;
    private Map<String, Object> b;
    private FastKV c;
    private boolean d = false;
    private String e;
    private String f;
    private String g;
    private Context h;
    private String i;
    private com.mbridge.msdk.preload.a j;
    private String k;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1124a;

        public a(Context context) {
            this.f1124a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            k0.h(this.f1124a);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            d.this.g();
            d.this.d();
            Looper.loop();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.a(dVar.e);
            new h(d.this.h).a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.d$d, reason: collision with other inner class name */
    public class C0164d implements com.mbridge.msdk.foundation.controller.a.e {
        public C0164d() {
        }
    }

    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1128a;

        public e(String str) {
            this.f1128a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(350L);
            } catch (InterruptedException e) {
                o0.b("SDKController", e.getMessage());
            }
            new j().b(d.this.h, this.f1128a, d.this.f);
        }
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            com.mbridge.msdk.timer.b.class.getDeclaredMethod("start", new Class[0]).invoke(com.mbridge.msdk.timer.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]), new Object[0]);
        } catch (Throwable th) {
            o0.b("SDKController", th.getMessage(), th);
        }
    }

    public boolean e() {
        return true;
    }

    public void f() {
    }

    private void c() {
        com.mbridge.msdk.foundation.controller.c.n().b(this.h);
        com.mbridge.msdk.foundation.controller.c.n().e(this.e);
        com.mbridge.msdk.foundation.controller.c.n().f(this.f);
        com.mbridge.msdk.foundation.controller.c.n().d(this.k);
        com.mbridge.msdk.foundation.controller.c.n().b(this.g);
        com.mbridge.msdk.foundation.controller.c.n().c(new C0164d());
        try {
            com.mbridge.msdk.foundation.same.net.utils.d.h().j();
        } catch (Throwable th) {
            o0.b("SDKController", th.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        List<com.mbridge.msdk.foundation.entity.a> listG;
        Object objNewInstance;
        Object objNewInstance2;
        try {
            g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD == null || (listG = gVarD.g()) == null || listG.size() <= 0) {
                return;
            }
            for (com.mbridge.msdk.foundation.entity.a aVar : listG) {
                if (aVar.a() == 287) {
                    if (this.h != null && (objNewInstance = MBInterstitialVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                        MBInterstitialVideoHandler.class.getMethod("loadFormSelfFilling", new Class[0]).invoke(objNewInstance, new Object[0]);
                    }
                } else if (aVar.a() == 94 && (objNewInstance2 = MBRewardVideoHandler.class.getConstructor(String.class, String.class).newInstance("", aVar.b())) != null) {
                    MBRewardVideoHandler.class.getMethod("loadFormSelfFilling", new Class[0]).invoke(objNewInstance2, new Object[0]);
                }
            }
        } catch (Throwable th) {
            o0.b("SDKController", th.getMessage());
        }
    }

    public void b() {
        a(this.h.getApplicationContext());
        try {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new b());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new c());
            com.mbridge.msdk.foundation.same.report.j.b();
        } catch (Exception unused) {
            o0.b("SDKController", "get app setting failed");
        }
        this.d = true;
    }

    public static d a() {
        if (l == null) {
            synchronized (d.class) {
                try {
                    if (l == null) {
                        l = new d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return l;
    }

    public void b(String str) {
        if (this.j == null) {
            this.j = new com.mbridge.msdk.preload.a();
        }
        try {
            Map<String, Object> map = this.b;
            if (map == null || map.size() <= 0 || !this.b.containsKey(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)) {
                return;
            }
            int iIntValue = ((Integer) this.b.get(MBridgeConstans.PROPERTIES_LAYOUT_TYPE)).intValue();
            if (iIntValue == 0) {
                this.j.a(this.b, this.f1123a);
                return;
            }
            if (1 == iIntValue) {
                this.j.a(this.b);
            } else if (2 != iIntValue) {
                o0.b("SDKController", "unknow layout type in preload");
            } else {
                this.j.b(this.b);
            }
        } catch (Exception e2) {
            o0.b("SDKController", e2.getMessage());
        }
    }

    public void a(Map map, Context context) {
        Object obj;
        if (context != null) {
            if (!TextUtils.isEmpty(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE)) {
                com.mbridge.msdk.foundation.controller.c.n().c(MBridgeConstans.DEVELOPER_CUSTOM_PACKAGE);
            } else if (map.containsKey(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME) && (obj = map.get(MBridgeConstans.KEY_MBRIDGE_CUSTOM_PACKAGE_NAME)) != null) {
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    com.mbridge.msdk.foundation.controller.c.n().c(str);
                }
            }
            if (map != null) {
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPID)) {
                    this.e = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPID);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_APPKEY)) {
                    this.f = (String) map.get(MBridgeConstans.ID_MBRIDGE_APPKEY);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_WX_APPID)) {
                    this.k = (String) map.get(MBridgeConstans.ID_MBRIDGE_WX_APPID);
                }
                if (map.containsKey(MBridgeConstans.PACKAGE_NAME_MANIFEST)) {
                    this.g = (String) map.get(MBridgeConstans.PACKAGE_NAME_MANIFEST);
                }
                if (map.containsKey(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH)) {
                    this.i = (String) map.get(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH);
                }
            }
            this.h = context.getApplicationContext();
            c();
            if (this.d) {
                return;
            }
            b();
            k0.l(context);
            long jX0 = com.mbridge.msdk.setting.h.b().b(this.e).x0();
            if (jX0 != 1300) {
                new Handler(Looper.getMainLooper()).postDelayed(new a(context), jX0);
            }
        }
    }

    private void a(Context context) {
        String string;
        try {
            if (e() && this.c == null) {
                try {
                    this.c = new FastKV.Builder(com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_CONFIG), i0.a("H+tU+FeXHM==")).build();
                } catch (Exception unused) {
                    this.c = null;
                }
            }
            FastKV fastKV = this.c;
            String string2 = "";
            if (fastKV != null) {
                String string3 = fastKV.getString(i0.a("H+tU+bfPhM=="), "");
                String string4 = this.c.getString(i0.a("H+tU+Fz8"), "");
                if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                    com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(bc.aL);
                }
                if (TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                    if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                        return;
                    }
                    this.c.putString(i0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                    this.c.putString(i0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.g);
                    return;
                }
                com.mbridge.msdk.foundation.same.a.V = string3;
                com.mbridge.msdk.foundation.same.a.g = string4;
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(bc.aL, com.mbridge.msdk.foundation.same.a.g);
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences(i0.a("H+tU+FeXHM=="), 0);
            if (sharedPreferences != null) {
                string2 = sharedPreferences.getString(i0.a("H+tU+bfPhM=="), "");
                string = sharedPreferences.getString(i0.a("H+tU+Fz8"), "");
            } else {
                string = "";
            }
            if (TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                com.mbridge.msdk.foundation.same.a.V = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                com.mbridge.msdk.foundation.same.a.g = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(bc.aL);
            }
            if (TextUtils.isEmpty(string2) && TextUtils.isEmpty(string)) {
                if ((TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V) && TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) || sharedPreferences == null) {
                    return;
                }
                SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                editorEdit.putString(i0.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.V);
                editorEdit.putString(i0.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.g);
                editorEdit.apply();
                return;
            }
            com.mbridge.msdk.foundation.same.a.V = string2;
            com.mbridge.msdk.foundation.same.a.g = string;
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
            com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a(bc.aL, com.mbridge.msdk.foundation.same.a.g);
        } catch (Throwable th) {
            o0.b("SDKController", th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        if (com.mbridge.msdk.setting.h.b() == null) {
            return;
        }
        com.mbridge.msdk.setting.h hVarB = com.mbridge.msdk.setting.h.b();
        if (hVarB != null) {
            g gVarD = hVarB.d(str);
            if (gVarD != null) {
                MBridgeConstans.OMID_JS_SERVICE_URL = gVarD.U();
                MBridgeConstans.OMID_JS_H5_URL = gVarD.T();
                if (!TextUtils.isEmpty(gVarD.u())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().i = gVarD.u();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().e();
                }
                if (!TextUtils.isEmpty(gVarD.v())) {
                    com.mbridge.msdk.foundation.same.net.utils.d.h().m = gVarD.v();
                    com.mbridge.msdk.foundation.same.net.utils.d.h().f();
                }
            } else {
                MBridgeConstans.OMID_JS_SERVICE_URL = com.mbridge.msdk.setting.net.b.b;
                MBridgeConstans.OMID_JS_H5_URL = com.mbridge.msdk.setting.net.b.f1811a;
            }
        }
        if (com.mbridge.msdk.setting.h.b().f(str) && com.mbridge.msdk.setting.h.b().a(str, 1, (String) null)) {
            if (com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("is_first_init", 0) == 0) {
                try {
                    com.mbridge.msdk.foundation.buffer.sharedperference.a.b().b("is_first_init", 1);
                    if (TextUtils.isEmpty(f.d())) {
                        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(str));
                    } else {
                        new j().b(this.h, str, this.f);
                    }
                    return;
                } catch (Throwable unused) {
                    new j().b(this.h, str, this.f);
                    return;
                }
            }
            new j().b(this.h, str, this.f);
        }
    }

    public void a(Map<String, Object> map, int i) {
        if (MBridgeSDKFactory.getMBridgeSDK().getStatus() != MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            o0.b("SDKController", "preloaad failed,sdk do not inited");
            return;
        }
        this.b = map;
        this.f1123a = i;
        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
        if (map != null) {
            b(strB);
        }
    }
}
