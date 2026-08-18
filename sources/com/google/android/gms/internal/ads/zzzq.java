package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzzq extends HandlerThread implements Handler.Callback {
    private zzdd zza;
    private Handler zzb;

    @Nullable
    private Error zzc;

    @Nullable
    private RuntimeException zzd;

    @Nullable
    private zzzs zze;

    public zzzq() {
        super("ExoPlayer:PlaceholderSurface");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i == 1) {
                try {
                    int i2 = message.arg1;
                    zzdd zzddVar = this.zza;
                    zzddVar.getClass();
                    zzddVar.zzb(i2);
                    this.zze = new zzzs(this, this.zza.zza(), i2 != 0, null);
                    synchronized (this) {
                        notify();
                    }
                } catch (zzde e) {
                    zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e);
                    this.zzd = new IllegalStateException(e);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e2);
                    this.zzc = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    zzdo.zzd("PlaceholderSurface", "Failed to initialize placeholder surface", e3);
                    this.zzd = e3;
                    synchronized (this) {
                        notify();
                    }
                }
            } else if (i == 2) {
                try {
                    zzdd zzddVar2 = this.zza;
                    zzddVar2.getClass();
                    zzddVar2.zzc();
                } catch (Throwable th) {
                    try {
                        zzdo.zzd("PlaceholderSurface", "Failed to release placeholder surface", th);
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }

    public final zzzs zza(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.zzb = handler;
        this.zza = new zzdd(handler, null);
        synchronized (this) {
            z = false;
            this.zzb.obtainMessage(1, i, 0).sendToTarget();
            while (this.zze == null && this.zzd == null && this.zzc == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.zzd;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.zzc;
        if (error != null) {
            throw error;
        }
        zzzs zzzsVar = this.zze;
        zzzsVar.getClass();
        return zzzsVar;
    }

    public final void zzb() {
        Handler handler = this.zzb;
        handler.getClass();
        handler.sendEmptyMessage(2);
    }
}
