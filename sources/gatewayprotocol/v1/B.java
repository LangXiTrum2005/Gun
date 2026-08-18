package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class B implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        DiagnosticEventRequestOuterClass.DiagnosticEventType diagnosticEventTypeForNumber = DiagnosticEventRequestOuterClass.DiagnosticEventType.forNumber(((Integer) obj).intValue());
        return diagnosticEventTypeForNumber == null ? DiagnosticEventRequestOuterClass.DiagnosticEventType.UNRECOGNIZED : diagnosticEventTypeForNumber;
    }
}
