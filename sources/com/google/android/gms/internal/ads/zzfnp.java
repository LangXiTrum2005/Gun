package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
@VisibleForTesting
final class zzfnp implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {

    @VisibleForTesting
    protected final zzfop zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfnp(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfop zzfopVar = new zzfop(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfopVar;
        this.zzd = new LinkedBlockingQueue();
        zzfopVar.checkAvailabilityAndConnect();
    }

    @VisibleForTesting
    public static zzasy zza() {
        zzasc zzascVarZza = zzasy.zza();
        zzascVarZza.zzD(PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID);
        return (zzasy) zzascVarZza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzfou zzfouVarZzd = zzd();
        if (zzfouVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfouVarZzd.zze(new zzfoq(this.zzb, this.zzc)).zza());
                } catch (InterruptedException unused) {
                } finally {
                    zzc();
                    this.zze.quit();
                }
            } catch (Throwable unused2) {
                this.zzd.put(zza());
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzasy zzb(int i) {
        zzasy zzasyVar;
        try {
            zzasyVar = (zzasy) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzasyVar = null;
        }
        return zzasyVar == null ? zza() : zzasyVar;
    }

    public final void zzc() {
        zzfop zzfopVar = this.zza;
        if (zzfopVar != null) {
            if (zzfopVar.isConnected() || this.zza.isConnecting()) {
                this.zza.disconnect();
            }
        }
    }

    public final zzfou zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
