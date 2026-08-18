package com.bytedance.sdk.openadsdk.api.factory;

/* JADX INFO: loaded from: classes2.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory Lxb;

    public static ISDKTypeFactory getSdkTypeFactory() {
        return Lxb;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Lxb = iSDKTypeFactory;
    }
}
