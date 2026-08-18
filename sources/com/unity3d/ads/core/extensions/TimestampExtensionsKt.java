package com.unity3d.ads.core.extensions;

import com.google.protobuf.Timestamp;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class TimestampExtensionsKt {
    public static final long duration(long j) {
        return System.nanoTime() - j;
    }

    public static final Timestamp fromMillis(long j) {
        long j2 = 1000;
        Timestamp timestampBuild = Timestamp.newBuilder().setSeconds(j / j2).setNanos((int) ((j % j2) * ((long) 1000000))).build();
        AbstractC2995aW.p(timestampBuild, "newBuilder().setSeconds(…000000).toInt())).build()");
        return timestampBuild;
    }
}
