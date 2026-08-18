package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final enum Y0 extends WireFormat.FieldType {
    public Y0(String str, int i, WireFormat.JavaType javaType, int i2) {
        super(str, i, javaType, i2, null);
    }

    @Override // com.google.protobuf.WireFormat.FieldType
    public boolean isPackable() {
        return false;
    }
}
