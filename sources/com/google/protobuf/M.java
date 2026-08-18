package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public Field.Cardinality findValueByNumber(int i) {
        return Field.Cardinality.forNumber(i);
    }
}
