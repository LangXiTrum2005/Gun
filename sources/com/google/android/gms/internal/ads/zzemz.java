package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemz implements zzetq {
    private final com.google.android.gms.ads.internal.client.zzy zza;
    private final boolean zzb;

    public zzemz(com.google.android.gms.ads.internal.client.zzy zzyVar, boolean z) {
        this.zza = zzyVar;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = ((zzcuv) obj).zza;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfp)).booleanValue()) {
            bundle.putBoolean("app_switched", this.zzb);
        }
        com.google.android.gms.ads.internal.client.zzy zzyVar = this.zza;
        if (zzyVar != null) {
            int i = zzyVar.zza;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
