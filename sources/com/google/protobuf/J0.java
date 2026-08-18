package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public final class J0 implements Internal.EnumVerifier {
    static final Internal.EnumVerifier INSTANCE = new J0();

    private J0() {
    }

    @Override // com.google.protobuf.Internal.EnumVerifier
    public boolean isInRange(int i) {
        return Syntax.forNumber(i) != null;
    }
}
