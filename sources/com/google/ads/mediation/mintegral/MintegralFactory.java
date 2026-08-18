package com.google.ads.mediation.mintegral;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.MBNewInterstitialHandler;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialWithCodeListener;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class MintegralFactory {
    public static final MintegralFactory INSTANCE = new MintegralFactory();

    /* JADX INFO: renamed from: com.google.ads.mediation.mintegral.MintegralFactory$createBidInterstitialHandler$1, reason: invalid class name */
    public static final class AnonymousClass1 implements MintegralBidNewInterstitialAdWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBBidNewInterstitialHandler f756a;

        @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
        public void createAd(Context context, String str, String str2) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
            AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
            this.f756a = new MBBidNewInterstitialHandler(context, str, str2);
        }

        @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
        public void loadFromBid(String str) {
            AbstractC2995aW.q(str, "bidToken");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f756a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.loadFromBid(str);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
        public void playVideoMute(int i) {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f756a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.playVideoMute(i);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
        public void setExtraInfo(JSONObject jSONObject) {
            AbstractC2995aW.q(jSONObject, "jsonObject");
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f756a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setExtraInfo(jSONObject);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
        public void setInterstitialVideoListener(NewInterstitialWithCodeListener newInterstitialWithCodeListener) {
            AbstractC2995aW.q(newInterstitialWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f756a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.setInterstitialVideoListener(newInterstitialWithCodeListener);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralBidNewInterstitialAdWrapper
        public void showFromBid() {
            MBBidNewInterstitialHandler mBBidNewInterstitialHandler = this.f756a;
            if (mBBidNewInterstitialHandler != null) {
                mBBidNewInterstitialHandler.showFromBid();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.mintegral.MintegralFactory$createInterstitialHandler$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21021 implements MintegralNewInterstitialAdWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBNewInterstitialHandler f757a;

        @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
        public void createAd(Context context, String str, String str2) {
            AbstractC2995aW.q(context, f.X);
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
            AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
            this.f757a = new MBNewInterstitialHandler(context, str, str2);
        }

        @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
        public void load() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f757a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.load();
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
        public void playVideoMute(int i) {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f757a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.playVideoMute(i);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
        public void setInterstitialVideoListener(NewInterstitialWithCodeListener newInterstitialWithCodeListener) {
            AbstractC2995aW.q(newInterstitialWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f757a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.setInterstitialVideoListener(newInterstitialWithCodeListener);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralNewInterstitialAdWrapper
        public void show() {
            MBNewInterstitialHandler mBNewInterstitialHandler = this.f757a;
            if (mBNewInterstitialHandler != null) {
                mBNewInterstitialHandler.show();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.ads.mediation.mintegral.MintegralFactory$createSplashAdWrapper$1, reason: invalid class name and case insensitive filesystem */
    public static final class C21031 implements MintegralSplashAdWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public MBSplashHandler f758a;

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void createAd(String str, String str2) {
            AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
            AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID);
            this.f758a = new MBSplashHandler(str, str2, true, 5);
        }

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void onDestroy() {
            MBSplashHandler mBSplashHandler = this.f758a;
            if (mBSplashHandler != null) {
                mBSplashHandler.onDestroy();
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void preLoad() {
            MBSplashHandler mBSplashHandler = this.f758a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoad();
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void preLoadByToken(String str) {
            AbstractC2995aW.q(str, BidResponsed.KEY_TOKEN);
            MBSplashHandler mBSplashHandler = this.f758a;
            if (mBSplashHandler != null) {
                mBSplashHandler.preLoadByToken(str);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void setExtraInfo(JSONObject jSONObject) {
            AbstractC2995aW.q(jSONObject, "jsonObject");
            MBSplashHandler mBSplashHandler = this.f758a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setExtraInfo(jSONObject);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void setSplashLoadListener(MBSplashLoadWithCodeListener mBSplashLoadWithCodeListener) {
            AbstractC2995aW.q(mBSplashLoadWithCodeListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBSplashHandler mBSplashHandler = this.f758a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashLoadListener(mBSplashLoadWithCodeListener);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void setSplashShowListener(MBSplashShowListener mBSplashShowListener) {
            AbstractC2995aW.q(mBSplashShowListener, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            MBSplashHandler mBSplashHandler = this.f758a;
            if (mBSplashHandler != null) {
                mBSplashHandler.setSplashShowListener(mBSplashShowListener);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void show(ViewGroup viewGroup) {
            AbstractC2995aW.q(viewGroup, "group");
            MBSplashHandler mBSplashHandler = this.f758a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(viewGroup);
            }
        }

        @Override // com.google.ads.mediation.mintegral.MintegralSplashAdWrapper
        public void show(ViewGroup viewGroup, String str) {
            AbstractC2995aW.q(viewGroup, "group");
            AbstractC2995aW.q(str, "bidToken");
            MBSplashHandler mBSplashHandler = this.f758a;
            if (mBSplashHandler != null) {
                mBSplashHandler.show(viewGroup, str);
            }
        }
    }

    public static final MintegralBidNewInterstitialAdWrapper createBidInterstitialHandler() {
        return new AnonymousClass1();
    }

    public static final MintegralNewInterstitialAdWrapper createInterstitialHandler() {
        return new C21021();
    }

    public static final MintegralSplashAdWrapper createSplashAdWrapper() {
        return new C21031();
    }
}
