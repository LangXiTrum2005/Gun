package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f1078a;
    final ThreadMode b;
    final Class<?> c;
    String d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f1078a = method;
        this.b = threadMode;
        this.c = cls;
    }

    private synchronized void a() {
        if (this.d == null) {
            StringBuilder sb = new StringBuilder(64);
            sb.append(this.f1078a.getDeclaringClass().getName());
            sb.append('#');
            sb.append(this.f1078a.getName());
            sb.append('(');
            sb.append(this.c.getName());
            this.d = sb.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.d.equals(((SubscriberMethod) obj).d);
    }

    public int hashCode() {
        return this.f1078a.hashCode();
    }
}
