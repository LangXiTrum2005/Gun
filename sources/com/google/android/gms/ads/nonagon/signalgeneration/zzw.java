package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdee;
import com.google.android.gms.internal.ads.zzdrq;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzw implements zzdee {
    private final zzdrq zza;
    private final zzv zzb;
    private final String zzc;
    private final int zzd;

    @VisibleForTesting
    public zzw(zzdrq zzdrqVar, zzv zzvVar, String str, int i) {
        this.zza = zzdrqVar;
        this.zzb = zzvVar;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable zzbk zzbkVar) {
        String strOptString;
        if (zzbkVar == null || this.zzd == 2) {
            return;
        }
        if (TextUtils.isEmpty(zzbkVar.zzc)) {
            this.zzb.zzd(this.zzc, zzbkVar.zzb, this.zza);
            return;
        }
        try {
            strOptString = new JSONObject(zzbkVar.zzc).optString("request_id");
        } catch (JSONException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "RenderSignals.getRequestId");
            strOptString = null;
        }
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        this.zzb.zzd(strOptString, zzbkVar.zzc, this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String str) {
    }
}
