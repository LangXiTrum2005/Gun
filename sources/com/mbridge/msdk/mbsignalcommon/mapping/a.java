package com.mbridge.msdk.mbsignalcommon.mapping;

/* JADX INFO: loaded from: classes2.dex */
public class a extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Class<?> f1483a;
    private String b;

    public a(String str) {
        super(str);
    }

    public void a(Class<?> cls) {
        this.f1483a = cls;
    }

    @Override // java.lang.Throwable
    public String toString() {
        if (getCause() == null) {
            return super.toString();
        }
        return getClass().getName() + ": " + getCause();
    }

    public a(Exception exc) {
        super(exc);
    }

    public void a(String str) {
        this.b = str;
    }
}
