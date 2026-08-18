package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefw implements zzedc {
    private final Context zza;
    private final zzdgq zzb;
    private zzbpt zzc;
    private final VersionInfoParcel zzd;

    public zzefw(Context context, zzdgq zzdgqVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdgqVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq, zzegu {
        if (!zzfcaVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzegu(2, "Unified must be used for RTB.");
        }
        zzdif zzdifVarZzt = zzdif.zzt(this.zzc);
        zzfcj zzfcjVar = zzfcaVar.zza.zza;
        if (!zzfcjVar.zzg.contains(Integer.toString(zzdifVarZzt.zzc()))) {
            throw new zzegu(1, "No corresponding native ad listener");
        }
        zzdih zzdihVarZze = this.zzb.zze(new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new zzdir(zzdifVarZzt), new zzdkk(null, null, this.zzc));
        ((zzees) zzeczVar.zzc).zzc(zzdihVarZze.zzj());
        return zzdihVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        try {
            ((zzbrd) zzeczVar.zzb).zzq(zzfboVar.zzZ);
            zzefv zzefvVar = null;
            if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbP)).intValue()) {
                ((zzbrd) zzeczVar.zzb).zzm(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefu(this, zzeczVar, zzefvVar), (zzbpk) zzeczVar.zzc);
            } else {
                ((zzbrd) zzeczVar.zzb).zzn(zzfboVar.zzU, zzfboVar.zzv.toString(), zzfcaVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefu(this, zzeczVar, zzefvVar), (zzbpk) zzeczVar.zzc, zzfcaVar.zza.zza.zzi);
            }
        } catch (RemoteException e) {
            throw new zzfcq(e);
        }
    }
}
