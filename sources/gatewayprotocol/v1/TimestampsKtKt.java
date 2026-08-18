package gatewayprotocol.v1;

import com.google.protobuf.Timestamp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class TimestampsKtKt {
    /* JADX INFO: renamed from: -initializetimestamps, reason: not valid java name */
    public static final TimestampsOuterClass.Timestamps m149initializetimestamps(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder builderNewBuilder = TimestampsOuterClass.Timestamps.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        TimestampsKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final TimestampsOuterClass.Timestamps copy(TimestampsOuterClass.Timestamps timestamps, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(timestamps, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        TimestampsKt.Dsl.Companion companion = TimestampsKt.Dsl.Companion;
        TimestampsOuterClass.Timestamps.Builder builder = timestamps.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        TimestampsKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final Timestamp getTimestampOrNull(TimestampsOuterClass.TimestampsOrBuilder timestampsOrBuilder) {
        AbstractC2995aW.q(timestampsOrBuilder, "<this>");
        if (timestampsOrBuilder.hasTimestamp()) {
            return timestampsOrBuilder.getTimestamp();
        }
        return null;
    }
}
