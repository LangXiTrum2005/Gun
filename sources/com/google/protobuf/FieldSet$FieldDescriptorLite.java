package com.google.protobuf;

import com.google.protobuf.FieldSet$FieldDescriptorLite;

/* JADX INFO: loaded from: classes3.dex */
public interface FieldSet$FieldDescriptorLite<T extends FieldSet$FieldDescriptorLite<T>> extends Comparable<T> {
    Internal.EnumLiteMap<?> getEnumType();

    WireFormat.JavaType getLiteJavaType();

    WireFormat.FieldType getLiteType();

    int getNumber();

    MessageLite.Builder internalMergeFrom(MessageLite.Builder builder, MessageLite messageLite);

    boolean isPacked();

    boolean isRepeated();
}
