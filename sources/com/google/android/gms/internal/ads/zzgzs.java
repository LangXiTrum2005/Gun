package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgzs implements Iterator {
    private final ArrayDeque zza;
    private zzgwf zzb;

    public /* synthetic */ zzgzs(zzgwj zzgwjVar, zzgzt zzgztVar) {
        if (!(zzgwjVar instanceof zzgzu)) {
            this.zza = null;
            this.zzb = (zzgwf) zzgwjVar;
            return;
        }
        zzgzu zzgzuVar = (zzgzu) zzgwjVar;
        ArrayDeque arrayDeque = new ArrayDeque(zzgzuVar.zzf());
        this.zza = arrayDeque;
        arrayDeque.push(zzgzuVar);
        this.zzb = zzb(zzgzuVar.zzd);
    }

    private final zzgwf zzb(zzgwj zzgwjVar) {
        while (zzgwjVar instanceof zzgzu) {
            zzgzu zzgzuVar = (zzgzu) zzgwjVar;
            this.zza.push(zzgzuVar);
            zzgwjVar = zzgzuVar.zzd;
        }
        return (zzgwf) zzgwjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzgwf next() {
        zzgwf zzgwfVarZzb;
        zzgwf zzgwfVar = this.zzb;
        if (zzgwfVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgwfVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgwfVarZzb = zzb(((zzgzu) this.zza.pop()).zze);
        } while (zzgwfVarZzb.zzd() == 0);
        this.zzb = zzgwfVarZzb;
        return zzgwfVar;
    }
}
