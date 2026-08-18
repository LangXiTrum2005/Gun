package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbcr {
    public static final void zza(zzbcq zzbcqVar, @Nullable zzbco zzbcoVar) {
        if (zzbcoVar.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbcoVar.zzb())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbcqVar.zzd(zzbcoVar.zza(), zzbcoVar.zzb(), zzbcoVar.zzc(), zzbcoVar.zzd());
    }
}
