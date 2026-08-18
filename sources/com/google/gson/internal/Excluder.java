package com.google.gson.internal;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Excluder implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f848a = Collections.emptyList();
    public final List b = Collections.emptyList();

    static {
        new Excluder();
    }

    public final Object clone() {
        try {
            return (Excluder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }
}
