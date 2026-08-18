package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class I {
    static final Class<?> INSTANCE = resolveExtensionClass();

    private I() {
    }

    public static Class<?> resolveExtensionClass() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
