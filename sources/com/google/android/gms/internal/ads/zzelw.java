package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelw implements zzetr {
    private final zzgcs zza;
    private final zzfcj zzb;

    public zzelw(zzgcs zzgcsVar, zzfcj zzfcjVar, zzfcy zzfcyVar) {
        this.zza = zzgcsVar;
        this.zzb = zzfcjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final int zza() {
        return 5;
    }

    @Override // com.google.android.gms.internal.ads.zzetr
    public final AI zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzelv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.zza.zzc();
            }
        });
    }

    public final /* synthetic */ zzelx zzc() throws Exception {
        String strZza = null;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgR)).booleanValue() && "requester_type_2".equals(com.google.android.gms.ads.nonagon.signalgeneration.zzaa.zzc(this.zzb.zzd))) {
            strZza = zzfcy.zza();
        }
        return new zzelx(strZza);
    }
}
