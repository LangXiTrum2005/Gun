package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f2768a = new l();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return DiagnosticEventRequestOuterClass.DiagnosticAdType.forNumber(i) != null;
    }
}
