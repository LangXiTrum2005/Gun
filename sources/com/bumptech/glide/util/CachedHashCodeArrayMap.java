package com.bumptech.glide.util;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* JADX INFO: loaded from: classes.dex */
public final class CachedHashCodeArrayMap<K, V> extends ArrayMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f221a;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.f221a = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.f221a == 0) {
            this.f221a = super.hashCode();
        }
        return this.f221a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f221a = 0;
        return super.put(obj, obj2);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(SimpleArrayMap simpleArrayMap) {
        this.f221a = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final Object removeAt(int i) {
        this.f221a = 0;
        return super.removeAt(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.SimpleArrayMap
    public final Object setValueAt(int i, Object obj) {
        this.f221a = 0;
        return super.setValueAt(i, obj);
    }
}
