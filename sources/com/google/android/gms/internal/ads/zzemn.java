package com.google.android.gms.internal.ads;

import android.os.Bundle;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class zzemn implements zzetr {
    private final zzgcs zza;
    private final zzdpm zzb;
    private final zzdua zzc;
    private final zzemp zzd;

    public zzemn(zzgcs zzgcsVar, zzdpm zzdpmVar, zzdua zzduaVar, zzemp zzempVar) {
        this.zza = zzgcsVar;
        this.zzb = zzdpmVar;
        this.zzc = zzduaVar;
        this.zzd = zzempVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        zzbcc zzbccVar = zzbcl.zzlx;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue() && this.zzd.zza() != null) {
            zzemo zzemoVarZza = this.zzd.zza();
            zzemoVarZza.getClass();
            return zzgch.zzh(zzemoVarZza);
        }
        if (zzfve.zzd((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbz)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).booleanValue() && (this.zzd.zzd() || !this.zzc.zzt()))) {
            return zzgch.zzh(new zzemo(new Bundle()));
        }
        this.zzd.zzc(true);
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzemm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzemo zzc() throws Exception {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbz)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfdh zzfdhVarZzc = this.zzb.zzc(str, new JSONObject());
                zzfdhVarZzc.zzC();
                boolean zZzt = this.zzc.zzt();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlx)).booleanValue() || zZzt) {
                    try {
                        zzbrs zzbrsVarZzf = zzfdhVarZzc.zzf();
                        if (zzbrsVarZzf != null) {
                            bundle2.putString("sdk_version", zzbrsVarZzf.toString());
                        }
                    } catch (zzfcq unused) {
                    }
                }
                try {
                    zzbrs zzbrsVarZze = zzfdhVarZzc.zze();
                    if (zzbrsVarZze != null) {
                        bundle2.putString("adapter_version", zzbrsVarZze.toString());
                    }
                } catch (zzfcq unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfcq unused3) {
            }
        }
        zzemo zzemoVar = new zzemo(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlx)).booleanValue()) {
            this.zzd.zzb(zzemoVar);
        }
        return zzemoVar;
    }
}
