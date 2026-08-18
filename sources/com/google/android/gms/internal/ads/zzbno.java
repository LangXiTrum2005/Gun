package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzbno implements zzcad {
    final /* synthetic */ zzbnm zza;

    public zzbno(zzbnr zzbnrVar, zzbnm zzbnmVar) {
        this.zza = zzbnmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcad
    public final void zza() {
        com.google.android.gms.ads.internal.util.zze.zza("Rejecting reference for JS Engine.");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhB)).booleanValue()) {
            this.zza.zzh(new IllegalStateException("Unable to create JS engine reference."), "SdkJavascriptFactory.createNewReference.FailureCallback");
        } else {
            this.zza.zzg();
        }
    }
}
