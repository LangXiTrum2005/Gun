package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzftn {
    private final zzfvf zza;
    private final Context zzb;
    private final zzfto zzc;
    private boolean zzf;
    private final Intent zzg;

    @Nullable
    private ServiceConnection zzi;

    @Nullable
    private IInterface zzj;
    private final List zze = new ArrayList();
    private final String zzd = "OverlayDisplayService";
    private final IBinder.DeathRecipient zzh = new IBinder.DeathRecipient() { // from class: com.google.android.gms.internal.ads.zzftf
        @Override // android.os.IBinder.DeathRecipient
        public final void binderDied() {
            this.zza.zzk();
        }
    };

    public zzftn(Context context, zzfto zzftoVar, String str, Intent intent, zzfss zzfssVar) {
        this.zzb = context;
        this.zzc = zzftoVar;
        final String str2 = "OverlayDisplayService";
        this.zzg = intent;
        this.zza = zzfvj.zza(new zzfvf(str2) { // from class: com.google.android.gms.internal.ads.zzfte
            public final /* synthetic */ String zza = "OverlayDisplayService";

            @Override // com.google.android.gms.internal.ads.zzfvf
            public final Object zza() {
                HandlerThread handlerThread = new HandlerThread(this.zza, 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzo(final Runnable runnable) {
        ((Handler) this.zza.zza()).post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzftg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzl(runnable);
            }
        });
    }

    @Nullable
    public final IInterface zzc() {
        return this.zzj;
    }

    public final void zzi(final Runnable runnable) {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfth
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzj(runnable);
            }
        });
    }

    public final /* synthetic */ void zzj(Runnable runnable) {
        if (this.zzj != null || this.zzf) {
            if (!this.zzf) {
                runnable.run();
                return;
            }
            this.zzc.zzc("Waiting to bind to the service.", new Object[0]);
            synchronized (this.zze) {
                this.zze.add(runnable);
            }
            return;
        }
        this.zzc.zzc("Initiate binding to the service.", new Object[0]);
        synchronized (this.zze) {
            this.zze.add(runnable);
        }
        zzftl zzftlVar = new zzftl(this, null);
        this.zzi = zzftlVar;
        this.zzf = true;
        if (this.zzb.bindService(this.zzg, zzftlVar, 1)) {
            return;
        }
        this.zzc.zzc("Failed to bind to the service.", new Object[0]);
        this.zzf = false;
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    public final /* synthetic */ void zzk() {
        this.zzc.zzc("%s : Binder has died.", this.zzd);
        synchronized (this.zze) {
            this.zze.clear();
        }
    }

    public final /* synthetic */ void zzl(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            this.zzc.zza("error caused by ", e);
        }
    }

    public final /* synthetic */ void zzm() {
        if (this.zzj != null) {
            this.zzc.zzc("Unbind from service.", new Object[0]);
            Context context = this.zzb;
            ServiceConnection serviceConnection = this.zzi;
            serviceConnection.getClass();
            context.unbindService(serviceConnection);
            this.zzf = false;
            this.zzj = null;
            this.zzi = null;
            synchronized (this.zze) {
                this.zze.clear();
            }
        }
    }

    public final void zzn() {
        zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfti
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzm();
            }
        });
    }
}
