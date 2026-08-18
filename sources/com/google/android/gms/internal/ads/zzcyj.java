package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes3.dex */
final class zzcyj implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcyl zzcylVar = (zzcyl) this.zza.get();
        if (zzcylVar != null) {
            zzcylVar.zzq(new zzdbi() { // from class: com.google.android.gms.internal.ads.zzcyh
                @Override // com.google.android.gms.internal.ads.zzdbi
                public final void zza(Object obj) throws ExecutionException, InterruptedException {
                    ((zzcyf) obj).zzb();
                }
            });
        }
    }
}
