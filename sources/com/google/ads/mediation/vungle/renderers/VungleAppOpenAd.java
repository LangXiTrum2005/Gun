package com.google.ads.mediation.vungle.renderers;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAd;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationAppOpenAdConfiguration;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3573h1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ei0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.OD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8;

/* JADX INFO: loaded from: classes2.dex */
public abstract class VungleAppOpenAd implements MediationAppOpenAd, RD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationAppOpenAdConfiguration f793a;
    public final MediationAdLoadCallback b;
    public final VungleFactory c;
    public OD d;
    public MediationAppOpenAdCallback e;

    public VungleAppOpenAd(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration, MediationAdLoadCallback<MediationAppOpenAd, MediationAppOpenAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        AbstractC2995aW.q(mediationAppOpenAdConfiguration, "mediationAppOpenAdConfiguration");
        AbstractC2995aW.q(mediationAdLoadCallback, "mediationAdLoadCallback");
        AbstractC2995aW.q(vungleFactory, "vungleFactory");
        this.f793a = mediationAppOpenAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.c = vungleFactory;
    }

    public abstract String getAdMarkup(MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    public abstract void maybeAddWatermarkToVungleAdConfig(C3573h1 c3573h1, MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdClicked(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdClicked();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdEnd(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdClosed();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToLoad(X8 x8, Ei0 ei0) {
        AbstractC2995aW.q(x8, "baseAd");
        AbstractC2995aW.q(ei0, "adError");
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        AbstractC2995aW.p(adError, "getAdError(adError)");
        adError.toString();
        this.b.onFailure(adError);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToPlay(X8 x8, Ei0 ei0) {
        AbstractC2995aW.q(x8, "baseAd");
        AbstractC2995aW.q(ei0, "adError");
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        AbstractC2995aW.p(adError, "getAdError(adError)");
        adError.toString();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdFailedToShow(adError);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdImpression(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.reportAdImpression();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLeftApplication(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLoaded(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        this.e = (MediationAppOpenAdCallback) this.b.onSuccess(this);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.RD, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2688Pw, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdStart(X8 x8) {
        AbstractC2995aW.q(x8, "baseAd");
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.e;
        if (mediationAppOpenAdCallback == null || mediationAppOpenAdCallback == null) {
            return;
        }
        mediationAppOpenAdCallback.onAdOpened();
    }

    public final void render() {
        MediationAppOpenAdConfiguration mediationAppOpenAdConfiguration = this.f793a;
        final Bundle mediationExtras = mediationAppOpenAdConfiguration.getMediationExtras();
        AbstractC2995aW.p(mediationExtras, "mediationAppOpenAdConfiguration.mediationExtras");
        Bundle serverParameters = mediationAppOpenAdConfiguration.getServerParameters();
        AbstractC2995aW.p(serverParameters, "mediationAppOpenAdConfiguration.serverParameters");
        String string = serverParameters.getString("appid");
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (string == null || string.length() == 0) {
            AdError adError = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or invalid App ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        final String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (string2 == null || string2.length() == 0) {
            AdError adError2 = new AdError(101, "Failed to load app open ad from Liftoff Monetize. Missing or Invalid Placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
        } else {
            final Context context = mediationAppOpenAdConfiguration.getContext();
            AbstractC2995aW.p(context, "mediationAppOpenAdConfiguration.context");
            VungleInitializer vungleInitializer = VungleInitializer.getInstance();
            AbstractC2995aW.n(string);
            vungleInitializer.initialize(string, context, new VungleInitializer.VungleInitializationListener() { // from class: com.google.ads.mediation.vungle.renderers.VungleAppOpenAd.render.1
                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeError(AdError adError3) {
                    AbstractC2995aW.q(adError3, "error");
                    adError3.toString();
                    VungleAppOpenAd.this.b.onFailure(adError3);
                }

                @Override // com.google.ads.mediation.vungle.VungleInitializer.VungleInitializationListener
                public void onInitializeSuccess() {
                    VungleAppOpenAd vungleAppOpenAd = VungleAppOpenAd.this;
                    C3573h1 c3573h1CreateAdConfig = vungleAppOpenAd.c.createAdConfig();
                    Bundle bundle = mediationExtras;
                    if (bundle.containsKey(VungleConstants.KEY_ORIENTATION)) {
                        c3573h1CreateAdConfig.setAdOrientation(bundle.getInt(VungleConstants.KEY_ORIENTATION, 2));
                    }
                    vungleAppOpenAd.maybeAddWatermarkToVungleAdConfig(c3573h1CreateAdConfig, vungleAppOpenAd.f793a);
                    VungleFactory vungleFactory = vungleAppOpenAd.c;
                    String str = string2;
                    AbstractC2995aW.n(str);
                    vungleAppOpenAd.d = vungleFactory.createInterstitialAd(context, str, c3573h1CreateAdConfig);
                    OD od = vungleAppOpenAd.d;
                    if (od == null) {
                        AbstractC2995aW.x0("appOpenAd");
                        throw null;
                    }
                    od.setAdListener(vungleAppOpenAd);
                    OD od2 = vungleAppOpenAd.d;
                    if (od2 != null) {
                        od2.load(vungleAppOpenAd.getAdMarkup(vungleAppOpenAd.f793a));
                    } else {
                        AbstractC2995aW.x0("appOpenAd");
                        throw null;
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAppOpenAd
    public void showAd(Context context) {
        AbstractC2995aW.q(context, f.X);
        OD od = this.d;
        if (od == null) {
            AbstractC2995aW.x0("appOpenAd");
            throw null;
        }
        if (od.canPlayAd().booleanValue()) {
            OD od2 = this.d;
            if (od2 != null) {
                od2.play(context);
                return;
            } else {
                AbstractC2995aW.x0("appOpenAd");
                throw null;
            }
        }
        AdError adError = new AdError(107, "Failed to show app open ad from Liftoff Monetize.", VungleMediationAdapter.ERROR_DOMAIN);
        adError.toString();
        MediationAppOpenAdCallback mediationAppOpenAdCallback = this.e;
        if (mediationAppOpenAdCallback != null) {
            mediationAppOpenAdCallback.onAdFailedToShow(adError);
        }
    }
}
