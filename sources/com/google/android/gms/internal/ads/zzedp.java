package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzedp implements zzedc {
    private final Context zza;
    private final zzcoa zzb;

    public zzedp(Context context, zzcoa zzcoaVar) {
        this.zza = context;
        this.zzb = zzcoaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq, zzegu {
        zzefb zzefbVar = new zzefb(zzfboVar, (zzbrd) zzeczVar.zzb, AdFormat.APP_OPEN_AD);
        zzcnx zzcnxVarZza = this.zzb.zza(new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new zzdeu(zzefbVar, null), new zzcny(zzfboVar.zzaa));
        zzefbVar.zzb(zzcnxVarZza.zzc());
        ((zzees) zzeczVar.zzc).zzc(zzcnxVarZza.zzj());
        return zzcnxVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        try {
            ((zzbrd) zzeczVar.zzb).zzq(zzfboVar.zzZ);
            ((zzbrd) zzeczVar.zzb).zzi(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzedn(zzeczVar, null), (zzbpk) zzeczVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfcq(e);
        }
    }
}
