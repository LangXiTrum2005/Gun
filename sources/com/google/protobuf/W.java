package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3422fH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Z70;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zl0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class W {
    private static final int DEFAULT_FIELD_MAP_ARRAY_SIZE = 16;
    private static final W DEFAULT_INSTANCE = new W(true);
    private final Z70 fields;
    private boolean hasLazyField;
    private boolean isImmutable;

    public /* synthetic */ W(Z70 z70, U u) {
        this(z70);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldSet$FieldDescriptorLite<T>> Z70 cloneAllFieldsMap(Z70 z70, boolean z) {
        Z70 z70NewFieldMap = Z70.newFieldMap(16);
        for (int i = 0; i < z70.getNumArrayEntries(); i++) {
            cloneFieldEntry(z70NewFieldMap, z70.getArrayEntryAt(i), z);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = z70.getOverflowEntries().iterator();
        while (it.hasNext()) {
            cloneFieldEntry(z70NewFieldMap, it.next(), z);
        }
        return z70NewFieldMap;
    }

    private static <T extends FieldSet$FieldDescriptorLite<T>> void cloneFieldEntry(Map<T, Object> map, Map.Entry<T, Object> entry, boolean z) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            map.put(key, ((LazyField) value).getValue());
        } else if (z && (value instanceof List)) {
            map.put(key, new ArrayList((List) value));
        } else {
            map.put(key, value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object cloneIfMutable(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static int computeElementSize(WireFormat.FieldType fieldType, int i, Object obj) {
        int iComputeTagSize = CodedOutputStream.computeTagSize(i);
        if (fieldType == WireFormat.FieldType.GROUP) {
            iComputeTagSize *= 2;
        }
        return computeElementSizeNoTag(fieldType, obj) + iComputeTagSize;
    }

    public static int computeElementSizeNoTag(WireFormat.FieldType fieldType, Object obj) {
        switch (U.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                return CodedOutputStream.computeDoubleSizeNoTag(((Double) obj).doubleValue());
            case 2:
                return CodedOutputStream.computeFloatSizeNoTag(((Float) obj).floatValue());
            case 3:
                return CodedOutputStream.computeInt64SizeNoTag(((Long) obj).longValue());
            case 4:
                return CodedOutputStream.computeUInt64SizeNoTag(((Long) obj).longValue());
            case 5:
                return CodedOutputStream.computeInt32SizeNoTag(((Integer) obj).intValue());
            case 6:
                return CodedOutputStream.computeFixed64SizeNoTag(((Long) obj).longValue());
            case 7:
                return CodedOutputStream.computeFixed32SizeNoTag(((Integer) obj).intValue());
            case 8:
                return CodedOutputStream.computeBoolSizeNoTag(((Boolean) obj).booleanValue());
            case 9:
                return CodedOutputStream.computeGroupSizeNoTag((MessageLite) obj);
            case 10:
                return obj instanceof LazyField ? CodedOutputStream.computeLazyFieldSizeNoTag((LazyField) obj) : CodedOutputStream.computeMessageSizeNoTag((MessageLite) obj);
            case 11:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeStringSizeNoTag((String) obj);
            case 12:
                return obj instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag((ByteString) obj) : CodedOutputStream.computeByteArraySizeNoTag((byte[]) obj);
            case 13:
                return CodedOutputStream.computeUInt32SizeNoTag(((Integer) obj).intValue());
            case 14:
                return CodedOutputStream.computeSFixed32SizeNoTag(((Integer) obj).intValue());
            case 15:
                return CodedOutputStream.computeSFixed64SizeNoTag(((Long) obj).longValue());
            case 16:
                return CodedOutputStream.computeSInt32SizeNoTag(((Integer) obj).intValue());
            case 17:
                return CodedOutputStream.computeSInt64SizeNoTag(((Long) obj).longValue());
            case 18:
                return obj instanceof Internal.EnumLite ? CodedOutputStream.computeEnumSizeNoTag(((Internal.EnumLite) obj).getNumber()) : CodedOutputStream.computeEnumSizeNoTag(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int computeFieldSize(FieldSet$FieldDescriptorLite<?> fieldSet$FieldDescriptorLite, Object obj) {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            return computeElementSize(liteType, number, obj);
        }
        int iComputeElementSize = 0;
        if (!fieldSet$FieldDescriptorLite.isPacked()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iComputeElementSize += computeElementSize(liteType, number, it.next());
            }
            return iComputeElementSize;
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            iComputeElementSize += computeElementSizeNoTag(liteType, it2.next());
        }
        return CodedOutputStream.computeUInt32SizeNoTag(iComputeElementSize) + CodedOutputStream.computeTagSize(number) + iComputeElementSize;
    }

    public static <T extends FieldSet$FieldDescriptorLite<T>> W emptySet() {
        return DEFAULT_INSTANCE;
    }

    public static int getWireFormatForFieldType(WireFormat.FieldType fieldType, boolean z) {
        if (z) {
            return 2;
        }
        return fieldType.getWireType();
    }

    private static boolean isMessageFieldValueInitialized(Object obj) {
        if (obj instanceof MessageLiteOrBuilder) {
            return ((MessageLiteOrBuilder) obj).isInitialized();
        }
        if (obj instanceof LazyField) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isValidType(WireFormat.FieldType fieldType, Object obj) {
        Internal.checkNotNull(obj);
        switch (U.$SwitchMap$com$google$protobuf$WireFormat$JavaType[fieldType.getJavaType().ordinal()]) {
            case 1:
                return obj instanceof Integer;
            case 2:
                return obj instanceof Long;
            case 3:
                return obj instanceof Float;
            case 4:
                return obj instanceof Double;
            case 5:
                return obj instanceof Boolean;
            case 6:
                return obj instanceof String;
            case 7:
                return (obj instanceof ByteString) || (obj instanceof byte[]);
            case 8:
                return (obj instanceof Integer) || (obj instanceof Internal.EnumLite);
            case 9:
                return (obj instanceof MessageLite) || (obj instanceof LazyField);
            default:
                return false;
        }
    }

    private void mergeFromField(Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> entry) {
        FieldSet$FieldDescriptorLite<Object> key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof LazyField) {
            value = ((LazyField) value).getValue();
        }
        if (key.isRepeated()) {
            Object field = getField(key);
            if (field == null) {
                field = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) field).add(cloneIfMutable(it.next()));
            }
            this.fields.put((Comparable<Object>) key, field);
            return;
        }
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            this.fields.put((Comparable<Object>) key, cloneIfMutable(value));
            return;
        }
        Object field2 = getField(key);
        if (field2 == null) {
            this.fields.put((Comparable<Object>) key, cloneIfMutable(value));
        } else {
            this.fields.put((Comparable<Object>) key, (Object) key.internalMergeFrom(((MessageLite) field2).toBuilder(), (MessageLite) value).build());
        }
    }

    public static <T extends FieldSet$FieldDescriptorLite<T>> V newBuilder() {
        return new V((U) null);
    }

    public static <T extends FieldSet$FieldDescriptorLite<T>> W newFieldSet() {
        return new W();
    }

    public static Object readPrimitiveField(CodedInputStream codedInputStream, WireFormat.FieldType fieldType, boolean z) throws IOException {
        return z ? WireFormat.readPrimitiveField(codedInputStream, fieldType, Zl0.STRICT) : WireFormat.readPrimitiveField(codedInputStream, fieldType, Zl0.LOOSE);
    }

    private void verifyType(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, Object obj) {
        if (!isValidType(fieldSet$FieldDescriptorLite.getLiteType(), obj)) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(fieldSet$FieldDescriptorLite.getNumber()), fieldSet$FieldDescriptorLite.getLiteType().getJavaType(), obj.getClass().getName()));
        }
    }

    public static void writeElement(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, int i, Object obj) throws IOException {
        if (fieldType == WireFormat.FieldType.GROUP) {
            codedOutputStream.writeGroup(i, (MessageLite) obj);
        } else {
            codedOutputStream.writeTag(i, getWireFormatForFieldType(fieldType, false));
            writeElementNoTag(codedOutputStream, fieldType, obj);
        }
    }

    public static void writeElementNoTag(CodedOutputStream codedOutputStream, WireFormat.FieldType fieldType, Object obj) throws IOException {
        switch (U.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()]) {
            case 1:
                codedOutputStream.writeDoubleNoTag(((Double) obj).doubleValue());
                break;
            case 2:
                codedOutputStream.writeFloatNoTag(((Float) obj).floatValue());
                break;
            case 3:
                codedOutputStream.writeInt64NoTag(((Long) obj).longValue());
                break;
            case 4:
                codedOutputStream.writeUInt64NoTag(((Long) obj).longValue());
                break;
            case 5:
                codedOutputStream.writeInt32NoTag(((Integer) obj).intValue());
                break;
            case 6:
                codedOutputStream.writeFixed64NoTag(((Long) obj).longValue());
                break;
            case 7:
                codedOutputStream.writeFixed32NoTag(((Integer) obj).intValue());
                break;
            case 8:
                codedOutputStream.writeBoolNoTag(((Boolean) obj).booleanValue());
                break;
            case 9:
                codedOutputStream.writeGroupNoTag((MessageLite) obj);
                break;
            case 10:
                codedOutputStream.writeMessageNoTag((MessageLite) obj);
                break;
            case 11:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeStringNoTag((String) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 12:
                if (!(obj instanceof ByteString)) {
                    codedOutputStream.writeByteArrayNoTag((byte[]) obj);
                } else {
                    codedOutputStream.writeBytesNoTag((ByteString) obj);
                }
                break;
            case 13:
                codedOutputStream.writeUInt32NoTag(((Integer) obj).intValue());
                break;
            case 14:
                codedOutputStream.writeSFixed32NoTag(((Integer) obj).intValue());
                break;
            case 15:
                codedOutputStream.writeSFixed64NoTag(((Long) obj).longValue());
                break;
            case 16:
                codedOutputStream.writeSInt32NoTag(((Integer) obj).intValue());
                break;
            case 17:
                codedOutputStream.writeSInt64NoTag(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof Internal.EnumLite)) {
                    codedOutputStream.writeEnumNoTag(((Integer) obj).intValue());
                } else {
                    codedOutputStream.writeEnumNoTag(((Internal.EnumLite) obj).getNumber());
                }
                break;
        }
    }

    public static void writeField(FieldSet$FieldDescriptorLite<?> fieldSet$FieldDescriptorLite, Object obj, CodedOutputStream codedOutputStream) throws IOException {
        WireFormat.FieldType liteType = fieldSet$FieldDescriptorLite.getLiteType();
        int number = fieldSet$FieldDescriptorLite.getNumber();
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            if (obj instanceof LazyField) {
                writeElement(codedOutputStream, liteType, number, ((LazyField) obj).getValue());
                return;
            } else {
                writeElement(codedOutputStream, liteType, number, obj);
                return;
            }
        }
        List list = (List) obj;
        if (!fieldSet$FieldDescriptorLite.isPacked()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                writeElement(codedOutputStream, liteType, number, it.next());
            }
            return;
        }
        codedOutputStream.writeTag(number, 2);
        Iterator it2 = list.iterator();
        int iComputeElementSizeNoTag = 0;
        while (it2.hasNext()) {
            iComputeElementSizeNoTag += computeElementSizeNoTag(liteType, it2.next());
        }
        codedOutputStream.writeUInt32NoTag(iComputeElementSizeNoTag);
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            writeElementNoTag(codedOutputStream, liteType, it3.next());
        }
    }

    public void addRepeatedField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, Object obj) {
        List arrayList;
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        verifyType(fieldSet$FieldDescriptorLite, obj);
        Object field = getField(fieldSet$FieldDescriptorLite);
        if (field == null) {
            arrayList = new ArrayList();
            this.fields.put((Comparable<Object>) fieldSet$FieldDescriptorLite, (Object) arrayList);
        } else {
            arrayList = (List) field;
        }
        arrayList.add(obj);
    }

    public void clear() {
        this.fields.clear();
        this.hasLazyField = false;
    }

    public void clearField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        this.fields.remove(fieldSet$FieldDescriptorLite);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Iterator<Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object>> descendingIterator() {
        return this.hasLazyField ? new C3422fH(this.fields.descendingEntrySet().iterator()) : this.fields.descendingEntrySet().iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof W) {
            return this.fields.equals(((W) obj).fields);
        }
        return false;
    }

    public Map<FieldSet$FieldDescriptorLite<Object>, Object> getAllFields() {
        if (!this.hasLazyField) {
            return this.fields.isImmutable() ? this.fields : Collections.unmodifiableMap(this.fields);
        }
        Z70 z70CloneAllFieldsMap = cloneAllFieldsMap(this.fields, false);
        if (this.fields.isImmutable()) {
            z70CloneAllFieldsMap.makeImmutable();
        }
        return z70CloneAllFieldsMap;
    }

    public Object getField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        Object obj = this.fields.get(fieldSet$FieldDescriptorLite);
        return obj instanceof LazyField ? ((LazyField) obj).getValue() : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int getMessageSetSerializedSize() {
        int messageSetSerializedSize = 0;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            messageSetSerializedSize += getMessageSetSerializedSize(this.fields.getArrayEntryAt(i));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            messageSetSerializedSize += getMessageSetSerializedSize(it.next());
        }
        return messageSetSerializedSize;
    }

    public Object getRepeatedField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, int i) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fieldSet$FieldDescriptorLite);
        if (field != null) {
            return ((List) field).get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int getRepeatedFieldCount(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fieldSet$FieldDescriptorLite);
        if (field == null) {
            return 0;
        }
        return ((List) field).size();
    }

    public int getSerializedSize() {
        int iComputeFieldSize = 0;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            iComputeFieldSize += computeFieldSize((FieldSet$FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            iComputeFieldSize += computeFieldSize((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        return iComputeFieldSize;
    }

    public boolean hasField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite) {
        if (fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return this.fields.get(fieldSet$FieldDescriptorLite) != null;
    }

    public int hashCode() {
        return this.fields.hashCode();
    }

    public boolean isEmpty() {
        return this.fields.isEmpty();
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public boolean isInitialized() {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            if (!isInitialized(this.fields.getArrayEntryAt(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            if (!isInitialized(it.next())) {
                return false;
            }
        }
        return true;
    }

    public Iterator<Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object>> iterator() {
        return this.hasLazyField ? new C3422fH(this.fields.entrySet().iterator()) : this.fields.entrySet().iterator();
    }

    public void makeImmutable() {
        if (this.isImmutable) {
            return;
        }
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            if (arrayEntryAt.getValue() instanceof GeneratedMessageLite) {
                ((GeneratedMessageLite) arrayEntryAt.getValue()).makeImmutable();
            }
        }
        this.fields.makeImmutable();
        this.isImmutable = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void mergeFrom(W w) {
        for (int i = 0; i < w.fields.getNumArrayEntries(); i++) {
            mergeFromField(w.fields.getArrayEntryAt(i));
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = w.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            mergeFromField(it.next());
        }
    }

    public void setField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, Object obj) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            verifyType(fieldSet$FieldDescriptorLite, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                verifyType(fieldSet$FieldDescriptorLite, it.next());
            }
            obj = arrayList;
        }
        if (obj instanceof LazyField) {
            this.hasLazyField = true;
        }
        this.fields.put((Comparable<Object>) fieldSet$FieldDescriptorLite, obj);
    }

    public void setRepeatedField(FieldSet$FieldDescriptorLite<Object> fieldSet$FieldDescriptorLite, int i, Object obj) {
        if (!fieldSet$FieldDescriptorLite.isRepeated()) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object field = getField(fieldSet$FieldDescriptorLite);
        if (field == null) {
            throw new IndexOutOfBoundsException();
        }
        verifyType(fieldSet$FieldDescriptorLite, obj);
        ((List) field).set(i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void writeMessageSetTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            writeMessageSetTo(this.fields.getArrayEntryAt(i), codedOutputStream);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            writeMessageSetTo(it.next(), codedOutputStream);
        }
    }

    public void writeTo(CodedOutputStream codedOutputStream) throws IOException {
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            writeField((FieldSet$FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue(), codedOutputStream);
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            writeField((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue(), codedOutputStream);
        }
    }

    private W() {
        this.fields = Z70.newFieldMap(16);
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public W m51clone() {
        W wNewFieldSet = newFieldSet();
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            Map.Entry<Comparable<Object>, Object> arrayEntryAt = this.fields.getArrayEntryAt(i);
            wNewFieldSet.setField((FieldSet$FieldDescriptorLite) arrayEntryAt.getKey(), arrayEntryAt.getValue());
        }
        for (Map.Entry<Comparable<Object>, Object> entry : this.fields.getOverflowEntries()) {
            wNewFieldSet.setField((FieldSet$FieldDescriptorLite) entry.getKey(), entry.getValue());
        }
        wNewFieldSet.hasLazyField = this.hasLazyField;
        return wNewFieldSet;
    }

    private W(boolean z) {
        this(Z70.newFieldMap(0));
        makeImmutable();
    }

    private int getMessageSetSerializedSize(Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> entry) {
        FieldSet$FieldDescriptorLite<Object> key = entry.getKey();
        Object value = entry.getValue();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            if (value instanceof LazyField) {
                return CodedOutputStream.computeLazyFieldMessageSetExtensionSize(entry.getKey().getNumber(), (LazyField) value);
            }
            return CodedOutputStream.computeMessageSetExtensionSize(entry.getKey().getNumber(), (MessageLite) value);
        }
        return computeFieldSize(key, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends FieldSet$FieldDescriptorLite<T>> boolean isInitialized(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.getLiteJavaType() != WireFormat.JavaType.MESSAGE) {
            return true;
        }
        if (key.isRepeated()) {
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                if (!isMessageFieldValueInitialized(it.next())) {
                    return false;
                }
            }
            return true;
        }
        return isMessageFieldValueInitialized(entry.getValue());
    }

    private void writeMessageSetTo(Map.Entry<FieldSet$FieldDescriptorLite<Object>, Object> entry, CodedOutputStream codedOutputStream) throws IOException {
        FieldSet$FieldDescriptorLite<Object> key = entry.getKey();
        if (key.getLiteJavaType() == WireFormat.JavaType.MESSAGE && !key.isRepeated() && !key.isPacked()) {
            Object value = entry.getValue();
            if (value instanceof LazyField) {
                value = ((LazyField) value).getValue();
            }
            codedOutputStream.writeMessageSetExtension(entry.getKey().getNumber(), (MessageLite) value);
            return;
        }
        writeField(key, entry.getValue(), codedOutputStream);
    }

    private W(Z70 z70) {
        this.fields = z70;
        makeImmutable();
    }
}
