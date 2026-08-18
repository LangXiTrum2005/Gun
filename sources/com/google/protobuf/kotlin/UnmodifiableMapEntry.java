package com.google.protobuf.kotlin;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class UnmodifiableMapEntry<K, V> implements Map.Entry<K, V> {
    private final /* synthetic */ Map.Entry<K, V> $$delegate_0;

    /* JADX WARN: Multi-variable type inference failed */
    public UnmodifiableMapEntry(Map.Entry<? extends K, ? extends V> entry) {
        AbstractC2995aW.q(entry, "delegate");
        this.$$delegate_0 = entry;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.$$delegate_0.getKey();
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.$$delegate_0.getValue();
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
