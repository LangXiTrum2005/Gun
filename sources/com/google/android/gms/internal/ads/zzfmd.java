package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
final class zzfmd implements Runnable {
    final /* synthetic */ zzfme zza;
    private final WebView zzb;

    public zzfmd(zzfme zzfmeVar) {
        this.zza = zzfmeVar;
        this.zzb = zzfmeVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
