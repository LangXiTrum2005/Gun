package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawz extends zzaxr {
    private static volatile Long zzh;
    private static final Object zzi = new Object();

    public zzawz(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "bccqvUs3RMjOBTdPuel6eoo1OORNarRtBblKyIDpHq0HGT1WNkAWOy/ZgRmKdjVf", "3J/aaHdjwZnfPcJ4uTLf1waaNQZJXDmN6IGGhtRxrXI=", zzascVar, i, 22);
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
            this.zzd.zzy(zzh.longValue());
        }
    }
}
