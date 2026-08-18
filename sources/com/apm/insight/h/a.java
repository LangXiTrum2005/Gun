package com.apm.insight.h;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f104a;

    /* JADX INFO: renamed from: com.apm.insight.h.a$a, reason: collision with other inner class name */
    public static class C0010a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f105a;
        public final T b;
    }

    static {
        HashMap map = new HashMap();
        f104a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        Class cls2 = Byte.TYPE;
        map.put(Byte.class, cls2);
        Class cls3 = Character.TYPE;
        map.put(Character.class, cls3);
        Class cls4 = Short.TYPE;
        map.put(Short.class, cls4);
        Class cls5 = Integer.TYPE;
        map.put(Integer.class, cls5);
        Class cls6 = Float.TYPE;
        map.put(Float.class, cls6);
        Class cls7 = Long.TYPE;
        map.put(Long.class, cls7);
        Class cls8 = Double.TYPE;
        map.put(Double.class, cls8);
        map.put(cls, cls);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        map.put(cls5, cls5);
        map.put(cls6, cls6);
        map.put(cls7, cls7);
        map.put(cls8, cls8);
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        Method method;
        Class<?>[] parameterTypes;
        try {
            Class<?> cls = Class.forName(str);
            Class<?>[] clsArr = new Class[4];
            for (int i = 0; i < 4; i++) {
                Object obj = objArr[i];
                clsArr[i] = (obj == null || !(obj instanceof C0010a)) ? obj == null ? null : obj.getClass() : ((C0010a) obj).f105a;
            }
            while (true) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[i2];
                    if (method.getName().equals(str2) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 4) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= parameterTypes.length) {
                                break;
                            }
                            if (!parameterTypes[i3].isAssignableFrom(clsArr[i3])) {
                                Map<Class<?>, Class<?>> map = f104a;
                                if (!map.containsKey(parameterTypes[i3]) || !map.get(parameterTypes[i3]).equals(map.get(clsArr[i3]))) {
                                    break;
                                    break;
                                }
                            }
                            i3++;
                        }
                    }
                    i2++;
                }
                if (method != null) {
                    method.setAccessible(true);
                    Object[] objArr2 = new Object[4];
                    for (int i4 = 0; i4 < 4; i4++) {
                        Object obj2 = objArr[i4];
                        if (obj2 == null || !(obj2 instanceof C0010a)) {
                            objArr2[i4] = obj2;
                        } else {
                            objArr2[i4] = ((C0010a) obj2).b;
                        }
                    }
                    return (T) method.invoke(null, objArr2);
                }
                if (cls.getSuperclass() == null) {
                    throw new NoSuchMethodException();
                }
                cls = cls.getSuperclass();
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
