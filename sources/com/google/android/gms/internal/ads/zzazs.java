package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzazs {
    final long zza;
    final String zzb;
    final int zzc;

    public zzazs(long j, String str, int i) {
        this.zza = j;
        this.zzb = str;
        this.zzc = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj != null && (obj instanceof zzazs)) {
            zzazs zzazsVar = (zzazs) obj;
            if (zzazsVar.zza == this.zza && zzazsVar.zzc == this.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.zza;
    }
}
