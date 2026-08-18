package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zziv implements Runnable {
    final /* synthetic */ zziz zza;

    public zziv(zziz zzizVar) {
        this.zza = zzizVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zziz zzizVar = this.zza;
        zzizVar.zza = zzizVar.zzh;
    }
}
