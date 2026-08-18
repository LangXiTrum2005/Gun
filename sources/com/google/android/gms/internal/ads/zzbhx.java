package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzbhx extends zzbgz {
    final /* synthetic */ zzbia zza;

    public /* synthetic */ zzbhx(zzbia zzbiaVar, zzbhz zzbhzVar) {
        this.zza = zzbiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbha
    public final void zze(zzbgq zzbgqVar, String str) {
        zzbia zzbiaVar = this.zza;
        if (zzbiaVar.zzb == null) {
            return;
        }
        zzbiaVar.zzb.zzb(zzbiaVar.zzf(zzbgqVar), str);
    }
}
