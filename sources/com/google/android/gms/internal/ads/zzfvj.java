package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfvj {
    public static zzfvf zza(zzfvf zzfvfVar) {
        if ((zzfvfVar instanceof zzfvi) || (zzfvfVar instanceof zzfvg)) {
            return zzfvfVar;
        }
        return zzfvfVar instanceof Serializable ? new zzfvg(zzfvfVar) : new zzfvi(zzfvfVar);
    }
}
