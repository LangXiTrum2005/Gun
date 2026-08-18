package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes3.dex */
final class zzdxd implements zzgcd {
    final /* synthetic */ zzdxe zza;

    public zzdxd(zzdxe zzdxeVar) {
        this.zza = zzdxeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            Matcher matcher = zzdxe.zza.matcher(th.getMessage());
            if (matcher.matches()) {
                this.zza.zzf.zzi(Integer.parseInt(matcher.group(1)));
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfca zzfcaVar = (zzfca) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgb)).booleanValue()) {
            this.zza.zzf.zzi(zzfcaVar.zzb.zzb.zzf);
            this.zza.zzf.zzj(zzfcaVar.zzb.zzb.zzg);
        }
    }
}
