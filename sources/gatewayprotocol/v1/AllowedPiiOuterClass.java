package gatewayprotocol.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Q3;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class AllowedPiiOuterClass {

    public static final class AllowedPii extends GeneratedMessageLite<AllowedPii, Builder> implements AllowedPiiOrBuilder {
        private static final AllowedPii DEFAULT_INSTANCE;
        public static final int IDFA_FIELD_NUMBER = 1;
        public static final int IDFV_FIELD_NUMBER = 2;
        private static volatile Parser<AllowedPii> PARSER;
        private boolean idfa_;
        private boolean idfv_;

        public static final class Builder extends GeneratedMessageLite.Builder<AllowedPii, Builder> implements AllowedPiiOrBuilder {
            public /* synthetic */ Builder(Q3 q3) {
                this();
            }

            public Builder clearIdfa() {
                copyOnWrite();
                ((AllowedPii) this.instance).clearIdfa();
                return this;
            }

            public Builder clearIdfv() {
                copyOnWrite();
                ((AllowedPii) this.instance).clearIdfv();
                return this;
            }

            @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
            public boolean getIdfa() {
                return ((AllowedPii) this.instance).getIdfa();
            }

            @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
            public boolean getIdfv() {
                return ((AllowedPii) this.instance).getIdfv();
            }

            public Builder setIdfa(boolean z) {
                copyOnWrite();
                ((AllowedPii) this.instance).setIdfa(z);
                return this;
            }

            public Builder setIdfv(boolean z) {
                copyOnWrite();
                ((AllowedPii) this.instance).setIdfv(z);
                return this;
            }

            private Builder() {
                super(AllowedPii.DEFAULT_INSTANCE);
            }
        }

        static {
            AllowedPii allowedPii = new AllowedPii();
            DEFAULT_INSTANCE = allowedPii;
            GeneratedMessageLite.registerDefaultInstance(AllowedPii.class, allowedPii);
        }

        private AllowedPii() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfa() {
            this.idfa_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIdfv() {
            this.idfv_ = false;
        }

        public static AllowedPii getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static AllowedPii parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AllowedPii parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<AllowedPii> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfa(boolean z) {
            this.idfa_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIdfv(boolean z) {
            this.idfv_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Q3 q3 = null;
            switch (Q3.f3587a[methodToInvoke.ordinal()]) {
                case 1:
                    return new AllowedPii();
                case 2:
                    return new Builder(q3);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"idfa_", "idfv_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<AllowedPii> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (AllowedPii.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
        public boolean getIdfa() {
            return this.idfa_;
        }

        @Override // gatewayprotocol.v1.AllowedPiiOuterClass.AllowedPiiOrBuilder
        public boolean getIdfv() {
            return this.idfv_;
        }

        public static Builder newBuilder(AllowedPii allowedPii) {
            return DEFAULT_INSTANCE.createBuilder(allowedPii);
        }

        public static AllowedPii parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static AllowedPii parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static AllowedPii parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(InputStream inputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static AllowedPii parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static AllowedPii parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static AllowedPii parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (AllowedPii) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface AllowedPiiOrBuilder extends MessageLiteOrBuilder {
        boolean getIdfa();

        boolean getIdfv();
    }

    private AllowedPiiOuterClass() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
