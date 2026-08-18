package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
final class zzboj implements zzbke {
    final /* synthetic */ zzbok zza;
    private final zzbnm zzb;
    private final zzcab zzc;

    public zzboj(zzbok zzbokVar, zzbnm zzbnmVar, zzcab zzcabVar) {
        this.zza = zzbokVar;
        this.zzb = zzbnmVar;
        this.zzc = zzcabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zza(@Nullable String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbnv());
            } else {
                this.zzc.zzd(new zzbnv(str));
            }
        } catch (IllegalStateException unused) {
        } finally {
            this.zzb.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbke
    public final void zzb(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zza.zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e) {
                this.zzc.zzd(e);
            }
        } finally {
            this.zzb.zzb();
        }
    }
}
