package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;

/* JADX INFO: loaded from: classes.dex */
public abstract class MBBaseActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Display f890a;
    private OrientationEventListener b;
    private int c = -1;
    private volatile boolean d = false;
    private Runnable e;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e) {
                o0.b("MBBaseActivity", e.getMessage());
            }
        }
    }

    public class b extends OrientationEventListener {
        public b(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int rotation = MBBaseActivity.this.f890a != null ? MBBaseActivity.this.f890a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.c != 1) {
                MBBaseActivity.this.c = 1;
                MBBaseActivity.this.getNotchParams();
                o0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.c != 2) {
                MBBaseActivity.this.c = 2;
                MBBaseActivity.this.getNotchParams();
                o0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.c != 3) {
                MBBaseActivity.this.c = 3;
                MBBaseActivity.this.getNotchParams();
                o0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.c == 4) {
                    return;
                }
                MBBaseActivity.this.c = 4;
                MBBaseActivity.this.getNotchParams();
                o0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.b = bVar;
        if (bVar.canDetectOrientation()) {
            this.b.enable();
        } else {
            this.b.disable();
            this.b = null;
        }
    }

    public void getNotchParams() {
        if (this.d) {
            return;
        }
        this.e = new a();
        getWindow().getDecorView().postDelayed(this.e, 500L);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            c1.a(getWindow());
        } catch (Exception e) {
            o0.b("MBBaseActivity", e.getMessage());
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        this.d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.b = null;
            }
            if (this.e != null) {
                getWindow().getDecorView().removeCallbacks(this.e);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("MBBaseActivity", e.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        c();
    }

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        DisplayCutout displayCutout;
        int i6;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 23 || this.d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        if (rootWindowInsets == null || i7 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            i = -1;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            int safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            int safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f890a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.c == -1) {
                if (rotation == 0) {
                    i6 = 3;
                } else if (rotation == 1) {
                    i6 = 1;
                } else if (rotation == 2) {
                    i6 = 4;
                } else {
                    i6 = rotation == 3 ? 2 : -1;
                }
                this.c = i6;
                o0.b("MBBaseActivity", this.c + "");
            }
            if (rotation == 0) {
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i3 = safeInsetRight;
                i4 = safeInsetTop;
                i = 0;
            } else if (rotation == 1) {
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i3 = safeInsetRight;
                i4 = safeInsetTop;
                i = 90;
            } else if (rotation == 2) {
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i3 = safeInsetRight;
                i4 = safeInsetTop;
                i = 180;
            } else if (rotation != 3) {
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i3 = safeInsetRight;
                i4 = safeInsetTop;
                i = -1;
            } else {
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i3 = safeInsetRight;
                i4 = safeInsetTop;
                i = 270;
            }
        }
        setTopControllerPadding(i, i2, i3, i4, i5);
        if (this.b == null) {
            d();
        }
    }

    private void c() {
        try {
            getWindow().addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            o0.b("MBBaseActivity", th.getMessage());
        }
    }

    private int a() {
        if (this.f890a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f890a = getDisplay();
            } else {
                this.f890a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f890a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }
}
