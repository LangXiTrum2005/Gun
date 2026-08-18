package androidx.privacysandbox.ads.adservices.java.adselection;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionConfig;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.ReportImpressionRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdSelectionManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends AdSelectionManagerFutures {
        private final AdSelectionManager mAdSelectionManager;

        public Api33Ext4JavaImpl(AdSelectionManager adSelectionManager) {
            this.mAdSelectionManager = adSelectionManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public AI reportImpressionAsync(ReportImpressionRequest reportImpressionRequest) {
            AbstractC2995aW.q(reportImpressionRequest, "reportImpressionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$reportImpressionAsync$1(this, reportImpressionRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.adselection.AdSelectionManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public AI selectAdsAsync(AdSelectionConfig adSelectionConfig) {
            AbstractC2995aW.q(adSelectionConfig, "adSelectionConfig");
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new AdSelectionManagerFutures$Api33Ext4JavaImpl$selectAdsAsync$1(this, adSelectionConfig, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final AdSelectionManagerFutures from(Context context) {
            AbstractC2995aW.q(context, f.X);
            AdSelectionManager adSelectionManagerObtain = AdSelectionManager.Companion.obtain(context);
            if (adSelectionManagerObtain != null) {
                return new Api33Ext4JavaImpl(adSelectionManagerObtain);
            }
            return null;
        }
    }

    public static final AdSelectionManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract AI reportImpressionAsync(ReportImpressionRequest reportImpressionRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract AI selectAdsAsync(AdSelectionConfig adSelectionConfig);
}
