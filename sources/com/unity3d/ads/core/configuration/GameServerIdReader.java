package com.unity3d.ads.core.configuration;

import com.unity3d.services.core.misc.JsonStorage;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class GameServerIdReader extends MetadataReader<String> {
    public static final Companion Companion = new Companion(null);
    public static final String PLAYER_SERVER_ID_KEY = "player.server_id.value";

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC2471Hm abstractC2471Hm) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameServerIdReader(JsonStorage jsonStorage) {
        super(jsonStorage, PLAYER_SERVER_ID_KEY);
        AbstractC2995aW.q(jsonStorage, "jsonStorage");
    }
}
