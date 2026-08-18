package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class zzcfc implements View.OnAttachStateChangeListener {
    final /* synthetic */ zzbxu zza;
    final /* synthetic */ zzcff zzb;

    public zzcfc(zzcff zzcffVar, zzbxu zzbxuVar) {
        this.zza = zzbxuVar;
        this.zzb = zzcffVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.zzb.zzaa(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
