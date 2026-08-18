package com.mbridge.msdk.tracker;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.tracker.network.z;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class v<T> extends com.mbridge.msdk.tracker.network.u<T> {
    private com.mbridge.msdk.tracker.network.e A;
    private Map<String, String> w;
    private com.mbridge.msdk.tracker.network.u.a x;
    private com.mbridge.msdk.tracker.network.w.b<T> y;
    private w z;

    public v(String str, int i) {
        super(i, str);
    }

    public com.mbridge.msdk.tracker.network.w.b<T> C() {
        return this.y;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public boolean a() {
        return false;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public Map<String, String> f() {
        HashMap map = new HashMap();
        map.put("Content-Type", ShareTarget.ENCODING_TYPE_URL_ENCODED);
        map.put("Charset", C.UTF8_NAME);
        return map;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public Map<String, String> i() {
        return this.w;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public com.mbridge.msdk.tracker.network.u.a l() {
        return this.x;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public z o() {
        if (y.b(this.A)) {
            this.A = new com.mbridge.msdk.tracker.network.e(30000, 0);
        }
        return this.A;
    }

    public v(String str, int i, int i2) {
        super(i, str, i2);
    }

    public void a(w wVar) {
        this.z = wVar;
    }

    public void a(com.mbridge.msdk.tracker.network.u.a aVar) {
        this.x = aVar;
    }

    public void a(Map<String, String> map) {
        this.w = map;
    }

    public void a(com.mbridge.msdk.tracker.network.w.b<T> bVar) {
        this.y = bVar;
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public com.mbridge.msdk.tracker.network.w<T> a(com.mbridge.msdk.tracker.network.r rVar) {
        return this.z.a(rVar);
    }

    @Override // com.mbridge.msdk.tracker.network.u
    public void a(T t) {
        com.mbridge.msdk.tracker.network.w.b<T> bVarC = C();
        this.y = bVarC;
        if (bVarC != null) {
            bVarC.a(t);
        }
    }
}
