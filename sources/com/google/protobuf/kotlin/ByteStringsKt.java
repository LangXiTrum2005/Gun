package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class ByteStringsKt {
    public static final byte get(ByteString byteString, int i) {
        AbstractC2995aW.q(byteString, "<this>");
        return byteString.byteAt(i);
    }

    public static final ByteString plus(ByteString byteString, ByteString byteString2) {
        AbstractC2995aW.q(byteString, "<this>");
        AbstractC2995aW.q(byteString2, "other");
        ByteString byteStringConcat = byteString.concat(byteString2);
        AbstractC2995aW.p(byteStringConcat, "concat(other)");
        return byteStringConcat;
    }

    public static final ByteString toByteString(byte[] bArr) {
        AbstractC2995aW.q(bArr, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bArr);
        AbstractC2995aW.p(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }

    public static final ByteString toByteStringUtf8(String str) {
        AbstractC2995aW.q(str, "<this>");
        ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8(str);
        AbstractC2995aW.p(byteStringCopyFromUtf8, "copyFromUtf8(this)");
        return byteStringCopyFromUtf8;
    }

    public static final ByteString toByteString(ByteBuffer byteBuffer) {
        AbstractC2995aW.q(byteBuffer, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(byteBuffer);
        AbstractC2995aW.p(byteStringCopyFrom, "copyFrom(this)");
        return byteStringCopyFrom;
    }
}
