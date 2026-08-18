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
public final class zzfkl extends zzfkh {
    public zzfkl(ClientApi clientApi, Context context, int i, zzbpe zzbpeVar, com.google.android.gms.ads.internal.client.zzft zzftVar, com.google.android.gms.ads.internal.client.zzcf zzcfVar, ScheduledExecutorService scheduledExecutorService, zzfjg zzfjgVar, Clock clock) {
        super(clientApi, context, i, zzbpeVar, zzftVar, zzcfVar, scheduledExecutorService, zzfjgVar, clock);
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final AI zza() {
        zzgdb zzgdbVarZze = zzgdb.zze();
        zzbwp zzbwpVarZzp = this.zza.zzp(ObjectWrapper.wrap(this.zzb), this.zze.zza, this.zzd, this.zzc);
        zzfkk zzfkkVar = new zzfkk(this, zzgdbVarZze, zzbwpVarZzp);
        if (zzbwpVarZzp != null) {
            try {
                zzbwpVarZzp.zzf(this.zze.zzc, zzfkkVar);
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to load rewarded ad.");
                zzgdbVarZze.zzd(new zzfjc(1, "remote exception"));
            }
        } else {
            zzgdbVarZze.zzd(new zzfjc(1, "Failed to create a rewarded ad."));
        }
        return zzgdbVarZze;
    }

    @Override // com.google.android.gms.internal.ads.zzfkh
    public final /* bridge */ /* synthetic */ Optional zzb(Object obj) {
        try {
            return Optional.ofNullable(((zzbwp) obj).zzc());
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get response info for the rewarded ad.", e);
            return Optional.empty();
        }
    }
}
