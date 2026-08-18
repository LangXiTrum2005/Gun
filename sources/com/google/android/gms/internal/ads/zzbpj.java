package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbpj extends zzayb implements zzbpk {
    public zzbpj() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbpk zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface : new zzbpi(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i3 = parcel.readInt();
                zzayc.zzc(parcel);
                zzg(i3);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (iInterfaceQueryLocalInterface instanceof zzbpo) {
                    }
                }
                zzayc.zzc(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzayc.zzc(parcel);
                zzq(string, string2);
                break;
            case 10:
                zzbgp.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzayc.zzc(parcel);
                break;
            case 11:
                zzv();
                break;
            case 12:
                parcel.readString();
                zzayc.zzc(parcel);
                break;
            case 13:
                zzy();
                break;
            case 14:
                zzbwi zzbwiVar = (zzbwi) zzayc.zza(parcel, zzbwi.CREATOR);
                zzayc.zzc(parcel);
                zzs(zzbwiVar);
                break;
            case 15:
                zzw();
                break;
            case 16:
                zzbwm zzbwmVarZzb = zzbwl.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzt(zzbwmVarZzb);
                break;
            case 17:
                int i4 = parcel.readInt();
                zzayc.zzc(parcel);
                zzj(i4);
                break;
            case 18:
                zzu();
                break;
            case 19:
                zzayc.zzc(parcel);
                break;
            case 20:
                zzx();
                break;
            case 21:
                String string3 = parcel.readString();
                zzayc.zzc(parcel);
                zzl(string3);
                break;
            case 22:
                int i5 = parcel.readInt();
                String string4 = parcel.readString();
                zzayc.zzc(parcel);
                zzi(i5, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzayc.zzc(parcel);
                zzh(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzayc.zzc(parcel);
                zzk(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
