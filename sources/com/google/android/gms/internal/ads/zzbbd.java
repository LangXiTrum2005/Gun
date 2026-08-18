package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.BaseGmsClient;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbd implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzbav zza;
    final /* synthetic */ zzcab zzb;
    final /* synthetic */ zzbbf zzc;

    public zzbbd(zzbbf zzbbfVar, zzbav zzbavVar, zzcab zzcabVar) {
        this.zza = zzbavVar;
        this.zzb = zzcabVar;
        this.zzc = zzbbfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(@Nullable Bundle bundle) {
        synchronized (this.zzc.zzd) {
            try {
                zzbbf zzbbfVar = this.zzc;
                if (zzbbfVar.zzb) {
                    return;
                }
                zzbbfVar.zzb = true;
                final zzbau zzbauVar = this.zzc.zza;
                if (zzbauVar == null) {
                    return;
                }
                zzgcs zzgcsVar = zzbzw.zza;
                final zzbav zzbavVar = this.zza;
                final zzcab zzcabVar = this.zzb;
                final AI aiZza = zzgcsVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbba
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbbd zzbbdVar = this.zza;
                        zzbau zzbauVar2 = zzbauVar;
                        zzcab zzcabVar2 = zzcabVar;
                        try {
                            zzbax zzbaxVarZzq = zzbauVar2.zzq();
                            boolean zZzp = zzbauVar2.zzp();
                            zzbav zzbavVar2 = zzbavVar;
                            zzbas zzbasVarZzg = zZzp ? zzbaxVarZzq.zzg(zzbavVar2) : zzbaxVarZzq.zzf(zzbavVar2);
                            if (!zzbasVarZzg.zze()) {
                                zzcabVar2.zzd(new RuntimeException("No entry contents."));
                                zzbbf.zze(zzbbdVar.zzc);
                                return;
                            }
                            zzbbc zzbbcVar = new zzbbc(zzbbdVar, zzbasVarZzg.zzc(), 1);
                            int i = zzbbcVar.read();
                            if (i == -1) {
                                throw new IOException("Unable to read from cache.");
                            }
                            zzbbcVar.unread(i);
                            zzcabVar2.zzc(zzbbh.zzb(zzbbcVar, zzbasVarZzg.zzd(), zzbasVarZzg.zzg(), zzbasVarZzg.zza(), zzbasVarZzg.zzf()));
                        } catch (RemoteException e) {
                            e = e;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e);
                            zzcabVar2.zzd(e);
                            zzbbf.zze(zzbbdVar.zzc);
                        } catch (IOException e2) {
                            e = e2;
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to obtain a cache service instance.", e);
                            zzcabVar2.zzd(e);
                            zzbbf.zze(zzbbdVar.zzc);
                        }
                    }
                });
                final zzcab zzcabVar2 = this.zzb;
                zzcabVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbbb
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzcabVar2.isCancelled()) {
                            aiZza.cancel(true);
                        }
                    }
                }, zzbzw.zzg);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
