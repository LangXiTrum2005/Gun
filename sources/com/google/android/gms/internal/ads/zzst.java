package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzst {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;

    public zzst(String str, boolean z, boolean z2) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == zzst.class) {
            zzst zzstVar = (zzst) obj;
            if (TextUtils.equals(this.zza, zzstVar.zza) && this.zzb == zzstVar.zzb && this.zzc == zzstVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.zza.hashCode() + 31) * 31) + (true != this.zzb ? 1237 : 1231)) * 31) + (true != this.zzc ? 1237 : 1231);
    }
}
