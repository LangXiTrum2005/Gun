package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzgwb extends zzgwc {
    final /* synthetic */ zzgwj zza;
    private int zzb = 0;
    private final int zzc;

    public zzgwb(zzgwj zzgwjVar) {
        this.zza = zzgwjVar;
        this.zzc = zzgwjVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
