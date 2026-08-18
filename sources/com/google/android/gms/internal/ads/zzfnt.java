package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: loaded from: classes3.dex */
@ShowFirstParty
public final class zzfnt {
    private final Context zza;
    private final Looper zzb;

    public zzfnt(@NonNull Context context, @NonNull Looper looper) {
        this.zza = context;
        this.zzb = looper;
    }

    public final void zza(@NonNull String str) {
        zzfog zzfogVarZza = zzfoj.zza();
        zzfogVarZza.zza(this.zza.getPackageName());
        zzfogVarZza.zzc(2);
        zzfod zzfodVarZza = zzfof.zza();
        zzfodVarZza.zza(str);
        zzfodVarZza.zzb(2);
        zzfogVarZza.zzb(zzfodVarZza);
        new zzfnu(this.zza, this.zzb, (zzfoj) zzfogVarZza.zzbr()).zza();
    }
}
