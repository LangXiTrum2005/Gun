package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: loaded from: classes3.dex */
final class zzkm extends zzan {
    final /* synthetic */ zzkn zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkm(zzkn zzknVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzknVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    @WorkerThread
    public final void zzc() {
        zzkn zzknVar = this.zza;
        zzknVar.zzc.zzg();
        zzknVar.zzd(false, false, zzknVar.zzc.zzt.zzax().elapsedRealtime());
        zzknVar.zzc.zzt.zzd().zzf(zzknVar.zzc.zzt.zzax().elapsedRealtime());
    }
}
