package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaps {

    @Nullable
    public final Object zza;

    @Nullable
    public final zzaov zzb;

    @Nullable
    public final zzapv zzc;
    public boolean zzd;

    private zzaps(zzapv zzapvVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzapvVar;
    }

    public static zzaps zza(zzapv zzapvVar) {
        return new zzaps(zzapvVar);
    }

    public static zzaps zzb(@Nullable Object obj, @Nullable zzaov zzaovVar) {
        return new zzaps(obj, zzaovVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzaps(@Nullable Object obj, @Nullable zzaov zzaovVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzaovVar;
        this.zzc = null;
    }
}
