package androidx.privacysandbox.ads.adservices.topics;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SM;

/* JADX INFO: loaded from: classes.dex */
@RequiresExtension(extension = 1000000, version = 5)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class TopicsManagerApi33Ext5Impl extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public TopicsManagerApi33Ext5Impl(Context context) {
        AbstractC2995aW.q(context, f.X);
        Object systemService = context.getSystemService((Class<Object>) SM.q());
        AbstractC2995aW.p(systemService, "context.getSystemService…opicsManager::class.java)");
        super(SM.p(systemService));
    }

    @Override // androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon
    public android.adservices.topics.GetTopicsRequest convertRequest$ads_adservices_release(GetTopicsRequest getTopicsRequest) {
        AbstractC2995aW.q(getTopicsRequest, J0.REQUEST_KEY_EXTRA);
        android.adservices.topics.GetTopicsRequest getTopicsRequestBuild = SM.j().setAdsSdkName(getTopicsRequest.getAdsSdkName()).setShouldRecordObservation(getTopicsRequest.shouldRecordObservation()).build();
        AbstractC2995aW.p(getTopicsRequestBuild, "Builder()\n            .s…ion)\n            .build()");
        return getTopicsRequestBuild;
    }
}
