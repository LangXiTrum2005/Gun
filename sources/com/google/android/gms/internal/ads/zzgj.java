package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class zzgj extends zzfxd {
    private final Map zza;

    public zzgj(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        return zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final Set entrySet() {
        return zzfzp.zzc(this.zza.entrySet(), new zzfuo() { // from class: com.google.android.gms.internal.ads.zzgh
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return obj != null && zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final int hashCode() {
        return zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final Set keySet() {
        return zzfzp.zzc(this.zza.keySet(), new zzfuo() { // from class: com.google.android.gms.internal.ads.zzgi
            @Override // com.google.android.gms.internal.ads.zzfuo
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfxd, com.google.android.gms.internal.ads.zzfxe
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxd
    public final Map zzb() {
        return this.zza;
    }
}
