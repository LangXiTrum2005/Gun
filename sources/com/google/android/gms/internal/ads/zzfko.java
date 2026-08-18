package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfko {
    private boolean zza;

    public final void zza(Context context) {
        zzfmk.zzc(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzfls.zzb().zzd(context);
        zzflj.zza().zzd(context);
        zzfmf.zzb(context);
        zzfmg.zzd(context);
        zzfmj.zza(context);
        zzflp.zzb().zzc(context);
        zzfli.zza().zzd(context);
        zzflu.zza().zze(context);
    }

    public final boolean zzb() {
        return this.zza;
    }
}
