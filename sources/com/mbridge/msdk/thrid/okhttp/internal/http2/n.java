package com.mbridge.msdk.thrid.okhttp.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f1968a;

    public n(b bVar) {
        super("stream was reset: " + bVar);
        this.f1968a = bVar;
    }
}
