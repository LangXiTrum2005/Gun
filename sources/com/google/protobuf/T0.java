package com.google.protobuf;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class T0 {
    Unsafe unsafe;

    public T0(Unsafe unsafe) {
        this.unsafe = unsafe;
    }

    public final int arrayBaseOffset(Class<?> cls) {
        return this.unsafe.arrayBaseOffset(cls);
    }

    public final int arrayIndexScale(Class<?> cls) {
        return this.unsafe.arrayIndexScale(cls);
    }

    public abstract void copyMemory(long j, byte[] bArr, long j2, long j3);

    public abstract void copyMemory(byte[] bArr, long j, long j2, long j3);

    public abstract boolean getBoolean(Object obj, long j);

    public abstract byte getByte(long j);

    public abstract byte getByte(Object obj, long j);

    public abstract double getDouble(Object obj, long j);

    public abstract float getFloat(Object obj, long j);

    public abstract int getInt(long j);

    public final int getInt(Object obj, long j) {
        return this.unsafe.getInt(obj, j);
    }

    public abstract long getLong(long j);

    public final long getLong(Object obj, long j) {
        return this.unsafe.getLong(obj, j);
    }

    public final Object getObject(Object obj, long j) {
        return this.unsafe.getObject(obj, j);
    }

    public abstract Object getStaticObject(java.lang.reflect.Field field);

    public final long objectFieldOffset(java.lang.reflect.Field field) {
        return this.unsafe.objectFieldOffset(field);
    }

    public abstract void putBoolean(Object obj, long j, boolean z);

    public abstract void putByte(long j, byte b);

    public abstract void putByte(Object obj, long j, byte b);

    public abstract void putDouble(Object obj, long j, double d);

    public abstract void putFloat(Object obj, long j, float f);

    public abstract void putInt(long j, int i);

    public final void putInt(Object obj, long j, int i) {
        this.unsafe.putInt(obj, j, i);
    }

    public abstract void putLong(long j, long j2);

    public final void putLong(Object obj, long j, long j2) {
        this.unsafe.putLong(obj, j, j2);
    }

    public final void putObject(Object obj, long j, Object obj2) {
        this.unsafe.putObject(obj, j, obj2);
    }

    public boolean supportsUnsafeArrayOperations() {
        Unsafe unsafe = this.unsafe;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            Class<?> cls2 = Long.TYPE;
            cls.getMethod("getInt", Object.class, cls2);
            cls.getMethod("putInt", Object.class, cls2, Integer.TYPE);
            cls.getMethod("getLong", Object.class, cls2);
            cls.getMethod("putLong", Object.class, cls2, cls2);
            cls.getMethod("getObject", Object.class, cls2);
            cls.getMethod("putObject", Object.class, cls2, Object.class);
            return true;
        } catch (Throwable th) {
            U0.logMissingMethod(th);
            return false;
        }
    }

    public boolean supportsUnsafeByteBufferOperations() {
        Unsafe unsafe = this.unsafe;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", java.lang.reflect.Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            return U0.bufferAddressField() != null;
        } catch (Throwable th) {
            U0.logMissingMethod(th);
            return false;
        }
    }
}
