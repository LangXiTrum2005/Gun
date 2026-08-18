package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class E implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f2759a = new E();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return OperativeEventRequestOuterClass.OperativeEventErrorType.forNumber(i) != null;
    }
}
