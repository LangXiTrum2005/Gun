package gatewayprotocol.v1;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes4.dex */
public final class DynamicDeviceInfoKtKt {
    /* JADX INFO: renamed from: -initializedynamicDeviceInfo, reason: not valid java name */
    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo m120initializedynamicDeviceInfo(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builderNewBuilder = DynamicDeviceInfoOuterClass.DynamicDeviceInfo.newBuilder();
        AbstractC2995aW.p(builderNewBuilder, "newBuilder()");
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android android2, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(android2, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DynamicDeviceInfoKt.AndroidKt.Dsl.Companion companion = DynamicDeviceInfoKt.AndroidKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android.Builder builder = android2.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Android getAndroidOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        AbstractC2995aW.q(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasAndroid()) {
            return dynamicDeviceInfoOrBuilder.getAndroid();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios getIosOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfoOrBuilder dynamicDeviceInfoOrBuilder) {
        AbstractC2995aW.q(dynamicDeviceInfoOrBuilder, "<this>");
        if (dynamicDeviceInfoOrBuilder.hasIos()) {
            return dynamicDeviceInfoOrBuilder.getIos();
        }
        return null;
    }

    public static final NetworkCapabilityTransportsOuterClass.NetworkCapabilityTransports getNetworkCapabilityTransportsOrNull(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.AndroidOrBuilder androidOrBuilder) {
        AbstractC2995aW.q(androidOrBuilder, "<this>");
        if (androidOrBuilder.hasNetworkCapabilityTransports()) {
            return androidOrBuilder.getNetworkCapabilityTransports();
        }
        return null;
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios ios, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(ios, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DynamicDeviceInfoKt.IosKt.Dsl.Companion companion = DynamicDeviceInfoKt.IosKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Ios.Builder builder = ios.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.IosKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }

    public static final DynamicDeviceInfoOuterClass.DynamicDeviceInfo copy(DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(dynamicDeviceInfo, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "block");
        DynamicDeviceInfoKt.Dsl.Companion companion = DynamicDeviceInfoKt.Dsl.Companion;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo.Builder builder = dynamicDeviceInfo.toBuilder();
        AbstractC2995aW.p(builder, "this.toBuilder()");
        DynamicDeviceInfoKt.Dsl dsl_create = companion._create(builder);
        interfaceC2766Sw.invoke(dsl_create);
        return dsl_create._build();
    }
}
