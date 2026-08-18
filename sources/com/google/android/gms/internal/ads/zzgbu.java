package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzgbu extends zzgbh {

    @CheckForNull
    private zzgbt zza;

    public zzgbu(zzfxi zzfxiVar, boolean z, Executor executor, Callable callable) {
        super(zzfxiVar, z, false);
        this.zza = new zzgbs(this, callable, executor);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzf(int i, @CheckForNull Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzq() {
        zzgbt zzgbtVar = this.zza;
        if (zzgbtVar != null) {
            zzgbtVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzu() {
        zzgbt zzgbtVar = this.zza;
        if (zzgbtVar != null) {
            zzgbtVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbh
    public final void zzy(int i) {
        super.zzy(i);
        if (i == 1) {
            this.zza = null;
        }
    }
}
