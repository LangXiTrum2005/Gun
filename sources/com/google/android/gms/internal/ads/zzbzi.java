package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzi extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzbzm zza;

    public zzbzi(zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        zzbzm zzbzmVar = this.zza;
        zzbco zzbcoVar = new zzbco(zzbzmVar.zze, zzbzmVar.zzf.afmaVersion);
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.ads.internal.zzv.zze();
                zzbcr.zza(this.zza.zzh, zzbcoVar);
            } catch (IllegalArgumentException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Cannot config CSI reporter.", e);
            }
        }
    }
}
