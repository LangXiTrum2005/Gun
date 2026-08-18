package com.mbridge.msdk.mbsignalcommon.mapping;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    public static class a<C> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected Class<C> f1484a;

        public a(Class<C> cls) {
            this.f1484a = cls;
        }

        public C0196b a(String str, Class<?>... clsArr) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
            return new C0196b(this.f1484a, str, clsArr, 0);
        }
    }

    public static <T> a<T> a(ClassLoader classLoader, String str) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
        try {
            return new a<>(classLoader.loadClass(str));
        } catch (Exception e) {
            b(new com.mbridge.msdk.mbsignalcommon.mapping.a(e));
            return new a<>(null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.mapping.b$b, reason: collision with other inner class name */
    public static class C0196b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Method f1485a;

        public C0196b(Class<?> cls, String str, Class<?>[] clsArr, int i) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
            Method declaredMethod = null;
            if (cls == null) {
                this.f1485a = null;
                return;
            }
            while (cls != Object.class && cls != null) {
                try {
                    declaredMethod = cls.getDeclaredMethod(str, clsArr);
                    break;
                } catch (NoSuchMethodException e) {
                    if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                        e.printStackTrace();
                    }
                    cls = cls.getSuperclass();
                } catch (SecurityException e2) {
                    try {
                        try {
                            if (MBridgeConstans.DEBUG && cls.getSuperclass() == Object.class) {
                                e2.printStackTrace();
                            }
                            cls = cls.getSuperclass();
                        } catch (Exception e3) {
                            com.mbridge.msdk.mbsignalcommon.mapping.a aVar = new com.mbridge.msdk.mbsignalcommon.mapping.a(e3);
                            aVar.a(cls);
                            aVar.a(str);
                            b.b(aVar);
                            this.f1485a = declaredMethod;
                            return;
                        }
                    } catch (Throwable th) {
                        this.f1485a = declaredMethod;
                        throw th;
                    }
                }
            }
            if (declaredMethod != null) {
                if (i > 0 && (declaredMethod.getModifiers() & i) != i) {
                    b.b(new com.mbridge.msdk.mbsignalcommon.mapping.a(declaredMethod + " does not match modifiers: " + i));
                }
                declaredMethod.setAccessible(true);
            }
            this.f1485a = declaredMethod;
        }

        public Object a(Object obj, Object... objArr) throws IllegalArgumentException, InvocationTargetException {
            Method method = this.f1485a;
            if (method == null) {
                return null;
            }
            try {
                return method.invoke(obj, objArr);
            } catch (Exception e) {
                o0.a("MappingedMethod", "invoke error:" + e.getMessage());
                return null;
            }
        }

        public Method a() {
            return this.f1485a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.mbsignalcommon.mapping.a aVar) throws com.mbridge.msdk.mbsignalcommon.mapping.a {
        throw aVar;
    }
}
