package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MetadataReader<T> {
    private final JsonStorage jsonStorage;
    private final String key;

    public MetadataReader(JsonStorage jsonStorage, String str) {
        AbstractC2995aW.q(jsonStorage, "jsonStorage");
        AbstractC2995aW.q(str, "key");
        this.jsonStorage = jsonStorage;
        this.key = str;
    }

    public final JsonStorage getJsonStorage() {
        return this.jsonStorage;
    }

    public final String getKey() {
        return this.key;
    }

    public final <T> T read(T t) {
        if (getJsonStorage().get(getKey()) == null) {
            return t;
        }
        AbstractC2995aW.w0();
        throw null;
    }

    public final <T> T readAndDelete(T t) {
        if (getJsonStorage().get(getKey()) != null) {
            AbstractC2995aW.w0();
            throw null;
        }
        if (getJsonStorage().get(getKey()) != null) {
            getJsonStorage().delete(getKey());
        }
        return t;
    }
}
