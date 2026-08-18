package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.VisibleForTesting;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemo implements zzetq {
    private final Bundle zza;

    @VisibleForTesting
    public zzemo(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzcuvVar.zza.putBundle("installed_adapter_data", this.zza);
    }
}
