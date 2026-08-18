package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzbga;
import com.google.android.gms.internal.ads.zzbgg;
import com.google.android.gms.internal.ads.zzbko;
import com.google.android.gms.internal.ads.zzbkr;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbte;
import com.google.android.gms.internal.ads.zzbvz;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbyu;

/* JADX INFO: loaded from: classes2.dex */
public interface zzcp extends IInterface {
    zzbu zzb(IObjectWrapper iObjectWrapper, String str, zzbpe zzbpeVar, int i) throws RemoteException;

    zzby zzc(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpe zzbpeVar, int i) throws RemoteException;

    zzby zzd(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpe zzbpeVar, int i) throws RemoteException;

    zzby zze(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, zzbpe zzbpeVar, int i) throws RemoteException;

    zzby zzf(IObjectWrapper iObjectWrapper, zzs zzsVar, String str, int i) throws RemoteException;

    zzci zzg(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException;

    zzcz zzh(IObjectWrapper iObjectWrapper, int i) throws RemoteException;

    zzdu zzi(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException;

    zzbga zzj(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException;

    zzbgg zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) throws RemoteException;

    zzbkr zzl(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i, zzbko zzbkoVar) throws RemoteException;

    zzbsx zzm(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException;

    zzbte zzn(IObjectWrapper iObjectWrapper) throws RemoteException;

    zzbvz zzo(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException;

    zzbwp zzp(IObjectWrapper iObjectWrapper, String str, zzbpe zzbpeVar, int i) throws RemoteException;

    zzbyu zzq(IObjectWrapper iObjectWrapper, zzbpe zzbpeVar, int i) throws RemoteException;
}
