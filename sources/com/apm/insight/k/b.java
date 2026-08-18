package com.apm.insight.k;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.n;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.q;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.umeng.crash.UCrashCallback;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B30;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static volatile b b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f115a;
    private C0011b f;
    private HashMap<String, C0011b> g;
    private List<File> c = new ArrayList();
    private List<File> d = new ArrayList();
    private int e = -1;
    private volatile boolean h = false;
    private Runnable i = new Runnable() { // from class: com.apm.insight.k.b.1
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.f();
        }
    };
    private Runnable j = new Runnable() { // from class: com.apm.insight.k.b.2
        @Override // java.lang.Runnable
        public final void run() throws Throwable {
            b.this.d();
        }
    };

    /* JADX INFO: renamed from: com.apm.insight.k.b$b, reason: collision with other inner class name */
    public static class C0011b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f121a;
        a d;
        a e;
        List<a> b = new ArrayList();
        List<a> c = new ArrayList();
        boolean f = false;
        int g = 0;

        public C0011b(String str) {
            this.f121a = str;
        }
    }

    private b(Context context) {
        this.f115a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() throws Throwable {
        if (this.h || this.g == null) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f115a)) {
            e();
        }
        if (this.e == -1) {
            if (com.apm.insight.runtime.a.a() && com.apm.insight.runtime.a.f()) {
                this.e = 1;
            } else {
                this.e = 0;
            }
        }
        boolean z = this.e == 1;
        com.apm.insight.runtime.g gVar = new com.apm.insight.runtime.g(this.f115a);
        Iterator<C0011b> it = this.g.values().iterator();
        while (it.hasNext()) {
            b(it.next(), z, gVar);
        }
        Iterator<C0011b> it2 = this.g.values().iterator();
        while (it2.hasNext()) {
            a(it2.next(), z, gVar);
        }
        Iterator<C0011b> it3 = this.g.values().iterator();
        while (it3.hasNext()) {
            com.apm.insight.l.f.a(com.apm.insight.l.j.a(this.f115a, it3.next().f121a));
        }
        gVar.a();
        com.apm.insight.runtime.b.a();
        e();
    }

    private void e() {
        this.h = true;
        this.g = null;
        NativeImpl.j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() throws Throwable {
        if (this.h) {
            return;
        }
        if (!com.apm.insight.l.k.b(this.f115a) || (System.currentTimeMillis() - com.apm.insight.e.j() <= 5000 && com.apm.insight.e.i().isApmExists() && !Npth.hasCrash())) {
            n.a().a(this.i, 5000L);
        } else {
            d();
        }
    }

    private void g() {
        File[] fileArrListFiles = com.apm.insight.l.j.i(this.f115a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            if (file.getName().endsWith(".atmp")) {
                com.apm.insight.a.a.a();
                file.getAbsolutePath();
            } else {
                try {
                    com.apm.insight.f.b bVarC = com.apm.insight.l.f.c(file.getAbsolutePath());
                    if (bVarC != null) {
                        if (bVarC.b() != null) {
                            bVarC.b().put("upload_scene", "launch_scan");
                        }
                        if (e.a(e.d(), bVarC.e(), bVarC.d(), bVarC.f(), bVarC.g())) {
                            com.apm.insight.l.f.a(file);
                            String strC = bVarC.c();
                            if (!TextUtils.isEmpty(strC)) {
                                com.apm.insight.l.f.a(new File(strC));
                            }
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                }
            }
        }
    }

    public static b a() {
        if (b == null) {
            synchronized (b.class) {
                try {
                    if (b == null) {
                        b = new b(com.apm.insight.e.g());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return b;
    }

    public final void b() {
        try {
            if (!this.h && com.apm.insight.l.a.c(com.apm.insight.e.g())) {
                n.a().a(this.j);
            }
        } catch (Throwable unused) {
        }
    }

    public final boolean c() {
        return this.h;
    }

    private void b(HashMap<String, C0011b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.d(this.f115a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0011b c0011b = map.get(name);
                    if (c0011b == null) {
                        c0011b = new C0011b(name);
                        map.put(name, c0011b);
                    }
                    c0011b.c.add(new a(file, CrashType.NATIVE));
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        File f120a;
        long b;
        long c;

        @Nullable
        CrashType d;
        String e;

        public a(File file, @Nullable CrashType crashType) {
            this.b = -1L;
            this.c = -1L;
            this.f120a = file;
            this.d = crashType;
            this.e = file.getName();
        }

        public a(File file, long j, @Nullable CrashType crashType) {
            this.c = -1L;
            this.f120a = file;
            this.b = j;
            this.d = crashType;
            this.e = file.getName();
        }
    }

    public final void a(boolean z) throws Throwable {
        if (!Npth.isStopUpload() && z) {
            if (this.f == null) {
                this.f = new C0011b("old_uuid");
                HashMap<String, C0011b> map = new HashMap<>();
                this.g = map;
                a(map);
                a(this.g, this.f);
                com.apm.insight.l.f.a(com.apm.insight.l.j.b(this.f115a));
                b(this.g);
                b(this.f, true, null);
                a(this.f, true, null);
                this.f = null;
                if (this.g.isEmpty()) {
                    e();
                } else {
                    f();
                }
            }
            g();
            com.apm.insight.a.c();
        }
    }

    private void b(final C0011b c0011b, boolean z, @Nullable com.apm.insight.runtime.g gVar) {
        boolean z2;
        if (c0011b.c.size() <= 1 && c0011b.c.isEmpty()) {
            c0011b.e = c0011b.d;
            return;
        }
        boolean zB = com.apm.insight.l.k.b(this.f115a);
        c0011b.e = c0011b.d;
        com.apm.insight.nativecrash.a aVar = new com.apm.insight.nativecrash.a(this.f115a);
        Iterator<a> it = c0011b.c.iterator();
        while (it.hasNext()) {
            a next = it.next();
            final File file = next.f120a;
            try {
                aVar.a(file);
                JSONObject jSONObjectA = a(aVar);
                if (jSONObjectA != null && jSONObjectA.length() != 0) {
                    if (jSONObjectA.length() != 0) {
                        if (!z) {
                            long jOptLong = jSONObjectA.optLong("crash_time");
                            try {
                                a aVar2 = c0011b.e;
                                if (aVar2 == null) {
                                    c0011b.e = next;
                                    c0011b.f = true;
                                    if (gVar == null || gVar.a(MRAIDCommunicatorUtil.STATES_DEFAULT)) {
                                        it = it;
                                        z2 = zB;
                                    } else {
                                        aVar.i();
                                    }
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                                    com.apm.insight.l.f.a(file);
                                } else {
                                    it = it;
                                    try {
                                        if (c0011b.f) {
                                            z2 = zB;
                                        } else {
                                            z2 = zB;
                                            try {
                                                if (jOptLong < aVar2.b) {
                                                    c0011b.e = next;
                                                    if (gVar != null && !gVar.a(MRAIDCommunicatorUtil.STATES_DEFAULT)) {
                                                        aVar.i();
                                                        zB = z2;
                                                        it = it;
                                                    } else {
                                                        a(file);
                                                        c0011b.f = true;
                                                    }
                                                }
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        }
                                        com.apm.insight.entity.a.a(jSONObjectA, "filters", "aid", String.valueOf(jSONObjectA.optJSONObject("header").opt("aid")));
                                        jSONObjectA.optJSONObject("header").put("aid", B30.AD_WILL_CLOSE_VALUE);
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z2 = zB;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z2 = zB;
                            }
                        } else {
                            it = it;
                            z2 = zB;
                            if (gVar != null && !gVar.a(MRAIDCommunicatorUtil.STATES_DEFAULT)) {
                                aVar.i();
                            }
                        }
                        try {
                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "start_uuid", c0011b.f121a);
                            com.apm.insight.entity.a.a(jSONObjectA, "filters", "crash_thread_name", jSONObjectA.optString("crash_thread_name", "unknown"));
                            if (z2) {
                                c.a aVar3 = new c.a(jSONObjectA, CrashType.NATIVE);
                                com.apm.insight.entity.b.a(jSONObjectA, com.apm.insight.entity.b.a(aVar3.c(), aVar3.a(), q.a().b(aVar3.b() == -1 ? System.currentTimeMillis() : aVar3.b())), new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.4
                                    @Override // com.apm.insight.entity.b.a
                                    public final void a(JSONObject jSONObject) {
                                        d.a();
                                        d.a(jSONObject, file, com.apm.insight.l.j.a(b.this.f115a, c0011b.f121a));
                                    }
                                });
                                if (!aVar.i()) {
                                    aVar.f();
                                }
                            }
                            c.a(CrashType.NATIVE, jSONObjectA);
                        } catch (Throwable th4) {
                            th = th4;
                            com.apm.insight.c.a();
                            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                            com.apm.insight.l.f.a(file);
                        }
                    } else {
                        it = it;
                        z2 = zB;
                    }
                    zB = z2;
                    it = it;
                } else {
                    it = it;
                    z2 = zB;
                    aVar.i();
                    zB = z2;
                    it = it;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    private void a(HashMap<String, C0011b> map) {
        File[] fileArrListFiles = com.apm.insight.l.j.f(this.f115a).listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            return;
        }
        for (int i = 0; i < fileArrListFiles.length && i < 5; i++) {
            File file = fileArrListFiles[i];
            try {
                if (!file.isDirectory()) {
                    com.apm.insight.l.f.a(file);
                } else if (file.getName().endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                    String name = file.getName();
                    C0011b c0011b = map.get(name);
                    if (c0011b == null) {
                        c0011b = new C0011b(name);
                        map.put(name, c0011b);
                    }
                    JSONArray jSONArrayA = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.l(file), com.apm.insight.l.j.m(file));
                    int length = jSONArrayA.length();
                    c0011b.g = length;
                    if (length > 0) {
                        try {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.n(file), jSONArrayA);
                        } catch (Throwable unused) {
                        }
                    }
                } else {
                    com.apm.insight.l.f.a(file);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                com.apm.insight.l.f.a(file);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00c4  */
    private void a(HashMap<String, C0011b> map, C0011b c0011b) {
        byte b2;
        CrashType crashType;
        File[] fileArrListFiles = com.apm.insight.l.j.a(this.f115a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        Arrays.sort(fileArrListFiles, Collections.reverseOrder());
        char c = 0;
        int i = 0;
        while (i < fileArrListFiles.length) {
            File file = fileArrListFiles[i];
            try {
                if (com.apm.insight.e.a.a().a(file.getAbsolutePath())) {
                    com.apm.insight.l.f.a(file);
                } else if (!com.apm.insight.l.f.e(file) && !com.apm.insight.g.a.a().b(file.getName())) {
                    if (file.isFile()) {
                        com.apm.insight.l.f.a(file);
                    } else {
                        String name = file.getName();
                        if (name.endsWith(RequestConfiguration.MAX_AD_CONTENT_RATING_G)) {
                            String[] strArrSplit = name.split("_");
                            if (strArrSplit.length < 5) {
                                c0011b.b.add(new a(file, null));
                            } else {
                                try {
                                    long j = Long.parseLong(strArrSplit[c]);
                                    long j2 = Long.parseLong(strArrSplit[4]);
                                    String str = strArrSplit[2];
                                    String str2 = strArrSplit[1];
                                    int iHashCode = str2.hashCode();
                                    if (iHashCode != -1109843021) {
                                        if (iHashCode != 96741) {
                                            if (iHashCode == 3254818 && str2.equals(UCrashCallback.TYPE_JAVA)) {
                                                b2 = 1;
                                            } else {
                                                b2 = -1;
                                            }
                                        } else if (str2.equals(UCrashCallback.TYPE_ANR)) {
                                            b2 = 2;
                                        } else {
                                            b2 = -1;
                                        }
                                    } else if (str2.equals("launch")) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    if (b2 == 0) {
                                        crashType = CrashType.LAUNCH;
                                    } else if (b2 != 1) {
                                        crashType = b2 != 2 ? null : CrashType.ANR;
                                    } else {
                                        crashType = CrashType.JAVA;
                                    }
                                    C0011b c0011b2 = map.get(str);
                                    if (c0011b2 == null) {
                                        c0011b2 = new C0011b(str);
                                        map.put(str, c0011b2);
                                    }
                                    a aVar = new a(file, j, crashType);
                                    aVar.c = j2;
                                    a aVar2 = c0011b2.d;
                                    if ((aVar2 == null || aVar2.b > aVar.b) && crashType != null && crashType != CrashType.ANR && !name.contains("ignore")) {
                                        c0011b2.d = aVar;
                                    }
                                    c0011b2.b.add(aVar);
                                } catch (Throwable unused) {
                                    c0011b.b.add(new a(file, null));
                                    com.apm.insight.c.a();
                                    com.apm.insight.runtime.k.a(new RuntimeException("err format crashTime:".concat(name)), "NPTH_CATCH");
                                }
                            }
                        } else {
                            com.apm.insight.l.f.a(file);
                        }
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
            }
            i++;
            c = 0;
        }
    }

    private static JSONObject a(com.apm.insight.nativecrash.a aVar) {
        JSONObject jSONObjectB = aVar.b();
        if (jSONObjectB != null && jSONObjectB.length() != 0) {
            return jSONObjectB;
        }
        if (com.apm.insight.e.d()) {
            aVar.j();
        }
        if (!aVar.a()) {
            aVar.i();
            return null;
        }
        if (!aVar.d()) {
            aVar.i();
            return null;
        }
        if (aVar.e()) {
            aVar.i();
            return null;
        }
        aVar.c();
        return aVar.h();
    }

    private void a(final C0011b c0011b, boolean z, @Nullable com.apm.insight.runtime.g gVar) {
        Iterator<a> it;
        final File file;
        CrashType crashType;
        if (c0011b.b.isEmpty()) {
            return;
        }
        if (c0011b.e == null) {
            c0011b.e = c0011b.d;
        }
        for (Iterator<a> it2 = c0011b.b.iterator(); it2.hasNext(); it2 = it) {
            a next = it2.next();
            try {
                File file2 = next.f120a;
                CrashType crashType2 = next.d;
                it = it2;
                try {
                    final com.apm.insight.f.b bVarA = a(file2, crashType2, c0011b.f121a, next.b, next.c);
                    if (bVarA == null) {
                        com.apm.insight.l.f.a(file2);
                    } else {
                        JSONObject jSONObjectB = bVarA.b();
                        if (jSONObjectB == null) {
                            com.apm.insight.l.f.a(file2);
                        } else {
                            JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                            if (jSONObjectOptJSONObject == null) {
                                com.apm.insight.l.f.a(file2);
                            } else {
                                if (crashType2 == null) {
                                    file = file2;
                                    if (new File(file, file2.getName()).exists() || file.getName().split("_").length < 5) {
                                        if (e.b(bVarA.a(), jSONObjectB.toString()).a()) {
                                            com.apm.insight.l.f.a(file);
                                        }
                                    }
                                } else {
                                    file = file2;
                                }
                                File fileA = com.apm.insight.entity.b.a(file);
                                if (!fileA.exists()) {
                                    com.apm.insight.l.f.a(file);
                                } else {
                                    try {
                                        JSONArray jSONArray = new JSONArray(com.apm.insight.l.f.a(fileA, "\n"));
                                        JSONObject jSONObjectOptJSONObject2 = crashType2 == CrashType.LAUNCH ? ((JSONArray) jSONObjectB.opt("data")).optJSONObject(0) : jSONObjectB;
                                        if ((!z && c0011b.e != next) || next.e.contains("ignore")) {
                                            try {
                                                com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "aid", String.valueOf(jSONObjectOptJSONObject.opt("aid")));
                                                crashType = crashType2;
                                                try {
                                                    com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "has_ignore", String.valueOf(next.e.contains("ignore")));
                                                    jSONObjectOptJSONObject.put("aid", B30.AD_WILL_CLOSE_VALUE);
                                                } catch (Throwable th) {
                                                    th = th;
                                                    com.apm.insight.c.a();
                                                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                crashType = crashType2;
                                            }
                                        } else {
                                            crashType = crashType2;
                                            if (gVar != null && !gVar.a(jSONObjectOptJSONObject2.optString("crash_md5", MRAIDCommunicatorUtil.STATES_DEFAULT))) {
                                                com.apm.insight.l.f.a(next.f120a);
                                            }
                                        }
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "start_uuid", c0011b.f121a);
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "leak_threads_count", String.valueOf(c0011b.g));
                                        com.apm.insight.entity.a.a(jSONObjectOptJSONObject2, "filters", "crash_thread_name", jSONObjectOptJSONObject2.optString("crash_thread_name", "unknown"));
                                        try {
                                            com.apm.insight.entity.b.a(jSONObjectB, jSONArray, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.k.b.3
                                                @Override // com.apm.insight.entity.b.a
                                                public final void a(JSONObject jSONObject) {
                                                    e.a(bVarA.a(), jSONObject.toString(), new File(file, "logZip"), com.apm.insight.l.j.a(b.this.f115a, c0011b.f121a));
                                                }
                                            });
                                            if (!com.apm.insight.l.f.a(file)) {
                                                com.apm.insight.e.a.a().a(com.apm.insight.d.a.b(file.getAbsolutePath()));
                                            }
                                            c.a(crashType, jSONObjectB);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            com.apm.insight.c.a();
                                            com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                                            com.apm.insight.l.f.a(next.f120a);
                                        }
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    com.apm.insight.c.a();
                    com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                    com.apm.insight.l.f.a(next.f120a);
                }
            } catch (Throwable th5) {
                th = th5;
                it = it2;
            }
        }
    }

    private static boolean a(File file) {
        String[] list = file.list();
        if (list == null) {
            return false;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str) && str.endsWith("")) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private com.apm.insight.f.b a(File file, CrashType crashType, String str, long j, long j2) {
        com.apm.insight.f.b bVar;
        try {
            try {
                if (file.isFile()) {
                    com.apm.insight.l.f.a(file);
                    return null;
                }
                boolean z = crashType == CrashType.LAUNCH;
                if (crashType == null) {
                    try {
                        return com.apm.insight.l.f.b(new File(file, file.getName()).getAbsolutePath());
                    } catch (Throwable th) {
                        th = th;
                        bVar = null;
                        com.apm.insight.l.f.a(file);
                        com.apm.insight.c.a();
                        com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
                        return bVar;
                    }
                }
                com.apm.insight.f.b bVarA = com.apm.insight.l.f.a(file, crashType);
                try {
                    JSONObject jSONObjectB = bVarA.b();
                    if (bVarA.b() != null) {
                        if (crashType == CrashType.ANR) {
                            return bVarA;
                        }
                        jSONObjectB.put("crash_time", j);
                        jSONObjectB.put("app_start_time", j2);
                        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject("header");
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = Header.a(j).f();
                        } else if (z) {
                            jSONObjectB.remove("header");
                        }
                        String strOptString = jSONObjectOptJSONObject.optString("sdk_version_name", null);
                        if (strOptString == null) {
                            strOptString = "1.3.8.nourl-rc.1";
                        }
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "sdk_version", strOptString);
                        JSONArray jSONArrayOptJSONArray = jSONObjectB.optJSONArray("logcat");
                        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                            jSONObjectB.put("logcat", com.apm.insight.runtime.i.a(str));
                        }
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_dump", "true");
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_logcat", String.valueOf(!com.apm.insight.a.a(jSONObjectB, "logcat")));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "memory_leak", String.valueOf(com.apm.insight.entity.a.a(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "fd_leak", String.valueOf(com.apm.insight.entity.a.b(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "threads_leak", String.valueOf(com.apm.insight.entity.a.c(str)));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_devices", String.valueOf(Header.a()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_64_runtime", String.valueOf(NativeImpl.f()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_x86_devices", String.valueOf(Header.b()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(str).exists()));
                        com.apm.insight.entity.a.a(jSONObjectB, "filters", "is_root", String.valueOf(com.apm.insight.nativecrash.a.k()));
                        jSONObjectB.put("launch_did", com.apm.insight.i.a.a(this.f115a));
                        jSONObjectB.put("crash_uuid", file.getName());
                        jSONObjectB.put("jiffy", o.a.a());
                        try {
                            long j3 = Long.parseLong(com.apm.insight.runtime.b.a(j, str));
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", Math.abs(j3 - j) < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS ? "< 60s" : "> 60s");
                            jSONObjectB.put("lastAliveTime", String.valueOf(j3));
                        } catch (Throwable unused) {
                            jSONObjectB.put("lastAliveTime", "unknown");
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "lastAliveTime", "unknown");
                        }
                        jSONObjectB.put("has_dump", "true");
                        if (jSONObjectB.opt("storage") == null) {
                            com.apm.insight.e.g();
                            com.apm.insight.entity.a.a(jSONObjectB, com.apm.insight.l.n.a());
                        }
                        if (Header.b(jSONObjectOptJSONObject)) {
                            com.apm.insight.entity.a.a(jSONObjectB, "filters", "unauthentic_version", "unauthentic_version");
                        }
                        com.apm.insight.entity.d.b(jSONObjectB);
                        bVarA.b().put("upload_scene", "launch_scan");
                        if (z) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObjectB.put("event_type", "start_crash");
                            jSONObjectB.put("stack", jSONObjectB.remove("data"));
                            jSONObject.put("data", new JSONArray().put(jSONObjectB));
                            jSONObject.put("header", jSONObjectOptJSONObject);
                            bVarA.a(jSONObject);
                        } else {
                            jSONObjectB.put("isJava", 1);
                        }
                    } else {
                        com.apm.insight.l.f.a(file);
                    }
                    return bVarA;
                } catch (Throwable th2) {
                    th = th2;
                    bVar = bVarA;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            bVar = null;
        }
        com.apm.insight.l.f.a(file);
        com.apm.insight.c.a();
        com.apm.insight.runtime.k.a(th, "NPTH_CATCH");
        return bVar;
    }
}
