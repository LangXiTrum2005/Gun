package com.google.protobuf;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3396f00;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class A0 extends AbstractC2124k {
    ByteString.ByteIterator current = nextPiece();
    final C3396f00 pieces;
    final /* synthetic */ C0 this$0;

    public A0(C0 c0) {
        this.this$0 = c0;
        this.pieces = new C3396f00(c0, null);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.google.protobuf.ByteString$ByteIterator] */
    private ByteString.ByteIterator nextPiece() {
        if (this.pieces.hasNext()) {
            return this.pieces.next().iterator2();
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current != null;
    }

    @Override // com.google.protobuf.ByteString.ByteIterator
    public byte nextByte() {
        ByteString.ByteIterator byteIterator = this.current;
        if (byteIterator == null) {
            throw new NoSuchElementException();
        }
        byte bNextByte = byteIterator.nextByte();
        if (!this.current.hasNext()) {
            this.current = nextPiece();
        }
        return bNextByte;
    }
}
