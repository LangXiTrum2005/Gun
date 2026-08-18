package com.unity3d.ads.core.domain;

import android.content.Context;
import com.badlogic.gdx.Input;
import com.google.protobuf.ByteString;
import com.unity3d.ads.IUnityAdsLoadListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadResult;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import gatewayprotocol.v1.AdRequestOuterClass;
import gatewayprotocol.v1.BannerSizeKt;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import gatewayprotocol.v1.HeaderBiddingAdMarkupOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3899kk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Bc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.IP;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5203zc0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class LegacyLoadUseCase {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_AD_MARKUP = "adMarkup";
    public static final String KEY_OBJECT_ID = "objectId";
    private String adMarkup;
    private final AdRepository adRepository;
    private final AwaitInitialization awaitInitialization;
    private final AbstractC3899kk dispatcher;
    private final GetInitializationState getInitializationState;
    private boolean isBanner;
    private boolean isHeaderBidding;
    private IUnityAdsLoadListener listener;
    private final Load load;
    private UnityAdsLoadOptions loadOptions;
    private ByteString opportunity;
    private String placement;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;
    private InterfaceC5203zc0 startTime;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase", f = "LegacyLoadUseCase.kt", l = {Input.Keys.SWITCH_CHARSET, Input.Keys.NUMPAD_COMMA, Input.Keys.NUMPAD_ENTER, 170}, m = "invoke")
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
            return LegacyLoadUseCase.this.invoke(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$2, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$loadFailure$2", f = "LegacyLoadUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ LoadResult.Failure $loadResult;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(LoadResult.Failure failure, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.$loadResult = failure;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(LegacyLoadUseCase legacyLoadUseCase, LoadResult.Failure failure) {
            IUnityAdsLoadListener iUnityAdsLoadListener = legacyLoadUseCase.listener;
            if (iUnityAdsLoadListener != null) {
                iUnityAdsLoadListener.onUnityAdsFailedToLoad(legacyLoadUseCase.placement, failure.getError(), failure.getMessage());
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return LegacyLoadUseCase.this.new AnonymousClass2(this.$loadResult, interfaceC2857Wj);
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
            Utilities.wrapCustomerListener(new a(0, LegacyLoadUseCase.this, this.$loadResult));
            return C5033xf0.f5238a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$2, reason: invalid class name and case insensitive filesystem */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.LegacyLoadUseCase$loadSuccess$2", f = "LegacyLoadUseCase.kt", l = {}, m = "invokeSuspend")
    public static final class C22092 extends Ea0 implements InterfaceC3567gx {
        int label;

        public C22092(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invokeSuspend$lambda$0(LegacyLoadUseCase legacyLoadUseCase) {
            IUnityAdsLoadListener iUnityAdsLoadListener = legacyLoadUseCase.listener;
            if (iUnityAdsLoadListener != null) {
                iUnityAdsLoadListener.onUnityAdsAdLoaded(legacyLoadUseCase.placement);
            }
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return LegacyLoadUseCase.this.new C22092(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((C22092) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            Utilities.wrapCustomerListener(new b(LegacyLoadUseCase.this, 0));
            return C5033xf0.f5238a;
        }
    }

    public LegacyLoadUseCase(AbstractC3899kk abstractC3899kk, Load load, SendDiagnosticEvent sendDiagnosticEvent, GetInitializationState getInitializationState, AwaitInitialization awaitInitialization, SessionRepository sessionRepository, AdRepository adRepository) {
        AbstractC2995aW.q(abstractC3899kk, "dispatcher");
        AbstractC2995aW.q(load, "load");
        AbstractC2995aW.q(sendDiagnosticEvent, "sendDiagnosticEvent");
        AbstractC2995aW.q(getInitializationState, "getInitializationState");
        AbstractC2995aW.q(awaitInitialization, "awaitInitialization");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(adRepository, "adRepository");
        this.dispatcher = abstractC3899kk;
        this.load = load;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.getInitializationState = getInitializationState;
        this.awaitInitialization = awaitInitialization;
        this.sessionRepository = sessionRepository;
        this.adRepository = adRepository;
    }

    private final String getAdMarkup(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt(KEY_AD_MARKUP)) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final DiagnosticEventRequestOuterClass.DiagnosticAdType getAdType() {
        return this.isBanner ? DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_BANNER : DiagnosticEventRequestOuterClass.DiagnosticAdType.DIAGNOSTIC_AD_TYPE_FULLSCREEN;
    }

    private final AdRequestOuterClass.BannerSize getBannerSize(UnityBannerSize unityBannerSize) {
        if (unityBannerSize == null) {
            return null;
        }
        BannerSizeKt.Dsl.Companion companion = BannerSizeKt.Dsl.Companion;
        AdRequestOuterClass.BannerSize.Builder builderNewBuilder = AdRequestOuterClass.BannerSize.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        BannerSizeKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setWidth(unityBannerSize.getWidth());
        dsl_create.setHeight(unityBannerSize.getHeight());
        return dsl_create._build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup getHeaderBiddingAdMarkup(String str) {
        if (str == null || AbstractC3089ba0.v0(str)) {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.getDefaultInstance();
        }
        try {
            return HeaderBiddingAdMarkupOuterClass.HeaderBiddingAdMarkup.parseFrom(ProtobufExtensionsKt.fromBase64$default(str, false, 1, null).toByteArray());
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getOpportunityId(UnityAdsLoadOptions unityAdsLoadOptions) {
        Object objOpt;
        JSONObject data = unityAdsLoadOptions.getData();
        if (data == null || (objOpt = data.opt("objectId")) == null) {
            return null;
        }
        return objOpt.toString();
    }

    private final Map<String, String> getTags(String str, String str2) {
        LinkedHashMap linkedHashMapV0 = U5.v0(new C4839vT("state", GetInitializationState.DefaultImpls.invoke$default(this.getInitializationState, false, 1, null).toString()), new C4839vT("operation", OperationType.LOAD.toString()));
        if (str != null && str.length() != 0) {
            linkedHashMapV0.put("reason", str);
        }
        if (str2 != null && str2.length() != 0) {
            linkedHashMapV0.put("reason_debug", str2);
        }
        return linkedHashMapV0;
    }

    public static /* synthetic */ Map getTags$default(LegacyLoadUseCase legacyLoadUseCase, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return legacyLoadUseCase.getTags(str, str2);
    }

    private final AdObject getTmpAdObject(boolean z) {
        ByteString byteString;
        UnityAdsLoadOptions unityAdsLoadOptions = this.loadOptions;
        if (unityAdsLoadOptions == null) {
            AbstractC2995aW.x0(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            throw null;
        }
        String opportunityId = getOpportunityId(unityAdsLoadOptions);
        if (opportunityId != null) {
            UUID uuidFromString = UUID.fromString(opportunityId);
            AbstractC2995aW.p(uuidFromString, "fromString(tmpOpportunityId)");
            byteString = ProtobufExtensionsKt.toByteString(uuidFromString);
        } else {
            byteString = ByteString.EMPTY;
        }
        ByteString byteString2 = byteString;
        String str = this.placement;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ByteString byteString3 = ByteString.EMPTY;
        UnityAdsLoadOptions unityAdsLoadOptions2 = this.loadOptions;
        if (unityAdsLoadOptions2 == null) {
            AbstractC2995aW.x0(HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS);
            throw null;
        }
        boolean z2 = this.isHeaderBidding;
        DiagnosticEventRequestOuterClass.DiagnosticAdType adType = getAdType();
        AbstractC2995aW.p(byteString2, "tmpOpportunityByteString");
        AbstractC2995aW.p(byteString3, "EMPTY");
        return new AdObject(byteString2, str2, byteString3, z, null, null, null, null, null, unityAdsLoadOptions2, z2, adType, 368, null);
    }

    public static /* synthetic */ AdObject getTmpAdObject$default(LegacyLoadUseCase legacyLoadUseCase, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return legacyLoadUseCase.getTmpAdObject(z);
    }

    public static /* synthetic */ Object invoke$default(LegacyLoadUseCase legacyLoadUseCase, Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, InterfaceC2857Wj interfaceC2857Wj, int i, Object obj) {
        if ((i & 16) != 0) {
            unityBannerSize = null;
        }
        return legacyLoadUseCase.invoke(context, str, unityAdsLoadOptions, iUnityAdsLoadListener, unityBannerSize, interfaceC2857Wj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadFailure(LoadResult.Failure failure, InterfaceC2857Wj interfaceC2857Wj) {
        DeviceLog.debug("Unity Ads Load Failure for placement: " + this.placement + " reason: " + failure.getError() + " :: " + failure.getMessage());
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        InterfaceC5203zc0 interfaceC5203zc0 = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_failure_time", interfaceC5203zc0 != null ? new Double(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)) : null, getTags(failure.getReason(), failure.getReasonDebug()), null, getTmpAdObject(failure.isScarAd()), 8, null);
        Object objX = WD.X(new AnonymousClass2(failure, null), this.dispatcher, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }

    private final InterfaceC5203zc0 loadStart() {
        long jA = IP.a();
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_load_started", null, getTags$default(this, null, null, 3, null), null, getTmpAdObject$default(this, false, 1, null), 10, null);
        return new Bc0(jA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object loadSuccess(AdObject adObject, InterfaceC2857Wj interfaceC2857Wj) {
        DeviceLog.debug("Unity Ads Load Success for placement: " + this.placement);
        SendDiagnosticEvent sendDiagnosticEvent = this.sendDiagnosticEvent;
        InterfaceC5203zc0 interfaceC5203zc0 = this.startTime;
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_success_time", interfaceC5203zc0 != null ? new Double(TimeExtensionsKt.elapsedMillis(interfaceC5203zc0)) : null, getTags$default(this, null, null, 3, null), null, adObject, 8, null);
        Object objX = WD.X(new C22092(null), this.dispatcher, interfaceC2857Wj);
        return objX == EnumC4602sk.f4993a ? objX : C5033xf0.f5238a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00e5 A[Catch: all -> 0x0107, TryCatch #2 {all -> 0x0107, blocks: (B:45:0x00e1, B:47:0x00e5, B:50:0x010a, B:52:0x010e), top: B:78:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x010e A[Catch: all -> 0x0107, TRY_LEAVE, TryCatch #2 {all -> 0x0107, blocks: (B:45:0x00e1, B:47:0x00e5, B:50:0x010a, B:52:0x010e), top: B:78:0x00e1 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x0125 A[Catch: all -> 0x0123, TryCatch #1 {all -> 0x0123, blocks: (B:54:0x0117, B:59:0x0125, B:61:0x012a), top: B:76:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x012a A[Catch: all -> 0x0123, TRY_LEAVE, TryCatch #1 {all -> 0x0123, blocks: (B:54:0x0117, B:59:0x0125, B:61:0x012a), top: B:76:0x010c }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0139 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0169 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.unity3d.ads.core.domain.LegacyLoadUseCase] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public final Object invoke(Context context, String str, UnityAdsLoadOptions unityAdsLoadOptions, IUnityAdsLoadListener iUnityAdsLoadListener, UnityBannerSize unityBannerSize, InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        ?? r3;
        int i;
        ?? r1;
        LoadResult.Failure failure;
        ?? r4;
        LegacyLoadUseCase legacyLoadUseCase;
        LoadResult loadResult;
        ?? r5;
        LoadResult failure2;
        AdObject adObject;
        Object obj;
        String str2 = str;
        UnityBannerSize unityBannerSize2 = unityBannerSize;
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
        Object objF0 = anonymousClass2.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i3 = anonymousClass2.label;
        if (i3 != 0) {
            try {
                if (i3 == 1) {
                    str2 = (String) anonymousClass2.L$1;
                    LegacyLoadUseCase legacyLoadUseCase2 = (LegacyLoadUseCase) anonymousClass2.L$0;
                    AbstractC3375el.b0(objF0);
                    i = 1;
                    legacyLoadUseCase = legacyLoadUseCase2;
                    r4 = i3;
                    try {
                        loadResult = (LoadResult) objF0;
                        failure2 = loadResult;
                        r5 = r4;
                        if (loadResult == null) {
                            UnityAds.UnityAdsLoadError unityAdsLoadError = UnityAds.UnityAdsLoadError.TIMEOUT;
                            StringBuilder sb = new StringBuilder(LoadResult.MSG_TIMEOUT);
                            sb.append(str2);
                            failure2 = new LoadResult.Failure(unityAdsLoadError, sb.toString(), null, "timeout", null, false, 52, null);
                            r5 = sb;
                        }
                        try {
                            if (failure2 instanceof LoadResult.Success) {
                                adObject = ((LoadResult.Success) failure2).getAdObject();
                                anonymousClass2.L$0 = legacyLoadUseCase;
                                r5 = 0;
                                anonymousClass2.L$1 = null;
                                anonymousClass2.label = 2;
                                if (legacyLoadUseCase.loadSuccess(adObject, anonymousClass2) == enumC4602sk) {
                                    return enumC4602sk;
                                }
                            } else {
                                r5 = 0;
                                r5 = 0;
                                if (failure2 instanceof LoadResult.Failure) {
                                    anonymousClass2.L$0 = legacyLoadUseCase;
                                    anonymousClass2.L$1 = null;
                                    anonymousClass2.label = 3;
                                    if (legacyLoadUseCase.loadFailure((LoadResult.Failure) failure2, anonymousClass2) == enumC4602sk) {
                                        return enumC4602sk;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            r1 = legacyLoadUseCase;
                            r3 = r5;
                            failure = new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, i, r3), false, 32, null);
                            anonymousClass2.L$0 = r3;
                            anonymousClass2.L$1 = r3;
                            anonymousClass2.label = 4;
                            if (r1.loadFailure(failure, anonymousClass2) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r3 = 0;
                        r1 = legacyLoadUseCase;
                    }
                } else if (i3 == 2 || i3 == 3) {
                    AbstractC3375el.b0(objF0);
                } else {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC3375el.b0(objF0);
                }
            } catch (Throwable th3) {
                th = th3;
                r3 = 0;
                i = 1;
                r1 = unityBannerSize2;
                failure = new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, i, r3), false, 32, null);
                anonymousClass2.L$0 = r3;
                anonymousClass2.L$1 = r3;
                anonymousClass2.label = 4;
                if (r1.loadFailure(failure, anonymousClass2) == enumC4602sk) {
                    return enumC4602sk;
                }
                return C5033xf0.f5238a;
            }
        } else {
            AbstractC3375el.b0(objF0);
            DeviceLog.debug("Unity Ads Load Start for placement " + str2);
            long loadTimeoutMs = (long) this.sessionRepository.getNativeConfiguration().getAdOperations().getLoadTimeoutMs();
            AdRequestOuterClass.BannerSize bannerSize = getBannerSize(unityBannerSize2);
            this.loadOptions = unityAdsLoadOptions;
            String adMarkup = getAdMarkup(unityAdsLoadOptions);
            this.adMarkup = adMarkup;
            this.isHeaderBidding = !(adMarkup == null || AbstractC3089ba0.v0(adMarkup));
            this.isBanner = unityBannerSize2 != null;
            this.listener = iUnityAdsLoadListener;
            this.placement = str2;
            this.startTime = loadStart();
            try {
                LegacyLoadUseCase legacyLoadUseCase3 = this;
                i = 1;
                try {
                    LegacyLoadUseCase$invoke$loadResult$1 legacyLoadUseCase$invoke$loadResult$1 = new LegacyLoadUseCase$invoke$loadResult$1(str, legacyLoadUseCase3, unityAdsLoadOptions, context, bannerSize, null);
                    anonymousClass2.L$0 = this;
                    anonymousClass2.L$1 = str2;
                    anonymousClass2.label = 1;
                    objF0 = AbstractC2995aW.F0(loadTimeoutMs, legacyLoadUseCase$invoke$loadResult$1, anonymousClass2);
                    if (objF0 == enumC4602sk) {
                        return enumC4602sk;
                    }
                    legacyLoadUseCase = this;
                    r4 = legacyLoadUseCase3;
                    loadResult = (LoadResult) objF0;
                    failure2 = loadResult;
                    r5 = r4;
                    if (loadResult == null) {
                        UnityAds.UnityAdsLoadError unityAdsLoadError2 = UnityAds.UnityAdsLoadError.TIMEOUT;
                        StringBuilder sb2 = new StringBuilder(LoadResult.MSG_TIMEOUT);
                        sb2.append(str2);
                        failure2 = new LoadResult.Failure(unityAdsLoadError2, sb2.toString(), null, "timeout", null, false, 52, null);
                        r5 = sb2;
                    }
                    if (failure2 instanceof LoadResult.Success) {
                        adObject = ((LoadResult.Success) failure2).getAdObject();
                        anonymousClass2.L$0 = legacyLoadUseCase;
                        r5 = 0;
                        anonymousClass2.L$1 = null;
                        anonymousClass2.label = 2;
                        if (legacyLoadUseCase.loadSuccess(adObject, anonymousClass2) == enumC4602sk) {
                            return enumC4602sk;
                        }
                    } else {
                        r5 = 0;
                        r5 = 0;
                        if (failure2 instanceof LoadResult.Failure) {
                            anonymousClass2.L$0 = legacyLoadUseCase;
                            anonymousClass2.L$1 = null;
                            anonymousClass2.label = 3;
                            if (legacyLoadUseCase.loadFailure((LoadResult.Failure) failure2, anonymousClass2) == enumC4602sk) {
                                return enumC4602sk;
                            }
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    obj = null;
                    r1 = this;
                    r3 = obj;
                    failure = new LoadResult.Failure(UnityAds.UnityAdsLoadError.INTERNAL_ERROR, UnityAdsConstants.Messages.MSG_INTERNAL_ERROR, th, "uncaught_exception", ExceptionExtensionsKt.getShortenedStackTrace$default(th, 0, i, r3), false, 32, null);
                    anonymousClass2.L$0 = r3;
                    anonymousClass2.L$1 = r3;
                    anonymousClass2.label = 4;
                    if (r1.loadFailure(failure, anonymousClass2) == enumC4602sk) {
                        return enumC4602sk;
                    }
                    return C5033xf0.f5238a;
                }
            } catch (Throwable th5) {
                th = th5;
                obj = null;
                i = 1;
            }
        }
        return C5033xf0.f5238a;
    }
}
