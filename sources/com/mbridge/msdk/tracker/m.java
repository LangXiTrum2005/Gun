package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class m {
    private static final ConcurrentHashMap<String, m> b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f2034a;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                u.a().b();
                m.this.f2034a.p().b();
            } catch (Exception unused) {
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ e f2036a;
        final /* synthetic */ JSONObject b;

        public b(e eVar, JSONObject jSONObject) {
            this.f2036a = eVar;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m.this.f2034a.g().a(this.f2036a);
                JSONObject jSONObject = this.b;
                if (jSONObject != null) {
                    jSONObject.put("session_id", m.this.d());
                    long[] jArrE = m.this.e();
                    this.b.put("track_time", jArrE[0]);
                    this.b.put("track_count", jArrE[1]);
                    this.f2036a.a(this.b);
                }
                this.f2036a.b(m.this.f2034a.b().f);
                m.this.f2034a.g().b(this.f2036a);
            } catch (Exception unused) {
            }
        }
    }

    private m(String str, Context context, x xVar) {
        k kVar = new k(str, this);
        this.f2034a = kVar;
        kVar.a(context);
        kVar.a(xVar);
    }

    public static m[] b() {
        ConcurrentHashMap<String, m> concurrentHashMap = b;
        m[] mVarArr = new m[concurrentHashMap.size()];
        try {
            Iterator<Map.Entry<String, m>> it = concurrentHashMap.entrySet().iterator();
            int i = 0;
            while (it.hasNext()) {
                mVarArr[i] = it.next().getValue();
                i++;
            }
        } catch (Exception unused) {
        }
        return mVarArr;
    }

    public JSONObject c() {
        return this.f2034a.o();
    }

    public String d() {
        return this.f2034a.s();
    }

    public long[] e() {
        return this.f2034a.g().a();
    }

    public String f() {
        return this.f2034a.v();
    }

    public boolean g() {
        return !this.f2034a.w();
    }

    public String h() {
        return g() ? d() : this.f2034a.x();
    }

    public static m a(String str, Context context, x xVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, m> concurrentHashMap = b;
        m mVar = concurrentHashMap.get(str);
        if (!y.b(mVar)) {
            return mVar;
        }
        m mVar2 = new m(str, context, xVar);
        concurrentHashMap.put(str, mVar2);
        return mVar2;
    }

    public void c(e eVar) {
        d(eVar);
    }

    public void d(e eVar) {
        if (this.f2034a.w() || eVar == null || !b(eVar)) {
            return;
        }
        JSONObject jSONObjectD = eVar.d();
        if (jSONObjectD != null && !jSONObjectD.has("ts")) {
            try {
                jSONObjectD.put("ts", System.currentTimeMillis());
            } catch (Exception unused) {
            }
        }
        try {
            this.f2034a.h().a(new b(eVar, jSONObjectD));
        } catch (Exception unused2) {
        }
    }

    private boolean b(e eVar) {
        if (y.b(eVar) || TextUtils.isEmpty(eVar.b())) {
            return false;
        }
        return this.f2034a.a(eVar);
    }

    public void a() {
        try {
            this.f2034a.h().a(new a());
        } catch (Exception unused) {
        }
    }

    public void a(JSONObject jSONObject) {
        this.f2034a.a(jSONObject);
    }

    public boolean a(String str) {
        return a(new e(str));
    }

    public boolean a(e eVar) {
        try {
            return b(eVar);
        } catch (Exception unused) {
            return false;
        }
    }
}
