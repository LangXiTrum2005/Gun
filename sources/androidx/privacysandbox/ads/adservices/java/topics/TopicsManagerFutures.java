package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.topics.GetTopicsRequest;
import androidx.privacysandbox.ads.adservices.topics.TopicsManager;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2627Nn;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TL;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public abstract class TopicsManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext4JavaImpl extends TopicsManagerFutures {
        private final TopicsManager mTopicsManager;

        public Api33Ext4JavaImpl(TopicsManager topicsManager) {
            AbstractC2995aW.q(topicsManager, "mTopicsManager");
            this.mTopicsManager = topicsManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
        @DoNotInline
        public AI getTopicsAsync(GetTopicsRequest getTopicsRequest) {
            AbstractC2995aW.q(getTopicsRequest, J0.REQUEST_KEY_EXTRA);
            C2627Nn c2627Nn = AbstractC4437qp.f4904a;
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(TL.f3768a), null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, getTopicsRequest, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final TopicsManagerFutures from(Context context) {
            AbstractC2995aW.q(context, f.X);
            TopicsManager topicsManagerObtain = TopicsManager.Companion.obtain(context);
            if (topicsManagerObtain != null) {
                return new Api33Ext4JavaImpl(topicsManagerObtain);
            }
            return null;
        }
    }

    public static final TopicsManagerFutures from(Context context) {
        return Companion.from(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_TOPICS")
    public abstract AI getTopicsAsync(GetTopicsRequest getTopicsRequest);
}
