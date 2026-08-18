package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.unity3d.services.core.di.ServiceProvider;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.B30;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzfnr implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    @VisibleForTesting
    protected final zzfop zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfni zzf;
    private final long zzg;
    private final int zzh;

    public zzfnr(Context context, int i, int i2, String str, String str2, String str3, zzfni zzfniVar) {
        this.zzb = str;
        this.zzh = i2;
        this.zzc = str2;
        this.zzf = zzfniVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfop zzfopVar = new zzfop(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfopVar;
        this.zzd = new LinkedBlockingQueue();
        zzfopVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i, long j, Exception exc) {
        this.zzf.zzc(i, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfou zzfouVarZzc = zzc();
        if (zzfouVarZzc != null) {
            try {
                zzfpb zzfpbVarZzf = zzfouVarZzc.zzf(new zzfoz(1, this.zzh, this.zzb, this.zzc));
                zzd(5011, this.zzg, null);
                this.zzd.put(zzfpbVarZzf);
            } catch (Throwable th) {
                try {
                    zzd(B30.AD_WILL_CLOSE_VALUE, this.zzg, new Exception(th));
                } finally {
                    zzb();
                    this.zze.quit();
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            zzd(4012, this.zzg, null);
            this.zzd.put(new zzfpb(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new zzfpb(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfpb zza(int i) {
        zzfpb zzfpbVar;
        try {
            zzfpbVar = (zzfpb) this.zzd.poll(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            zzd(2009, this.zzg, e);
            zzfpbVar = null;
        }
        zzd(3004, this.zzg, null);
        if (zzfpbVar != null) {
            if (zzfpbVar.zzc == 7) {
                zzfni.zzg(3);
            } else {
                zzfni.zzg(2);
            }
        }
        return zzfpbVar == null ? new zzfpb(null, 1) : zzfpbVar;
    }

    public final void zzb() {
        zzfop zzfopVar = this.zza;
        if (zzfopVar != null) {
            if (zzfopVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfou zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
