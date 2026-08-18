package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbyt extends zzayb implements zzbyu {
    public zzbyt() {
        super("com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    public static zzbyu zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
        return iInterfaceQueryLocalInterface instanceof zzbyu ? (zzbyu) iInterfaceQueryLocalInterface : new zzbys(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbyr zzbypVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyy zzbyyVar = (zzbyy) zzayc.zza(parcel, zzbyy.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalCallback");
                    zzbypVar = iInterfaceQueryLocalInterface instanceof zzbyr ? (zzbyr) iInterfaceQueryLocalInterface : new zzbyp(strongBinder);
                }
                zzayc.zzc(parcel);
                zzf(iObjectWrapperAsInterface, zzbyyVar, zzbypVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzk(iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 3:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, null);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, null);
                return true;
            case 5:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzb = zzbts.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzm(arrayListCreateTypedArrayList, iObjectWrapperAsInterface3, zzbttVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                ArrayList arrayListCreateTypedArrayList2 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzb2 = zzbts.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzl(arrayListCreateTypedArrayList2, iObjectWrapperAsInterface4, zzbttVarZzb2);
                parcel2.writeNoException();
                return true;
            case 7:
                zzbuc zzbucVar = (zzbuc) zzayc.zza(parcel, zzbuc.CREATOR);
                zzayc.zzc(parcel);
                zzg(zzbucVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzj(iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                return true;
            case 9:
                ArrayList arrayListCreateTypedArrayList3 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzb3 = zzbts.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzi(arrayListCreateTypedArrayList3, iObjectWrapperAsInterface6, zzbttVarZzb3);
                parcel2.writeNoException();
                return true;
            case 10:
                ArrayList arrayListCreateTypedArrayList4 = parcel.createTypedArrayList(Uri.CREATOR);
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbtt zzbttVarZzb4 = zzbts.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzh(arrayListCreateTypedArrayList4, iObjectWrapperAsInterface7, zzbttVarZzb4);
                parcel2.writeNoException();
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                IObjectWrapper iObjectWrapperZze = zze(iObjectWrapperAsInterface8, iObjectWrapperAsInterface9, string, iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, iObjectWrapperZze);
                return true;
            default:
                return false;
        }
    }
}
