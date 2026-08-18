package com.facebook.ads.redexgen.core;

import com.google.android.exoplayer2.Metadata;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class V4 implements V7 {
    public abstract Metadata A0R(Bi bi, ByteBuffer byteBuffer);

    @Override // com.facebook.ads.redexgen.core.V7
    public final Metadata A5e(Bi bi) {
        ByteBuffer byteBuffer = (ByteBuffer) AbstractC1517es.A01(bi.A02);
        AbstractC1517es.A07(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (bi.A04()) {
            return null;
        }
        return A0R(bi, byteBuffer);
    }
}
