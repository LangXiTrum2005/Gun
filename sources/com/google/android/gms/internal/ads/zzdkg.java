package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdkg implements zzcwn {
    private final zzdif zza;
    private final zzdik zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdkg(zzdif zzdifVar, zzdik zzdikVar, Executor executor, Executor executor2) {
        this.zza = zzdifVar;
        this.zzb = zzdikVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzcex zzcexVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdke
            @Override // java.lang.Runnable
            public final void run() {
                zzcexVar.zzd("onSdkImpression", new ArrayMap());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdif zzdifVar = this.zza;
            zzecr zzecrVarZzu = zzdifVar.zzu();
            if (zzecrVarZzu == null && zzdifVar.zzw() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfl)).booleanValue()) {
                zzdif zzdifVar2 = this.zza;
                AI aiZzw = zzdifVar2.zzw();
                zzcab zzcabVarZzp = zzdifVar2.zzp();
                if (aiZzw == null || zzcabVarZzp == null) {
                    return;
                }
                zzgch.zzr(zzgch.zzl(aiZzw, zzcabVarZzp), new zzdkf(this), this.zzd);
                return;
            }
            if (zzecrVarZzu != null) {
                zzdif zzdifVar3 = this.zza;
                zzcex zzcexVarZzr = zzdifVar3.zzr();
                zzcex zzcexVarZzs = zzdifVar3.zzs();
                if (zzcexVarZzr == null) {
                    zzcexVarZzr = zzcexVarZzs != null ? zzcexVarZzs : null;
                }
                if (zzcexVarZzr != null) {
                    zzb(zzcexVarZzr);
                }
            }
        }
    }
}
