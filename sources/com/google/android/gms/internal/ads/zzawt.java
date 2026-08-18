package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawt extends zzaxr {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawt(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "bOzndz3UfjWA1SOXZmjVl3/OkFAGVqfkIFIBgylpbuzJ4v1NDammFGLj1en8A5TJ", "UcBsIyWJ1ILWxlv+9MafJ7lcNPMojMcMoBQJnzvSyQQ=", zzascVar, i, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                try {
                    if (zzh == null) {
                        zzh = (Long) this.zze.invoke(null, new Object[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        synchronized (this.zzd) {
            this.zzd.zzo(zzh.longValue());
        }
    }
}
