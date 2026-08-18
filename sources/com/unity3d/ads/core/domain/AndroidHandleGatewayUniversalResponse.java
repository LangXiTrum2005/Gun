package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import gatewayprotocol.v1.AllowedPiiOuterClass;
import gatewayprotocol.v1.MutableDataOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidHandleGatewayUniversalResponse implements HandleGatewayUniversalResponse {
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidHandleGatewayUniversalResponse", f = "AndroidHandleGatewayUniversalResponse.kt", l = {35, 41, 44}, m = "invoke")
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
            return AndroidHandleGatewayUniversalResponse.this.invoke(null, this);
        }
    }

    public AndroidHandleGatewayUniversalResponse(SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository) {
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.domain.HandleGatewayUniversalResponse
    public Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, InterfaceC2857Wj interfaceC2857Wj) throws GatewayException {
        AnonymousClass1 anonymousClass1;
        MutableDataOuterClass.MutableData mutableData;
        C4907w90 c4907w90;
        Object value;
        AllowedPiiOuterClass.AllowedPii allowedPii;
        AndroidHandleGatewayUniversalResponse androidHandleGatewayUniversalResponse;
        SessionRepository sessionRepository;
        ByteString cache;
        SessionRepository sessionRepository2;
        ByteString privacyFsm;
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
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i2 == 0) {
            AbstractC3375el.b0(obj);
            if (universalResponse.hasError()) {
                String errorText = universalResponse.getError().getErrorText();
                AbstractC2995aW.p(errorText, "response.error.errorText");
                throw new GatewayException(errorText, new IllegalStateException(universalResponse.getError().getErrorText()), "gateway_universal", universalResponse.getError().getErrorText());
            }
            if (universalResponse.hasMutableData()) {
                mutableData = universalResponse.getMutableData();
                InterfaceC4309pQ allowedPii2 = this.deviceInfoRepository.getAllowedPii();
                do {
                    c4907w90 = (C4907w90) allowedPii2;
                    value = c4907w90.getValue();
                    allowedPii = mutableData.getAllowedPii();
                    AbstractC2995aW.p(allowedPii, "mutableData.allowedPii");
                } while (!c4907w90.h(value, allowedPii));
                SessionRepository sessionRepository3 = this.sessionRepository;
                ByteString currentState = mutableData.getCurrentState();
                AbstractC2995aW.p(currentState, "mutableData.currentState");
                sessionRepository3.setGatewayState(currentState);
                if (mutableData.hasSessionToken()) {
                    SessionRepository sessionRepository4 = this.sessionRepository;
                    ByteString sessionToken = mutableData.getSessionToken();
                    AbstractC2995aW.p(sessionToken, "mutableData.sessionToken");
                    sessionRepository4.setSessionToken(sessionToken);
                }
                if (mutableData.hasPrivacy()) {
                    SessionRepository sessionRepository5 = this.sessionRepository;
                    ByteString privacy = mutableData.getPrivacy();
                    AbstractC2995aW.p(privacy, "mutableData.privacy");
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = mutableData;
                    anonymousClass1.label = 1;
                    if (sessionRepository5.setPrivacy(privacy, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                androidHandleGatewayUniversalResponse = this;
                if (mutableData.hasSessionCounters()) {
                    SessionRepository sessionRepository6 = androidHandleGatewayUniversalResponse.sessionRepository;
                    SessionCountersOuterClass.SessionCounters sessionCounters = mutableData.getSessionCounters();
                    AbstractC2995aW.p(sessionCounters, "mutableData.sessionCounters");
                    sessionRepository6.setSessionCounters(sessionCounters);
                }
                if (mutableData.hasCache()) {
                    sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
                    cache = mutableData.getCache();
                    AbstractC2995aW.p(cache, "mutableData.cache");
                    anonymousClass1.L$0 = androidHandleGatewayUniversalResponse;
                    anonymousClass1.L$1 = mutableData;
                    anonymousClass1.label = 2;
                    if (sessionRepository.setGatewayCache(cache, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
                if (mutableData.hasPrivacyFsm()) {
                    sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                    privacyFsm = mutableData.getPrivacyFsm();
                    AbstractC2995aW.p(privacyFsm, "mutableData.privacyFsm");
                    anonymousClass1.L$0 = null;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == enumC4602sk) {
                        return enumC4602sk;
                    }
                }
            }
        } else if (i2 == 1) {
            mutableData = (MutableDataOuterClass.MutableData) anonymousClass1.L$1;
            androidHandleGatewayUniversalResponse = (AndroidHandleGatewayUniversalResponse) anonymousClass1.L$0;
            AbstractC3375el.b0(obj);
            if (mutableData.hasSessionCounters()) {
                SessionRepository sessionRepository7 = androidHandleGatewayUniversalResponse.sessionRepository;
                SessionCountersOuterClass.SessionCounters sessionCounters2 = mutableData.getSessionCounters();
                AbstractC2995aW.p(sessionCounters2, "mutableData.sessionCounters");
                sessionRepository7.setSessionCounters(sessionCounters2);
            }
            if (mutableData.hasCache()) {
                sessionRepository = androidHandleGatewayUniversalResponse.sessionRepository;
                cache = mutableData.getCache();
                AbstractC2995aW.p(cache, "mutableData.cache");
                anonymousClass1.L$0 = androidHandleGatewayUniversalResponse;
                anonymousClass1.L$1 = mutableData;
                anonymousClass1.label = 2;
                if (sessionRepository.setGatewayCache(cache, anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
            if (mutableData.hasPrivacyFsm()) {
                sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                privacyFsm = mutableData.getPrivacyFsm();
                AbstractC2995aW.p(privacyFsm, "mutableData.privacyFsm");
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else if (i2 == 2) {
            mutableData = (MutableDataOuterClass.MutableData) anonymousClass1.L$1;
            androidHandleGatewayUniversalResponse = (AndroidHandleGatewayUniversalResponse) anonymousClass1.L$0;
            AbstractC3375el.b0(obj);
            if (mutableData.hasPrivacyFsm()) {
                sessionRepository2 = androidHandleGatewayUniversalResponse.sessionRepository;
                privacyFsm = mutableData.getPrivacyFsm();
                AbstractC2995aW.p(privacyFsm, "mutableData.privacyFsm");
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (sessionRepository2.setPrivacyFsm(privacyFsm, anonymousClass1) == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return c5033xf0;
    }
}
