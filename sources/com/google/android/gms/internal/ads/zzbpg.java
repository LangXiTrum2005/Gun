package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbpg extends zzayb implements zzbph {
    public zzbpg() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzbpk zzbpiVar = null;
        switch (i) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar = (com.google.android.gms.ads.internal.client.zzs) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface : new zzbpi(strongBinder);
                }
                zzbpk zzbpkVar = zzbpiVar;
                zzayc.zzc(parcel);
                zzu(iObjectWrapperAsInterface, zzsVar, zzmVar, string, zzbpkVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperZzn = zzn();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, iObjectWrapperZzn);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface2 instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface2 : new zzbpi(strongBinder2);
                }
                zzayc.zzc(parcel);
                zzx(iObjectWrapperAsInterface2, zzmVar2, string2, zzbpiVar);
                parcel2.writeNoException();
                return true;
            case 4:
                zzI();
                parcel2.writeNoException();
                return true;
            case 5:
                zzo();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar2 = (com.google.android.gms.ads.internal.client.zzs) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface3 instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface3 : new zzbpi(strongBinder3);
                }
                zzbpk zzbpkVar2 = zzbpiVar;
                zzayc.zzc(parcel);
                zzv(iObjectWrapperAsInterface3, zzsVar2, zzmVar3, string3, string4, zzbpkVar2);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface4 instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface4 : new zzbpi(strongBinder4);
                }
                zzbpk zzbpkVar3 = zzbpiVar;
                zzayc.zzc(parcel);
                zzy(iObjectWrapperAsInterface4, zzmVar4, string5, string6, zzbpkVar3);
                parcel2.writeNoException();
                return true;
            case 8:
                zzE();
                parcel2.writeNoException();
                return true;
            case 9:
                zzF();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string7 = parcel.readString();
                zzbwh zzbwhVarZzb = zzbwg.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzayc.zzc(parcel);
                zzp(iObjectWrapperAsInterface5, zzmVar5, string7, zzbwhVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string9 = parcel.readString();
                zzayc.zzc(parcel);
                zzs(zzmVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzL();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzN = zzN();
                parcel2.writeNoException();
                int i3 = zzayc.zza;
                parcel2.writeInt(zZzN ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface5 instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface5 : new zzbpi(strongBinder5);
                }
                zzbpk zzbpkVar4 = zzbpiVar;
                zzbfl zzbflVar = (zzbfl) zzayc.zza(parcel, zzbfl.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzayc.zzc(parcel);
                zzz(iObjectWrapperAsInterface6, zzmVar7, string10, string11, zzbpkVar4, zzbflVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzayc.zzf(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzayc.zzf(parcel2, null);
                return true;
            case 17:
                Bundle bundleZze = zze();
                parcel2.writeNoException();
                zzayc.zze(parcel2, bundleZze);
                return true;
            case 18:
                Bundle bundleZzf = zzf();
                parcel2.writeNoException();
                zzayc.zze(parcel2, bundleZzf);
                return true;
            case 19:
                Bundle bundleZzg = zzg();
                parcel2.writeNoException();
                zzayc.zze(parcel2, bundleZzg);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzayc.zzc(parcel);
                zzB(zzmVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzD(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i4 = zzayc.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbwh zzbwhVarZzb2 = zzbwg.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzayc.zzc(parcel);
                zzr(iObjectWrapperAsInterface8, zzbwhVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbgq zzbgqVarZzi = zzi();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbgqVarZzi);
                return true;
            case 25:
                boolean zZzg = zzayc.zzg(parcel);
                zzayc.zzc(parcel);
                zzG(zZzg);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzeb zzebVarZzh = zzh();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzebVarZzh);
                return true;
            case 27:
                zzbpt zzbptVarZzk = zzk();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbptVarZzk);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface6 instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface6 : new zzbpi(strongBinder6);
                }
                zzayc.zzc(parcel);
                zzA(iObjectWrapperAsInterface9, zzmVar9, string14, zzbpiVar);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzK(iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzblr zzblrVarZzb = zzblq.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzblx.CREATOR);
                zzayc.zzc(parcel);
                zzq(iObjectWrapperAsInterface11, zzblrVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface7 instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface7 : new zzbpi(strongBinder7);
                }
                zzayc.zzc(parcel);
                zzC(iObjectWrapperAsInterface12, zzmVar10, string15, zzbpiVar);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbrs zzbrsVarZzl = zzl();
                parcel2.writeNoException();
                zzayc.zze(parcel2, zzbrsVarZzl);
                return true;
            case 34:
                zzbrs zzbrsVarZzm = zzm();
                parcel2.writeNoException();
                zzayc.zze(parcel2, zzbrsVarZzm);
                return true;
            case 35:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzs zzsVar3 = (com.google.android.gms.ads.internal.client.zzs) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzs.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface8 instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface8 : new zzbpi(strongBinder8);
                }
                zzbpk zzbpkVar5 = zzbpiVar;
                zzayc.zzc(parcel);
                zzw(iObjectWrapperAsInterface13, zzsVar3, zzmVar11, string16, string17, zzbpkVar5);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbpn zzbpnVarZzj = zzj();
                parcel2.writeNoException();
                zzayc.zzf(parcel2, zzbpnVarZzj);
                return true;
            case 37:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzJ(iObjectWrapperAsInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbpiVar = iInterfaceQueryLocalInterface9 instanceof zzbpk ? (zzbpk) iInterfaceQueryLocalInterface9 : new zzbpi(strongBinder9);
                }
                zzayc.zzc(parcel);
                zzt(iObjectWrapperAsInterface15, zzmVar12, string18, zzbpiVar);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzayc.zzc(parcel);
                zzH(iObjectWrapperAsInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
