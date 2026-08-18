package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;

/* JADX INFO: loaded from: classes2.dex */
final class zzat extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpe zzb;
    final /* synthetic */ zzba zzc;

    public zzat(zzba zzbaVar, Context context, zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = zzbpeVar;
        this.zzc = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "ads_preloader");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        zzci zzciVarZzg = zzcpVar.zzg(ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
        zzciVarZzg.zzh(this.zzb);
        return zzciVarZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzci zzcgVar;
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbcl.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            return this.zzc.zzh.zza(this.zza, this.zzb);
        }
        try {
            IBinder iBinderZze = ((zzcj) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdPreloaderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzas
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloaderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzcj ? (zzcj) iInterfaceQueryLocalInterface : new zzcj(iBinder);
                }
            })).zze(iObjectWrapperWrap, this.zzb, 244410000);
            if (iBinderZze == null) {
                zzcgVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
                zzcgVar = iInterfaceQueryLocalInterface instanceof zzci ? (zzci) iInterfaceQueryLocalInterface : new zzcg(iBinderZze);
            }
            zzcgVar.zzh(this.zzb);
            return zzcgVar;
        } catch (RemoteException e) {
            e = e;
            this.zzc.zzg = zzbuh.zza(this.zza);
            this.zzc.zzg.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            this.zzc.zzg = zzbuh.zza(this.zza);
            this.zzc.zzg.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.zzc.zzg = zzbuh.zza(this.zza);
            this.zzc.zzg.zzh(e, "ClientApiBroker.getAdPreloader");
            return null;
        }
    }
}
