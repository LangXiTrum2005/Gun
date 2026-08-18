package androidx.privacysandbox.ads.adservices.adid;

import android.annotation.SuppressLint;
import android.content.Context;
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
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdIdManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AdIdManager obtain(Context context) {
            AbstractC2995aW.q(context, f.X);
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final AdIdManager obtain(Context context) {
        return Companion.obtain(context);
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
    public abstract Object getAdId(InterfaceC2857Wj interfaceC2857Wj);

    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public static final class Api33Ext4Impl extends AdIdManager {
        private final android.adservices.adid.AdIdManager mAdIdManager;

        public Api33Ext4Impl(android.adservices.adid.AdIdManager adIdManager) {
            AbstractC2995aW.q(adIdManager, "mAdIdManager");
            this.mAdIdManager = adIdManager;
        }

        private final AdId convertResponse(android.adservices.adid.AdId adId) {
            String adId2 = adId.getAdId();
            AbstractC2995aW.p(adId2, "response.adId");
            return new AdId(adId2, adId.isLimitAdTrackingEnabled());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        public final Object getAdIdAsyncInternal(InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mAdIdManager.getAdId(new N5(2), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            return c2798Uc.s();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.privacysandbox.ads.adservices.adid.AdIdManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_AD_ID")
        @DoNotInline
        public Object getAdId(InterfaceC2857Wj interfaceC2857Wj) {
            AdIdManager$Api33Ext4Impl$getAdId$1 adIdManager$Api33Ext4Impl$getAdId$1;
            Api33Ext4Impl api33Ext4Impl;
            if (interfaceC2857Wj instanceof AdIdManager$Api33Ext4Impl$getAdId$1) {
                adIdManager$Api33Ext4Impl$getAdId$1 = (AdIdManager$Api33Ext4Impl$getAdId$1) interfaceC2857Wj;
                int i = adIdManager$Api33Ext4Impl$getAdId$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    adIdManager$Api33Ext4Impl$getAdId$1.label = i - Integer.MIN_VALUE;
                } else {
                    adIdManager$Api33Ext4Impl$getAdId$1 = new AdIdManager$Api33Ext4Impl$getAdId$1(this, interfaceC2857Wj);
                }
            } else {
                adIdManager$Api33Ext4Impl$getAdId$1 = new AdIdManager$Api33Ext4Impl$getAdId$1(this, interfaceC2857Wj);
            }
            Object adIdAsyncInternal = adIdManager$Api33Ext4Impl$getAdId$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = adIdManager$Api33Ext4Impl$getAdId$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(adIdAsyncInternal);
                adIdManager$Api33Ext4Impl$getAdId$1.L$0 = this;
                adIdManager$Api33Ext4Impl$getAdId$1.label = 1;
                adIdAsyncInternal = getAdIdAsyncInternal(adIdManager$Api33Ext4Impl$getAdId$1);
                if (adIdAsyncInternal == enumC4602sk) {
                    return enumC4602sk;
                }
                api33Ext4Impl = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                api33Ext4Impl = (Api33Ext4Impl) adIdManager$Api33Ext4Impl$getAdId$1.L$0;
                AbstractC3375el.b0(adIdAsyncInternal);
            }
            return api33Ext4Impl.convertResponse(AbstractC4714u1.b(adIdAsyncInternal));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            AbstractC2995aW.q(context, f.X);
            Object systemService = context.getSystemService((Class<Object>) AbstractC4714u1.r());
            AbstractC2995aW.p(systemService, "context.getSystemService…:class.java\n            )");
            this(AbstractC4714u1.c(systemService));
        }
    }
}
