package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcpb implements zzher {
    private final zzcot zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;
    private final zzhfj zze;

    public zzcpb(zzcot zzcotVar, zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4) {
        this.zza = zzcotVar;
        this.zzb = zzhfjVar;
        this.zzc = zzhfjVar2;
        this.zzd = zzhfjVar3;
        this.zze = zzhfjVar4;
    }

    public static zzddk zza(zzcot zzcotVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfbo zzfboVar, final zzfcj zzfcjVar) {
        return new zzddk(new zzcxh() { // from class: com.google.android.gms.internal.ads.zzcor
            @Override // com.google.android.gms.internal.ads.zzcxh
            public final void zzs() {
                com.google.android.gms.ads.internal.util.zzay zzayVarZzt = com.google.android.gms.ads.internal.zzv.zzt();
                Context context2 = context;
                zzfcj zzfcjVar2 = zzfcjVar;
                zzayVarZzt.zzn(context2, versionInfoParcel.afmaVersion, zzfboVar.zzC.toString(), zzfcjVar2.zzf);
            }
        }, zzbzw.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (Context) this.zzb.zzb(), ((zzchs) this.zzc).zza(), ((zzcrq) this.zzd).zza(), ((zzcvk) this.zze).zza());
    }
}
