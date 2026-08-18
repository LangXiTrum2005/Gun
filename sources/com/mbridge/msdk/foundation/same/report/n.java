package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.network.r;
import com.mbridge.msdk.tracker.w;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes2.dex */
public class n extends w {
    @Override // com.mbridge.msdk.tracker.w
    public com.mbridge.msdk.tracker.network.w<String> a(r rVar) {
        String str;
        try {
            str = new String(rVar.b, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar.c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(rVar.b);
        }
        return com.mbridge.msdk.tracker.network.w.a(str, com.mbridge.msdk.tracker.network.toolbox.f.a(rVar));
    }
}
