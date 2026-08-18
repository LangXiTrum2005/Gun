package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzkh implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzkp zzb;

    public zzkh(zzkp zzkpVar, long j) {
        this.zzb = zzkpVar;
        this.zza = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzkp.zzl(this.zzb, this.zza);
    }
}
