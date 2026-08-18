package com.pgl.ssdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Display;

/* JADX INFO: loaded from: classes2.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile DisplayManager.DisplayListener f2463a = null;
    private static volatile boolean b = false;
    private static String c;
    private static String d;
    private static String e;
    private static DisplayManager f;

    public static class a implements DisplayManager.DisplayListener {
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
            y.b(i, 1);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            y.b(i, 3);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
            y.b(i, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(int i, int i2) {
        if (i == 0) {
            return;
        }
        try {
            String strA = a(i);
            if (i2 == 1) {
                if (strA.equals(c)) {
                    return;
                }
                c = strA;
            } else if (i2 == 2) {
                if (strA.equals(d)) {
                    return;
                }
                d = strA;
            } else {
                if (i2 != 3 || strA.equals(e)) {
                    return;
                }
                e = strA;
            }
        } catch (Throwable unused) {
        }
    }

    public static void c(Context context) {
        Handler handlerB;
        if (b) {
            return;
        }
        b = true;
        if (f2463a == null) {
            f2463a = new a();
        }
        if (f == null) {
            f = (DisplayManager) context.getSystemService("display");
        }
        if (f == null || (handlerB = o0.b()) == null) {
            return;
        }
        try {
            f.registerDisplayListener(f2463a, handlerB);
        } catch (Exception unused) {
        }
    }

    private static String a(Display display) {
        String name = display.getName();
        Object objA = s0.a(display, display.getClass(), "getType", new Class[0], new Object[0]);
        Object objA2 = s0.a(display, display.getClass(), "getOwnerPackageName", new Class[0], new Object[0]);
        Object objA3 = s0.a(null, display.getClass(), "TYPE_VIRTUAL", null);
        return String.format("%s#%s#%b", objA2, name, Boolean.valueOf((objA == null || objA3 == null || ((Integer) objA).intValue() != ((Integer) objA3).intValue()) ? false : true));
    }

    public static boolean b(Context context) {
        if (c == null && d == null && e == null) {
            return (context == null || TextUtils.isEmpty(a(context))) ? false : true;
        }
        return true;
    }

    private static String a(int i) {
        Display display = f.getDisplay(i);
        return display != null ? a(display) : "pd";
    }

    public static String a(Context context) {
        Display[] displays;
        if (f == null) {
            f = (DisplayManager) context.getSystemService("display");
        }
        DisplayManager displayManager = f;
        if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < displays.length; i++) {
            Display display = displays[i];
            if (display != null && display.getDisplayId() != 0) {
                stringBuffer.append(a(displays[i]));
                if (i != displays.length - 1) {
                    stringBuffer.append(",");
                }
            }
        }
        return stringBuffer.toString();
    }
}
