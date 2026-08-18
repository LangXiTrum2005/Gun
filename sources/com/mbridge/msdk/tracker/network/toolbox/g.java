package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2053a;
    private final List<com.mbridge.msdk.tracker.network.h> b;
    private final int c;
    private final InputStream d;
    private final byte[] e;

    public g(int i, List<com.mbridge.msdk.tracker.network.h> list) {
        this(i, list, -1, null);
    }

    public final InputStream a() {
        InputStream inputStream = this.d;
        if (inputStream != null) {
            return inputStream;
        }
        if (this.e != null) {
            return new ByteArrayInputStream(this.e);
        }
        return null;
    }

    public final int b() {
        return this.c;
    }

    public final List<com.mbridge.msdk.tracker.network.h> c() {
        return Collections.unmodifiableList(this.b);
    }

    public final int d() {
        return this.f2053a;
    }

    public g(int i, List<com.mbridge.msdk.tracker.network.h> list, int i2, InputStream inputStream) {
        this.f2053a = i;
        this.b = list;
        this.c = i2;
        this.d = inputStream;
        this.e = null;
    }
}
