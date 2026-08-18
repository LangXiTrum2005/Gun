package androidx.privacysandbox.ads.adservices.adselection;

import android.adservices.common.AdSelectionSignals;
import android.adservices.common.AdTechIdentifier;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4714u1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdSelectionManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AdSelectionManager obtain(Context context) {
            AbstractC2995aW.q(context, f.X);
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final AdSelectionManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object reportImpression(ReportImpressionRequest reportImpressionRequest, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    public abstract Object selectAds(AdSelectionConfig adSelectionConfig, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final class Api33Ext4Impl extends AdSelectionManager {
        private final android.adservices.adselection.AdSelectionManager mAdSelectionManager;

        public Api33Ext4Impl(android.adservices.adselection.AdSelectionManager adSelectionManager) {
            AbstractC2995aW.q(adSelectionManager, "mAdSelectionManager");
            this.mAdSelectionManager = adSelectionManager;
        }

        private final android.adservices.adselection.AdSelectionConfig convertAdSelectionConfig(AdSelectionConfig adSelectionConfig) {
            android.adservices.adselection.AdSelectionConfig adSelectionConfigBuild = AbstractC4714u1.d().setAdSelectionSignals(convertAdSelectionSignals(adSelectionConfig.getAdSelectionSignals())).setCustomAudienceBuyers(convertBuyers(adSelectionConfig.getCustomAudienceBuyers())).setDecisionLogicUri(adSelectionConfig.getDecisionLogicUri()).setSeller(AdTechIdentifier.fromString(adSelectionConfig.getSeller().getIdentifier())).setPerBuyerSignals(convertPerBuyerSignals(adSelectionConfig.getPerBuyerSignals())).setSellerSignals(convertAdSelectionSignals(adSelectionConfig.getSellerSignals())).setTrustedScoringSignalsUri(adSelectionConfig.getTrustedScoringSignalsUri()).build();
            AbstractC2995aW.p(adSelectionConfigBuild, "Builder()\n              …\n                .build()");
            return adSelectionConfigBuild;
        }

        private final AdSelectionSignals convertAdSelectionSignals(androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals) {
            AdSelectionSignals adSelectionSignalsFromString = AdSelectionSignals.fromString(adSelectionSignals.getSignals());
            AbstractC2995aW.p(adSelectionSignalsFromString, "fromString(request.signals)");
            return adSelectionSignalsFromString;
        }

        private final List<AdTechIdentifier> convertBuyers(List<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> list) {
            ArrayList arrayList = new ArrayList();
            Iterator<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier> it = list.iterator();
            while (it.hasNext()) {
                AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(it.next().getIdentifier());
                AbstractC2995aW.p(adTechIdentifierFromString, "fromString(buyer.identifier)");
                arrayList.add(adTechIdentifierFromString);
            }
            return arrayList;
        }

        private final Map<AdTechIdentifier, AdSelectionSignals> convertPerBuyerSignals(Map<androidx.privacysandbox.ads.adservices.common.AdTechIdentifier, androidx.privacysandbox.ads.adservices.common.AdSelectionSignals> map) {
            AdSelectionSignals adSelectionSignalsConvertAdSelectionSignals;
            HashMap map2 = new HashMap();
            for (androidx.privacysandbox.ads.adservices.common.AdTechIdentifier adTechIdentifier : map.keySet()) {
                AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(adTechIdentifier.getIdentifier());
                AbstractC2995aW.p(adTechIdentifierFromString, "fromString(key.identifier)");
                if (map.get(adTechIdentifier) != null) {
                    androidx.privacysandbox.ads.adservices.common.AdSelectionSignals adSelectionSignals = map.get(adTechIdentifier);
                    AbstractC2995aW.n(adSelectionSignals);
                    adSelectionSignalsConvertAdSelectionSignals = convertAdSelectionSignals(adSelectionSignals);
                } else {
                    adSelectionSignalsConvertAdSelectionSignals = null;
                }
                map2.put(adTechIdentifierFromString, adSelectionSignalsConvertAdSelectionSignals);
            }
            return map2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.adselection.ReportImpressionRequest convertReportImpressionRequest(ReportImpressionRequest reportImpressionRequest) {
            AbstractC4714u1.t();
            return AbstractC4714u1.m(reportImpressionRequest.getAdSelectionId(), convertAdSelectionConfig(reportImpressionRequest.getAdSelectionConfig()));
        }

        private final AdSelectionOutcome convertResponse(android.adservices.adselection.AdSelectionOutcome adSelectionOutcome) {
            long adSelectionId = adSelectionOutcome.getAdSelectionId();
            Uri renderUri = adSelectionOutcome.getRenderUri();
            AbstractC2995aW.p(renderUri, "response.renderUri");
            return new AdSelectionOutcome(adSelectionId, renderUri);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        public final Object selectAdsInternal(android.adservices.adselection.AdSelectionConfig adSelectionConfig, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mAdSelectionManager.selectAds(adSelectionConfig, new N5(4), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            return c2798Uc.s();
        }

        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object reportImpression(ReportImpressionRequest reportImpressionRequest, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mAdSelectionManager.reportImpression(convertReportImpressionRequest(reportImpressionRequest), new N5(3), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            Object objS = c2798Uc.s();
            return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.privacysandbox.ads.adservices.adselection.AdSelectionManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
        @DoNotInline
        public Object selectAds(AdSelectionConfig adSelectionConfig, InterfaceC2857Wj interfaceC2857Wj) {
            AdSelectionManager$Api33Ext4Impl$selectAds$1 adSelectionManager$Api33Ext4Impl$selectAds$1;
            Api33Ext4Impl api33Ext4Impl;
            if (interfaceC2857Wj instanceof AdSelectionManager$Api33Ext4Impl$selectAds$1) {
                adSelectionManager$Api33Ext4Impl$selectAds$1 = (AdSelectionManager$Api33Ext4Impl$selectAds$1) interfaceC2857Wj;
                int i = adSelectionManager$Api33Ext4Impl$selectAds$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    adSelectionManager$Api33Ext4Impl$selectAds$1.label = i - Integer.MIN_VALUE;
                } else {
                    adSelectionManager$Api33Ext4Impl$selectAds$1 = new AdSelectionManager$Api33Ext4Impl$selectAds$1(this, interfaceC2857Wj);
                }
            } else {
                adSelectionManager$Api33Ext4Impl$selectAds$1 = new AdSelectionManager$Api33Ext4Impl$selectAds$1(this, interfaceC2857Wj);
            }
            Object objSelectAdsInternal = adSelectionManager$Api33Ext4Impl$selectAds$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = adSelectionManager$Api33Ext4Impl$selectAds$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(objSelectAdsInternal);
                android.adservices.adselection.AdSelectionConfig adSelectionConfigConvertAdSelectionConfig = convertAdSelectionConfig(adSelectionConfig);
                adSelectionManager$Api33Ext4Impl$selectAds$1.L$0 = this;
                adSelectionManager$Api33Ext4Impl$selectAds$1.label = 1;
                objSelectAdsInternal = selectAdsInternal(adSelectionConfigConvertAdSelectionConfig, adSelectionManager$Api33Ext4Impl$selectAds$1);
                if (objSelectAdsInternal == enumC4602sk) {
                    return enumC4602sk;
                }
                api33Ext4Impl = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                api33Ext4Impl = (Api33Ext4Impl) adSelectionManager$Api33Ext4Impl$selectAds$1.L$0;
                AbstractC3375el.b0(objSelectAdsInternal);
            }
            return api33Ext4Impl.convertResponse(AbstractC4714u1.l(objSelectAdsInternal));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            AbstractC2995aW.q(context, f.X);
            Object systemService = context.getSystemService((Class<Object>) AbstractC4714u1.D());
            AbstractC2995aW.p(systemService, "context.getSystemService…:class.java\n            )");
            this(AbstractC4714u1.k(systemService));
        }
    }
}
