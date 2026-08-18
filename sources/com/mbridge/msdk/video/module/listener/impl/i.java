package com.mbridge.msdk.video.module.listener.impl;

/* JADX INFO: loaded from: classes2.dex */
public class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f2267a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f2267a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.f2267a;
        if (aVar != null) {
            aVar.a(i, obj);
        }
    }
}
