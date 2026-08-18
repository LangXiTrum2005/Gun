package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public final class S0 extends T0 {
    public S0(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.protobuf.T0
    public void copyMemory(long j, byte[] bArr, long j2, long j3) {
        this.unsafe.copyMemory((Object) null, j, bArr, U0.BYTE_ARRAY_BASE_OFFSET + j2, j3);
    }

    @Override // com.google.protobuf.T0
    public boolean getBoolean(Object obj, long j) {
        return this.unsafe.getBoolean(obj, j);
    }

    @Override // com.google.protobuf.T0
    public byte getByte(Object obj, long j) {
        return this.unsafe.getByte(obj, j);
    }

    @Override // com.google.protobuf.T0
    public double getDouble(Object obj, long j) {
        return this.unsafe.getDouble(obj, j);
    }

    @Override // com.google.protobuf.T0
    public float getFloat(Object obj, long j) {
        return this.unsafe.getFloat(obj, j);
    }

    @Override // com.google.protobuf.T0
    public int getInt(long j) {
        return this.unsafe.getInt(j);
    }

    @Override // com.google.protobuf.T0
    public long getLong(long j) {
        return this.unsafe.getLong(j);
    }

    @Override // com.google.protobuf.T0
    public Object getStaticObject(java.lang.reflect.Field field) {
        return getObject(this.unsafe.staticFieldBase(field), this.unsafe.staticFieldOffset(field));
    }

    @Override // com.google.protobuf.T0
    public void putBoolean(Object obj, long j, boolean z) {
        this.unsafe.putBoolean(obj, j, z);
    }

    @Override // com.google.protobuf.T0
    public void putByte(Object obj, long j, byte b) {
        this.unsafe.putByte(obj, j, b);
    }

    @Override // com.google.protobuf.T0
    public void putDouble(Object obj, long j, double d) {
        this.unsafe.putDouble(obj, j, d);
    }

    @Override // com.google.protobuf.T0
    public void putFloat(Object obj, long j, float f) {
        this.unsafe.putFloat(obj, j, f);
    }

    @Override // com.google.protobuf.T0
    public void putInt(long j, int i) {
        this.unsafe.putInt(j, i);
    }

    @Override // com.google.protobuf.T0
    public void putLong(long j, long j2) {
        this.unsafe.putLong(j, j2);
    }

    @Override // com.google.protobuf.T0
    public boolean supportsUnsafeArrayOperations() {
        if (!super.supportsUnsafeArrayOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.unsafe.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", Object.class, cls2);
            cls.getMethod("putByte", Object.class, cls2, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, cls2);
            cls.getMethod("putBoolean", Object.class, cls2, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, cls2);
            cls.getMethod("putFloat", Object.class, cls2, Float.TYPE);
            cls.getMethod("getDouble", Object.class, cls2);
            cls.getMethod("putDouble", Object.class, cls2, Double.TYPE);
            return true;
        } catch (Throwable th) {
            U0.logMissingMethod(th);
            return false;
        }
    }

    @Override // com.google.protobuf.T0
    public boolean supportsUnsafeByteBufferOperations() {
        if (!super.supportsUnsafeByteBufferOperations()) {
            return false;
        }
        try {
            Class<?> cls = this.unsafe.getClass();
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getByte", cls2);
            cls.getMethod("putByte", cls2, Byte.TYPE);
            cls.getMethod("getInt", cls2);
            cls.getMethod("putInt", cls2, Integer.TYPE);
            cls.getMethod("getLong", cls2);
            cls.getMethod("putLong", cls2, cls2);
            cls.getMethod("copyMemory", cls2, cls2, cls2);
            cls.getMethod("copyMemory", Object.class, cls2, Object.class, cls2, cls2);
            return true;
        } catch (Throwable th) {
            U0.logMissingMethod(th);
            return false;
        }
    }

    @Override // com.google.protobuf.T0
    public void copyMemory(byte[] bArr, long j, long j2, long j3) {
        this.unsafe.copyMemory(bArr, U0.BYTE_ARRAY_BASE_OFFSET + j, (Object) null, j2, j3);
    }

    @Override // com.google.protobuf.T0
    public byte getByte(long j) {
        return this.unsafe.getByte(j);
    }

    @Override // com.google.protobuf.T0
    public void putByte(long j, byte b) {
        this.unsafe.putByte(j, b);
    }
}
