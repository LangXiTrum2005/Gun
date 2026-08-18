package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzccv implements Runnable {
    final /* synthetic */ zzccw zza;

    public zzccv(zzccw zzccwVar) {
        this.zza = zzccwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzz().zzc(this.zza);
    }
}
