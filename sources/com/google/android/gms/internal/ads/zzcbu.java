package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcbu implements Runnable {
    private final zzcbg zza;
    private boolean zzb = false;

    public zzcbu(zzcbg zzcbgVar) {
        this.zza = zzcbgVar;
    }

    private final void zzc() {
        zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        zzfqwVar.removeCallbacks(this);
        zzfqwVar.postDelayed(this, 250L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.zzb) {
            return;
        }
        this.zza.zzt();
        zzc();
    }

    public final void zza() {
        this.zzb = true;
        this.zza.zzt();
    }

    public final void zzb() {
        this.zzb = false;
        zzc();
    }
}
