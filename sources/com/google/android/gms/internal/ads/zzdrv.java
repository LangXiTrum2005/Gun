package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdrv {
    final /* synthetic */ zzdrw zza;
    private final Map zzb = new ConcurrentHashMap();

    @VisibleForTesting
    public zzdrv(zzdrw zzdrwVar) {
        this.zza = zzdrwVar;
    }

    public static /* bridge */ /* synthetic */ zzdrv zza(zzdrv zzdrvVar) {
        zzdrvVar.zzb.putAll(zzdrvVar.zza.zzc);
        return zzdrvVar;
    }

    public final zzdrv zzb(String str, @Nullable String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdrv zzc(zzfbo zzfboVar) {
        zzb("aai", zzfboVar.zzw);
        zzb("request_id", zzfboVar.zzan);
        zzb("ad_format", zzfbo.zza(zzfboVar.zzb));
        return this;
    }

    public final zzdrv zzd(zzfbr zzfbrVar) {
        zzb("gqi", zzfbrVar.zzb);
        return this;
    }

    public final String zze() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzf() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdru
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzi();
            }
        });
    }

    public final void zzg() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrs
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj();
            }
        });
    }

    public final void zzh() {
        this.zza.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdrt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzk();
            }
        });
    }

    public final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    public final /* synthetic */ void zzj() {
        this.zza.zza.zzg(this.zzb);
    }

    public final /* synthetic */ void zzk() {
        this.zza.zza.zzf(this.zzb);
    }
}
