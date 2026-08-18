package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbux extends zzayb implements zzbuy {
    public zzbux() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbvc zzbvaVar = null;
        zzbvd zzbvdVar = null;
        zzbvc zzbvaVar2 = null;
        zzbvc zzbvaVar3 = null;
        zzbvc zzbvaVar4 = null;
        switch (i) {
            case 1:
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                zzayc.zze(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                    if (iInterfaceQueryLocalInterface instanceof zzbuz) {
                    }
                }
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbvk zzbvkVar = (zzbvk) zzayc.zza(parcel, zzbvk.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvaVar = iInterfaceQueryLocalInterface2 instanceof zzbvc ? (zzbvc) iInterfaceQueryLocalInterface2 : new zzbva(strongBinder2);
                }
                zzayc.zzc(parcel);
                zzg(zzbvkVar, zzbvaVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbvk zzbvkVar2 = (zzbvk) zzayc.zza(parcel, zzbvk.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvaVar4 = iInterfaceQueryLocalInterface3 instanceof zzbvc ? (zzbvc) iInterfaceQueryLocalInterface3 : new zzbva(strongBinder3);
                }
                zzayc.zzc(parcel);
                zzf(zzbvkVar2, zzbvaVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbvk zzbvkVar3 = (zzbvk) zzayc.zza(parcel, zzbvk.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvaVar3 = iInterfaceQueryLocalInterface4 instanceof zzbvc ? (zzbvc) iInterfaceQueryLocalInterface4 : new zzbva(strongBinder4);
                }
                zzayc.zzc(parcel);
                zze(zzbvkVar3, zzbvaVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbvaVar2 = iInterfaceQueryLocalInterface5 instanceof zzbvc ? (zzbvc) iInterfaceQueryLocalInterface5 : new zzbva(strongBinder5);
                }
                zzayc.zzc(parcel);
                zzh(string, zzbvaVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbuu zzbuuVar = (zzbuu) zzayc.zza(parcel, zzbuu.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbvdVar = iInterfaceQueryLocalInterface6 instanceof zzbvd ? (zzbvd) iInterfaceQueryLocalInterface6 : new zzbvd(strongBinder6);
                }
                zzayc.zzc(parcel);
                zzi(zzbuuVar, zzbvdVar);
                parcel2.writeNoException();
                return true;
        }
    }
}
