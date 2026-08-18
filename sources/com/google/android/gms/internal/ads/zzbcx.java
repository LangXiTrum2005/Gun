package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbcx {
    private final long zza;

    @Nullable
    private final String zzb;

    @Nullable
    private final zzbcx zzc;

    public zzbcx(long j, @Nullable String str, @Nullable zzbcx zzbcxVar) {
        this.zza = j;
        this.zzb = str;
        this.zzc = zzbcxVar;
    }

    public final long zza() {
        return this.zza;
    }

    @Nullable
    public final zzbcx zzb() {
        return this.zzc;
    }

    public final String zzc() {
        return this.zzb;
    }
}
