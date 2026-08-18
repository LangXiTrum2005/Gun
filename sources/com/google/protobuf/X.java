package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC2556Kt;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class X {
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$FieldType$Collection;
    static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$JavaType;

    static {
        int[] iArr = new int[JavaType.values().length];
        $SwitchMap$com$google$protobuf$JavaType = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            $SwitchMap$com$google$protobuf$JavaType[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            $SwitchMap$com$google$protobuf$JavaType[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[EnumC2556Kt.values().length];
        $SwitchMap$com$google$protobuf$FieldType$Collection = iArr2;
        try {
            iArr2[EnumC2556Kt.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType$Collection[EnumC2556Kt.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            $SwitchMap$com$google$protobuf$FieldType$Collection[EnumC2556Kt.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
