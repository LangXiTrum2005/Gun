package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkq;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsw;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwo;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyt;
import com.google.android.gms.internal.ads.zzbyu;

/* JADX INFO: loaded from: classes2.dex */
public final class zzcn extends zzaya implements zzcp {
    public zzcn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IClientApi");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbu zzb(IObjectWrapper iObjectWrapper, String str, zzbpe zzbpeVar, int i) throws RemoteException {
        zzbu zzbsVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(3, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            zzbsVar = iInterfaceQueryLocalInterface instanceof zzbu ? (zzbu) iInterfaceQueryLocalInterface : new zzbs(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzc(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpe zzbpeVar, int i) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(13, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzd(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpe zzbpeVar, int i) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zze(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpe zzbpeVar, int i) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzby zzf(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, int i) throws RemoteException {
        zzby zzbwVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzsVar);
        parcelZza.writeString(str);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            zzbwVar = iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzci zzg(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException {
        zzci zzcgVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(18, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdPreloader");
            zzcgVar = iInterfaceQueryLocalInterface instanceof zzci ? (zzci) iInterfaceQueryLocalInterface : new zzcg(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcgVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzcz zzh(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        zzcz zzcxVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(9, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzcxVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            zzcxVar = iInterfaceQueryLocalInterface instanceof zzcz ? (zzcz) iInterfaceQueryLocalInterface : new zzcx(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzcxVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzdu zzi(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException {
        zzdu zzdsVar;
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdsVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdsVar = iInterfaceQueryLocalInterface instanceof zzdu ? (zzdu) iInterfaceQueryLocalInterface : new zzds(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbga zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, iObjectWrapper2);
        Parcel parcelZzcZ = zzcZ(5, parcelZza);
        zzbga zzbgaVarZzdy = zzbfz.zzdy(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbgaVarZzdy;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbgg zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, iObjectWrapper2);
        zzayc.zzf(parcelZza, iObjectWrapper3);
        Parcel parcelZzcZ = zzcZ(11, parcelZza);
        zzbgg zzbggVarZze = zzbgf.zze(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbggVarZze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbkr zzl(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i, zzbko zzbkoVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        zzayc.zzf(parcelZza, zzbkoVar);
        Parcel parcelZzcZ = zzcZ(16, parcelZza);
        zzbkr zzbkrVarZzb = zzbkq.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbkrVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbsx zzm(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(15, parcelZza);
        zzbsx zzbsxVarZzb = zzbsw.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbsxVarZzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbte zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(8, parcelZza);
        zzbte zzbteVarZzI = zzbtd.zzI(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbteVarZzI;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbvz zzo(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbwp zzp(IObjectWrapper iObjectWrapper, String str, zzbpe zzbpeVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(12, parcelZza);
        zzbwp zzbwpVarZzq = zzbwo.zzq(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbwpVarZzq;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcp
    public final zzbyu zzq(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbpeVar);
        parcelZza.writeInt(244410000);
        Parcel parcelZzcZ = zzcZ(14, parcelZza);
        zzbyu zzbyuVarZzb = zzbyt.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzbyuVarZzb;
    }
}
