package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzs extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzzq zzd;
    private boolean zze;

    public /* synthetic */ zzzs(zzzq zzzqVar, SurfaceTexture surfaceTexture, boolean z, zzzr zzzrVar) {
        super(surfaceTexture);
        this.zzd = zzzqVar;
        this.zza = z;
    }

    public static zzzs zza(Context context, boolean z) {
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzcw.zzf(z2);
        return new zzzq().zza(z ? zzb : 0);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        try {
            if (!zzc) {
                if (zzdf.zzb(context)) {
                    i = zzdf.zzc() ? 1 : 2;
                } else {
                    i = 0;
                }
                zzb = i;
                zzc = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.zzd) {
            try {
                if (!this.zze) {
                    this.zzd.zzb();
                    this.zze = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
