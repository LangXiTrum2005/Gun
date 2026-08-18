package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzava;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class zzq implements Callable {
    final /* synthetic */ zzu zza;

    public zzq(zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzu zzuVar = this.zza;
        return new zzava(zzauz.zzu(zzuVar.zzd, new zzaux(zzuVar.zza.afmaVersion, false)));
    }
}
