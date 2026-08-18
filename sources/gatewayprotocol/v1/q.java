package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements Internal.EnumLiteMap {
    @Override // com.google.protobuf.Internal.EnumLiteMap
    public final Internal.EnumLite findValueByNumber(int i) {
        return DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(i);
    }
}
