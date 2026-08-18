package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfir;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbw extends zzb {
    private final com.google.android.gms.ads.internal.util.client.zzu zza;
    private final String zzb;

    @Nullable
    private final com.google.android.gms.ads.internal.util.client.zzv zzc;

    public zzbw(Context context, String str, String str2, @Nullable zzfir zzfirVar, @Nullable com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = new com.google.android.gms.ads.internal.util.client.zzu(com.google.android.gms.ads.internal.zzv.zzq().zzc(context, str));
        this.zzb = str2;
        this.zzc = zzvVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        if (zzvVar == null) {
            this.zza.zza(this.zzb);
        } else {
            new zzfiq(zzvVar.zzb(), this.zza, zzbzw.zze, null).zzd(this.zzb);
        }
    }
}
