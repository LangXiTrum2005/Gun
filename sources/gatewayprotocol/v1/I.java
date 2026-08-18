package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class I implements Internal.EnumVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I f2761a = new I();

    @Override // com.google.protobuf.Internal.EnumVerifier
    public final boolean isInRange(int i) {
        return TransactionEventRequestOuterClass.StoreType.forNumber(i) != null;
    }
}
