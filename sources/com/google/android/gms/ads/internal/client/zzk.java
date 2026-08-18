package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzbuj;

/* JADX INFO: loaded from: classes2.dex */
public final class zzk extends RemoteCreator {
    private zzbuj zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzbz ? (zzbz) iInterfaceQueryLocalInterface : new zzbz(iBinder);
    }

    @Nullable
    public final zzby zza(Context context, zzs zzsVar, String str, zzbpe zzbpeVar, int i) {
        zzbcl.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzbz) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzsVar, str, zzbpeVar, 244410000, i);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(iBinderZze);
            } catch (RemoteException e) {
                e = e;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e2) {
                e = e2;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzbz) com.google.android.gms.ads.internal.util.client.zzs.zzb(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzj
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
                    return iInterfaceQueryLocalInterface2 instanceof zzbz ? (zzbz) iInterfaceQueryLocalInterface2 : new zzbz(iBinder);
                }
            })).zze(ObjectWrapper.wrap(context), zzsVar, str, zzbpeVar, 244410000, i);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof zzby ? (zzby) iInterfaceQueryLocalInterface2 : new zzbw(iBinderZze2);
        } catch (RemoteException e3) {
            e = e3;
            zzbuj zzbujVarZza = zzbuh.zza(context);
            this.zza = zzbujVarZza;
            zzbujVarZza.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e4) {
            e = e4;
            zzbuj zzbujVarZza2 = zzbuh.zza(context);
            this.zza = zzbujVarZza2;
            zzbujVarZza2.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        } catch (NullPointerException e5) {
            e = e5;
            zzbuj zzbujVarZza3 = zzbuh.zza(context);
            this.zza = zzbujVarZza3;
            zzbujVarZza3.zzh(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
