package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzqa {

    @Nullable
    private final Context zza;
    private final zzoi zzb;
    private boolean zzc;
    private final zzpy zzd;
    private final zzpz zze;

    @Nullable
    private zzqc zzf;
    private zzps zzg;

    @Deprecated
    public zzqa() {
        this.zza = null;
        this.zzb = zzoi.zza;
        this.zzd = zzpy.zza;
        this.zze = zzpz.zza;
    }

    public final zzqm zzd() {
        zzcw.zzf(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzqc(new zzch[0]);
        }
        if (this.zzg == null) {
            this.zzg = new zzps(this.zza);
        }
        return new zzqm(this, null);
    }

    public zzqa(Context context) {
        this.zza = context;
        this.zzb = zzoi.zza;
        this.zzd = zzpy.zza;
        this.zze = zzpz.zza;
    }
}
