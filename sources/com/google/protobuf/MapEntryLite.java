package com.google.protobuf;

import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MapEntryLite<K, V> {
    private static final int KEY_FIELD_NUMBER = 1;
    private static final int VALUE_FIELD_NUMBER = 2;
    private final K key;
    private final C2135p0 metadata;
    private final V value;

    private MapEntryLite(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        this.metadata = new C2135p0(fieldType, k, fieldType2, v);
        this.key = k;
        this.value = v;
    }

    public static <K, V> int computeSerializedSize(C2135p0 c2135p0, K k, V v) {
        return W.computeElementSize(c2135p0.valueType, 2, v) + W.computeElementSize(c2135p0.keyType, 1, k);
    }

    public static <K, V> MapEntryLite<K, V> newDefaultInstance(WireFormat.FieldType fieldType, K k, WireFormat.FieldType fieldType2, V v) {
        return new MapEntryLite<>(fieldType, k, fieldType2, v);
    }

    public static <T> T parseField(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite, WireFormat.FieldType fieldType, T t) throws IOException {
        int i = AbstractC2133o0.$SwitchMap$com$google$protobuf$WireFormat$FieldType[fieldType.ordinal()];
        if (i == 1) {
            MessageLite.Builder builder = ((MessageLite) t).toBuilder();
            codedInputStream.readMessage(builder, extensionRegistryLite);
            return (T) builder.buildPartial();
        }
        if (i == 2) {
            return (T) Integer.valueOf(codedInputStream.readEnum());
        }
        if (i != 3) {
            return (T) W.readPrimitiveField(codedInputStream, fieldType, true);
        }
        throw new RuntimeException("Groups are not allowed in maps.");
    }

    public static <K, V> void writeTo(CodedOutputStream codedOutputStream, C2135p0 c2135p0, K k, V v) throws IOException {
        W.writeElement(codedOutputStream, c2135p0.keyType, 1, k);
        W.writeElement(codedOutputStream, c2135p0.valueType, 2, v);
    }

    public int computeMessageSize(int i, K k, V v) {
        return CodedOutputStream.computeLengthDelimitedFieldSize(computeSerializedSize(this.metadata, k, v)) + CodedOutputStream.computeTagSize(i);
    }

    public K getKey() {
        return this.key;
    }

    public C2135p0 getMetadata() {
        return this.metadata;
    }

    public V getValue() {
        return this.value;
    }

    public Map.Entry<K, V> parseEntry(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return parseEntry(byteString.newCodedInput(), this.metadata, extensionRegistryLite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void parseInto(MapFieldLite<K, V> mapFieldLite, CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
        C2135p0 c2135p0 = this.metadata;
        Object field = c2135p0.defaultKey;
        Object field2 = c2135p0.defaultValue;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, this.metadata.keyType.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, this.metadata.keyType, field);
            } else if (tag == WireFormat.makeTag(2, this.metadata.valueType.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, this.metadata.valueType, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        codedInputStream.checkLastTagWas(0);
        codedInputStream.popLimit(iPushLimit);
        mapFieldLite.put(field, field2);
    }

    public void serializeTo(CodedOutputStream codedOutputStream, int i, K k, V v) throws IOException {
        codedOutputStream.writeTag(i, 2);
        codedOutputStream.writeUInt32NoTag(computeSerializedSize(this.metadata, k, v));
        writeTo(codedOutputStream, this.metadata, k, v);
    }

    public static <K, V> Map.Entry<K, V> parseEntry(CodedInputStream codedInputStream, C2135p0 c2135p0, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        Object field = c2135p0.defaultKey;
        Object field2 = c2135p0.defaultValue;
        while (true) {
            int tag = codedInputStream.readTag();
            if (tag == 0) {
                break;
            }
            if (tag == WireFormat.makeTag(1, c2135p0.keyType.getWireType())) {
                field = parseField(codedInputStream, extensionRegistryLite, c2135p0.keyType, field);
            } else if (tag == WireFormat.makeTag(2, c2135p0.valueType.getWireType())) {
                field2 = parseField(codedInputStream, extensionRegistryLite, c2135p0.valueType, field2);
            } else if (!codedInputStream.skipField(tag)) {
                break;
            }
        }
        return new AbstractMap.SimpleImmutableEntry(field, field2);
    }

    private MapEntryLite(C2135p0 c2135p0, K k, V v) {
        this.metadata = c2135p0;
        this.key = k;
        this.value = v;
    }
}
