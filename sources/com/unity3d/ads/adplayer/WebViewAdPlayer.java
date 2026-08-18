package com.unity3d.ads.adplayer;

import android.util.Base64;
import androidx.annotation.CallSuper;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.protobuf.ByteString;
import com.unity3d.ads.adplayer.model.LoadEvent;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.OnWebRequestComplete;
import com.unity3d.ads.adplayer.model.OnWebRequestFailed;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.ExecuteAdViewerRequest;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.network.mapper.HttpResponseHeaderToJSONArrayKt;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.RequestType;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2635Nv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3654hw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3987lk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4251ok;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4620sx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4075mk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4221oQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewAdPlayer implements AdPlayer {
    private final WebViewBridge bridge;
    private final DeviceInfoRepository deviceInfoRepository;
    private final AbstractC3899kk dispatcher;
    private final ExecuteAdViewerRequest executeAdViewerRequest;
    private final InterfaceC4309pQ isCompletedManually;
    private final InterfaceC4443qv onBroadcastEvents;
    private final InterfaceC4443qv onLoadEvent;
    private final InterfaceC4443qv onRequestEvents;
    private final InterfaceC4443qv onScarEvent;
    private final InterfaceC4443qv onShowEvent;
    private final InterfaceC4514rk scope;
    private final InterfaceC4075mk scopeCancellationHandler;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final InterfaceC2766Sw storageEventCallback;
    private final InterfaceC4443qv updateCampaignState;
    private final WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$1, reason: invalid class name */
    public /* synthetic */ class AnonymousClass1 extends C4620sx implements InterfaceC3567gx {
        public AnonymousClass1(Object obj) {
            super(2, obj, InterfaceC4221oQ.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(String str, InterfaceC2857Wj interfaceC2857Wj) {
            return ((InterfaceC4221oQ) this.receiver).emit(str, interfaceC2857Wj);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    public /* synthetic */ class AnonymousClass2 extends C4620sx implements InterfaceC3567gx {
        public AnonymousClass2(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(String str, InterfaceC2857Wj interfaceC2857Wj) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, interfaceC2857Wj);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$onAllowedPiiChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21712 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21712(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            AbstractC2995aW.p(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnAllowedPiiChangeEvent(strEncodeToString);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$onBroadcastEvent$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21722 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ String $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21722(String str) {
            super(0);
            this.$event = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject(this.$event);
            String string = jSONObject.getString("eventType");
            String strOptString = jSONObject.optString("data");
            AbstractC2995aW.p(string, "eventType");
            return new OnBroadcastEvent(string, strOptString);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {226, 227, 242}, m = "requestShow")
    public static final class C21731 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        public C21731(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.requestShow(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendActivityDestroyed$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21742 extends WG implements InterfaceC2714Qw {
        public static final C21742 INSTANCE = new C21742();

        public C21742() {
            super(0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            return new OnActivityDestroyedEvent();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {254, 268}, m = "sendEvent")
    public static final class C21751 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C21751(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.sendEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendFocusChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21762 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ boolean $isFocused;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21762(boolean z) {
            super(0);
            this.$isFocused = z;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            return new OnFocusChangeEvent(this.$isFocused);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendGmaEvent$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21772 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ GMAEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21772(GMAEvent gMAEvent) {
            super(0);
            this.$event = gMAEvent;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            return new OnGmaEvent(this.$event);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendMuteChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21782 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ boolean $isMuted;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21782(boolean z) {
            super(0);
            this.$isMuted = z;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            return new OnMuteChangeEvent(this.$isMuted);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendPrivacyFsmChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21792 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21792(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            AbstractC2995aW.p(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnPrivacyFsmChangeEvent(strEncodeToString);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendScarBannerEvent$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21802 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ BannerBridge.BannerEvent $event;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21802(BannerBridge.BannerEvent bannerEvent) {
            super(0);
            this.$event = bannerEvent;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            return new OnScarBannerEvent(this.$event);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendUserConsentChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21812 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ byte[] $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21812(byte[] bArr) {
            super(0);
            this.$value = bArr;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            String strEncodeToString = Base64.encodeToString(this.$value, 2);
            AbstractC2995aW.p(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
            return new OnUserConsentChangeEvent(strEncodeToString);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendVisibilityChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21822 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ boolean $isVisible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21822(boolean z) {
            super(0);
            this.$isVisible = z;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            return new OnVisibilityChangeEvent(this.$isVisible);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendVolumeChange$2, reason: invalid class name and case insensitive filesystem */
    public static final class C21832 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ double $volume;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21832(double d) {
            super(0);
            this.$volume = d;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final WebViewEvent invoke() {
            return new OnVolumeChangeEvent(this.$volume);
        }
    }

    public WebViewAdPlayer(WebViewBridge webViewBridge, DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository, ExecuteAdViewerRequest executeAdViewerRequest, AbstractC3899kk abstractC3899kk, SendDiagnosticEvent sendDiagnosticEvent, WebViewContainer webViewContainer, InterfaceC4514rk interfaceC4514rk) {
        AbstractC2995aW.q(webViewBridge, "bridge");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(executeAdViewerRequest, "executeAdViewerRequest");
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(webViewContainer, "webViewContainer");
        AbstractC2995aW.q(interfaceC4514rk, "adPlayerScope");
        this.bridge = webViewBridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.executeAdViewerRequest = executeAdViewerRequest;
        this.dispatcher = abstractC3899kk;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        C4907w90 c4907w90A = AbstractC4995x90.a(Boolean.FALSE);
        this.isCompletedManually = c4907w90A;
        WebViewAdPlayer$storageEventCallback$1 webViewAdPlayer$storageEventCallback$1 = new WebViewAdPlayer$storageEventCallback$1(this);
        this.storageEventCallback = webViewAdPlayer$storageEventCallback$1;
        WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1 = new WebViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1(C3987lk.f4661a, this);
        this.scopeCancellationHandler = webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = WD.L(WD.L(WD.L(interfaceC4514rk, abstractC3899kk), new C4251ok("WebViewAdPlayer")), webViewAdPlayer$special$$inlined$CoroutineExceptionHandler$1);
        final InterfaceC4286p60 onInvocation = webViewBridge.getOnInvocation();
        final InterfaceC4443qv interfaceC4443qv = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (U5.i0(new String[]{ExposedFunctionLocation.SHOW_SCAR_AD}, ((Invocation) obj).getLocation())) {
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
                Object objCollect = onInvocation.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        this.onScarEvent = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {224, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                    InterfaceC4530rv interfaceC4530rv;
                    Invocation invocation;
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
                    if (i2 != 0) {
                        if (i2 == 1) {
                            invocation = (Invocation) anonymousClass1.L$1;
                            interfaceC4530rv = (InterfaceC4530rv) anonymousClass1.L$0;
                            AbstractC3375el.b0(obj2);
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC3375el.b0(obj2);
                        }
                        return C5033xf0.f5238a;
                    }
                    AbstractC3375el.b0(obj2);
                    interfaceC4530rv = this.$this_unsafeFlow;
                    invocation = (Invocation) obj;
                    anonymousClass1.L$0 = interfaceC4530rv;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    if (!AbstractC2995aW.i(invocation.getLocation(), ExposedFunctionLocation.SHOW_SCAR_AD)) {
                        throw new IllegalStateException(("Unexpected location: " + invocation.getLocation()).toString());
                    }
                    ScarEvent.Show show = ScarEvent.Show.INSTANCE;
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (interfaceC4530rv.emit(show, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = interfaceC4443qv.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        final InterfaceC4286p60 onInvocation2 = webViewBridge.getOnInvocation();
        final InterfaceC4443qv interfaceC4443qv2 = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (U5.i0(WebViewAdPlayerKt.SHOW_EVENTS, ((Invocation) obj).getLocation())) {
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
                Object objCollect = onInvocation2.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        this.onShowEvent = new C3654hw(new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {244, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code duplicated, block: B:50:0x00f3 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                    AnonymousClass1 anonymousClass1;
                    InterfaceC4530rv interfaceC4530rv;
                    ShowEvent completed;
                    ShowEvent showEvent;
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
                    if (i2 != 0) {
                        if (i2 == 1) {
                            showEvent = (ShowEvent) anonymousClass1.L$1;
                            interfaceC4530rv = (InterfaceC4530rv) anonymousClass1.L$0;
                            AbstractC3375el.b0(obj2);
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC3375el.b0(obj2);
                        }
                        return C5033xf0.f5238a;
                    }
                    AbstractC3375el.b0(obj2);
                    interfaceC4530rv = this.$this_unsafeFlow;
                    Invocation invocation = (Invocation) obj;
                    String location = invocation.getLocation();
                    switch (location) {
                        case "com.unity3d.services.ads.api.AdViewer.cancelShowTimeout":
                            completed = ShowEvent.CancelTimeout.INSTANCE;
                            anonymousClass1.L$0 = interfaceC4530rv;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                                return enumC4602sk;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.completed":
                            Object objO0 = U5.o0(invocation.getParameters());
                            String str = objO0 instanceof String ? (String) objO0 : null;
                            completed = new ShowEvent.Completed(AbstractC2995aW.i(str, "COMPLETED") ? ShowStatus.COMPLETED : AbstractC2995aW.i(str, "SKIPPED") ? ShowStatus.SKIPPED : ShowStatus.ERROR);
                            anonymousClass1.L$0 = interfaceC4530rv;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                                return enumC4602sk;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.leftApplication":
                            completed = ShowEvent.LeftApplication.INSTANCE;
                            anonymousClass1.L$0 = interfaceC4530rv;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                                return enumC4602sk;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.clicked":
                            completed = ShowEvent.Clicked.INSTANCE;
                            anonymousClass1.L$0 = interfaceC4530rv;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                                return enumC4602sk;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.started":
                            completed = ShowEvent.Started.INSTANCE;
                            anonymousClass1.L$0 = interfaceC4530rv;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                                return enumC4602sk;
                            }
                            showEvent = completed;
                            break;
                        case "com.unity3d.services.ads.api.AdViewer.failed":
                            Object objO1 = U5.o0(invocation.getParameters());
                            AbstractC2995aW.o(objO1, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject = (JSONObject) objO1;
                            int iOptInt = jSONObject.optInt("code");
                            String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
                            AbstractC2995aW.p(strOptString, "errorMessage");
                            completed = new ShowEvent.Error(strOptString, iOptInt, "adviewer");
                            anonymousClass1.L$0 = interfaceC4530rv;
                            anonymousClass1.L$1 = completed;
                            anonymousClass1.label = 1;
                            if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                                return enumC4602sk;
                            }
                            showEvent = completed;
                            break;
                        default:
                            if (location.equals(ExposedFunctionLocation.CANCEL_SHOW_TIMEOUT)) {
                                completed = ShowEvent.CancelTimeout.INSTANCE;
                                anonymousClass1.L$0 = interfaceC4530rv;
                                anonymousClass1.L$1 = completed;
                                anonymousClass1.label = 1;
                                if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                showEvent = completed;
                                break;
                            }
                            throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (interfaceC4530rv.emit(showEvent, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = interfaceC4443qv2.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        }, c4907w90A, new WebViewAdPlayer$onShowEvent$3(null));
        final InterfaceC4286p60 onInvocation3 = webViewBridge.getOnInvocation();
        final InterfaceC4443qv interfaceC4443qv3 = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (U5.i0(WebViewAdPlayerKt.LOAD_EVENTS, ((Invocation) obj).getLocation())) {
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
                Object objCollect = onInvocation3.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        this.onLoadEvent = new C2635Nv(AbstractC3375el.X(new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {224, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                    InterfaceC4530rv interfaceC4530rv;
                    Invocation invocation;
                    Object error;
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
                    if (i2 != 0) {
                        if (i2 == 1) {
                            invocation = (Invocation) anonymousClass1.L$1;
                            interfaceC4530rv = (InterfaceC4530rv) anonymousClass1.L$0;
                            AbstractC3375el.b0(obj2);
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC3375el.b0(obj2);
                        }
                        return C5033xf0.f5238a;
                    }
                    AbstractC3375el.b0(obj2);
                    interfaceC4530rv = this.$this_unsafeFlow;
                    invocation = (Invocation) obj;
                    anonymousClass1.L$0 = interfaceC4530rv;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    if (AbstractC2995aW.i(invocation.getLocation(), ExposedFunctionLocation.LOAD_ERROR)) {
                        Object objO0 = U5.o0(invocation.getParameters());
                        AbstractC2995aW.o(objO0, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject = (JSONObject) objO0;
                        int iOptInt = jSONObject.optInt("code");
                        String strOptString = jSONObject.optString(PglCryptUtils.KEY_MESSAGE);
                        AbstractC2995aW.p(strOptString, "errorMessage");
                        error = new LoadEvent.Error(strOptString, iOptInt);
                    } else {
                        error = LoadEvent.Completed.INSTANCE;
                    }
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (interfaceC4530rv.emit(error, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = interfaceC4443qv3.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        }, getScope(), 1));
        final InterfaceC4286p60 onInvocation4 = webViewBridge.getOnInvocation();
        final InterfaceC4443qv interfaceC4443qv4 = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (AbstractC2995aW.i(((Invocation) obj).getLocation(), ExposedFunctionLocation.UPDATE_CAMPAIGN_STATE)) {
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
                Object objCollect = onInvocation4.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        this.updateCampaignState = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {224, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                    InterfaceC4530rv interfaceC4530rv;
                    Invocation invocation;
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
                    if (i2 != 0) {
                        if (i2 == 1) {
                            invocation = (Invocation) anonymousClass1.L$1;
                            interfaceC4530rv = (InterfaceC4530rv) anonymousClass1.L$0;
                            AbstractC3375el.b0(obj2);
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC3375el.b0(obj2);
                        }
                        return C5033xf0.f5238a;
                    }
                    AbstractC3375el.b0(obj2);
                    interfaceC4530rv = this.$this_unsafeFlow;
                    invocation = (Invocation) obj;
                    anonymousClass1.L$0 = interfaceC4530rv;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    Object objO0 = U5.o0(invocation.getParameters());
                    AbstractC2995aW.o(objO0, "null cannot be cast to non-null type org.json.JSONObject");
                    JSONObject jSONObject = (JSONObject) objO0;
                    String strOptString = jSONObject.optString("data");
                    AbstractC2995aW.p(strOptString, "data");
                    byte[] bytes = strOptString.getBytes(AbstractC2307Be.f2881a);
                    AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
                    C4839vT c4839vT = new C4839vT(bytes, new Integer(jSONObject.optInt("dataVersion")));
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (interfaceC4530rv.emit(c4839vT, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = interfaceC4443qv4.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        final InterfaceC4286p60 onInvocation5 = webViewBridge.getOnInvocation();
        final InterfaceC4443qv interfaceC4443qv5 = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (AbstractC2995aW.i(((Invocation) obj).getLocation(), ExposedFunctionLocation.BROADCAST_EVENT)) {
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
                Object objCollect = onInvocation5.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        InterfaceC4443qv interfaceC4443qv6 = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", l = {224, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                    InterfaceC4530rv interfaceC4530rv;
                    Invocation invocation;
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
                    if (i2 != 0) {
                        if (i2 == 1) {
                            invocation = (Invocation) anonymousClass1.L$1;
                            interfaceC4530rv = (InterfaceC4530rv) anonymousClass1.L$0;
                            AbstractC3375el.b0(obj2);
                        } else {
                            if (i2 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC3375el.b0(obj2);
                        }
                        return C5033xf0.f5238a;
                    }
                    AbstractC3375el.b0(obj2);
                    interfaceC4530rv = this.$this_unsafeFlow;
                    invocation = (Invocation) obj;
                    anonymousClass1.L$0 = interfaceC4530rv;
                    anonymousClass1.L$1 = invocation;
                    anonymousClass1.label = 1;
                    if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    String string = U5.o0(invocation.getParameters()).toString();
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 2;
                    if (interfaceC4530rv.emit(string, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return C5033xf0.f5238a;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = interfaceC4443qv5.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        this.onBroadcastEvents = interfaceC4443qv6;
        final InterfaceC4286p60 onInvocation6 = webViewBridge.getOnInvocation();
        final InterfaceC4443qv interfaceC4443qv7 = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$6$2", f = "WebViewAdPlayer.kt", l = {EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        if (U5.i0(WebViewAdPlayerKt.REQUEST_EVENTS, ((Invocation) obj).getLocation())) {
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
                Object objCollect = onInvocation6.collect(new AnonymousClass2(interfaceC4530rv), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        InterfaceC4443qv interfaceC4443qv8 = new InterfaceC4443qv() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements InterfaceC4530rv {
                final /* synthetic */ InterfaceC4530rv $this_unsafeFlow;
                final /* synthetic */ WebViewAdPlayer this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6$2$1, reason: invalid class name */
                @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$6$2", f = "WebViewAdPlayer.kt", l = {224, 237, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 253, EnumC4719u30.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends AbstractC2883Xj {
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                public AnonymousClass2(InterfaceC4530rv interfaceC4530rv, WebViewAdPlayer webViewAdPlayer) {
                    this.$this_unsafeFlow = interfaceC4530rv;
                    this.this$0 = webViewAdPlayer;
                }

                /* JADX WARN: Code duplicated, block: B:49:0x0112 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:50:0x0113  */
                /* JADX WARN: Code duplicated, block: B:53:0x0120 A[Catch: Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:20:0x005e, B:25:0x0077, B:51:0x0116, B:53:0x0120, B:58:0x0133, B:54:0x0123, B:56:0x0127), top: B:80:0x002b }] */
                /* JADX WARN: Code duplicated, block: B:54:0x0123 A[Catch: Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:20:0x005e, B:25:0x0077, B:51:0x0116, B:53:0x0120, B:58:0x0133, B:54:0x0123, B:56:0x0127), top: B:80:0x002b }] */
                /* JADX WARN: Code duplicated, block: B:56:0x0127 A[Catch: Exception -> 0x0063, TryCatch #1 {Exception -> 0x0063, blocks: (B:20:0x005e, B:25:0x0077, B:51:0x0116, B:53:0x0120, B:58:0x0133, B:54:0x0123, B:56:0x0127), top: B:80:0x002b }] */
                /* JADX WARN: Code duplicated, block: B:57:0x0132  */
                /* JADX WARN: Code duplicated, block: B:60:0x0176 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:74:0x01c2 A[RETURN] */
                /* JADX WARN: Code duplicated, block: B:7:0x0017  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r4v1 */
                /* JADX WARN: Type inference failed for: r4v21 */
                /* JADX WARN: Type inference failed for: r4v9 */
                /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object[], java.lang.String[]] */
                @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
                public final Object emit(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                    AnonymousClass1 anonymousClass1;
                    int i;
                    ?? r4;
                    Object obj2;
                    InterfaceC4530rv interfaceC4530rv;
                    InterfaceC4530rv interfaceC4530rv2;
                    InterfaceC4530rv interfaceC4530rv3;
                    Invocation invocation;
                    AnonymousClass2<T> anonymousClass2;
                    RequestType requestType;
                    String str;
                    String str2;
                    Object body;
                    String str3;
                    WebViewBridge webViewBridge;
                    OnWebRequestComplete onWebRequestComplete;
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
                    Object objInvoke = anonymousClass1.result;
                    EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
                    int i3 = anonymousClass1.label;
                    C5033xf0 c5033xf0 = C5033xf0.f5238a;
                    try {
                        if (i3 != 0) {
                            if (i3 == 1) {
                                invocation = (Invocation) anonymousClass1.L$2;
                                interfaceC4530rv3 = (InterfaceC4530rv) anonymousClass1.L$1;
                                AnonymousClass2<T> anonymousClass3 = (AnonymousClass2) anonymousClass1.L$0;
                                AbstractC3375el.b0(objInvoke);
                                anonymousClass2 = anonymousClass3;
                            } else if (i3 == 2) {
                                str = (String) anonymousClass1.L$3;
                                str2 = (String) anonymousClass1.L$2;
                                interfaceC4530rv2 = (InterfaceC4530rv) anonymousClass1.L$1;
                                anonymousClass2 = (AnonymousClass2) anonymousClass1.L$0;
                                AbstractC3375el.b0(objInvoke);
                                HttpResponse httpResponse = (HttpResponse) objInvoke;
                                body = httpResponse.getBody();
                                if (body instanceof String) {
                                    str3 = (String) body;
                                } else if (body instanceof byte[]) {
                                    str3 = new String((byte[]) body, AbstractC2307Be.f2881a);
                                } else {
                                    str3 = null;
                                }
                                List listK = AbstractC2340Cl.K(str, httpResponse.getUrlString(), str3, new Integer(httpResponse.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse.getHeaders()));
                                webViewBridge = anonymousClass2.this$0.bridge;
                                onWebRequestComplete = new OnWebRequestComplete(listK);
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = interfaceC4530rv2;
                                anonymousClass1.L$2 = str2;
                                anonymousClass1.L$3 = str;
                                anonymousClass1.label = 3;
                                if (webViewBridge.sendEvent(onWebRequestComplete, anonymousClass1) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                obj2 = null;
                                anonymousClass1.L$0 = obj2;
                                anonymousClass1.L$1 = obj2;
                                anonymousClass1.L$2 = obj2;
                                anonymousClass1.L$3 = obj2;
                                anonymousClass1.label = 5;
                                if (interfaceC4530rv2.emit(c5033xf0, anonymousClass1) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                            } else if (i3 == 3) {
                                interfaceC4530rv2 = (InterfaceC4530rv) anonymousClass1.L$1;
                                AbstractC3375el.b0(objInvoke);
                                obj2 = null;
                                anonymousClass1.L$0 = obj2;
                                anonymousClass1.L$1 = obj2;
                                anonymousClass1.L$2 = obj2;
                                anonymousClass1.L$3 = obj2;
                                anonymousClass1.label = 5;
                                if (interfaceC4530rv2.emit(c5033xf0, anonymousClass1) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                            } else if (i3 == 4) {
                                interfaceC4530rv = (InterfaceC4530rv) anonymousClass1.L$0;
                                AbstractC3375el.b0(objInvoke);
                                obj2 = null;
                                interfaceC4530rv2 = interfaceC4530rv;
                                anonymousClass1.L$0 = obj2;
                                anonymousClass1.L$1 = obj2;
                                anonymousClass1.L$2 = obj2;
                                anonymousClass1.L$3 = obj2;
                                anonymousClass1.label = 5;
                                if (interfaceC4530rv2.emit(c5033xf0, anonymousClass1) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                            } else {
                                if (i3 != 5) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC3375el.b0(objInvoke);
                            }
                            return c5033xf0;
                        }
                        AbstractC3375el.b0(objInvoke);
                        interfaceC4530rv3 = this.$this_unsafeFlow;
                        invocation = (Invocation) obj;
                        anonymousClass1.L$0 = this;
                        anonymousClass1.L$1 = interfaceC4530rv3;
                        anonymousClass1.L$2 = invocation;
                        anonymousClass1.label = 1;
                        if (Invocation.handle$default(invocation, null, anonymousClass1, 1, null) == enumC4602sk) {
                            return enumC4602sk;
                        }
                        anonymousClass2 = this;
                        Object objO0 = U5.o0(invocation.getParameters());
                        AbstractC2995aW.o(objO0, "null cannot be cast to non-null type kotlin.String");
                        String str4 = (String) objO0;
                        String str5 = (String) U5.p0(1, invocation.getParameters());
                        String location = invocation.getLocation();
                        int iHashCode = location.hashCode();
                        if (iHashCode == -934922905) {
                            if (location.equals(ExposedFunctionLocation.REQUEST_HEAD)) {
                                requestType = RequestType.HEAD;
                                ExecuteAdViewerRequest executeAdViewerRequest = anonymousClass2.this$0.executeAdViewerRequest;
                                Object[] parameters = invocation.getParameters();
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = interfaceC4530rv3;
                                anonymousClass1.L$2 = str5;
                                anonymousClass1.L$3 = str4;
                                anonymousClass1.label = 2;
                                objInvoke = executeAdViewerRequest.invoke(requestType, parameters, anonymousClass1);
                                if (objInvoke == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                str = str4;
                                interfaceC4530rv2 = interfaceC4530rv3;
                                str2 = str5;
                                HttpResponse httpResponse2 = (HttpResponse) objInvoke;
                                body = httpResponse2.getBody();
                                if (body instanceof String) {
                                    str3 = (String) body;
                                } else if (body instanceof byte[]) {
                                    str3 = new String((byte[]) body, AbstractC2307Be.f2881a);
                                } else {
                                    str3 = null;
                                }
                                List listK2 = AbstractC2340Cl.K(str, httpResponse2.getUrlString(), str3, new Integer(httpResponse2.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse2.getHeaders()));
                                webViewBridge = anonymousClass2.this$0.bridge;
                                onWebRequestComplete = new OnWebRequestComplete(listK2);
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = interfaceC4530rv2;
                                anonymousClass1.L$2 = str2;
                                anonymousClass1.L$3 = str;
                                anonymousClass1.label = 3;
                                if (webViewBridge.sendEvent(onWebRequestComplete, anonymousClass1) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                obj2 = null;
                            }
                            throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                        }
                        if (iHashCode == -934674393) {
                            if (location.equals(ExposedFunctionLocation.REQUEST_POST)) {
                                requestType = RequestType.POST;
                                ExecuteAdViewerRequest executeAdViewerRequest2 = anonymousClass2.this$0.executeAdViewerRequest;
                                Object[] parameters2 = invocation.getParameters();
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = interfaceC4530rv3;
                                anonymousClass1.L$2 = str5;
                                anonymousClass1.L$3 = str4;
                                anonymousClass1.label = 2;
                                objInvoke = executeAdViewerRequest2.invoke(requestType, parameters2, anonymousClass1);
                                if (objInvoke == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                str = str4;
                                interfaceC4530rv2 = interfaceC4530rv3;
                                str2 = str5;
                                HttpResponse httpResponse3 = (HttpResponse) objInvoke;
                                body = httpResponse3.getBody();
                                if (body instanceof String) {
                                    str3 = (String) body;
                                } else if (body instanceof byte[]) {
                                    str3 = new String((byte[]) body, AbstractC2307Be.f2881a);
                                } else {
                                    str3 = null;
                                }
                                List listK3 = AbstractC2340Cl.K(str, httpResponse3.getUrlString(), str3, new Integer(httpResponse3.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse3.getHeaders()));
                                webViewBridge = anonymousClass2.this$0.bridge;
                                onWebRequestComplete = new OnWebRequestComplete(listK3);
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = interfaceC4530rv2;
                                anonymousClass1.L$2 = str2;
                                anonymousClass1.L$3 = str;
                                anonymousClass1.label = 3;
                                if (webViewBridge.sendEvent(onWebRequestComplete, anonymousClass1) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                obj2 = null;
                            }
                            throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                        }
                        if (iHashCode == -445801745 && location.equals(ExposedFunctionLocation.REQUEST_GET)) {
                            requestType = RequestType.GET;
                            try {
                                ExecuteAdViewerRequest executeAdViewerRequest3 = anonymousClass2.this$0.executeAdViewerRequest;
                                Object[] parameters3 = invocation.getParameters();
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = interfaceC4530rv3;
                                anonymousClass1.L$2 = str5;
                                anonymousClass1.L$3 = str4;
                                anonymousClass1.label = 2;
                                objInvoke = executeAdViewerRequest3.invoke(requestType, parameters3, anonymousClass1);
                                if (objInvoke == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                str = str4;
                                interfaceC4530rv2 = interfaceC4530rv3;
                                str2 = str5;
                                HttpResponse httpResponse4 = (HttpResponse) objInvoke;
                                body = httpResponse4.getBody();
                                if (body instanceof String) {
                                    str3 = (String) body;
                                } else if (body instanceof byte[]) {
                                    str3 = new String((byte[]) body, AbstractC2307Be.f2881a);
                                } else {
                                    str3 = null;
                                }
                                List listK4 = AbstractC2340Cl.K(str, httpResponse4.getUrlString(), str3, new Integer(httpResponse4.getStatusCode()), HttpResponseHeaderToJSONArrayKt.toResponseHeadersMap(httpResponse4.getHeaders()));
                                webViewBridge = anonymousClass2.this$0.bridge;
                                onWebRequestComplete = new OnWebRequestComplete(listK4);
                                anonymousClass1.L$0 = anonymousClass2;
                                anonymousClass1.L$1 = interfaceC4530rv2;
                                anonymousClass1.L$2 = str2;
                                anonymousClass1.L$3 = str;
                                anonymousClass1.label = 3;
                                if (webViewBridge.sendEvent(onWebRequestComplete, anonymousClass1) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                obj2 = null;
                            } catch (Exception e) {
                                e = e;
                                r4 = str4;
                                i = 3;
                                InterfaceC4530rv interfaceC4530rv4 = interfaceC4530rv3;
                                ?? r8 = new String[i];
                                r8[0] = r4;
                                r8[1] = str5;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                r8[2] = message;
                                List listK5 = AbstractC2340Cl.K(r8);
                                WebViewBridge webViewBridge2 = anonymousClass2.this$0.bridge;
                                OnWebRequestFailed onWebRequestFailed = new OnWebRequestFailed(listK5);
                                anonymousClass1.L$0 = interfaceC4530rv4;
                                obj2 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.label = 4;
                                if (webViewBridge2.sendEvent(onWebRequestFailed, anonymousClass1) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                                interfaceC4530rv = interfaceC4530rv4;
                                interfaceC4530rv2 = interfaceC4530rv;
                            }
                        }
                        throw new IllegalStateException("Unexpected location: " + invocation.getLocation());
                    } catch (Exception e2) {
                        e = e2;
                        i = 3;
                        r4 = i3;
                    }
                    anonymousClass1.L$0 = obj2;
                    anonymousClass1.L$1 = obj2;
                    anonymousClass1.L$2 = obj2;
                    anonymousClass1.L$3 = obj2;
                    anonymousClass1.label = 5;
                    if (interfaceC4530rv2.emit(c5033xf0, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv
            public Object collect(InterfaceC4530rv interfaceC4530rv, InterfaceC2857Wj interfaceC2857Wj) {
                Object objCollect = interfaceC4443qv7.collect(new AnonymousClass2(interfaceC4530rv, this), interfaceC2857Wj);
                return objCollect == EnumC4602sk.f4993a ? objCollect : C5033xf0.f5238a;
            }
        };
        this.onRequestEvents = interfaceC4443qv8;
        Storage.Companion.addStorageEventCallback(webViewAdPlayer$storageEventCallback$1);
        AdPlayer.Companion companion = AdPlayer.Companion;
        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass1(companion.getBroadcastEventChannel()), interfaceC4443qv6), getScope());
        AbstractC3375el.K(interfaceC4443qv8, getScope());
        AbstractC3375el.K(AbstractC3375el.Q(new AnonymousClass2(this), companion.getBroadcastEventChannel()), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object sendEvent(InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
        C21751 c21751;
        InterfaceC2714Qw interfaceC2714Qw2;
        WebViewAdPlayer webViewAdPlayer;
        if (interfaceC2857Wj instanceof C21751) {
            c21751 = (C21751) interfaceC2857Wj;
            int i = c21751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21751.label = i - Integer.MIN_VALUE;
            } else {
                c21751 = new C21751(interfaceC2857Wj);
            }
        } else {
            c21751 = new C21751(interfaceC2857Wj);
        }
        Object objY = c21751.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c21751.label;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 != 0) {
            if (i2 == 1) {
                interfaceC2714Qw2 = (InterfaceC2714Qw) c21751.L$1;
                webViewAdPlayer = (WebViewAdPlayer) c21751.L$0;
                AbstractC3375el.b0(objY);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(objY);
            }
        }
        AbstractC3375el.b0(objY);
        InterfaceC4443qv onLoadEvent = getOnLoadEvent();
        c21751.L$0 = this;
        interfaceC2714Qw2 = interfaceC2714Qw;
        c21751.L$1 = interfaceC2714Qw2;
        c21751.label = 1;
        objY = AbstractC3375el.Y(onLoadEvent, c21751);
        if (objY == enumC4602sk) {
            return enumC4602sk;
        }
        webViewAdPlayer = this;
        LoadEvent loadEvent = (LoadEvent) objY;
        if (loadEvent instanceof LoadEvent.Error) {
            LoadEvent.Error error = (LoadEvent.Error) loadEvent;
            SendDiagnosticEvent.DefaultImpls.invoke$default(webViewAdPlayer.sendDiagnosticEvent, "bridge_send_event_failed", null, U5.u0(new C4839vT("reason", "adviewer"), new C4839vT("reason_debug", error.getMessage()), new C4839vT("reason_code", String.valueOf(error.getErrorCode()))), null, null, 26, null);
            return c5033xf0;
        }
        WebViewEvent webViewEvent = (WebViewEvent) interfaceC2714Qw2.invoke();
        WebViewBridge webViewBridge = webViewAdPlayer.bridge;
        c21751.L$0 = null;
        c21751.L$1 = null;
        c21751.label = 2;
        return webViewBridge.sendEvent(webViewEvent, c21751) == enumC4602sk ? enumC4602sk : c5033xf0;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @CallSuper
    public Object destroy(InterfaceC2857Wj interfaceC2857Wj) {
        return AdPlayer.DefaultImpls.destroy(this, interfaceC2857Wj);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        ((C4907w90) this.isCompletedManually).i(Boolean.TRUE);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4443qv getOnLoadEvent() {
        return this.onLoadEvent;
    }

    public final InterfaceC4443qv getOnRequestEvents() {
        return this.onRequestEvents;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4443qv getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4443qv getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4514rk getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public InterfaceC4443qv getUpdateCampaignState() {
        return this.updateCampaignState;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onAllowedPiiChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21712(bArr), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object onBroadcastEvent(String str, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21722(str), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0126  */
    /* JADX WARN: Code duplicated, block: B:35:0x0139  */
    /* JADX WARN: Code duplicated, block: B:40:0x015f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0187 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:47:0x014c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0133 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object requestShow(Map<String, ? extends Object> map, InterfaceC2857Wj interfaceC2857Wj) throws JSONException {
        C21731 c21731;
        JSONObject jSONObject;
        String str;
        WebViewAdPlayer webViewAdPlayer;
        Map<String, ? extends Object> map2;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        Map<String, ? extends Object> map3;
        WebViewAdPlayer webViewAdPlayer2;
        String str2;
        JSONObject jSONObject6;
        WebViewBridge webViewBridge;
        Object[] objArr;
        LinkedHashMap linkedHashMap;
        if (interfaceC2857Wj instanceof C21731) {
            c21731 = (C21731) interfaceC2857Wj;
            int i = c21731.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c21731.label = i - Integer.MIN_VALUE;
            } else {
                c21731 = new C21731(interfaceC2857Wj);
            }
        } else {
            c21731 = new C21731(interfaceC2857Wj);
        }
        Object privacy = c21731.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c21731.label;
        if (i2 != 0) {
            if (i2 == 1) {
                jSONObject2 = (JSONObject) c21731.L$5;
                String str3 = (String) c21731.L$4;
                JSONObject jSONObject7 = (JSONObject) c21731.L$3;
                jSONObject3 = (JSONObject) c21731.L$2;
                map2 = (Map) c21731.L$1;
                webViewAdPlayer = (WebViewAdPlayer) c21731.L$0;
                AbstractC3375el.b0(privacy);
                str = str3;
                jSONObject = jSONObject7;
            } else if (i2 == 2) {
                jSONObject6 = (JSONObject) c21731.L$5;
                str2 = (String) c21731.L$4;
                jSONObject4 = (JSONObject) c21731.L$3;
                jSONObject5 = (JSONObject) c21731.L$2;
                map3 = (Map) c21731.L$1;
                webViewAdPlayer2 = (WebViewAdPlayer) c21731.L$0;
                AbstractC3375el.b0(privacy);
                jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) privacy, false, 1, null));
                ByteString byteString = ((AllowedPiiOuterClass.AllowedPii) ((C4907w90) webViewAdPlayer2.deviceInfoRepository.getAllowedPii()).getValue()).toByteString();
                AbstractC2995aW.p(byteString, "deviceInfoRepository.all…dPii.value.toByteString()");
                jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
                if (map3 != null) {
                    linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, ? extends Object> entry : map3.entrySet()) {
                        if (!AbstractC2995aW.i(entry.getKey(), "objectId")) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!linkedHashMap.isEmpty()) {
                        jSONObject4.put("showOptions", new JSONObject(linkedHashMap));
                    }
                }
                webViewBridge = webViewAdPlayer2.bridge;
                objArr = new Object[]{jSONObject5};
                c21731.L$0 = null;
                c21731.L$1 = null;
                c21731.L$2 = null;
                c21731.L$3 = null;
                c21731.L$4 = null;
                c21731.L$5 = null;
                c21731.label = 3;
                if (webViewBridge.request("webview", "show", objArr, c21731) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(privacy);
            }
            return C5033xf0.f5238a;
        }
        AbstractC3375el.b0(privacy);
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = this.deviceInfoRepository.getDynamicDeviceInfo();
        jSONObject = new JSONObject();
        jSONObject.put(AdUnitActivity.EXTRA_ORIENTATION, this.deviceInfoRepository.getOrientation());
        jSONObject.put("connectionType", this.deviceInfoRepository.getConnectionTypeStr());
        jSONObject.put("isMuted", this.deviceInfoRepository.getRingerMode() != 2);
        jSONObject.put("volume", dynamicDeviceInfo.getAndroid().getVolume());
        SessionRepository sessionRepository = this.sessionRepository;
        c21731.L$0 = this;
        c21731.L$1 = map;
        c21731.L$2 = jSONObject;
        c21731.L$3 = jSONObject;
        str = "privacy";
        c21731.L$4 = "privacy";
        c21731.L$5 = jSONObject;
        c21731.label = 1;
        privacy = sessionRepository.getPrivacy(c21731);
        if (privacy == enumC4602sk) {
            return enumC4602sk;
        }
        webViewAdPlayer = this;
        map2 = map;
        jSONObject2 = jSONObject;
        jSONObject3 = jSONObject2;
        jSONObject2.put(str, ProtobufExtensionsKt.toBase64$default((ByteString) privacy, false, 1, null));
        SessionRepository sessionRepository2 = webViewAdPlayer.sessionRepository;
        c21731.L$0 = webViewAdPlayer;
        c21731.L$1 = map2;
        c21731.L$2 = jSONObject3;
        c21731.L$3 = jSONObject;
        c21731.L$4 = "privacyFsm";
        c21731.L$5 = jSONObject;
        c21731.label = 2;
        Object privacyFsm = sessionRepository2.getPrivacyFsm(c21731);
        if (privacyFsm == enumC4602sk) {
            return enumC4602sk;
        }
        jSONObject4 = jSONObject;
        jSONObject5 = jSONObject3;
        map3 = map2;
        webViewAdPlayer2 = webViewAdPlayer;
        str2 = "privacyFsm";
        privacy = privacyFsm;
        jSONObject6 = jSONObject4;
        jSONObject6.put(str2, ProtobufExtensionsKt.toBase64$default((ByteString) privacy, false, 1, null));
        ByteString byteString2 = ((AllowedPiiOuterClass.AllowedPii) ((C4907w90) webViewAdPlayer2.deviceInfoRepository.getAllowedPii()).getValue()).toByteString();
        AbstractC2995aW.p(byteString2, "deviceInfoRepository.all…dPii.value.toByteString()");
        jSONObject4.put("allowedPii", ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
        if (map3 != null) {
            linkedHashMap = new LinkedHashMap();
            while (r15.hasNext()) {
                if (!AbstractC2995aW.i(entry.getKey(), "objectId")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            if (!linkedHashMap.isEmpty()) {
                jSONObject4.put("showOptions", new JSONObject(linkedHashMap));
            }
        }
        webViewBridge = webViewAdPlayer2.bridge;
        objArr = new Object[]{jSONObject5};
        c21731.L$0 = null;
        c21731.L$1 = null;
        c21731.L$2 = null;
        c21731.L$3 = null;
        c21731.L$4 = null;
        c21731.L$5 = null;
        c21731.label = 3;
        if (webViewBridge.request("webview", "show", objArr, c21731) == enumC4602sk) {
            return enumC4602sk;
        }
        return C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendActivityDestroyed(InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(C21742.INSTANCE, interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendFocusChange(boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21762(z), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendGmaEvent(GMAEvent gMAEvent, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21772(gMAEvent), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendMuteChange(boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21782(z), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendPrivacyFsmChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21792(bArr), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendScarBannerEvent(BannerBridge.BannerEvent bannerEvent, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21802(bannerEvent), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendUserConsentChange(byte[] bArr, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21812(bArr), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVisibilityChange(boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21822(z), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public Object sendVolumeChange(double d, InterfaceC2857Wj interfaceC2857Wj) {
        Object objSendEvent = sendEvent(new C21832(d), interfaceC2857Wj);
        return objSendEvent == EnumC4602sk.f4993a ? objSendEvent : C5033xf0.f5238a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
