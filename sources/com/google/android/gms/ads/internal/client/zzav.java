package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbuh;

/* JADX INFO: loaded from: classes2.dex */
final class zzav extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzba zzb;

    public zzav(zzba zzbaVar, Context context) {
        this.zza = context;
        this.zzb = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "mobile_ads_settings");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzh(ObjectWrapper.wrap(this.zza), 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            return this.zzb.zzc.zza(this.zza);
        }
        try {
            IBinder iBinderZze = ((zzda) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzau
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
                    return iInterfaceQueryLocalInterface instanceof zzda ? (zzda) iInterfaceQueryLocalInterface : new zzda(iBinder);
                }
            })).zze(ObjectWrapper.wrap(this.zza), 244410000);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzcz ? (zzcz) iInterfaceQueryLocalInterface : new zzcx(iBinderZze);
        } catch (RemoteException e) {
            e = e;
            this.zzb.zzg = zzbuh.zza(this.zza);
            this.zzb.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            e = e2;
            this.zzb.zzg = zzbuh.zza(this.zza);
            this.zzb.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e3) {
            e = e3;
            this.zzb.zzg = zzbuh.zza(this.zza);
            this.zzb.zzg.zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }
}
