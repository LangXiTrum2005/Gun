package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzie implements Runnable {
    final /* synthetic */ Boolean zza;
    final /* synthetic */ zzik zzb;

    public zzie(zzik zzikVar, Boolean bool) {
        this.zzb = zzikVar;
        this.zza = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzaa(this.zza, true);
    }
}
