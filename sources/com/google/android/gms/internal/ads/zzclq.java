package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzclq implements zzcla {
    private final Context zza;
    private final com.google.android.gms.ads.internal.util.zzg zzb = com.google.android.gms.ads.internal.zzv.zzp().zzi();

    public zzclq(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzcla
    public final void zza(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzg zzgVar = this.zzb;
        boolean z = Boolean.parseBoolean(str);
        zzgVar.zzD(z);
        if (z) {
            com.google.android.gms.ads.internal.util.zzad.zzc(this.zza);
        }
    }
}
