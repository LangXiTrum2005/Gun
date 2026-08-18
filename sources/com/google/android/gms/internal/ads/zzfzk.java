package com.google.android.gms.internal.ads;

import java.util.Set;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
class zzfzk extends zzfwl implements Set {
    public zzfzk(Set set, zzfuo zzfuoVar) {
        super(set, zzfuoVar);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object obj) {
        return zzfzp.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return zzfzp.zza(this);
    }
}
