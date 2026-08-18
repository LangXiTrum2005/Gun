package com.google.protobuf.kotlin;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.BF;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public class UnmodifiableCollection<E> implements Collection<E> {
    private final Collection<E> delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableCollection(Collection<? extends E> collection) {
        AbstractC2995aW.q(collection, "delegate");
        this.delegate = collection;
    }

    @Override // java.util.Collection
    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(E e) {
        return this.delegate.contains(e);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection<? extends Object> collection) {
        AbstractC2995aW.q(collection, "elements");
        return this.delegate.containsAll(collection);
    }

    public int getSize() {
        return this.delegate.size();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new UnmodifiableIterator(this.delegate.iterator());
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return BF.r(this);
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        AbstractC2995aW.q(tArr, "array");
        return (T[]) BF.s(this, tArr);
    }
}
