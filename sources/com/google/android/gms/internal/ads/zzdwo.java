package com.google.android.gms.internal.ads;

import android.content.Context;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdwo implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;
    private final zzhfj zzc;
    private final zzhfj zzd;

    public zzdwo(zzhfj zzhfjVar, zzhfj zzhfjVar2, zzhfj zzhfjVar3, zzhfj zzhfjVar4, zzhfj zzhfjVar5) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
        this.zzc = zzhfjVar3;
        this.zzd = zzhfjVar4;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x004f  */
    /* JADX WARN: Code duplicated, block: B:8:0x006d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    public final /* synthetic */ Object zzb() {
        AI aiZzb;
        final zzava zzavaVar = (zzava) this.zza.zzb();
        final Context contextZza = ((zzche) this.zzb).zza();
        zzfcj zzfcjVarZza = ((zzcvk) this.zzc).zza();
        long jLongValue = ((Long) this.zzd.zzb()).longValue();
        zzgcs zzgcsVarZzc = zzffh.zzc();
        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcO)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzb(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(zzfcjVarZza.zzd)))) {
                if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jLongValue < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcQ)).intValue()) {
                    aiZzb = zzgcsVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwi
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzavaVar.zzc().zzg(contextZza);
                        }
                    });
                } else {
                    aiZzb = zzgcsVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwj
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzavaVar.zzc().zzf(contextZza);
                        }
                    });
                }
            } else {
                aiZzb = zzgcsVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzavaVar.zzc().zzf(contextZza);
                    }
                });
            }
        } else {
            if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - jLongValue < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcQ)).intValue()) {
                aiZzb = zzgcsVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwi
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzavaVar.zzc().zzg(contextZza);
                    }
                });
            } else {
                aiZzb = zzgcsVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdwj
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzavaVar.zzc().zzf(contextZza);
                    }
                });
            }
        }
        zzhez.zzb(aiZzb);
        return aiZzb;
    }
}
