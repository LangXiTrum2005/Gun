package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.QS;

/* JADX INFO: loaded from: classes3.dex */
public final class FieldInfo$Builder {
    private java.lang.reflect.Field cachedSizeField;
    private boolean enforceUtf8;
    private Internal.EnumVerifier enumVerifier;
    private java.lang.reflect.Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private QS oneof;
    private Class<?> oneofStoredType;
    private java.lang.reflect.Field presenceField;
    private int presenceMask;
    private boolean required;
    private FieldType type;

    private FieldInfo$Builder() {
    }

    public /* synthetic */ FieldInfo$Builder(Q q) {
        this();
    }

    public S build() {
        QS qs = this.oneof;
        if (qs != null) {
            return S.forOneofMemberField(this.fieldNumber, this.type, qs, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
        }
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            return S.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
        }
        java.lang.reflect.Field field = this.presenceField;
        if (field != null) {
            return this.required ? S.forProto2RequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier) : S.forProto2OptionalField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
        }
        Internal.EnumVerifier enumVerifier = this.enumVerifier;
        if (enumVerifier != null) {
            java.lang.reflect.Field field2 = this.cachedSizeField;
            return field2 == null ? S.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier) : S.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, enumVerifier, field2);
        }
        java.lang.reflect.Field field3 = this.cachedSizeField;
        return field3 == null ? S.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8) : S.forPackedField(this.field, this.fieldNumber, this.type, field3);
    }

    public FieldInfo$Builder withCachedSizeField(java.lang.reflect.Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public FieldInfo$Builder withEnforceUtf8(boolean z) {
        this.enforceUtf8 = z;
        return this;
    }

    public FieldInfo$Builder withEnumVerifier(Internal.EnumVerifier enumVerifier) {
        this.enumVerifier = enumVerifier;
        return this;
    }

    public FieldInfo$Builder withField(java.lang.reflect.Field field) {
        if (this.oneof != null) {
            throw new IllegalStateException("Cannot set field when building a oneof.");
        }
        this.field = field;
        return this;
    }

    public FieldInfo$Builder withFieldNumber(int i) {
        this.fieldNumber = i;
        return this;
    }

    public FieldInfo$Builder withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public FieldInfo$Builder withOneof(QS qs, Class<?> cls) {
        if (this.field != null || this.presenceField != null) {
            throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
        }
        this.oneof = qs;
        this.oneofStoredType = cls;
        return this;
    }

    public FieldInfo$Builder withPresence(java.lang.reflect.Field field, int i) {
        this.presenceField = (java.lang.reflect.Field) Internal.checkNotNull(field, "presenceField");
        this.presenceMask = i;
        return this;
    }

    public FieldInfo$Builder withRequired(boolean z) {
        this.required = z;
        return this;
    }

    public FieldInfo$Builder withType(FieldType fieldType) {
        this.type = fieldType;
        return this;
    }
}
