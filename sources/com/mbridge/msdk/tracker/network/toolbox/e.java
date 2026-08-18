package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.tracker.network.u;

/* JADX INFO: loaded from: classes2.dex */
public class e implements com.mbridge.msdk.tracker.network.c {
    @Override // com.mbridge.msdk.tracker.network.c
    public String a(u<?> uVar) {
        String strT = uVar.t();
        int iG = uVar.g();
        if (iG == 0) {
            return strT;
        }
        return Integer.toString(iG) + '-' + strT;
    }
}
