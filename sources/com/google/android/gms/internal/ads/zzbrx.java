package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
final class zzbrx implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbrz zza;

    public zzbrx(zzbrz zzbrzVar) {
        this.zza = zzbrzVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        zzbrz zzbrzVar = this.zza;
        Intent intentZzb = zzbrzVar.zzb();
        com.google.android.gms.ads.internal.zzv.zzq();
        com.google.android.gms.ads.internal.util.zzs.zzT(zzbrzVar.zzb, intentZzb);
    }
}
