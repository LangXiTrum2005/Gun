package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class r implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f2772a = new r();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DiagnosticEventRequestOuterClass.DiagnosticEventsSeverity.forNumber(i) != null;
    }
}
