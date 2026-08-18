package com.unity3d.ads.core.data.model;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.Serializer;
import com.google.protobuf.InvalidProtocolBufferException;
import com.unity3d.ads.datastore.WebviewConfigurationStore;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class WebViewConfigurationStoreSerializer implements Serializer<WebviewConfigurationStore.WebViewConfigurationStore> {
    private final WebviewConfigurationStore.WebViewConfigurationStore defaultValue;

    public WebViewConfigurationStoreSerializer() {
        WebviewConfigurationStore.WebViewConfigurationStore defaultInstance = WebviewConfigurationStore.WebViewConfigurationStore.getDefaultInstance();
        AbstractC2995aW.p(defaultInstance, "getDefaultInstance()");
        this.defaultValue = defaultInstance;
    }

    @Override // androidx.datastore.core.Serializer
    public Object readFrom(InputStream inputStream, InterfaceC2857Wj interfaceC2857Wj) throws IOException {
        try {
            WebviewConfigurationStore.WebViewConfigurationStore from = WebviewConfigurationStore.WebViewConfigurationStore.parseFrom(inputStream);
            AbstractC2995aW.p(from, "parseFrom(input)");
            return from;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read proto.", e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.datastore.core.Serializer
    public WebviewConfigurationStore.WebViewConfigurationStore getDefaultValue() {
        return this.defaultValue;
    }

    @Override // androidx.datastore.core.Serializer
    public Object writeTo(WebviewConfigurationStore.WebViewConfigurationStore webViewConfigurationStore, OutputStream outputStream, InterfaceC2857Wj interfaceC2857Wj) throws IOException {
        webViewConfigurationStore.writeTo(outputStream);
        return C5033xf0.f5238a;
    }
}
