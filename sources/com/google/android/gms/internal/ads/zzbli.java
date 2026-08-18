package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;

/* JADX INFO: loaded from: classes3.dex */
final class zzbli implements zzgbo {
    final /* synthetic */ zzbla zza;

    public zzbli(zzblm zzblmVar, zzbla zzblaVar) {
        this.zza = zzblaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* bridge */ /* synthetic */ AI zza(Object obj) throws Exception {
        zzcab zzcabVar = new zzcab();
        ((zzblg) obj).zze(this.zza, new zzblh(this, zzcabVar));
        return zzcabVar;
    }
}
