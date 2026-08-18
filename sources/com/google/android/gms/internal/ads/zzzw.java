package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzw {
    private final Context zza;
    private final zzaal zzb;
    private zzca zzc;
    private zzbl zzd;
    private final List zze = zzfxn.zzn();
    private zzcx zzf = zzcx.zza;
    private boolean zzg;

    public zzzw(Context context, zzaal zzaalVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaalVar;
    }

    public final zzzw zzd(zzcx zzcxVar) {
        this.zzf = zzcxVar;
        return this;
    }

    public final zzaah zze() {
        zzcw.zzf(!this.zzg);
        zzaag zzaagVar = null;
        if (this.zzd == null) {
            if (this.zzc == null) {
                this.zzc = new zzaae(null);
            }
            this.zzd = new zzaaf(this.zzc);
        }
        zzaah zzaahVar = new zzaah(this, zzaagVar);
        this.zzg = true;
        return zzaahVar;
    }
}
