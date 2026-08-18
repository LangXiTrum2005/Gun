package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class EdgeToEdge {
    private static EdgeToEdgeImpl Impl;
    private static final int DefaultLightScrim = Color.argb(230, 255, 255, 255);
    private static final int DefaultDarkScrim = Color.argb(128, 27, 27, 27);

    public static final void enable(ComponentActivity componentActivity) {
        AbstractC2995aW.q(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i, Object obj) {
        if ((i & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.Companion, DefaultLightScrim, DefaultDarkScrim, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        return DefaultDarkScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    public static final int getDefaultLightScrim() {
        return DefaultLightScrim;
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle systemBarStyle) {
        AbstractC2995aW.q(componentActivity, "<this>");
        AbstractC2995aW.q(systemBarStyle, "statusBarStyle");
        enable$default(componentActivity, systemBarStyle, null, 2, null);
    }

    public static final void enable(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2) {
        AbstractC2995aW.q(componentActivity, "<this>");
        AbstractC2995aW.q(systemBarStyle, "statusBarStyle");
        AbstractC2995aW.q(systemBarStyle2, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        AbstractC2995aW.p(decorView, "window.decorView");
        InterfaceC2766Sw detectDarkMode$activity_release = systemBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        AbstractC2995aW.p(resources, "view.resources");
        boolean zBooleanValue = ((Boolean) detectDarkMode$activity_release.invoke(resources)).booleanValue();
        InterfaceC2766Sw detectDarkMode$activity_release2 = systemBarStyle2.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        AbstractC2995aW.p(resources2, "view.resources");
        boolean zBooleanValue2 = ((Boolean) detectDarkMode$activity_release2.invoke(resources2)).booleanValue();
        EdgeToEdgeImpl edgeToEdgeApi21 = Impl;
        if (edgeToEdgeApi21 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 29) {
                edgeToEdgeApi21 = new EdgeToEdgeApi29();
            } else if (i >= 26) {
                edgeToEdgeApi21 = new EdgeToEdgeApi26();
            } else if (i >= 23) {
                edgeToEdgeApi21 = new EdgeToEdgeApi23();
            } else {
                edgeToEdgeApi21 = new EdgeToEdgeApi21();
                Impl = edgeToEdgeApi21;
            }
        }
        EdgeToEdgeImpl edgeToEdgeImpl = edgeToEdgeApi21;
        Window window = componentActivity.getWindow();
        AbstractC2995aW.p(window, "window");
        edgeToEdgeImpl.setUp(systemBarStyle, systemBarStyle2, window, decorView, zBooleanValue, zBooleanValue2);
    }
}
