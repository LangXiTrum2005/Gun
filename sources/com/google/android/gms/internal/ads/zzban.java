package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzban implements Runnable {
    final /* synthetic */ zzbar zza;

    public zzban(zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbar.zzh(this.zza);
    }
}
