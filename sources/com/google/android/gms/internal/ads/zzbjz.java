package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzbjz implements com.google.android.gms.ads.internal.overlay.zzaa {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.client.zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzbjz(zzbkb zzbkbVar, boolean z, com.google.android.gms.ads.internal.client.zza zzaVar, Map map, Map map2) {
        this.zzb = z;
        this.zzc = zzaVar;
        this.zzd = map;
        this.zze = map2;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zza(boolean z) {
        if (this.zza) {
            return;
        }
        if (z && this.zzb) {
            ((zzdds) this.zzc).zzdd();
        }
        this.zza = true;
        this.zzd.put((String) this.zze.get("event_id"), Boolean.valueOf(z));
        ((zzbmk) this.zzc).zzd("openIntentAsync", this.zzd);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzaa
    public final void zzb(int i) {
    }
}
