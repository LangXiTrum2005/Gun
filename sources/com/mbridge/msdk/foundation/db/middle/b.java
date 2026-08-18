package com.mbridge.msdk.foundation.db.middle;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.k;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.buffer.a f1144a;
    private k b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f1145a;
        final /* synthetic */ com.mbridge.msdk.foundation.same.buffer.a b;

        public a(boolean z, com.mbridge.msdk.foundation.same.buffer.a aVar) {
            this.f1145a = z;
            this.b = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!this.f1145a || b.this.b == null) {
                return;
            }
            for (String str : this.b.a()) {
                b.this.b.a(str, b.this.f1144a.a(str));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.db.middle.b$b, reason: collision with other inner class name */
    public static class C0165b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static b f1146a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    private b() {
        this.f1144a = new com.mbridge.msdk.foundation.same.buffer.a(1000);
        try {
            k kVarA = k.a(g.a(c.n().d()));
            this.b = kVarA;
            a(kVarA.a(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            com.mbridge.msdk.foundation.same.buffer.a aVar = new com.mbridge.msdk.foundation.same.buffer.a(100);
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                this.f1144a.a(next, jSONObjectOptJSONObject);
                aVar.a(next, jSONObjectOptJSONObject);
            }
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(z, aVar));
        }
    }

    public JSONArray b() {
        return new JSONArray((Collection) this.f1144a.a());
    }

    public static b a() {
        return C0165b.f1146a;
    }

    public JSONObject a(String str) {
        k kVar;
        JSONObject jSONObjectA = this.f1144a.a(str);
        if (jSONObjectA != null || (kVar = this.b) == null) {
            return jSONObjectA;
        }
        JSONObject jSONObjectB = kVar.b(str);
        if (jSONObjectB != null) {
            this.f1144a.a(str, jSONObjectB);
        }
        return jSONObjectB;
    }
}
