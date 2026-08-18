package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzhaa implements Iterator {
    final /* synthetic */ zzhad zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhaa(zzhad zzhadVar, zzhac zzhacVar) {
        this.zza = zzhadVar;
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.zzb + 1;
        zzhad zzhadVar = this.zza;
        if (i >= zzhadVar.zzb) {
            return !zzhadVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i = this.zzb + 1;
        this.zzb = i;
        zzhad zzhadVar = this.zza;
        return i < zzhadVar.zzb ? (zzgzz) zzhadVar.zza[i] : (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i = this.zzb;
        zzhad zzhadVar = this.zza;
        if (i >= zzhadVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i - 1;
            zzhadVar.zzm(i);
        }
    }
}
