package com.vungle.ads.internal.protos;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Parser;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5071y30;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class Sdk$SDKMetric extends GeneratedMessageLite<Sdk$SDKMetric, C5071y30> implements C30 {
    public static final int ADSOURCE_FIELD_NUMBER = 16;
    public static final int CONNECTIONTYPEDETAIL_FIELD_NUMBER = 9;
    public static final int CONNECTIONTYPE_FIELD_NUMBER = 8;
    public static final int CREATIVEID_FIELD_NUMBER = 11;
    private static final Sdk$SDKMetric DEFAULT_INSTANCE;
    public static final int EVENTID_FIELD_NUMBER = 12;
    public static final int ISHBPLACEMENT_FIELD_NUMBER = 14;
    public static final int ISLOWDATAMODEENABLED_FIELD_NUMBER = 201;
    public static final int MAKE_FIELD_NUMBER = 4;
    public static final int META_FIELD_NUMBER = 3;
    public static final int MODEL_FIELD_NUMBER = 5;
    public static final int OSVERSION_FIELD_NUMBER = 7;
    public static final int OS_FIELD_NUMBER = 6;
    private static volatile Parser<Sdk$SDKMetric> PARSER = null;
    public static final int PLACEMENTREFERENCEID_FIELD_NUMBER = 10;
    public static final int PLACEMENTTYPE_FIELD_NUMBER = 15;
    public static final int SESSIONID_FIELD_NUMBER = 13;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private long isHbPlacement_;
    private boolean isLowDataModeEnabled_;
    private int type_;
    private long value_;
    private String meta_ = "";
    private String make_ = "";
    private String model_ = "";
    private String os_ = "";
    private String osVersion_ = "";
    private String connectionType_ = "";
    private String connectionTypeDetail_ = "";
    private String placementReferenceId_ = "";
    private String creativeId_ = "";
    private String eventId_ = "";
    private String sessionId_ = "";
    private String placementType_ = "";
    private String adSource_ = "";

    static {
        Sdk$SDKMetric sdk$SDKMetric = new Sdk$SDKMetric();
        DEFAULT_INSTANCE = sdk$SDKMetric;
        GeneratedMessageLite.registerDefaultInstance(Sdk$SDKMetric.class, sdk$SDKMetric);
    }

    private Sdk$SDKMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdSource() {
        this.adSource_ = getDefaultInstance().getAdSource();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionType() {
        this.connectionType_ = getDefaultInstance().getConnectionType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectionTypeDetail() {
        this.connectionTypeDetail_ = getDefaultInstance().getConnectionTypeDetail();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCreativeId() {
        this.creativeId_ = getDefaultInstance().getCreativeId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEventId() {
        this.eventId_ = getDefaultInstance().getEventId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsHbPlacement() {
        this.isHbPlacement_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsLowDataModeEnabled() {
        this.isLowDataModeEnabled_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMake() {
        this.make_ = getDefaultInstance().getMake();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeta() {
        this.meta_ = getDefaultInstance().getMeta();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModel() {
        this.model_ = getDefaultInstance().getModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.os_ = getDefaultInstance().getOs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOsVersion() {
        this.osVersion_ = getDefaultInstance().getOsVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementReferenceId() {
        this.placementReferenceId_ = getDefaultInstance().getPlacementReferenceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlacementType() {
        this.placementType_ = getDefaultInstance().getPlacementType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0L;
    }

    public static Sdk$SDKMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5071y30 newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sdk$SDKMetric> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdSource(String str) {
        str.getClass();
        this.adSource_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdSourceBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.adSource_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionType(String str) {
        str.getClass();
        this.connectionType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.connectionType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetail(String str) {
        str.getClass();
        this.connectionTypeDetail_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectionTypeDetailBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.connectionTypeDetail_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeId(String str) {
        str.getClass();
        this.creativeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCreativeIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.creativeId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsHbPlacement(long j) {
        this.isHbPlacement_ = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsLowDataModeEnabled(boolean z) {
        this.isLowDataModeEnabled_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMake(String str) {
        str.getClass();
        this.make_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMakeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.make_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeta(String str) {
        str.getClass();
        this.meta_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetaBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.meta_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModel(String str) {
        str.getClass();
        this.model_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModelBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.model_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(String str) {
        str.getClass();
        this.os_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.os_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersion(String str) {
        str.getClass();
        this.osVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOsVersionBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.osVersion_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceId(String str) {
        str.getClass();
        this.placementReferenceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementReferenceIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.placementReferenceId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementType(String str) {
        str.getClass();
        this.placementType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlacementTypeBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.placementType_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.sessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(B30 b30) {
        this.type_ = b30.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        a aVar = null;
        switch (a.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Sdk$SDKMetric();
            case 2:
                return new C5071y30(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0011\u0000\u0000\u0001É\u0011\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ\fȈ\rȈ\u000e\u0002\u000fȈ\u0010ȈÉ\u0007", new Object[]{"type_", "value_", "meta_", "make_", "model_", "os_", "osVersion_", "connectionType_", "connectionTypeDetail_", "placementReferenceId_", "creativeId_", "eventId_", "sessionId_", "isHbPlacement_", "placementType_", "adSource_", "isLowDataModeEnabled_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sdk$SDKMetric> defaultInstanceBasedParser = PARSER;
                if (defaultInstanceBasedParser == null) {
                    synchronized (Sdk$SDKMetric.class) {
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getAdSource() {
        return this.adSource_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getAdSourceBytes() {
        return ByteString.copyFromUtf8(this.adSource_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getConnectionType() {
        return this.connectionType_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getConnectionTypeBytes() {
        return ByteString.copyFromUtf8(this.connectionType_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getConnectionTypeDetail() {
        return this.connectionTypeDetail_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getConnectionTypeDetailBytes() {
        return ByteString.copyFromUtf8(this.connectionTypeDetail_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getCreativeId() {
        return this.creativeId_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getCreativeIdBytes() {
        return ByteString.copyFromUtf8(this.creativeId_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getEventId() {
        return this.eventId_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getEventIdBytes() {
        return ByteString.copyFromUtf8(this.eventId_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public long getIsHbPlacement() {
        return this.isHbPlacement_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public boolean getIsLowDataModeEnabled() {
        return this.isLowDataModeEnabled_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getMake() {
        return this.make_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getMakeBytes() {
        return ByteString.copyFromUtf8(this.make_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getMeta() {
        return this.meta_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getMetaBytes() {
        return ByteString.copyFromUtf8(this.meta_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getModel() {
        return this.model_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getModelBytes() {
        return ByteString.copyFromUtf8(this.model_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getOs() {
        return this.os_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getOsBytes() {
        return ByteString.copyFromUtf8(this.os_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getOsVersion() {
        return this.osVersion_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getOsVersionBytes() {
        return ByteString.copyFromUtf8(this.osVersion_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getPlacementReferenceId() {
        return this.placementReferenceId_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getPlacementReferenceIdBytes() {
        return ByteString.copyFromUtf8(this.placementReferenceId_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getPlacementType() {
        return this.placementType_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getPlacementTypeBytes() {
        return ByteString.copyFromUtf8(this.placementType_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public String getSessionId() {
        return this.sessionId_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public ByteString getSessionIdBytes() {
        return ByteString.copyFromUtf8(this.sessionId_);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public B30 getType() {
        B30 b30ForNumber = B30.forNumber(this.type_);
        return b30ForNumber == null ? B30.UNRECOGNIZED : b30ForNumber;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public int getTypeValue() {
        return this.type_;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C30
    public long getValue() {
        return this.value_;
    }

    public static C5071y30 newBuilder(Sdk$SDKMetric sdk$SDKMetric) {
        return DEFAULT_INSTANCE.createBuilder(sdk$SDKMetric);
    }

    public static Sdk$SDKMetric parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Sdk$SDKMetric parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sdk$SDKMetric parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sdk$SDKMetric parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sdk$SDKMetric parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sdk$SDKMetric parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (Sdk$SDKMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
