package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzefs implements zzedc {
    private final Context zza;
    private final zzdgq zzb;
    private final Executor zzc;

    public zzefs(Context context, zzdgq zzdgqVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdgqVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfca zzfcaVar, int i) {
        return zzfcaVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final /* bridge */ /* synthetic */ Object zza(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq, zzegu {
        zzdif zzdifVarZzah;
        zzbpp zzbppVarZzD = ((zzfdh) zzeczVar.zzb).zzD();
        zzbpq zzbpqVarZzE = ((zzfdh) zzeczVar.zzb).zzE();
        zzbpt zzbptVarZzd = ((zzfdh) zzeczVar.zzb).zzd();
        if (zzbptVarZzd != null && zzc(zzfcaVar, 6)) {
            zzdifVarZzah = zzdif.zzt(zzbptVarZzd);
        } else if (zzbppVarZzD != null && zzc(zzfcaVar, 6)) {
            zzdifVarZzah = zzdif.zzai(zzbppVarZzD);
        } else if (zzbppVarZzD != null && zzc(zzfcaVar, 2)) {
            zzdifVarZzah = zzdif.zzag(zzbppVarZzD);
        } else if (zzbpqVarZzE != null && zzc(zzfcaVar, 6)) {
            zzdifVarZzah = zzdif.zzaj(zzbpqVarZzE);
        } else {
            if (zzbpqVarZzE == null || !zzc(zzfcaVar, 1)) {
                throw new zzegu(1, "No native ad mappers");
            }
            zzdifVarZzah = zzdif.zzah(zzbpqVarZzE);
        }
        if (zzdifVarZzah != null) {
            zzfcj zzfcjVar = zzfcaVar.zza.zza;
            if (zzfcjVar.zzg.contains(Integer.toString(zzdifVarZzah.zzc()))) {
                zzdih zzdihVarZze = this.zzb.zze(new zzcrp(zzfcaVar, zzfboVar, zzeczVar.zza), new zzdir(zzdifVarZzah), new zzdkk(zzbpqVarZzE, zzbppVarZzD, zzbptVarZzd));
                ((zzees) zzeczVar.zzc).zzc(zzdihVarZze.zzk());
                zzdihVarZze.zzd().zzo(new zzcma((zzfdh) zzeczVar.zzb), this.zzc);
                return zzdihVarZze.zza();
            }
        }
        throw new zzegu(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzedc
    public final void zzb(zzfca zzfcaVar, zzfbo zzfboVar, zzecz zzeczVar) throws zzfcq {
        zzfdh zzfdhVar = (zzfdh) zzeczVar.zzb;
        zzfcj zzfcjVar = zzfcaVar.zza.zza;
        String string = zzfboVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbs.zzm(zzfboVar.zzs);
        zzbpk zzbpkVar = (zzbpk) zzeczVar.zzc;
        zzfcj zzfcjVar2 = zzfcaVar.zza.zza;
        zzfdhVar.zzp(this.zza, zzfcjVar.zzd, string, strZzm, zzbpkVar, zzfcjVar2.zzi, zzfcjVar2.zzg);
    }
}
