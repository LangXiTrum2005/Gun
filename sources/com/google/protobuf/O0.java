package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3642hm0;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class O0 {
    public abstract void addFixed32(Object obj, int i, int i2);

    public abstract void addFixed64(Object obj, int i, long j);

    public abstract void addGroup(Object obj, int i, Object obj2);

    public abstract void addLengthDelimited(Object obj, int i, ByteString byteString);

    public abstract void addVarint(Object obj, int i, long j);

    public abstract Object getBuilderFromMessage(Object obj);

    public abstract Object getFromMessage(Object obj);

    public abstract int getSerializedSize(Object obj);

    public abstract int getSerializedSizeAsMessageSet(Object obj);

    public abstract void makeImmutable(Object obj);

    public abstract Object merge(Object obj, Object obj2);

    public final void mergeFrom(Object obj, AX ax) throws IOException {
        C2139s c2139s;
        do {
            c2139s = (C2139s) ax;
            if (c2139s.getFieldNumber() == Integer.MAX_VALUE) {
                return;
            }
        } while (mergeOneFieldFrom(obj, c2139s));
    }

    public final boolean mergeOneFieldFrom(Object obj, AX ax) throws IOException {
        C2139s c2139s = (C2139s) ax;
        int tag = c2139s.getTag();
        int tagFieldNumber = WireFormat.getTagFieldNumber(tag);
        int tagWireType = WireFormat.getTagWireType(tag);
        if (tagWireType == 0) {
            addVarint(obj, tagFieldNumber, c2139s.readInt64());
            return true;
        }
        if (tagWireType == 1) {
            addFixed64(obj, tagFieldNumber, c2139s.readFixed64());
            return true;
        }
        if (tagWireType == 2) {
            addLengthDelimited(obj, tagFieldNumber, c2139s.readBytes());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            addFixed32(obj, tagFieldNumber, c2139s.readFixed32());
            return true;
        }
        Object objNewBuilder = newBuilder();
        int iMakeTag = WireFormat.makeTag(tagFieldNumber, 4);
        mergeFrom(objNewBuilder, c2139s);
        if (iMakeTag != c2139s.getTag()) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        addGroup(obj, tagFieldNumber, toImmutable(objNewBuilder));
        return true;
    }

    public abstract Object newBuilder();

    public abstract void setBuilderToMessage(Object obj, Object obj2);

    public abstract void setToMessage(Object obj, Object obj2);

    public abstract boolean shouldDiscardUnknownFields(AX ax);

    public abstract Object toImmutable(Object obj);

    public abstract void writeAsMessageSetTo(Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException;

    public abstract void writeTo(Object obj, InterfaceC3642hm0 interfaceC3642hm0) throws IOException;
}
