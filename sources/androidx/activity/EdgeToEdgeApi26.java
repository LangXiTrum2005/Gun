package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
final class EdgeToEdgeApi26 implements EdgeToEdgeImpl {
    @Override // androidx.activity.EdgeToEdgeImpl
    @DoNotInline
    public void setUp(SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, Window window, View view, boolean z, boolean z2) {
        AbstractC2995aW.q(systemBarStyle, "statusBarStyle");
        AbstractC2995aW.q(systemBarStyle2, "navigationBarStyle");
        AbstractC2995aW.q(window, "window");
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        WindowCompat.setDecorFitsSystemWindows(window, false);
        window.setStatusBarColor(systemBarStyle.getScrim$activity_release(z));
        window.setNavigationBarColor(systemBarStyle2.getScrim$activity_release(z2));
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window, view);
        windowInsetsControllerCompat.setAppearanceLightStatusBars(!z);
        windowInsetsControllerCompat.setAppearanceLightNavigationBars(!z2);
    }
}
