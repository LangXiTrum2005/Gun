package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbkn;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyu;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzco extends zzayb implements zzcp {
    public zzco() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzs zzsVar = (zzs) zzayc.zza(parcel, zzs.CREATOR);
                String string = parcel.readString();
                zzbpe zzbpeVarZzf = zzbpd.zzf(parcel.readStrongBinder());
                int i3 = parcel.readInt();
                zzayc.zzc(parcel);
                zzby zzbyVarZzd = zzd(iObjectWrapperAsInterface, zzsVar, string, zzbpeVarZzf, i3);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbyVarZzd);
                return true;
            case 2:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzs zzsVar2 = (zzs) zzayc.zza(parcel, zzs.CREATOR);
                String string2 = parcel.readString();
                zzbpe zzbpeVarZzf2 = zzbpd.zzf(parcel.readStrongBinder());
                int i4 = parcel.readInt();
                zzayc.zzc(parcel);
                zzby zzbyVarZze = zze(iObjectWrapperAsInterface2, zzsVar2, string2, zzbpeVarZzf2, i4);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbyVarZze);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string3 = parcel.readString();
                zzbpe zzbpeVarZzf3 = zzbpd.zzf(parcel.readStrongBinder());
                int i5 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbu zzbuVarZzb = zzb(iObjectWrapperAsInterface3, string3, zzbpeVarZzf3, i5);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbuVarZzb);
                return true;
            case 4:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, null);
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzbga zzbgaVarZzj = zzj(iObjectWrapperAsInterface4, iObjectWrapperAsInterface5);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbgaVarZzj);
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzbpeVarZzf4 = zzbpd.zzf(parcel.readStrongBinder());
                int i6 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbvz zzbvzVarZzo = zzo(iObjectWrapperAsInterface6, zzbpeVarZzf4, i6);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbvzVarZzo);
                return true;
            case 7:
                IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, null);
                return true;
            case 8:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzbte zzbteVarZzn = zzn(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbteVarZzn);
                return true;
            case 9:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                int i7 = parcel.readInt();
                zzayc.zzc(parcel);
                zzcz zzczVarZzh = zzh(iObjectWrapperAsInterface8, i7);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzczVarZzh);
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzs zzsVar3 = (zzs) zzayc.zza(parcel, zzs.CREATOR);
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                zzayc.zzc(parcel);
                zzby zzbyVarZzf = zzf(iObjectWrapperAsInterface9, zzsVar3, string4, i8);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbyVarZzf);
                return true;
            case 11:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzbgg zzbggVarZzk = zzk(iObjectWrapperAsInterface10, iObjectWrapperAsInterface11, iObjectWrapperAsInterface12);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbggVarZzk);
                return true;
            case 12:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string5 = parcel.readString();
                zzbpe zzbpeVarZzf5 = zzbpd.zzf(parcel.readStrongBinder());
                int i9 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbwp zzbwpVarZzp = zzp(iObjectWrapperAsInterface13, string5, zzbpeVarZzf5, i9);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbwpVarZzp);
                return true;
            case 13:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzs zzsVar4 = (zzs) zzayc.zza(parcel, zzs.CREATOR);
                String string6 = parcel.readString();
                zzbpe zzbpeVarZzf6 = zzbpd.zzf(parcel.readStrongBinder());
                int i10 = parcel.readInt();
                zzayc.zzc(parcel);
                zzby zzbyVarZzc = zzc(iObjectWrapperAsInterface14, zzsVar4, string6, zzbpeVarZzf6, i10);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbyVarZzc);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzbpeVarZzf7 = zzbpd.zzf(parcel.readStrongBinder());
                int i11 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbyu zzbyuVarZzq = zzq(iObjectWrapperAsInterface15, zzbpeVarZzf7, i11);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbyuVarZzq);
                return true;
            case 15:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzbpeVarZzf8 = zzbpd.zzf(parcel.readStrongBinder());
                int i12 = parcel.readInt();
                zzayc.zzc(parcel);
                zzbsx zzbsxVarZzm = zzm(iObjectWrapperAsInterface16, zzbpeVarZzf8, i12);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbsxVarZzm);
                return true;
            case 16:
                IObjectWrapper iObjectWrapperAsInterface17 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzbpeVarZzf9 = zzbpd.zzf(parcel.readStrongBinder());
                int i13 = parcel.readInt();
                zzbko zzbkoVarZzc = zzbkn.zzc(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzbkr zzbkrVarZzl = zzl(iObjectWrapperAsInterface17, zzbpeVarZzf9, i13, zzbkoVarZzc);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbkrVarZzl);
                return true;
            case 17:
                IObjectWrapper iObjectWrapperAsInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzbpeVarZzf10 = zzbpd.zzf(parcel.readStrongBinder());
                int i14 = parcel.readInt();
                zzayc.zzc(parcel);
                zzdu zzduVarZzi = zzi(iObjectWrapperAsInterface18, zzbpeVarZzf10, i14);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzduVarZzi);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperAsInterface19 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbpe zzbpeVarZzf11 = zzbpd.zzf(parcel.readStrongBinder());
                int i15 = parcel.readInt();
                zzayc.zzc(parcel);
                zzci zzciVarZzg = zzg(iObjectWrapperAsInterface19, zzbpeVarZzf11, i15);
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzciVarZzg);
                return true;
            default:
                return false;
        }
    }
}
