package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzcnb implements zzbjp {
    final /* synthetic */ zzcnc zza;

    public zzcnb(zzcnc zzcncVar) {
        this.zza = zzcncVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        if (zzcnc.zzg(this.zza, map)) {
            this.zza.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcna
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzd.zzj();
                }
            });
        }
    }
}
