package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3354ea0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StructuralMessageInfo$Builder {
    private int[] checkInitialized;
    private Object defaultInstance;
    private final List<S> fields;
    private boolean messageSetWireFormat;
    private ProtoSyntax syntax;
    private boolean wasBuilt;

    public StructuralMessageInfo$Builder() {
        this.checkInitialized = null;
        this.fields = new ArrayList();
    }

    public C3354ea0 build() {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        if (this.syntax == null) {
            throw new IllegalStateException("Must specify a proto syntax");
        }
        this.wasBuilt = true;
        Collections.sort(this.fields);
        return new C3354ea0(this.syntax, this.messageSetWireFormat, this.checkInitialized, (S[]) this.fields.toArray(new S[0]), this.defaultInstance);
    }

    public void withCheckInitialized(int[] iArr) {
        this.checkInitialized = iArr;
    }

    public void withDefaultInstance(Object obj) {
        this.defaultInstance = obj;
    }

    public void withField(S s) {
        if (this.wasBuilt) {
            throw new IllegalStateException("Builder can only build once");
        }
        this.fields.add(s);
    }

    public void withMessageSetWireFormat(boolean z) {
        this.messageSetWireFormat = z;
    }

    public void withSyntax(ProtoSyntax protoSyntax) {
        this.syntax = (ProtoSyntax) Internal.checkNotNull(protoSyntax, "syntax");
    }

    public StructuralMessageInfo$Builder(int i) {
        this.checkInitialized = null;
        this.fields = new ArrayList(i);
    }
}
