package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzbso extends zzbgz {
    final /* synthetic */ zzbsr zza;

    public /* synthetic */ zzbso(zzbsr zzbsrVar, zzbsq zzbsqVar) {
        this.zza = zzbsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) {
        zzbsr zzbsrVar = this.zza;
        if (zzbsrVar.zzb == null) {
            return;
        }
        zzbsrVar.zzb.onCustomClick(zzbsrVar.zzf(zzbgqVar), str);
    }
}
