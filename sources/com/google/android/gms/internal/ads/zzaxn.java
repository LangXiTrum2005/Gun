package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxn extends zzaxr {
    public zzaxn(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "rKSUjmRV/NKsFlHbU0cho8FUC8WVx3Rlxhld5Ju7IE8ltyxUVL0g87xJ7LkJDCm6", "KIfx7EUeWhnA+aC9P4Mk2uzmdiZwzAWUKm+DIiGxj24=", zzascVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzag(3);
        boolean zBooleanValue = ((Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (this.zzd) {
            try {
                if (zBooleanValue) {
                    this.zzd.zzag(2);
                } else {
                    this.zzd.zzag(1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
