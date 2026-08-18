package com.unity3d.ads.core.domain;

import com.badlogic.gdx.Input;
import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.LegacyUserConsentRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageManager;
import gatewayprotocol.v1.ClientInfoOuterClass;
import gatewayprotocol.v1.InitializationDeviceInfoKt;
import gatewayprotocol.v1.InitializationRequestKt;
import gatewayprotocol.v1.InitializationRequestOuterClass;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2853Wf;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2883Xj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGetInitializationRequestPayload implements GetInitializationRequestPayload {
    private final DeviceInfoRepository deviceInfoRepository;
    private final GetClientInfo getClientInfo;
    private final LegacyUserConsentRepository legacyUserConsentRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload$invoke$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.domain.AndroidGetInitializationRequestPayload", f = "AndroidGetInitializationRequestPayload.kt", l = {21, 22, 30, 31, 42, 47, 52, Input.Keys.ALT_LEFT}, m = "invoke")
    public static final class AnonymousClass1 extends AbstractC2883Xj {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetInitializationRequestPayload.this.invoke(this);
        }
    }

    public AndroidGetInitializationRequestPayload(GetClientInfo getClientInfo, SessionRepository sessionRepository, DeviceInfoRepository deviceInfoRepository, LegacyUserConsentRepository legacyUserConsentRepository) {
        AbstractC2995aW.q(getClientInfo, "getClientInfo");
        AbstractC2995aW.q(sessionRepository, "sessionRepository");
        AbstractC2995aW.q(deviceInfoRepository, "deviceInfoRepository");
        AbstractC2995aW.q(legacyUserConsentRepository, "legacyUserConsentRepository");
        this.getClientInfo = getClientInfo;
        this.sessionRepository = sessionRepository;
        this.deviceInfoRepository = deviceInfoRepository;
        this.legacyUserConsentRepository = legacyUserConsentRepository;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0114  */
    /* JADX WARN: Code duplicated, block: B:37:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:38:0x0148  */
    /* JADX WARN: Code duplicated, block: B:41:0x0156  */
    /* JADX WARN: Code duplicated, block: B:44:0x01ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:48:0x01d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:49:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:52:0x0271 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0272  */
    /* JADX WARN: Code duplicated, block: B:56:0x0279  */
    /* JADX WARN: Code duplicated, block: B:59:0x028d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:62:0x0292  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:74:0x02cb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e2  */
    @Override // com.unity3d.ads.core.domain.GetInitializationRequestPayload
    public Object invoke(InterfaceC2857Wj interfaceC2857Wj) {
        AnonymousClass1 anonymousClass1;
        InitializationRequestKt.Dsl dsl_create;
        boolean z;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload;
        InitializationRequestKt.Dsl dsl;
        InitializationRequestKt.Dsl dsl2;
        InitializationRequestKt.Dsl dsl3;
        String analyticsUserId;
        InitializationDeviceInfoKt.Dsl dsl_create2;
        InitializationDeviceInfoKt.Dsl dsl4;
        InitializationRequestKt.Dsl dsl5;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload2;
        InitializationDeviceInfoKt.Dsl dsl6;
        InitializationRequestKt.Dsl dsl7;
        InitializationDeviceInfoKt.Dsl dsl8;
        InitializationRequestKt.Dsl dsl9;
        InitializationRequestKt.Dsl dsl10;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload3;
        ByteString byteString;
        String str;
        ByteString byteString2;
        InitializationRequestKt.Dsl dsl11;
        InitializationRequestKt.Dsl dsl12;
        AndroidGetInitializationRequestPayload androidGetInitializationRequestPayload4;
        ByteString byteString3;
        String legacyFlowUserConsent;
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
        switch (anonymousClass1.label) {
            case 0:
                AbstractC3375el.b0(objInvoke);
                InitializationRequestKt.Dsl.Companion companion = InitializationRequestKt.Dsl.Companion;
                InitializationRequestOuterClass.InitializationRequest.Builder builderNewBuilder = InitializationRequestOuterClass.InitializationRequest.newBuilder();
                AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
                dsl_create = companion._create(builderNewBuilder);
                Storage storage = StorageManager.getStorage(StorageManager.StorageType.PRIVATE);
                if (storage.readStorage()) {
                    Object obj = storage.get("configuration.hasInitialized");
                    Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                    if (bool == null || !bool.booleanValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                } else {
                    z = false;
                }
                dsl_create.setIsFirstInit(!z);
                GetClientInfo getClientInfo = this.getClientInfo;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = dsl_create;
                anonymousClass1.L$2 = dsl_create;
                anonymousClass1.L$3 = dsl_create;
                anonymousClass1.label = 1;
                objInvoke = getClientInfo.invoke(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                androidGetInitializationRequestPayload = this;
                dsl = dsl_create;
                dsl2 = dsl;
                dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) objInvoke);
                DeviceInfoRepository deviceInfoRepository = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl;
                anonymousClass1.label = 2;
                objInvoke = deviceInfoRepository.getIdfi(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl3 = dsl;
                dsl3.setIdfi((String) objInvoke);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                InitializationDeviceInfoKt.Dsl.Companion companion2 = InitializationDeviceInfoKt.Dsl.Companion;
                InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder2 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                AbstractC2995aW.p(builderNewBuilder2, "newBuilder()");
                dsl_create2 = companion2._create(builderNewBuilder2);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                DeviceInfoRepository deviceInfoRepository2 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 3;
                objInvoke = deviceInfoRepository2.staticDeviceInfo(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl4 = dsl_create2;
                dsl5 = dsl2;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl6 = dsl4;
                dsl7 = dsl;
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository3 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl4;
                anonymousClass1.L$6 = dsl4;
                anonymousClass1.label = 4;
                objInvoke = deviceInfoRepository3.staticDeviceInfo(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl8 = dsl4;
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                AbstractC2995aW.p(networkOperator, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl4.setNetworkOperator(networkOperator);
                dsl4.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl4.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl4.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                AbstractC2995aW.p(language, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl4.setLanguage(language);
                dsl4.setLocalList(AbstractC2853Wf.l0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                dsl4.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository4 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository4.getAuidByteString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl9 = dsl7;
                dsl10 = dsl5;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository5 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository5.getAuidString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                str = (String) objInvoke;
                if (str != null && str.length() != 0) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository.getPrivacy(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository2 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository2.getGatewayCache(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            case 1:
                dsl_create = (InitializationRequestKt.Dsl) anonymousClass1.L$3;
                dsl = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl2 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                dsl_create.setClientInfo((ClientInfoOuterClass.ClientInfo) objInvoke);
                DeviceInfoRepository deviceInfoRepository6 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl;
                anonymousClass1.label = 2;
                objInvoke = deviceInfoRepository6.getIdfi(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl3 = dsl;
                dsl3.setIdfi((String) objInvoke);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                InitializationDeviceInfoKt.Dsl.Companion companion3 = InitializationDeviceInfoKt.Dsl.Companion;
                InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder3 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                AbstractC2995aW.p(builderNewBuilder3, "newBuilder()");
                dsl_create2 = companion3._create(builderNewBuilder3);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                DeviceInfoRepository deviceInfoRepository7 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 3;
                objInvoke = deviceInfoRepository7.staticDeviceInfo(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl4 = dsl_create2;
                dsl5 = dsl2;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl6 = dsl4;
                dsl7 = dsl;
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository8 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl4;
                anonymousClass1.L$6 = dsl4;
                anonymousClass1.label = 4;
                objInvoke = deviceInfoRepository8.staticDeviceInfo(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl8 = dsl4;
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                AbstractC2995aW.p(networkOperator2, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl4.setNetworkOperator(networkOperator2);
                dsl4.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl4.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl4.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language2 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                AbstractC2995aW.p(language2, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl4.setLanguage(language2);
                dsl4.setLocalList(AbstractC2853Wf.l0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                dsl4.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository9 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository9.getAuidByteString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl9 = dsl7;
                dsl10 = dsl5;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository10 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository10.getAuidString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                str = (String) objInvoke;
                if (str != null) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository3 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository3.getPrivacy(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository4 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository4.getGatewayCache(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            case 2:
                dsl3 = (InitializationRequestKt.Dsl) anonymousClass1.L$3;
                dsl = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl2 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                dsl3.setIdfi((String) objInvoke);
                analyticsUserId = androidGetInitializationRequestPayload.deviceInfoRepository.getAnalyticsUserId();
                if (analyticsUserId != null) {
                    dsl.setAnalyticsUserId(analyticsUserId);
                }
                dsl.setSessionId(androidGetInitializationRequestPayload.sessionRepository.getSessionId());
                InitializationDeviceInfoKt.Dsl.Companion companion4 = InitializationDeviceInfoKt.Dsl.Companion;
                InitializationRequestOuterClass.InitializationDeviceInfo.Builder builderNewBuilder4 = InitializationRequestOuterClass.InitializationDeviceInfo.newBuilder();
                AbstractC2995aW.p(builderNewBuilder4, "newBuilder()");
                dsl_create2 = companion4._create(builderNewBuilder4);
                dsl_create2.setBundleId(androidGetInitializationRequestPayload.deviceInfoRepository.getAppName());
                dsl_create2.setDeviceModel(androidGetInitializationRequestPayload.deviceInfoRepository.getModel());
                dsl_create2.setDeviceMake(androidGetInitializationRequestPayload.deviceInfoRepository.getManufacturer());
                dsl_create2.setOsVersion(androidGetInitializationRequestPayload.deviceInfoRepository.getOsVersion());
                DeviceInfoRepository deviceInfoRepository11 = androidGetInitializationRequestPayload.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload;
                anonymousClass1.L$1 = dsl2;
                anonymousClass1.L$2 = dsl;
                anonymousClass1.L$3 = dsl_create2;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl_create2;
                anonymousClass1.L$6 = dsl_create2;
                anonymousClass1.label = 3;
                objInvoke = deviceInfoRepository11.staticDeviceInfo(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl4 = dsl_create2;
                dsl5 = dsl2;
                androidGetInitializationRequestPayload2 = androidGetInitializationRequestPayload;
                dsl6 = dsl4;
                dsl7 = dsl;
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository12 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl4;
                anonymousClass1.L$6 = dsl4;
                anonymousClass1.label = 4;
                objInvoke = deviceInfoRepository12.staticDeviceInfo(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl8 = dsl4;
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator3 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                AbstractC2995aW.p(networkOperator3, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl4.setNetworkOperator(networkOperator3);
                dsl4.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl4.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl4.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language3 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                AbstractC2995aW.p(language3, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl4.setLanguage(language3);
                dsl4.setLocalList(AbstractC2853Wf.l0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                dsl4.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository13 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository13.getAuidByteString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl9 = dsl7;
                dsl10 = dsl5;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository14 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository14.getAuidString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                str = (String) objInvoke;
                if (str != null) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository5 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository5.getPrivacy(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository6 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository6.getGatewayCache(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            case 3:
                dsl_create2 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$6;
                dsl4 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$5;
                dsl = (InitializationRequestKt.Dsl) anonymousClass1.L$4;
                dsl6 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$3;
                dsl7 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl5 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                dsl_create2.setTotalDiskSpace(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalDiskSpace());
                DeviceInfoRepository deviceInfoRepository15 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = dsl6;
                anonymousClass1.L$4 = dsl;
                anonymousClass1.L$5 = dsl4;
                anonymousClass1.L$6 = dsl4;
                anonymousClass1.label = 4;
                objInvoke = deviceInfoRepository15.staticDeviceInfo(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl8 = dsl4;
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator4 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                AbstractC2995aW.p(networkOperator4, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl4.setNetworkOperator(networkOperator4);
                dsl4.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl4.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl4.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language4 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                AbstractC2995aW.p(language4, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl4.setLanguage(language4);
                dsl4.setLocalList(AbstractC2853Wf.l0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                dsl4.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository16 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository16.getAuidByteString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl9 = dsl7;
                dsl10 = dsl5;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository17 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository17.getAuidString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                str = (String) objInvoke;
                if (str != null) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository7 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository7.getPrivacy(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository8 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository8.getGatewayCache(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            case 4:
                dsl8 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$6;
                dsl4 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$5;
                dsl = (InitializationRequestKt.Dsl) anonymousClass1.L$4;
                dsl6 = (InitializationDeviceInfoKt.Dsl) anonymousClass1.L$3;
                dsl7 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl5 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload2 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                dsl8.setTotalRamMemory(((StaticDeviceInfoOuterClass.StaticDeviceInfo) objInvoke).getTotalRamMemory());
                dsl4.setCurrentUiTheme(androidGetInitializationRequestPayload2.deviceInfoRepository.getCurrentUiTheme());
                String networkOperator5 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getNetworkOperator();
                AbstractC2995aW.p(networkOperator5, "deviceInfoRepository.dyn…eviceInfo.networkOperator");
                dsl4.setNetworkOperator(networkOperator5);
                dsl4.setBatteryLevel(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryLevel());
                dsl4.setBatteryStatus(androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getBatteryStatus());
                dsl4.setSystemBootTime(androidGetInitializationRequestPayload2.deviceInfoRepository.getSystemBootTime());
                String language5 = androidGetInitializationRequestPayload2.deviceInfoRepository.getDynamicDeviceInfo().getLanguage();
                AbstractC2995aW.p(language5, "deviceInfoRepository.dynamicDeviceInfo.language");
                dsl4.setLanguage(language5);
                dsl4.setLocalList(AbstractC2853Wf.l0(androidGetInitializationRequestPayload2.deviceInfoRepository.getLocaleList(), ",", null, null, null, 62));
                dsl4.setConnectionType(androidGetInitializationRequestPayload2.deviceInfoRepository.getConnectionTypeStr());
                dsl.setDeviceInfo(dsl6._build());
                DeviceInfoRepository deviceInfoRepository18 = androidGetInitializationRequestPayload2.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload2;
                anonymousClass1.L$1 = dsl5;
                anonymousClass1.L$2 = dsl7;
                anonymousClass1.L$3 = null;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.L$6 = null;
                anonymousClass1.label = 5;
                objInvoke = deviceInfoRepository18.getAuidByteString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl9 = dsl7;
                dsl10 = dsl5;
                androidGetInitializationRequestPayload3 = androidGetInitializationRequestPayload2;
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository19 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository19.getAuidString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                str = (String) objInvoke;
                if (str != null) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository9 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository9.getPrivacy(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository10 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository10.getGatewayCache(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            case 5:
                dsl9 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl10 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                byteString = (ByteString) objInvoke;
                if (byteString != null) {
                    dsl9.setAuid(byteString);
                }
                DeviceInfoRepository deviceInfoRepository110 = androidGetInitializationRequestPayload3.deviceInfoRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 6;
                objInvoke = deviceInfoRepository110.getAuidString(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                str = (String) objInvoke;
                if (str != null) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository11 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository11.getPrivacy(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository12 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository12.getGatewayCache(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            case 6:
                dsl9 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl10 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                str = (String) objInvoke;
                if (str != null) {
                    dsl9.setAuidString(str);
                }
                SessionRepository sessionRepository13 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 7;
                objInvoke = sessionRepository13.getPrivacy(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository14 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository14.getGatewayCache(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            case 7:
                dsl9 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl10 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload3 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                byteString2 = (ByteString) objInvoke;
                if (!byteString2.isEmpty()) {
                    dsl9.setPrivacy(byteString2);
                }
                SessionRepository sessionRepository15 = androidGetInitializationRequestPayload3.sessionRepository;
                anonymousClass1.L$0 = androidGetInitializationRequestPayload3;
                anonymousClass1.L$1 = dsl10;
                anonymousClass1.L$2 = dsl9;
                anonymousClass1.label = 8;
                objInvoke = sessionRepository15.getGatewayCache(anonymousClass1);
                if (objInvoke == enumC4602sk) {
                    return enumC4602sk;
                }
                dsl11 = dsl9;
                dsl12 = dsl10;
                androidGetInitializationRequestPayload4 = androidGetInitializationRequestPayload3;
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            case 8:
                dsl11 = (InitializationRequestKt.Dsl) anonymousClass1.L$2;
                dsl12 = (InitializationRequestKt.Dsl) anonymousClass1.L$1;
                androidGetInitializationRequestPayload4 = (AndroidGetInitializationRequestPayload) anonymousClass1.L$0;
                AbstractC3375el.b0(objInvoke);
                byteString3 = (ByteString) objInvoke;
                if (!byteString3.isEmpty()) {
                    dsl11.setCache(byteString3);
                }
                legacyFlowUserConsent = androidGetInitializationRequestPayload4.legacyUserConsentRepository.getLegacyFlowUserConsent();
                if (legacyFlowUserConsent != null) {
                    dsl11.setLegacyFlowUserConsent(legacyFlowUserConsent);
                }
                return dsl12._build();
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
