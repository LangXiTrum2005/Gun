package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.o0;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes2.dex */
public class l extends i<String> implements w.a {
    private final k<String> C;

    public l(int i, String str, String str2, long j, k<String> kVar) {
        super(i, str, 0, str2, j);
        this.C = kVar;
        a((w.a) this);
    }

    private void b(w<String> wVar) {
        k<String> kVar = this.C;
        if (kVar != null) {
            try {
                kVar.b(this, wVar, wVar.c.f2040a);
            } catch (Exception e) {
                o0.b(i.B, "parseNetworkResponse error: ", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(String str) {
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public w<String> a(r rVar) {
        try {
            w<String> wVarA = w.a(new String(rVar.b, StandardCharsets.UTF_8), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
            a(wVarA, rVar);
            return wVarA;
        } catch (Throwable th) {
            o0.b(i.B, "parseNetworkResponse error: ", th);
            w<String> wVarA2 = w.a(new c0(th));
            b(wVarA2);
            return wVarA2;
        }
    }

    private void a(w<String> wVar, r rVar) {
        k<String> kVar = this.C;
        if (kVar != null) {
            try {
                kVar.a(this, wVar, rVar);
            } catch (Exception e) {
                o0.b(i.B, "parseNetworkResponse error: ", e);
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public void a(d0 d0Var) {
        b(w.a(d0Var));
    }
}
