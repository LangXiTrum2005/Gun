package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzblt;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbpd;
import com.google.android.gms.internal.ads.zzbpe;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzcy extends zzayb implements zzcz {
    public zzcy() {
        super("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzdl zzdjVar;
        switch (i) {
            case 1:
                zzk();
                parcel2.writeNoException();
                return true;
            case 2:
                float f = parcel.readFloat();
                zzayc.zzc(parcel);
                zzq(f);
                parcel2.writeNoException();
                return true;
            case 3:
                String string = parcel.readString();
                zzayc.zzc(parcel);
                zzr(string);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zZzg = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzp(zZzg);
                parcel2.writeNoException();
                return true;
            case 5:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                String string2 = parcel.readString();
                zzayc.zzc(parcel);
                zzn(iObjectWrapperAsInterface, string2);
                parcel2.writeNoException();
                return true;
            case 6:
                String string3 = parcel.readString();
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzl(string3, iObjectWrapperAsInterface2);
                parcel2.writeNoException();
                return true;
            case 7:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 8:
                boolean zZzv = zzv();
                parcel2.writeNoException();
                int i3 = zzayc.zza;
                parcel2.writeInt(zZzv ? 1 : 0);
                return true;
            case 9:
                String strZzf = zzf();
                parcel2.writeNoException();
                parcel2.writeString(strZzf);
                return true;
            case 10:
                String string4 = parcel.readString();
                zzayc.zzc(parcel);
                zzh(string4);
                parcel2.writeNoException();
                return true;
            case 11:
                zzbpe zzbpeVarZzf = zzbpd.zzf(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzo(zzbpeVarZzf);
                parcel2.writeNoException();
                return true;
            case 12:
                zzblu zzbluVarZzc = zzblt.zzc(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzs(zzbluVarZzc);
                parcel2.writeNoException();
                return true;
            case 13:
                List listZzg = zzg();
                parcel2.writeNoException();
                parcel2.writeTypedList(listZzg);
                return true;
            case 14:
                zzfv zzfvVar = (zzfv) zzayc.zza(parcel, zzfv.CREATOR);
                zzayc.zzc(parcel);
                zzu(zzfvVar);
                parcel2.writeNoException();
                return true;
            case 15:
                zzi();
                parcel2.writeNoException();
                return true;
            case 16:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzdjVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
                    zzdjVar = iInterfaceQueryLocalInterface instanceof zzdl ? (zzdl) iInterfaceQueryLocalInterface : new zzdj(strongBinder);
                }
                zzayc.zzc(parcel);
                zzm(zzdjVar);
                parcel2.writeNoException();
                return true;
            case 17:
                boolean zZzg2 = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzj(zZzg2);
                parcel2.writeNoException();
                return true;
            case 18:
                String string5 = parcel.readString();
                zzayc.zzc(parcel);
                zzt(string5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
