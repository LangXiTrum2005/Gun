package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f2458a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    private static boolean g = false;
    private static InputManager h;

    public static class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f2459a;
        final /* synthetic */ int b;

        public a(Context context, int i) {
            this.f2459a = context;
            this.b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            InputManager inputManagerB = w.b(this.f2459a);
            if (inputManagerB == null) {
                return;
            }
            InputDevice inputDevice = inputManagerB.getInputDevice(this.b);
            w.h();
            if (inputDevice == null) {
                w.b();
                w.c();
                w.c("nihc");
            } else if (inputDevice.isVirtual()) {
                w.d();
                w.e();
                w.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                w.f();
                w.g();
                w.c("eihc");
            }
        }
    }

    public static /* synthetic */ int b() {
        int i = c;
        c = i + 1;
        return i;
    }

    public static /* synthetic */ int c() {
        int i = f;
        f = i + 1;
        return i;
    }

    public static /* synthetic */ int d() {
        int i = f2458a;
        f2458a = i + 1;
        return i;
    }

    public static /* synthetic */ int e() {
        int i = d;
        d = i + 1;
        return i;
    }

    public static /* synthetic */ int f() {
        int i = b;
        b = i + 1;
        return i;
    }

    public static /* synthetic */ int g() {
        int i = e;
        e = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (g) {
            return;
        }
        try {
            SharedPreferences sharedPreferencesA = u0.a(x.b());
            if (sharedPreferencesA != null) {
                f = sharedPreferencesA.getInt("nihc", 0);
                e = sharedPreferencesA.getInt("eihc", 0);
                d = sharedPreferencesA.getInt("vihc", 0);
                g = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:4:0x000e  */
    public static int b(String str) {
        h();
        str.getClass();
        switch (str) {
            case "eic":
                return b;
            case "nic":
                return c;
            case "vic":
                return f2458a;
            case "eihc":
                return e;
            case "nihc":
                return f;
            case "vihc":
                return d;
            default:
                return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences sharedPreferencesA = u0.a(x.b());
            if (sharedPreferencesA != null) {
                sharedPreferencesA.edit().putInt(str, sharedPreferencesA.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            o0.b(new a(context, motionEvent.getDeviceId()));
        }
    }

    public static void a(JSONObject jSONObject) {
        h();
        try {
            jSONObject.put("vihc", d);
            jSONObject.put("eihc", e);
            jSONObject.put("nihc", f);
            jSONObject.put("vic", f2458a);
            jSONObject.put("nic", c);
            jSONObject.put("eic", b);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (h == null) {
            h = (InputManager) context.getSystemService("input");
        }
        return h;
    }
}
