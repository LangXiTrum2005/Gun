package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class N implements Internal.EnumVerifier {
    static final Internal.EnumVerifier INSTANCE = new N();

    private N() {
    }

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i) {
        return Field.Cardinality.forNumber(i) != null;
    }
}
