package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeyg implements zzezf {
    private zzcuz zza;
    private final Executor zzb = zzgcz.zzc();

    public final zzcuz zza() {
        return this.zza;
    }

    public final AI zzb(zzezg zzezgVar, zzeze zzezeVar, @Nullable zzcuz zzcuzVar) {
        zzcuy zzcuyVarZza = zzezeVar.zza(zzezgVar.zzb);
        zzcuyVarZza.zzb(new zzezj(true));
        zzcuz zzcuzVar2 = (zzcuz) zzcuyVarZza.zzh();
        this.zza = zzcuzVar2;
        final zzcsd zzcsdVarZzb = zzcuzVar2.zzb();
        final zzfef zzfefVar = new zzfef();
        return (zzgby) zzgch.zzm((zzgby) zzgch.zzn(zzgby.zzu(zzcsdVarZzb.zzi()), new zzgbo(this) { // from class: com.google.android.gms.internal.ads.zzeye
            @Override // com.google.android.gms.internal.ads.zzgbo
            public final AI zza(Object obj) {
                zzfca zzfcaVar = (zzfca) obj;
                zzfefVar.zzb = zzfcaVar;
                Iterator it = zzfcaVar.zzb.zza.iterator();
                boolean z = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfbo) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzgch.zzh(null);
                        }
                        z = true;
                    }
                }
                if (z) {
                    return zzcsdVarZzb.zzh(zzgch.zzh(zzfcaVar));
                }
                return zzgch.zzh(null);
            }
        }, this.zzb), new zzfuc() { // from class: com.google.android.gms.internal.ads.zzeyf
            @Override // com.google.android.gms.internal.ads.zzfuc
            public final Object apply(Object obj) {
                zzfef zzfefVar2 = zzfefVar;
                zzfefVar2.zzc = (zzcqz) obj;
                return zzfefVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* bridge */ /* synthetic */ AI zzc(zzezg zzezgVar, zzeze zzezeVar, @Nullable Object obj) {
        return zzb(zzezgVar, zzezeVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzezf
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
