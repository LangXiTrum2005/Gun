package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.thrid.okhttp.p;
import com.mbridge.msdk.thrid.okhttp.r;
import com.mbridge.msdk.thrid.okhttp.u;
import com.mbridge.msdk.thrid.okhttp.w;
import com.mbridge.msdk.thrid.okhttp.y;
import com.mbridge.msdk.thrid.okhttp.z;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements r {
    public a(c cVar) {
    }

    public static boolean b(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || HttpResponseHeader.ProxyAuthenticate.equalsIgnoreCase(str) || HttpRequestHeader.ProxyAuthorization.equalsIgnoreCase(str) || HttpRequestHeader.TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpResponseHeader.TransferEncoding.equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.r
    public y a(r.a aVar) throws IOException {
        b bVarC = new b.a(System.currentTimeMillis(), aVar.d(), null).c();
        w wVar = bVarC.f1926a;
        y yVar = bVarC.b;
        if (wVar == null && yVar == null) {
            return new y.a().a(aVar.d()).a(u.HTTP_1_1).a(504).a("Unsatisfiable Request (only-if-cached)").a(com.mbridge.msdk.thrid.okhttp.internal.c.c).b(-1L).a(System.currentTimeMillis()).a();
        }
        if (wVar == null) {
            return yVar.o().a(a(yVar)).a();
        }
        y yVarA = aVar.a(wVar);
        if (yVar != null) {
            if (yVarA.k() == 304) {
                yVar.o().a(a(yVar.m(), yVarA.m())).b(yVarA.s()).a(yVarA.q()).a(a(yVar)).c(a(yVarA)).a();
                yVarA.d().close();
                throw null;
            }
            com.mbridge.msdk.thrid.okhttp.internal.c.a(yVar.d());
        }
        return yVarA.o().a(a(yVar)).c(a(yVarA)).a();
    }

    private static y a(y yVar) {
        return (yVar == null || yVar.d() == null) ? yVar : yVar.o().a((z) null).a();
    }

    private static p a(p pVar, p pVar2) {
        p.a aVar = new p.a();
        int iB = pVar.b();
        for (int i = 0; i < iB; i++) {
            String strA = pVar.a(i);
            String strB = pVar.b(i);
            if ((!"Warning".equalsIgnoreCase(strA) || !strB.startsWith("1")) && (a(strA) || !b(strA) || pVar2.b(strA) == null)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f1922a.a(aVar, strA, strB);
            }
        }
        int iB2 = pVar2.b();
        for (int i2 = 0; i2 < iB2; i2++) {
            String strA2 = pVar2.a(i2);
            if (!a(strA2) && b(strA2)) {
                com.mbridge.msdk.thrid.okhttp.internal.a.f1922a.a(aVar, strA2, pVar2.b(i2));
            }
        }
        return aVar.a();
    }

    public static boolean a(String str) {
        return "Content-Length".equalsIgnoreCase(str) || HttpResponseHeader.ContentEncoding.equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }
}
