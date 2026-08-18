package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class Q {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType;

    static {
        int[] iArr = new int[FieldType.values().length];
        $SwitchMap$com$google$protobuf$FieldType = iArr;
        try {
            iArr[FieldType.MESSAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType[FieldType.MESSAGE_LIST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType[FieldType.GROUP_LIST.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
