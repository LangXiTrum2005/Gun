package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzcmj implements zzgcd {
    final /* synthetic */ zzfja zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ com.google.android.gms.ads.internal.util.client.zzv zzc;
    final /* synthetic */ zzcmk zzd;

    public zzcmj(zzcmk zzcmkVar, zzfja zzfjaVar, String str, com.google.android.gms.ads.internal.util.client.zzv zzvVar) {
        this.zza = zzfjaVar;
        this.zzb = str;
        this.zzc = zzvVar;
        this.zzd = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(final Throwable th) {
        zzgcs zzgcsVar = this.zzd.zzg;
        final zzfja zzfjaVar = this.zza;
        final String str = this.zzb;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        zzgcsVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmh
            @Override // java.lang.Runnable
            public final void run() {
                boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkh)).booleanValue();
                zzcmj zzcmjVar = this.zza;
                Throwable th2 = th;
                if (zBooleanValue) {
                    zzcmk zzcmkVar = zzcmjVar.zzd;
                    zzcmkVar.zzb = zzbuh.zzc(zzcmkVar.zzc);
                    zzcmjVar.zzd.zzb.zzh(th2, "AttributionReporting.registerSourceAndPingClickUrl");
                } else {
                    zzcmk zzcmkVar2 = zzcmjVar.zzd;
                    zzcmkVar2.zza = zzbuh.zza(zzcmkVar2.zzc);
                    zzcmjVar.zzd.zza.zzh(th2, "AttributionReportingSampled.registerSourceAndPingClickUrl");
                }
                com.google.android.gms.ads.internal.util.client.zzv zzvVar2 = zzvVar;
                zzfjaVar.zzd(str, zzvVar2, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final zzfja zzfjaVar = this.zza;
        final String str = (String) obj;
        zzgcs zzgcsVar = this.zzd.zzg;
        final com.google.android.gms.ads.internal.util.client.zzv zzvVar = this.zzc;
        zzgcsVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmi
            @Override // java.lang.Runnable
            public final void run() {
                zzfjaVar.zzd(str, zzvVar, null);
            }
        });
    }
}
