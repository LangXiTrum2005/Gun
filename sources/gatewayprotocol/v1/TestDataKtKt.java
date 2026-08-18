package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class TestDataKtKt {
    /* JADX INFO: renamed from: -initializetestData, reason: not valid java name */
    public static final TestDataOuterClass.TestData m148initializetestData(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder builderNewBuilder = TestDataOuterClass.TestData.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TestDataKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TestDataOuterClass.TestData copy(TestDataOuterClass.TestData testData, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(testData, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TestDataKt.Dsl.Companion companion = TestDataKt.Dsl.Companion;
        TestDataOuterClass.TestData.Builder builder = testData.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        TestDataKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
