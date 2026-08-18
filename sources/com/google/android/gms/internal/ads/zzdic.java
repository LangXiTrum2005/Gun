package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdic {

    @Nullable
    private zzbft zza;

    public zzdic(zzdhn zzdhnVar) {
        this.zza = zzdhnVar;
    }

    @Nullable
    public final synchronized zzbft zza() {
        return this.zza;
    }

    public final synchronized void zzb(@Nullable zzbft zzbftVar) {
        this.zza = zzbftVar;
    }
}
