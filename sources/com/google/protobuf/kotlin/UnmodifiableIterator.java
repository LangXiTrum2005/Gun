package com.google.protobuf.kotlin;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class UnmodifiableIterator<E> implements Iterator<E> {
    private final /* synthetic */ Iterator<E> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableIterator(Iterator<? extends E> it) {
        AbstractC2995aW.q(it, "delegate");
        this.$$delegate_0 = it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.Iterator
    public E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
