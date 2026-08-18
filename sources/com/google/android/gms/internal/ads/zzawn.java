package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.view.View;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzawn extends zzaxr {
    private final Activity zzh;
    private final View zzi;

    public zzawn(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2, View view, Activity activity) {
        super(zzawdVar, "gB+BkxFVoHhSmqLqktRH8YIZYx6a0pcuaOoWc5H2QcQW6Jk8qB3UFfft8KyvHwiE", "A7tv2KK9I23pi5gqrDhkhgrz6cV3BFoHJTUga5I7vx4=", zzascVar, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzi == null) {
            return;
        }
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcJ);
        boolean zBooleanValue = bool.booleanValue();
        Object[] objArr = (Object[]) this.zze.invoke(null, this.zzi, this.zzh, bool);
        synchronized (this.zzd) {
            try {
                this.zzd.zzc(((Long) objArr[0]).longValue());
                this.zzd.zze(((Long) objArr[1]).longValue());
                if (zBooleanValue) {
                    this.zzd.zzd((String) objArr[2]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
