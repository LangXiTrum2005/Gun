package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.umeng.ccg.a;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfjp {
    private final zzdrw zza;

    public zzfjp(zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [com.google.android.gms.internal.ads.zzfjn] */
    /* JADX WARN: Type inference failed for: r2v4, types: [com.google.android.gms.internal.ads.zzfjo] */
    private final void zzg(@Nullable AdFormat adFormat, Optional optional, String str, long j, Optional optional2) {
        final zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzb(str, Long.toString(j));
        zzdrvVarZza.zzb("ad_format", adFormat == null ? "unknown" : adFormat.name());
        optional.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.zzfjn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzdrvVarZza.zzb(a.w, (String) obj);
            }
        });
        optional2.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.zzfjo
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzdrvVarZza.zzb("gqi", (String) obj);
            }
        });
        zzdrvVarZza.zzg();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [com.google.android.gms.internal.ads.zzfjl] */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.google.android.gms.internal.ads.zzfjm] */
    public final void zza(AdFormat adFormat, long j, Optional optional, Optional optional2) {
        final zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzb("plaac_ts", Long.toString(j));
        zzdrvVarZza.zzb("ad_format", adFormat.name());
        zzdrvVarZza.zzb(a.w, "is_ad_available");
        optional.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.zzfjl
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzdrvVarZza.zzb("plaay_ts", Long.toString(((Long) obj).longValue()));
            }
        });
        optional2.ifPresent(new Consumer() { // from class: com.google.android.gms.internal.ads.zzfjm
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                zzdrvVarZza.zzb("gqi", (String) obj);
            }
        });
        zzdrvVarZza.zzg();
    }

    public final void zzb(@Nullable AdFormat adFormat, long j, Optional optional) {
        zzg(adFormat, Optional.empty(), "pano_ts", j, optional);
    }

    public final void zzc(@Nullable AdFormat adFormat, long j) {
        zzg(adFormat, Optional.empty(), "paeo_ts", j, Optional.empty());
    }

    public final void zzd(AdFormat adFormat, long j) {
        zzg(adFormat, Optional.of("poll_ad"), "ppac_ts", j, Optional.empty());
    }

    public final void zze(AdFormat adFormat, long j, Optional optional) {
        zzg(adFormat, Optional.of("poll_ad"), "ppla_ts", j, optional);
    }

    public final void zzf(Map map, long j) {
        zzdrv zzdrvVarZza = this.zza.zza();
        zzdrvVarZza.zzb(a.w, "start_preload");
        zzdrvVarZza.zzb("sp_ts", Long.toString(j));
        for (AdFormat adFormat : map.keySet()) {
            String strValueOf = String.valueOf(adFormat.name().toLowerCase(Locale.ENGLISH));
            zzdrvVarZza.zzb(strValueOf.concat("_count"), Integer.toString(((Integer) map.get(adFormat)).intValue()));
        }
        zzdrvVarZza.zzg();
    }
}
