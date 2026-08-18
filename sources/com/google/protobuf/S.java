package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QS;

/* JADX INFO: loaded from: classes3.dex */
public final class S implements Comparable {
    private final java.lang.reflect.Field cachedSizeField;
    private final boolean enforceUtf8;
    private final Internal.EnumVerifier enumVerifier;
    private final java.lang.reflect.Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final QS oneof;
    private final Class<?> oneofStoredType;
    private final java.lang.reflect.Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final FieldType type;

    private S(java.lang.reflect.Field field, int i, FieldType fieldType, Class<?> cls, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, QS qs, Class<?> cls2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.field = field;
        this.type = fieldType;
        this.messageClass = cls;
        this.fieldNumber = i;
        this.presenceField = field2;
        this.presenceMask = i2;
        this.required = z;
        this.enforceUtf8 = z2;
        this.oneof = qs;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = enumVerifier;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("fieldNumber must be positive: ", i));
        }
    }

    public static S forField(java.lang.reflect.Field field, int i, FieldType fieldType, boolean z) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new S(field, i, fieldType, null, null, 0, false, z, null, null, null, null, null);
    }

    public static S forFieldWithEnumVerifier(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        return new S(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, null);
    }

    public static S forMapField(java.lang.reflect.Field field, int i, Object obj, Internal.EnumVerifier enumVerifier) {
        Internal.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        return new S(field, i, FieldType.MAP, null, null, 0, false, true, null, null, obj, enumVerifier, null);
    }

    public static S forOneofMemberField(int i, FieldType fieldType, QS qs, Class<?> cls, boolean z, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(qs, "oneof");
        Internal.checkNotNull(cls, "oneofStoredType");
        if (fieldType.isScalar()) {
            return new S(null, i, fieldType, null, null, 0, false, z, qs, cls, null, enumVerifier, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + fieldType);
    }

    public static S forPackedField(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        if (fieldType == FieldType.MESSAGE_LIST || fieldType == FieldType.GROUP_LIST) {
            throw new IllegalStateException("Shouldn't be called for repeated message fields.");
        }
        return new S(field, i, fieldType, null, null, 0, false, false, null, null, null, null, field2);
    }

    public static S forPackedFieldWithEnumVerifier(java.lang.reflect.Field field, int i, FieldType fieldType, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field2) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        return new S(field, i, fieldType, null, null, 0, false, false, null, null, null, enumVerifier, field2);
    }

    public static S forProto2OptionalField(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i2)) {
            return new S(field, i, fieldType, null, field2, i2, false, z, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException(AbstractC3950lJ.p("presenceMask must have exactly one bit set: ", i2));
    }

    public static S forProto2RequiredField(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, Internal.EnumVerifier enumVerifier) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(field2, "presenceField");
        if (field2 == null || isExactlyOneBitSet(i2)) {
            return new S(field, i, fieldType, null, field2, i2, true, z, null, null, null, enumVerifier, null);
        }
        throw new IllegalArgumentException(AbstractC3950lJ.p("presenceMask must have exactly one bit set: ", i2));
    }

    public static S forRepeatedMessageField(java.lang.reflect.Field field, int i, FieldType fieldType, Class<?> cls) {
        checkFieldNumber(i);
        Internal.checkNotNull(field, "field");
        Internal.checkNotNull(fieldType, "fieldType");
        Internal.checkNotNull(cls, "messageClass");
        return new S(field, i, fieldType, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public static FieldInfo$Builder newBuilder() {
        return new FieldInfo$Builder(null);
    }

    public java.lang.reflect.Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public Internal.EnumVerifier getEnumVerifier() {
        return this.enumVerifier;
    }

    public java.lang.reflect.Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i = Q.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i == 1 || i == 2) {
            java.lang.reflect.Field field = this.field;
            return field != null ? field.getType() : this.oneofStoredType;
        }
        if (i == 3 || i == 4) {
            return this.messageClass;
        }
        return null;
    }

    public QS getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public java.lang.reflect.Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public FieldType getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    @Override // java.lang.Comparable
    public int compareTo(S s) {
        return this.fieldNumber - s.fieldNumber;
    }
}
