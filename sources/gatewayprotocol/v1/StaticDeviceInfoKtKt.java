package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class StaticDeviceInfoKtKt {
    /* JADX INFO: renamed from: -initializestaticDeviceInfo, reason: not valid java name */
    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo m147initializestaticDeviceInfo(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Android android2, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(android2, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builder = android2.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android getAndroidOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        AbstractC2995aW.q(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasAndroid()) {
            return staticDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios getIosOrNull(StaticDeviceInfoOuterClass.StaticDeviceInfoOrBuilder staticDeviceInfoOrBuilder) {
        AbstractC2995aW.q(staticDeviceInfoOrBuilder, "<this>");
        if (staticDeviceInfoOrBuilder.hasIos()) {
            return staticDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios copy(StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios ios, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(ios, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        StaticDeviceInfoKt.IosKt.Dsl.Companion companion = StaticDeviceInfoKt.IosKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Ios.Builder builder = ios.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        StaticDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final StaticDeviceInfoOuterClass.StaticDeviceInfo copy(StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(staticDeviceInfo, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.Companion;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builder = staticDeviceInfo.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
