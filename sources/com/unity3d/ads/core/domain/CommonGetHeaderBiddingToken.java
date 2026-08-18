package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.scar.FetchSignalsAndSendUseCase;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetHeaderBiddingToken implements GetHeaderBiddingToken {
    public static final Companion Companion = new Companion(null);
    public static final String HB_TOKEN_VERSION = "2";
    private final BuildHeaderBiddingToken buildHeaderBiddingToken;
    private final FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.CommonGetHeaderBiddingToken", f = "CommonGetHeaderBiddingToken.kt", l = {13, 16}, m = "invoke")
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
            return CommonGetHeaderBiddingToken.this.invoke(this);
        }
    }

    public CommonGetHeaderBiddingToken(BuildHeaderBiddingToken buildHeaderBiddingToken, FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase, SessionRepository sessionRepository) {
        AbstractC2995aW.q(buildHeaderBiddingToken, "buildHeaderBiddingToken");
        AbstractC2995aW.q(fetchSignalsAndSendUseCase, "fetchSignalsAndSendUseCase");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.buildHeaderBiddingToken = buildHeaderBiddingToken;
        this.fetchSignalsAndSendUseCase = fetchSignalsAndSendUseCase;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.GetHeaderBiddingToken
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        CommonGetHeaderBiddingToken commonGetHeaderBiddingToken;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken;
        HeaderBiddingTokenOuterClass.HeaderBiddingToken headerBiddingToken2;
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
        if (i2 != 0) {
            if (i2 == 1) {
                commonGetHeaderBiddingToken = (CommonGetHeaderBiddingToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                headerBiddingToken2 = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
            }
            headerBiddingToken = headerBiddingToken2;
            ByteString byteString = headerBiddingToken.toByteString();
            AbstractC2995aW.p(byteString, "rawToken.toByteString()");
            return AbstractC3888ke0.i("2:", ProtobufExtensionsKt.toBase64$default(byteString, false, 1, null));
        }
        AbstractC3375el.b0(objInvoke);
        BuildHeaderBiddingToken buildHeaderBiddingToken = this.buildHeaderBiddingToken;
        boolean z = !this.sessionRepository.getScarEligibleFormats().isEmpty();
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        objInvoke = buildHeaderBiddingToken.invoke(z, anonymousClass1);
        if (objInvoke == enumC4602sk) {
            return enumC4602sk;
        }
        commonGetHeaderBiddingToken = this;
        headerBiddingToken = (HeaderBiddingTokenOuterClass.HeaderBiddingToken) objInvoke;
        if (!commonGetHeaderBiddingToken.sessionRepository.getScarEligibleFormats().isEmpty()) {
            FetchSignalsAndSendUseCase fetchSignalsAndSendUseCase = commonGetHeaderBiddingToken.fetchSignalsAndSendUseCase;
            ByteString tokenId = headerBiddingToken.getTokenId();
            AbstractC2995aW.p(tokenId, "rawToken.tokenId");
            anonymousClass1.L$0 = headerBiddingToken;
            anonymousClass1.label = 2;
            if (fetchSignalsAndSendUseCase.invoke(tokenId, anonymousClass1) == enumC4602sk) {
                return enumC4602sk;
            }
            headerBiddingToken2 = headerBiddingToken;
            headerBiddingToken = headerBiddingToken2;
        }
        ByteString byteString2 = headerBiddingToken.toByteString();
        AbstractC2995aW.p(byteString2, "rawToken.toByteString()");
        return AbstractC3888ke0.i("2:", ProtobufExtensionsKt.toBase64$default(byteString2, false, 1, null));
    }
}
