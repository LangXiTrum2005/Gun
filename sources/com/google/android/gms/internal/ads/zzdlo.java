package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
final class zzdlo implements zzgcd {
    final /* synthetic */ zzcab zza;

    public zzdlo(zzdlp zzdlpVar, zzcab zzcabVar) {
        this.zza = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcex zzcexVar = (zzcex) obj;
        if (zzcexVar == null) {
            this.zza.zzd(new zzegu(1, "Missing webview from video view future."));
            return;
        }
        final zzcab zzcabVar = this.zza;
        zzcexVar.zzag("/video", new zzccq(new Consumer() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // java.util.function.Consumer
            public final void accept(Object obj2) {
                Bundle bundle = new Bundle();
                bundle.putString("mediaUrl", (String) obj2);
                zzcabVar.zzc(bundle);
            }
        }));
        zzcexVar.zzaa();
    }
}
