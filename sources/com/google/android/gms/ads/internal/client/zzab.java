package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbxb;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2390Ej;

/* JADX INFO: loaded from: classes2.dex */
final class zzab extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbpe zzc;

    public zzab(zzba zzbaVar, Context context, String str, zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbpeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, C2390Ej.PLACEMENT_TYPE_REWARDED);
        return new zzfq();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzp(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return zzbxb.zza(this.zza, this.zzb, this.zzc);
    }
}
