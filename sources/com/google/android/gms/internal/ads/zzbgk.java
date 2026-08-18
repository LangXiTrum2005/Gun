package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbgk extends zzayb implements zzbgl {
    public zzbgk() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                IObjectWrapper iObjectWrapperZzh = zzh();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, iObjectWrapperZzh);
                return true;
            case 3:
                String strZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeString(strZzk);
                return true;
            case 4:
                List listZzo = zzo();
                parcel2.writeNoException();
                parcel2.writeList(listZzo);
                return true;
            case 5:
                String strZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeString(strZzi);
                return true;
            case 6:
                zzbfw zzbfwVarZzf = zzf();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbfwVarZzf);
                return true;
            case 7:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 8:
                double dZzb = zzb();
                parcel2.writeNoException();
                parcel2.writeDouble(dZzb);
                return true;
            case 9:
                String strZzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(strZzn);
                return true;
            case 10:
                String strZzm = zzm();
                parcel2.writeNoException();
                parcel2.writeString(strZzm);
                return true;
            case 11:
                Bundle bundleZzc = zzc();
                parcel2.writeNoException();
                zzayc.zze(parcel2, bundleZzc);
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                com.google.android.gms.ads.internal.client.zzeb zzebVarZzd = zzd();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzebVarZzd);
                return true;
            case 14:
                Bundle bundle = (Bundle) zzayc.zza(parcel, Bundle.CREATOR);
                zzayc.zzc(parcel);
                zzq(bundle);
                parcel2.writeNoException();
                return true;
            case 15:
                Bundle bundle2 = (Bundle) zzayc.zza(parcel, Bundle.CREATOR);
                zzayc.zzc(parcel);
                boolean zZzs = zzs(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(zZzs ? 1 : 0);
                return true;
            case 16:
                Bundle bundle3 = (Bundle) zzayc.zza(parcel, Bundle.CREATOR);
                zzayc.zzc(parcel);
                zzr(bundle3);
                parcel2.writeNoException();
                return true;
            case 17:
                zzbfp zzbfpVarZze = zze();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbfpVarZze);
                return true;
            case 18:
                IObjectWrapper iObjectWrapperZzg = zzg();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, iObjectWrapperZzg);
                return true;
            case 19:
                String strZzl = zzl();
                parcel2.writeNoException();
                parcel2.writeString(strZzl);
                return true;
            default:
                return false;
        }
    }
}
