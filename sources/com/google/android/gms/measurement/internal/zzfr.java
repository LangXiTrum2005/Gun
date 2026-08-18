package com.google.android.gms.measurement.internal;

import androidx.collection.LruCache;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
final class zzfr extends LruCache {
    final /* synthetic */ zzfu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfr(zzfu zzfuVar, int i) {
        super(20);
        this.zza = zzfuVar;
    }

    @Override // androidx.collection.LruCache
    public final /* bridge */ /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzfu.zzd(this.zza, str);
    }
}
