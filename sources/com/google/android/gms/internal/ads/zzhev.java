package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhev extends zzhen {
    static {
        zzhes.zza(Collections.emptyMap());
    }

    public /* synthetic */ zzhev(Map map, zzhet zzhetVar) {
        super(map);
    }

    public static zzheu zzc(int i) {
        return new zzheu(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap linkedHashMapZzb = zzheo.zzb(zza().size());
        for (Map.Entry entry : zza().entrySet()) {
            linkedHashMapZzb.put(entry.getKey(), ((zzhfa) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapZzb);
    }
}
