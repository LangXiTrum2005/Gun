package com.unity3d.ads.core.domain;

import android.app.Activity;
import com.badlogic.gdx.Input;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.EmbeddableAdPlayer;
import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.events.GetOperativeEventApi;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.FlowExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.ShowStatusExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.OperativeEventErrorDataKt;
import gatewayprotocol.v1.OperativeEventRequestOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2402Ev;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3917kx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5203zc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class LegacyShowUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_OBJECT_ID = "objectId";
    public static final String MESSAGE_AD_PLAYER_UNAVAILABLE = "Ad player is unavailable.";
    public static final String MESSAGE_ALREADY_SHOWING = "Can't show a new ad unit when ad unit is already open";
    public static final String MESSAGE_NO_AD_OBJECT = "No ad object found for opportunity id: ";
    public static final String MESSAGE_OPPORTUNITY_ID = "No valid opportunity id provided";
    public static final String MESSAGE_OPT_TIMEOUT = "timeout";
    public static final String MESSAGE_TIMEOUT = "[UnityAds] Timeout while trying to show ";
    public static final String MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING = "[UnityAds] Object ID and Placement ID provided does not match previously loaded ad";
    private static volatile boolean isFullscreenAdShowing;
    private AdObject adObject;
    private final AdRepository adRepository;
    private final AbstractC3899kk dispatcher;
    private final GetInitializationState getInitializationState;
    private final GetOperativeEventApi getOperativeEventApi;
    private final InterfaceC4309pQ hasStarted;
    private String placement;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private final Show show;
    private final InterfaceC4309pQ timeoutCancellationRequested;
    private UnityAdsShowOptions unityAdsShowOptions;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$getTmpAdObject$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {295}, m = "getTmpAdObject")
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
            return LegacyShowUseCase.this.getTmpAdObject(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {Input.Keys.NOTIFICATION, Input.Keys.MEDIA_PREVIOUS, Input.Keys.PAGE_DOWN, 100, 105, 108, 113, 120, EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE, Input.Keys.NUMPAD_SUBTRACT}, m = "invoke")
    public static final class C22101 extends AbstractC2883Xj {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public C22101(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.invoke(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$2", f = "LegacyShowUseCase.kt", l = {Input.Keys.F9, Input.Keys.NUMPAD_1, Input.Keys.NUMPAD_2}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ String $placement;
        final /* synthetic */ InterfaceC3917kx $reportShowError;
        final /* synthetic */ boolean $useTimeout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(boolean z, AdObject adObject, boolean z2, InterfaceC3917kx interfaceC3917kx, String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$isBanner = z;
            this.$adObject = adObject;
            this.$useTimeout = z2;
            this.$reportShowError = interfaceC3917kx;
            this.$placement = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass2 anonymousClass2 = LegacyShowUseCase.this.new AnonymousClass2(this.$isBanner, this.$adObject, this.$useTimeout, this.$reportShowError, this.$placement, interfaceC2857Wj);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC2714Qw interfaceC2714Qw, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC2714Qw, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            InterfaceC2714Qw interfaceC2714Qw;
            InterfaceC3917kx interfaceC3917kx;
            UnityAds.UnityAdsShowError unityAdsShowError;
            String str;
            InterfaceC2714Qw interfaceC2714Qw2;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                interfaceC2714Qw = (InterfaceC2714Qw) this.L$0;
                if (!((Boolean) ((C4907w90) LegacyShowUseCase.this.hasStarted).getValue()).booleanValue() && !((Boolean) ((C4907w90) LegacyShowUseCase.this.timeoutCancellationRequested).getValue()).booleanValue() && !this.$isBanner) {
                    LegacyShowUseCase legacyShowUseCase = LegacyShowUseCase.this;
                    OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_TIMEOUT;
                    AdObject adObject = this.$adObject;
                    this.L$0 = interfaceC2714Qw;
                    this.label = 1;
                    if (legacyShowUseCase.sendOperativeError(operativeEventErrorType, "timeout", adObject, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                return c5033xf0;
            }
            if (i == 1) {
                interfaceC2714Qw = (InterfaceC2714Qw) this.L$0;
                AbstractC3375el.b0(obj);
            } else if (i == 2) {
                interfaceC2714Qw = (InterfaceC2714Qw) this.L$0;
                AbstractC3375el.b0(obj);
                interfaceC3917kx = this.$reportShowError;
                unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
                str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
                this.L$0 = interfaceC2714Qw;
                this.label = 3;
                if (interfaceC3917kx.invoke("timeout", unityAdsShowError, str, null, null, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                interfaceC2714Qw2 = interfaceC2714Qw;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC2714Qw2 = (InterfaceC2714Qw) this.L$0;
                AbstractC3375el.b0(obj);
            }
            interfaceC2714Qw2.invoke();
            return c5033xf0;
            if (this.$useTimeout) {
                Show show = LegacyShowUseCase.this.show;
                AdObject adObject2 = this.$adObject;
                this.L$0 = interfaceC2714Qw;
                this.label = 2;
                if (show.terminate(adObject2, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                interfaceC3917kx = this.$reportShowError;
                unityAdsShowError = UnityAds.UnityAdsShowError.TIMEOUT;
                str = LegacyShowUseCase.MESSAGE_TIMEOUT + this.$placement;
                this.L$0 = interfaceC2714Qw;
                this.label = 3;
                if (interfaceC3917kx.invoke("timeout", unityAdsShowError, str, null, null, this) == enumC4602sk) {
                    return enumC4602sk;
                }
                interfaceC2714Qw2 = interfaceC2714Qw;
                interfaceC2714Qw2.invoke();
            }
            return c5033xf0;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$3", f = "LegacyShowUseCase.kt", l = {Input.Keys.NUMPAD_7}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends Ea0 implements InterfaceC3655hx {
        final /* synthetic */ boolean $isBanner;
        final /* synthetic */ InterfaceC3917kx $reportShowError;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(InterfaceC3917kx interfaceC3917kx, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
            super(3, interfaceC2857Wj);
            this.$reportShowError = interfaceC3917kx;
            this.$isBanner = z;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
        public final Object invoke(InterfaceC4530rv interfaceC4530rv, Throwable th, InterfaceC2857Wj interfaceC2857Wj) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$reportShowError, this.$isBanner, interfaceC2857Wj);
            anonymousClass3.L$0 = th;
            return anonymousClass3.invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                Throwable th = (Throwable) this.L$0;
                InterfaceC3917kx interfaceC3917kx = this.$reportShowError;
                UnityAds.UnityAdsShowError unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, 1, null);
                this.label = 1;
                if (interfaceC3917kx.invoke("uncaught_exception", unityAdsShowError, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, null, shortenedStackTrace$default, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            if (!this.$isBanner) {
                LegacyShowUseCase.isFullscreenAdShowing = false;
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$invoke$4, reason: invalid class name */
    public static final class AnonymousClass4<T> implements InterfaceC4530rv {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ InterfaceC3917kx $reportShowError;
        final /* synthetic */ long $startTime;

        public AnonymousClass4(long j, String str, Listeners listeners, AdObject adObject, InterfaceC3917kx interfaceC3917kx) {
            this.$startTime = j;
            this.$placement = str;
            this.$listeners = listeners;
            this.$adObject = adObject;
            this.$reportShowError = interfaceC3917kx;
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0100 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4530rv
        public final Object emit(ShowEvent showEvent, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
            LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$1;
            AnonymousClass4<T> anonymousClass4;
            InterfaceC3917kx interfaceC3917kx;
            String reason;
            UnityAds.UnityAdsShowError unityAdsShowError;
            String message;
            Integer num;
            String message2;
            if (interfaceC2857Wj instanceof LegacyShowUseCase$invoke$4$emit$1) {
                legacyShowUseCase$invoke$4$emit$1 = (LegacyShowUseCase$invoke$4$emit$1) interfaceC2857Wj;
                int i = legacyShowUseCase$invoke$4$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    legacyShowUseCase$invoke$4$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    legacyShowUseCase$invoke$4$emit$1 = new LegacyShowUseCase$invoke$4$emit$1(this, interfaceC2857Wj);
                }
            } else {
                legacyShowUseCase$invoke$4$emit$1 = new LegacyShowUseCase$invoke$4$emit$1(this, interfaceC2857Wj);
            }
            LegacyShowUseCase$invoke$4$emit$1 legacyShowUseCase$invoke$4$emit$2 = legacyShowUseCase$invoke$4$emit$1;
            Object obj = legacyShowUseCase$invoke$4$emit$2.result;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i2 = legacyShowUseCase$invoke$4$emit$2.label;
            C5033xf0 c5033xf0 = C5033xf0.f5238a;
            if (i2 == 0) {
                AbstractC3375el.b0(obj);
                if (showEvent instanceof ShowEvent.Started) {
                    LegacyShowUseCase legacyShowUseCase = LegacyShowUseCase.this;
                    Bc0 bc0 = new Bc0(this.$startTime);
                    String str = this.$placement;
                    Listeners listeners = this.$listeners;
                    legacyShowUseCase$invoke$4$emit$2.label = 1;
                    return legacyShowUseCase.showStarted(bc0, str, listeners, legacyShowUseCase$invoke$4$emit$2) == enumC4602sk ? enumC4602sk : c5033xf0;
                }
                if (showEvent instanceof ShowEvent.Clicked) {
                    LegacyShowUseCase legacyShowUseCase2 = LegacyShowUseCase.this;
                    Bc0 bc1 = new Bc0(this.$startTime);
                    String str2 = this.$placement;
                    Listeners listeners2 = this.$listeners;
                    legacyShowUseCase$invoke$4$emit$2.label = 2;
                    return legacyShowUseCase2.showClicked(bc1, str2, listeners2, legacyShowUseCase$invoke$4$emit$2) == enumC4602sk ? enumC4602sk : c5033xf0;
                }
                if (showEvent instanceof ShowEvent.Completed) {
                    LegacyShowUseCase legacyShowUseCase3 = LegacyShowUseCase.this;
                    Bc0 bc2 = new Bc0(this.$startTime);
                    String str3 = this.$placement;
                    ShowStatus status = ((ShowEvent.Completed) showEvent).getStatus();
                    Listeners listeners3 = this.$listeners;
                    legacyShowUseCase$invoke$4$emit$2.label = 3;
                    return legacyShowUseCase3.showCompleted(bc2, str3, status, listeners3, legacyShowUseCase$invoke$4$emit$2) == enumC4602sk ? enumC4602sk : c5033xf0;
                }
                if (!(showEvent instanceof ShowEvent.Error)) {
                    if (showEvent instanceof ShowEvent.CancelTimeout) {
                        LegacyShowUseCase.this.cancelTimeout(new Bc0(this.$startTime));
                    } else if (showEvent instanceof ShowEvent.LeftApplication) {
                        LegacyShowUseCase.this.bannerLeftApplication(new Bc0(this.$startTime), this.$placement, this.$listeners);
                    }
                    return c5033xf0;
                }
                LegacyShowUseCase legacyShowUseCase4 = LegacyShowUseCase.this;
                OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType = OperativeEventRequestOuterClass.OperativeEventErrorType.OPERATIVE_EVENT_ERROR_TYPE_UNSPECIFIED;
                String message3 = ((ShowEvent.Error) showEvent).getMessage();
                AdObject adObject = this.$adObject;
                legacyShowUseCase$invoke$4$emit$2.L$0 = this;
                legacyShowUseCase$invoke$4$emit$2.L$1 = showEvent;
                legacyShowUseCase$invoke$4$emit$2.label = 4;
                if (legacyShowUseCase4.sendOperativeError(operativeEventErrorType, message3, adObject, legacyShowUseCase$invoke$4$emit$2) == enumC4602sk) {
                    return enumC4602sk;
                }
                anonymousClass4 = this;
                interfaceC3917kx = anonymousClass4.$reportShowError;
                ShowEvent.Error error = (ShowEvent.Error) showEvent;
                reason = error.getReason();
                unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                message = error.getMessage();
                num = new Integer(error.getErrorCode());
                message2 = error.getMessage();
                legacyShowUseCase$invoke$4$emit$2.L$0 = null;
                legacyShowUseCase$invoke$4$emit$2.L$1 = null;
                legacyShowUseCase$invoke$4$emit$2.label = 5;
                if (interfaceC3917kx.invoke(reason, unityAdsShowError, message, num, message2, legacyShowUseCase$invoke$4$emit$2) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i2 == 1) {
                    AbstractC3375el.b0(obj);
                }
                if (i2 == 2) {
                    AbstractC3375el.b0(obj);
                }
                if (i2 == 3) {
                    AbstractC3375el.b0(obj);
                }
                if (i2 == 4) {
                    showEvent = (ShowEvent) legacyShowUseCase$invoke$4$emit$2.L$1;
                    anonymousClass4 = (AnonymousClass4) legacyShowUseCase$invoke$4$emit$2.L$0;
                    AbstractC3375el.b0(obj);
                    interfaceC3917kx = anonymousClass4.$reportShowError;
                    ShowEvent.Error error2 = (ShowEvent.Error) showEvent;
                    reason = error2.getReason();
                    unityAdsShowError = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    message = error2.getMessage();
                    num = new Integer(error2.getErrorCode());
                    message2 = error2.getMessage();
                    legacyShowUseCase$invoke$4$emit$2.L$0 = null;
                    legacyShowUseCase$invoke$4$emit$2.L$1 = null;
                    legacyShowUseCase$invoke$4$emit$2.label = 5;
                    if (interfaceC3917kx.invoke(reason, unityAdsShowError, message, num, message2, legacyShowUseCase$invoke$4$emit$2) == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(obj);
                }
            }
            return c5033xf0;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showClicked$2", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class C22112 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22112(Listeners listeners, String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C22112(this.$listeners, this.$placement, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22112) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            this.$listeners.onClick(this.$placement);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showCompleted$2", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class C22122 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ ShowStatus $status;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22122(Listeners listeners, String str, ShowStatus showStatus, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$listeners = listeners;
            this.$placement = str;
            this.$status = showStatus;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C22122(this.$listeners, this.$placement, this.$status, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22122) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            this.$listeners.onComplete(this.$placement, ShowStatusExtensionsKt.toUnityAdsShowCompletionState(this.$status));
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1", f = "LegacyShowUseCase.kt", l = {276}, m = "invokeSuspend")
    public static final class C22131 extends Ea0 implements InterfaceC3917kx {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        final /* synthetic */ InterfaceC5203zc0 $startTime;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        /* synthetic */ Object L$2;
        /* synthetic */ Object L$3;
        /* synthetic */ Object L$4;
        int label;
        final /* synthetic */ LegacyShowUseCase this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1, reason: invalid class name and collision with other inner class name */
        @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showError$1$1", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
        public static final class C02971 extends Ea0 implements InterfaceC3567gx {
            final /* synthetic */ Listeners $listeners;
            final /* synthetic */ String $message;
            final /* synthetic */ String $placement;
            final /* synthetic */ UnityAds.UnityAdsShowError $reason;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02971(Listeners listeners, String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, InterfaceC2857Wj interfaceC2857Wj) {
                super(2, interfaceC2857Wj);
                this.$listeners = listeners;
                this.$placement = str;
                this.$reason = unityAdsShowError;
                this.$message = str2;
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
                return new C02971(this.$listeners, this.$placement, this.$reason, this.$message, interfaceC2857Wj);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
            public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
                return ((C02971) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
            }

            @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
            public final Object invokeSuspend(Object obj) {
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                this.$listeners.onError(this.$placement, this.$reason, this.$message);
                return C5033xf0.f5238a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22131(String str, LegacyShowUseCase legacyShowUseCase, InterfaceC5203zc0 interfaceC5203zc0, Listeners listeners, InterfaceC2857Wj interfaceC2857Wj) {
            super(6, interfaceC2857Wj);
            this.$placement = str;
            this.this$0 = legacyShowUseCase;
            this.$startTime = interfaceC5203zc0;
            this.$listeners = listeners;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                String str = (String) this.L$0;
                UnityAds.UnityAdsShowError unityAdsShowError = (UnityAds.UnityAdsShowError) this.L$1;
                String str2 = (String) this.L$2;
                Integer num = (Integer) this.L$3;
                String str3 = (String) this.L$4;
                DeviceLog.debug("Unity Ads Show Failed for placement " + this.$placement);
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_failure_time", new Double(TimeExtensionsKt.elapsedMillis(this.$startTime)), this.this$0.getTags(str, num, str3), null, this.this$0.adObject, 8, null);
                AbstractC3899kk abstractC3899kk = this.this$0.dispatcher;
                C02971 c02971 = new C02971(this.$listeners, this.$placement, unityAdsShowError, str2, null);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 1;
                if (WD.X(c02971, abstractC3899kk, this) == enumC4602sk) {
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

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3917kx
        public final Object invoke(String str, UnityAds.UnityAdsShowError unityAdsShowError, String str2, Integer num, String str3, InterfaceC2857Wj interfaceC2857Wj) {
            C22131 c22131 = new C22131(this.$placement, this.this$0, this.$startTime, this.$listeners, interfaceC2857Wj);
            c22131.L$0 = str;
            c22131.L$1 = unityAdsShowError;
            c22131.L$2 = str2;
            c22131.L$3 = num;
            c22131.L$4 = str3;
            return c22131.invokeSuspend(C5033xf0.f5238a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showStart$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase", f = "LegacyShowUseCase.kt", l = {249}, m = "showStart")
    public static final class C22141 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C22141(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyShowUseCase.this.showStart(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyShowUseCase$showStarted$2", f = "LegacyShowUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class C22152 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Listeners $listeners;
        final /* synthetic */ String $placement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22152(Listeners listeners, String str, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$listeners = listeners;
            this.$placement = str;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C22152(this.$listeners, this.$placement, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22152) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            this.$listeners.onStart(this.$placement);
            return C5033xf0.f5238a;
        }
    }

    public LegacyShowUseCase(AbstractC3899kk abstractC3899kk, Show show, AdRepository adRepository, SendDiagnosticEvent sendDiagnosticEvent, GetOperativeEventApi getOperativeEventApi, GetInitializationState getInitializationState, SessionRepository sessionRepository) {
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        AbstractC2995aW.q(show, "show");
        AbstractC2995aW.q(adRepository, "adRepository");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(getOperativeEventApi, "getOperativeEventApi");
        AbstractC2995aW.q(getInitializationState, "getInitializationState");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.dispatcher = abstractC3899kk;
        this.show = show;
        this.adRepository = adRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getOperativeEventApi = getOperativeEventApi;
        this.getInitializationState = getInitializationState;
        this.sessionRepository = sessionRepository;
        Boolean bool = Boolean.FALSE;
        this.hasStarted = AbstractC4995x90.a(bool);
        this.timeoutCancellationRequested = AbstractC4995x90.a(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bannerLeftApplication(InterfaceC5203zc0 interfaceC5203zc0, String str, Listeners listeners) {
        DeviceLog.debug("Unity Ads Show Left Application for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_left_app", Double.valueOf(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), null, null, this.adObject, 12, null);
        listeners.onLeftApplication(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelTimeout(InterfaceC5203zc0 interfaceC5203zc0) throws IllegalAccessException, InvocationTargetException {
        ((C4907w90) this.timeoutCancellationRequested).i(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_cancel_timeout", Double.valueOf(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), null, null, this.adObject, 12, null);
    }

    private final String getOpportunityId(UnityAdsShowOptions unityAdsShowOptions) {
        Object objOpt;
        JSONObject data = unityAdsShowOptions.getData();
        try {
            return UUID.fromString((data == null || (objOpt = data.opt("objectId")) == null) ? null : objOpt.toString()).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, String> getTags(String str, Integer num, String str2) {
        LinkedHashMap linkedHashMapV0 = U5.v0(new C4839vT("operation", OperationType.SHOW.toString()), new C4839vT("reason", str), new C4839vT("show_has_started", String.valueOf(((Boolean) ((C4907w90) this.hasStarted).getValue()).booleanValue())));
        if (num != null) {
        }
        if (str2 != null) {
            linkedHashMapV0.put("reason_debug", str2);
        }
        return linkedHashMapV0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object getTmpAdObject(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        ByteString byteString;
        LegacyShowUseCase legacyShowUseCase;
        ByteString byteStringUtf8;
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
        Object ad = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(ad);
            UnityAdsShowOptions unityAdsShowOptions = this.unityAdsShowOptions;
            String opportunityId = unityAdsShowOptions != null ? getOpportunityId(unityAdsShowOptions) : null;
            if (opportunityId == null) {
                byteString = ByteString.EMPTY;
            } else {
                UUID uuidFromString = UUID.fromString(opportunityId);
                AbstractC2995aW.p(uuidFromString, "fromString(opportunityId)");
                byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
            }
            AdRepository adRepository = this.adRepository;
            AbstractC2995aW.p(byteString, "opportunityIdByteString");
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            ad = adRepository.getAd(byteString, anonymousClass1);
            if (ad == enumC4602sk) {
                return enumC4602sk;
            }
            legacyShowUseCase = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            legacyShowUseCase = (LegacyShowUseCase) anonymousClass1.L$0;
            AbstractC3375el.b0(ad);
        }
        AdObject adObject = (AdObject) ad;
        if (adObject != null) {
            return adObject;
        }
        UnityAdsShowOptions unityAdsShowOptions2 = legacyShowUseCase.unityAdsShowOptions;
        if (unityAdsShowOptions2 == null) {
            unityAdsShowOptions2 = new UnityAdsShowOptions();
        }
        String opportunityId2 = legacyShowUseCase.getOpportunityId(unityAdsShowOptions2);
        if (opportunityId2 == null || (byteStringUtf8 = ByteStringsKt.toByteStringUtf8(opportunityId2)) == null) {
            byteStringUtf8 = ByteString.EMPTY;
        }
        ByteString byteString2 = byteStringUtf8;
        AbstractC2995aW.p(byteString2, "getOpportunityId(showOpt…tf8() ?: ByteString.EMPTY");
        String str = legacyShowUseCase.placement;
        if (str == null) {
            str = "";
        }
        ByteString byteString3 = ByteString.EMPTY;
        AbstractC2995aW.p(byteString3, "EMPTY");
        return new AdObject(byteString2, str, byteString3, false, null, null, null, null, null, new UnityAdsLoadOptions(), false, DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_UNSPECIFIED, 376, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object sendOperativeError(OperativeEventRequestOuterClass.OperativeEventErrorType operativeEventErrorType, String str, AdObject adObject, InterfaceC2857Wj interfaceC2857Wj) {
        OperativeEventErrorDataKt.Dsl.Companion companion = OperativeEventErrorDataKt.Dsl.Companion;
        OperativeEventRequestOuterClass.OperativeEventErrorData.Builder builderNewBuilder = OperativeEventRequestOuterClass.OperativeEventErrorData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        OperativeEventErrorDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setErrorType(operativeEventErrorType);
        dsl_create.setMessage(str);
        OperativeEventRequestOuterClass.OperativeEventErrorData operativeEventErrorData_build = dsl_create._build();
        GetOperativeEventApi getOperativeEventApi = this.getOperativeEventApi;
        OperativeEventRequestOuterClass.OperativeEventType operativeEventType = OperativeEventRequestOuterClass.OperativeEventType.OPERATIVE_EVENT_TYPE_SHOW_ERROR;
        ByteString byteString = operativeEventErrorData_build.toByteString();
        AbstractC2995aW.p(byteString, "errorData.toByteString()");
        Object objInvoke = getOperativeEventApi.invoke(operativeEventType, adObject, byteString, interfaceC2857Wj);
        return objInvoke == EnumC4602sk.f4993a ? objInvoke : C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showClicked(InterfaceC5203zc0 interfaceC5203zc0, String str, Listeners listeners, InterfaceC2857Wj interfaceC2857Wj) {
        DeviceLog.debug("Unity Ads Show Clicked for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_clicked", new Double(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), null, null, this.adObject, 12, null);
        Object objX = WD.X(new C22112(listeners, str, null), this.dispatcher, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showCompleted(InterfaceC5203zc0 interfaceC5203zc0, String str, ShowStatus showStatus, Listeners listeners, InterfaceC2857Wj interfaceC2857Wj) {
        DeviceLog.debug("Unity Ads Show Completed for placement " + str);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_success_time", new Double(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), null, null, this.adObject, 12, null);
        Object objX = WD.X(new C22122(listeners, str, showStatus, null), this.dispatcher, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }

    private final InterfaceC3917kx showError(InterfaceC5203zc0 interfaceC5203zc0, String str, Listeners listeners) {
        return new C22131(str, this, interfaceC5203zc0, listeners, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object showStart(InterfaceC2857Wj interfaceC2857Wj) {
        C22141 c22141;
        String str;
        SendDiagnosticEvent sendDiagnosticEvent;
        if (interfaceC2857Wj instanceof C22141) {
            c22141 = (C22141) interfaceC2857Wj;
            int i = c22141.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22141.label = i - Integer.MIN_VALUE;
            } else {
                c22141 = new C22141(interfaceC2857Wj);
            }
        } else {
            c22141 = new C22141(interfaceC2857Wj);
        }
        Object obj = c22141.result;
        Object obj2 = EnumC4602sk.f4993a;
        int i2 = c22141.label;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            SendDiagnosticEvent sendDiagnosticEvent2 = this.sendDiagnosticEvent;
            c22141.L$0 = sendDiagnosticEvent2;
            c22141.L$1 = "native_show_started";
            c22141.label = 1;
            Object tmpAdObject = getTmpAdObject(c22141);
            if (tmpAdObject == obj2) {
                return obj2;
            }
            str = "native_show_started";
            sendDiagnosticEvent = sendDiagnosticEvent2;
            obj = tmpAdObject;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c22141.L$1;
            sendDiagnosticEvent = (SendDiagnosticEvent) c22141.L$0;
            AbstractC3375el.b0(obj);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, str, null, null, null, (AdObject) obj, 14, null);
        return C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showStarted(InterfaceC5203zc0 interfaceC5203zc0, String str, Listeners listeners, InterfaceC2857Wj interfaceC2857Wj) throws IllegalAccessException, InvocationTargetException {
        DeviceLog.debug("Unity Ads Show WV Start for placement " + str);
        ((C4907w90) this.hasStarted).i(Boolean.TRUE);
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_wv_started", new Double(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)), null, null, this.adObject, 12, null);
        Object objX = WD.X(new C22152(listeners, str, null), this.dispatcher, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:29:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:33:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:35:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x010e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x011a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0136 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:42:0x0137 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x0138 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x013a  */
    /* JADX WARN: Code duplicated, block: B:45:0x013f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0142  */
    /* JADX WARN: Code duplicated, block: B:53:0x0158  */
    /* JADX WARN: Code duplicated, block: B:56:0x0174 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x0175 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:58:0x0176  */
    /* JADX WARN: Code duplicated, block: B:60:0x019e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01af  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:67:0x01d6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x0215  */
    /* JADX WARN: Code duplicated, block: B:88:0x024e  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:96:0x028e  */
    /* JADX WARN: Code duplicated, block: B:99:0x02f3 A[RETURN] */
    public final Object invoke(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, InterfaceC2857Wj interfaceC2857Wj) {
        C22101 c22101;
        Activity activity2;
        long j;
        Listeners listeners2;
        LegacyShowUseCase legacyShowUseCase;
        String str2;
        InterfaceC3917kx interfaceC3917kxShowError;
        String opportunityId;
        Object ad;
        Activity activity3;
        long j2;
        String str3;
        UnityAdsShowOptions unityAdsShowOptions2;
        Listeners listeners3;
        String str4;
        InterfaceC3917kx interfaceC3917kx;
        String string;
        UnityAds.UnityAdsShowError unityAdsShowError;
        JSONObject data;
        Object objOpt;
        UnityAds.UnityAdsShowError unityAdsShowError2;
        UnityAds.UnityAdsShowError unityAdsShowError3;
        AdObject adObject;
        AdPlayer adPlayer;
        boolean z;
        C2402Ev c2402Ev;
        AnonymousClass4 anonymousClass4;
        int i;
        InterfaceC4514rk scope;
        UnityAds.UnityAdsShowError unityAdsShowError4;
        String strI;
        String str5 = str;
        UnityAdsShowOptions unityAdsShowOptions3 = unityAdsShowOptions;
        if (interfaceC2857Wj instanceof C22101) {
            c22101 = (C22101) interfaceC2857Wj;
            int i2 = c22101.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c22101.label = i2 - Integer.MIN_VALUE;
            } else {
                c22101 = new C22101(interfaceC2857Wj);
            }
        } else {
            c22101 = new C22101(interfaceC2857Wj);
        }
        C22101 c22102 = c22101;
        Object obj = c22102.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i3 = c22102.label;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        switch (i3) {
            case 0:
                AbstractC3375el.b0(obj);
                long jA = IP.a();
                this.placement = str5;
                this.unityAdsShowOptions = unityAdsShowOptions3;
                DeviceLog.debug("Unity Ads Show Start for placement " + str5);
                c22102.L$0 = this;
                c22102.L$1 = activity;
                c22102.L$2 = str5;
                c22102.L$3 = unityAdsShowOptions3;
                c22102.L$4 = listeners;
                c22102.J$0 = jA;
                c22102.label = 1;
                if (showStart(c22102) == enumC4602sk) {
                    return enumC4602sk;
                }
                activity2 = activity;
                j = jA;
                listeners2 = listeners;
                legacyShowUseCase = this;
                Bc0 bc0 = new Bc0(j);
                if (str5 == null) {
                    str2 = "";
                } else {
                    str2 = str5;
                }
                interfaceC3917kxShowError = legacyShowUseCase.showError(bc0, str2, listeners2);
                if (str5 == null) {
                    unityAdsShowError3 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.label = 2;
                    if (interfaceC3917kxShowError.invoke("placement_null", unityAdsShowError3, LoadResult.MSG_PLACEMENT_NULL, null, null, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                if (GetInitializationState.DefaultImpls.invoke$default(legacyShowUseCase.getInitializationState, false, 1, null) != InitializationState.INITIALIZED) {
                    unityAdsShowError2 = UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.label = 3;
                    if (interfaceC3917kxShowError.invoke("not_initialized", unityAdsShowError2, LoadResult.MSG_NOT_INITIALIZED, null, null, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                if (unityAdsShowOptions3 != null) {
                    opportunityId = legacyShowUseCase.getOpportunityId(unityAdsShowOptions3);
                } else {
                    opportunityId = null;
                }
                if (opportunityId == null) {
                    if (unityAdsShowOptions3 != null || (data = unityAdsShowOptions3.getData()) == null || (objOpt = data.opt("objectId")) == null) {
                        string = null;
                    } else {
                        string = objOpt.toString();
                    }
                    unityAdsShowError = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.label = 4;
                    if (interfaceC3917kxShowError.invoke("no_opportunity_id", unityAdsShowError, MESSAGE_OPPORTUNITY_ID, null, string, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                UUID uuidFromString = UUID.fromString(opportunityId);
                AbstractC2995aW.p(uuidFromString, "fromString(opportunityId)");
                ByteString byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
                AdRepository adRepository = legacyShowUseCase.adRepository;
                c22102.L$0 = legacyShowUseCase;
                c22102.L$1 = activity2;
                c22102.L$2 = str5;
                c22102.L$3 = unityAdsShowOptions3;
                c22102.L$4 = listeners2;
                c22102.L$5 = interfaceC3917kxShowError;
                c22102.L$6 = opportunityId;
                c22102.J$0 = j;
                c22102.label = 5;
                ad = adRepository.getAd(byteString, c22102);
                if (ad == enumC4602sk) {
                    return enumC4602sk;
                }
                activity3 = activity2;
                j2 = j;
                str3 = str5;
                unityAdsShowOptions2 = unityAdsShowOptions3;
                listeners3 = listeners2;
                str4 = opportunityId;
                interfaceC3917kx = interfaceC3917kxShowError;
                obj = ad;
                adObject = (AdObject) obj;
                legacyShowUseCase.adObject = adObject;
                if (adObject == null) {
                    unityAdsShowError4 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    strI = AbstractC3888ke0.i(MESSAGE_NO_AD_OBJECT, str4);
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.L$5 = null;
                    c22102.L$6 = null;
                    c22102.label = 6;
                    if (interfaceC3917kx.invoke("ad_object_not_found", unityAdsShowError4, strI, null, null, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                adPlayer = adObject.getAdPlayer();
                if (adPlayer == null && (scope = adPlayer.getScope()) != null && !WD.x(scope)) {
                    UnityAds.UnityAdsShowError unityAdsShowError5 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.L$5 = null;
                    c22102.L$6 = null;
                    c22102.label = 7;
                    return interfaceC3917kx.invoke("ad_player_scope_not_active", unityAdsShowError5, MESSAGE_AD_PLAYER_UNAVAILABLE, null, null, c22102) == enumC4602sk ? enumC4602sk : c5033xf0;
                }
                z = adObject.getAdPlayer() instanceof EmbeddableAdPlayer;
                if (z && isFullscreenAdShowing) {
                    UnityAds.UnityAdsShowError unityAdsShowError6 = UnityAds.UnityAdsShowError.ALREADY_SHOWING;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.L$5 = null;
                    c22102.L$6 = null;
                    c22102.label = 8;
                    return interfaceC3917kx.invoke("already_showing", unityAdsShowError6, MESSAGE_ALREADY_SHOWING, null, null, c22102) == enumC4602sk ? enumC4602sk : c5033xf0;
                }
                if (!legacyShowUseCase.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation() && !AbstractC2995aW.i(adObject.getPlacementId(), str3)) {
                    UnityAds.UnityAdsShowError unityAdsShowError7 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.L$5 = null;
                    c22102.L$6 = null;
                    c22102.label = 9;
                    return interfaceC3917kx.invoke("placement_validation", unityAdsShowError7, MSG_OPPORTUNITY_AND_PLACEMENT_NOT_MATCHING, null, null, c22102) == enumC4602sk ? enumC4602sk : c5033xf0;
                }
                long showTimeoutMs = legacyShowUseCase.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                if (!z) {
                    isFullscreenAdShowing = true;
                }
                c2402Ev = new C2402Ev(FlowExtensionsKt.timeoutAfter$default(legacyShowUseCase.show.invoke(activity3, adObject, unityAdsShowOptions2), showTimeoutMs, false, legacyShowUseCase.new AnonymousClass2(z, adObject, true, interfaceC3917kx, str3, null), 2, null), new AnonymousClass3(interfaceC3917kx, z, null));
                anonymousClass4 = legacyShowUseCase.new AnonymousClass4(j2, str3, listeners3, adObject, interfaceC3917kx);
                c22102.L$0 = null;
                c22102.L$1 = null;
                c22102.L$2 = null;
                c22102.L$3 = null;
                c22102.L$4 = null;
                c22102.L$5 = null;
                c22102.L$6 = null;
                c22102.I$0 = z ? 1 : 0;
                c22102.label = 10;
                if (c2402Ev.collect(anonymousClass4, c22102) == enumC4602sk) {
                    return enumC4602sk;
                }
                i = z ? 1 : 0;
                if (i == 0) {
                    isFullscreenAdShowing = false;
                }
                return c5033xf0;
            case 1:
                long j3 = c22102.J$0;
                listeners2 = (Listeners) c22102.L$4;
                UnityAdsShowOptions unityAdsShowOptions4 = (UnityAdsShowOptions) c22102.L$3;
                String str6 = (String) c22102.L$2;
                activity2 = (Activity) c22102.L$1;
                LegacyShowUseCase legacyShowUseCase2 = (LegacyShowUseCase) c22102.L$0;
                AbstractC3375el.b0(obj);
                unityAdsShowOptions3 = unityAdsShowOptions4;
                str5 = str6;
                legacyShowUseCase = legacyShowUseCase2;
                j = j3;
                Bc0 bc1 = new Bc0(j);
                if (str5 == null) {
                    str2 = "";
                } else {
                    str2 = str5;
                }
                interfaceC3917kxShowError = legacyShowUseCase.showError(bc1, str2, listeners2);
                if (str5 == null) {
                    unityAdsShowError3 = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.label = 2;
                    if (interfaceC3917kxShowError.invoke("placement_null", unityAdsShowError3, LoadResult.MSG_PLACEMENT_NULL, null, null, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                if (GetInitializationState.DefaultImpls.invoke$default(legacyShowUseCase.getInitializationState, false, 1, null) != InitializationState.INITIALIZED) {
                    unityAdsShowError2 = UnityAds.UnityAdsShowError.NOT_INITIALIZED;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.label = 3;
                    if (interfaceC3917kxShowError.invoke("not_initialized", unityAdsShowError2, LoadResult.MSG_NOT_INITIALIZED, null, null, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                if (unityAdsShowOptions3 != null) {
                    opportunityId = legacyShowUseCase.getOpportunityId(unityAdsShowOptions3);
                } else {
                    opportunityId = null;
                }
                if (opportunityId == null) {
                    if (unityAdsShowOptions3 != null) {
                        string = null;
                    } else {
                        string = null;
                    }
                    unityAdsShowError = UnityAds.UnityAdsShowError.INVALID_ARGUMENT;
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.label = 4;
                    if (interfaceC3917kxShowError.invoke("no_opportunity_id", unityAdsShowError, MESSAGE_OPPORTUNITY_ID, null, string, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                UUID uuidFromString2 = UUID.fromString(opportunityId);
                AbstractC2995aW.p(uuidFromString2, "fromString(opportunityId)");
                ByteString byteString2 = ProtobufExtensionsKt.toByteString(uuidFromString2);
                AdRepository adRepository2 = legacyShowUseCase.adRepository;
                c22102.L$0 = legacyShowUseCase;
                c22102.L$1 = activity2;
                c22102.L$2 = str5;
                c22102.L$3 = unityAdsShowOptions3;
                c22102.L$4 = listeners2;
                c22102.L$5 = interfaceC3917kxShowError;
                c22102.L$6 = opportunityId;
                c22102.J$0 = j;
                c22102.label = 5;
                ad = adRepository2.getAd(byteString2, c22102);
                if (ad == enumC4602sk) {
                    return enumC4602sk;
                }
                activity3 = activity2;
                j2 = j;
                str3 = str5;
                unityAdsShowOptions2 = unityAdsShowOptions3;
                listeners3 = listeners2;
                str4 = opportunityId;
                interfaceC3917kx = interfaceC3917kxShowError;
                obj = ad;
                adObject = (AdObject) obj;
                legacyShowUseCase.adObject = adObject;
                if (adObject == null) {
                    unityAdsShowError4 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    strI = AbstractC3888ke0.i(MESSAGE_NO_AD_OBJECT, str4);
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.L$5 = null;
                    c22102.L$6 = null;
                    c22102.label = 6;
                    if (interfaceC3917kx.invoke("ad_object_not_found", unityAdsShowError4, strI, null, null, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                adPlayer = adObject.getAdPlayer();
                if (adPlayer == null) {
                    break;
                }
                z = adObject.getAdPlayer() instanceof EmbeddableAdPlayer;
                if (z) {
                    break;
                }
                if (!legacyShowUseCase.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation()) {
                    break;
                }
                long showTimeoutMs2 = legacyShowUseCase.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                if (!z) {
                    isFullscreenAdShowing = true;
                }
                c2402Ev = new C2402Ev(FlowExtensionsKt.timeoutAfter$default(legacyShowUseCase.show.invoke(activity3, adObject, unityAdsShowOptions2), showTimeoutMs2, false, legacyShowUseCase.new AnonymousClass2(z, adObject, true, interfaceC3917kx, str3, null), 2, null), new AnonymousClass3(interfaceC3917kx, z, null));
                anonymousClass4 = legacyShowUseCase.new AnonymousClass4(j2, str3, listeners3, adObject, interfaceC3917kx);
                c22102.L$0 = null;
                c22102.L$1 = null;
                c22102.L$2 = null;
                c22102.L$3 = null;
                c22102.L$4 = null;
                c22102.L$5 = null;
                c22102.L$6 = null;
                c22102.I$0 = z ? 1 : 0;
                c22102.label = 10;
                if (c2402Ev.collect(anonymousClass4, c22102) == enumC4602sk) {
                    return enumC4602sk;
                }
                i = z ? 1 : 0;
                if (i == 0) {
                    isFullscreenAdShowing = false;
                }
                return c5033xf0;
            case 2:
                AbstractC3375el.b0(obj);
                return c5033xf0;
            case 3:
                AbstractC3375el.b0(obj);
                return c5033xf0;
            case 4:
                AbstractC3375el.b0(obj);
                return c5033xf0;
            case 5:
                long j4 = c22102.J$0;
                str4 = (String) c22102.L$6;
                interfaceC3917kx = (InterfaceC3917kx) c22102.L$5;
                listeners3 = (Listeners) c22102.L$4;
                unityAdsShowOptions2 = (UnityAdsShowOptions) c22102.L$3;
                str3 = (String) c22102.L$2;
                activity3 = (Activity) c22102.L$1;
                legacyShowUseCase = (LegacyShowUseCase) c22102.L$0;
                AbstractC3375el.b0(obj);
                j2 = j4;
                adObject = (AdObject) obj;
                legacyShowUseCase.adObject = adObject;
                if (adObject == null) {
                    unityAdsShowError4 = UnityAds.UnityAdsShowError.INTERNAL_ERROR;
                    strI = AbstractC3888ke0.i(MESSAGE_NO_AD_OBJECT, str4);
                    c22102.L$0 = null;
                    c22102.L$1 = null;
                    c22102.L$2 = null;
                    c22102.L$3 = null;
                    c22102.L$4 = null;
                    c22102.L$5 = null;
                    c22102.L$6 = null;
                    c22102.label = 6;
                    if (interfaceC3917kx.invoke("ad_object_not_found", unityAdsShowError4, strI, null, null, c22102) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return c5033xf0;
                }
                adPlayer = adObject.getAdPlayer();
                if (adPlayer == null) {
                    break;
                }
                z = adObject.getAdPlayer() instanceof EmbeddableAdPlayer;
                if (z) {
                    break;
                }
                if (!legacyShowUseCase.sessionRepository.getNativeConfiguration().getFeatureFlags().getOpportunityIdPlacementValidation()) {
                    break;
                }
                long showTimeoutMs3 = legacyShowUseCase.sessionRepository.getNativeConfiguration().getAdOperations().getShowTimeoutMs();
                if (!z) {
                    isFullscreenAdShowing = true;
                }
                c2402Ev = new C2402Ev(FlowExtensionsKt.timeoutAfter$default(legacyShowUseCase.show.invoke(activity3, adObject, unityAdsShowOptions2), showTimeoutMs3, false, legacyShowUseCase.new AnonymousClass2(z, adObject, true, interfaceC3917kx, str3, null), 2, null), new AnonymousClass3(interfaceC3917kx, z, null));
                anonymousClass4 = legacyShowUseCase.new AnonymousClass4(j2, str3, listeners3, adObject, interfaceC3917kx);
                c22102.L$0 = null;
                c22102.L$1 = null;
                c22102.L$2 = null;
                c22102.L$3 = null;
                c22102.L$4 = null;
                c22102.L$5 = null;
                c22102.L$6 = null;
                c22102.I$0 = z ? 1 : 0;
                c22102.label = 10;
                if (c2402Ev.collect(anonymousClass4, c22102) == enumC4602sk) {
                    return enumC4602sk;
                }
                i = z ? 1 : 0;
                if (i == 0) {
                    isFullscreenAdShowing = false;
                }
                return c5033xf0;
            case 6:
                AbstractC3375el.b0(obj);
                return c5033xf0;
            case 7:
                AbstractC3375el.b0(obj);
            case 8:
                AbstractC3375el.b0(obj);
            case 9:
                AbstractC3375el.b0(obj);
            case 10:
                i = c22102.I$0;
                AbstractC3375el.b0(obj);
                if (i == 0) {
                    isFullscreenAdShowing = false;
                }
                return c5033xf0;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
