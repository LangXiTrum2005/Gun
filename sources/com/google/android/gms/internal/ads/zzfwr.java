package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzfwr implements Iterator {
    int zzb;
    int zzc;
    int zzd = -1;
    final /* synthetic */ zzfww zze;

    public /* synthetic */ zzfwr(zzfww zzfwwVar, zzfwv zzfwvVar) {
        this.zze = zzfwwVar;
        this.zzb = zzfwwVar.zzf;
        this.zzc = zzfwwVar.zze();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        zzb();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        Object objZza = zza(i);
        this.zzc = this.zze.zzf(this.zzc);
        return objZza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        zzfun.zzm(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        zzfww zzfwwVar = this.zze;
        zzfwwVar.remove(zzfww.zzg(zzfwwVar, i));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
