package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class AdResponseKtKt {
    /* JADX INFO: renamed from: -initializeadResponse, reason: not valid java name */
    public static final AdResponseOuterClass.AdResponse m106initializeadResponse(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
        AdResponseOuterClass.AdResponse.Builder builderNewBuilder = AdResponseOuterClass.AdResponse.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        AdResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final AdResponseOuterClass.AdResponse copy(AdResponseOuterClass.AdResponse adResponse, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(adResponse, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        AdResponseKt.Dsl.Companion companion = AdResponseKt.Dsl.Companion;
        AdResponseOuterClass.AdResponse.Builder builder = adResponse.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        AdResponseKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ErrorOuterClass.Error getErrorOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        AbstractC2995aW.q(adResponseOrBuilder, "<this>");
        if (adResponseOrBuilder.hasError()) {
            return adResponseOrBuilder.getError();
        }
        return null;
    }

    public static final WebviewConfiguration.WebViewConfiguration getWebviewConfigurationOrNull(AdResponseOuterClass.AdResponseOrBuilder adResponseOrBuilder) {
        AbstractC2995aW.q(adResponseOrBuilder, "<this>");
        if (adResponseOrBuilder.hasWebviewConfiguration()) {
            return adResponseOrBuilder.getWebviewConfiguration();
        }
        return null;
    }
}
