package gatewayprotocol.v1;

import com.google.protobuf.Internal;

/* JADX INFO: loaded from: classes4.dex */
public final class z implements Internal.ListAdapter.Converter {
    @Override // com.google.protobuf.Internal.ListAdapter.Converter
    public final Object convert(Object obj) {
        InitializationResponseOuterClass.AdFormat adFormatForNumber = InitializationResponseOuterClass.AdFormat.forNumber(((Integer) obj).intValue());
        return adFormatForNumber == null ? InitializationResponseOuterClass.AdFormat.UNRECOGNIZED : adFormatForNumber;
    }
}
