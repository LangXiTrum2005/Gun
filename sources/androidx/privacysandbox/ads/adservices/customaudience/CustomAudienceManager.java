package androidx.privacysandbox.ads.adservices.customaudience;

import android.adservices.common.AdData;
import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2495Ik;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4105n4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class CustomAudienceManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final CustomAudienceManager obtain(Context context) {
            AbstractC2995aW.q(context, f.X);
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final CustomAudienceManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public static final class Api33Ext4Impl extends CustomAudienceManager {
        private final android.adservices.customaudience.CustomAudienceManager customAudienceManager;

        public Api33Ext4Impl(android.adservices.customaudience.CustomAudienceManager customAudienceManager) {
            AbstractC2995aW.q(customAudienceManager, "customAudienceManager");
            this.customAudienceManager = customAudienceManager;
        }

        private final List<AdData> convertAdData(List<androidx.privacysandbox.ads.adservices.common.AdData> list) {
            ArrayList arrayList = new ArrayList();
            for (androidx.privacysandbox.ads.adservices.common.AdData adData : list) {
                AdData adDataBuild = AbstractC2495Ik.a().setMetadata(adData.getMetadata()).setRenderUri(adData.getRenderUri()).build();
                AbstractC2995aW.p(adDataBuild, "Builder()\n              …                 .build()");
                arrayList.add(adDataBuild);
            }
            return arrayList;
        }

        private final AdTechIdentifier convertAdTechIdentifier(androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier) {
            AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
            AbstractC2995aW.p(adTechIdentifierFromString, "fromString(input.identifier)");
            return adTechIdentifierFromString;
        }

        private final AdSelectionSignals convertBiddingSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            if (adSelectionSignals == null) {
                return null;
            }
            return AdSelectionSignals.fromString(adSelectionSignals.getSignals());
        }

        private final android.adservices.customaudience.CustomAudience convertCustomAudience(CustomAudience customAudience) {
            android.adservices.customaudience.CustomAudience customAudienceBuild = AbstractC2495Ik.b().setActivationTime(customAudience.getActivationTime()).setAds(convertAdData(customAudience.getAds())).setBiddingLogicUri(customAudience.getBiddingLogicUri()).setBuyer(convertAdTechIdentifier(customAudience.getBuyer())).setDailyUpdateUri(customAudience.getDailyUpdateUri()).setExpirationTime(customAudience.getExpirationTime()).setName(customAudience.getName()).setTrustedBiddingData(convertTrustedSignals(customAudience.getTrustedBiddingSignals())).setUserBiddingSignals(convertBiddingSignals(customAudience.getUserBiddingSignals())).build();
            AbstractC2995aW.p(customAudienceBuild, "Builder()\n              …\n                .build()");
            return customAudienceBuild;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.customaudience.JoinCustomAudienceRequest convertJoinRequest(JoinCustomAudienceRequest joinCustomAudienceRequest) {
            android.adservices.customaudience.JoinCustomAudienceRequest joinCustomAudienceRequestBuild = AbstractC2495Ik.h().setCustomAudience(convertCustomAudience(joinCustomAudienceRequest.getCustomAudience())).build();
            AbstractC2995aW.p(joinCustomAudienceRequestBuild, "Builder()\n              …\n                .build()");
            return joinCustomAudienceRequestBuild;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.customaudience.LeaveCustomAudienceRequest convertLeaveRequest(LeaveCustomAudienceRequest leaveCustomAudienceRequest) {
            android.adservices.customaudience.LeaveCustomAudienceRequest leaveCustomAudienceRequestBuild = AbstractC2495Ik.i().setBuyer(convertAdTechIdentifier(leaveCustomAudienceRequest.getBuyer())).setName(leaveCustomAudienceRequest.getName()).build();
            AbstractC2995aW.p(leaveCustomAudienceRequestBuild, "Builder()\n              …\n                .build()");
            return leaveCustomAudienceRequestBuild;
        }

        private final android.adservices.customaudience.TrustedBiddingData convertTrustedSignals(TrustedBiddingData trustedBiddingData) {
            if (trustedBiddingData == null) {
                return null;
            }
            return AbstractC4105n4.q().setTrustedBiddingKeys(trustedBiddingData.getTrustedBiddingKeys()).setTrustedBiddingUri(trustedBiddingData.getTrustedBiddingUri()).build();
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object joinCustomAudience(JoinCustomAudienceRequest joinCustomAudienceRequest, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.customAudienceManager.joinCustomAudience(convertJoinRequest(joinCustomAudienceRequest), new N5(6), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            Object objS = c2798Uc.s();
            return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
        }

        @Override // androidx.privacysandbox.ads.adservices.customaudience.CustomAudienceManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object leaveCustomAudience(LeaveCustomAudienceRequest leaveCustomAudienceRequest, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.customAudienceManager.leaveCustomAudience(convertLeaveRequest(leaveCustomAudienceRequest), new N5(7), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            Object objS = c2798Uc.s();
            return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            AbstractC2995aW.q(context, f.X);
            Object systemService = context.getSystemService((Class<Object>) AbstractC4105n4.D());
            AbstractC2995aW.p(systemService, "context.getSystemService…:class.java\n            )");
            this(AbstractC2495Ik.g(systemService));
        }
    }
}
