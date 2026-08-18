package com.google.protobuf.kotlin;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class UnmodifiableListIterator<E> implements ListIterator<E> {
    private final /* synthetic */ ListIterator<E> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableListIterator(ListIterator<? extends E> listIterator) {
        AbstractC2995aW.q(listIterator, "delegate");
        this.$$delegate_0 = listIterator;
    }

    @Override // java.util.ListIterator
    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.$$delegate_0.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.$$delegate_0.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        return this.$$delegate_0.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.$$delegate_0.nextIndex();
    }

    @Override // java.util.ListIterator
    public E previous() {
        return this.$$delegate_0.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.$$delegate_0.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
