package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelm implements zzetq {
    private final boolean zza;

    public zzelm(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ((zzcuv) obj).zza.putString("adid_p", true != this.zza ? "0" : "1");
    }
}
