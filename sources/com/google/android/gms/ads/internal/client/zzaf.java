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
final class zzaf extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpe zzb;

    public zzaf(zzba zzbaVar, Context context, zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = zzbpeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "out_of_context_tester");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbcl.zza(context);
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzjm)).booleanValue()) {
            return zzcpVar.zzi(iObjectWrapperWrap, this.zzb, 244410000);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        Context context = this.zza;
        IObjectWrapper iObjectWrapperWrap = ObjectWrapper.wrap(context);
        zzbcl.zza(context);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzjm)).booleanValue()) {
            return null;
        }
        try {
            return ((zzdv) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteOutOfContextTesterCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzae
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    IBinder iBinder = (IBinder) obj;
                    if (iBinder == null) {
                        return null;
                    }
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
                    return iInterfaceQueryLocalInterface instanceof zzdv ? (zzdv) iInterfaceQueryLocalInterface : new zzdv(iBinder);
                }
            })).zze(iObjectWrapperWrap, this.zzb, 244410000);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            zzbuh.zza(this.zza).zzh(e, "ClientApiBroker.getOutOfContextTester");
            return null;
        }
    }
}
