package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
final class zzjq implements Runnable {
    final /* synthetic */ AtomicReference zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzq zzd;
    final /* synthetic */ zzjz zze;

    public zzjq(zzjz zzjzVar, AtomicReference atomicReference, String str, String str2, String str3, zzq zzqVar) {
        this.zze = zzjzVar;
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        synchronized (this.zza) {
            try {
                try {
                    zzjz zzjzVar = this.zze;
                    zzej zzejVar = zzjzVar.zzb;
                    if (zzejVar == null) {
                        zzjzVar.zzt.zzaA().zzd().zzd("(legacy) Failed to get conditional properties; not connected to service", null, this.zzb, this.zzc);
                        this.zza.set(Collections.emptyList());
                        this.zza.notify();
                        return;
                    }
                    if (TextUtils.isEmpty(null)) {
                        Preconditions.checkNotNull(this.zzd);
                        this.zza.set(zzejVar.zzf(this.zzb, this.zzc, this.zzd));
                    } else {
                        this.zza.set(zzejVar.zzg(null, this.zzb, this.zzc));
                    }
                    this.zze.zzQ();
                    atomicReference = this.zza;
                    atomicReference.notify();
                } catch (RemoteException e) {
                    this.zze.zzt.zzaA().zzd().zzd("(legacy) Failed to get conditional properties; remote exception", null, this.zzb, e);
                    this.zza.set(Collections.emptyList());
                    atomicReference = this.zza;
                }
            } catch (Throwable th) {
                this.zza.notify();
                throw th;
            }
        }
    }
}
