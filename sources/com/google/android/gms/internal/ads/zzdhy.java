package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzdhy implements zzgcd {
    final /* synthetic */ String zza = "Google";
    final /* synthetic */ zzdia zzb;

    public zzdhy(zzdia zzdiaVar, String str, boolean z) {
        this.zzb = zzdiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfm)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzb.zze.zzT((zzcex) obj);
        zzdia zzdiaVar = this.zzb;
        zzcab zzcabVarZzp = zzdiaVar.zze.zzp();
        zzecr zzecrVarZzf = zzdiaVar.zzf(this.zza, true);
        if (zzecrVarZzf != null && zzcabVarZzp != null) {
            zzcabVarZzp.zzc(zzecrVarZzf);
        } else if (zzcabVarZzp != null) {
            zzcabVarZzp.cancel(false);
        }
    }
}
