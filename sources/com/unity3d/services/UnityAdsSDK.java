package com.unity3d.services;

import android.app.Activity;
import android.content.Context;
import com.badlogic.gdx.Input;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.domain.GetAdObject;
import com.unity3d.ads.core.domain.GetAsyncHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.ads.core.domain.GetInitializationState;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.ads.core.domain.LegacyLoadUseCase;
import com.unity3d.ads.core.domain.LegacyShowUseCase;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.domain.ShouldAllowInitialization;
import com.unity3d.ads.core.domain.om.OmFinishSession;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.IServiceComponent;
import com.unity3d.services.core.di.IServiceProvider;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.domain.task.EmptyParams;
import com.unity3d.services.core.domain.task.InitializeSDK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2340Cl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3263dY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2734Rq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2985aM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4124nH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5000xE;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes4.dex */
public final class UnityAdsSDK implements IServiceComponent {
    private final IServiceProvider serviceProvider;

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$finishOMIDSession$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.UnityAdsSDK$finishOMIDSession$1", f = "UnityAdsSDK.kt", l = {Input.Keys.F16, Input.Keys.F17}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC3069bH $alternativeFlowReader$delegate;
        final /* synthetic */ InterfaceC3069bH $getAdObject$delegate;
        final /* synthetic */ InterfaceC3069bH $omFinishSession$delegate;
        final /* synthetic */ InterfaceC4514rk $omidScope;
        final /* synthetic */ String $opportunityId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, InterfaceC4514rk interfaceC4514rk, InterfaceC3069bH interfaceC3069bH, InterfaceC3069bH interfaceC3069bH2, InterfaceC3069bH interfaceC3069bH3, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$opportunityId = str;
            this.$omidScope = interfaceC4514rk;
            this.$alternativeFlowReader$delegate = interfaceC3069bH;
            this.$getAdObject$delegate = interfaceC3069bH2;
            this.$omFinishSession$delegate = interfaceC3069bH3;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass1(this.$opportunityId, this.$omidScope, this.$alternativeFlowReader$delegate, this.$getAdObject$delegate, this.$omFinishSession$delegate, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0040  */
        /* JADX WARN: Code duplicated, block: B:19:0x004e A[RETURN] */
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            AdObject adObject;
            OmFinishSession omFinishSessionFinishOMIDSession$lambda$13;
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                if (UnityAdsSDK.finishOMIDSession$lambda$14(this.$alternativeFlowReader$delegate).invoke()) {
                    GetAdObject getAdObjectFinishOMIDSession$lambda$12 = UnityAdsSDK.finishOMIDSession$lambda$12(this.$getAdObject$delegate);
                    String str = this.$opportunityId;
                    this.label = 1;
                    obj = getAdObjectFinishOMIDSession$lambda$12.invoke(str, this);
                    if (obj == enumC4602sk) {
                        return enumC4602sk;
                    }
                    adObject = (AdObject) obj;
                    if (adObject != null) {
                        omFinishSessionFinishOMIDSession$lambda$13 = UnityAdsSDK.finishOMIDSession$lambda$13(this.$omFinishSession$delegate);
                        this.label = 2;
                        if (omFinishSessionFinishOMIDSession$lambda$13.invoke(adObject, this) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    }
                }
            } else if (i == 1) {
                AbstractC3375el.b0(obj);
                adObject = (AdObject) obj;
                if (adObject != null) {
                    omFinishSessionFinishOMIDSession$lambda$13 = UnityAdsSDK.finishOMIDSession$lambda$13(this.$omFinishSession$delegate);
                    this.label = 2;
                    if (omFinishSessionFinishOMIDSession$lambda$13.invoke(adObject, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            WD.i(this.$omidScope);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.services.UnityAdsSDK$getToken$1", f = "UnityAdsSDK.kt", l = {EnumC4719u30.INVALID_METRICS_ENDPOINT_VALUE}, m = "invokeSuspend")
    public static final class C22591 extends Ea0 implements InterfaceC3567gx {
        int label;

        public C22591(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return UnityAdsSDK.this.new C22591(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22591) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                UnityAdsSDK unityAdsSDK = UnityAdsSDK.this;
                this.label = 1;
                obj = unityAdsSDK.fetchToken("true", this);
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

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$getToken$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.services.UnityAdsSDK$getToken$2", f = "UnityAdsSDK.kt", l = {133}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC3069bH $getAsyncHeaderBiddingToken$delegate;
        final /* synthetic */ InterfaceC4514rk $getTokenScope;
        final /* synthetic */ IUnityAdsTokenListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(IUnityAdsTokenListener iUnityAdsTokenListener, InterfaceC4514rk interfaceC4514rk, InterfaceC3069bH interfaceC3069bH, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$listener = iUnityAdsTokenListener;
            this.$getTokenScope = interfaceC4514rk;
            this.$getAsyncHeaderBiddingToken$delegate = interfaceC3069bH;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass2(this.$listener, this.$getTokenScope, this.$getAsyncHeaderBiddingToken$delegate, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass2) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                GetAsyncHeaderBiddingToken token$lambda$5 = UnityAdsSDK.getToken$lambda$5(this.$getAsyncHeaderBiddingToken$delegate);
                IUnityAdsTokenListener iUnityAdsTokenListener = this.$listener;
                this.label = 1;
                if (token$lambda$5.invoke(iUnityAdsTokenListener, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            WD.i(this.$getTokenScope);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$initialize$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.services.UnityAdsSDK$initialize$1", f = "UnityAdsSDK.kt", l = {Input.Keys.SEARCH, Input.Keys.MEDIA_STOP}, m = "invokeSuspend")
    public static final class C22601 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ InterfaceC3069bH $alternativeFlowReader$delegate;
        final /* synthetic */ InterfaceC4514rk $initScope;
        final /* synthetic */ InterfaceC3069bH $initializeBoldSDK$delegate;
        final /* synthetic */ InterfaceC3069bH $initializeSDK$delegate;
        final /* synthetic */ String $source;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22601(String str, InterfaceC4514rk interfaceC4514rk, InterfaceC3069bH interfaceC3069bH, InterfaceC3069bH interfaceC3069bH2, InterfaceC3069bH interfaceC3069bH3, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$source = str;
            this.$initScope = interfaceC4514rk;
            this.$alternativeFlowReader$delegate = interfaceC3069bH;
            this.$initializeBoldSDK$delegate = interfaceC3069bH2;
            this.$initializeSDK$delegate = interfaceC3069bH3;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C22601(this.$source, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22601) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                if (UnityAdsSDK.initialize$lambda$1(this.$alternativeFlowReader$delegate).invoke()) {
                    InitializeBoldSDK initializeBoldSDKInitialize$lambda$3 = UnityAdsSDK.initialize$lambda$3(this.$initializeBoldSDK$delegate);
                    String str = this.$source;
                    this.label = 1;
                    if (initializeBoldSDKInitialize$lambda$3.invoke(str, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                } else {
                    InitializeSDK initializeSDKInitialize$lambda$2 = UnityAdsSDK.initialize$lambda$2(this.$initializeSDK$delegate);
                    EmptyParams emptyParams = EmptyParams.INSTANCE;
                    this.label = 2;
                    if (initializeSDKInitialize$lambda$2.mo81invokegIAlus(emptyParams, this) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            } else if (i == 1) {
                AbstractC3375el.b0(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
                ((IZ) obj).getClass();
            }
            WD.i(this.$initScope);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$load$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.services.UnityAdsSDK$load$1", f = "UnityAdsSDK.kt", l = {104}, m = "invokeSuspend")
    public static final class C22611 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ InterfaceC3069bH $context$delegate;
        final /* synthetic */ IUnityAdsLoadListener $listener;
        final /* synthetic */ UnityAdsLoadOptions $loadOptions;
        final /* synthetic */ InterfaceC4514rk $loadScope;
        final /* synthetic */ String $placementId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22611(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, InterfaceC4514rk interfaceC4514rk, InterfaceC3069bH interfaceC3069bH, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$placementId = str;
            this.$loadOptions = unityAdsLoadOptions;
            this.$listener = iUnityAdsLoadListener;
            this.$bannerSize = unityBannerSize;
            this.$loadScope = interfaceC4514rk;
            this.$context$delegate = interfaceC3069bH;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return UnityAdsSDK.this.new C22611(this.$placementId, this.$loadOptions, this.$listener, this.$bannerSize, this.$loadScope, this.$context$delegate, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22611) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                LegacyLoadUseCase legacyLoadUseCase = (LegacyLoadUseCase) UnityAdsSDK.this.getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(LegacyLoadUseCase.class));
                Context contextLoad$lambda$4 = UnityAdsSDK.load$lambda$4(this.$context$delegate);
                String str = this.$placementId;
                UnityAdsLoadOptions unityAdsLoadOptions = this.$loadOptions;
                IUnityAdsLoadListener iUnityAdsLoadListener = this.$listener;
                UnityBannerSize unityBannerSize = this.$bannerSize;
                this.label = 1;
                if (legacyLoadUseCase.invoke(contextLoad$lambda$4, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            WD.i(this.$loadScope);
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.UnityAdsSDK$show$1, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.services.UnityAdsSDK$show$1", f = "UnityAdsSDK.kt", l = {114}, m = "invokeSuspend")
    public static final class C22621 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ Listeners $listener;
        final /* synthetic */ String $placementId;
        final /* synthetic */ LegacyShowUseCase $showBoldSDK;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        final /* synthetic */ InterfaceC4514rk $showScope;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22621(LegacyShowUseCase legacyShowUseCase, Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners, InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$showBoldSDK = legacyShowUseCase;
            this.$activity = activity;
            this.$placementId = str;
            this.$showOptions = unityAdsShowOptions;
            this.$listener = listeners;
            this.$showScope = interfaceC4514rk;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new C22621(this.$showBoldSDK, this.$activity, this.$placementId, this.$showOptions, this.$listener, this.$showScope, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22621) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                LegacyShowUseCase legacyShowUseCase = this.$showBoldSDK;
                Activity activity = this.$activity;
                String str = this.$placementId;
                UnityAdsShowOptions unityAdsShowOptions = this.$showOptions;
                Listeners listeners = this.$listener;
                this.label = 1;
                if (legacyShowUseCase.invoke(activity, str, unityAdsShowOptions, listeners, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            WD.i(this.$showScope);
            return C5033xf0.f5238a;
        }
    }

    public UnityAdsSDK() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchToken(String str, InterfaceC2857Wj interfaceC2857Wj) {
        String str2;
        String str3;
        String str4;
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$fetchToken$$inlined$inject$default$1(this, ""));
        InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$fetchToken$$inlined$inject$default$2(this, ""));
        InterfaceC3069bH interfaceC3069bHH3 = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$fetchToken$$inlined$inject$default$3(this, ""));
        long jA = IP.a();
        SendDiagnosticEvent.DefaultImpls.invoke$default(fetchToken$lambda$8(interfaceC3069bHH3), "native_gateway_token_started", null, U5.u0(new C4839vT("sync", str), new C4839vT("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$7(interfaceC3069bHH2), false, 1, null).toString())), null, null, 26, null);
        if (GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$7(interfaceC3069bHH2), false, 1, null) != InitializationState.INITIALIZED) {
            str2 = "not_initialized";
            str3 = null;
            str4 = null;
        } else {
            try {
                str4 = (String) WD.R(C2734Rq.f3684a, new UnityAdsSDK$fetchToken$token$1(interfaceC3069bHH, null));
                str2 = null;
                str3 = null;
            } catch (Exception e) {
                String shortenedStackTrace$default = ExceptionExtensionsKt.getShortenedStackTrace$default(e, 0, 1, null);
                str2 = "uncaught_exception";
                str3 = shortenedStackTrace$default;
                str4 = null;
            }
        }
        SendDiagnosticEvent sendDiagnosticEventFetchToken$lambda$8 = fetchToken$lambda$8(interfaceC3069bHH3);
        String str5 = str4 == null ? "native_gateway_token_failure_time" : "native_gateway_token_success_time";
        Double d = new Double(TimeExtensionsKt.elapsedMillis(new Bc0(jA)));
        C2985aM c2985aMW = AbstractC3375el.w();
        c2985aMW.put("sync", str);
        c2985aMW.put("state", GetInitializationState.DefaultImpls.invoke$default(fetchToken$lambda$7(interfaceC3069bHH2), false, 1, null).toString());
        if (str2 != null) {
        }
        if (str3 != null) {
            c2985aMW.put("reason_debug", str3);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEventFetchToken$lambda$8, str5, d, AbstractC3375el.g(c2985aMW), null, null, 24, null);
        return str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetHeaderBiddingToken fetchToken$lambda$6(InterfaceC3069bH interfaceC3069bH) {
        return (GetHeaderBiddingToken) interfaceC3069bH.getValue();
    }

    private static final GetInitializationState fetchToken$lambda$7(InterfaceC3069bH interfaceC3069bH) {
        return (GetInitializationState) interfaceC3069bH.getValue();
    }

    private static final SendDiagnosticEvent fetchToken$lambda$8(InterfaceC3069bH interfaceC3069bH) {
        return (SendDiagnosticEvent) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAdObject finishOMIDSession$lambda$12(InterfaceC3069bH interfaceC3069bH) {
        return (GetAdObject) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OmFinishSession finishOMIDSession$lambda$13(InterfaceC3069bH interfaceC3069bH) {
        return (OmFinishSession) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader finishOMIDSession$lambda$14(InterfaceC3069bH interfaceC3069bH) {
        return (AlternativeFlowReader) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GetAsyncHeaderBiddingToken getToken$lambda$5(InterfaceC3069bH interfaceC3069bH) {
        return (GetAsyncHeaderBiddingToken) interfaceC3069bH.getValue();
    }

    public static /* synthetic */ InterfaceC5000xE initialize$default(UnityAdsSDK unityAdsSDK, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "api";
        }
        return unityAdsSDK.initialize(str, str2);
    }

    private static final ShouldAllowInitialization initialize$lambda$0(InterfaceC3069bH interfaceC3069bH) {
        return (ShouldAllowInitialization) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlternativeFlowReader initialize$lambda$1(InterfaceC3069bH interfaceC3069bH) {
        return (AlternativeFlowReader) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeSDK initialize$lambda$2(InterfaceC3069bH interfaceC3069bH) {
        return (InitializeSDK) interfaceC3069bH.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InitializeBoldSDK initialize$lambda$3(InterfaceC3069bH interfaceC3069bH) {
        return (InitializeBoldSDK) interfaceC3069bH.getValue();
    }

    public static /* synthetic */ InterfaceC5000xE load$default(UnityAdsSDK unityAdsSDK, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, int i, Object obj) {
        if ((i & 8) != 0) {
            unityBannerSize = null;
        }
        return unityAdsSDK.load(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context load$lambda$4(InterfaceC3069bH interfaceC3069bH) {
        return (Context) interfaceC3069bH.getValue();
    }

    public final InterfaceC5000xE finishOMIDSession(String str) {
        AbstractC2995aW.q(str, "opportunityId");
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$1(this, ""));
        InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$2(this, ""));
        InterfaceC3069bH interfaceC3069bHH3 = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$finishOMIDSession$$inlined$inject$default$3(this, ""));
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_OMID_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class));
        return WD.D(interfaceC4514rk, null, 0, new AnonymousClass1(str, interfaceC4514rk, interfaceC3069bHH3, interfaceC3069bHH, interfaceC3069bHH2, null), 3);
    }

    @Override // com.unity3d.services.core.di.IServiceComponent
    public IServiceProvider getServiceProvider() {
        return this.serviceProvider;
    }

    public final String getToken() {
        return (String) WD.R(C2734Rq.f3684a, new C22591(null));
    }

    public final synchronized InterfaceC5000xE initialize(String str, String str2) {
        AbstractC2995aW.q(str2, "source");
        EnumC4124nH enumC4124nH = EnumC4124nH.c;
        if (!initialize$lambda$0(AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$initialize$$inlined$inject$default$1(this, ""))).invoke(str)) {
            return AbstractC2995aW.a();
        }
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$initialize$$inlined$inject$default$2(this, ""));
        InterfaceC3069bH interfaceC3069bHH2 = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$initialize$$inlined$inject$default$3(this, ""));
        InterfaceC3069bH interfaceC3069bHH3 = AbstractC2340Cl.H(enumC4124nH, new UnityAdsSDK$initialize$$inlined$inject$default$4(this, ""));
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_INIT_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class));
        return WD.D(interfaceC4514rk, null, 0, new C22601(str2, interfaceC4514rk, interfaceC3069bHH, interfaceC3069bHH3, interfaceC3069bHH2, null), 3);
    }

    public final InterfaceC5000xE load(String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize) {
        AbstractC2995aW.q(unityAdsLoadOptions, HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_LOAD_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class));
        return WD.D(interfaceC4514rk, null, 0, new C22611(str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, interfaceC4514rk, AbstractC2340Cl.H(EnumC4124nH.c, new UnityAdsSDK$load$$inlined$inject$default$1(this, "")), null), 3);
    }

    public final InterfaceC5000xE show(Activity activity, String str, UnityAdsShowOptions unityAdsShowOptions, Listeners listeners) {
        AbstractC2995aW.q(activity, "activity");
        AbstractC2995aW.q(listeners, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_SHOW_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class));
        return WD.D(interfaceC4514rk, null, 0, new C22621((LegacyShowUseCase) getServiceProvider().getRegistry().getService("", AbstractC3263dY.a(LegacyShowUseCase.class)), activity, str, unityAdsShowOptions, listeners, interfaceC4514rk, null), 3);
    }

    public /* synthetic */ UnityAdsSDK(IServiceProvider iServiceProvider, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? ServiceProvider.INSTANCE : iServiceProvider);
    }

    public UnityAdsSDK(IServiceProvider iServiceProvider) {
        AbstractC2995aW.q(iServiceProvider, "serviceProvider");
        this.serviceProvider = iServiceProvider;
    }

    public final InterfaceC5000xE getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        InterfaceC3069bH interfaceC3069bHH = AbstractC2340Cl.H(EnumC4124nH.c, new UnityAdsSDK$getToken$$inlined$inject$default$1(this, ""));
        InterfaceC4514rk interfaceC4514rk = (InterfaceC4514rk) getServiceProvider().getRegistry().getService(ServiceProvider.NAMED_GET_TOKEN_SCOPE, AbstractC3263dY.a(InterfaceC4514rk.class));
        return WD.D(interfaceC4514rk, null, 0, new AnonymousClass2(iUnityAdsTokenListener, interfaceC4514rk, interfaceC3069bHH, null), 3);
    }
}
