package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class O2<K, V> extends AbstractC2059nt<Map.Entry<K, V>> {
    public abstract Map<K, V> A00();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2059nt, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c) {
        try {
            return super.removeAll((Collection) AbstractC1718iD.A04(c));
        } catch (UnsupportedOperationException unused) {
            return AbstractC2062nx.A0B(this, c.iterator());
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC2059nt, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c) {
        try {
            return super.retainAll((Collection) AbstractC1718iD.A04(c));
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetA06 = AbstractC2062nx.A06(c.size());
            for (Object obj : c) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSetA06.add(((Map.Entry) obj).getKey());
                }
            }
            return A00().keySet().retainAll(hashSetA06);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.O2 != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.O2 != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return A00().isEmpty();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.O2 != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return A00().size();
    }
}
