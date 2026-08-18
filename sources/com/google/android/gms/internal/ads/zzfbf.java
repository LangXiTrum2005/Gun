package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfbf extends zzbwo {
    private final zzfbb zza;
    private final zzfar zzb;
    private final String zzc;
    private final zzfcb zzd;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private final zzava zzg;
    private final zzdrw zzh;

    @Nullable
    private zzdoa zzi;
    private boolean zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaO)).booleanValue();

    public zzfbf(@Nullable String str, zzfbb zzfbbVar, Context context, zzfar zzfarVar, zzfcb zzfcbVar, VersionInfoParcel versionInfoParcel, zzava zzavaVar, zzdrw zzdrwVar) {
        this.zzc = str;
        this.zza = zzfbbVar;
        this.zzb = zzfarVar;
        this.zzd = zzfcbVar;
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzg = zzavaVar;
        this.zzh = zzdrwVar;
    }

    private final synchronized void zzu(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbww zzbwwVar, int i) throws RemoteException {
        try {
            if (!zzmVar.zzb()) {
                boolean z = false;
                if (((Boolean) zzbej.zzk.zze()).booleanValue()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                        z = true;
                    }
                }
                if (this.zzf.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlb)).intValue() || !z) {
                    Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
                }
            }
            this.zzb.zzk(zzbwwVar);
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzI(this.zze) && zzmVar.zzs == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load the ad because app ID is missing.");
                this.zzb.zzdz(zzfdk.zzd(4, null, null));
                return;
            }
            if (this.zzi != null) {
                return;
            }
            zzfat zzfatVar = new zzfat(null);
            this.zza.zzj(i);
            this.zza.zzb(zzmVar, this.zzc, zzfatVar, new zzfbe(this));
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final Bundle zzb() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdoa zzdoaVar = this.zzi;
        return zzdoaVar != null ? zzdoaVar.zza() : new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdy zzc() {
        zzdoa zzdoaVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgC)).booleanValue() && (zzdoaVar = this.zzi) != null) {
            return zzdoaVar.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    @Nullable
    public final zzbwm zzd() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdoa zzdoaVar = this.zzi;
        if (zzdoaVar != null) {
            return zzdoaVar.zzc();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    @Nullable
    public final synchronized String zze() throws RemoteException {
        zzdoa zzdoaVar = this.zzi;
        if (zzdoaVar == null || zzdoaVar.zzm() == null) {
            return null;
        }
        return zzdoaVar.zzm().zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzf(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbww zzbwwVar) throws RemoteException {
        zzu(zzmVar, zzbwwVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zzm zzmVar, zzbww zzbwwVar) throws RemoteException {
        zzu(zzmVar, zzbwwVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzh(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzj = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzi(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
        if (zzdoVar == null) {
            this.zzb.zzg(null);
        } else {
            this.zzb.zzg(new zzfbd(this, zzdoVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzj(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!zzdrVar.zzf()) {
                this.zzh.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzi(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzk(zzbws zzbwsVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzj(zzbwsVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzl(zzbxd zzbxdVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzfcb zzfcbVar = this.zzd;
        zzfcbVar.zza = zzbxdVar.zza;
        zzfcbVar.zzb = zzbxdVar.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzm(IObjectWrapper iObjectWrapper) throws RemoteException {
        zzn(iObjectWrapper, this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final synchronized void zzn(IObjectWrapper iObjectWrapper, boolean z) throws RemoteException {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        if (this.zzi == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Rewarded can not be shown before loaded");
            this.zzb.zzq(zzfdk.zzd(9, null, null));
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcT)).booleanValue()) {
            this.zzg.zzc().zzn(new Throwable().getStackTrace());
        }
        this.zzi.zzh(z, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final boolean zzo() {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzdoa zzdoaVar = this.zzi;
        return (zzdoaVar == null || zzdoaVar.zzf()) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbwp
    public final void zzp(zzbwx zzbwxVar) {
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        this.zzb.zzo(zzbwxVar);
    }
}
