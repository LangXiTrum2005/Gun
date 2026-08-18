package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class OT<K, V> extends AbstractC1787jM<K, V> {
    public int A00;

    @ParametricNullness
    public final K A01;
    public final /* synthetic */ C1887ky A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC1787jM, java.util.Map.Entry
    @ParametricNullness
    public final V getValue() {
        Map<K, V> mapA0h = this.A02.A0h();
        if (mapA0h != null) {
            return (V) AbstractC2036nT.A01(mapA0h.get(this.A01));
        }
        A00();
        return this.A00 == -1 ? (V) AbstractC2036nT.A00() : (V) this.A02.A0F(this.A00);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC1787jM, java.util.Map.Entry
    @ParametricNullness
    public final V setValue(@ParametricNullness V v) {
        Map<K, V> mapA0h = this.A02.A0h();
        if (mapA0h != null) {
            return (V) AbstractC2036nT.A01(mapA0h.put(this.A01, v));
        }
        A00();
        if (this.A00 == -1) {
            this.A02.put(this.A01, v);
            return (V) AbstractC2036nT.A00();
        }
        V v2 = (V) this.A02.A0F(this.A00);
        this.A02.A0R(this.A00, v);
        return v2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OT != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    public OT(C1887ky c1887ky, int i) {
        this.A02 = c1887ky;
        this.A01 = (K) c1887ky.A0E(i);
        this.A00 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OT != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    private void A00() {
        if (this.A00 != -1 && this.A00 < this.A02.size() && AbstractC0942Or.A01(this.A01, this.A02.A0E(this.A00))) {
            return;
        }
        this.A00 = this.A02.A07(this.A01);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OT != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    @Override // com.facebook.ads.redexgen.core.AbstractC1787jM, java.util.Map.Entry
    @ParametricNullness
    public final K getKey() {
        return this.A01;
    }
}
