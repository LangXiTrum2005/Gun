package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdhn extends zzbfs {
    private final zzdif zza;
    private IObjectWrapper zzb;

    public zzdhn(zzdif zzdifVar) {
        this.zza = zzdifVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zze() throws RemoteException {
        if (this.zza.zzb() != 0.0f) {
            return this.zza.zzb();
        }
        if (this.zza.zzj() != null) {
            try {
                return this.zza.zzj().zze();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Remote exception getting video controller aspect ratio.", e);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        zzbfw zzbfwVarZzm = this.zza.zzm();
        if (zzbfwVarZzm == null) {
            return 0.0f;
        }
        float fZzd = (zzbfwVarZzm.zzd() == -1 || zzbfwVarZzm.zzc() == -1) ? 0.0f : zzbfwVarZzm.zzd() / zzbfwVarZzm.zzc();
        return fZzd == 0.0f ? zzb(zzbfwVarZzm.zzf()) : fZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzf() throws RemoteException {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzf();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final float zzg() throws RemoteException {
        if (this.zza.zzj() != null) {
            return this.zza.zzj().zzg();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        return this.zza.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    @Nullable
    public final IObjectWrapper zzi() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbfw zzbfwVarZzm = this.zza.zzm();
        if (zzbfwVarZzm == null) {
            return null;
        }
        return zzbfwVarZzm.zzf();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzj(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzk() throws RemoteException {
        return this.zza.zzaf();
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final boolean zzl() throws RemoteException {
        return this.zza.zzj() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbft
    public final void zzm(zzbhe zzbheVar) {
        if (this.zza.zzj() instanceof zzcfz) {
            ((zzcfz) this.zza.zzj()).zzv(zzbheVar);
        }
    }
}
