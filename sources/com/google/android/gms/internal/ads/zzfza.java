package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class zzfza extends zzfxn {
    final /* synthetic */ zzfzb zza;

    public zzfza(zzfzb zzfzbVar) {
        this.zza = zzfzbVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzfun.zza(i, this.zza.zzc, "index");
        int i2 = i + i;
        Object obj = this.zza.zzb[i2];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    public final boolean zzf() {
        return true;
    }
}
