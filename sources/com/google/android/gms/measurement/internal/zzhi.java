package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
public final class zzhi {
    final Context zza;

    @Nullable
    String zzb;

    @Nullable
    String zzc;

    @Nullable
    String zzd;

    @Nullable
    Boolean zze;
    long zzf;

    @Nullable
    com.google.android.gms.internal.measurement.zzcl zzg;
    boolean zzh;

    @Nullable
    final Long zzi;

    @Nullable
    String zzj;

    @VisibleForTesting
    public zzhi(Context context, @Nullable com.google.android.gms.internal.measurement.zzcl zzclVar, @Nullable Long l) {
        this.zzh = true;
        Preconditions.checkNotNull(context);
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zza = applicationContext;
        this.zzi = l;
        if (zzclVar != null) {
            this.zzg = zzclVar;
            this.zzb = zzclVar.zzf;
            this.zzc = zzclVar.zze;
            this.zzd = zzclVar.zzd;
            this.zzh = zzclVar.zzc;
            this.zzf = zzclVar.zzb;
            this.zzj = zzclVar.zzh;
            Bundle bundle = zzclVar.zzg;
            if (bundle != null) {
                this.zze = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
