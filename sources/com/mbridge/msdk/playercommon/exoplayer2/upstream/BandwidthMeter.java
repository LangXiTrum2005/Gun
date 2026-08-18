package com.mbridge.msdk.playercommon.exoplayer2.upstream;

/* JADX INFO: loaded from: classes2.dex */
public interface BandwidthMeter {

    public interface EventListener {
        void onBandwidthSample(int i, long j, long j2);
    }

    long getBitrateEstimate();
}
