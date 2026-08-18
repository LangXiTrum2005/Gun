package com.google.ads.mediation.pangle.renderer;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.google.ads.mediation.pangle.PangleConstants;
import com.google.ads.mediation.pangle.PangleFactory;
import com.google.ads.mediation.pangle.PangleInitializer;
import com.google.ads.mediation.pangle.PanglePrivacyConfig;
import com.google.ads.mediation.pangle.PangleSdkWrapper;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ET;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class PangleNativeAd extends UnifiedNativeAdMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediationNativeAdConfiguration f777a;
    public final MediationAdLoadCallback b;
    public final PangleInitializer c;
    public final PangleSdkWrapper d;
    public final PangleFactory e;
    public final PanglePrivacyConfig f;
    public MediationNativeAdCallback g;
    public PAGNativeAd h;

    public class PangleNativeMappedImage extends NativeAd.Image {
        public final Uri b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable f778a = null;
        public final double c = 1.0d;

        public PangleNativeMappedImage(Uri uri) {
            this.b = uri;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Drawable getDrawable() {
            return this.f778a;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        public double getScale() {
            return this.c;
        }

        @Override // com.google.android.gms.ads.formats.NativeAd.Image
        @NonNull
        public Uri getUri() {
            return this.b;
        }
    }

    public PangleNativeAd(@NonNull MediationNativeAdConfiguration mediationNativeAdConfiguration, @NonNull MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback, @NonNull PangleInitializer pangleInitializer, @NonNull PangleSdkWrapper pangleSdkWrapper, @NonNull PangleFactory pangleFactory, @NonNull PanglePrivacyConfig panglePrivacyConfig) {
        this.f777a = mediationNativeAdConfiguration;
        this.b = mediationAdLoadCallback;
        this.c = pangleInitializer;
        this.d = pangleSdkWrapper;
        this.e = pangleFactory;
        this.f = panglePrivacyConfig;
    }

    public void render() {
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.f777a;
        this.f.setCoppa(mediationNativeAdConfiguration.taggedForChildDirectedTreatment());
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        String string = serverParameters.getString(PangleConstants.PLACEMENT_ID);
        if (TextUtils.isEmpty(string)) {
            AdError adErrorCreateAdapterError = PangleConstants.createAdapterError(101, "Failed to load native ad from Pangle. Missing or invalid Placement ID.");
            adErrorCreateAdapterError.toString();
            this.b.onFailure(adErrorCreateAdapterError);
        } else {
            String bidResponse = mediationNativeAdConfiguration.getBidResponse();
            this.c.initialize(mediationNativeAdConfiguration.getContext(), serverParameters.getString("appid"), new DT(this, bidResponse, string));
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(@NonNull View view, @NonNull Map<String, View> map, @NonNull Map<String, View> map2) {
        HashMap map3 = new HashMap(map);
        map3.remove("3011");
        map3.remove("3012");
        View view2 = (View) map3.get("3002");
        ArrayList arrayList = new ArrayList();
        if (view2 != null) {
            arrayList.add(view2);
        }
        this.h.registerViewForInteraction((ViewGroup) view, new ArrayList(map3.values()), arrayList, (View) null, new NN(this, 17));
        getAdChoicesContent().setOnClickListener(new ET(this, 0));
    }
}
