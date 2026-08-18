package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzdhx implements zzayk {
    final /* synthetic */ String zza;
    final /* synthetic */ zzdia zzb;

    public zzdhx(zzdia zzdiaVar, String str) {
        this.zza = str;
        this.zzb = zzdiaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzayk
    public final void zzdn(zzayj zzayjVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbR)).booleanValue()) {
            if (zzayjVar.zzj) {
                zzdia zzdiaVar = this.zzb;
                if (zzdiaVar.zzo != null) {
                    zzdiaVar.zzy.put(this.zza, Boolean.TRUE);
                    zzdia zzdiaVar2 = this.zzb;
                    if (zzdiaVar2.zzo == null) {
                        return;
                    }
                    zzdiaVar2.zzB(zzdiaVar2.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                    return;
                }
                return;
            }
            return;
        }
        synchronized (this) {
            try {
                if (zzayjVar.zzj) {
                    zzdia zzdiaVar3 = this.zzb;
                    if (zzdiaVar3.zzo != null) {
                        zzdiaVar3.zzy.put(this.zza, Boolean.TRUE);
                        zzdia zzdiaVar4 = this.zzb;
                        if (zzdiaVar4.zzo == null) {
                        } else {
                            zzdiaVar4.zzB(zzdiaVar4.zzo.zzf(), this.zzb.zzo.zzl(), this.zzb.zzo.zzm(), true);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
