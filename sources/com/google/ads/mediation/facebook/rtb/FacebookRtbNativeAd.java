package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.ads.mediation.facebook.MetaFactory;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4704tt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4880vt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4792ut;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Wm0;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class FacebookRtbNativeAd extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationNativeAdConfiguration f754a;
    public final MediationAdLoadCallback b;
    public NativeAdBase c;
    public MediationNativeAdCallback d;
    public MediaView e;
    public final MetaFactory f;

    public FacebookRtbNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, MetaFactory metaFactory) {
        this.b = mediationAdLoadCallback;
        this.f754a = mediationNativeAdConfiguration;
        this.f = metaFactory;
    }

    public void mapNativeAd(@NonNull Context context, @NonNull InterfaceC4792ut interfaceC4792ut) {
        NativeAdBase nativeAdBase = this.c;
        boolean z = (nativeAdBase.getAdHeadline() == null || nativeAdBase.getAdBodyText() == null || nativeAdBase.getAdIcon() == null || nativeAdBase.getAdCallToAction() == null) ? false : true;
        if (!(nativeAdBase instanceof NativeBannerAd) ? !(!z || nativeAdBase.getAdCoverImage() == null || this.e == null) : z) {
            AdError adError = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", "com.google.ads.mediation.facebook");
            adError.getMessage();
            Wm0 wm0 = (Wm0) interfaceC4792ut;
            wm0.getClass();
            adError.getMessage();
            ((C4880vt) wm0.b).c.b.onFailure(adError);
            return;
        }
        setHeadline(this.c.getAdHeadline());
        if (this.c.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C4704tt(Uri.parse(this.c.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.c.getAdBodyText());
        if (this.c.getPreloadedIconViewDrawable() != null) {
            Drawable preloadedIconViewDrawable = this.c.getPreloadedIconViewDrawable();
            C4704tt c4704tt = new C4704tt();
            c4704tt.f5055a = preloadedIconViewDrawable;
            setIcon(c4704tt);
        } else if (this.c.getAdIcon() == null) {
            setIcon(new C4704tt());
        } else {
            setIcon(new C4704tt(Uri.parse(this.c.getAdIcon().getUrl())));
        }
        setCallToAction(this.c.getAdCallToAction());
        setAdvertiser(this.c.getAdvertiserName());
        this.e.setListener(new NN(this, 15));
        setHasVideoContent(true);
        setMediaView(this.e);
        Bundle bundle = new Bundle();
        bundle.putCharSequence("id", this.c.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.c.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.c, null));
        FacebookRtbNativeAd facebookRtbNativeAd = ((C4880vt) ((Wm0) interfaceC4792ut).b).c;
        facebookRtbNativeAd.d = (MediationNativeAdCallback) facebookRtbNativeAd.b.onSuccess(facebookRtbNativeAd);
    }

    public void render() {
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.f754a;
        String placementID = FacebookMediationAdapter.getPlacementID(mediationNativeAdConfiguration.getServerParameters());
        boolean zIsEmpty = TextUtils.isEmpty(placementID);
        MediationAdLoadCallback mediationAdLoadCallback = this.b;
        if (zIsEmpty) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            adError.getMessage();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationNativeAdConfiguration);
        this.e = this.f.createMediaView(mediationNativeAdConfiguration.getContext());
        try {
            this.c = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementID, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getWatermark())) {
                this.c.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.c;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new C4880vt(this, mediationNativeAdConfiguration.getContext(), this.c)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e.getMessage(), "com.google.ads.mediation.facebook");
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.c;
        if (!(nativeAdBase instanceof NativeBannerAd)) {
            if (nativeAdBase instanceof NativeAd) {
                NativeAd nativeAd = (NativeAd) nativeAdBase;
                if (view2 instanceof ImageView) {
                    nativeAd.registerViewForInteraction(view, this.e, (ImageView) view2, arrayList);
                    return;
                } else {
                    nativeAd.registerViewForInteraction(view, this.e, arrayList);
                    return;
                }
            }
            return;
        }
        if (view2 == null) {
            return;
        }
        if (view2 instanceof ImageView) {
            ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
            return;
        }
        Class<?> cls = view2.getClass();
        StringBuilder sb = new StringBuilder("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: ");
        sb.append(cls);
        sb.append(".");
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(@NonNull View view) {
        NativeAdBase nativeAdBase = this.c;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
