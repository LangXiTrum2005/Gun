package com.apm.insight.b;

import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.apm.insight.runtime.r;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    private static int r = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f68a;
    private int b;
    private volatile int c;
    private int d;
    private int e;
    private f f;
    private long g;
    private long h;
    private int i;
    private long j;
    private String k;
    private String l;
    private com.apm.insight.b.e m;
    private volatile boolean n;
    private boolean o;
    private final r p;
    private volatile boolean q;
    private Runnable s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f71a;
        long b;
        long c;
        boolean d;
        int e;
        StackTraceElement[] f;

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f72a;
        private int b;

        public final void a(a aVar) {
            throw null;
        }
    }

    public interface c {
    }

    public static class d {
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f73a;
        long b;
        long c;
        int d;
        int e;
        long f;
        long g;
        String h;
        public String i;
        private String j;
        private d k;

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(NotificationCompat.CATEGORY_MESSAGE, g.a(this.h));
                jSONObject.put("cpuDuration", this.g);
                jSONObject.put("duration", this.f);
                jSONObject.put("type", this.d);
                jSONObject.put("count", this.e);
                jSONObject.put("messageCount", this.e);
                jSONObject.put("lastDuration", this.b - this.c);
                jSONObject.put("start", this.f73a);
                jSONObject.put(TtmlNode.END, this.b);
                jSONObject.put("block_uuid", (Object) null);
                jSONObject.put("sblock_uuid", (Object) null);
                jSONObject.put("belong_frame", false);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return jSONObject;
        }

        public final void b() {
            this.d = -1;
            this.e = -1;
            this.f = -1L;
            this.h = null;
            this.j = null;
            this.k = null;
            this.i = null;
        }
    }

    public g() {
        this((byte) 0);
    }

    public static /* synthetic */ b c() {
        return null;
    }

    public static /* synthetic */ r e() {
        return null;
    }

    private g(byte b2) {
        this.b = 0;
        this.c = 0;
        this.d = 100;
        this.e = 200;
        this.g = -1L;
        this.h = -1L;
        this.i = -1;
        this.j = -1L;
        this.n = false;
        this.o = false;
        this.q = false;
        this.s = new Runnable() { // from class: com.apm.insight.b.g.2
            private long b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private long f70a = 0;
            private int c = -1;
            private int d = 0;
            private int e = 0;

            @Override // java.lang.Runnable
            public final void run() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (g.c().f72a != null) {
                    throw null;
                }
                a aVar = new a((byte) 0);
                if (this.c == g.this.c) {
                    this.d++;
                } else {
                    this.d = 0;
                    this.e = 0;
                    this.b = jUptimeMillis;
                }
                this.c = g.this.c;
                int i = this.d;
                if (i > 0 && i - this.e >= g.r && this.f70a != 0 && jUptimeMillis - this.b > 700 && g.this.q) {
                    aVar.f = Looper.getMainLooper().getThread().getStackTrace();
                    this.e = this.d;
                }
                aVar.d = g.this.q;
                aVar.c = (jUptimeMillis - this.f70a) - 300;
                aVar.f71a = jUptimeMillis;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                this.f70a = jUptimeMillis2;
                aVar.b = jUptimeMillis2 - jUptimeMillis;
                aVar.e = g.this.c;
                g.e().a(g.this.s, 300L);
                g.c().a(aVar);
            }
        };
        this.f68a = new c() { // from class: com.apm.insight.b.g.1
        };
        this.p = null;
    }

    public static /* synthetic */ int d(g gVar) {
        int i = gVar.b;
        gVar.b = i + 1;
        return i;
    }

    public final JSONArray b() {
        JSONArray jSONArray = new JSONArray();
        try {
            int i = 0;
            for (e eVar : this.f.a()) {
                if (eVar != null) {
                    i++;
                    jSONArray.put(eVar.a().put("id", i));
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }

    public final void a() {
        if (this.n) {
            return;
        }
        this.n = true;
        this.d = 100;
        this.e = 300;
        this.f = new f(100);
        this.m = new com.apm.insight.b.e() { // from class: com.apm.insight.b.g.3
            @Override // com.apm.insight.b.e
            public final boolean a() {
                return true;
            }

            @Override // com.apm.insight.b.e
            public final void b(String str) {
                super.b(str);
                g.d(g.this);
                g.a(g.this, false, com.apm.insight.b.e.f66a);
                g gVar = g.this;
                gVar.k = gVar.l;
                g.this.l = "no message running";
                g.this.q = false;
            }

            @Override // com.apm.insight.b.e
            public final void a(String str) {
                g.this.q = true;
                g.this.l = str;
                super.a(str);
                g.a(g.this, true, com.apm.insight.b.e.f66a);
            }
        };
        h.a();
        h.a(this.m);
        j.a(j.a());
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f74a;
        private int b;
        private e c;
        private List<e> d = new ArrayList();

        public f(int i) {
            this.f74a = i;
        }

        public final e a(int i) {
            e eVar = this.c;
            if (eVar != null) {
                eVar.d = i;
                this.c = null;
                return eVar;
            }
            e eVar2 = new e();
            eVar2.d = i;
            return eVar2;
        }

        public final void a(e eVar) {
            int size = this.d.size();
            int i = this.f74a;
            if (size < i) {
                this.d.add(eVar);
                this.b = this.d.size();
                return;
            }
            int i2 = this.b % i;
            this.b = i2;
            e eVar2 = this.d.set(i2, eVar);
            eVar2.b();
            this.c = eVar2;
            this.b++;
        }

        public final List<e> a() {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            if (this.d.size() == this.f74a) {
                for (int i2 = this.b; i2 < this.d.size(); i2++) {
                    arrayList.add(this.d.get(i2));
                }
                while (i < this.b - 1) {
                    arrayList.add(this.d.get(i));
                    i++;
                }
            } else {
                while (i < this.d.size()) {
                    arrayList.add(this.d.get(i));
                    i++;
                }
            }
            return arrayList;
        }
    }

    private void a(int i, long j, String str) {
        a(i, j, str, true);
    }

    private void a(int i, long j, String str, boolean z) {
        this.o = true;
        e eVarA = this.f.a(i);
        eVarA.f = j - this.g;
        if (z) {
            long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            eVarA.g = jCurrentThreadTimeMillis - this.j;
            this.j = jCurrentThreadTimeMillis;
        } else {
            eVarA.g = -1L;
        }
        eVarA.e = this.b;
        eVarA.h = str;
        eVarA.i = this.k;
        eVarA.f73a = this.g;
        eVarA.b = j;
        eVarA.c = this.h;
        this.f.a(eVarA);
        this.b = 0;
        this.g = j;
    }

    public final e a(long j) {
        e eVar = new e();
        eVar.h = this.l;
        eVar.i = this.k;
        eVar.f = j - this.h;
        eVar.g = a(this.i) - this.j;
        eVar.e = this.b;
        return eVar;
    }

    public static String a(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "unknown message";
        }
        try {
            String[] strArrSplit = str.split(":");
            String str3 = strArrSplit.length == 2 ? strArrSplit[1] : "";
            if (str.contains("{") && str.contains("}")) {
                str2 = str.split("\\{")[0];
                try {
                    str = str2 + str.split("\\}")[1];
                } catch (Throwable unused) {
                    return str2;
                }
            } else {
                str2 = str;
            }
            if (str.contains("@")) {
                String[] strArrSplit2 = str.split("@");
                if (strArrSplit2.length > 1) {
                    str = strArrSplit2[0];
                }
            }
            if (str.contains("(") && str.contains(")") && !str.endsWith(" null")) {
                String[] strArrSplit3 = str.split("\\(");
                if (strArrSplit3.length > 1) {
                    str = strArrSplit3[1];
                }
                str = str.replace(")", "");
            }
            if (str.startsWith(" ")) {
                str = str.replace(" ", "");
            }
            return str + str3;
        } catch (Throwable unused2) {
            return str;
        }
    }

    private static long a(int i) {
        if (i < 0) {
            return 0L;
        }
        try {
            return com.apm.insight.runtime.f.a(i);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static /* synthetic */ void a(g gVar, boolean z, long j) {
        int i = gVar.c + 1;
        gVar.c = i;
        gVar.c = i & 65535;
        gVar.o = false;
        if (gVar.g < 0) {
            gVar.g = j;
        }
        if (gVar.h < 0) {
            gVar.h = j;
        }
        if (gVar.i < 0) {
            gVar.i = Process.myTid();
            gVar.j = SystemClock.currentThreadTimeMillis();
        }
        long j2 = j - gVar.g;
        int i2 = gVar.e;
        if (j2 > i2) {
            long j3 = gVar.h;
            if (j - j3 <= i2) {
                gVar.a(9, j, gVar.l);
            } else if (z) {
                if (gVar.b == 0) {
                    gVar.a(1, j, "no message running");
                } else {
                    gVar.a(9, j3, gVar.k);
                    gVar.a(1, j, "no message running", false);
                }
            } else if (gVar.b == 0) {
                gVar.a(8, j, gVar.l, true);
            } else {
                gVar.a(9, j3, gVar.k, false);
                gVar.a(8, j, gVar.l, true);
            }
        }
        gVar.h = j;
    }
}
