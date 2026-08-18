package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcrb implements zzcrc {
    private final Map zza;

    public zzcrb(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcrc
    @Nullable
    public final zzecw zza(int i, String str) {
        return (zzecw) this.zza.get(str);
    }
}
