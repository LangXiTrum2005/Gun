package com.google.android.gms.ads.internal.client;

import android.os.IInterface;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmi;

/* JADX INFO: loaded from: classes2.dex */
public interface zzbu extends IInterface {
    zzbr zze() throws RemoteException;

    void zzf(zzbgu zzbguVar) throws RemoteException;

    void zzg(zzbgx zzbgxVar) throws RemoteException;

    void zzh(String str, zzbhd zzbhdVar, @Nullable zzbha zzbhaVar) throws RemoteException;

    void zzi(zzbmi zzbmiVar) throws RemoteException;

    void zzj(zzbhh zzbhhVar, zzs zzsVar) throws RemoteException;

    void zzk(zzbhk zzbhkVar) throws RemoteException;

    void zzl(zzbl zzblVar) throws RemoteException;

    void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException;

    void zzn(zzblz zzblzVar) throws RemoteException;

    void zzo(zzbfl zzbflVar) throws RemoteException;

    void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException;

    void zzq(zzcq zzcqVar) throws RemoteException;
}
