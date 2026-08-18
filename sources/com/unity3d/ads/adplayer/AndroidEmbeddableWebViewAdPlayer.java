package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.badlogic.gdx.Input;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.scarads.ScarAdMetadata;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.ViewUtilities;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2350Cv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4620sx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3215cx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4357px;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {105, 108, 110}, m = "destroy")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidEmbeddableWebViewAdPlayer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {65, Input.Keys.MINUS}, m = "invokeSuspend")
    public static final class C21551 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC4286p60 $scarEvents;
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {64}, m = "invokeSuspend")
        public static final class C02951 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02951(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.this$0 = androidEmbeddableWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new C02951(this.this$0, this.$showOptions, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                return ((C02951) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
                    Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
                    this.label = 1;
                    if (webViewAdPlayer.requestShow(unityAdsShowOptions, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                return C5033xf0.f5238a;
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$2, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(interfaceC2857Wj);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(ScarEvent scarEvent, InterfaceC2857Wj interfaceC2857Wj) {
                return ((AnonymousClass2) create(scarEvent, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                return Boolean.valueOf(AbstractC2995aW.i((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$4, reason: invalid class name */
        public /* synthetic */ class AnonymousClass4 implements InterfaceC4530rv, InterfaceC4357px {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
            public final Object emit(BannerBridge.BannerEvent bannerEvent, InterfaceC2857Wj interfaceC2857Wj) {
                Object objSendScarBannerEvent = this.$tmp0.sendScarBannerEvent(bannerEvent, interfaceC2857Wj);
                return objSendScarBannerEvent == EnumC4602sk.f4993a ? objSendScarBannerEvent : C5033xf0.f5238a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC4530rv) && (obj instanceof InterfaceC4357px)) {
                    return AbstractC2995aW.i(getFunctionDelegate(), ((InterfaceC4357px) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4357px
            public final InterfaceC3215cx getFunctionDelegate() {
                return new C4620sx(2, this.$tmp0, WebViewAdPlayer.class, "sendScarBannerEvent", "sendScarBannerEvent(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21551(InterfaceC4286p60 interfaceC4286p60, ShowOptions showOptions, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$scarEvents = interfaceC4286p60;
            this.$showOptions = showOptions;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidEmbeddableWebViewAdPlayer.this.new C21551(this.$scarEvents, this.$showOptions, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21551) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3375el.b0(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
                return C5033xf0.f5238a;
            }
            AbstractC3375el.b0(obj);
            C2350Cv c2350Cv = new C2350Cv(new C02951(AndroidEmbeddableWebViewAdPlayer.this, this.$showOptions, null), AndroidEmbeddableWebViewAdPlayer.this.getOnScarEvent());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            if (AbstractC3375el.z(c2350Cv, anonymousClass2, this) == enumC4602sk) {
                return enumC4602sk;
            }
            final InterfaceC4286p60 interfaceC4286p60 = this.$scarEvents;
            InterfaceC4443qv interfaceC4443qv = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                    final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {225}, m = "emit")
                    public static final class AnonymousClass1 extends AbstractC2883Xj {
                        Object L$0;
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

                    public AnonymousClass2(InterfaceC4530rv interfaceC4530rv) {
                        this.$this_unsafeFlow = interfaceC4530rv;
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
                            BannerBridge.BannerEvent bannerEvent = ((GmaEventData) obj).getBannerEvent();
                            if (bannerEvent != null) {
                                anonymousClass1.label = 1;
                                if (interfaceC4530rv.emit(bannerEvent, anonymousClass1) == enumC4602sk) {
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
                    Object objCollect = interfaceC4286p60.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                    return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
                }
            };
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(AndroidEmbeddableWebViewAdPlayer.this.webViewAdPlayer);
            this.label = 2;
            if (interfaceC4443qv.collect(anonymousClass4, this) == enumC4602sk) {
                return enumC4602sk;
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Activity $context;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Activity activity, BannerView bannerView, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$context = activity;
            this.$bannerView = bannerView;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidEmbeddableWebViewAdPlayer.this.new AnonymousClass2(this.$context, this.$bannerView, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView().setLayoutParams(new ViewGroup.LayoutParams((int) ViewUtilities.pxFromDp(this.$context, this.$bannerView.getSize().getWidth()), (int) ViewUtilities.pxFromDp(this.$context, this.$bannerView.getSize().getHeight())));
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass4 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ BannerView $bannerView;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(BannerView bannerView, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$bannerView = bannerView;
            this.this$0 = androidEmbeddableWebViewAdPlayer;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass4(this.$bannerView, this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass4) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
            return C5033xf0.f5238a;
        }
    }

    public AndroidEmbeddableWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String str, AndroidWebViewContainer androidWebViewContainer, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager) {
        AbstractC2995aW.q(webViewAdPlayer, "webViewAdPlayer");
        AbstractC2995aW.q(str, "opportunityId");
        AbstractC2995aW.q(androidWebViewContainer, "webViewContainer");
        AbstractC2995aW.q(openMeasurementRepository, "openMeasurementRepository");
        AbstractC2995aW.q(scarManager, "scarManager");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = str;
        this.webViewContainer = androidWebViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer;
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
        Object obj = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                androidEmbeddableWebViewAdPlayer = (AndroidEmbeddableWebViewAdPlayer) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            } else if (i2 == 2) {
                androidEmbeddableWebViewAdPlayer = (AndroidEmbeddableWebViewAdPlayer) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 3;
                if (AdPlayer.DefaultImpls.destroy(androidEmbeddableWebViewAdPlayer, anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        this.webViewAdPlayer.dispatchShowCompleted();
        if (this.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(this.opportunityId))) {
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (AbstractC2995aW.v(1000L, anonymousClass1) == enumC4602sk) {
                return enumC4602sk;
            }
        }
        androidEmbeddableWebViewAdPlayer = this;
        AndroidWebViewContainer webViewContainer = androidEmbeddableWebViewAdPlayer.getWebViewContainer();
        anonymousClass1.L$0 = androidEmbeddableWebViewAdPlayer;
        anonymousClass1.label = 2;
        if (webViewContainer.destroy(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 3;
        if (AdPlayer.DefaultImpls.destroy(androidEmbeddableWebViewAdPlayer, anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4443qv getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4443qv getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4443qv getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4514rk getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4443qv getUpdateCampaignState() {
        return this.webViewAdPlayer.getUpdateCampaignState();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.onBroadcastEvent(str, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.requestShow(map, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendActivityDestroyed(interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendFocusChange(z, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(GMAEvent gMAEvent, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendGmaEvent(gMAEvent, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendMuteChange(z, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendVisibilityChange(z, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, InterfaceC2857Wj interfaceC2857Wj) {
        return this.webViewAdPlayer.sendVolumeChange(d, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(final ShowOptions showOptions) {
        AbstractC2995aW.q(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        Activity activity = androidShowOptions.getActivity().get();
        if (activity == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        BannerView bannerView = BannerViewCache.getInstance().getBannerView(this.opportunityId);
        if (bannerView == null) {
            throw new IllegalStateException(("BannerView not found for opportunityId: " + this.opportunityId).toString());
        }
        if (!androidShowOptions.isScarAd()) {
            WD.D(WD.c(), null, 0, new AnonymousClass2(activity, bannerView, null), 3);
            final WebView webView = getWebViewContainer().getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                WD.D(this.webViewAdPlayer.getScope(), null, 0, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3);
                if (ViewCompat.isAttachedToWindow(webView)) {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(webView, this));
                } else {
                    WD.D(this.webViewAdPlayer.getScope(), null, 0, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3);
                }
            } else {
                webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(View view) {
                        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                        webView.removeOnAttachStateChangeListener(this);
                        WD.D(this.webViewAdPlayer.getScope(), null, 0, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3);
                        if (ViewCompat.isAttachedToWindow(view)) {
                            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(view, this));
                        } else {
                            WD.D(this.webViewAdPlayer.getScope(), null, 0, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3);
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(View view) {
                        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                    }
                });
            }
            WD.D(WD.c(), null, 0, new AnonymousClass4(bannerView, this, null), 3);
            return;
        }
        String placementId = androidShowOptions.getPlacementId();
        String str = placementId == null ? "" : placementId;
        String scarQueryId = androidShowOptions.getScarQueryId();
        String str2 = scarQueryId == null ? "" : scarQueryId;
        String scarAdUnitId = androidShowOptions.getScarAdUnitId();
        String str3 = scarAdUnitId == null ? "" : scarAdUnitId;
        String scarAdString = androidShowOptions.getScarAdString();
        ScarAdMetadata scarAdMetadata = new ScarAdMetadata(str, str2, str3, scarAdString == null ? "" : scarAdString, 0);
        ScarManager scarManager = this.scarManager;
        UnityBannerSize size = bannerView.getSize();
        AbstractC2995aW.p(size, "bannerView.size");
        WD.D(getScope(), null, 0, new C21551(AbstractC3375el.X(scarManager.loadBannerAd(activity, bannerView, scarAdMetadata, size, this.opportunityId), getScope(), 10), showOptions, null), 3);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
