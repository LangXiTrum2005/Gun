package com.unity3d.ads.core.domain.attribution;

import android.adservices.AdServicesState;
import android.adservices.measurement.MeasurementManager;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.OutcomeReceiver;
import android.os.ext.SdkExtensions;
import android.view.InputEvent;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.WebViewContainer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ISDKDispatchers;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2495Ik;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4714u1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4731u90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.K20;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"NewApi", "MissingPermission"})
public final class AndroidAttribution {
    private final ISDKDispatchers dispatchers;
    private final InterfaceC3069bH measurementManager$delegate;
    private final SessionRepository sessionRepository;

    public AndroidAttribution(Context context, ISDKDispatchers iSDKDispatchers, SessionRepository sessionRepository) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(iSDKDispatchers, "dispatchers");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.dispatchers = iSDKDispatchers;
        this.sessionRepository = sessionRepository;
        this.measurementManager$delegate = AbstractC2340Cl.I(new AndroidAttribution$measurementManager$2(this, context));
    }

    private final MeasurementManager getMeasurementManager() {
        return AbstractC4714u1.p(this.measurementManager$delegate.getValue());
    }

    private final Uri getUri(String str, AdObject adObject) {
        Uri uri = Uri.parse(str);
        AbstractC2995aW.p(uri, "parse(this)");
        Uri uriBuild = uri.buildUpon().appendQueryParameter("sessionToken", ProtobufExtensionsKt.toBase64$default(this.sessionRepository.getSessionToken(), false, 1, null)).appendQueryParameter(HandleInvocationsFromAdViewer.KEY_TRACKING_TOKEN, ProtobufExtensionsKt.toBase64$default(adObject.getTrackingToken(), false, 1, null)).build();
        AbstractC2995aW.p(uriBuild, "baseUrl.toUri()\n        …4())\n            .build()");
        return uriBuild;
    }

    public final Object isAvailable(InterfaceC2857Wj interfaceC2857Wj) {
        C5033xf0 c5033xf0;
        if (Device.getApiLevel() < 33) {
            return Boolean.FALSE;
        }
        if (SdkExtensions.getExtensionVersion(1000000) < 4) {
            return Boolean.FALSE;
        }
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        if (!AdServicesState.isAdServicesStateEnabled()) {
            return Boolean.FALSE;
        }
        final K20 k20 = new K20(WD.w(interfaceC2857Wj));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.getMeasurementApiStatus(WD.f(this.dispatchers.getDefault()), new OutcomeReceiver<Integer, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$isAvailable$2$1
                @Override // android.os.OutcomeReceiver
                public /* bridge */ /* synthetic */ void onResult(Integer num) {
                    onResult(num.intValue());
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception exc) {
                    AbstractC2995aW.q(exc, "error");
                    k20.resumeWith(Boolean.FALSE);
                }

                public void onResult(int i) {
                    k20.resumeWith(Boolean.valueOf(i == 1));
                }
            });
            c5033xf0 = C5033xf0.f5238a;
        } else {
            c5033xf0 = null;
        }
        if (c5033xf0 == null) {
            k20.resumeWith(Boolean.FALSE);
        }
        return k20.a();
    }

    public final Object registerClick(String str, AdObject adObject, InterfaceC2857Wj interfaceC2857Wj) {
        WebViewContainer webViewContainer;
        InterfaceC4731u90 lastInputEvent;
        InputEvent inputEvent;
        C5033xf0 c5033xf0;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (webViewContainer = adPlayer.getWebViewContainer()) == null || (lastInputEvent = webViewContainer.getLastInputEvent()) == null || (inputEvent = (InputEvent) lastInputEvent.getValue()) == null) {
            return Boolean.FALSE;
        }
        final K20 k20 = new K20(WD.w(interfaceC2857Wj));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), inputEvent, WD.f(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerClick$2$1
                @Override // android.os.OutcomeReceiver
                public void onResult(Object obj) {
                    AbstractC2995aW.q(obj, "p0");
                    k20.resumeWith(Boolean.TRUE);
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception exc) {
                    AbstractC2995aW.q(exc, "error");
                    k20.resumeWith(Boolean.FALSE);
                }
            });
            c5033xf0 = C5033xf0.f5238a;
        } else {
            c5033xf0 = null;
        }
        if (c5033xf0 == null) {
            k20.resumeWith(Boolean.FALSE);
        }
        return k20.a();
    }

    public final Object registerView(String str, AdObject adObject, InterfaceC2857Wj interfaceC2857Wj) {
        C5033xf0 c5033xf0;
        if (getMeasurementManager() == null) {
            return Boolean.FALSE;
        }
        final K20 k20 = new K20(WD.w(interfaceC2857Wj));
        MeasurementManager measurementManager = getMeasurementManager();
        if (measurementManager != null) {
            measurementManager.registerSource(getUri(str, adObject), null, WD.f(this.dispatchers.getDefault()), new OutcomeReceiver<Object, Exception>() { // from class: com.unity3d.ads.core.domain.attribution.AndroidAttribution$registerView$2$1
                @Override // android.os.OutcomeReceiver
                public void onResult(Object obj) {
                    AbstractC2995aW.q(obj, "p0");
                    k20.resumeWith(Boolean.TRUE);
                }

                @Override // android.os.OutcomeReceiver
                public void onError(Exception exc) {
                    AbstractC2995aW.q(exc, "error");
                    k20.resumeWith(Boolean.FALSE);
                }
            });
            c5033xf0 = C5033xf0.f5238a;
        } else {
            c5033xf0 = null;
        }
        if (c5033xf0 == null) {
            k20.resumeWith(Boolean.FALSE);
        }
        return k20.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasurementManager getMeasurementManager(Context context) {
        if (Device.getApiLevel() >= 33 && SdkExtensions.getExtensionVersion(1000000) >= 4) {
            return AbstractC4714u1.p(context.getSystemService(AbstractC2495Ik.t()));
        }
        return null;
    }
}
