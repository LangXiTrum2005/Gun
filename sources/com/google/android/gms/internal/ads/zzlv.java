package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes3.dex */
public final class zzlv {
    private final zzx zza;
    private final SparseArray zzb;

    public zzlv(zzx zzxVar, SparseArray sparseArray) {
        this.zza = zzxVar;
        SparseArray sparseArray2 = new SparseArray(zzxVar.zzb());
        for (int i = 0; i < zzxVar.zzb(); i++) {
            int iZza = zzxVar.zza(i);
            zzlu zzluVar = (zzlu) sparseArray.get(iZza);
            zzluVar.getClass();
            sparseArray2.append(iZza, zzluVar);
        }
        this.zzb = sparseArray2;
    }

    public final int zza(int i) {
        return this.zza.zza(i);
    }

    public final int zzb() {
        return this.zza.zzb();
    }

    public final zzlu zzc(int i) {
        zzlu zzluVar = (zzlu) this.zzb.get(i);
        zzluVar.getClass();
        return zzluVar;
    }

    public final boolean zzd(int i) {
        return this.zza.zzc(i);
    }
}
