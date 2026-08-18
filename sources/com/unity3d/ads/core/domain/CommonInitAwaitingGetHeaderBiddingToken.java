package com.unity3d.ads.core.domain;

import com.badlogic.gdx.Input;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.core.misc.Utilities;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonInitAwaitingGetHeaderBiddingToken implements GetAsyncHeaderBiddingToken {
    private final AwaitInitialization awaitInitialization;
    private boolean didAwaitInit;
    private final GetHeaderBiddingToken getHeaderBiddingToken;
    private final GetInitializationState getInitializationState;
    private IUnityAdsTokenListener listener;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InitializationState startState;
    private final long startTime;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$fetchToken$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {Input.Keys.SLASH}, m = "fetchToken")
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
            return CommonInitAwaitingGetHeaderBiddingToken.this.fetchToken(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {51, Input.Keys.GRAVE}, m = "invoke")
    public static final class C22081 extends AbstractC2883Xj {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C22081(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonInitAwaitingGetHeaderBiddingToken.this.invoke(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2", f = "CommonInitAwaitingGetHeaderBiddingToken.kt", l = {54, Input.Keys.ALT_RIGHT, Input.Keys.SPACE}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonInitAwaitingGetHeaderBiddingToken$invoke$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InitializationState.values().length];
                try {
                    iArr[InitializationState.INITIALIZED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[InitializationState.FAILED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[InitializationState.NOT_INITIALIZED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[InitializationState.INITIALIZING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public AnonymousClass2(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return CommonInitAwaitingGetHeaderBiddingToken.this.new AnonymousClass2(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0066  */
        /* JADX WARN: Code duplicated, block: B:24:0x0070  */
        /* JADX WARN: Code duplicated, block: B:26:0x007a A[RETURN] */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        AbstractC3375el.b0(obj);
                        if (CommonInitAwaitingGetHeaderBiddingToken.this.getSessionRepository().getShouldInitialize()) {
                            commonInitAwaitingGetHeaderBiddingToken = CommonInitAwaitingGetHeaderBiddingToken.this;
                            this.label = 3;
                            if (commonInitAwaitingGetHeaderBiddingToken.fetchToken(this) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        } else {
                            CommonInitAwaitingGetHeaderBiddingToken.this.tokenFailure("gateway", "!sessionRepository.shouldInitialize");
                        }
                    } else if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC3375el.b0(obj);
            } else {
                AbstractC3375el.b0(obj);
                int i2 = WhenMappings.$EnumSwitchMapping$0[GetInitializationState.DefaultImpls.invoke$default(CommonInitAwaitingGetHeaderBiddingToken.this.getGetInitializationState(), false, 1, null).ordinal()];
                if (i2 == 1 || i2 == 2) {
                    CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken2 = CommonInitAwaitingGetHeaderBiddingToken.this;
                    this.label = 1;
                    if (commonInitAwaitingGetHeaderBiddingToken2.fetchToken(this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else if (i2 == 3 || i2 == 4) {
                    CommonInitAwaitingGetHeaderBiddingToken.this.didAwaitInit = true;
                    AwaitInitialization awaitInitialization = CommonInitAwaitingGetHeaderBiddingToken.this.getAwaitInitialization();
                    this.label = 2;
                    if (AwaitInitialization.DefaultImpls.invoke$default(awaitInitialization, 0L, this, 1, null) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    if (CommonInitAwaitingGetHeaderBiddingToken.this.getSessionRepository().getShouldInitialize()) {
                        CommonInitAwaitingGetHeaderBiddingToken.this.tokenFailure("gateway", "!sessionRepository.shouldInitialize");
                    } else {
                        commonInitAwaitingGetHeaderBiddingToken = CommonInitAwaitingGetHeaderBiddingToken.this;
                        this.label = 3;
                        if (commonInitAwaitingGetHeaderBiddingToken.fetchToken(this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                }
            }
            return C5033xf0.f5238a;
        }
    }

    public CommonInitAwaitingGetHeaderBiddingToken(GetHeaderBiddingToken getHeaderBiddingToken, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository) {
        AbstractC2995aW.q(getHeaderBiddingToken, "getHeaderBiddingToken");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(getInitializationState, "getInitializationState");
        AbstractC2995aW.q(awaitInitialization, "awaitInitialization");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.getHeaderBiddingToken = getHeaderBiddingToken;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.startTime = IP.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object fetchToken(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        String shortenedStackTrace$default;
        String str;
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
        Object objInvoke = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        String str2 = null;
        if (i2 == 0) {
            AbstractC3375el.b0(objInvoke);
            try {
                GetHeaderBiddingToken getHeaderBiddingToken = this.getHeaderBiddingToken;
                anonymousClass1.L$0 = this;
                anonymousClass1.label = 1;
                objInvoke = getHeaderBiddingToken.invoke(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                commonInitAwaitingGetHeaderBiddingToken = this;
            } catch (Exception e) {
                e = e;
                commonInitAwaitingGetHeaderBiddingToken = this;
                shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str = "uncaught_exception";
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            commonInitAwaitingGetHeaderBiddingToken = (CommonInitAwaitingGetHeaderBiddingToken) anonymousClass1.L$0;
            try {
                AbstractC3375el.b0(objInvoke);
            } catch (Exception e2) {
                e = e2;
                shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str = "uncaught_exception";
            }
        }
        str = null;
        str2 = (String) objInvoke;
        shortenedStackTrace$default = null;
        if (str2 == null) {
            commonInitAwaitingGetHeaderBiddingToken.tokenFailure(str, shortenedStackTrace$default);
        } else {
            commonInitAwaitingGetHeaderBiddingToken.tokenSuccess(str2);
        }
        return C5033xf0.f5238a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void tokenFailure(String str, String str2) {
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        Double dValueOf = Double.valueOf(TimeExtensionsKt.elapsedMillis(new Bc0(this.startTime)));
        C2985aM c2985aMW = AbstractC3375el.w();
        c2985aMW.put("sync", "false");
        c2985aMW.put("state", String.valueOf(this.startState));
        int i = 1;
        c2985aMW.put("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString());
        c2985aMW.put("awaited_init", String.valueOf(this.didAwaitInit));
        if (str != null) {
        }
        if (str2 != null) {
            c2985aMW.put("reason_debug", str2);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_gateway_token_failure_time", dValueOf, AbstractC3375el.g(c2985aMW), null, null, 24, null);
        Utilities.wrapCustomerListener(new b(this, i));
    }

    public static /* synthetic */ void tokenFailure$default(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        commonInitAwaitingGetHeaderBiddingToken.tokenFailure(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tokenFailure$lambda$4(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken) {
        AbstractC2995aW.q(commonInitAwaitingGetHeaderBiddingToken, "this$0");
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(null);
        }
    }

    private final void tokenStart() {
        InitializationState initializationStateInvoke$default = GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null);
        this.startState = initializationStateInvoke$default;
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_started", null, U5.u0(new C4839vT("sync", "false"), new C4839vT("state", String.valueOf(initializationStateInvoke$default))), null, null, 26, null);
    }

    private final void tokenSuccess(String str) {
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_gateway_token_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(new Bc0(this.startTime))), U5.u0(new C4839vT("sync", "false"), new C4839vT("state", String.valueOf(this.startState)), new C4839vT("complete_state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new C4839vT("awaited_init", String.valueOf(this.didAwaitInit))), null, null, 24, null);
        Utilities.wrapCustomerListener(new a(1, this, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tokenSuccess$lambda$0(CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken, String str) {
        AbstractC2995aW.q(commonInitAwaitingGetHeaderBiddingToken, "this$0");
        AbstractC2995aW.q(str, "$token");
        IUnityAdsTokenListener iUnityAdsTokenListener = commonInitAwaitingGetHeaderBiddingToken.listener;
        if (iUnityAdsTokenListener != null) {
            iUnityAdsTokenListener.onUnityAdsTokenReady(str);
        }
    }

    public final AwaitInitialization getAwaitInitialization() {
        return this.awaitInitialization;
    }

    public final GetHeaderBiddingToken getGetHeaderBiddingToken() {
        return this.getHeaderBiddingToken;
    }

    public final GetInitializationState getGetInitializationState() {
        return this.getInitializationState;
    }

    public final IUnityAdsTokenListener getListener() {
        return this.listener;
    }

    public final SendDiagnosticEvent getSendDiagnosticEvent() {
        return this.sendDiagnosticEvent;
    }

    public final SessionRepository getSessionRepository() {
        return this.sessionRepository;
    }

    /* JADX INFO: renamed from: getStartTime-z9LOYto, reason: not valid java name */
    public final long m75getStartTimez9LOYto() {
        return this.startTime;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken
    public Object invoke(IUnityAdsTokenListener iUnityAdsTokenListener, InterfaceC2857Wj interfaceC2857Wj) {
        C22081 c22081;
        CommonInitAwaitingGetHeaderBiddingToken commonInitAwaitingGetHeaderBiddingToken;
        if (interfaceC2857Wj instanceof C22081) {
            c22081 = (C22081) interfaceC2857Wj;
            int i = c22081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c22081.label = i - Integer.MIN_VALUE;
            } else {
                c22081 = new C22081(interfaceC2857Wj);
            }
        } else {
            c22081 = new C22081(interfaceC2857Wj);
        }
        Object obj = c22081.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = c22081.label;
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            this.listener = iUnityAdsTokenListener;
            tokenStart();
            if (iUnityAdsTokenListener == null) {
                tokenFailure("listener_null", "IUnityAdsTokenListener is null");
                return c5033xf0;
            }
            long getTokenTimeoutMs = this.sessionRepository.getNativeConfiguration().getAdOperations().getGetTokenTimeoutMs();
            try {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
                c22081.L$0 = this;
                c22081.label = 1;
                if (AbstractC2995aW.E0(getTokenTimeoutMs, anonymousClass2, c22081) == enumC4602sk) {
                    return enumC4602sk;
                }
            } catch (Jc0 unused) {
                commonInitAwaitingGetHeaderBiddingToken = this;
                c22081.L$0 = null;
                c22081.label = 2;
                if (commonInitAwaitingGetHeaderBiddingToken.fetchToken(c22081) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else if (i2 == 1) {
            commonInitAwaitingGetHeaderBiddingToken = (CommonInitAwaitingGetHeaderBiddingToken) c22081.L$0;
            try {
                AbstractC3375el.b0(obj);
            } catch (Jc0 unused2) {
                c22081.L$0 = null;
                c22081.label = 2;
                if (commonInitAwaitingGetHeaderBiddingToken.fetchToken(c22081) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return c5033xf0;
    }

    public final void setListener(IUnityAdsTokenListener iUnityAdsTokenListener) {
        this.listener = iUnityAdsTokenListener;
    }
}
