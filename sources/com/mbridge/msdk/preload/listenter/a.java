package com.mbridge.msdk.preload.listenter;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class a implements PreloadListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    WeakReference<PreloadListener> f1728a;
    private int b = 0;
    private boolean c = false;

    public a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f1728a = new WeakReference<>(preloadListener);
        }
    }

    public boolean a() {
        return this.c;
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f1728a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f1728a.get().onPreloadFaild(str);
    }

    @Override // com.mbridge.msdk.out.PreloadListener
    public void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f1728a;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f1728a.get().onPreloadSucceed();
    }

    public void a(boolean z) {
        this.c = z;
    }
}
