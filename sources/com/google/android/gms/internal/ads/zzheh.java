package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class zzheh implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhei zzb;

    public zzheh(zzhei zzheiVar) {
        this.zzb = zzheiVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zza >= this.zzb.zza.size()) {
            zzhei zzheiVar = this.zzb;
            zzheiVar.zza.add(zzheiVar.zzb.next());
            return next();
        }
        zzhei zzheiVar2 = this.zzb;
        int i = this.zza;
        this.zza = i + 1;
        return zzheiVar2.zza.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
