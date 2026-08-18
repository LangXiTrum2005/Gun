package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzdkf implements zzgcd {
    final /* synthetic */ zzdkg zza;

    public zzdkf(zzdkg zzdkgVar) {
        this.zza = zzdkgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final void zzb(List list) {
        try {
            zzcex zzcexVar = (zzcex) list.get(0);
            if (zzcexVar != null) {
                this.zza.zzb(zzcexVar);
            }
        } catch (ClassCastException | IndexOutOfBoundsException e) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "omid native display exp");
            }
        }
    }
}
