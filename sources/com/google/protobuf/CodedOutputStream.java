package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2645Of;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ng0;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CodedOutputStream extends ByteOutput {
    public static final int DEFAULT_BUFFER_SIZE = 4096;

    @Deprecated
    public static final int LITTLE_ENDIAN_32_SIZE = 4;
    private boolean serializationDeterministic;
    A wrapper;
    private static final Logger logger = Logger.getLogger(CodedOutputStream.class.getName());
    private static final boolean HAS_UNSAFE_ARRAY_OPERATIONS = U0.hasUnsafeArrayOperations();

    public static class OutOfSpaceException extends IOException {
        private static final String MESSAGE = "CodedOutputStream was writing to a flat byte array and ran out of space.";
        private static final long serialVersionUID = -6947486886997889499L;

        public OutOfSpaceException() {
            super(MESSAGE);
        }

        public OutOfSpaceException(String str) {
            super(AbstractC3888ke0.i("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str));
        }

        public OutOfSpaceException(Throwable th) {
            super(MESSAGE, th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super(AbstractC3888ke0.i("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public static int computeBoolSize(int i, boolean z) {
        return computeBoolSizeNoTag(z) + computeTagSize(i);
    }

    public static int computeBoolSizeNoTag(boolean z) {
        return 1;
    }

    public static int computeByteArraySize(int i, byte[] bArr) {
        return computeByteArraySizeNoTag(bArr) + computeTagSize(i);
    }

    public static int computeByteArraySizeNoTag(byte[] bArr) {
        return computeLengthDelimitedFieldSize(bArr.length);
    }

    public static int computeByteBufferSize(int i, ByteBuffer byteBuffer) {
        return computeByteBufferSizeNoTag(byteBuffer) + computeTagSize(i);
    }

    public static int computeByteBufferSizeNoTag(ByteBuffer byteBuffer) {
        return computeLengthDelimitedFieldSize(byteBuffer.capacity());
    }

    public static int computeBytesSize(int i, ByteString byteString) {
        return computeBytesSizeNoTag(byteString) + computeTagSize(i);
    }

    public static int computeBytesSizeNoTag(ByteString byteString) {
        return computeLengthDelimitedFieldSize(byteString.size());
    }

    public static int computeDoubleSize(int i, double d) {
        return computeDoubleSizeNoTag(d) + computeTagSize(i);
    }

    public static int computeDoubleSizeNoTag(double d) {
        return 8;
    }

    public static int computeEnumSize(int i, int i2) {
        return computeEnumSizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeEnumSizeNoTag(int i) {
        return computeInt32SizeNoTag(i);
    }

    public static int computeFixed32Size(int i, int i2) {
        return computeFixed32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeFixed64Size(int i, long j) {
        return computeFixed64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeFloatSize(int i, float f) {
        return computeFloatSizeNoTag(f) + computeTagSize(i);
    }

    public static int computeFloatSizeNoTag(float f) {
        return 4;
    }

    @Deprecated
    public static int computeGroupSize(int i, MessageLite messageLite) {
        return messageLite.getSerializedSize() + (computeTagSize(i) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite) {
        return messageLite.getSerializedSize();
    }

    public static int computeInt32Size(int i, int i2) {
        return computeInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeInt32SizeNoTag(int i) {
        if (i >= 0) {
            return computeUInt32SizeNoTag(i);
        }
        return 10;
    }

    public static int computeInt64Size(int i, long j) {
        return computeInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeLazyFieldMessageSetExtensionSize(int i, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSize(3, lazyFieldLite) + computeUInt32Size(2, i) + (computeTagSize(1) * 2);
    }

    public static int computeLazyFieldSize(int i, LazyFieldLite lazyFieldLite) {
        return computeLazyFieldSizeNoTag(lazyFieldLite) + computeTagSize(i);
    }

    public static int computeLazyFieldSizeNoTag(LazyFieldLite lazyFieldLite) {
        return computeLengthDelimitedFieldSize(lazyFieldLite.getSerializedSize());
    }

    public static int computeLengthDelimitedFieldSize(int i) {
        return computeUInt32SizeNoTag(i) + i;
    }

    public static int computeMessageSetExtensionSize(int i, MessageLite messageLite) {
        return computeMessageSize(3, messageLite) + computeUInt32Size(2, i) + (computeTagSize(1) * 2);
    }

    public static int computeMessageSize(int i, MessageLite messageLite) {
        return computeMessageSizeNoTag(messageLite) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite) {
        return computeLengthDelimitedFieldSize(messageLite.getSerializedSize());
    }

    public static int computePreferredBufferSize(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int computeRawMessageSetExtensionSize(int i, ByteString byteString) {
        return computeBytesSize(3, byteString) + computeUInt32Size(2, i) + (computeTagSize(1) * 2);
    }

    @Deprecated
    public static int computeRawVarint32Size(int i) {
        return computeUInt32SizeNoTag(i);
    }

    @Deprecated
    public static int computeRawVarint64Size(long j) {
        return computeUInt64SizeNoTag(j);
    }

    public static int computeSFixed32Size(int i, int i2) {
        return computeSFixed32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeSFixed32SizeNoTag(int i) {
        return 4;
    }

    public static int computeSFixed64Size(int i, long j) {
        return computeSFixed64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeSFixed64SizeNoTag(long j) {
        return 8;
    }

    public static int computeSInt32Size(int i, int i2) {
        return computeSInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeSInt32SizeNoTag(int i) {
        return computeUInt32SizeNoTag(encodeZigZag32(i));
    }

    public static int computeSInt64Size(int i, long j) {
        return computeSInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeSInt64SizeNoTag(long j) {
        return computeUInt64SizeNoTag(encodeZigZag64(j));
    }

    public static int computeStringSize(int i, String str) {
        return computeStringSizeNoTag(str) + computeTagSize(i);
    }

    public static int computeStringSizeNoTag(String str) {
        int length;
        try {
            length = Ng0.encodedLength(str);
        } catch (Mg0 unused) {
            length = str.getBytes(Internal.UTF_8).length;
        }
        return computeLengthDelimitedFieldSize(length);
    }

    public static int computeTagSize(int i) {
        return computeUInt32SizeNoTag(WireFormat.makeTag(i, 0));
    }

    public static int computeUInt32Size(int i, int i2) {
        return computeUInt32SizeNoTag(i2) + computeTagSize(i);
    }

    public static int computeUInt32SizeNoTag(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int computeUInt64Size(int i, long j) {
        return computeUInt64SizeNoTag(j) + computeTagSize(i);
    }

    public static int computeUInt64SizeNoTag(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int encodeZigZag32(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static long encodeZigZag64(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static CodedOutputStream newInstance(OutputStream outputStream) {
        return newInstance(outputStream, 4096);
    }

    public static CodedOutputStream newSafeInstance(ByteBuffer byteBuffer) {
        return new C2149x(byteBuffer);
    }

    public static CodedOutputStream newUnsafeInstance(ByteBuffer byteBuffer) {
        return new C2151y(byteBuffer);
    }

    public final void checkNoSpaceLeft() {
        if (spaceLeft() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public abstract void flush() throws IOException;

    public abstract int getTotalBytesWritten();

    public final void inefficientWriteStringNoTag(String str, Mg0 mg0) throws IOException {
        logger.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) mg0);
        byte[] bytes = str.getBytes(Internal.UTF_8);
        try {
            writeUInt32NoTag(bytes.length);
            writeLazy(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new OutOfSpaceException(e);
        }
    }

    public boolean isSerializationDeterministic() {
        return this.serializationDeterministic;
    }

    public abstract int spaceLeft();

    public void useDeterministicSerialization() {
        this.serializationDeterministic = true;
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte b) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void write(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeBool(int i, boolean z) throws IOException;

    public final void writeBoolNoTag(boolean z) throws IOException {
        write(z ? (byte) 1 : (byte) 0);
    }

    public abstract void writeByteArray(int i, byte[] bArr) throws IOException;

    public abstract void writeByteArray(int i, byte[] bArr, int i2, int i3) throws IOException;

    public final void writeByteArrayNoTag(byte[] bArr) throws IOException {
        writeByteArrayNoTag(bArr, 0, bArr.length);
    }

    public abstract void writeByteArrayNoTag(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeByteBuffer(int i, ByteBuffer byteBuffer) throws IOException;

    public abstract void writeBytes(int i, ByteString byteString) throws IOException;

    public abstract void writeBytesNoTag(ByteString byteString) throws IOException;

    public final void writeDouble(int i, double d) throws IOException {
        writeFixed64(i, Double.doubleToRawLongBits(d));
    }

    public final void writeDoubleNoTag(double d) throws IOException {
        writeFixed64NoTag(Double.doubleToRawLongBits(d));
    }

    public final void writeEnum(int i, int i2) throws IOException {
        writeInt32(i, i2);
    }

    public final void writeEnumNoTag(int i) throws IOException {
        writeInt32NoTag(i);
    }

    public abstract void writeFixed32(int i, int i2) throws IOException;

    public abstract void writeFixed32NoTag(int i) throws IOException;

    public abstract void writeFixed64(int i, long j) throws IOException;

    public abstract void writeFixed64NoTag(long j) throws IOException;

    public final void writeFloat(int i, float f) throws IOException {
        writeFixed32(i, Float.floatToRawIntBits(f));
    }

    public final void writeFloatNoTag(float f) throws IOException {
        writeFixed32NoTag(Float.floatToRawIntBits(f));
    }

    @Deprecated
    public final void writeGroup(int i, MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite, interfaceC3578h30);
        writeTag(i, 4);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite) throws IOException {
        messageLite.writeTo(this);
    }

    public abstract void writeInt32(int i, int i2) throws IOException;

    public abstract void writeInt32NoTag(int i) throws IOException;

    public final void writeInt64(int i, long j) throws IOException {
        writeUInt64(i, j);
    }

    public final void writeInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(ByteBuffer byteBuffer) throws IOException;

    @Override // com.google.protobuf.ByteOutput
    public abstract void writeLazy(byte[] bArr, int i, int i2) throws IOException;

    public abstract void writeMessage(int i, MessageLite messageLite) throws IOException;

    public abstract void writeMessage(int i, MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite) throws IOException;

    public abstract void writeMessageNoTag(MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException;

    public abstract void writeMessageSetExtension(int i, MessageLite messageLite) throws IOException;

    public final void writeRawByte(byte b) throws IOException {
        write(b);
    }

    public abstract void writeRawBytes(ByteBuffer byteBuffer) throws IOException;

    public final void writeRawBytes(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Deprecated
    public final void writeRawLittleEndian32(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    @Deprecated
    public final void writeRawLittleEndian64(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public abstract void writeRawMessageSetExtension(int i, ByteString byteString) throws IOException;

    @Deprecated
    public final void writeRawVarint32(int i) throws IOException {
        writeUInt32NoTag(i);
    }

    @Deprecated
    public final void writeRawVarint64(long j) throws IOException {
        writeUInt64NoTag(j);
    }

    public final void writeSFixed32(int i, int i2) throws IOException {
        writeFixed32(i, i2);
    }

    public final void writeSFixed32NoTag(int i) throws IOException {
        writeFixed32NoTag(i);
    }

    public final void writeSFixed64(int i, long j) throws IOException {
        writeFixed64(i, j);
    }

    public final void writeSFixed64NoTag(long j) throws IOException {
        writeFixed64NoTag(j);
    }

    public final void writeSInt32(int i, int i2) throws IOException {
        writeUInt32(i, encodeZigZag32(i2));
    }

    public final void writeSInt32NoTag(int i) throws IOException {
        writeUInt32NoTag(encodeZigZag32(i));
    }

    public final void writeSInt64(int i, long j) throws IOException {
        writeUInt64(i, encodeZigZag64(j));
    }

    public final void writeSInt64NoTag(long j) throws IOException {
        writeUInt64NoTag(encodeZigZag64(j));
    }

    public abstract void writeString(int i, String str) throws IOException;

    public abstract void writeStringNoTag(String str) throws IOException;

    public abstract void writeTag(int i, int i2) throws IOException;

    public abstract void writeUInt32(int i, int i2) throws IOException;

    public abstract void writeUInt32NoTag(int i) throws IOException;

    public abstract void writeUInt64(int i, long j) throws IOException;

    public abstract void writeUInt64NoTag(long j) throws IOException;

    private CodedOutputStream() {
    }

    @Deprecated
    public static int computeGroupSize(int i, MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) {
        return computeGroupSizeNoTag(messageLite, interfaceC3578h30) + (computeTagSize(i) * 2);
    }

    @Deprecated
    public static int computeGroupSizeNoTag(MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) {
        return ((AbstractMessageLite) messageLite).getSerializedSize(interfaceC3578h30);
    }

    public static int computeMessageSize(int i, MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) {
        return computeMessageSizeNoTag(messageLite, interfaceC3578h30) + computeTagSize(i);
    }

    public static int computeMessageSizeNoTag(MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) {
        return computeLengthDelimitedFieldSize(((AbstractMessageLite) messageLite).getSerializedSize(interfaceC3578h30));
    }

    public static CodedOutputStream newInstance(OutputStream outputStream, int i) {
        return new C2147w(outputStream, i);
    }

    @Deprecated
    public final void writeGroupNoTag(MessageLite messageLite, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        interfaceC3578h30.writeTo(messageLite, this.wrapper);
    }

    public final void writeRawByte(int i) throws IOException {
        write((byte) i);
    }

    public final void writeRawBytes(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(byte[] bArr) {
        return newInstance(bArr, 0, bArr.length);
    }

    public final void writeRawBytes(ByteString byteString) throws IOException {
        byteString.writeTo(this);
    }

    public static CodedOutputStream newInstance(byte[] bArr, int i, int i2) {
        return new C2143u(bArr, i, i2);
    }

    public static CodedOutputStream newInstance(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new C2645Of(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (C2151y.isSupported()) {
                return newUnsafeInstance(byteBuffer);
            }
            return newSafeInstance(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    @Deprecated
    public final void writeGroup(int i, MessageLite messageLite) throws IOException {
        writeTag(i, 3);
        writeGroupNoTag(messageLite);
        writeTag(i, 4);
    }

    @Deprecated
    public static CodedOutputStream newInstance(ByteBuffer byteBuffer, int i) {
        return newInstance(byteBuffer);
    }

    public static CodedOutputStream newInstance(ByteOutput byteOutput, int i) {
        if (i >= 0) {
            return new C2145v(byteOutput, i);
        }
        throw new IllegalArgumentException("bufferSize must be positive");
    }
}
