package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import java.util.Optional;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class zzes extends zzce {
    final /* synthetic */ PreloadCallback zza;
    final /* synthetic */ zzex zzb;

    public zzes(zzex zzexVar, PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
        this.zzb = zzexVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.ads.internal.client.zzeq] */
    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zze(zzft zzftVar) {
        Optional optionalZzk = zzex.zzk(this.zzb, zzftVar);
        final PreloadCallback preloadCallback = this.zza;
        optionalZzk.ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzeq
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                preloadCallback.onAdsAvailable((PreloadConfiguration) obj);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.ads.internal.client.zzer] */
    @Override // com.google.android.gms.ads.internal.client.zzcf
    public final void zzf(zzft zzftVar) {
        Optional optionalZzk = zzex.zzk(this.zzb, zzftVar);
        final PreloadCallback preloadCallback = this.zza;
        optionalZzk.ifPresent(new Consumer() { // from class: com.google.android.gms.ads.internal.client.zzer
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                preloadCallback.onAdsExhausted((PreloadConfiguration) obj);
            }
        });
    }
}
