package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresPermission;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import androidx.privacysandbox.ads.adservices.measurement.DeletionRequest;
import androidx.privacysandbox.ads.adservices.measurement.MeasurementManager;
import androidx.privacysandbox.ads.adservices.measurement.WebSourceRegistrationRequest;
import androidx.privacysandbox.ads.adservices.measurement.WebTriggerRegistrationRequest;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4437qp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.J0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes.dex */
public abstract class MeasurementManagerFutures {
    public static final Companion Companion = new Companion(null);

    public static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {
        private final MeasurementManager mMeasurementManager;

        public Api33Ext5JavaImpl(MeasurementManager measurementManager) {
            AbstractC2995aW.q(measurementManager, "mMeasurementManager");
            this.mMeasurementManager = measurementManager;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public AI deleteRegistrationsAsync(DeletionRequest deletionRequest) {
            AbstractC2995aW.q(deletionRequest, "deletionRequest");
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, deletionRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public AI getMeasurementApiStatusAsync() {
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public AI registerSourceAsync(Uri uri, InputEvent inputEvent) {
            AbstractC2995aW.q(uri, "attributionSource");
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, uri, inputEvent, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public AI registerTriggerAsync(Uri uri) {
            AbstractC2995aW.q(uri, "trigger");
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, uri, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public AI registerWebSourceAsync(WebSourceRegistrationRequest webSourceRegistrationRequest) {
            AbstractC2995aW.q(webSourceRegistrationRequest, J0.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, webSourceRegistrationRequest, null), 3), null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
        @DoNotInline
        public AI registerWebTriggerAsync(WebTriggerRegistrationRequest webTriggerRegistrationRequest) {
            AbstractC2995aW.q(webTriggerRegistrationRequest, J0.REQUEST_KEY_EXTRA);
            return CoroutineAdapterKt.asListenableFuture$default(WD.g(WD.a(AbstractC4437qp.f4904a), null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, webTriggerRegistrationRequest, null), 3), null, 1, null);
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final MeasurementManagerFutures from(Context context) {
            AbstractC2995aW.q(context, f.X);
            MeasurementManager measurementManagerObtain = MeasurementManager.Companion.obtain(context);
            if (measurementManagerObtain != null) {
                return new Api33Ext5JavaImpl(measurementManagerObtain);
            }
            return null;
        }
    }

    public static final MeasurementManagerFutures from(Context context) {
        return Companion.from(context);
    }

    public abstract AI deleteRegistrationsAsync(DeletionRequest deletionRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract AI getMeasurementApiStatusAsync();

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract AI registerSourceAsync(Uri uri, InputEvent inputEvent);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract AI registerTriggerAsync(Uri uri);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract AI registerWebSourceAsync(WebSourceRegistrationRequest webSourceRegistrationRequest);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_ATTRIBUTION")
    public abstract AI registerWebTriggerAsync(WebTriggerRegistrationRequest webTriggerRegistrationRequest);
}
