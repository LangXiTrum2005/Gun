package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidGenerateByteStringId implements GetByteStringId {
    @Override // com.unity3d.ads.core.domain.GetByteStringId
    public ByteString invoke() {
        UUID uuidRandomUUID = UUID.randomUUID();
        AbstractC2995aW.p(uuidRandomUUID, "randomUUID()");
        return ProtobufExtensionsKt.toByteString(uuidRandomUUID);
    }
}
