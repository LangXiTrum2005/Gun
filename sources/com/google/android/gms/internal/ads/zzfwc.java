package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
class zzfwc implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzfwd zzc;

    public zzfwc(zzfwd zzfwdVar, Iterator it) {
        this.zzc = zzfwdVar;
        this.zzb = zzfwdVar.zzb;
        this.zza = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        this.zzc.zze.zzb--;
        this.zzc.zzc();
    }

    public final void zza() {
        this.zzc.zzb();
        if (this.zzc.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzfwc(zzfwd zzfwdVar) {
        this.zzc = zzfwdVar;
        Collection collection = zzfwdVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }
}
