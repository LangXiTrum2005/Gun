package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.ByteStringStoreOuterClass;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class ByteStringSerializer implements Serializer<ByteStringStoreOuterClass.ByteStringStore> {
    private final ByteStringStoreOuterClass.ByteStringStore defaultValue;

    public ByteStringSerializer() {
        ByteStringStoreOuterClass.ByteStringStore defaultInstance = ByteStringStoreOuterClass.ByteStringStore.getDefaultInstance();
        AbstractC2995aW.p(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC2857Wj interfaceC2857Wj) throws IOException {
        try {
            ByteStringStoreOuterClass.ByteStringStore from = ByteStringStoreOuterClass.ByteStringStore.parseFrom(inputStream);
            AbstractC2995aW.p(from, "parseFrom(input)");
            return from;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public ByteStringStoreOuterClass.ByteStringStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public Object writeTo(ByteStringStoreOuterClass.ByteStringStore byteStringStore, OutputStream outputStream, InterfaceC2857Wj interfaceC2857Wj) throws IOException {
        byteStringStore.writeTo(outputStream);
        return C5033xf0.f5238a;
    }
}
