package androidx.privacysandbox.ads.adservices.measurement;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import androidx.core.os.OutcomeReceiverKt;
import androidx.privacysandbox.ads.adservices.internal.AdServicesInfo;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2495Ik;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class MeasurementManager {
    public static final Companion Companion = new Companion(null);
    public static final int MEASUREMENT_API_STATE_DISABLED = 0;
    public static final int MEASUREMENT_API_STATE_ENABLED = 1;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        @SuppressLint({"NewApi", "ClassVerificationFailure"})
        public final MeasurementManager obtain(Context context) {
            AbstractC2995aW.q(context, f.X);
            AdServicesInfo adServicesInfo = AdServicesInfo.INSTANCE;
            adServicesInfo.version();
            if (adServicesInfo.version() >= 5) {
                return new Api33Ext5Impl(context);
            }
            return null;
        }
    }

    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final MeasurementManager obtain(Context context) {
        return Companion.obtain(context);
    }

    public abstract Object deleteRegistrations(DeletionRequest deletionRequest, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object getMeasurementApiStatus(InterfaceC2857Wj interfaceC2857Wj);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerSource(Uri uri, InputEvent inputEvent, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerTrigger(Uri uri, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, InterfaceC2857Wj interfaceC2857Wj);

    @RequiresExtension(extension = 1000000, version = 5)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    public static final class Api33Ext5Impl extends MeasurementManager {
        private final android.adservices.measurement.MeasurementManager mMeasurementManager;

        public Api33Ext5Impl(android.adservices.measurement.MeasurementManager measurementManager) {
            AbstractC2995aW.q(measurementManager, "mMeasurementManager");
            this.mMeasurementManager = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.DeletionRequest convertDeletionRequest(DeletionRequest deletionRequest) {
            android.adservices.measurement.DeletionRequest deletionRequestBuild = SM.b().setDeletionMode(deletionRequest.getDeletionMode()).setMatchBehavior(deletionRequest.getMatchBehavior()).setStart(deletionRequest.getStart()).setEnd(deletionRequest.getEnd()).setDomainUris(deletionRequest.getDomainUris()).setOriginUris(deletionRequest.getOriginUris()).build();
            AbstractC2995aW.p(deletionRequestBuild, "Builder()\n              …\n                .build()");
            return deletionRequestBuild;
        }

        private final List<android.adservices.measurement.WebSourceParams> convertWebSourceParams(List<WebSourceParams> list) {
            ArrayList arrayList = new ArrayList();
            for (WebSourceParams webSourceParams : list) {
                SM.B();
                android.adservices.measurement.WebSourceParams webSourceParamsBuild = SM.f(webSourceParams.getRegistrationUri()).setDebugKeyAllowed(webSourceParams.getDebugKeyAllowed()).build();
                AbstractC2995aW.p(webSourceParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webSourceParamsBuild);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.WebSourceRegistrationRequest convertWebSourceRequest(WebSourceRegistrationRequest webSourceRegistrationRequest) {
            SM.C();
            android.adservices.measurement.WebSourceRegistrationRequest webSourceRegistrationRequestBuild = SM.h(convertWebSourceParams(webSourceRegistrationRequest.getWebSourceParams()), webSourceRegistrationRequest.getTopOriginUri()).setWebDestination(webSourceRegistrationRequest.getWebDestination()).setAppDestination(webSourceRegistrationRequest.getAppDestination()).setInputEvent(webSourceRegistrationRequest.getInputEvent()).setVerifiedDestination(webSourceRegistrationRequest.getVerifiedDestination()).build();
            AbstractC2995aW.p(webSourceRegistrationRequestBuild, "Builder(\n               …\n                .build()");
            return webSourceRegistrationRequestBuild;
        }

        private final List<android.adservices.measurement.WebTriggerParams> convertWebTriggerParams(List<WebTriggerParams> list) {
            ArrayList arrayList = new ArrayList();
            for (WebTriggerParams webTriggerParams : list) {
                SM.s();
                android.adservices.measurement.WebTriggerParams webTriggerParamsBuild = AbstractC2495Ik.q(webTriggerParams.getRegistrationUri()).setDebugKeyAllowed(webTriggerParams.getDebugKeyAllowed()).build();
                AbstractC2995aW.p(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final android.adservices.measurement.WebTriggerRegistrationRequest convertWebTriggerRequest(WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            SM.D();
            android.adservices.measurement.WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = SM.i(convertWebTriggerParams(webTriggerRegistrationRequest.getWebTriggerParams()), webTriggerRegistrationRequest.getDestination()).build();
            AbstractC2995aW.p(webTriggerRegistrationRequestBuild, "Builder(\n               …\n                .build()");
            return webTriggerRegistrationRequestBuild;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @DoNotInline
        public Object deleteRegistrations(DeletionRequest deletionRequest, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mMeasurementManager.deleteRegistrations(convertDeletionRequest(deletionRequest), new N5(10), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            Object objS = c2798Uc.s();
            return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object getMeasurementApiStatus(InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mMeasurementManager.getMeasurementApiStatus(new N5(11), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            return c2798Uc.s();
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerSource(Uri uri, InputEvent inputEvent, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mMeasurementManager.registerSource(uri, inputEvent, new N5(8), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            Object objS = c2798Uc.s();
            return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerTrigger(Uri uri, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mMeasurementManager.registerTrigger(uri, new N5(12), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            Object objS = c2798Uc.s();
            return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerWebSource(WebSourceRegistrationRequest webSourceRegistrationRequest, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mMeasurementManager.registerWebSource(convertWebSourceRequest(webSourceRegistrationRequest), new N5(9), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            Object objS = c2798Uc.s();
            return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
        }

        @Override // androidx.privacysandbox.ads.adservices.measurement.MeasurementManager
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public Object registerWebTrigger(WebTriggerRegistrationRequest webTriggerRegistrationRequest, InterfaceC2857Wj interfaceC2857Wj) {
            C2798Uc c2798Uc = new C2798Uc(1, WD.w(interfaceC2857Wj));
            c2798Uc.t();
            this.mMeasurementManager.registerWebTrigger(convertWebTriggerRequest(webTriggerRegistrationRequest), new N5(13), OutcomeReceiverKt.asOutcomeReceiver(c2798Uc));
            Object objS = c2798Uc.s();
            return objS == EnumC4602sk.f4993a ? objS : C5033xf0.f5238a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public Api33Ext5Impl(Context context) {
            AbstractC2995aW.q(context, f.X);
            Object systemService = context.getSystemService((Class<Object>) AbstractC2495Ik.t());
            AbstractC2995aW.p(systemService, "context.getSystemService…:class.java\n            )");
            this(AbstractC2495Ik.l(systemService));
        }
    }
}
