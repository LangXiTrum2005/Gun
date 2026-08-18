package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzx)) {
            return false;
        }
        zzx zzxVar = (zzx) obj;
        if (zzei.zza >= 24) {
            return this.zza.equals(zzxVar.zza);
        }
        if (this.zza.size() != zzxVar.zza.size()) {
            return false;
        }
        for (int i = 0; i < this.zza.size(); i++) {
            if (zza(i) != zzxVar.zza(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (zzei.zza >= 24) {
            return this.zza.hashCode();
        }
        int size = this.zza.size();
        for (int i = 0; i < this.zza.size(); i++) {
            size = (size * 31) + zza(i);
        }
        return size;
    }

    public final int zza(int i) {
        zzcw.zza(i, 0, this.zza.size());
        return this.zza.keyAt(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final boolean zzc(int i) {
        return this.zza.get(i);
    }
}
