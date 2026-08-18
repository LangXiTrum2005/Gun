package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.tools.o0;

/* JADX INFO: loaded from: classes2.dex */
public class f implements com.mbridge.msdk.video.module.listener.a {
    @Override // com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        o0.b("NotifyListener", "onNotify,type=" + i + ",pt=" + obj);
    }
}
