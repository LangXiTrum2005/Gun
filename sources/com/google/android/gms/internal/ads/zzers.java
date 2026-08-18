package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
public final class zzers implements zzetq {
    public final zzfbn zza;

    public zzers(zzfbn zzfbnVar) {
        this.zza = zzfbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcuv zzcuvVar = (zzcuv) obj;
        if (this.zza != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlN)).booleanValue()) {
                return;
            }
            zzcuvVar.zza.putBoolean("render_in_browser", this.zza.zzd());
            zzcuvVar.zza.putBoolean("disable_ml", this.zza.zzc());
        }
    }
}
