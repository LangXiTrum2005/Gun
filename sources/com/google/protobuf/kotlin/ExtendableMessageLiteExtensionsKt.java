package com.google.protobuf.kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.protobuf.ExtensionLite;
import com.google.protobuf.GeneratedMessageLite;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes3.dex */
public final class ExtendableMessageLiteExtensionsKt {
    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MorBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>> boolean contains(MorBT morbt, ExtensionLite<M, ?> extensionLite) {
        AbstractC2995aW.q(morbt, "<this>");
        AbstractC2995aW.q(extensionLite, "extension");
        return morbt.hasExtension(extensionLite);
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, ?>, MOrBT extends GeneratedMessageLite.ExtendableMessageOrBuilder<M, ?>, T> T get(MOrBT morbt, ExtensionLite<M, T> extensionLite) {
        AbstractC2995aW.q(morbt, "<this>");
        AbstractC2995aW.q(extensionLite, "extension");
        T t = (T) morbt.getExtension(extensionLite);
        AbstractC2995aW.p(t, "getExtension(extension)");
        return t;
    }

    public static final <M extends GeneratedMessageLite.ExtendableMessage<M, B>, B extends GeneratedMessageLite.ExtendableBuilder<M, B>, T> void set(B b, ExtensionLite<M, T> extensionLite, T t) {
        AbstractC2995aW.q(b, "<this>");
        AbstractC2995aW.q(extensionLite, "extension");
        AbstractC2995aW.q(t, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        b.setExtension(extensionLite, t);
    }
}
