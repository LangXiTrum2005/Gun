package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzeey implements zzdgc {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final AI zzc;
    private final zzfbo zzd;
    private final zzcex zze;
    private final zzfcj zzf;
    private final zzbjs zzg;
    private final boolean zzh;
    private final zzebv zzi;
    private final zzdrw zzj;

    public zzeey(Context context, VersionInfoParcel versionInfoParcel, AI ai, zzfbo zzfboVar, zzcex zzcexVar, zzfcj zzfcjVar, boolean z, zzbjs zzbjsVar, zzebv zzebvVar, zzdrw zzdrwVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = ai;
        this.zzd = zzfboVar;
        this.zze = zzcexVar;
        this.zzf = zzfcjVar;
        this.zzg = zzbjsVar;
        this.zzh = z;
        this.zzi = zzebvVar;
        this.zzj = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgc
    public final void zza(boolean z, Context context, zzcwg zzcwgVar) {
        zzder zzderVar = (zzder) zzgch.zzq(this.zzc);
        this.zze.zzaq(true);
        boolean zZze = this.zzh ? this.zzg.zze(false) : false;
        com.google.android.gms.ads.internal.zzv.zzq();
        Context context2 = this.zza;
        boolean z2 = this.zzh;
        com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZze, com.google.android.gms.ads.internal.util.zzs.zzJ(context2), z2 ? this.zzg.zzd() : false, this.zzh ? this.zzg.zza() : 0.0f, -1, z, this.zzd.zzO, false);
        if (zzcwgVar != null) {
            zzcwgVar.zzf();
        }
        com.google.android.gms.ads.internal.zzv.zzj();
        zzdfr zzdfrVarZzh = zzderVar.zzh();
        zzcex zzcexVar = this.zze;
        zzfbo zzfboVar = this.zzd;
        VersionInfoParcel versionInfoParcel = this.zzb;
        int i = zzfboVar.zzQ;
        String str = zzfboVar.zzB;
        zzfbt zzfbtVar = zzfboVar.zzs;
        com.google.android.gms.ads.internal.overlay.zzn.zza(context, new AdOverlayInfoParcel(null, zzdfrVarZzh, null, zzcexVar, i, versionInfoParcel, str, zzlVar, zzfbtVar.zzb, zzfbtVar.zza, this.zzf.zzf, zzcwgVar, zzfboVar.zzb() ? this.zzi : null, this.zze.zzr()), true, this.zzj);
    }
}
