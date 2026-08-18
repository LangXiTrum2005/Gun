package androidx.privacysandbox.ads.adservices.appsetid;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4105n4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppSetIdManager {
    public static final Companion Companion = new Companion(null);

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final AppSetIdManager obtain(Context context) {
            AbstractC2995aW.q(context, f.X);
            if (AdServicesInfo.INSTANCE.version() >= 4) {
                return new Api33Ext4Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final AppSetIdManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object getAppSetId(InterfaceC2857Wj interfaceC2857Wj);

    @RequiresExtension(extension = 1000000, version = 4)
    @SuppressLint({"ClassVerificationFailure", "NewApi"})
    public static final class Api33Ext4Impl extends AppSetIdManager {
        private final android.adservices.appsetid.AppSetIdManager mAppSetIdManager;

        public Api33Ext4Impl(android.adservices.appsetid.AppSetIdManager appSetIdManager) {
            AbstractC2995aW.q(appSetIdManager, "mAppSetIdManager");
            this.mAppSetIdManager = appSetIdManager;
        }

        private final AppSetId convertResponse(android.adservices.appsetid.AppSetId appSetId) {
            if (appSetId.getScope() == 1) {
                String id = appSetId.getId();
                AbstractC2995aW.p(id, "response.id");
                return new AppSetId(id, 1);
            }
            String id2 = appSetId.getId();
            AbstractC2995aW.p(id2, "response.id");
            return new AppSetId(id2, 2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object getAppSetIdAsyncInternal(InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mAppSetIdManager.getAppSetId(new N5(5), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            return c2798Uc.s();
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManager
        @DoNotInline
        public Object getAppSetId(InterfaceC2857Wj interfaceC2857Wj) {
            AppSetIdManager$Api33Ext4Impl$getAppSetId$1 appSetIdManager$Api33Ext4Impl$getAppSetId$1;
            Api33Ext4Impl api33Ext4Impl;
            if (interfaceC2857Wj instanceof AppSetIdManager$Api33Ext4Impl$getAppSetId$1) {
                appSetIdManager$Api33Ext4Impl$getAppSetId$1 = (AppSetIdManager$Api33Ext4Impl$getAppSetId$1) interfaceC2857Wj;
                int i = appSetIdManager$Api33Ext4Impl$getAppSetId$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    appSetIdManager$Api33Ext4Impl$getAppSetId$1.label = i - Integer.MIN_VALUE;
                } else {
                    appSetIdManager$Api33Ext4Impl$getAppSetId$1 = new AppSetIdManager$Api33Ext4Impl$getAppSetId$1(this, interfaceC2857Wj);
                }
            } else {
                appSetIdManager$Api33Ext4Impl$getAppSetId$1 = new AppSetIdManager$Api33Ext4Impl$getAppSetId$1(this, interfaceC2857Wj);
            }
            Object appSetIdAsyncInternal = appSetIdManager$Api33Ext4Impl$getAppSetId$1.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = appSetIdManager$Api33Ext4Impl$getAppSetId$1.label;
            if (i2 == 0) {
                AbstractC3375el.b0(appSetIdAsyncInternal);
                appSetIdManager$Api33Ext4Impl$getAppSetId$1.L$0 = this;
                appSetIdManager$Api33Ext4Impl$getAppSetId$1.label = 1;
                appSetIdAsyncInternal = getAppSetIdAsyncInternal(appSetIdManager$Api33Ext4Impl$getAppSetId$1);
                if (appSetIdAsyncInternal == enumC4602sk) {
                    return enumC4602sk;
                }
                api33Ext4Impl = this;
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                api33Ext4Impl = (Api33Ext4Impl) appSetIdManager$Api33Ext4Impl$getAppSetId$1.L$0;
                AbstractC3375el.b0(appSetIdAsyncInternal);
            }
            return api33Ext4Impl.convertResponse(AbstractC4105n4.c(appSetIdAsyncInternal));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext4Impl(Context context) {
            AbstractC2995aW.q(context, f.X);
            Object systemService = context.getSystemService((Class<Object>) AbstractC4105n4.u());
            AbstractC2995aW.p(systemService, "context.getSystemService…:class.java\n            )");
            this(AbstractC4105n4.d(systemService));
        }
    }
}
