package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzext implements zzelc {
    final /* synthetic */ zzexu zza;

    public zzext(zzexu zzexuVar) {
        this.zza = zzexuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzelc
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcog zzcogVar = (zzcog) obj;
        synchronized (this.zza) {
            try {
                zzcog zzcogVar2 = this.zza.zza;
                if (zzcogVar2 != null) {
                    zzcogVar2.zzb();
                }
                zzexu zzexuVar = this.zza;
                zzexuVar.zza = zzcogVar;
                zzcogVar.zzc(zzexuVar);
                zzexu zzexuVar2 = this.zza;
                zzexuVar2.zzg.zzk(new zzcoh(zzcogVar, zzexuVar2, zzexuVar2.zzg, zzexuVar2.zzi));
                zzcogVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
