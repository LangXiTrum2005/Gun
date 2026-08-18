package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzayb;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbaf;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzbdf;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbtm;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbwb;
import com.google.android.gms.internal.ads.zzbwc;

/* JADX INFO: loaded from: classes2.dex */
public abstract class zzbx extends zzayb implements zzby {
    public zzbx() {
        super("com.google.android.gms.ads.internal.client.IAdManager");
    }

    public static zzby zzad(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzbw(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbl zzbjVar = null;
        zzct zzcrVar = null;
        zzbo zzbmVar = null;
        zzdr zzdpVar = null;
        zzcc zzcaVar = null;
        zzcq zzcqVar = null;
        zzbi zzbgVar = null;
        zzcm zzckVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, iObjectWrapperZzn);
                return true;
            case 2:
                zzx();
                parcel2.writeNoException();
                return true;
            case 3:
                boolean zZzaa = zzaa();
                parcel2.writeNoException();
                int i3 = zzayc.zza;
                parcel2.writeInt(zZzaa ? 1 : 0);
                return true;
            case 4:
                zzm zzmVar = (zzm) zzayc.zza(parcel, zzm.CREATOR);
                zzayc.zzc(parcel);
                boolean zZzab = zzab(zzmVar);
                parcel2.writeNoException();
                parcel2.writeInt(zZzab ? 1 : 0);
                return true;
            case 5:
                zzz();
                parcel2.writeNoException();
                return true;
            case 6:
                zzB();
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
                }
                zzayc.zzc(parcel);
                zzD(zzbjVar);
                parcel2.writeNoException();
                return true;
            case 8:
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    zzckVar = iInterfaceQueryLocalInterface2 instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface2 : new zzck(strongBinder2);
                }
                zzayc.zzc(parcel);
                zzG(zzckVar);
                parcel2.writeNoException();
                return true;
            case 9:
                zzX();
                parcel2.writeNoException();
                return true;
            case 10:
                parcel2.writeNoException();
                return true;
            case 11:
                zzA();
                parcel2.writeNoException();
                return true;
            case 12:
                zzs zzsVarZzg = zzg();
                parcel2.writeNoException();
                zzayc.zze(parcel2, zzsVarZzg);
                return true;
            case 13:
                zzs zzsVar = (zzs) zzayc.zza(parcel, zzs.CREATOR);
                zzayc.zzc(parcel);
                zzF(zzsVar);
                parcel2.writeNoException();
                return true;
            case 14:
                zzbtn zzbtnVarZzb = zzbtm.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzM(zzbtnVarZzb);
                parcel2.writeNoException();
                return true;
            case 15:
                zzbtq zzbtqVarZzb = zzbtp.zzb(parcel.readStrongBinder());
                String string = parcel.readString();
                zzayc.zzc(parcel);
                zzQ(zzbtqVarZzb, string);
                parcel2.writeNoException();
                return true;
            case 16:
            case 17:
            case 27:
            case 28:
            default:
                return false;
            case 18:
                String strZzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(strZzs);
                return true;
            case 19:
                zzbdg zzbdgVarZzb = zzbdf.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzO(zzbdgVarZzb);
                parcel2.writeNoException();
                return true;
            case 20:
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    zzbgVar = iInterfaceQueryLocalInterface3 instanceof zzbi ? (zzbi) iInterfaceQueryLocalInterface3 : new zzbg(strongBinder3);
                }
                zzayc.zzc(parcel);
                zzC(zzbgVar);
                parcel2.writeNoException();
                return true;
            case 21:
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    zzcqVar = iInterfaceQueryLocalInterface4 instanceof zzcq ? (zzcq) iInterfaceQueryLocalInterface4 : new zzcq(strongBinder4);
                }
                zzayc.zzc(parcel);
                zzac(zzcqVar);
                parcel2.writeNoException();
                return true;
            case 22:
                boolean zZzg = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzN(zZzg);
                parcel2.writeNoException();
                return true;
            case 23:
                boolean zZzZ = zzZ();
                parcel2.writeNoException();
                int i4 = zzayc.zza;
                parcel2.writeInt(zZzZ ? 1 : 0);
                return true;
            case 24:
                zzbwc zzbwcVarZzb = zzbwb.zzb(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzS(zzbwcVarZzb);
                parcel2.writeNoException();
                return true;
            case 25:
                String string2 = parcel.readString();
                zzayc.zzc(parcel);
                zzT(string2);
                parcel2.writeNoException();
                return true;
            case 26:
                zzeb zzebVarZzl = zzl();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzebVarZzl);
                return true;
            case 29:
                zzga zzgaVar = (zzga) zzayc.zza(parcel, zzga.CREATOR);
                zzayc.zzc(parcel);
                zzU(zzgaVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzef zzefVar = (zzef) zzayc.zza(parcel, zzef.CREATOR);
                zzayc.zzc(parcel);
                zzK(zzefVar);
                parcel2.writeNoException();
                return true;
            case 31:
                String strZzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(strZzr);
                return true;
            case 32:
                zzcm zzcmVarZzj = zzj();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzcmVarZzj);
                return true;
            case 33:
                zzbl zzblVarZzi = zzi();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzblVarZzi);
                return true;
            case 34:
                boolean zZzg2 = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzL(zZzg2);
                parcel2.writeNoException();
                return true;
            case 35:
                String strZzt = zzt();
                parcel2.writeNoException();
                parcel2.writeString(strZzt);
                return true;
            case 36:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
                    zzcaVar = iInterfaceQueryLocalInterface5 instanceof zzcc ? (zzcc) iInterfaceQueryLocalInterface5 : new zzca(strongBinder5);
                }
                zzayc.zzc(parcel);
                zzE(zzcaVar);
                parcel2.writeNoException();
                return true;
            case 37:
                Bundle bundleZzd = zzd();
                parcel2.writeNoException();
                zzayc.zze(parcel2, bundleZzd);
                return true;
            case 38:
                String string3 = parcel.readString();
                zzayc.zzc(parcel);
                zzR(string3);
                parcel2.writeNoException();
                return true;
            case 39:
                zzy zzyVar = (zzy) zzayc.zza(parcel, zzy.CREATOR);
                zzayc.zzc(parcel);
                zzI(zzyVar);
                parcel2.writeNoException();
                return true;
            case 40:
                zzbag zzbagVarZze = zzbaf.zze(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzH(zzbagVarZze);
                parcel2.writeNoException();
                return true;
            case 41:
                zzdy zzdyVarZzk = zzk();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzdyVarZzk);
                return true;
            case 42:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
                    zzdpVar = iInterfaceQueryLocalInterface6 instanceof zzdr ? (zzdr) iInterfaceQueryLocalInterface6 : new zzdp(strongBinder6);
                }
                zzayc.zzc(parcel);
                zzP(zzdpVar);
                parcel2.writeNoException();
                return true;
            case 43:
                zzm zzmVar2 = (zzm) zzayc.zza(parcel, zzm.CREATOR);
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoadCallback");
                    zzbmVar = iInterfaceQueryLocalInterface7 instanceof zzbo ? (zzbo) iInterfaceQueryLocalInterface7 : new zzbm(strongBinder7);
                }
                zzayc.zzc(parcel);
                zzy(zzmVar2, zzbmVar);
                parcel2.writeNoException();
                return true;
            case 44:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzW(iObjectWrapperAsInterface);
                parcel2.writeNoException();
                return true;
            case 45:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
                    zzcrVar = iInterfaceQueryLocalInterface8 instanceof zzct ? (zzct) iInterfaceQueryLocalInterface8 : new zzcr(strongBinder8);
                }
                zzayc.zzc(parcel);
                zzJ(zzcrVar);
                parcel2.writeNoException();
                return true;
            case 46:
                boolean zZzY = zzY();
                parcel2.writeNoException();
                int i5 = zzayc.zza;
                parcel2.writeInt(zZzY ? 1 : 0);
                return true;
        }
    }
}
