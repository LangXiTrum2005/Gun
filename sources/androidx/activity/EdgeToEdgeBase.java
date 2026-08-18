package androidx.activity;

import android.view.View;
import android.view.Window;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
final class EdgeToEdgeBase implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z, boolean z2) {
        AbstractC2995aW.q(systemBarStyle, "statusBarStyle");
        AbstractC2995aW.q(systemBarStyle2, "navigationBarStyle");
        AbstractC2995aW.q(window, "window");
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }
}
