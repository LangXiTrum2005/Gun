package com.apm.insight.b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.Header;
import com.apm.insight.l.m;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.runtime.k;
import com.apm.insight.runtime.o;
import com.apm.insight.runtime.p;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.umeng.analytics.pro.ay;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static volatile boolean z = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f59a;
    private final Context b;
    private volatile boolean c;
    private JSONObject g;
    private JSONObject h;
    private JSONArray m;
    private JSONObject n;
    private JSONArray q;
    private JSONArray r;
    private JSONObject s;
    private boolean t;
    private volatile boolean v;
    private long d = -1;
    private File e = null;
    private boolean f = true;
    private String i = "unknown";
    private String j = "unknown";
    private String k = "unknown";
    private String l = "npth_inner_default";
    private int o = 0;
    private long p = -1;
    private final Object u = new Object();
    private long w = -1;
    private long x = 0;
    private final Runnable y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.g();
            } catch (Throwable th) {
                com.apm.insight.c.a();
                k.a(th, "NPTH_CATCH");
            }
        }
    };
    private int A = 0;
    private List<Pattern> B = null;
    private Pattern C = null;
    private File D = null;

    public b(Context context) {
        this.b = context;
    }

    private boolean h() {
        boolean z2 = !com.apm.insight.l.a.a(this.b);
        if (!z2 || com.apm.insight.runtime.a.b.d().e() > 2000) {
            return z2;
        }
        return false;
    }

    private File i() {
        if (this.D == null) {
            this.D = new File(this.b.getFilesDir(), "has_anr_signal_" + com.apm.insight.l.a.d(this.b).replaceAll(":", "_"));
        }
        return this.D;
    }

    public final void b() {
        if (this.c) {
            this.c = false;
            c cVar = this.f59a;
            if (cVar != null) {
                cVar.b();
            }
            this.f59a = null;
        }
    }

    public final void c() {
        c cVar = this.f59a;
        if (cVar != null) {
            cVar.a();
        }
    }

    public final void d() {
        synchronized (this.u) {
        }
        this.y.run();
    }

    public final void e() {
        if (NativeImpl.h()) {
            try {
                com.apm.insight.l.f.a(i(), String.valueOf(this.A + 1), false);
            } catch (Throwable th) {
                com.apm.insight.c.a();
                k.a(th, "NPTH_CATCH");
            }
        }
        this.w = SystemClock.uptimeMillis();
        this.v = true;
    }

    public final void f() {
        File fileI = i();
        try {
            int iIntValue = Integer.decode(com.apm.insight.l.f.a(fileI.getAbsolutePath(), "\n")).intValue();
            this.A = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.a(false);
            } else {
                NativeImpl.a(true);
            }
        } catch (IOException unused) {
            NativeImpl.a(true);
        } catch (Throwable unused2) {
            com.apm.insight.l.f.a(fileI);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0359  */
    /* JADX WARN: Code duplicated, block: B:101:0x035c  */
    /* JADX WARN: Code duplicated, block: B:104:0x037f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0382  */
    /* JADX WARN: Code duplicated, block: B:108:0x03b3 A[Catch: all -> 0x0241, TRY_LEAVE, TryCatch #2 {all -> 0x0241, blocks: (B:73:0x023b, B:76:0x0245, B:98:0x02b1, B:102:0x035e, B:106:0x0384, B:108:0x03b3, B:113:0x03c2, B:109:0x03bc), top: B:135:0x023b, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x03e2 A[Catch: all -> 0x03e9, TRY_LEAVE, TryCatch #4 {all -> 0x03e9, blocks: (B:117:0x03d4, B:119:0x03e2), top: B:139:0x03d4 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0410 A[Catch: all -> 0x041b, TRY_LEAVE, TryCatch #6 {all -> 0x041b, blocks: (B:120:0x03e9, B:122:0x0410), top: B:143:0x03e9 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x0236 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0143  */
    /* JADX WARN: Code duplicated, block: B:60:0x01c4 A[Catch: all -> 0x01ca, TryCatch #5 {all -> 0x01ca, blocks: (B:58:0x0149, B:60:0x01c4, B:63:0x01cd, B:65:0x01d3, B:68:0x01db, B:70:0x01e2, B:116:0x03cc, B:123:0x041b, B:69:0x01de), top: B:141:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x01d3 A[Catch: all -> 0x01ca, TryCatch #5 {all -> 0x01ca, blocks: (B:58:0x0149, B:60:0x01c4, B:63:0x01cd, B:65:0x01d3, B:68:0x01db, B:70:0x01e2, B:116:0x03cc, B:123:0x041b, B:69:0x01de), top: B:141:0x0149 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0244  */
    /* JADX WARN: Code duplicated, block: B:78:0x0270  */
    /* JADX WARN: Code duplicated, block: B:79:0x0273  */
    /* JADX WARN: Code duplicated, block: B:81:0x027a  */
    /* JADX WARN: Code duplicated, block: B:82:0x027d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0284  */
    /* JADX WARN: Code duplicated, block: B:85:0x0287  */
    /* JADX WARN: Code duplicated, block: B:87:0x028e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0291  */
    /* JADX WARN: Code duplicated, block: B:90:0x0298  */
    /* JADX WARN: Code duplicated, block: B:91:0x029b  */
    /* JADX WARN: Code duplicated, block: B:93:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:94:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:96:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:97:0x02af  */
    public final boolean g() {
        String str;
        String str2;
        JSONArray jSONArrayB;
        JSONArray jSONArrayA;
        JSONObject jSONObject;
        boolean z2;
        JSONObject jSONObjectA;
        boolean z3;
        String str3;
        String str4;
        JSONArray jSONArray;
        final long j;
        JSONObject jSONObjectA2;
        JSONObject jSONObject2;
        com.apm.insight.entity.a aVar;
        JSONObject jSONObject3;
        JSONObject jSONObjectB;
        com.apm.insight.entity.a aVarA;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject4;
        JSONArray jSONArrayA2;
        long j2;
        String str5;
        String str6;
        String str7;
        int i;
        JSONObject jSONObject5;
        boolean zB = com.apm.insight.runtime.j.a().b();
        long jUptimeMillis = SystemClock.uptimeMillis();
        a(jUptimeMillis);
        String strA = d.a(this.b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str8 = "normal";
        TextUtils.isEmpty(strA);
        if (TextUtils.isEmpty(strA)) {
            str = "unknown";
            str2 = "unknown";
            jSONArrayB = null;
            jSONArrayA = null;
            jSONObject = null;
            z2 = false;
            jSONObjectA = null;
            z3 = false;
            str3 = "normal";
            str4 = "unknown";
            jSONArray = null;
            j = jCurrentTimeMillis;
            jSONObjectA2 = null;
        } else {
            synchronized (this.u) {
            }
            if (this.g == null || System.currentTimeMillis() - this.d > 20000) {
                if (this.v) {
                    this.v = false;
                    str8 = "trace_after";
                }
                b(jUptimeMillis);
            } else {
                str8 = "trace_last";
            }
            JSONObject jSONObject6 = this.g;
            String str9 = this.i;
            String str10 = this.j;
            String str11 = this.k;
            JSONArray jSONArray2 = this.m;
            JSONArray jSONArray3 = this.r;
            JSONArray jSONArray4 = this.q;
            JSONObject jSONObject7 = this.s;
            JSONObject jSONObject8 = this.h;
            z3 = this.t;
            long j3 = this.p;
            this.g = null;
            this.m = null;
            this.q = null;
            this.h = null;
            this.r = null;
            this.i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            jSONArrayA = jSONArray4;
            str2 = str11;
            str4 = str9;
            jSONArray = jSONArray2;
            jSONObjectA = jSONObject8;
            jSONObject = jSONObject7;
            jSONArrayB = jSONArray3;
            str = str10;
            str3 = str8;
            j = j3;
            jSONObjectA2 = jSONObject6;
            z2 = true;
        }
        if (TextUtils.isEmpty(strA)) {
            if (this.g == null || System.currentTimeMillis() - this.d <= 20000) {
                if (this.g == null || System.currentTimeMillis() - this.d <= 2000 || !NativeImpl.h()) {
                    return false;
                }
                com.apm.insight.l.f.a(i());
                return false;
            }
            this.g = null;
            this.m = null;
            this.q = null;
            this.h = null;
            this.r = null;
            this.i = "unknown";
            this.j = "unknown";
            this.k = "unknown";
            this.o = 0;
            this.e = null;
            return false;
        }
        if (jSONObjectA2 == null) {
            if (jSONArrayA == null) {
                try {
                    jSONArrayB = f.b().b();
                    jSONArrayA = j.a(jUptimeMillis);
                    jSONObject5 = jSONObjectA2;
                    try {
                        jSONObjectA = f.b().a(jUptimeMillis).a();
                        JSONObject jSONObject9 = new JSONObject();
                        try {
                            com.apm.insight.l.a.a(this.b, jSONObject9);
                            jSONObject = jSONObject9;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject9;
                            jSONObjectA2 = jSONObject5;
                        }
                    } catch (Throwable unused2) {
                        jSONObjectA2 = jSONObject5;
                        jSONObject2 = jSONObjectA;
                        if (jSONObjectA2 != null) {
                            try {
                                jSONObjectA2.put("pid", Process.myPid());
                                jSONObjectA2.put("package", this.b.getPackageName());
                                jSONObjectA2.put("is_remote_process", 0);
                                jSONObjectA2.put("is_new_stack", 10);
                                aVar = new com.apm.insight.entity.a(new JSONObject());
                                String str12 = str2;
                                aVar.a("data", (Object) jSONObjectA2.toString());
                                JSONObject jSONObject10 = jSONObjectA2;
                                aVar.a("is_anr", (Object) 1);
                                aVar.a("anrType", (Object) str3);
                                aVar.a("history_message", (Object) jSONArrayB);
                                aVar.a("current_message", jSONObject2);
                                aVar.a("pending_messages", (Object) jSONArrayA);
                                aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
                                aVar.a("crash_time", Long.valueOf(j));
                                com.apm.insight.c.a.b();
                                aVar.c(jSONObject);
                                aVar.a("anr_info", (Object) strA);
                                if (jSONArray != null) {
                                    aVar.a("dump_trace", (Object) jSONArray);
                                }
                                jSONObject3 = this.n;
                                jSONObjectB = jSONObject3 == null ? m.b((String) null) : m.b((String) null);
                                aVar.a("all_thread_stacks", jSONObjectB);
                                com.apm.insight.runtime.a.f fVarA = com.apm.insight.runtime.a.f.a();
                                CrashType crashType = CrashType.ANR;
                                aVarA = fVarA.a(crashType, aVar);
                                aVarA.a("is_background", Boolean.valueOf(z3));
                                aVarA.a("logcat", (Object) com.apm.insight.runtime.i.a(com.apm.insight.e.f()));
                                aVarA.a("has_dump", (Object) "true");
                                aVarA.a("crash_uuid", (Object) com.apm.insight.e.a(j, crashType, false, false));
                                aVarA.a("jiffy", Long.valueOf(o.a.a()));
                                jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
                                com.apm.insight.entity.d.b(aVarA.c());
                                if (jSONObjectOptJSONObject == null) {
                                    try {
                                        jSONObject4 = new JSONObject();
                                        try {
                                            aVarA.a("filters", jSONObject4);
                                        } catch (Throwable unused3) {
                                            jSONObjectOptJSONObject = jSONObject4;
                                            jSONObject4 = jSONObjectOptJSONObject;
                                        }
                                    } catch (Throwable unused4) {
                                        jSONObject4 = jSONObjectOptJSONObject;
                                    }
                                } else {
                                    jSONObject4 = jSONObjectOptJSONObject;
                                }
                                jSONObject4.put("anrType", str3);
                                jSONObject4.put("max_utm_thread", str4);
                                jSONObject4.put("max_stm_thread", str);
                                jSONObject4.put("max_utm_stm_thread", str12);
                                jSONObject4.put("max_utm_thread_version", this.l);
                                j2 = j - com.apm.insight.e.j();
                                if (j2 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                                    str5 = "0 - 30s";
                                } else if (j2 < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                                    str5 = "30s - 1min";
                                } else if (j2 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                                    str5 = "1min - 2min";
                                } else if (j2 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                                    str5 = "2min - 5min";
                                } else if (j2 < TTAdConstant.AD_MAX_EVENT_TIME) {
                                    str5 = "5min - 10min";
                                } else if (j2 < 1800000) {
                                    str5 = "10min - 30min";
                                } else if (j2 < 3600000) {
                                    str5 = "30min - 1h";
                                } else {
                                    str5 = "1h - ";
                                }
                                jSONObject4.put("crash_length", str5);
                                jSONObject4.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                                jSONObject4.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                                jSONObject4.put("sdk_version", "1.3.8.nourl-rc.1");
                                jSONObject4.put("has_logcat", String.valueOf(aVarA.a()));
                                jSONObject4.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                                jSONObject4.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                                jSONObject4.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                                jSONObject4.put("is_64_devices", String.valueOf(Header.a()));
                                jSONObject4.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                                jSONObject4.put("is_x86_devices", String.valueOf(Header.b()));
                                jSONObject4.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                                if (com.apm.insight.nativecrash.a.k()) {
                                    str6 = "true";
                                } else {
                                    str6 = "false";
                                }
                                jSONObject4.put("is_root", str6);
                                jSONObject4.put("anr_normal_trace", String.valueOf(!this.v));
                                jSONObject4.put("anr_no_run", String.valueOf(zB));
                                if (Npth.hasCrash()) {
                                    str7 = "true";
                                } else {
                                    str7 = "false";
                                }
                                jSONObject4.put("crash_after_crash", str7);
                                jSONObject4.put("from_file", String.valueOf(d.b()));
                                jSONObject4.put("has_dump", "true");
                                jSONObject4.put("from_kill", "false");
                                jSONObject4.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                                i = this.o;
                                if (i > 0) {
                                    jSONObject4.put("may_have_stack_overflow", String.valueOf(i));
                                }
                                try {
                                    a(strA, jSONObject4);
                                } catch (Throwable th) {
                                    com.apm.insight.c.a();
                                    k.a(th, "NPTH_CATCH");
                                }
                                com.apm.insight.a.a.a();
                                CrashType crashType2 = CrashType.LAUNCH;
                                com.apm.insight.e.e();
                                try {
                                    if (com.apm.insight.a.e().length() > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                                        aVarA.a("has_system_traces", "true");
                                    }
                                } catch (Throwable unused5) {
                                }
                                try {
                                    jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                                    jSONObject4.put("leak_threads_count", String.valueOf(jSONArrayA2.length()));
                                    if (jSONArrayA2.length() > 0) {
                                        com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
                                    }
                                } catch (Throwable unused6) {
                                }
                                String strOptString = jSONObject10.optString("mainStackFromTrace");
                                JSONArray jSONArrayA3 = com.apm.insight.entity.b.a(strOptString);
                                com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA3, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.b.b.2
                                    @Override // com.apm.insight.entity.b.a
                                    public final void a(JSONObject jSONObject11) {
                                        com.apm.insight.k.d.a().a(jSONObject11, j, b.this.f);
                                    }
                                });
                                b(strOptString, jSONArrayA3);
                            } catch (Throwable th2) {
                                com.apm.insight.c.a();
                                k.a(th2, "NPTH_CATCH");
                            }
                        }
                        return z2;
                    }
                } catch (Throwable unused7) {
                    jSONObject5 = jSONObjectA2;
                    jSONObjectA2 = jSONObject5;
                    jSONObject2 = jSONObjectA;
                    if (jSONObjectA2 != null) {
                        jSONObjectA2.put("pid", Process.myPid());
                        jSONObjectA2.put("package", this.b.getPackageName());
                        jSONObjectA2.put("is_remote_process", 0);
                        jSONObjectA2.put("is_new_stack", 10);
                        aVar = new com.apm.insight.entity.a(new JSONObject());
                        String str13 = str2;
                        aVar.a("data", (Object) jSONObjectA2.toString());
                        JSONObject jSONObject11 = jSONObjectA2;
                        aVar.a("is_anr", (Object) 1);
                        aVar.a("anrType", (Object) str3);
                        aVar.a("history_message", (Object) jSONArrayB);
                        aVar.a("current_message", jSONObject2);
                        aVar.a("pending_messages", (Object) jSONArrayA);
                        aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
                        aVar.a("crash_time", Long.valueOf(j));
                        com.apm.insight.c.a.b();
                        aVar.c(jSONObject);
                        aVar.a("anr_info", (Object) strA);
                        if (jSONArray != null) {
                            aVar.a("dump_trace", (Object) jSONArray);
                        }
                        jSONObject3 = this.n;
                        if (jSONObject3 == null) {
                        }
                        aVar.a("all_thread_stacks", jSONObjectB);
                        com.apm.insight.runtime.a.f fVarA2 = com.apm.insight.runtime.a.f.a();
                        CrashType crashType3 = CrashType.ANR;
                        aVarA = fVarA2.a(crashType3, aVar);
                        aVarA.a("is_background", Boolean.valueOf(z3));
                        aVarA.a("logcat", (Object) com.apm.insight.runtime.i.a(com.apm.insight.e.f()));
                        aVarA.a("has_dump", (Object) "true");
                        aVarA.a("crash_uuid", (Object) com.apm.insight.e.a(j, crashType3, false, false));
                        aVarA.a("jiffy", Long.valueOf(o.a.a()));
                        jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
                        com.apm.insight.entity.d.b(aVarA.c());
                        if (jSONObjectOptJSONObject == null) {
                            jSONObject4 = new JSONObject();
                            aVarA.a("filters", jSONObject4);
                        } else {
                            jSONObject4 = jSONObjectOptJSONObject;
                        }
                        jSONObject4.put("anrType", str3);
                        jSONObject4.put("max_utm_thread", str4);
                        jSONObject4.put("max_stm_thread", str);
                        jSONObject4.put("max_utm_stm_thread", str13);
                        jSONObject4.put("max_utm_thread_version", this.l);
                        j2 = j - com.apm.insight.e.j();
                        if (j2 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                            str5 = "0 - 30s";
                        } else if (j2 < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                            str5 = "30s - 1min";
                        } else if (j2 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                            str5 = "1min - 2min";
                        } else if (j2 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                            str5 = "2min - 5min";
                        } else if (j2 < TTAdConstant.AD_MAX_EVENT_TIME) {
                            str5 = "5min - 10min";
                        } else if (j2 < 1800000) {
                            str5 = "10min - 30min";
                        } else if (j2 < 3600000) {
                            str5 = "30min - 1h";
                        } else {
                            str5 = "1h - ";
                        }
                        jSONObject4.put("crash_length", str5);
                        jSONObject4.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
                        jSONObject4.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
                        jSONObject4.put("sdk_version", "1.3.8.nourl-rc.1");
                        jSONObject4.put("has_logcat", String.valueOf(aVarA.a()));
                        jSONObject4.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
                        jSONObject4.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
                        jSONObject4.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
                        jSONObject4.put("is_64_devices", String.valueOf(Header.a()));
                        jSONObject4.put("is_64_runtime", String.valueOf(NativeImpl.f()));
                        jSONObject4.put("is_x86_devices", String.valueOf(Header.b()));
                        jSONObject4.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
                        if (com.apm.insight.nativecrash.a.k()) {
                            str6 = "true";
                        } else {
                            str6 = "false";
                        }
                        jSONObject4.put("is_root", str6);
                        jSONObject4.put("anr_normal_trace", String.valueOf(!this.v));
                        jSONObject4.put("anr_no_run", String.valueOf(zB));
                        if (Npth.hasCrash()) {
                            str7 = "true";
                        } else {
                            str7 = "false";
                        }
                        jSONObject4.put("crash_after_crash", str7);
                        jSONObject4.put("from_file", String.valueOf(d.b()));
                        jSONObject4.put("has_dump", "true");
                        jSONObject4.put("from_kill", "false");
                        jSONObject4.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
                        i = this.o;
                        if (i > 0) {
                            jSONObject4.put("may_have_stack_overflow", String.valueOf(i));
                        }
                        a(strA, jSONObject4);
                        com.apm.insight.a.a.a();
                        CrashType crashType4 = CrashType.LAUNCH;
                        com.apm.insight.e.e();
                        if (com.apm.insight.a.e().length() > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                            aVarA.a("has_system_traces", "true");
                        }
                        jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
                        jSONObject4.put("leak_threads_count", String.valueOf(jSONArrayA2.length()));
                        if (jSONArrayA2.length() > 0) {
                            com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
                        }
                        String strOptString2 = jSONObject11.optString("mainStackFromTrace");
                        JSONArray jSONArrayA4 = com.apm.insight.entity.b.a(strOptString2);
                        com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA4, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.b.b.2
                            @Override // com.apm.insight.entity.b.a
                            public final void a(JSONObject jSONObject12) {
                                com.apm.insight.k.d.a().a(jSONObject12, j, b.this.f);
                            }
                        });
                        b(strOptString2, jSONArrayA4);
                    }
                    return z2;
                }
            } else {
                jSONObject5 = jSONObjectA2;
            }
            jSONObjectA2 = d.a();
        }
        jSONObject2 = jSONObjectA;
        if (jSONObjectA2 != null && jSONObjectA2.length() > 0) {
            jSONObjectA2.put("pid", Process.myPid());
            jSONObjectA2.put("package", this.b.getPackageName());
            jSONObjectA2.put("is_remote_process", 0);
            jSONObjectA2.put("is_new_stack", 10);
            aVar = new com.apm.insight.entity.a(new JSONObject());
            String str14 = str2;
            aVar.a("data", (Object) jSONObjectA2.toString());
            JSONObject jSONObject12 = jSONObjectA2;
            aVar.a("is_anr", (Object) 1);
            aVar.a("anrType", (Object) str3);
            aVar.a("history_message", (Object) jSONArrayB);
            aVar.a("current_message", jSONObject2);
            aVar.a("pending_messages", (Object) jSONArrayA);
            aVar.a("anr_time", Long.valueOf(System.currentTimeMillis()));
            aVar.a("crash_time", Long.valueOf(j));
            com.apm.insight.c.a.b();
            aVar.c(jSONObject);
            aVar.a("anr_info", (Object) strA);
            if (jSONArray != null) {
                aVar.a("dump_trace", (Object) jSONArray);
            }
            jSONObject3 = this.n;
            if (jSONObject3 == null && jSONObject3.length() != 0) {
                jSONObjectB = this.n;
            }
            aVar.a("all_thread_stacks", jSONObjectB);
            com.apm.insight.runtime.a.f fVarA3 = com.apm.insight.runtime.a.f.a();
            CrashType crashType5 = CrashType.ANR;
            aVarA = fVarA3.a(crashType5, aVar);
            aVarA.a("is_background", Boolean.valueOf(z3));
            aVarA.a("logcat", (Object) com.apm.insight.runtime.i.a(com.apm.insight.e.f()));
            aVarA.a("has_dump", (Object) "true");
            aVarA.a("crash_uuid", (Object) com.apm.insight.e.a(j, crashType5, false, false));
            aVarA.a("jiffy", Long.valueOf(o.a.a()));
            jSONObjectOptJSONObject = aVarA.c().optJSONObject("filters");
            com.apm.insight.entity.d.b(aVarA.c());
            if (jSONObjectOptJSONObject == null) {
                jSONObject4 = new JSONObject();
                aVarA.a("filters", jSONObject4);
            } else {
                jSONObject4 = jSONObjectOptJSONObject;
            }
            jSONObject4.put("anrType", str3);
            jSONObject4.put("max_utm_thread", str4);
            jSONObject4.put("max_stm_thread", str);
            jSONObject4.put("max_utm_stm_thread", str14);
            jSONObject4.put("max_utm_thread_version", this.l);
            j2 = j - com.apm.insight.e.j();
            if (j2 < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                str5 = "0 - 30s";
            } else if (j2 < ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                str5 = "30s - 1min";
            } else if (j2 < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                str5 = "1min - 2min";
            } else if (j2 < PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                str5 = "2min - 5min";
            } else if (j2 < TTAdConstant.AD_MAX_EVENT_TIME) {
                str5 = "5min - 10min";
            } else if (j2 < 1800000) {
                str5 = "10min - 30min";
            } else if (j2 < 3600000) {
                str5 = "30min - 1h";
            } else {
                str5 = "1h - ";
            }
            jSONObject4.put("crash_length", str5);
            jSONObject4.put("disable_looper_monitor", String.valueOf(com.apm.insight.runtime.a.c()));
            jSONObject4.put("npth_force_apm_crash", String.valueOf(com.apm.insight.c.a.b()));
            jSONObject4.put("sdk_version", "1.3.8.nourl-rc.1");
            jSONObject4.put("has_logcat", String.valueOf(aVarA.a()));
            jSONObject4.put("memory_leak", String.valueOf(com.apm.insight.entity.a.a(com.apm.insight.e.f())));
            jSONObject4.put("fd_leak", String.valueOf(com.apm.insight.entity.a.b(com.apm.insight.e.f())));
            jSONObject4.put("threads_leak", String.valueOf(com.apm.insight.entity.a.c(com.apm.insight.e.f())));
            jSONObject4.put("is_64_devices", String.valueOf(Header.a()));
            jSONObject4.put("is_64_runtime", String.valueOf(NativeImpl.f()));
            jSONObject4.put("is_x86_devices", String.valueOf(Header.b()));
            jSONObject4.put("has_meminfo_file", String.valueOf(com.apm.insight.l.j.d(com.apm.insight.e.f()).exists()));
            if (com.apm.insight.nativecrash.a.k()) {
                str6 = "true";
            } else {
                str6 = "false";
            }
            jSONObject4.put("is_root", str6);
            jSONObject4.put("anr_normal_trace", String.valueOf(!this.v));
            jSONObject4.put("anr_no_run", String.valueOf(zB));
            if (Npth.hasCrash()) {
                str7 = "true";
            } else {
                str7 = "false";
            }
            jSONObject4.put("crash_after_crash", str7);
            jSONObject4.put("from_file", String.valueOf(d.b()));
            jSONObject4.put("has_dump", "true");
            jSONObject4.put("from_kill", "false");
            jSONObject4.put("last_resume_activity", com.apm.insight.runtime.a.b.d().h());
            i = this.o;
            if (i > 0) {
                jSONObject4.put("may_have_stack_overflow", String.valueOf(i));
            }
            a(strA, jSONObject4);
            com.apm.insight.a.a.a();
            CrashType crashType6 = CrashType.LAUNCH;
            com.apm.insight.e.e();
            if (com.apm.insight.a.e().length() > PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID) {
                aVarA.a("has_system_traces", "true");
            }
            jSONArrayA2 = com.apm.insight.nativecrash.b.a(com.apm.insight.l.j.e(com.apm.insight.e.f()), com.apm.insight.l.j.f(com.apm.insight.e.f()));
            jSONObject4.put("leak_threads_count", String.valueOf(jSONArrayA2.length()));
            if (jSONArrayA2.length() > 0) {
                com.apm.insight.l.f.a(com.apm.insight.l.j.g(com.apm.insight.e.f()), jSONArrayA2);
            }
            String strOptString3 = jSONObject12.optString("mainStackFromTrace");
            JSONArray jSONArrayA5 = com.apm.insight.entity.b.a(strOptString3);
            com.apm.insight.entity.b.a(aVarA.c(), jSONArrayA5, new com.apm.insight.entity.b.a() { // from class: com.apm.insight.b.b.2
                @Override // com.apm.insight.entity.b.a
                public final void a(JSONObject jSONObject13) {
                    com.apm.insight.k.d.a().a(jSONObject13, j, b.this.f);
                }
            });
            b(strOptString3, jSONArrayA5);
        }
        return z2;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.f59a = new c(this);
        this.d = com.apm.insight.e.j();
        this.c = true;
    }

    private JSONObject c(@NonNull JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArrayB.length(); i++) {
                sb.append(jSONArrayB.getString(i));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private boolean a(long j) {
        if (this.v) {
            this.v = false;
            b(j);
        }
        return false;
    }

    private void b(long j) {
        if (this.x != this.w) {
            try {
                this.p = System.currentTimeMillis();
                this.r = f.b().b();
                this.q = j.a(j);
                this.h = f.b().a(j).a();
                JSONObject jSONObject = new JSONObject();
                this.s = jSONObject;
                com.apm.insight.l.a.a(this.b, jSONObject);
                this.t = h();
                this.f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.d = this.p;
                String strB = com.apm.insight.l.j.b();
                File file = new File(new File(com.apm.insight.l.j.f(this.b), strB), "trace_" + com.apm.insight.l.a.d(this.b).replace(':', '_') + ".txt");
                file.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                p.a("anr_trace", strB);
                NativeImpl.i(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayA = com.apm.insight.l.f.a(file.getAbsolutePath());
                    this.m = jSONArrayA;
                    a(jSONArrayA);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    com.apm.insight.c.a();
                    k.a(th, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                k.a(th2, "NPTH_CATCH");
            }
            com.apm.insight.a.d();
        } else {
            try {
                this.d = this.p;
                String strB2 = com.apm.insight.l.j.b();
                File file2 = new File(new File(com.apm.insight.l.j.f(this.b), strB2), "trace" + com.apm.insight.l.a.d(this.b).replace(':', '_') + ".txt");
                file2.getParentFile().mkdirs();
                com.apm.insight.l.f.a(file2, com.apm.insight.l.b.a().format(new Date(System.currentTimeMillis())) + "\n", false);
                p.a("anr_trace", strB2);
                NativeImpl.i(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayA2 = com.apm.insight.l.f.a(file2.getAbsolutePath());
                    this.m = jSONArrayA2;
                    a(jSONArrayA2);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    com.apm.insight.c.a();
                    k.a(th3, "NPTH_CATCH");
                }
                if (this.g == null) {
                    this.g = d.a();
                }
            } catch (Throwable th4) {
                com.apm.insight.c.a();
                k.a(th4, "NPTH_CATCH");
            }
        }
        long j2 = this.w;
        this.x = j2;
        this.w = -1L;
        if (j2 == -1) {
            this.x = (-1) - 1;
        }
    }

    private void a(JSONArray jSONArray) {
        int[] iArrB;
        int[] iArrB2;
        if (jSONArray == null) {
            return;
        }
        this.g = null;
        this.n = null;
        this.o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.i = "unknown";
        this.j = "unknown";
        this.k = "unknown";
        int[] iArr = {0, 0, 0};
        JSONArray jSONArray5 = jSONArray4;
        String string = null;
        boolean z2 = false;
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.g == null && "main".equals(string)) {
                        this.g = c(jSONArray5);
                    } else {
                        jSONArray2.put(a(string, jSONArray5));
                    }
                    try {
                        if (!"main".equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = string;
                    if (!a(str)) {
                        try {
                            iArrB2 = b(jSONArray5);
                        } catch (IllegalArgumentException e) {
                            com.apm.insight.c.a();
                            k.a(e, "NPTH_CATCH");
                            iArrB2 = null;
                        } catch (Throwable unused2) {
                            iArrB2 = null;
                        }
                        if (iArrB2 != null) {
                            int i2 = iArrB2[0];
                            if (i2 > iArr[0]) {
                                iArr[0] = i2;
                                this.i = str;
                            }
                            int i3 = iArrB2[1];
                            if (i3 > iArr[1]) {
                                iArr[1] = i3;
                                this.j = str;
                            }
                            int i4 = iArrB2[2];
                            if (i4 > iArr[2]) {
                                iArr[2] = i4;
                                this.k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                string = null;
            } else if (!z2) {
                if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z2 = true;
                }
                jSONArray3.put(strOptString);
            } else if (z2) {
                if (strOptString.contains(" prio=")) {
                    if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                        if (this.g == null && "main".equals(string)) {
                            this.g = c(jSONArray5);
                        } else {
                            jSONArray2.put(a(string, jSONArray5));
                        }
                        try {
                            if (!"main".equals(string)) {
                                string = string.substring(0, string.indexOf(40)).trim();
                            }
                        } catch (Throwable unused3) {
                        }
                        String str2 = string;
                        if (!a(str2)) {
                            try {
                                iArrB = b(jSONArray5);
                            } catch (IllegalArgumentException e2) {
                                com.apm.insight.c.a();
                                k.a(e2, "NPTH_CATCH");
                                iArrB = null;
                            } catch (Throwable unused4) {
                                iArrB = null;
                            }
                            if (iArrB != null) {
                                int i5 = iArrB[0];
                                if (i5 > iArr[0]) {
                                    iArr[0] = i5;
                                    this.i = str2;
                                }
                                int i6 = iArrB[1];
                                if (i6 > iArr[1]) {
                                    iArr[1] = i6;
                                    this.j = str2;
                                }
                                int i7 = iArrB[2];
                                if (i7 > iArr[2]) {
                                    iArr[2] = i7;
                                    this.k = str2;
                                }
                            }
                        }
                    }
                    String strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                    if ("main".equals(strSubstring)) {
                        string = strSubstring;
                    } else {
                        StringBuilder sbQ = DM.q(strSubstring, "  (");
                        sbQ.append(strOptString.substring(strOptString.indexOf(34, 2) + 1));
                        sbQ.append(" )");
                        string = sbQ.toString();
                    }
                    if (jSONArray5.length() > 0) {
                        jSONArray5 = new JSONArray();
                    }
                    jSONArray5.put(strOptString);
                } else if (TextUtils.isEmpty(string)) {
                    jSONArray3.put(strOptString);
                } else {
                    jSONArray5.put(strOptString);
                }
            }
        }
        if (jSONArray2.length() > 0) {
            this.m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.n.put("thread_stacks", jSONArray2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    @Nullable
    private int[] b(@NonNull JSONArray jSONArray) throws IllegalArgumentException {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.C == null) {
                    this.C = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                try {
                    int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                    return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Err stack line: ".concat(strOptString));
                }
            }
        }
        return null;
    }

    private static String b(float f) {
        return a(f / 100.0f);
    }

    private static void b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : com.apm.insight.runtime.m.a().e()) {
            try {
                if (iCrashCallback instanceof com.apm.insight.b) {
                    ((com.apm.insight.b) iCrashCallback).a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                k.a(th, "NPTH_CATCH");
            }
        }
    }

    private boolean a(String str) {
        if (this.B == null) {
            JSONArray jSONArrayB = com.apm.insight.runtime.a.b();
            if (jSONArrayB != null) {
                this.B = new LinkedList();
                this.l = jSONArrayB.optString(0);
                for (int i = 1; i < jSONArrayB.length(); i++) {
                    try {
                        this.B.add(Pattern.compile(jSONArrayB.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.B == null) {
                LinkedList linkedList = new LinkedList();
                this.B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.B.add(Pattern.compile("^default_npth_thread$"));
                this.B.add(Pattern.compile("^RenderThread$"));
                this.B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private JSONObject a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayB = com.apm.insight.a.b(jSONArray);
        if (jSONArrayB.length() != jSONArray.length()) {
            this.o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayB);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:107:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:109:0x0201  */
    /* JADX WARN: Code duplicated, block: B:111:0x0204  */
    /* JADX WARN: Code duplicated, block: B:113:0x0207  */
    /* JADX WARN: Code duplicated, block: B:115:0x020a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0211  */
    /* JADX WARN: Code duplicated, block: B:119:0x0214  */
    /* JADX WARN: Code duplicated, block: B:120:0x0217  */
    /* JADX WARN: Code duplicated, block: B:121:0x021a  */
    /* JADX WARN: Code duplicated, block: B:122:0x021d  */
    /* JADX WARN: Code duplicated, block: B:124:0x0229  */
    /* JADX WARN: Code duplicated, block: B:127:0x0236  */
    /* JADX WARN: Code duplicated, block: B:128:0x0239 A[PHI: r32
  0x0239: PHI (r32v2 char) = (r1v53 char), (r32v15 char) binds: [B:126:0x0234, B:120:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0243  */
    /* JADX WARN: Code duplicated, block: B:131:0x0246 A[PHI: r32
  0x0246: PHI (r32v3 char) = (r32v2 char), (r32v16 char) binds: [B:129:0x0241, B:119:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0250  */
    /* JADX WARN: Code duplicated, block: B:134:0x0253 A[PHI: r32
  0x0253: PHI (r32v4 char) = (r32v3 char), (r32v17 char) binds: [B:132:0x024e, B:118:0x0211] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x025b  */
    /* JADX WARN: Code duplicated, block: B:137:0x025d A[PHI: r32
  0x025d: PHI (r32v13 char) = (r32v4 char), (r32v18 char) binds: [B:135:0x0259, B:116:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:139:0x0265  */
    /* JADX WARN: Code duplicated, block: B:140:0x0267 A[PHI: r32
  0x0267: PHI (r32v5 char) = (r32v13 char), (r32v18 char) binds: [B:138:0x0263, B:116:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x026c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0290  */
    /* JADX WARN: Code duplicated, block: B:148:0x0293  */
    /* JADX WARN: Code duplicated, block: B:155:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:157:0x02c4 A[LOOP:2: B:103:0x01f7->B:157:0x02c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:187:0x0367  */
    /* JADX WARN: Code duplicated, block: B:188:0x036c A[PHI: r3 r9 r21 r27 r28 r29 r30
  0x036c: PHI (r3v18 java.lang.String) = (r3v16 java.lang.String), (r3v2 java.lang.String) binds: [B:186:0x0365, B:162:0x02e0] A[DONT_GENERATE, DONT_INLINE]
  0x036c: PHI (r9v6 java.lang.String) = (r9v5 java.lang.String), (r9v3 java.lang.String) binds: [B:186:0x0365, B:162:0x02e0] A[DONT_GENERATE, DONT_INLINE]
  0x036c: PHI (r21v11 java.lang.String) = (r21v8 java.lang.String), (r21v1 java.lang.String) binds: [B:186:0x0365, B:162:0x02e0] A[DONT_GENERATE, DONT_INLINE]
  0x036c: PHI (r27v4 char) = (r27v3 char), (r27v6 char) binds: [B:186:0x0365, B:162:0x02e0] A[DONT_GENERATE, DONT_INLINE]
  0x036c: PHI (r28v3 java.lang.String) = (r28v1 java.lang.String), (r28v5 java.lang.String) binds: [B:186:0x0365, B:162:0x02e0] A[DONT_GENERATE, DONT_INLINE]
  0x036c: PHI (r29v9 java.util.HashMap) = (r29v7 java.util.HashMap), (r29v12 java.util.HashMap) binds: [B:186:0x0365, B:162:0x02e0] A[DONT_GENERATE, DONT_INLINE]
  0x036c: PHI (r30v9 java.util.HashMap) = (r30v7 java.util.HashMap), (r30v12 java.util.HashMap) binds: [B:186:0x0365, B:162:0x02e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:190:0x0378  */
    /* JADX WARN: Code duplicated, block: B:192:0x038a  */
    /* JADX WARN: Code duplicated, block: B:195:0x038e A[LOOP:4: B:193:0x038b->B:195:0x038e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:214:0x042f  */
    /* JADX WARN: Code duplicated, block: B:215:0x0435  */
    /* JADX WARN: Code duplicated, block: B:218:0x044c  */
    /* JADX WARN: Code duplicated, block: B:219:0x0452  */
    /* JADX WARN: Code duplicated, block: B:222:0x0469  */
    /* JADX WARN: Code duplicated, block: B:224:0x046f  */
    /* JADX WARN: Code duplicated, block: B:243:0x03e1 A[EDGE_INSN: B:243:0x03e1->B:208:0x03e1 BREAK  A[LOOP:0: B:3:0x004f->B:210:0x03f3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:0x02cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:246:0x02d0 A[SYNTHETIC] */
    private void a(String str, JSONObject jSONObject) throws JSONException {
        HashMap map;
        String str2;
        int i;
        char c;
        char c2;
        String str3;
        boolean z2;
        String str4;
        String strTrim;
        String[] strArrSplit;
        int i2;
        String string;
        HashMap map2;
        String str5;
        int i3;
        char c3;
        String str6;
        String[] strArr;
        float fFloatValue;
        String str7 = "tag:";
        SystemClock.uptimeMillis();
        String[] strArrSplit2 = str.split("\n");
        Float fValueOf = Float.valueOf(-1.0f);
        float[] fArr = {-1.0f, -1.0f, -1.0f};
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        int length = strArrSplit2.length;
        String strTrim2 = "unknown";
        String str8 = strTrim2;
        char c4 = 0;
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            if (i4 >= length) {
                map = map6;
                map7 = map7;
                break;
            }
            int i5 = length;
            String strTrim3 = strArrSplit2[i4];
            if (!TextUtils.isEmpty(strTrim3)) {
                if (c4 != 0) {
                    i = i4;
                    if (c4 == 1) {
                        c2 = c4;
                        str3 = str7;
                        map = map6;
                        map7 = map7;
                        strTrim3 = strTrim3.trim();
                        String lowerCase = strTrim3.toLowerCase();
                        if (lowerCase.startsWith("shortmsg")) {
                            strTrim3.substring(strTrim3.indexOf(58));
                            z2 = false;
                        } else {
                            if (lowerCase.startsWith("reason:")) {
                                strTrim3.substring(strTrim3.indexOf(58));
                                z2 = true;
                            } else {
                                if (lowerCase.contains("appfreeze")) {
                                    str8 = "AppFreeze";
                                    c = '\n';
                                }
                                str2 = str3;
                                c = c2;
                            }
                            str2 = str3;
                        }
                        if (lowerCase.contains("input dispatch")) {
                            str4 = "Input dispatching timed out";
                        } else if (lowerCase.contains("broadcast of intent")) {
                            str4 = "Broadcast of Intent";
                        } else {
                            if (lowerCase.contains("executing service")) {
                                if ("null".equalsIgnoreCase(strTrim2)) {
                                    strTrim2 = strTrim3.substring(strTrim3.indexOf("service ") + 8).trim();
                                }
                                str8 = "executing service";
                            } else if (lowerCase.contains("service.startforeground")) {
                                str4 = "not call Service.startForeground";
                            } else {
                                str8 = "unknown";
                            }
                            if (z2) {
                                str2 = str3;
                                c = 2;
                            } else {
                                strTrim = strTrim3.trim();
                                if (strTrim.startsWith("Load:")) {
                                    strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                                    if (3 == strArrSplit.length) {
                                        for (i2 = 0; i2 < strArrSplit.length; i2++) {
                                            fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                                        }
                                    }
                                    str2 = str3;
                                    c = 3;
                                } else {
                                    c = c2;
                                    str2 = str3;
                                }
                            }
                        }
                        str8 = str4;
                        if (z2) {
                            str2 = str3;
                            c = 2;
                        } else {
                            strTrim = strTrim3.trim();
                            if (strTrim.startsWith("Load:")) {
                                strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                                if (3 == strArrSplit.length) {
                                    while (i2 < strArrSplit.length) {
                                        fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                                    }
                                }
                                str2 = str3;
                                c = 3;
                            } else {
                                c = c2;
                                str2 = str3;
                            }
                        }
                    } else if (c4 != 2) {
                        if (c4 != 3) {
                            c2 = c4;
                            str2 = str7;
                            map = map6;
                            map7 = map7;
                        } else {
                            String[] strArrSplit3 = strTrim3.split("\\s");
                            c2 = c4;
                            if (strArrSplit3.length >= 2) {
                                if ("CPU".equalsIgnoreCase(strArrSplit3[0])) {
                                    str3 = str7;
                                    if ("usage".equalsIgnoreCase(strArrSplit3[1])) {
                                        if (strTrim3.contains("ago")) {
                                            z3 = true;
                                        }
                                        if (map3.isEmpty() && map4.isEmpty() && map5.isEmpty() && map7.isEmpty() && map6.isEmpty()) {
                                            map = map6;
                                            map7 = map7;
                                            c = c2;
                                            str2 = str3;
                                        }
                                    }
                                    map = map6;
                                    map7 = map7;
                                    str2 = str3;
                                    c = 4;
                                } else {
                                    str3 = str7;
                                }
                                if (map3.isEmpty() || map4.isEmpty() || map5.isEmpty() || map7.isEmpty() || map6.isEmpty()) {
                                    if (map3.isEmpty() && strArrSplit3[1].equalsIgnoreCase("TOTAL:")) {
                                        string = "";
                                        map2 = map3;
                                    } else if (strTrim3.contains(this.b.getPackageName())) {
                                        string = "";
                                        int i6 = 0;
                                        while (i6 < strArrSplit3.length) {
                                            if (strArrSplit3[i6].contains(this.b.getPackageName())) {
                                                StringBuilder sb = new StringBuilder();
                                                String str9 = strArrSplit3[i6];
                                                sb.append(str9.substring(str9.indexOf(47) + 1, strArrSplit3[i6].length() - 1));
                                                sb.append('_');
                                                string = sb.toString();
                                            }
                                            i6++;
                                            this = this;
                                        }
                                        map2 = map5;
                                    } else if (map4.isEmpty() && strTrim3.contains("system_server:")) {
                                        string = "";
                                        map2 = map4;
                                    } else if (map7.isEmpty() && strTrim3.contains("kswapd")) {
                                        string = "";
                                        map2 = map7;
                                    } else if (!map6.isEmpty() || !strTrim3.contains("dex2oat")) {
                                        string = "";
                                        map2 = null;
                                    } else {
                                        string = "";
                                        map2 = map6;
                                    }
                                    if (map2 != null) {
                                        int i7 = 0;
                                        do {
                                            str5 = "%";
                                            if (strArrSplit3[i7].contains("%")) {
                                                break;
                                            } else {
                                                i7++;
                                            }
                                        } while (i7 < strArrSplit3.length);
                                        try {
                                            float fFloatValue2 = Float.valueOf(strArrSplit3[i7].replace("%", "")).floatValue();
                                            map = map6;
                                            try {
                                                String str10 = string + "total";
                                                if (map2 != map3) {
                                                    fFloatValue2 /= com.apm.insight.l.d.d();
                                                }
                                                try {
                                                    map2.put(str10, Float.valueOf(fFloatValue2));
                                                    while (true) {
                                                        if (i3 < strArrSplit3.length) {
                                                            str6 = "softirq";
                                                            if (c3 != 0) {
                                                                if (c3 != 1) {
                                                                    if (c3 != 2) {
                                                                        c3 = c3;
                                                                        if ("iowait".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            str6 = "iowait";
                                                                            c3 = 3;
                                                                        } else if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            str6 = "irq";
                                                                            c3 = 4;
                                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            c3 = 5;
                                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            c3 = 6;
                                                                        }
                                                                        if (str6 != null) {
                                                                            fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                            strArr = strArrSplit3;
                                                                            String str11 = string + str6;
                                                                            if (map2 == map3) {
                                                                                fFloatValue /= com.apm.insight.l.d.d();
                                                                            }
                                                                            map2.put(str11, Float.valueOf(fFloatValue));
                                                                        } else {
                                                                            strArr = strArrSplit3;
                                                                            str5 = str5;
                                                                        }
                                                                        if (c3 < 6) {
                                                                            i3 += 3;
                                                                            strArrSplit3 = strArr;
                                                                            str5 = str5;
                                                                        }
                                                                    } else if (c3 != 3) {
                                                                        c3 = c3;
                                                                        if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            str6 = "irq";
                                                                            c3 = 4;
                                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            c3 = 5;
                                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            c3 = 6;
                                                                        }
                                                                        if (str6 != null) {
                                                                            fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                            strArr = strArrSplit3;
                                                                            String str12 = string + str6;
                                                                            if (map2 == map3) {
                                                                                fFloatValue /= com.apm.insight.l.d.d();
                                                                            }
                                                                            map2.put(str12, Float.valueOf(fFloatValue));
                                                                        } else {
                                                                            strArr = strArrSplit3;
                                                                            str5 = str5;
                                                                        }
                                                                        if (c3 < 6) {
                                                                            i3 += 3;
                                                                            strArrSplit3 = strArr;
                                                                            str5 = str5;
                                                                        }
                                                                    } else if (c3 != 4) {
                                                                        c3 = c3;
                                                                        if (c3 != 5) {
                                                                            if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                                c3 = 6;
                                                                            }
                                                                        }
                                                                        if (str6 != null) {
                                                                            try {
                                                                                fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                                strArr = strArrSplit3;
                                                                                try {
                                                                                    String str13 = string + str6;
                                                                                    if (map2 == map3) {
                                                                                        fFloatValue /= com.apm.insight.l.d.d();
                                                                                    }
                                                                                    try {
                                                                                        map2.put(str13, Float.valueOf(fFloatValue));
                                                                                    } catch (Throwable unused) {
                                                                                        map2.put(string + str6, fValueOf);
                                                                                    }
                                                                                } catch (Throwable unused2) {
                                                                                    str5 = str5;
                                                                                    map2.put(string + str6, fValueOf);
                                                                                    if (c3 < 6) {
                                                                                        i3 += 3;
                                                                                        strArrSplit3 = strArr;
                                                                                        str5 = str5;
                                                                                    } else {
                                                                                        str2 = str3;
                                                                                        c = c2;
                                                                                        if (c >= 4) {
                                                                                            break;
                                                                                            String str14 = str8;
                                                                                            jSONObject.put("anr_tag", strTrim2);
                                                                                            jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                                                            jSONObject.put("anr_reason", str14);
                                                                                            a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                                                            a(map3, jSONObject, "total");
                                                                                            if (map4.isEmpty()) {
                                                                                                jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                                            } else {
                                                                                                jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                                            }
                                                                                            if (map7.isEmpty()) {
                                                                                                jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                                            } else {
                                                                                                jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                                            }
                                                                                            if (map.isEmpty()) {
                                                                                                jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                                            } else {
                                                                                                jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                                            }
                                                                                        }
                                                                                        i4 = i + 1;
                                                                                        c4 = c;
                                                                                        str7 = str2;
                                                                                        length = i5;
                                                                                        strArrSplit2 = strArrSplit2;
                                                                                        map6 = map;
                                                                                        map7 = map7;
                                                                                    }
                                                                                }
                                                                            } catch (Throwable unused3) {
                                                                                strArr = strArrSplit3;
                                                                            }
                                                                        } else {
                                                                            strArr = strArrSplit3;
                                                                            str5 = str5;
                                                                        }
                                                                        if (c3 < 6) {
                                                                            i3 += 3;
                                                                            strArrSplit3 = strArr;
                                                                            str5 = str5;
                                                                        }
                                                                    } else {
                                                                        c3 = c3;
                                                                        if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            c3 = 5;
                                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            c3 = 6;
                                                                        }
                                                                        if (str6 != null) {
                                                                            fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                            strArr = strArrSplit3;
                                                                            String str15 = string + str6;
                                                                            if (map2 == map3) {
                                                                                fFloatValue /= com.apm.insight.l.d.d();
                                                                            }
                                                                            map2.put(str15, Float.valueOf(fFloatValue));
                                                                        } else {
                                                                            strArr = strArrSplit3;
                                                                            str5 = str5;
                                                                        }
                                                                        if (c3 < 6) {
                                                                            i3 += 3;
                                                                            strArrSplit3 = strArr;
                                                                            str5 = str5;
                                                                        }
                                                                    }
                                                                }
                                                                c3 = c3;
                                                                str6 = null;
                                                                if (str6 != null) {
                                                                    fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                    strArr = strArrSplit3;
                                                                    String str16 = string + str6;
                                                                    if (map2 == map3) {
                                                                        fFloatValue /= com.apm.insight.l.d.d();
                                                                    }
                                                                    map2.put(str16, Float.valueOf(fFloatValue));
                                                                } else {
                                                                    strArr = strArrSplit3;
                                                                    str5 = str5;
                                                                }
                                                                if (c3 < 6) {
                                                                    i3 += 3;
                                                                    strArrSplit3 = strArr;
                                                                    str5 = str5;
                                                                }
                                                            } else {
                                                                if (ay.m.equalsIgnoreCase(strArrSplit3[i3])) {
                                                                    str6 = ay.m;
                                                                    c3 = 1;
                                                                }
                                                                if (str6 != null) {
                                                                    fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                    strArr = strArrSplit3;
                                                                    String str17 = string + str6;
                                                                    if (map2 == map3) {
                                                                        fFloatValue /= com.apm.insight.l.d.d();
                                                                    }
                                                                    map2.put(str17, Float.valueOf(fFloatValue));
                                                                } else {
                                                                    strArr = strArrSplit3;
                                                                    str5 = str5;
                                                                }
                                                                if (c3 < 6) {
                                                                    i3 += 3;
                                                                    strArrSplit3 = strArr;
                                                                    str5 = str5;
                                                                }
                                                            }
                                                            if ("kernel".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                str6 = "kernel";
                                                                c3 = 2;
                                                            } else if ("iowait".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                str6 = "iowait";
                                                                c3 = 3;
                                                            } else if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                str6 = "irq";
                                                                c3 = 4;
                                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                c3 = 5;
                                                            } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                c3 = 6;
                                                            } else {
                                                                c3 = c3;
                                                                str6 = null;
                                                            }
                                                            if (str6 != null) {
                                                                fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                strArr = strArrSplit3;
                                                                String str18 = string + str6;
                                                                if (map2 == map3) {
                                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                                }
                                                                map2.put(str18, Float.valueOf(fFloatValue));
                                                            } else {
                                                                strArr = strArrSplit3;
                                                                str5 = str5;
                                                            }
                                                            if (c3 < 6) {
                                                                i3 += 3;
                                                                strArrSplit3 = strArr;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            str2 = str3;
                                                            c = c2;
                                                        }
                                                    }
                                                } catch (Throwable unused4) {
                                                    map2.put(string + "total", fValueOf);
                                                }
                                            } catch (Throwable unused5) {
                                                map7 = map7;
                                                map2.put(string + "total", fValueOf);
                                                i3 = i7 + 3;
                                                c3 = 0;
                                                while (true) {
                                                    if (i3 < strArrSplit3.length) {
                                                        str6 = "softirq";
                                                        if (c3 != 0) {
                                                            if (c3 != 1) {
                                                                if (c3 != 2) {
                                                                    c3 = c3;
                                                                    if ("iowait".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        str6 = "iowait";
                                                                        c3 = 3;
                                                                    } else if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        str6 = "irq";
                                                                        c3 = 4;
                                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        c3 = 5;
                                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        c3 = 6;
                                                                    }
                                                                    if (str6 != null) {
                                                                        fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                        strArr = strArrSplit3;
                                                                        String str19 = string + str6;
                                                                        if (map2 == map3) {
                                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                                        }
                                                                        map2.put(str19, Float.valueOf(fFloatValue));
                                                                    } else {
                                                                        strArr = strArrSplit3;
                                                                        str5 = str5;
                                                                    }
                                                                    if (c3 < 6) {
                                                                        i3 += 3;
                                                                        strArrSplit3 = strArr;
                                                                        str5 = str5;
                                                                    } else {
                                                                        str2 = str3;
                                                                        c = c2;
                                                                        if (c >= 4) {
                                                                            break;
                                                                            String str110 = str8;
                                                                            jSONObject.put("anr_tag", strTrim2);
                                                                            jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                                            jSONObject.put("anr_reason", str110);
                                                                            a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                                            a(map3, jSONObject, "total");
                                                                            if (map4.isEmpty()) {
                                                                                jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                            } else {
                                                                                jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                            }
                                                                            if (map7.isEmpty()) {
                                                                                jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                            } else {
                                                                                jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                            }
                                                                            if (map.isEmpty()) {
                                                                                jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                            } else {
                                                                                jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                            }
                                                                        }
                                                                        i4 = i + 1;
                                                                        c4 = c;
                                                                        str7 = str2;
                                                                        length = i5;
                                                                        strArrSplit2 = strArrSplit2;
                                                                        map6 = map;
                                                                        map7 = map7;
                                                                    }
                                                                } else if (c3 != 3) {
                                                                    c3 = c3;
                                                                    if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        str6 = "irq";
                                                                        c3 = 4;
                                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        c3 = 5;
                                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        c3 = 6;
                                                                    }
                                                                    if (str6 != null) {
                                                                        fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                        strArr = strArrSplit3;
                                                                        String str111 = string + str6;
                                                                        if (map2 == map3) {
                                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                                        }
                                                                        map2.put(str111, Float.valueOf(fFloatValue));
                                                                    } else {
                                                                        strArr = strArrSplit3;
                                                                        str5 = str5;
                                                                    }
                                                                    if (c3 < 6) {
                                                                        i3 += 3;
                                                                        strArrSplit3 = strArr;
                                                                        str5 = str5;
                                                                    } else {
                                                                        str2 = str3;
                                                                        c = c2;
                                                                        if (c >= 4) {
                                                                            break;
                                                                            String str112 = str8;
                                                                            jSONObject.put("anr_tag", strTrim2);
                                                                            jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                                            jSONObject.put("anr_reason", str112);
                                                                            a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                                            a(map3, jSONObject, "total");
                                                                            if (map4.isEmpty()) {
                                                                                jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                            } else {
                                                                                jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                            }
                                                                            if (map7.isEmpty()) {
                                                                                jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                            } else {
                                                                                jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                            }
                                                                            if (map.isEmpty()) {
                                                                                jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                            } else {
                                                                                jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                            }
                                                                        }
                                                                        i4 = i + 1;
                                                                        c4 = c;
                                                                        str7 = str2;
                                                                        length = i5;
                                                                        strArrSplit2 = strArrSplit2;
                                                                        map6 = map;
                                                                        map7 = map7;
                                                                    }
                                                                } else if (c3 != 4) {
                                                                    c3 = c3;
                                                                    if (c3 != 5) {
                                                                        if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                            c3 = 6;
                                                                        }
                                                                    }
                                                                    if (str6 != null) {
                                                                        fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                        strArr = strArrSplit3;
                                                                        String str113 = string + str6;
                                                                        if (map2 == map3) {
                                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                                        }
                                                                        map2.put(str113, Float.valueOf(fFloatValue));
                                                                    } else {
                                                                        strArr = strArrSplit3;
                                                                        str5 = str5;
                                                                    }
                                                                    if (c3 < 6) {
                                                                        i3 += 3;
                                                                        strArrSplit3 = strArr;
                                                                        str5 = str5;
                                                                    } else {
                                                                        str2 = str3;
                                                                        c = c2;
                                                                        if (c >= 4) {
                                                                            break;
                                                                            String str114 = str8;
                                                                            jSONObject.put("anr_tag", strTrim2);
                                                                            jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                                            jSONObject.put("anr_reason", str114);
                                                                            a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                                            a(map3, jSONObject, "total");
                                                                            if (map4.isEmpty()) {
                                                                                jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                            } else {
                                                                                jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                            }
                                                                            if (map7.isEmpty()) {
                                                                                jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                            } else {
                                                                                jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                            }
                                                                            if (map.isEmpty()) {
                                                                                jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                            } else {
                                                                                jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                            }
                                                                        }
                                                                        i4 = i + 1;
                                                                        c4 = c;
                                                                        str7 = str2;
                                                                        length = i5;
                                                                        strArrSplit2 = strArrSplit2;
                                                                        map6 = map;
                                                                        map7 = map7;
                                                                    }
                                                                } else {
                                                                    c3 = c3;
                                                                    if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        c3 = 5;
                                                                    } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                                        c3 = 6;
                                                                    }
                                                                    if (str6 != null) {
                                                                        fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                        strArr = strArrSplit3;
                                                                        String str115 = string + str6;
                                                                        if (map2 == map3) {
                                                                            fFloatValue /= com.apm.insight.l.d.d();
                                                                        }
                                                                        map2.put(str115, Float.valueOf(fFloatValue));
                                                                    } else {
                                                                        strArr = strArrSplit3;
                                                                        str5 = str5;
                                                                    }
                                                                    if (c3 < 6) {
                                                                        i3 += 3;
                                                                        strArrSplit3 = strArr;
                                                                        str5 = str5;
                                                                    } else {
                                                                        str2 = str3;
                                                                        c = c2;
                                                                        if (c >= 4) {
                                                                            break;
                                                                            String str116 = str8;
                                                                            jSONObject.put("anr_tag", strTrim2);
                                                                            jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                                            jSONObject.put("anr_reason", str116);
                                                                            a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                                            a(map3, jSONObject, "total");
                                                                            if (map4.isEmpty()) {
                                                                                jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                            } else {
                                                                                jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                            }
                                                                            if (map7.isEmpty()) {
                                                                                jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                            } else {
                                                                                jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                            }
                                                                            if (map.isEmpty()) {
                                                                                jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                            } else {
                                                                                jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                            }
                                                                        }
                                                                        i4 = i + 1;
                                                                        c4 = c;
                                                                        str7 = str2;
                                                                        length = i5;
                                                                        strArrSplit2 = strArrSplit2;
                                                                        map6 = map;
                                                                        map7 = map7;
                                                                    }
                                                                }
                                                            }
                                                            c3 = c3;
                                                            str6 = null;
                                                            if (str6 != null) {
                                                                fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                strArr = strArrSplit3;
                                                                String str117 = string + str6;
                                                                if (map2 == map3) {
                                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                                }
                                                                map2.put(str117, Float.valueOf(fFloatValue));
                                                            } else {
                                                                strArr = strArrSplit3;
                                                                str5 = str5;
                                                            }
                                                            if (c3 < 6) {
                                                                i3 += 3;
                                                                strArrSplit3 = strArr;
                                                                str5 = str5;
                                                            } else {
                                                                str2 = str3;
                                                                c = c2;
                                                                if (c >= 4) {
                                                                    break;
                                                                    String str118 = str8;
                                                                    jSONObject.put("anr_tag", strTrim2);
                                                                    jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                                    jSONObject.put("anr_reason", str118);
                                                                    a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                                    a(map3, jSONObject, "total");
                                                                    if (map4.isEmpty()) {
                                                                        jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                    } else {
                                                                        jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                    }
                                                                    if (map7.isEmpty()) {
                                                                        jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                    } else {
                                                                        jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                    }
                                                                    if (map.isEmpty()) {
                                                                        jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                    } else {
                                                                        jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                    }
                                                                }
                                                                i4 = i + 1;
                                                                c4 = c;
                                                                str7 = str2;
                                                                length = i5;
                                                                strArrSplit2 = strArrSplit2;
                                                                map6 = map;
                                                                map7 = map7;
                                                            }
                                                        } else {
                                                            if (ay.m.equalsIgnoreCase(strArrSplit3[i3])) {
                                                                str6 = ay.m;
                                                                c3 = 1;
                                                            }
                                                            if (str6 != null) {
                                                                fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                                strArr = strArrSplit3;
                                                                String str119 = string + str6;
                                                                if (map2 == map3) {
                                                                    fFloatValue /= com.apm.insight.l.d.d();
                                                                }
                                                                map2.put(str119, Float.valueOf(fFloatValue));
                                                            } else {
                                                                strArr = strArrSplit3;
                                                                str5 = str5;
                                                            }
                                                            if (c3 < 6) {
                                                                i3 += 3;
                                                                strArrSplit3 = strArr;
                                                                str5 = str5;
                                                            } else {
                                                                str2 = str3;
                                                                c = c2;
                                                                if (c >= 4) {
                                                                    break;
                                                                    String str1110 = str8;
                                                                    jSONObject.put("anr_tag", strTrim2);
                                                                    jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                                    jSONObject.put("anr_reason", str1110);
                                                                    a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                                    a(map3, jSONObject, "total");
                                                                    if (map4.isEmpty()) {
                                                                        jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                    } else {
                                                                        jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                    }
                                                                    if (map7.isEmpty()) {
                                                                        jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                    } else {
                                                                        jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                    }
                                                                    if (map.isEmpty()) {
                                                                        jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                    } else {
                                                                        jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                    }
                                                                }
                                                                i4 = i + 1;
                                                                c4 = c;
                                                                str7 = str2;
                                                                length = i5;
                                                                strArrSplit2 = strArrSplit2;
                                                                map6 = map;
                                                                map7 = map7;
                                                            }
                                                        }
                                                        if ("kernel".equalsIgnoreCase(strArrSplit3[i3])) {
                                                            str6 = "kernel";
                                                            c3 = 2;
                                                        } else if ("iowait".equalsIgnoreCase(strArrSplit3[i3])) {
                                                            str6 = "iowait";
                                                            c3 = 3;
                                                        } else if ("irq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                            str6 = "irq";
                                                            c3 = 4;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                            c3 = 5;
                                                        } else if ("softirq".equalsIgnoreCase(strArrSplit3[i3])) {
                                                            c3 = 6;
                                                        } else {
                                                            c3 = c3;
                                                            str6 = null;
                                                        }
                                                        if (str6 != null) {
                                                            fFloatValue = Float.valueOf(strArrSplit3[i3 - 1].replace(str5, "")).floatValue();
                                                            strArr = strArrSplit3;
                                                            String str1111 = string + str6;
                                                            if (map2 == map3) {
                                                                fFloatValue /= com.apm.insight.l.d.d();
                                                            }
                                                            map2.put(str1111, Float.valueOf(fFloatValue));
                                                        } else {
                                                            strArr = strArrSplit3;
                                                            str5 = str5;
                                                        }
                                                        if (c3 < 6) {
                                                            i3 += 3;
                                                            strArrSplit3 = strArr;
                                                            str5 = str5;
                                                        } else {
                                                            str2 = str3;
                                                            c = c2;
                                                            if (c >= 4) {
                                                                break;
                                                                String str1112 = str8;
                                                                jSONObject.put("anr_tag", strTrim2);
                                                                jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                                jSONObject.put("anr_reason", str1112);
                                                                a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                                a(map3, jSONObject, "total");
                                                                if (map4.isEmpty()) {
                                                                    jSONObject.put("npth_anr_systemserver_total", "not found");
                                                                } else {
                                                                    jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                                }
                                                                if (map7.isEmpty()) {
                                                                    jSONObject.put("npth_anr_kswapd_total", "not found");
                                                                } else {
                                                                    jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                                }
                                                                if (map.isEmpty()) {
                                                                    jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                                } else {
                                                                    jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                                }
                                                            }
                                                            i4 = i + 1;
                                                            c4 = c;
                                                            str7 = str2;
                                                            length = i5;
                                                            strArrSplit2 = strArrSplit2;
                                                            map6 = map;
                                                            map7 = map7;
                                                        }
                                                    } else {
                                                        str2 = str3;
                                                        c = c2;
                                                        if (c >= 4) {
                                                            break;
                                                            String str1113 = str8;
                                                            jSONObject.put("anr_tag", strTrim2);
                                                            jSONObject.put("anr_has_ago", String.valueOf(z3));
                                                            jSONObject.put("anr_reason", str1113);
                                                            a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
                                                            a(map3, jSONObject, "total");
                                                            if (map4.isEmpty()) {
                                                                jSONObject.put("npth_anr_systemserver_total", "not found");
                                                            } else {
                                                                jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
                                                            }
                                                            if (map7.isEmpty()) {
                                                                jSONObject.put("npth_anr_kswapd_total", "not found");
                                                            } else {
                                                                jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
                                                            }
                                                            if (map.isEmpty()) {
                                                                jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
                                                            } else {
                                                                jSONObject.put("npth_anr_dex2oat_total", "not found");
                                                            }
                                                        }
                                                        i4 = i + 1;
                                                        c4 = c;
                                                        str7 = str2;
                                                        length = i5;
                                                        strArrSplit2 = strArrSplit2;
                                                        map6 = map;
                                                        map7 = map7;
                                                    }
                                                }
                                            }
                                        } catch (Throwable unused6) {
                                            map = map6;
                                        }
                                        i3 = i7 + 3;
                                        c3 = 0;
                                    } else {
                                        map = map6;
                                        map7 = map7;
                                    }
                                    str2 = str3;
                                }
                                map = map6;
                                map7 = map7;
                                str2 = str3;
                                c = 4;
                            } else {
                                map = map6;
                                map7 = map7;
                                str2 = str7;
                            }
                        }
                        c = c2;
                    } else {
                        c2 = c4;
                        str3 = str7;
                        map = map6;
                        map7 = map7;
                        strTrim = strTrim3.trim();
                        if (strTrim.startsWith("Load:")) {
                            strArrSplit = strTrim.replace("Load:", "").trim().split("/");
                            if (3 == strArrSplit.length) {
                                while (i2 < strArrSplit.length) {
                                    fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                                }
                            }
                            str2 = str3;
                            c = 3;
                        } else {
                            c = c2;
                            str2 = str3;
                        }
                    }
                } else {
                    c2 = c4;
                    i = i4;
                    map = map6;
                    map7 = map7;
                    String strTrim4 = strTrim3.trim();
                    str2 = str7;
                    if (strTrim4.startsWith(str2)) {
                        strTrim2 = strTrim4.replace(str2, "").trim();
                        c = 1;
                    } else {
                        c = c2;
                    }
                }
                if (c >= 4) {
                    break;
                }
            } else {
                str2 = str7;
                i = i4;
                map = map6;
                map7 = map7;
                c = c4;
            }
            i4 = i + 1;
            c4 = c;
            str7 = str2;
            length = i5;
            strArrSplit2 = strArrSplit2;
            map6 = map;
            map7 = map7;
        }
        String str1114 = str8;
        jSONObject.put("anr_tag", strTrim2);
        jSONObject.put("anr_has_ago", String.valueOf(z3));
        jSONObject.put("anr_reason", str1114);
        a(map5, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        a(map3, jSONObject, "total");
        if (map4.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", b(com.apm.insight.l.c.AnonymousClass1.a(map4).floatValue()));
        }
        if (map7.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", b(com.apm.insight.l.c.AnonymousClass1.a(map7).floatValue()));
        }
        if (map.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", b(com.apm.insight.l.c.AnonymousClass1.a(map).floatValue()));
        } else {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        }
    }

    private static void a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat = "npth_anr_".concat(String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith(ay.m)) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 = entry.getValue().floatValue() + fFloatValue5;
            }
        }
        float f = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(DM.h(strConcat, "_total"), b(f));
        jSONObject.put(strConcat + "_kernel_user_ratio", a(fFloatValue2, f));
        jSONObject.put(strConcat + "_iowait_user_ratio", a(fFloatValue3, f));
    }

    private static String a(float f, float f2) {
        if (f2 > 0.0f) {
            return a(f / f2);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    private static String a(float f) {
        if (f <= 0.0f) {
            return "0%";
        }
        if (f <= 0.1f) {
            return "0% - 10%";
        }
        if (f <= 0.3f) {
            return "10% - 30%";
        }
        if (f <= 0.6f) {
            return "30% - 60%";
        }
        if (f <= 0.9f) {
            return "60% - 90%";
        }
        return "90% - 100%";
    }
}
