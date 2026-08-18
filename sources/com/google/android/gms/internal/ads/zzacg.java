package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
final class zzacg {
    private final zzacf zza;
    private final AtomicBoolean zzb = new AtomicBoolean(false);

    public zzacg(zzacf zzacfVar) {
        this.zza = zzacfVar;
    }

    @Nullable
    public final zzacn zza(Object... objArr) {
        Constructor constructorZza;
        synchronized (this.zzb) {
            if (!this.zzb.get()) {
                try {
                    constructorZza = this.zza.zza();
                } catch (ClassNotFoundException unused) {
                    this.zzb.set(true);
                    constructorZza = null;
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorZza = null;
        }
        if (constructorZza == null) {
            return null;
        }
        try {
            return (zzacn) constructorZza.newInstance(objArr);
        } catch (Exception e2) {
            throw new IllegalStateException("Unexpected error creating extractor", e2);
        }
    }
}
