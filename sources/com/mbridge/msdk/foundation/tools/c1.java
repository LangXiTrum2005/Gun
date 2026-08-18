package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
public class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f1273a = new AtomicInteger(1);

    public static void a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public static int a() {
        AtomicInteger atomicInteger;
        int i;
        int i2;
        do {
            atomicInteger = f1273a;
            i = atomicInteger.get();
            i2 = i + 1;
            if (i2 > 16777215) {
                i2 = 1;
            }
        } while (!atomicInteger.compareAndSet(i, i2));
        return i;
    }

    public static void a(Window window) {
        if (window != null) {
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (i >= 30) {
                        attributes.layoutInDisplayCutoutMode = 3;
                    } else {
                        attributes.layoutInDisplayCutoutMode = 1;
                    }
                    window.setAttributes(attributes);
                }
            } catch (Throwable th) {
                o0.b("ViewUtil", th.getMessage());
            }
        }
    }
}
