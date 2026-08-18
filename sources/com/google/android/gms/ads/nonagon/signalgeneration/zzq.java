package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.query.QueryInfo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzq {

    @Nullable
    private final QueryInfo zza;
    private final String zzb;
    private final long zzc;
    private final int zzd;
    private final AtomicBoolean zze = new AtomicBoolean(false);

    public zzq(@Nullable QueryInfo queryInfo, String str, long j, int i) {
        this.zza = queryInfo;
        this.zzb = str;
        this.zzc = j;
        this.zzd = i;
    }

    public final int zza() {
        return this.zzd;
    }

    @Nullable
    public final QueryInfo zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final void zzd() {
        this.zze.set(true);
    }

    public final boolean zze() {
        return this.zzc <= com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
    }

    public final boolean zzf() {
        return this.zze.get();
    }
}
