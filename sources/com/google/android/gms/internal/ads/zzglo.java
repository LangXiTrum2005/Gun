package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglo {
    public static final zzglo zza = new zzglm().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzglo) {
            return this.zzb.equals(((zzglo) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final Map zza() {
        return this.zzb;
    }
}
