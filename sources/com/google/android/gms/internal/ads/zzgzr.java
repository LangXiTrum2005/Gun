package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class zzgzr {
    private final ArrayDeque zza = new ArrayDeque();

    private zzgzr() {
    }

    public static /* bridge */ /* synthetic */ zzgwj zza(zzgzr zzgzrVar, zzgwj zzgwjVar, zzgwj zzgwjVar2) {
        zzgzrVar.zzb(zzgwjVar);
        zzgzrVar.zzb(zzgwjVar2);
        zzgwj zzgzuVar = (zzgwj) zzgzrVar.zza.pop();
        while (!zzgzrVar.zza.isEmpty()) {
            zzgzuVar = new zzgzu((zzgwj) zzgzrVar.zza.pop(), zzgzuVar);
        }
        return zzgzuVar;
    }

    private final void zzb(zzgwj zzgwjVar) {
        zzgzt zzgztVar;
        if (!zzgwjVar.zzh()) {
            if (!(zzgwjVar instanceof zzgzu)) {
                throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(zzgwjVar.getClass())));
            }
            zzgzu zzgzuVar = (zzgzu) zzgwjVar;
            zzb(zzgzuVar.zzd);
            zzb(zzgzuVar.zze);
            return;
        }
        int iZzc = zzc(zzgwjVar.zzd());
        ArrayDeque arrayDeque = this.zza;
        int iZzc2 = zzgzu.zzc(iZzc + 1);
        if (arrayDeque.isEmpty() || ((zzgwj) this.zza.peek()).zzd() >= iZzc2) {
            this.zza.push(zzgwjVar);
            return;
        }
        int iZzc3 = zzgzu.zzc(iZzc);
        zzgwj zzgzuVar2 = (zzgwj) this.zza.pop();
        while (true) {
            zzgztVar = null;
            if (this.zza.isEmpty() || ((zzgwj) this.zza.peek()).zzd() >= iZzc3) {
                break;
            } else {
                zzgzuVar2 = new zzgzu((zzgwj) this.zza.pop(), zzgzuVar2);
            }
        }
        zzgzu zzgzuVar3 = new zzgzu(zzgzuVar2, zzgwjVar);
        while (!this.zza.isEmpty()) {
            int iZzc4 = zzc(zzgzuVar3.zzd()) + 1;
            ArrayDeque arrayDeque2 = this.zza;
            if (((zzgwj) arrayDeque2.peek()).zzd() >= zzgzu.zzc(iZzc4)) {
                break;
            } else {
                zzgzuVar3 = new zzgzu((zzgwj) this.zza.pop(), zzgzuVar3);
            }
        }
        this.zza.push(zzgzuVar3);
    }

    private static final int zzc(int i) {
        int iBinarySearch = Arrays.binarySearch(zzgzu.zza, i);
        return iBinarySearch < 0 ? (-(iBinarySearch + 1)) - 1 : iBinarySearch;
    }

    public /* synthetic */ zzgzr(zzgzt zzgztVar) {
    }
}
