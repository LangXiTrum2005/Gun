package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbal {
    private com.google.android.gms.ads.internal.client.zzby zza;
    private final Context zzb;
    private final String zzc;
    private final com.google.android.gms.ads.internal.client.zzei zzd;

    @AppOpenAd.AppOpenAdOrientation
    private final int zze;
    private final AppOpenAd.AppOpenAdLoadCallback zzf;
    private final zzbpa zzg = new zzbpa();
    private final com.google.android.gms.ads.internal.client.zzr zzh = com.google.android.gms.ads.internal.client.zzr.zza;

    public zzbal(Context context, String str, com.google.android.gms.ads.internal.client.zzei zzeiVar, @AppOpenAd.AppOpenAdOrientation int i, AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback) {
        this.zzb = context;
        this.zzc = str;
        this.zzd = zzeiVar;
        this.zze = i;
        this.zzf = appOpenAdLoadCallback;
    }

    public final void zza() {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            com.google.android.gms.ads.internal.client.zzby zzbyVarZze = com.google.android.gms.ads.internal.client.zzbc.zza().zze(this.zzb, com.google.android.gms.ads.internal.client.zzs.zzb(), this.zzc, this.zzg);
            this.zza = zzbyVarZze;
            if (zzbyVarZze != null) {
                if (this.zze != 3) {
                    this.zza.zzI(new com.google.android.gms.ads.internal.client.zzy(this.zze));
                }
                this.zzd.zzq(jCurrentTimeMillis);
                this.zza.zzH(new zzazy(this.zzf, this.zzc));
                this.zza.zzab(this.zzh.zza(this.zzb, this.zzd));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
