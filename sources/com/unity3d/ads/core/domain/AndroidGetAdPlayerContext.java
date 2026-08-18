package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4839vT;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U5;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetAdPlayerContext {
    public static final Companion Companion = new Companion(null);
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", f = "AndroidGetAdPlayerContext.kt", l = {15}, m = "invoke")
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
            return AndroidGetAdPlayerContext.this.invoke(this);
        }
    }

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        AndroidGetAdPlayerContext androidGetAdPlayerContext;
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
        Object objStaticDeviceInfo = anonymousClass1.result;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            AbstractC3375el.b0(objStaticDeviceInfo);
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(anonymousClass1);
            if (objStaticDeviceInfo == enumC4602sk) {
                return enumC4602sk;
            }
            androidGetAdPlayerContext = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidGetAdPlayerContext = (AndroidGetAdPlayerContext) anonymousClass1.L$0;
            AbstractC3375el.b0(objStaticDeviceInfo);
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = androidGetAdPlayerContext.deviceInfoRepository.getDynamicDeviceInfo();
        String gameId = androidGetAdPlayerContext.sessionRepository.getGameId();
        if (gameId == null) {
            gameId = "";
        }
        return U5.u0(new C4839vT("bundleId", staticDeviceInfo.getBundleId()), new C4839vT("bundleVersion", staticDeviceInfo.getBundleVersion()), new C4839vT("webviewHash", "unknown"), new C4839vT("sdkVersion", new Integer(SdkProperties.getVersionCode())), new C4839vT("sdkVersionName", SdkProperties.getVersionName()), new C4839vT("osVersion", staticDeviceInfo.getOsVersion()), new C4839vT("systemLanguage", Locale.getDefault().toString()), new C4839vT("deviceModel", staticDeviceInfo.getDeviceModel()), new C4839vT("limitAdTracking", Boolean.valueOf(dynamicDeviceInfo.getLimitedTracking())), new C4839vT("maxVolume", new Double(dynamicDeviceInfo.getAndroid().getMaxVolume())), new C4839vT(KEY_GAME_ID, gameId));
    }
}
