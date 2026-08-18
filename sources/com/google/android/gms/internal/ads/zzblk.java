package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes3.dex */
final class zzblk implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcab zza;
    final /* synthetic */ zzblm zzb;

    public zzblk(zzblm zzblmVar, zzcab zzcabVar) {
        this.zza = zzcabVar;
        this.zzb = zzblmVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        try {
            this.zza.zzc(this.zzb.zza.zzp());
        } catch (DeadObjectException e) {
            this.zza.zzd(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.zza.zzd(new RuntimeException(AbstractC3950lJ.p("onConnectionSuspended: ", i)));
    }
}
