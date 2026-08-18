package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglm {
    private HashMap zza = new HashMap();

    public final zzglo zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzglo zzgloVar = new zzglo(Collections.unmodifiableMap(this.zza), null);
        this.zza = null;
        return zzgloVar;
    }
}
