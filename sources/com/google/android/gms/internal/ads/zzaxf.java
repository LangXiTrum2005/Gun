package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaxf extends zzaxr {
    public zzaxf(zzawd zzawdVar, String str, String str2, zzasc zzascVar, int i, int i2) {
        super(zzawdVar, "GGM8PCgCXWCZ0992hlu+wbFZrEEMwhwHhgONgPT83ZyPiH7oTYURaPK5zfMGe4DG", "nPlMagQmW6RSJqnTQ57SbpssxbOxIap7X2C6yeu+l3U=", zzascVar, i, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzaxr
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool = (Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcV);
        bool.booleanValue();
        zzavj zzavjVar = new zzavj((String) this.zze.invoke(null, this.zza.zzb(), bool));
        synchronized (this.zzd) {
            this.zzd.zzj(zzavjVar.zza);
            this.zzd.zzC(zzavjVar.zzb);
        }
    }
}
