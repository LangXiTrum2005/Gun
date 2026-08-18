package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdie extends com.google.android.gms.ads.internal.client.zzea {
    private final Object zza = new Object();

    @Nullable
    private final com.google.android.gms.ads.internal.client.zzeb zzb;

    @Nullable
    private final zzbpt zzc;

    public zzdie(@Nullable com.google.android.gms.ads.internal.client.zzeb zzebVar, @Nullable zzbpt zzbptVar) {
        this.zzb = zzebVar;
        this.zzc = zzbptVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() throws RemoteException {
        zzbpt zzbptVar = this.zzc;
        if (zzbptVar != null) {
            return zzbptVar.zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() throws RemoteException {
        zzbpt zzbptVar = this.zzc;
        if (zzbptVar != null) {
            return zzbptVar.zzh();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
                if (zzebVar == null) {
                    return null;
                }
                return zzebVar.zzi();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(@Nullable com.google.android.gms.ads.internal.client.zzee zzeeVar) throws RemoteException {
        synchronized (this.zza) {
            try {
                com.google.android.gms.ads.internal.client.zzeb zzebVar = this.zzb;
                if (zzebVar != null) {
                    zzebVar.zzm(zzeeVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
