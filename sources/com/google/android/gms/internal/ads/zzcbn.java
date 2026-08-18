package com.google.android.gms.internal.ads;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
final class zzcbn implements Runnable {
    public zzcbn(zzcbp zzcbpVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
