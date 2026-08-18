package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.TokenCounters;
import gatewayprotocol.v1.InitializationResponseOuterClass;
import gatewayprotocol.v1.NativeConfigurationOuterClass;
import gatewayprotocol.v1.SessionCountersOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4286p60;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4443qv;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface SessionRepository {
    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(InterfaceC2857Wj interfaceC2857Wj);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    InterfaceC4443qv getObserveInitializationState();

    InterfaceC4286p60 getOnChange();

    Object getPrivacy(InterfaceC2857Wj interfaceC2857Wj);

    Object getPrivacyFsm(InterfaceC2857Wj interfaceC2857Wj);

    List<InitializationResponseOuterClass.AdFormat> getScarEligibleFormats();

    SessionCountersOuterClass.SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    TokenCounters getTokenCounters();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(InterfaceC2857Wj interfaceC2857Wj);

    void resetTokenCounters();

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationState(InitializationState initializationState);

    void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    Object setPrivacy(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj);

    Object setPrivacyFsm(ByteString byteString, InterfaceC2857Wj interfaceC2857Wj);

    void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(TokenCounters tokenCounters);
}
