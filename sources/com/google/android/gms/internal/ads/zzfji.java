package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.dynamic.ObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Optional;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfji extends zzfkh {
    public zzfji(ClientApi clientApi, Context context, int i, zzbpe zzbpeVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzfjg zzfjgVar, Clock clock) {
        super(clientApi, context, i, zzbpeVar, zzftVar, zzcfVar, scheduledExecutorService, zzfjgVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final AI zza() {
        zzgdb zzgdbVarZze = zzgdb.zze();
        com.google.android.gms.ads.internal.client.zzby zzbyVarZze = this.zza.zze(ObjectWrapper.wrap(this.zzb), new com.google.android.gms.ads.internal.client.zzs(), this.zze.zza, this.zzd, this.zzc);
        if (zzbyVarZze != null) {
            try {
                zzbyVarZze.zzy(this.zze.zzc, new zzfjh(this, zzgdbVarZze, zzbyVarZze));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to load interstitial ad.", e);
                zzgdbVarZze.zzd(new zzfjc(1, "remote exception"));
            }
        } else {
            zzgdbVarZze.zzd(new zzfjc(1, "Failed to create an interstitial ad manager."));
        }
        return zzgdbVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final /* bridge */ /* synthetic */ Optional zzb(Object obj) {
        try {
            return Optional.ofNullable(((com.google.android.gms.ads.internal.client.zzby) obj).zzk());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for  the interstitial ad.", e);
            return Optional.empty();
        }
    }
}
