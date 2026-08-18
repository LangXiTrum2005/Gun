package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzekq implements zzcye {
    private final AtomicReference zza = new AtomicReference();

    public final void zza(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zza.set(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zzh(final com.google.android.gms.ads.internal.client.zzu zzuVar) {
        zzeyt.zza(this.zza, new zzeys() { // from class: com.google.android.gms.internal.ads.zzekp
            @Override // com.google.android.gms.internal.ads.zzeys
            public final void zza(Object obj) throws RemoteException {
                ((com.google.android.gms.ads.internal.client.zzdr) obj).zze(zzuVar);
            }
        });
    }
}
