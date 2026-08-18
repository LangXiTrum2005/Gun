package com.google.android.gms.internal.ads;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdxe implements zzdyg {
    private static final Pattern zza = Pattern.compile("Received error HTTP response code: (.*)");
    private final zzdwg zzb;
    private final zzgcs zzc;
    private final zzfcj zzd;
    private final ScheduledExecutorService zze;
    private final zzeag zzf;
    private final zzfhh zzg;
    private final Context zzh;

    public zzdxe(Context context, zzfcj zzfcjVar, zzdwg zzdwgVar, zzgcs zzgcsVar, ScheduledExecutorService scheduledExecutorService, zzeag zzeagVar, zzfhh zzfhhVar) {
        this.zzh = context;
        this.zzd = zzfcjVar;
        this.zzb = zzdwgVar;
        this.zzc = zzgcsVar;
        this.zze = scheduledExecutorService;
        this.zzf = zzeagVar;
        this.zzg = zzfhhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyg
    public final AI zzb(zzbvk zzbvkVar) {
        Context context = this.zzh;
        AI aiZzc = this.zzb.zzc(zzbvkVar);
        zzfgw zzfgwVarZza = zzfgv.zza(context, 11);
        zzfhg.zzd(aiZzc, zzfgwVarZza);
        AI aiZzn = zzgch.zzn(aiZzc, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxb
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                return this.zza.zzc((zzdyi) obj);
            }
        }, this.zzc);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfx)).booleanValue()) {
            aiZzn = zzgch.zzf(zzgch.zzo(aiZzn, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfy)).intValue(), TimeUnit.SECONDS, this.zze), TimeoutException.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzdxc
                @Override // com.google.android.gms.internal.ads.zzgbo
                public final AI zza(Object obj) {
                    return zzgch.zzg(new zzdvy(5));
                }
            }, zzbzw.zzg);
        }
        zzfhg.zza(aiZzn, this.zzg, zzfgwVarZza);
        zzgch.zzr(aiZzn, new zzdxd(this), zzbzw.zzg);
        return aiZzn;
    }

    public final /* synthetic */ AI zzc(zzdyi zzdyiVar) throws Exception {
        return zzgch.zzh(new zzfca(new zzfbx(this.zzd), zzfbz.zza(new InputStreamReader(zzdyiVar.zzb()), zzdyiVar.zza())));
    }
}
