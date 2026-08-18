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
public final class zzfjf extends zzfkh {
    public zzfjf(ClientApi clientApi, Context context, int i, zzbpe zzbpeVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzfjg zzfjgVar, Clock clock) {
        super(clientApi, context, i, zzbpeVar, zzftVar, zzcfVar, scheduledExecutorService, zzfjgVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final AI zza() {
        zzgdb zzgdbVarZze = zzgdb.zze();
        com.google.android.gms.ads.internal.client.zzby zzbyVarZzc = this.zza.zzc(ObjectWrapper.wrap(this.zzb), com.google.android.gms.ads.internal.client.zzs.zzb(), this.zze.zza, this.zzd, this.zzc);
        if (zzbyVarZzc != null) {
            try {
                zzbyVarZzc.zzH(new zzfje(this, zzgdbVarZze, this.zze));
                zzbyVarZzc.zzab(this.zze.zzc);
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to load app open ad.", e);
                zzgdbVarZze.zzd(new zzfjc(1, "remote exception"));
            }
        } else {
            zzgdbVarZze.zzd(new zzfjc(1, "Failed to create an app open ad manager."));
        }
        return zzgdbVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final /* bridge */ /* synthetic */ Optional zzb(Object obj) {
        try {
            return Optional.ofNullable(((zzbad) obj).zzf());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for the app open ad.", e);
            return Optional.empty();
        }
    }
}
