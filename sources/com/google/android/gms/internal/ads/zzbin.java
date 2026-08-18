package com.google.android.gms.internal.ads;

import com.umeng.analytics.pro.bc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zzbin implements zzbjp {
    public final /* synthetic */ zzdds zza;
    public final /* synthetic */ zzcmk zzb;

    public /* synthetic */ zzbin(zzdds zzddsVar, zzcmk zzcmkVar) {
        this.zza = zzddsVar;
        this.zzb = zzcmkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjp
    public final void zza(Object obj, Map map) {
        zzcex zzcexVar = (zzcex) obj;
        zzbjo.zzc(map, this.zza);
        final String str = (String) map.get(bc.aN);
        if (str == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from click GMSG.");
            return;
        }
        final zzcmk zzcmkVar = this.zzb;
        zzgby zzgbyVarZzu = zzgby.zzu(zzbjo.zza(zzcexVar, str));
        zzgbo zzgboVar = new zzgbo() { // from class: com.google.android.gms.internal.ads.zzbiq
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj2) {
                zzcmk zzcmkVar2;
                String str2 = (String) obj2;
                zzbjp zzbjpVar = zzbjo.zza;
                return (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzjT)).booleanValue() && (zzcmkVar2 = zzcmkVar) != null && zzcmk.zzj(str)) ? zzcmkVar2.zzb(str2, com.google.android.gms.ads.internal.client.zzbc.zze()) : zzgch.zzh(str2);
            }
        };
        zzgcs zzgcsVar = zzbzw.zza;
        zzgch.zzr((zzgby) zzgch.zzn(zzgbyVarZzu, zzgboVar, zzgcsVar), new zzbjd(zzcexVar), zzgcsVar);
    }
}
