package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.internal.ads.zzdee;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbm implements zzdee {
    private final zzb zza;
    private final int zzb;

    @Nullable
    private final String zzc;

    @VisibleForTesting
    public zzbm(zzb zzbVar, int i, @Nullable String str) {
        this.zza = zzbVar;
        this.zzb = i;
        this.zzc = str;
    }

    public final /* synthetic */ void zza(zzbk zzbkVar) {
        this.zza.zzd(this.zzc, zzbkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zze(@Nullable final zzbk zzbkVar) {
        if (zzbkVar == null || this.zzb != 2 || TextUtils.isEmpty(this.zzc)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(zzbkVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdee
    public final void zzf(@Nullable String str) {
    }
}
