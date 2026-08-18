package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.offline.DownloadService;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
public final class zzenl implements zzetr {
    final Context zza;
    private final String zzb;
    private final String zzc;
    private final long zzd;
    private final zzcsp zze;
    private final zzfdq zzf;
    private final zzfcj zzg;
    private final com.google.android.gms.ads.internal.util.zzg zzh = com.google.android.gms.ads.internal.zzv.zzp().zzi();
    private final zzdrq zzi;
    private final zzctc zzj;

    public zzenl(Context context, String str, String str2, zzcsp zzcspVar, zzfdq zzfdqVar, zzfcj zzfcjVar, zzdrq zzdrqVar, zzctc zzctcVar, long j) {
        this.zza = context;
        this.zzb = str;
        this.zzc = str2;
        this.zze = zzcspVar;
        this.zzf = zzfdqVar;
        this.zzg = zzfcjVar;
        this.zzi = zzdrqVar;
        this.zzj = zzctcVar;
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 12;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        Bundle bundle = new Bundle();
        this.zzi.zzb().put("seq_num", this.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue()) {
            this.zzi.zzc("tsacc", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zzd));
            zzdrq zzdrqVar = this.zzi;
            com.google.android.gms.ads.internal.zzv.zzq();
            zzdrqVar.zzc(DownloadService.KEY_FOREGROUND, true != com.google.android.gms.ads.internal.util.zzs.zzH(this.zza) ? "1" : "0");
        }
        this.zze.zzk(this.zzg.zzd);
        bundle.putAll(this.zzf.zzb());
        return zzgch.zzh(new zzenm(this.zza, bundle, this.zzb, this.zzc, this.zzh, this.zzg.zzf, this.zzj));
    }
}
