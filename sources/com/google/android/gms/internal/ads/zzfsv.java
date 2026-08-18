package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
final class zzfsv extends zzfro {
    final /* synthetic */ zzfsw zza;
    private final zzftb zzb;

    public zzfsv(zzfsw zzfswVar, zzftb zzftbVar) {
        this.zza = zzfswVar;
        this.zzb = zzftbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfrp
    public final void zzb(Bundle bundle) {
        int i = bundle.getInt("statusCode", 8150);
        String string = bundle.getString("sessionToken");
        zzfsz zzfszVarZzc = zzfta.zzc();
        zzfszVarZzc.zzb(i);
        if (string != null) {
            zzfszVarZzc.zza(string);
        }
        this.zzb.zza(zzfszVarZzc.zzc());
        if (i == 8157) {
            this.zza.zza();
        }
    }
}
