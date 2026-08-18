package com.google.android.gms.ads.internal.client;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;

/* JADX INFO: loaded from: classes2.dex */
final class zzeu extends zzdk {
    private zzeu() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdl
    public final void zze(@Nullable zze zzeVar) {
        OnAdInspectorClosedListener onAdInspectorClosedListener = zzex.zzf().zzj;
        if (onAdInspectorClosedListener != null) {
            onAdInspectorClosedListener.onAdInspectorClosed(zzeVar == null ? null : new AdInspectorError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
        }
    }

    public /* synthetic */ zzeu(zzew zzewVar) {
    }
}
