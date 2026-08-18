package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
final class zzfzc extends zzfxs {
    private final transient zzfxq zza;
    private final transient zzfxn zzb;

    public zzfzc(zzfxq zzfxqVar, zzfxn zzfxnVar) {
        this.zza = zzfxqVar;
        this.zzb = zzfxnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@CheckForNull Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    public final int zza(Object[] objArr, int i) {
        return this.zzb.zza(objArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi
    public final zzfxn zzd() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfxs, com.google.android.gms.internal.ads.zzfxi
    /* JADX INFO: renamed from: zze */
    public final zzfzt iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxi
    public final boolean zzf() {
        return true;
    }
}
