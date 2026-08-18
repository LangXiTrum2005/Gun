package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class zzdc extends zzdg {
    private final Object zza;
    private boolean zzb;

    public zzdc(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.zzb;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.zzb) {
            throw new NoSuchElementException();
        }
        this.zzb = true;
        return this.zza;
    }
}
