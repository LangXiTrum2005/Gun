package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3603hM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3515gM;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3642hm0;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class D0 {
    private static final int DEFAULT_LOOK_UP_START_NUMBER = 40;
    private static final Class<?> GENERATED_MESSAGE_CLASS = getGeneratedMessageClass();
    private static final O0 PROTO2_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(false);
    private static final O0 PROTO3_UNKNOWN_FIELD_SET_SCHEMA = getUnknownFieldSetSchema(true);
    private static final O0 UNKNOWN_FIELD_SET_LITE_SCHEMA = new P0();

    private D0() {
    }

    public static int computeSizeBoolList(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return CodedOutputStream.computeBoolSize(i, true) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeBoolListNoTag(List<?> list) {
        return list.size();
    }

    public static int computeSizeByteStringList(int i, List<ByteString> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < list.size(); i2++) {
            iComputeTagSize += CodedOutputStream.computeBytesSizeNoTag(list.get(i2));
        }
        return iComputeTagSize;
    }

    public static int computeSizeEnumList(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeEnumListNoTag = computeSizeEnumListNoTag(list);
        if (!z) {
            return (CodedOutputStream.computeTagSize(i) * size) + iComputeSizeEnumListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeEnumListNoTag) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeEnumListNoTag(List<Integer> list) {
        int iComputeEnumSizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2113e0) {
            C2113e0 c2113e0 = (C2113e0) list;
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(c2113e0.getInt(i));
                i++;
            }
        } else {
            iComputeEnumSizeNoTag = 0;
            while (i < size) {
                iComputeEnumSizeNoTag += CodedOutputStream.computeEnumSizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeEnumSizeNoTag;
    }

    public static int computeSizeFixed32List(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return CodedOutputStream.computeFixed32Size(i, 0) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size * 4) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeFixed32ListNoTag(List<?> list) {
        return list.size() * 4;
    }

    public static int computeSizeFixed64List(int i, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        if (!z) {
            return CodedOutputStream.computeFixed64Size(i, 0L) * size;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(size * 8) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeFixed64ListNoTag(List<?> list) {
        return list.size() * 8;
    }

    public static int computeSizeGroupList(int i, List<MessageLite> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i, list.get(i2));
        }
        return iComputeGroupSize;
    }

    public static int computeSizeInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeInt32ListNoTag = computeSizeInt32ListNoTag(list);
        if (!z) {
            return (CodedOutputStream.computeTagSize(i) * size) + iComputeSizeInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt32ListNoTag) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeInt32ListNoTag(List<Integer> list) {
        int iComputeInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2113e0) {
            C2113e0 c2113e0 = (C2113e0) list;
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(c2113e0.getInt(i));
                i++;
            }
        } else {
            iComputeInt32SizeNoTag = 0;
            while (i < size) {
                iComputeInt32SizeNoTag += CodedOutputStream.computeInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeInt32SizeNoTag;
    }

    public static int computeSizeInt64List(int i, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int iComputeSizeInt64ListNoTag = computeSizeInt64ListNoTag(list);
        if (z) {
            return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeInt64ListNoTag) + CodedOutputStream.computeTagSize(i);
        }
        return (CodedOutputStream.computeTagSize(i) * list.size()) + iComputeSizeInt64ListNoTag;
    }

    public static int computeSizeInt64ListNoTag(List<Long> list) {
        int iComputeInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2131n0) {
            C2131n0 c2131n0 = (C2131n0) list;
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(c2131n0.getLong(i));
                i++;
            }
        } else {
            iComputeInt64SizeNoTag = 0;
            while (i < size) {
                iComputeInt64SizeNoTag += CodedOutputStream.computeInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeInt64SizeNoTag;
    }

    public static int computeSizeMessage(int i, Object obj, InterfaceC3578h30 interfaceC3578h30) {
        return obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSize(i, (LazyFieldLite) obj) : CodedOutputStream.computeMessageSize(i, (MessageLite) obj, interfaceC3578h30);
    }

    public static int computeSizeMessageList(int i, List<?> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            iComputeTagSize = (obj instanceof LazyFieldLite ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj)) + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static int computeSizeSInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt32ListNoTag = computeSizeSInt32ListNoTag(list);
        if (!z) {
            return (CodedOutputStream.computeTagSize(i) * size) + iComputeSizeSInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt32ListNoTag) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeSInt32ListNoTag(List<Integer> list) {
        int iComputeSInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2113e0) {
            C2113e0 c2113e0 = (C2113e0) list;
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(c2113e0.getInt(i));
                i++;
            }
        } else {
            iComputeSInt32SizeNoTag = 0;
            while (i < size) {
                iComputeSInt32SizeNoTag += CodedOutputStream.computeSInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeSInt32SizeNoTag;
    }

    public static int computeSizeSInt64List(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeSInt64ListNoTag = computeSizeSInt64ListNoTag(list);
        if (!z) {
            return (CodedOutputStream.computeTagSize(i) * size) + iComputeSizeSInt64ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeSInt64ListNoTag) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeSInt64ListNoTag(List<Long> list) {
        int iComputeSInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2131n0) {
            C2131n0 c2131n0 = (C2131n0) list;
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(c2131n0.getLong(i));
                i++;
            }
        } else {
            iComputeSInt64SizeNoTag = 0;
            while (i < size) {
                iComputeSInt64SizeNoTag += CodedOutputStream.computeSInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeSInt64SizeNoTag;
    }

    public static int computeSizeStringList(int i, List<?> list) {
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i) * size;
        if (list instanceof LazyStringList) {
            LazyStringList lazyStringList = (LazyStringList) list;
            while (i2 < size) {
                Object raw = lazyStringList.getRaw(i2);
                iComputeTagSize = (raw instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) raw) : CodedOutputStream.computeStringSizeNoTag((String) raw)) + iComputeTagSize;
                i2++;
            }
        } else {
            while (i2 < size) {
                Object obj = list.get(i2);
                iComputeTagSize = (obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj)) + iComputeTagSize;
                i2++;
            }
        }
        return iComputeTagSize;
    }

    public static int computeSizeUInt32List(int i, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt32ListNoTag = computeSizeUInt32ListNoTag(list);
        if (!z) {
            return (CodedOutputStream.computeTagSize(i) * size) + iComputeSizeUInt32ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt32ListNoTag) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeUInt32ListNoTag(List<Integer> list) {
        int iComputeUInt32SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2113e0) {
            C2113e0 c2113e0 = (C2113e0) list;
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(c2113e0.getInt(i));
                i++;
            }
        } else {
            iComputeUInt32SizeNoTag = 0;
            while (i < size) {
                iComputeUInt32SizeNoTag += CodedOutputStream.computeUInt32SizeNoTag(list.get(i).intValue());
                i++;
            }
        }
        return iComputeUInt32SizeNoTag;
    }

    public static int computeSizeUInt64List(int i, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeSizeUInt64ListNoTag = computeSizeUInt64ListNoTag(list);
        if (!z) {
            return (CodedOutputStream.computeTagSize(i) * size) + iComputeSizeUInt64ListNoTag;
        }
        return CodedOutputStream.computeLengthDelimitedFieldSize(iComputeSizeUInt64ListNoTag) + CodedOutputStream.computeTagSize(i);
    }

    public static int computeSizeUInt64ListNoTag(List<Long> list) {
        int iComputeUInt64SizeNoTag;
        int size = list.size();
        int i = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof C2131n0) {
            C2131n0 c2131n0 = (C2131n0) list;
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(c2131n0.getLong(i));
                i++;
            }
        } else {
            iComputeUInt64SizeNoTag = 0;
            while (i < size) {
                iComputeUInt64SizeNoTag += CodedOutputStream.computeUInt64SizeNoTag(list.get(i).longValue());
                i++;
            }
        }
        return iComputeUInt64SizeNoTag;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, Internal.EnumLiteMap<?> enumLiteMap, UB ub, O0 o0) {
        if (enumLiteMap == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (enumLiteMap.findValueByNumber(iIntValue) != null) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, o0);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (enumLiteMap.findValueByNumber(iIntValue2) == null) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, o0);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> getGeneratedMessageClass() {
        try {
            return Class.forName("com.google.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object getMapDefaultEntry(Class<?> cls, String str) {
        try {
            java.lang.reflect.Field[] declaredFields = Class.forName(cls.getName() + "$" + toCamelCase(str, true) + "DefaultEntryHolder").getDeclaredFields();
            if (declaredFields.length == 1) {
                return U0.getStaticObject(declaredFields[0]);
            }
            throw new IllegalStateException("Unable to look up map field default entry holder class for " + str + " in " + cls.getName());
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    private static O0 getUnknownFieldSetSchema(boolean z) {
        try {
            Class<?> unknownFieldSetSchemaClass = getUnknownFieldSetSchemaClass();
            if (unknownFieldSetSchemaClass == null) {
                return null;
            }
            return (O0) unknownFieldSetSchemaClass.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> getUnknownFieldSetSchemaClass() {
        try {
            return Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends FieldSet$FieldDescriptorLite<FT>> void mergeExtensions(AbstractC3913kt abstractC3913kt, T t, T t2) {
        W extensions = abstractC3913kt.getExtensions(t2);
        if (extensions.isEmpty()) {
            return;
        }
        abstractC3913kt.getMutableExtensions(t).mergeFrom(extensions);
    }

    public static <T> void mergeMap(InterfaceC3515gM interfaceC3515gM, T t, T t2, long j) {
        U0.putObject(t, j, ((C3603hM) interfaceC3515gM).mergeFrom(U0.getObject(t, j), U0.getObject(t2, j)));
    }

    public static <T, UT, UB> void mergeUnknownFields(O0 o0, T t, T t2) {
        o0.setToMessage(t, o0.merge(o0.getFromMessage(t), o0.getFromMessage(t2)));
    }

    public static O0 proto2UnknownFieldSetSchema() {
        return PROTO2_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static O0 proto3UnknownFieldSetSchema() {
        return PROTO3_UNKNOWN_FIELD_SET_SCHEMA;
    }

    public static void requireGeneratedMessage(Class<?> cls) {
        Class<?> cls2;
        if (!GeneratedMessageLite.class.isAssignableFrom(cls) && (cls2 = GENERATED_MESSAGE_CLASS) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
        }
    }

    public static boolean safeEquals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static boolean shouldUseTableSwitch(int i, int i2, int i3) {
        if (i2 < 40) {
            return true;
        }
        long j = ((long) i2) - ((long) i);
        long j2 = i3;
        return j + 10 <= ((j2 + 3) * 3) + ((2 * j2) + 3);
    }

    public static <UT, UB> UB storeUnknownEnum(Object obj, int i, int i2, UB ub, O0 o0) {
        if (ub == null) {
            ub = (UB) o0.getBuilderFromMessage(obj);
        }
        o0.addVarint(ub, i, i2);
        return ub;
    }

    public static String toCamelCase(String str, boolean z) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if ('a' > cCharAt || cCharAt > 'z') {
                if ('A' > cCharAt || cCharAt > 'Z') {
                    if ('0' <= cCharAt && cCharAt <= '9') {
                        sb.append(cCharAt);
                    }
                    z = true;
                } else if (i != 0 || z) {
                    sb.append(cCharAt);
                } else {
                    sb.append((char) (cCharAt + ' '));
                }
            } else if (z) {
                sb.append((char) (cCharAt - ' '));
            } else {
                sb.append(cCharAt);
            }
            z = false;
        }
        return sb.toString();
    }

    public static O0 unknownFieldSetLiteSchema() {
        return UNKNOWN_FIELD_SET_LITE_SCHEMA;
    }

    public static void writeBool(int i, boolean z, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (z) {
            ((A) interfaceC3642hm0).writeBool(i, true);
        }
    }

    public static void writeBoolList(int i, List<Boolean> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeBoolList(i, list, z);
    }

    public static void writeBytes(int i, ByteString byteString, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (byteString == null || byteString.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeBytes(i, byteString);
    }

    public static void writeBytesList(int i, List<ByteString> list, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeBytesList(i, list);
    }

    public static void writeDouble(int i, double d, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (Double.doubleToRawLongBits(d) != 0) {
            ((A) interfaceC3642hm0).writeDouble(i, d);
        }
    }

    public static void writeDoubleList(int i, List<Double> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeDoubleList(i, list, z);
    }

    public static void writeEnum(int i, int i2, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (i2 != 0) {
            ((A) interfaceC3642hm0).writeEnum(i, i2);
        }
    }

    public static void writeEnumList(int i, List<Integer> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeEnumList(i, list, z);
    }

    public static void writeFixed32(int i, int i2, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (i2 != 0) {
            ((A) interfaceC3642hm0).writeFixed32(i, i2);
        }
    }

    public static void writeFixed32List(int i, List<Integer> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeFixed32List(i, list, z);
    }

    public static void writeFixed64(int i, long j, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (j != 0) {
            ((A) interfaceC3642hm0).writeFixed64(i, j);
        }
    }

    public static void writeFixed64List(int i, List<Long> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeFixed64List(i, list, z);
    }

    public static void writeFloat(int i, float f, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (Float.floatToRawIntBits(f) != 0) {
            ((A) interfaceC3642hm0).writeFloat(i, f);
        }
    }

    public static void writeFloatList(int i, List<Float> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeFloatList(i, list, z);
    }

    public static void writeGroupList(int i, List<?> list, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeGroupList(i, list);
    }

    public static void writeInt32(int i, int i2, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (i2 != 0) {
            ((A) interfaceC3642hm0).writeInt32(i, i2);
        }
    }

    public static void writeInt32List(int i, List<Integer> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeInt32List(i, list, z);
    }

    public static void writeInt64(int i, long j, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (j != 0) {
            ((A) interfaceC3642hm0).writeInt64(i, j);
        }
    }

    public static void writeInt64List(int i, List<Long> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeInt64List(i, list, z);
    }

    public static void writeLazyFieldList(int i, List<?> list, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((LazyFieldLite) it.next()).writeTo(interfaceC3642hm0, i);
        }
    }

    public static void writeMessage(int i, Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (obj != null) {
            ((A) interfaceC3642hm0).writeMessage(i, obj);
        }
    }

    public static void writeMessageList(int i, List<?> list, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeMessageList(i, list);
    }

    public static void writeSFixed32(int i, int i2, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (i2 != 0) {
            ((A) interfaceC3642hm0).writeSFixed32(i, i2);
        }
    }

    public static void writeSFixed32List(int i, List<Integer> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeSFixed32List(i, list, z);
    }

    public static void writeSFixed64(int i, long j, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (j != 0) {
            ((A) interfaceC3642hm0).writeSFixed64(i, j);
        }
    }

    public static void writeSFixed64List(int i, List<Long> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeSFixed64List(i, list, z);
    }

    public static void writeSInt32(int i, int i2, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (i2 != 0) {
            ((A) interfaceC3642hm0).writeSInt32(i, i2);
        }
    }

    public static void writeSInt32List(int i, List<Integer> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeSInt32List(i, list, z);
    }

    public static void writeSInt64(int i, long j, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (j != 0) {
            ((A) interfaceC3642hm0).writeSInt64(i, j);
        }
    }

    public static void writeSInt64List(int i, List<Long> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeSInt64List(i, list, z);
    }

    public static void writeString(int i, Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (obj instanceof String) {
            writeStringInternal(i, (String) obj, interfaceC3642hm0);
        } else {
            writeBytes(i, (ByteString) obj, interfaceC3642hm0);
        }
    }

    private static void writeStringInternal(int i, String str, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeString(i, str);
    }

    public static void writeStringList(int i, List<String> list, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeStringList(i, list);
    }

    public static void writeUInt32(int i, int i2, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (i2 != 0) {
            ((A) interfaceC3642hm0).writeUInt32(i, i2);
        }
    }

    public static void writeUInt32List(int i, List<Integer> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeUInt32List(i, list, z);
    }

    public static void writeUInt64(int i, long j, InterfaceC3642hm0 interfaceC3642hm0) throws IOException {
        if (j != 0) {
            ((A) interfaceC3642hm0).writeUInt64(i, j);
        }
    }

    public static void writeUInt64List(int i, List<Long> list, InterfaceC3642hm0 interfaceC3642hm0, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeUInt64List(i, list, z);
    }

    public static boolean shouldUseTableSwitch(S[] sArr) {
        if (sArr.length == 0) {
            return false;
        }
        return shouldUseTableSwitch(sArr[0].getFieldNumber(), sArr[sArr.length - 1].getFieldNumber(), sArr.length);
    }

    public static int computeSizeGroupList(int i, List<MessageLite> list, InterfaceC3578h30 interfaceC3578h30) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeGroupSize = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iComputeGroupSize += CodedOutputStream.computeGroupSize(i, list.get(i2), interfaceC3578h30);
        }
        return iComputeGroupSize;
    }

    public static void writeGroupList(int i, List<?> list, InterfaceC3642hm0 interfaceC3642hm0, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeGroupList(i, list, interfaceC3578h30);
    }

    public static void writeMessageList(int i, List<?> list, InterfaceC3642hm0 interfaceC3642hm0, InterfaceC3578h30 interfaceC3578h30) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        ((A) interfaceC3642hm0).writeMessageList(i, list, interfaceC3578h30);
    }

    public static int computeSizeMessageList(int i, List<?> list, InterfaceC3578h30 interfaceC3578h30) {
        int iComputeMessageSizeNoTag;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iComputeTagSize = CodedOutputStream.computeTagSize(i) * size;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            if (obj instanceof LazyFieldLite) {
                iComputeMessageSizeNoTag = CodedOutputStream.computeLazyFieldSizeNoTag((LazyFieldLite) obj);
            } else {
                iComputeMessageSizeNoTag = CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj, interfaceC3578h30);
            }
            iComputeTagSize = iComputeMessageSizeNoTag + iComputeTagSize;
        }
        return iComputeTagSize;
    }

    public static <UT, UB> UB filterUnknownEnumList(Object obj, int i, List<Integer> list, Internal.EnumVerifier enumVerifier, UB ub, O0 o0) {
        if (enumVerifier == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Integer num = list.get(i3);
                int iIntValue = num.intValue();
                if (enumVerifier.isInRange(iIntValue)) {
                    if (i3 != i2) {
                        list.set(i2, num);
                    }
                    i2++;
                } else {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue, ub, o0);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue2 = it.next().intValue();
                if (!enumVerifier.isInRange(iIntValue2)) {
                    ub = (UB) storeUnknownEnum(obj, i, iIntValue2, ub, o0);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
