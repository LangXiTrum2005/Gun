package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class P implements Internal.EnumVerifier {
    static final Internal.EnumVerifier INSTANCE = new P();

    private P() {
    }

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i) {
        return Field.Kind.forNumber(i) != null;
    }
}
