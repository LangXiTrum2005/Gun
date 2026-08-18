package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzdgy implements zzbjp {
    private final WeakReference zza;

    public /* synthetic */ zzdgy(zzdhb zzdhbVar, zzdha zzdhaVar) {
        this.zza = new WeakReference(zzdhbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        zzdhb zzdhbVar = (zzdhb) this.zza.get();
        if (zzdhbVar == null) {
            return;
        }
        zzdhbVar.zzh.onAdClicked();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkE)).booleanValue()) {
            zzdhbVar.zzi.zzdd();
            if (TextUtils.isEmpty((CharSequence) map.get("sccg"))) {
                return;
            }
            zzdhbVar.zzi.zzu();
        }
    }
}
