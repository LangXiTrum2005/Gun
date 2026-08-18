package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemp {
    private final AtomicBoolean zza = new AtomicBoolean(false);

    @Nullable
    private zzemo zzb;

    @Nullable
    public final zzemo zza() {
        return this.zzb;
    }

    public final void zzb(zzemo zzemoVar) {
        this.zzb = zzemoVar;
    }

    public final void zzc(boolean z) {
        this.zza.set(true);
    }

    public final boolean zzd() {
        return this.zza.get();
    }
}
