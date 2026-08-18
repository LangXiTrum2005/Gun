package com.google.android.gms.internal.ads;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
final class zzdhz implements zzgcd {
    final /* synthetic */ View zza;
    final /* synthetic */ zzdia zzb;

    public zzdhz(zzdia zzdiaVar, View view) {
        this.zza = view;
        this.zzb = zzdiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zzad(this.zza, (zzecr) obj);
    }
}
