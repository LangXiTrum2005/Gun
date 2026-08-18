package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcqb implements zzayk {

    @Nullable
    private final zzcex zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcqb(@Nullable zzcex zzcexVar, Executor executor) {
        this.zza = zzcexVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final synchronized void zzdn(zzayj zzayjVar) {
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmv)).booleanValue()) {
                if (zzayjVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.zzb;
                        final zzcex zzcexVar = this.zza;
                        Objects.requireNonNull(zzcexVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpz
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcexVar.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzayjVar.zzj) {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.zzb;
                        final zzcex zzcexVar2 = this.zza;
                        Objects.requireNonNull(zzcexVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqa
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcexVar2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
