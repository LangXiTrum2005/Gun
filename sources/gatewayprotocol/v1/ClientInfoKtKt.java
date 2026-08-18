package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class ClientInfoKtKt {
    /* JADX INFO: renamed from: -initializeclientInfo, reason: not valid java name */
    public static final ClientInfoOuterClass.ClientInfo m111initializeclientInfo(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder builderNewBuilder = ClientInfoOuterClass.ClientInfo.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        ClientInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final ClientInfoOuterClass.ClientInfo copy(ClientInfoOuterClass.ClientInfo clientInfo, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(clientInfo, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        ClientInfoKt.Dsl.Companion companion = ClientInfoKt.Dsl.Companion;
        ClientInfoOuterClass.ClientInfo.Builder builder = clientInfo.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        ClientInfoKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
