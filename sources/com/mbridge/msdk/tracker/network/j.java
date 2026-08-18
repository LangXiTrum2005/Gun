package com.mbridge.msdk.tracker.network;

import com.mbridge.msdk.foundation.tools.o0;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class j extends i<JSONObject> implements w.a {
    private final k<JSONObject> C;

    public j(int i, String str, String str2, long j, k<JSONObject> kVar) {
        super(i, str, 0, str2, j);
        this.C = kVar;
        a((w.a) this);
    }

    private void b(w<JSONObject> wVar) {
        k<JSONObject> kVar = this.C;
        if (kVar != null) {
            try {
                kVar.b(this, wVar, wVar.c.f2040a);
            } catch (Exception e) {
                o0.b(i.B, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public void a(JSONObject jSONObject) {
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public w<JSONObject> a(r rVar) {
        try {
            String str = new String(rVar.b, StandardCharsets.UTF_8);
            if (rVar.f2050a == 204) {
                w<JSONObject> wVarA = w.a(new JSONObject(), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
                a(wVarA, rVar);
                return wVarA;
            }
            w<JSONObject> wVarA2 = w.a(new JSONObject(str), com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
            a(wVarA2, rVar);
            return wVarA2;
        } catch (JSONException e) {
            o0.b(i.B, e.getMessage());
            w<JSONObject> wVarA3 = w.a(new t(e));
            b(wVarA3);
            return wVarA3;
        } catch (Throwable th) {
            w<JSONObject> wVarA4 = w.a(new c0(th));
            b(wVarA4);
            return wVarA4;
        }
    }

    private void a(w<JSONObject> wVar, r rVar) {
        k<JSONObject> kVar = this.C;
        if (kVar != null) {
            try {
                kVar.a(this, wVar, rVar);
            } catch (Exception e) {
                o0.b(i.B, e.getMessage());
            }
        }
    }

    @Override // com.mbridge.msdk.tracker.network.w.a
    public void a(d0 d0Var) {
        b(w.a(d0Var));
    }
}
