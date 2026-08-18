package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzaya;
import com.google.android.gms.internal.ads.zzayc;
import com.google.android.gms.internal.ads.zzbag;
import com.google.android.gms.internal.ads.zzbdg;
import com.google.android.gms.internal.ads.zzbtn;
import com.google.android.gms.internal.ads.zzbtq;
import com.google.android.gms.internal.ads.zzbwc;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbw extends zzaya implements zzby {
    public zzbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzA() throws RemoteException {
        zzda(11, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzB() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzC(zzbi zzbiVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbiVar);
        zzda(20, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzD(zzbl zzblVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzblVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzE(zzcc zzccVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzF(zzs zzsVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzsVar);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzG(zzcm zzcmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzcmVar);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzH(zzbag zzbagVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzbagVar);
        zzda(40, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzI(zzy zzyVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzyVar);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzJ(zzct zzctVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzctVar);
        zzda(45, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzK(zzef zzefVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzL(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(34, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzM(zzbtn zzbtnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzN(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(22, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzO(zzbdg zzbdgVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzP(zzdr zzdrVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, zzdrVar);
        zzda(42, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzQ(zzbtq zzbtqVar, String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzR(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzS(zzbwc zzbwcVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzT(String str) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzU(zzga zzgaVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzgaVar);
        zzda(29, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzW(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(44, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzX() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzY() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(46, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzZ() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(23, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzaa() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final boolean zzab(zzm zzmVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzmVar);
        Parcel parcelZzcZ = zzcZ(4, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzac(zzcq zzcqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final Bundle zzd() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzs zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        zzs zzsVar = (zzs) zzayc.zza(parcelZzcZ, zzs.CREATOR);
        parcelZzcZ.recycle();
        return zzsVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzbl zzi() throws RemoteException {
        zzbl zzbjVar;
        Parcel parcelZzcZ = zzcZ(33, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbjVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
            zzbjVar = iInterfaceQueryLocalInterface instanceof zzbl ? (zzbl) iInterfaceQueryLocalInterface : new zzbj(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbjVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzcm zzj() throws RemoteException {
        zzcm zzckVar;
        Parcel parcelZzcZ = zzcZ(32, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzckVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
            zzckVar = iInterfaceQueryLocalInterface instanceof zzcm ? (zzcm) iInterfaceQueryLocalInterface : new zzck(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzckVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzdy zzk() throws RemoteException {
        zzdy zzdwVar;
        Parcel parcelZzcZ = zzcZ(41, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdwVar = iInterfaceQueryLocalInterface instanceof zzdy ? (zzdy) iInterfaceQueryLocalInterface : new zzdw(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdwVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final zzeb zzl() throws RemoteException {
        zzeb zzdzVar;
        Parcel parcelZzcZ = zzcZ(26, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzdzVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            zzdzVar = iInterfaceQueryLocalInterface instanceof zzeb ? (zzeb) iInterfaceQueryLocalInterface : new zzdz(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzdzVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final IObjectWrapper zzn() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(1, zza()));
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzr() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(31, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final String zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzx() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzy(zzm zzmVar, zzbo zzboVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzmVar);
        zzayc.zzf(parcelZza, zzboVar);
        zzda(43, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzby
    public final void zzz() throws RemoteException {
        zzda(5, zza());
    }
}
