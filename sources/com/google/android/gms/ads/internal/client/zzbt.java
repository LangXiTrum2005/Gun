package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbgt;
import com.google.android.gms.internal.ads.zzbgu;
import com.google.android.gms.internal.ads.zzbgw;
import com.google.android.gms.internal.ads.zzbgx;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzbha;
import com.google.android.gms.internal.ads.zzbhc;
import com.google.android.gms.internal.ads.zzbhd;
import com.google.android.gms.internal.ads.zzbhg;
import com.google.android.gms.internal.ads.zzbhh;
import com.google.android.gms.internal.ads.zzbhj;
import com.google.android.gms.internal.ads.zzbhk;
import com.google.android.gms.internal.ads.zzblz;
import com.google.android.gms.internal.ads.zzbmh;
import com.google.android.gms.internal.ads.zzbmi;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbt extends zzayb implements zzbu {
    public zzbt() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbl zzbjVar = null;
        zzcq zzcqVar = null;
        switch (i) {
            case 1:
                zzbr zzbrVarZze = zze();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbrVarZze);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
                }
                zzayc.zzc(parcel);
                zzl(zzbjVar);
                parcel2.writeNoException();
                return true;
            case 3:
                zzbgu zzbguVarZzb = zzbgt.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzf(zzbguVarZzb);
                parcel2.writeNoException();
                return true;
            case 4:
                zzbgx zzbgxVarZzb = zzbgw.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzg(zzbgxVarZzb);
                parcel2.writeNoException();
                return true;
            case 5:
                String string = parcel.readString();
                zzbhd zzbhdVarZzb = zzbhc.zzb(parcel.readStrongBinder());
                zzbha zzbhaVarZzb = zzbgz.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzh(string, zzbhdVarZzb, zzbhaVarZzb);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbfl zzbflVar = (zzbfl) zzayc.zza(parcel, zzbfl.CREATOR);
                zzayc.zzc(parcel);
                zzo(zzbflVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = iInterfaceQueryLocalInterface2 instanceof zzcq ? (zzcq) iInterfaceQueryLocalInterface2 : new zzcq(strongBinder2);
                }
                zzayc.zzc(parcel);
                zzq(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbhh zzbhhVarZzb = zzbhg.zzb(parcel.readStrongBinder());
                zzs zzsVar = (zzs) zzayc.zza(parcel, zzs.CREATOR);
                zzayc.zzc(parcel);
                zzj(zzbhhVarZzb, zzsVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) zzayc.zza(parcel, PublisherAdViewOptions.CREATOR);
                zzayc.zzc(parcel);
                zzp(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                zzbhk zzbhkVarZzb = zzbhj.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzk(zzbhkVarZzb);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzblz zzblzVar = (zzblz) zzayc.zza(parcel, zzblz.CREATOR);
                zzayc.zzc(parcel);
                zzn(zzblzVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbmi zzbmiVarZzb = zzbmh.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzi(zzbmiVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) zzayc.zza(parcel, AdManagerAdViewOptions.CREATOR);
                zzayc.zzc(parcel);
                zzm(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
