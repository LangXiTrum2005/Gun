package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzaut implements Runnable {
    final /* synthetic */ zzauu zza;

    public zzaut(zzauu zzauuVar) {
        this.zza = zzauuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        if (this.zza.zzb != null) {
            return;
        }
        synchronized (zzauu.zzc) {
            if (this.zza.zzb != null) {
                return;
            }
            boolean z = false;
            try {
                zBooleanValue = ((Boolean) zzbcl.zzcF.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzauu.zza = zzfpk.zzb(this.zza.zze.zza, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z = zBooleanValue;
            this.zza.zzb = Boolean.valueOf(z);
            zzauu.zzc.open();
        }
    }
}
