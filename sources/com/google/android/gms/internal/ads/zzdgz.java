package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdgz implements zzbjp {
    private final WeakReference zza;
    private final WeakReference zzb;

    public /* synthetic */ zzdgz(zzdhb zzdhbVar, View view, zzdha zzdhaVar) {
        this.zza = new WeakReference(zzdhbVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmK)).booleanValue()) {
            this.zzb = new WeakReference(view);
        } else {
            this.zzb = new WeakReference(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        zzdhb zzdhbVar = (zzdhb) this.zza.get();
        if (zzdhbVar == null) {
            return;
        }
        zzdhbVar.zzg.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmK)).booleanValue()) {
            zzdhbVar.zzD.zza((View) this.zzb.get(), zzdhbVar.zzj);
        }
    }
}
