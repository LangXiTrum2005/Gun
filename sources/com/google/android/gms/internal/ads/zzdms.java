package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzdms implements zzbfk {
    final /* synthetic */ String zza = NativeCustomFormatAd.ASSET_NAME_VIDEO;
    final /* synthetic */ zzdmt zzb;

    public zzdms(zzdmt zzdmtVar, String str) {
        this.zzb = zzdmtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final JSONObject zza() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final JSONObject zzb() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzc() {
        zzdmt zzdmtVar = this.zzb;
        if (zzdmtVar.zzd != null) {
            zzdmtVar.zzd.zzF(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbfk
    public final void zzd(MotionEvent motionEvent) {
    }
}
