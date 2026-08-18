package com.google.protobuf.kotlin;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class UnmodifiableSet<E> extends UnmodifiableCollection<E> implements Set<E> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnmodifiableSet(Collection<? extends E> collection) {
        super(collection);
        AbstractC2995aW.q(collection, "delegate");
    }
}
