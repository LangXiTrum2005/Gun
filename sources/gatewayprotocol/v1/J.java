package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class J implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i) {
        return TransactionEventRequestOuterClass.TransactionState.forNumber(i);
    }
}
