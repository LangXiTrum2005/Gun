package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzbxo implements zzgcd {
    final /* synthetic */ AI zza;

    public zzbxo(zzbxp zzbxpVar, AI ai) {
        this.zza = ai;
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final void zza(Throwable th) {
        zzbxp.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgcd
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbxp.zzc.remove(this.zza);
    }
}
