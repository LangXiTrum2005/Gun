package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgzq extends zzgwc {
    final zzgzs zza;
    zzgwe zzb = zzb();
    final /* synthetic */ zzgzu zzc;

    public zzgzq(zzgzu zzgzuVar) {
        this.zzc = zzgzuVar;
        this.zza = new zzgzs(zzgzuVar, null);
    }

    private final zzgwe zzb() {
        zzgzs zzgzsVar = this.zza;
        if (zzgzsVar.hasNext()) {
            return zzgzsVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final byte zza() {
        zzgwe zzgweVar = this.zzb;
        if (zzgweVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzgweVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
