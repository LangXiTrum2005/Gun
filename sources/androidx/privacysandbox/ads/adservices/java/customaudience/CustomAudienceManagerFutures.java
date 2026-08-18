package androidx.privacysandbox.ads.adservices.java.customaudience;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager;
import androidx.privacysandbox.ads.adservices.customaudience.JoinCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.customaudience.LeaveCustomAudienceRequest;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomAudienceManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends CustomAudienceManagerFutures {
        private final CustomAudienceManager mCustomAudienceManager;

        public Api33Ext4JavaImpl(CustomAudienceManager customAudienceManager) {
            this.mCustomAudienceManager = customAudienceManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public AI joinCustomAudienceAsync(JoinCustomAudienceRequest joinCustomAudienceRequest) {
            AbstractC2995aW.q(joinCustomAudienceRequest, J0.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$joinCustomAudienceAsync$1(this, joinCustomAudienceRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.customaudience.CustomAudienceManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public AI leaveCustomAudienceAsync(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            AbstractC2995aW.q(leaveCustomAudienceRequest, J0.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new CustomAudienceManagerFutures$Api33Ext4JavaImpl$leaveCustomAudienceAsync$1(this, leaveCustomAudienceRequest, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final CustomAudienceManagerFutures from(Context context) {
            AbstractC2995aW.q(context, f.X);
            CustomAudienceManager customAudienceManagerObtain = CustomAudienceManager.Companion.obtain(context);
            if (customAudienceManagerObtain != null) {
                return new Api33Ext4JavaImpl(customAudienceManagerObtain);
            }
            return null;
        }
    }

    public static final CustomAudienceManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract AI joinCustomAudienceAsync(JoinCustomAudienceRequest joinCustomAudienceRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract AI leaveCustomAudienceAsync(LeaveCustomAudienceRequest leaveCustomAudienceRequest);
}
