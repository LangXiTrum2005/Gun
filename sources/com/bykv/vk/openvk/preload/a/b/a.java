package com.bykv.vk.openvk.preload.a.b;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Type[] f224a = new Type[0];

    /* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.b.a$a, reason: collision with other inner class name */
    public static final class C0021a implements Serializable, GenericArrayType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f225a;

        public C0021a(Type type) {
            this.f225a = a.a(type);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && a.a(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public final Type getGenericComponentType() {
            return this.f225a;
        }

        public final int hashCode() {
            return this.f225a.hashCode();
        }

        public final String toString() {
            return a.c(this.f225a) + "[]";
        }
    }

    public static final class b implements Serializable, ParameterizedType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f226a;
        private final Type b;
        private final Type[] c;

        public b(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                com.bykv.vk.openvk.preload.falconx.a.a.a(z);
            }
            this.f226a = type == null ? null : a.a(type);
            this.b = a.a(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.c = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                com.bykv.vk.openvk.preload.falconx.a.a.a(this.c[i]);
                a.e(this.c[i]);
                Type[] typeArr3 = this.c;
                typeArr3[i] = a.a(typeArr3[i]);
            }
        }

        public final boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && a.a(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type[] getActualTypeArguments() {
            return (Type[]) this.c.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getOwnerType() {
            return this.f226a;
        }

        @Override // java.lang.reflect.ParameterizedType
        public final Type getRawType() {
            return this.b;
        }

        public final int hashCode() {
            return (Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ a.a((Object) this.f226a);
        }

        public final String toString() {
            int length = this.c.length;
            if (length == 0) {
                return a.c(this.b);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(a.c(this.b));
            sb.append("<");
            sb.append(a.c(this.c[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(a.c(this.c[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    public static final class c implements Serializable, WildcardType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type f227a;
        private final Type b;

        public c(Type[] typeArr, Type[] typeArr2) {
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr2.length <= 1);
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr.length == 1);
            if (typeArr2.length != 1) {
                com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr[0]);
                a.e(typeArr[0]);
                this.b = null;
                this.f227a = a.a(typeArr[0]);
                return;
            }
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr2[0]);
            a.e(typeArr2[0]);
            com.bykv.vk.openvk.preload.falconx.a.a.a(typeArr[0] == Object.class);
            this.b = a.a(typeArr2[0]);
            this.f227a = Object.class;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof WildcardType) && a.a(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getLowerBounds() {
            Type type = this.b;
            return type != null ? new Type[]{type} : a.f224a;
        }

        @Override // java.lang.reflect.WildcardType
        public final Type[] getUpperBounds() {
            return new Type[]{this.f227a};
        }

        public final int hashCode() {
            Type type = this.b;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f227a.hashCode() + 31);
        }

        public final String toString() {
            if (this.b != null) {
                return "? super " + a.c(this.b);
            }
            if (this.f227a == Object.class) {
                return "?";
            }
            return "? extends " + a.c(this.f227a);
        }
    }

    public static Type a(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C0021a(a((Type) cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new C0021a(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static Class<?> b(Type type) {
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                com.bykv.vk.openvk.preload.falconx.a.a.a(rawType instanceof Class);
                return (Class) rawType;
            }
            if (type instanceof GenericArrayType) {
                return Array.newInstance(b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (!(type instanceof WildcardType)) {
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
            }
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        return (Class) type;
    }

    public static String c(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static Type d(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static void e(Type type) {
        com.bykv.vk.openvk.preload.falconx.a.a.a(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    private static GenericArrayType f(Type type) {
        return new C0021a(type);
    }

    public static boolean a(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                return (ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
            }
            if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else {
                if (type instanceof WildcardType) {
                    if (!(type2 instanceof WildcardType)) {
                        return false;
                    }
                    WildcardType wildcardType = (WildcardType) type;
                    WildcardType wildcardType2 = (WildcardType) type2;
                    return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
                }
                if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                    return false;
                }
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
            }
        }
        return true;
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        com.bykv.vk.openvk.preload.falconx.a.a.a(cls2.isAssignableFrom(cls));
        return a(type, cls, a(type, cls, cls2));
    }

    public static Type[] b(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type typeB = b(type, cls, Map.class);
        if (typeB instanceof ParameterizedType) {
            return ((ParameterizedType) typeB).getActualTypeArguments();
        }
        return new Type[]{Object.class, Object.class};
    }

    public static int a(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037 A[LOOP:2: B:19:0x0037->B:28:0x0051, LOOP_START, PHI: r5
  0x0037: PHI (r5v2 java.lang.Class<?>) = (r5v1 java.lang.Class<?>), (r5v4 java.lang.Class<?>) binds: [B:18:0x0035, B:28:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x003b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[LOOP:2: B:19:0x0037->B:28:0x0051, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x004c A[SYNTHETIC] */
    private static Type a(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> superclass;
        Type genericSuperclass;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int length = interfaces.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Class<?> cls3 = interfaces[i];
                        if (cls3 == cls2) {
                            return cls.getGenericInterfaces()[i];
                        }
                        if (cls2.isAssignableFrom(cls3)) {
                            genericSuperclass = cls.getGenericInterfaces()[i];
                            superclass = interfaces[i];
                        } else {
                            i++;
                        }
                    } else {
                        if (!cls.isInterface()) {
                            while (cls != Object.class) {
                                superclass = cls.getSuperclass();
                                if (superclass == cls2) {
                                    return cls.getGenericSuperclass();
                                }
                                if (cls2.isAssignableFrom(superclass)) {
                                    genericSuperclass = cls.getGenericSuperclass();
                                } else {
                                    cls = superclass;
                                }
                            }
                        }
                        return cls2;
                    }
                }
            } else {
                if (!cls.isInterface()) {
                    while (cls != Object.class) {
                        superclass = cls.getSuperclass();
                        if (superclass == cls2) {
                            return cls.getGenericSuperclass();
                        }
                        if (cls2.isAssignableFrom(superclass)) {
                            genericSuperclass = cls.getGenericSuperclass();
                        } else {
                            cls = superclass;
                        }
                    }
                }
                return cls2;
            }
            Type type2 = genericSuperclass;
            cls = superclass;
            type = type2;
        }
        return type;
    }

    public static Type a(Type type, Class<?> cls) {
        Type typeB = b(type, cls, Collection.class);
        if (typeB instanceof WildcardType) {
            typeB = ((WildcardType) typeB).getUpperBounds()[0];
        }
        if (typeB instanceof ParameterizedType) {
            return ((ParameterizedType) typeB).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashSet());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    private static Type a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        Type type3;
        WildcardType wildcardType;
        Type[] upperBounds;
        Type[] lowerBounds;
        while (type2 instanceof TypeVariable) {
            TypeVariable typeVariable = (TypeVariable) type2;
            if (collection.contains(typeVariable)) {
                return type2;
            }
            collection.add(typeVariable);
            GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
            Class cls2 = genericDeclaration instanceof Class ? (Class) genericDeclaration : null;
            if (cls2 != null) {
                Type typeA = a(type, cls, (Class<?>) cls2);
                if (typeA instanceof ParameterizedType) {
                    TypeVariable[] typeParameters = cls2.getTypeParameters();
                    int length = typeParameters.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            if (typeVariable.equals(typeParameters[i])) {
                                type2 = ((ParameterizedType) typeA).getActualTypeArguments()[i];
                                break;
                            }
                            i++;
                        } else {
                            throw new NoSuchElementException();
                        }
                    }
                } else {
                    type2 = typeVariable;
                }
            } else {
                type2 = typeVariable;
            }
            if (type2 == typeVariable) {
                return type2;
            }
        }
        if (type2 instanceof Class) {
            Class cls3 = (Class) type2;
            if (cls3.isArray()) {
                Class<?> componentType = cls3.getComponentType();
                Type typeA2 = a(type, cls, componentType, collection);
                return componentType == typeA2 ? cls3 : f(typeA2);
            }
        }
        if (type2 instanceof GenericArrayType) {
            GenericArrayType genericArrayType = (GenericArrayType) type2;
            Type genericComponentType = genericArrayType.getGenericComponentType();
            Type typeA3 = a(type, cls, genericComponentType, collection);
            return genericComponentType == typeA3 ? genericArrayType : f(typeA3);
        }
        if (type2 instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type typeA4 = a(type, cls, ownerType, collection);
            boolean z = typeA4 != ownerType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            int length2 = actualTypeArguments.length;
            for (int i2 = 0; i2 < length2; i2++) {
                Type typeA5 = a(type, cls, actualTypeArguments[i2], collection);
                if (typeA5 != actualTypeArguments[i2]) {
                    if (!z) {
                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                        z = true;
                    }
                    actualTypeArguments[i2] = typeA5;
                }
            }
            return z ? new b(typeA4, parameterizedType.getRawType(), actualTypeArguments) : parameterizedType;
        }
        if (type2 instanceof WildcardType) {
            wildcardType = (WildcardType) type2;
            Type[] lowerBounds2 = wildcardType.getLowerBounds();
            Type[] upperBounds2 = wildcardType.getUpperBounds();
            if (lowerBounds2.length == 1) {
                Type typeA6 = a(type, cls, lowerBounds2[0], collection);
                if (typeA6 != lowerBounds2[0]) {
                    if (typeA6 instanceof WildcardType) {
                        type3 = type2;
                        type3 = wildcardType;
                        lowerBounds = ((WildcardType) typeA6).getLowerBounds();
                    } else {
                        type3 = type2;
                        type3 = wildcardType;
                        lowerBounds = new Type[]{typeA6};
                    }
                    return new c(new Type[]{Object.class}, lowerBounds);
                }
            } else if (upperBounds2.length == 1) {
                type3 = type2;
                type3 = wildcardType;
                Type typeA7 = a(type, cls, upperBounds2[0], collection);
                type3 = wildcardType;
                if (typeA7 != upperBounds2[0]) {
                    if (typeA7 instanceof WildcardType) {
                        upperBounds = ((WildcardType) typeA7).getUpperBounds();
                    } else {
                        upperBounds = new Type[]{typeA7};
                    }
                    return new c(upperBounds, f224a);
                }
            }
        }
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        type3 = wildcardType;
        type3 = type2;
        return type3;
    }
}
