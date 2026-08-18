package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.f;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensionsKt;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.scar.adapter.common.scarads.UnityAdFormat;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.di.ServiceProvider;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2749Sf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2350Cv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2765Sv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2798Uc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4232oa0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4706tv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidScarManager implements ScarManager {
    private final GMAScarAdapterBridge gmaBridge;
    private final CommonScarEventReceiver scarEventReceiver;
    private final ScarTimeHackFixer scarTimeHackFixer;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {136}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ List<InitializationResponseOuterClass.AdFormat> $adFormat;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(List<? extends InitializationResponseOuterClass.AdFormat> list, AndroidScarManager androidScarManager, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(this.$adFormat, this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                List<InitializationResponseOuterClass.AdFormat> list = this.$adFormat;
                AndroidScarManager androidScarManager = this.this$0;
                this.L$0 = list;
                this.L$1 = androidScarManager;
                this.label = 1;
                final C2798Uc c2798Uc = new C2798Uc(1, WD.w(this));
                c2798Uc.t();
                if (list != null) {
                    List<InitializationResponseOuterClass.AdFormat> list2 = list;
                    arrayList = new ArrayList(AbstractC2749Sf.Y(10, list2));
                    Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(AdFormatExtensionsKt.toUnityAdFormat((InitializationResponseOuterClass.AdFormat) it.next()));
                    }
                } else {
                    arrayList = null;
                }
                androidScarManager.gmaBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsFailure(String str) {
                        c2798Uc.resumeWith(AbstractC3375el.v(new Exception(str)));
                    }

                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsReady(BiddingSignals biddingSignals) {
                        c2798Uc.resumeWith(biddingSignals);
                    }
                }));
                obj = c2798Uc.s();
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {43}, m = "invokeSuspend")
    public static final class C21892 extends Ea0 implements InterfaceC3567gx {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
            int label;
            final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidScarManager androidScarManager, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.this$0 = androidScarManager;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new AnonymousClass1(this.this$0, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                return ((AnonymousClass1) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                this.this$0.gmaBridge.getVersion();
                return C5033xf0.f5238a;
            }
        }

        public C21892(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidScarManager.this.new C21892(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21892) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                C4232oa0 c4232oa0 = new C4232oa0(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new AnonymousClass1(AndroidScarManager.this, null));
                this.label = 1;
                obj = AbstractC3375el.y(c4232oa0, this);
                if (obj == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", l = {Input.Keys.MEDIA_FAST_FORWARD}, m = "loadAd")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C21902 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $adString;
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ boolean $canSkip;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        final /* synthetic */ int $videoLength;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21902(boolean z, String str, String str2, String str3, String str4, int i, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$canSkip = z;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidScarManager.this.new C21902(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21902) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength));
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$placementId = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementId, interfaceC2857Wj);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(GmaEventData gmaEventData, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass3) create(gmaEventData, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            boolean z = true;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            GmaEventData gmaEventData = (GmaEventData) this.L$0;
            if ((!AbstractC2340Cl.K(GMAEvent.AD_LOADED, GMAEvent.LOAD_ERROR).contains(gmaEventData.getGmaEvent()) || !AbstractC2995aW.i(gmaEventData.getPlacementId(), this.$placementId)) && !AbstractC2340Cl.K(GMAEvent.METHOD_ERROR, GMAEvent.SCAR_NOT_PRESENT, GMAEvent.INTERNAL_LOAD_ERROR).contains(gmaEventData.getGmaEvent())) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C21911 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ ScarAdMetadata $scarAdMetadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21911(Context context, BannerView bannerView, String str, ScarAdMetadata scarAdMetadata, UnityBannerSize unityBannerSize, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = scarAdMetadata;
            this.$bannerSize = unityBannerSize;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidScarManager.this.new C21911(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21911) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$3, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$3", f = "AndroidScarManager.kt", l = {EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE}, m = "invokeSuspend")
    public static final class C21923 extends Ea0 implements InterfaceC3655hx {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C21923(InterfaceC2857Wj interfaceC2857Wj) {
            super(3, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, GmaEventData gmaEventData, InterfaceC2857Wj interfaceC2857Wj) {
            C21923 c21923 = new C21923(interfaceC2857Wj);
            c21923.L$0 = interfaceC4530rv;
            c21923.L$1 = gmaEventData;
            return c21923.invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            GmaEventData gmaEventData;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC4530rv interfaceC4530rv = (InterfaceC4530rv) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (interfaceC4530rv.emit(gmaEventData2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                AbstractC3375el.b0(obj);
            }
            return Boolean.valueOf(!U5.i0(new BannerBridge.BannerEvent[]{BannerBridge.BannerEvent.SCAR_BANNER_LOAD_FAILED, BannerBridge.BannerEvent.SCAR_BANNER_CLOSED}, gmaEventData.getBannerEvent()));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    public static final class C21931 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21931(String str, String str2, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$placementId = str;
            this.$queryId = str2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidScarManager.this.new C21931(this.$placementId, this.$queryId, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21931) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {129}, m = "invokeSuspend")
    public static final class C21942 extends Ea0 implements InterfaceC3655hx {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        public C21942(InterfaceC2857Wj interfaceC2857Wj) {
            super(3, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, GmaEventData gmaEventData, InterfaceC2857Wj interfaceC2857Wj) {
            C21942 c21942 = new C21942(interfaceC2857Wj);
            c21942.L$0 = interfaceC4530rv;
            c21942.L$1 = gmaEventData;
            return c21942.invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            GmaEventData gmaEventData;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                InterfaceC4530rv interfaceC4530rv = (InterfaceC4530rv) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (interfaceC4530rv.emit(gmaEventData2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                AbstractC3375el.b0(obj);
            }
            return Boolean.valueOf(!U5.i0(new GMAEvent[]{GMAEvent.AD_CLOSED, GMAEvent.NO_AD_ERROR, GMAEvent.INTERSTITIAL_SHOW_ERROR, GMAEvent.REWARDED_SHOW_ERROR}, gmaEventData.getGmaEvent()));
        }
    }

    public AndroidScarManager(CommonScarEventReceiver commonScarEventReceiver, GMAScarAdapterBridge gMAScarAdapterBridge, ScarTimeHackFixer scarTimeHackFixer) {
        AbstractC2995aW.q(commonScarEventReceiver, "scarEventReceiver");
        AbstractC2995aW.q(gMAScarAdapterBridge, "gmaBridge");
        AbstractC2995aW.q(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = commonScarEventReceiver;
        this.gmaBridge = gMAScarAdapterBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getSignals(List<? extends InitializationResponseOuterClass.AdFormat> list, InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC2995aW.F0(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AnonymousClass2(list, this, null), interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object getVersion(InterfaceC2857Wj interfaceC2857Wj) {
        return AbstractC2995aW.F0(5000L, new C21892(null), interfaceC2857Wj);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public Object loadAd(String str, String str2, String str3, String str4, String str5, int i, InterfaceC2857Wj interfaceC2857Wj) throws LoadException {
        AnonymousClass1 anonymousClass1;
        if (interfaceC2857Wj instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object objZ = anonymousClass2.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i3 = anonymousClass2.label;
        if (i3 == 0) {
            AbstractC3375el.b0(objZ);
            C4232oa0 c4232oa0 = new C4232oa0(this.scarEventReceiver.getGmaEventFlow(), new C21902(AbstractC3089ba0.o0(str, UnityAdFormat.INTERSTITIAL.toString()), str2, str5, str3, str4, i, null));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(str2, null);
            anonymousClass2.label = 1;
            objZ = AbstractC3375el.z(c4232oa0, anonymousClass3, anonymousClass2);
            if (objZ == enumC4602sk) {
                return enumC4602sk;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(objZ);
        }
        GmaEventData gmaEventData = (GmaEventData) (((GmaEventData) objZ).getGmaEvent() != GMAEvent.AD_LOADED ? objZ : null);
        if (gmaEventData == null) {
            return C5033xf0.f5238a;
        }
        StringBuilder sb = new StringBuilder("Error loading SCAR ad: ");
        Object errorMessage = gmaEventData.getErrorMessage();
        if (errorMessage == null) {
            errorMessage = gmaEventData.getGmaEvent();
        }
        sb.append(errorMessage);
        throw new LoadException(0, sb.toString());
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public InterfaceC4443qv loadBannerAd(Context context, BannerView bannerView, ScarAdMetadata scarAdMetadata, UnityBannerSize unityBannerSize, final String str) {
        AbstractC2995aW.q(context, f.X);
        AbstractC2995aW.q(bannerView, "bannerView");
        AbstractC2995aW.q(scarAdMetadata, "scarAdMetadata");
        AbstractC2995aW.q(unityBannerSize, "bannerSize");
        AbstractC2995aW.q(str, "opportunityId");
        final C2350Cv c2350Cv = new C2350Cv(new C21911(context, bannerView, str, scarAdMetadata, unityBannerSize, null), this.scarEventReceiver.getGmaEventFlow());
        return new C4706tv(new C2765Sv(new InterfaceC4443qv() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends AbstractC2883Xj {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
                        super(interfaceC2857Wj);
                    }

                    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC4530rv interfaceC4530rv, String str) {
                    this.$this_unsafeFlow = interfaceC4530rv;
                    this.$opportunityId$inlined = str;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                    AnonymousClass1 anonymousClass1;
                    if (interfaceC2857Wj instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) interfaceC2857Wj;
                        int i = anonymousClass1.label;
                        if ((i & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.label = i - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(interfaceC2857Wj);
                    }
                    Object obj2 = anonymousClass1.result;
                    EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                    int i2 = anonymousClass1.label;
                    if (i2 == 0) {
                        AbstractC3375el.b0(obj2);
                        InterfaceC4530rv interfaceC4530rv = this.$this_unsafeFlow;
                        GmaEventData gmaEventData = (GmaEventData) obj;
                        if (gmaEventData.getGmaEvent() == GMAEvent.BANNER && AbstractC2995aW.i(gmaEventData.getOpportunityId(), this.$opportunityId$inlined)) {
                            anonymousClass1.label = 1;
                            if (interfaceC4530rv.emit(obj, anonymousClass1) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC3375el.b0(obj2);
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = c2350Cv.collect(new AnonymousClass2(interfaceC4530rv, str), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        }, new C21923(null), null));
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    public InterfaceC4443qv show(String str, String str2) {
        AbstractC2995aW.q(str, HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID);
        AbstractC2995aW.q(str2, HandleInvocationsFromAdViewer.KEY_QUERY_ID);
        return new C4706tv(new C2765Sv(new C4232oa0(this.scarEventReceiver.getGmaEventFlow(), new C21931(str, str2, null)), new C21942(null), null));
    }
}
