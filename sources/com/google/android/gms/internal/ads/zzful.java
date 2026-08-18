package com.google.android.gms.internal.ads;

import java.io.Serializable;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzful implements Serializable {
    public static zzful zzc() {
        return zzftr.zza;
    }

    public static zzful zzd(@CheckForNull Object obj) {
        return obj == null ? zzftr.zza : new zzfus(obj);
    }

    public abstract zzful zza(zzfuc zzfucVar);

    public abstract Object zzb(Object obj);
}
