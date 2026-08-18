package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzedj implements zzdgc {
    private final VersionInfoParcel zza;
    private final AI zzb;
    private final zzfbo zzc;
    private final zzcex zzd;
    private final zzfcj zze;
    private final zzbjs zzf;
    private final boolean zzg;
    private final zzebv zzh;
    private final zzdrw zzi;

    public zzedj(VersionInfoParcel versionInfoParcel, AI ai, zzfbo zzfboVar, zzcex zzcexVar, zzfcj zzfcjVar, boolean z, zzbjs zzbjsVar, zzebv zzebvVar, zzdrw zzdrwVar) {
        this.zza = versionInfoParcel;
        this.zzb = ai;
        this.zzc = zzfboVar;
        this.zzd = zzcexVar;
        this.zze = zzfcjVar;
        this.zzg = z;
        this.zzf = zzbjsVar;
        this.zzh = zzebvVar;
        this.zzi = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context, zzcwg zzcwgVar) {
        int i;
        zzcnx zzcnxVar = (zzcnx) zzgch.zzq(this.zzb);
        this.zzd.zzaq(true);
        boolean zZze = this.zzg ? this.zzf.zze(true) : true;
        boolean z2 = this.zzg;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, true, z2 ? this.zzf.zzd() : false, z2 ? this.zzf.zza() : 0.0f, -1, z, this.zzc.zzO, false);
        if (zzcwgVar != null) {
            zzcwgVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        zzdfr zzdfrVarZzg = zzcnxVar.zzg();
        zzcex zzcexVar = this.zzd;
        int i2 = this.zzc.zzQ;
        if (i2 == -1) {
            com.google.android.gms.ads.internal.client.zzy zzyVar = this.zze.zzj;
            if (zzyVar != null) {
                int i3 = zzyVar.zza;
                if (i3 == 1) {
                    i = 7;
                } else if (i3 == 2) {
                    i = 6;
                }
            }
            com.google.android.gms.ads.internal.util.client.zzo.zze("Error setting app open orientation; no targeting orientation available.");
            i2 = this.zzc.zzQ;
            i = i2;
        } else {
            i = i2;
        }
        VersionInfoParcel versionInfoParcel = this.zza;
        zzfbo zzfboVar = this.zzc;
        String str = zzfboVar.zzB;
        zzfbt zzfbtVar = zzfboVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdfrVarZzg, null, zzcexVar, i, versionInfoParcel, str, zzlVar, zzfbtVar.zzb, zzfbtVar.zza, this.zze.zzf, zzcwgVar, zzfboVar.zzb() ? this.zzh : null, this.zzd.zzr()), true, this.zzi);
    }
}
