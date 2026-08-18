package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class Q0 extends T0 {
    private static final long SMALL_ADDRESS_MASK = -1;

    public Q0(Unsafe unsafe) {
        super(unsafe);
    }

    private static int smallAddress(long j) {
        return (int) j;
    }

    @Override // com.google.protobuf.T0
    public void copyMemory(long j, byte[] bArr, long j2, long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.T0
    public boolean getBoolean(Object obj, long j) {
        return U0.IS_BIG_ENDIAN ? U0.getBooleanBigEndian(obj, j) : U0.getBooleanLittleEndian(obj, j);
    }

    @Override // com.google.protobuf.T0
    public byte getByte(Object obj, long j) {
        return U0.IS_BIG_ENDIAN ? U0.getByteBigEndian(obj, j) : U0.getByteLittleEndian(obj, j);
    }

    @Override // com.google.protobuf.T0
    public double getDouble(Object obj, long j) {
        return Double.longBitsToDouble(getLong(obj, j));
    }

    @Override // com.google.protobuf.T0
    public float getFloat(Object obj, long j) {
        return Float.intBitsToFloat(getInt(obj, j));
    }

    @Override // com.google.protobuf.T0
    public int getInt(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.T0
    public long getLong(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.T0
    public Object getStaticObject(java.lang.reflect.Field field) {
        try {
            return field.get(null);
        } catch (IllegalAccessException unused) {
            return null;
        }
    }

    @Override // com.google.protobuf.T0
    public void putBoolean(Object obj, long j, boolean z) {
        if (U0.IS_BIG_ENDIAN) {
            U0.putBooleanBigEndian(obj, j, z);
        } else {
            U0.putBooleanLittleEndian(obj, j, z);
        }
    }

    @Override // com.google.protobuf.T0
    public void putByte(Object obj, long j, byte b) {
        if (U0.IS_BIG_ENDIAN) {
            U0.putByteBigEndian(obj, j, b);
        } else {
            U0.putByteLittleEndian(obj, j, b);
        }
    }

    @Override // com.google.protobuf.T0
    public void putDouble(Object obj, long j, double d) {
        putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // com.google.protobuf.T0
    public void putFloat(Object obj, long j, float f) {
        putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // com.google.protobuf.T0
    public void putInt(long j, int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.T0
    public void putLong(long j, long j2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.T0
    public boolean supportsUnsafeByteBufferOperations() {
        return false;
    }

    @Override // com.google.protobuf.T0
    public void copyMemory(byte[] bArr, long j, long j2, long j3) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.T0
    public byte getByte(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.protobuf.T0
    public void putByte(long j, byte b) {
        throw new UnsupportedOperationException();
    }
}
