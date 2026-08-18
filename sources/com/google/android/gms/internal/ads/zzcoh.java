package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcoh extends zzbac {
    private final zzcog zza;
    private final com.google.android.gms.ads.internal.client.zzby zzb;
    private final zzexm zzc;
    private boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaR)).booleanValue();
    private final zzdrw zze;

    public zzcoh(zzcog zzcogVar, com.google.android.gms.ads.internal.client.zzby zzbyVar, zzexm zzexmVar, zzdrw zzdrwVar) {
        this.zza = zzcogVar;
        this.zzb = zzbyVar;
        this.zzc = zzexmVar;
        this.zze = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final com.google.android.gms.ads.internal.client.zzby zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdy zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgC)).booleanValue()) {
            return this.zza.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzg(boolean z) {
        this.zzd = z;
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzh(com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        Preconditions.checkMainThread("setOnPaidEventListener must be called on the main UI thread.");
        if (this.zzc != null) {
            try {
                if (!zzdrVar.zzf()) {
                    this.zze.zze();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
            }
            this.zzc.zzn(zzdrVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbad
    public final void zzi(IObjectWrapper iObjectWrapper, zzbak zzbakVar) {
        try {
            this.zzc.zzp(zzbakVar);
            this.zza.zzd((Activity) ObjectWrapper.unwrap(iObjectWrapper), zzbakVar, this.zzd);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }
}
