package com.apm.insight.k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<c> f122a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.apm.insight.k.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f123a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f123a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f123a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f123a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private JSONObject f124a;
        private JSONObject b;
        private CrashType c;

        public a(JSONObject jSONObject, CrashType crashType) {
            this.c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f124a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f124a = jSONObject;
            }
            this.b = jSONObject.optJSONObject("header");
        }

        @Nullable
        public final String a() {
            return this.f124a.optString("crash_thread_name", null);
        }

        public final long b() {
            return this.f124a.optInt("app_start_time", -1);
        }

        @Nullable
        public final String c() {
            int i = AnonymousClass1.f123a[this.c.ordinal()];
            if (i == 1) {
                return this.f124a.optString("data", null);
            }
            if (i == 2) {
                return this.f124a.optString("stack", null);
            }
            if (i != 3) {
                return null;
            }
            return this.f124a.optString("data", null);
        }
    }

    public static void a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<c> concurrentLinkedQueue = f122a;
        if (concurrentLinkedQueue == null || concurrentLinkedQueue.isEmpty()) {
            return;
        }
        new a(jSONObject, crashType);
        while (!f122a.isEmpty()) {
            f122a.poll();
        }
        f122a = null;
    }
}
