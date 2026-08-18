package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzir {
    public static zzim zza(zzim zzimVar) {
        if ((zzimVar instanceof zzip) || (zzimVar instanceof zzin)) {
            return zzimVar;
        }
        return zzimVar instanceof Serializable ? new zzin(zzimVar) : new zzip(zzimVar);
    }

    public static zzim zzb(Object obj) {
        return new zziq(obj);
    }
}
