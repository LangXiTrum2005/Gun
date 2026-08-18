package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f1928a;

    public a(t tVar) {
        this.f1928a = tVar;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r
    public y a(r.a aVar) throws IOException {
        com.mbridge.msdk.thrid.okhttp.internal.http.g gVar = (com.mbridge.msdk.thrid.okhttp.internal.http.g) aVar;
        w wVarD = gVar.d();
        g gVarI = gVar.i();
        return gVar.a(wVarD, gVarI, gVarI.a(this.f1928a, aVar, !wVarD.e().equals("GET")), gVarI.c());
    }
}
