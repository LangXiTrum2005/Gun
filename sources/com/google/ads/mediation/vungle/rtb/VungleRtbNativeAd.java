package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleFactory;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3986lj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4074mj0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4980x2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ei0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.PQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.SO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.X8;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class VungleRtbNativeAd extends UnifiedNativeAdMapper implements TQ {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationNativeAdConfiguration f797a;
    public final MediationAdLoadCallback b;
    public MediationNativeAdCallback c;
    public PQ d;
    public SO e;
    public String f;
    public final VungleFactory g;

    public VungleRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, VungleFactory vungleFactory) {
        this.f797a = mediationNativeAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.g = vungleFactory;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdClicked(@NonNull X8 x8) {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.c.onAdOpened();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToLoad(@NonNull X8 x8, @NonNull Ei0 ei0) {
        this.b.onFailure(VungleMediationAdapter.getAdError(ei0));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdFailedToPlay(@NonNull X8 x8, @NonNull Ei0 ei0) {
        VungleMediationAdapter.getAdError(ei0).toString();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdImpression(@NonNull X8 x8) {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLeftApplication(@NonNull X8 x8) {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdLoaded(@NonNull X8 x8) {
        setHeadline(this.d.getAdTitle());
        setBody(this.d.getAdBodyText());
        setCallToAction(this.d.getAdCallToActionText());
        Double adStarRating = this.d.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.d.getAdSponsoredText());
        setMediaView(this.e);
        String appIcon = this.d.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(C4980x2.FILE_SCHEME)) {
            Uri uri = Uri.parse(appIcon);
            C4074mj0 c4074mj0 = new C4074mj0();
            c4074mj0.f4710a = uri;
            setIcon(c4074mj0);
        }
        if (TextUtils.isEmpty(this.f)) {
            setOverrideImpressionRecording(true);
        }
        setOverrideClickHandling(true);
        this.c = (MediationNativeAdCallback) this.b.onSuccess(this);
    }

    public void render() {
        int i;
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.f797a;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString("appid");
        boolean zIsEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        this.f = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement == 0) {
            i = 0;
        } else if (adChoicesPlacement != 2) {
            i = adChoicesPlacement != 3 ? 1 : 2;
        } else {
            i = 3;
        }
        VungleInitializer.getInstance().initialize(string, context, new C3986lj0(this, context, string2, i, mediationNativeAdConfiguration.getWatermark()));
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        super.trackViews(view, map, map2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            PQ pq = this.d;
            if (pq == null || !pq.canPlayAd().booleanValue()) {
                return;
            }
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (childAt instanceof FrameLayout) {
                ArrayList arrayList = new ArrayList();
                View value = null;
                for (Map.Entry<String, View> entry : map.entrySet()) {
                    arrayList.add(entry.getValue());
                    if (entry.getKey().equals("3003")) {
                        value = entry.getValue();
                    }
                }
                this.d.registerViewForInteraction((FrameLayout) childAt, this.e, value instanceof ImageView ? (ImageView) value : null, arrayList);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(@NonNull View view) {
        super.untrackView(view);
        PQ pq = this.d;
        if (pq == null) {
            return;
        }
        pq.unregisterView();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdEnd(@NonNull X8 x8) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.TQ, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y8
    public void onAdStart(@NonNull X8 x8) {
    }
}
