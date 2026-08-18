package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;

/* JADX INFO: loaded from: classes2.dex */
final class zzar extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbpe zzc;
    final /* synthetic */ zzba zzd;

    public zzar(zzba zzbaVar, Context context, String str, zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbpeVar;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "native_ad");
        return new zzfi();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            return this.zzd.zzb.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            IBinder iBinderZze = ((zzbv) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaq
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
                    return iInterfaceQueryLocalInterface instanceof zzbv ? (zzbv) iInterfaceQueryLocalInterface : new zzbv(iBinder);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            this.zzd.zzg = zzbuh.zza(this.zza);
            this.zzd.zzg.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            this.zzd.zzg = zzbuh.zza(this.zza);
            this.zzd.zzg.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.zzd.zzg = zzbuh.zza(this.zza);
            this.zzd.zzg.zzh(e, "ClientApiBroker.createAdLoaderBuilder");
            return null;
        }
    }
}
