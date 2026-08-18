package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zzend implements zzetq {

    @Nullable
    @VisibleForTesting
    final ArrayList zza;

    public zzend(@Nullable ArrayList arrayList) {
        this.zza = arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfcx.zzd(((zzcuv) obj).zza, "android_permissions", this.zza);
    }
}
