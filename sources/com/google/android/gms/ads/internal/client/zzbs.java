package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
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
public final class zzbs extends zzaya implements zzbu {
    public zzbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final zzbr zze() throws RemoteException {
        zzbr zzbpVar;
        Parcel parcelZzcZ = zzcZ(1, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            zzbpVar = iInterfaceQueryLocalInterface instanceof zzbr ? (zzbr) iInterfaceQueryLocalInterface : new zzbp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf(zzbgu zzbguVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg(zzbgx zzbgxVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzh(String str, zzbhd zzbhdVar, zzbha zzbhaVar) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbhdVar);
        zzayc.zzf(parcelZza, zzbhaVar);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(zzbmi zzbmiVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(zzbhh zzbhhVar, zzs zzsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbhhVar);
        zzayc.zzd(parcelZza, zzsVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzk(zzbhk zzbhkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbhkVar);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl(zzbl zzblVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzblVar);
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, adManagerAdViewOptions);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzn(zzblz zzblzVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(zzbfl zzbflVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzbflVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(zzcq zzcqVar) throws RemoteException {
        throw null;
    }
}
