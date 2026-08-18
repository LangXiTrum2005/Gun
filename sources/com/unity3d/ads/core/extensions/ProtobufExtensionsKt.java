package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class ProtobufExtensionsKt {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    public static final ByteString fromBase64(String str, boolean z) {
        AbstractC2995aW.q(str, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(Base64.decode(str, z ? 10 : 2));
        AbstractC2995aW.p(byteStringCopyFrom, "copyFrom(android.util.Base64.decode(this, flag))");
        return byteStringCopyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fromBase64(str, z);
    }

    public static final String toBase64(ByteString byteString, boolean z) {
        AbstractC2995aW.q(byteString, "<this>");
        String strEncodeToString = Base64.encodeToString(byteString.toByteArray(), z ? 10 : 2);
        AbstractC2995aW.p(strEncodeToString, "encodeToString(this.toByteArray(), flag)");
        return strEncodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toBase64(byteString, z);
    }

    public static final ByteString toByteString(UUID uuid) {
        AbstractC2995aW.q(uuid, "<this>");
        ByteString byteStringCopyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        AbstractC2995aW.p(byteStringCopyFrom, "copyFrom(bytes.array())");
        return byteStringCopyFrom;
    }

    public static final ByteString toISO8859ByteString(String str) {
        AbstractC2995aW.q(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC2307Be.c);
        AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString byteStringCopyFrom = ByteString.copyFrom(bytes);
        AbstractC2995aW.p(byteStringCopyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return byteStringCopyFrom;
    }

    public static final String toISO8859String(ByteString byteString) {
        AbstractC2995aW.q(byteString, "<this>");
        String string = byteString.toString(AbstractC2307Be.c);
        AbstractC2995aW.p(string, "this.toString(Charsets.ISO_8859_1)");
        return string;
    }

    public static final UUID toUUID(ByteString byteString) {
        AbstractC2995aW.q(byteString, "<this>");
        ByteBuffer byteBufferAsReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        AbstractC2995aW.p(byteBufferAsReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (byteBufferAsReadOnlyByteBuffer.remaining() == 36) {
            UUID uuidFromString = UUID.fromString(byteString.toStringUtf8());
            AbstractC2995aW.p(uuidFromString, "fromString(uuidString)");
            return uuidFromString;
        }
        if (byteBufferAsReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(byteBufferAsReadOnlyByteBuffer.getLong(), byteBufferAsReadOnlyByteBuffer.getLong());
        }
        throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
    }
}
