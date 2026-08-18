package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AX;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4754uW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3578h30;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3642hm0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class K extends AbstractC3913kt {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public int extensionNumber(Map.Entry<?, ?> entry) {
        return ((C2107b0) entry.getKey()).getNumber();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public Object findExtensionByNumber(ExtensionRegistryLite extensionRegistryLite, MessageLite messageLite, int i) {
        return extensionRegistryLite.findLiteExtensionByNumber(messageLite, i);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public W getExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).extensions;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public W getMutableExtensions(Object obj) {
        return ((GeneratedMessageLite.ExtendableMessage) obj).ensureExtensionsAreMutable();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public boolean hasExtensions(MessageLite messageLite) {
        return messageLite instanceof GeneratedMessageLite.ExtendableMessage;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public void makeImmutable(Object obj) {
        getExtensions(obj).makeImmutable();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public <UT, UB> UB parseExtension(Object obj, AX ax, Object obj2, ExtensionRegistryLite extensionRegistryLite, W w, UB ub, O0 o0) throws IOException {
        Object objValueOf;
        Object field;
        ArrayList arrayList;
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj2;
        int number = generatedExtension.getNumber();
        if (generatedExtension.descriptor.isRepeated() && generatedExtension.descriptor.isPacked()) {
            switch (J.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    ((C2139s) ax).readEnumList(arrayList);
                    ub = (UB) D0.filterUnknownEnumList(obj, number, arrayList, generatedExtension.descriptor.getEnumType(), ub, o0);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + generatedExtension.descriptor.getLiteType());
            }
            w.setField(generatedExtension.descriptor, arrayList);
        } else {
            if (generatedExtension.getLiteType() != WireFormat.FieldType.ENUM) {
                switch (J.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()]) {
                    case 1:
                        objValueOf = Double.valueOf(((C2139s) ax).readDouble());
                        break;
                    case 2:
                        objValueOf = Float.valueOf(((C2139s) ax).readFloat());
                        break;
                    case 3:
                        objValueOf = Long.valueOf(((C2139s) ax).readInt64());
                        break;
                    case 4:
                        objValueOf = Long.valueOf(((C2139s) ax).readUInt64());
                        break;
                    case 5:
                        objValueOf = Integer.valueOf(((C2139s) ax).readInt32());
                        break;
                    case 6:
                        objValueOf = Long.valueOf(((C2139s) ax).readFixed64());
                        break;
                    case 7:
                        objValueOf = Integer.valueOf(((C2139s) ax).readFixed32());
                        break;
                    case 8:
                        objValueOf = Boolean.valueOf(((C2139s) ax).readBool());
                        break;
                    case 9:
                        objValueOf = Integer.valueOf(((C2139s) ax).readUInt32());
                        break;
                    case 10:
                        objValueOf = Integer.valueOf(((C2139s) ax).readSFixed32());
                        break;
                    case 11:
                        objValueOf = Long.valueOf(((C2139s) ax).readSFixed64());
                        break;
                    case 12:
                        objValueOf = Integer.valueOf(((C2139s) ax).readSInt32());
                        break;
                    case 13:
                        objValueOf = Long.valueOf(((C2139s) ax).readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        objValueOf = ((C2139s) ax).readBytes();
                        break;
                    case 16:
                        objValueOf = ((C2139s) ax).readString();
                        break;
                    case 17:
                        if (!generatedExtension.isRepeated()) {
                            Object field2 = w.getField(generatedExtension.descriptor);
                            if (field2 instanceof GeneratedMessageLite) {
                                InterfaceC3578h30 interfaceC3578h30SchemaFor = C4754uW.getInstance().schemaFor(field2);
                                if (!((GeneratedMessageLite) field2).isMutable()) {
                                    Object objNewInstance = interfaceC3578h30SchemaFor.newInstance();
                                    interfaceC3578h30SchemaFor.mergeFrom(objNewInstance, field2);
                                    w.setField(generatedExtension.descriptor, objNewInstance);
                                    field2 = objNewInstance;
                                }
                                ((C2139s) ax).mergeGroupField(field2, interfaceC3578h30SchemaFor, extensionRegistryLite);
                                return ub;
                            }
                        }
                        objValueOf = ((C2139s) ax).readGroup(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    case 18:
                        if (!generatedExtension.isRepeated()) {
                            Object field3 = w.getField(generatedExtension.descriptor);
                            if (field3 instanceof GeneratedMessageLite) {
                                InterfaceC3578h30 interfaceC3578h30SchemaFor2 = C4754uW.getInstance().schemaFor(field3);
                                if (!((GeneratedMessageLite) field3).isMutable()) {
                                    Object objNewInstance2 = interfaceC3578h30SchemaFor2.newInstance();
                                    interfaceC3578h30SchemaFor2.mergeFrom(objNewInstance2, field3);
                                    w.setField(generatedExtension.descriptor, objNewInstance2);
                                    field3 = objNewInstance2;
                                }
                                ((C2139s) ax).mergeMessageField(field3, interfaceC3578h30SchemaFor2, extensionRegistryLite);
                                return ub;
                            }
                        }
                        objValueOf = ((C2139s) ax).readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite);
                        break;
                    default:
                        objValueOf = null;
                        break;
                }
            } else {
                int int32 = ((C2139s) ax).readInt32();
                if (generatedExtension.descriptor.getEnumType().findValueByNumber(int32) == null) {
                    return (UB) D0.storeUnknownEnum(obj, number, int32, ub, o0);
                }
                objValueOf = Integer.valueOf(int32);
            }
            if (generatedExtension.isRepeated()) {
                w.addRepeatedField(generatedExtension.descriptor, objValueOf);
            } else {
                int i = J.$SwitchMap$com$google$protobuf$WireFormat$FieldType[generatedExtension.getLiteType().ordinal()];
                if ((i == 17 || i == 18) && (field = w.getField(generatedExtension.descriptor)) != null) {
                    objValueOf = Internal.mergeMessage(field, objValueOf);
                }
                w.setField(generatedExtension.descriptor, objValueOf);
            }
        }
        return ub;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public void parseLengthPrefixedMessageSetItem(AX ax, Object obj, ExtensionRegistryLite extensionRegistryLite, W w) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        w.setField(generatedExtension.descriptor, ((C2139s) ax).readMessage(generatedExtension.getMessageDefaultInstance().getClass(), extensionRegistryLite));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public void parseMessageSetItem(ByteString byteString, Object obj, ExtensionRegistryLite extensionRegistryLite, W w) throws IOException {
        GeneratedMessageLite.GeneratedExtension generatedExtension = (GeneratedMessageLite.GeneratedExtension) obj;
        MessageLite.Builder builderNewBuilderForType = generatedExtension.getMessageDefaultInstance().newBuilderForType();
        CodedInputStream codedInputStreamNewCodedInput = byteString.newCodedInput();
        builderNewBuilderForType.mergeFrom(codedInputStreamNewCodedInput, extensionRegistryLite);
        w.setField(generatedExtension.descriptor, builderNewBuilderForType.buildPartial());
        codedInputStreamNewCodedInput.checkLastTagWas(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public void serializeExtension(InterfaceC3642hm0 interfaceC3642hm0, Map.Entry<?, ?> entry) throws IOException {
        C2107b0 c2107b0 = (C2107b0) entry.getKey();
        if (c2107b0.isRepeated()) {
            switch (J.$SwitchMap$com$google$protobuf$WireFormat$FieldType[c2107b0.getLiteType().ordinal()]) {
                case 1:
                    D0.writeDoubleList(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 2:
                    D0.writeFloatList(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 3:
                    D0.writeInt64List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 4:
                    D0.writeUInt64List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 5:
                    D0.writeInt32List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 6:
                    D0.writeFixed64List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 7:
                    D0.writeFixed32List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 8:
                    D0.writeBoolList(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 9:
                    D0.writeUInt32List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 10:
                    D0.writeSFixed32List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 11:
                    D0.writeSFixed64List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 12:
                    D0.writeSInt32List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 13:
                    D0.writeSInt64List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 14:
                    D0.writeInt32List(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, c2107b0.isPacked());
                    break;
                case 15:
                    D0.writeBytesList(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0);
                    break;
                case 16:
                    D0.writeStringList(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0);
                    break;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        D0.writeGroupList(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, C4754uW.getInstance().schemaFor((Class) list.get(0).getClass()));
                        break;
                    }
                    break;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        D0.writeMessageList(c2107b0.getNumber(), (List) entry.getValue(), interfaceC3642hm0, C4754uW.getInstance().schemaFor((Class) list2.get(0).getClass()));
                        break;
                    }
                    break;
            }
        }
        switch (J.$SwitchMap$com$google$protobuf$WireFormat$FieldType[c2107b0.getLiteType().ordinal()]) {
            case 1:
                ((A) interfaceC3642hm0).writeDouble(c2107b0.getNumber(), ((Double) entry.getValue()).doubleValue());
                break;
            case 2:
                ((A) interfaceC3642hm0).writeFloat(c2107b0.getNumber(), ((Float) entry.getValue()).floatValue());
                break;
            case 3:
                ((A) interfaceC3642hm0).writeInt64(c2107b0.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 4:
                ((A) interfaceC3642hm0).writeUInt64(c2107b0.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 5:
                ((A) interfaceC3642hm0).writeInt32(c2107b0.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 6:
                ((A) interfaceC3642hm0).writeFixed64(c2107b0.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 7:
                ((A) interfaceC3642hm0).writeFixed32(c2107b0.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 8:
                ((A) interfaceC3642hm0).writeBool(c2107b0.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                break;
            case 9:
                ((A) interfaceC3642hm0).writeUInt32(c2107b0.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 10:
                ((A) interfaceC3642hm0).writeSFixed32(c2107b0.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 11:
                ((A) interfaceC3642hm0).writeSFixed64(c2107b0.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 12:
                ((A) interfaceC3642hm0).writeSInt32(c2107b0.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                ((A) interfaceC3642hm0).writeSInt64(c2107b0.getNumber(), ((Long) entry.getValue()).longValue());
                break;
            case 14:
                ((A) interfaceC3642hm0).writeInt32(c2107b0.getNumber(), ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                ((A) interfaceC3642hm0).writeBytes(c2107b0.getNumber(), (ByteString) entry.getValue());
                break;
            case 16:
                ((A) interfaceC3642hm0).writeString(c2107b0.getNumber(), (String) entry.getValue());
                break;
            case 17:
                ((A) interfaceC3642hm0).writeGroup(c2107b0.getNumber(), entry.getValue(), C4754uW.getInstance().schemaFor((Class) entry.getValue().getClass()));
                break;
            case 18:
                ((A) interfaceC3642hm0).writeMessage(c2107b0.getNumber(), entry.getValue(), C4754uW.getInstance().schemaFor((Class) entry.getValue().getClass()));
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3913kt
    public void setExtensions(Object obj, W w) {
        ((GeneratedMessageLite.ExtendableMessage) obj).extensions = w;
    }
}
