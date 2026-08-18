package com.unity3d.ads.adplayer;

import android.app.Activity;
import android.content.Intent;
import com.badlogic.gdx.Input;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.bridge.BannerBridge;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4637t60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2350Cv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4620sx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3215cx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4357px;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Y2;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {
    public static final Companion Companion = new Companion(null);
    private static final InterfaceC4221oQ displayMessages = AbstractC4637t60.b(0, 7);
    private final DeviceInfoRepository deviceInfoRepository;
    private final OpenMeasurementRepository openMeasurementRepository;
    private final String opportunityId;
    private final ScarManager scarManager;
    private final SessionRepository sessionRepository;
    private final WebViewAdPlayer webViewAdPlayer;
    private final AndroidWebViewContainer webViewContainer;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }

        public final InterfaceC4221oQ getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {132, 137, Input.Keys.F11, Input.Keys.NUM_LOCK}, m = "destroy")
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
            return AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Input.Keys.NUMPAD_4, Input.Keys.NUMPAD_5, Input.Keys.NUMPAD_6, Input.Keys.NUMPAD_7, Input.Keys.NUMPAD_8, Input.Keys.NUMPAD_DIVIDE}, m = "invokeSuspend")
    public static final class C21561 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ DisplayMessage $displayMessage;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21561(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$displayMessage = displayMessage;
            this.this$0 = androidFullscreenWebViewAdPlayer;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C21561(this.$displayMessage, this.this$0, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C21561) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            switch (this.label) {
                case 0:
                    AbstractC3375el.b0(obj);
                    DisplayMessage displayMessage = this.$displayMessage;
                    if (displayMessage instanceof DisplayMessage.DisplayReady) {
                        WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
                        Map<String, Object> showOptions = ((DisplayMessage.DisplayReady) this.$displayMessage).getShowOptions();
                        this.label = 1;
                        if (webViewAdPlayer.requestShow(showOptions, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else if (displayMessage instanceof DisplayMessage.WebViewInstanceRequest) {
                        InterfaceC4221oQ displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                        DisplayMessage.WebViewInstanceResponse webViewInstanceResponse = new DisplayMessage.WebViewInstanceResponse(this.$displayMessage.getOpportunityId(), this.this$0.getWebViewContainer().getWebView());
                        this.label = 2;
                        if (displayMessages.emit(webViewInstanceResponse, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else if (displayMessage instanceof DisplayMessage.VisibilityChanged) {
                        WebViewAdPlayer webViewAdPlayer2 = this.this$0.webViewAdPlayer;
                        boolean zIsVisible = ((DisplayMessage.VisibilityChanged) this.$displayMessage).isVisible();
                        this.label = 3;
                        if (webViewAdPlayer2.sendVisibilityChange(zIsVisible, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else if (displayMessage instanceof DisplayMessage.FocusChanged) {
                        WebViewAdPlayer webViewAdPlayer3 = this.this$0.webViewAdPlayer;
                        boolean zIsFocused = ((DisplayMessage.FocusChanged) this.$displayMessage).isFocused();
                        this.label = 4;
                        if (webViewAdPlayer3.sendFocusChange(zIsFocused, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else if (displayMessage instanceof DisplayMessage.DisplayDestroyed) {
                        WebViewAdPlayer webViewAdPlayer4 = this.this$0.webViewAdPlayer;
                        this.label = 5;
                        if (webViewAdPlayer4.sendActivityDestroyed(this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else if (displayMessage instanceof DisplayMessage.DisplayError) {
                        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                        this.label = 6;
                        if (androidFullscreenWebViewAdPlayer.destroy(this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    AbstractC3375el.b0(obj);
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends Y2 implements InterfaceC3567gx {
        public AnonymousClass2(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(DisplayMessage displayMessage, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, interfaceC2857Wj);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3, reason: invalid class name */
    public /* synthetic */ class AnonymousClass3 extends C4620sx implements InterfaceC3567gx {
        public AnonymousClass3(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(VolumeSettingsChange volumeSettingsChange, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, interfaceC2857Wj);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$5, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$5", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Input.Keys.SEMICOLON}, m = "invokeSuspend")
    public static final class AnonymousClass5 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass5(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass5(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(ShowEvent showEvent, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass5) create(showEvent, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                this.label = 1;
                if (androidFullscreenWebViewAdPlayer.destroy(this) == enumC4602sk) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6, reason: invalid class name */
    public /* synthetic */ class AnonymousClass6 extends C4620sx implements InterfaceC3567gx {
        public AnonymousClass6(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(SessionChange sessionChange, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, interfaceC2857Wj);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {105, 109}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC4286p60 $scarEvents;
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$1, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {104}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new AnonymousClass1(this.this$0, this.$showOptions, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                return ((AnonymousClass1) create(interfaceC4530rv, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                int i = this.label;
                if (i == 0) {
                    AbstractC3375el.b0(obj);
                    InterfaceC4221oQ displayMessages = AndroidFullscreenWebViewAdPlayer.Companion.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == enumC4602sk) {
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

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$2, reason: invalid class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
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

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$4, reason: invalid class name */
        public /* synthetic */ class AnonymousClass4 implements InterfaceC4530rv, InterfaceC4357px {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            public AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
            public final Object emit(GMAEvent gMAEvent, InterfaceC2857Wj interfaceC2857Wj) {
                Object objSendGmaEvent = this.$tmp0.sendGmaEvent(gMAEvent, interfaceC2857Wj);
                return objSendGmaEvent == EnumC4602sk.f4993a ? objSendGmaEvent : C5033xf0.f5238a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC4530rv) && (obj instanceof InterfaceC4357px)) {
                    return AbstractC2995aW.i(getFunctionDelegate(), ((InterfaceC4357px) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4357px
            public final InterfaceC3215cx getFunctionDelegate() {
                return new C4620sx(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(InterfaceC4286p60 interfaceC4286p60, ShowOptions showOptions, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$scarEvents = interfaceC4286p60;
            this.$showOptions = showOptions;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass7(this.$scarEvents, this.$showOptions, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass7) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
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
            C2350Cv c2350Cv = new C2350Cv(new AnonymousClass1(AndroidFullscreenWebViewAdPlayer.this, this.$showOptions, null), AndroidFullscreenWebViewAdPlayer.this.getOnScarEvent());
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            this.label = 1;
            if (AbstractC3375el.z(c2350Cv, anonymousClass2, this) == enumC4602sk) {
                return enumC4602sk;
            }
            final InterfaceC4286p60 interfaceC4286p60 = this.$scarEvents;
            InterfaceC4443qv interfaceC4443qv = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                    final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7$invokeSuspend$$inlined$mapNotNull$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {225}, m = "emit")
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
                            GMAEvent gmaEvent = ((GmaEventData) obj).getGmaEvent();
                            if (gmaEvent != null) {
                                anonymousClass1.label = 1;
                                if (interfaceC4530rv.emit(gmaEvent, anonymousClass1) == enumC4602sk) {
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
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(AndroidFullscreenWebViewAdPlayer.this.webViewAdPlayer);
            this.label = 2;
            if (interfaceC4443qv.collect(anonymousClass4, this) == enumC4602sk) {
                return enumC4602sk;
            }
            return C5033xf0.f5238a;
        }
    }

    public AndroidFullscreenWebViewAdPlayer(WebViewAdPlayer webViewAdPlayer, String str, AndroidWebViewContainer androidWebViewContainer, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, OpenMeasurementRepository openMeasurementRepository, ScarManager scarManager) {
        AbstractC2995aW.q(webViewAdPlayer, "webViewAdPlayer");
        AbstractC2995aW.q(str, "opportunityId");
        AbstractC2995aW.q(androidWebViewContainer, "webViewContainer");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(openMeasurementRepository, "openMeasurementRepository");
        AbstractC2995aW.q(scarManager, "scarManager");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = str;
        this.webViewContainer = androidWebViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
    }

    private final InterfaceC5000xE displayEventsRouter(DisplayMessage displayMessage) {
        return WD.D(getScope(), null, 0, new C21561(displayMessage, this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, InterfaceC2857Wj interfaceC2857Wj) {
        boolean z = sessionChange instanceof SessionChange.UserConsentChange;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (z) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            AbstractC2995aW.p(byteArray, "change.value.toByteArray()");
            Object objSendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, interfaceC2857Wj);
            return objSendUserConsentChange == EnumC4602sk.f4993a ? objSendUserConsentChange : c5033xf0;
        }
        if (sessionChange instanceof SessionChange.PrivacyFsmChange) {
            WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
            byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
            AbstractC2995aW.p(byteArray2, "change.value.toByteArray()");
            Object objSendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, interfaceC2857Wj);
            if (objSendPrivacyFsmChange == EnumC4602sk.f4993a) {
                return objSendPrivacyFsmChange;
            }
        }
        return c5033xf0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendVolumeChange;
        boolean z = volumeSettingsChange instanceof VolumeSettingsChange.MuteChange;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (!z) {
            return ((volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange) && (objSendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), interfaceC2857Wj)) == EnumC4602sk.f4993a) ? objSendVolumeChange : c5033xf0;
        }
        Object objSendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), interfaceC2857Wj);
        return objSendMuteChange == EnumC4602sk.f4993a ? objSendMuteChange : c5033xf0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, InterfaceC2857Wj interfaceC2857Wj) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0091 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object destroy(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer;
        AndroidWebViewContainer webViewContainer;
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
                androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
            } else if (i2 == 2) {
                androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
                webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
                anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
                anonymousClass1.label = 3;
                if (webViewContainer.destroy(anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 4;
                if (AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else if (i2 == 3) {
                androidFullscreenWebViewAdPlayer = (AndroidFullscreenWebViewAdPlayer) anonymousClass1.L$0;
                AbstractC3375el.b0(obj);
                anonymousClass1.L$0 = null;
                anonymousClass1.label = 4;
                if (AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(obj);
        InterfaceC4221oQ interfaceC4221oQ = displayMessages;
        DisplayMessage.DisplayFinishRequest displayFinishRequest = new DisplayMessage.DisplayFinishRequest(this.opportunityId);
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        if (interfaceC4221oQ.emit(displayFinishRequest, anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        androidFullscreenWebViewAdPlayer = this;
        if (androidFullscreenWebViewAdPlayer.openMeasurementRepository.hasSessionFinished(ByteStringsKt.toByteStringUtf8(androidFullscreenWebViewAdPlayer.opportunityId))) {
            anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
            anonymousClass1.label = 2;
            if (AbstractC2995aW.v(1000L, anonymousClass1) == enumC4602sk) {
                return enumC4602sk;
            }
        }
        webViewContainer = androidFullscreenWebViewAdPlayer.getWebViewContainer();
        anonymousClass1.L$0 = androidFullscreenWebViewAdPlayer;
        anonymousClass1.label = 3;
        if (webViewContainer.destroy(anonymousClass1) == enumC4602sk) {
            return enumC4602sk;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 4;
        if (AdPlayer.DefaultImpls.destroy(androidFullscreenWebViewAdPlayer, anonymousClass1) == enumC4602sk) {
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
    public void show(ShowOptions showOptions) {
        AbstractC2995aW.q(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        Activity activity = androidShowOptions.getActivity().get();
        if (activity == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        boolean zIsScarAd = androidShowOptions.isScarAd();
        final InterfaceC4221oQ interfaceC4221oQ = displayMessages;
        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass2(this), new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                public AnonymousClass2(InterfaceC4530rv interfaceC4530rv, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = interfaceC4530rv;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
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
                        if (AbstractC2995aW.i(((DisplayMessage) obj).getOpportunityId(), this.this$0.opportunityId)) {
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
                Object objCollect = interfaceC4221oQ.collect(new AnonymousClass2(interfaceC4530rv, this), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        }), getScope());
        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass3(this), this.deviceInfoRepository.getVolumeSettingsChange()), getScope());
        final InterfaceC4443qv onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass5(null), new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        ShowEvent showEvent = (ShowEvent) obj;
                        if ((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) {
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
                Object objCollect = onShowEvent.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        }), getScope());
        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass6(this), this.sessionRepository.getOnChange()), getScope());
        if (zIsScarAd) {
            ScarManager scarManager = this.scarManager;
            String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            String scarQueryId = androidShowOptions.getScarQueryId();
            WD.D(getScope(), null, 0, new AnonymousClass7(AbstractC3375el.X(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), 10), showOptions, null), 3);
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(268500992);
        intent.putExtra(AdUnitActivity.EXTRA_ORIENTATION, activity.getRequestedOrientation());
        activity.startActivity(intent);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
