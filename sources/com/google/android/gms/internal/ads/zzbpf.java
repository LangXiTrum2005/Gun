package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbpf extends zzaya implements zzbph {
    public zzbpf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzA(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzB(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzC(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzD(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzE() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzF() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzG(boolean z) throws RemoteException {
        Parcel parcelZza = zza();
        int i = zzayc.zza;
        parcelZza.writeInt(z ? 1 : 0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzH(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzI() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzJ(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzK(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzL() throws RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final boolean zzM() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(22, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final boolean zzN() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final zzbpp zzO() throws RemoteException {
        zzbpp zzbppVar;
        Parcel parcelZzcZ = zzcZ(15, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbppVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbppVar = iInterfaceQueryLocalInterface instanceof zzbpp ? (zzbpp) iInterfaceQueryLocalInterface : new zzbpp(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final zzbpq zzP() throws RemoteException {
        zzbpq zzbpqVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbpqVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbpqVar = iInterfaceQueryLocalInterface instanceof zzbpq ? (zzbpq) iInterfaceQueryLocalInterface : new zzbpq(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final Bundle zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final Bundle zzf() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final Bundle zzg() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzeb zzebVarZzb = com.google.android.gms.ads.internal.client.zzea.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzebVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final zzbgq zzi() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final zzbpn zzj() throws RemoteException {
        zzbpn zzbplVar;
        Parcel parcelZzcZ = zzcZ(36, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbplVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbplVar = iInterfaceQueryLocalInterface instanceof zzbpn ? (zzbpn) iInterfaceQueryLocalInterface : new zzbpl(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbplVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final zzbpt zzk() throws RemoteException {
        zzbpt zzbprVar;
        Parcel parcelZzcZ = zzcZ(27, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbprVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbprVar = iInterfaceQueryLocalInterface instanceof zzbpt ? (zzbpt) iInterfaceQueryLocalInterface : new zzbpr(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbprVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final zzbrs zzl() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(33, zza());
        zzbrs zzbrsVar = (zzbrs) zzayc.zza(parcelZzcZ, zzbrs.CREATOR);
        parcelZzcZ.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final zzbrs zzm() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(34, zza());
        zzbrs zzbrsVar = (zzbrs) zzayc.zza(parcelZzcZ, zzbrs.CREATOR);
        parcelZzcZ.recycle();
        return zzbrsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final IObjectWrapper zzn() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzo() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzp(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbwh zzbwhVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(null);
        zzayc.zzf(parcelZza, zzbwhVar);
        parcelZza.writeString(str2);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzq(IObjectWrapper iObjectWrapper, zzblr zzblrVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzblrVar);
        parcelZza.writeTypedList(list);
        zzda(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzr(IObjectWrapper iObjectWrapper, zzbwh zzbwhVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzf(parcelZza, zzbwhVar);
        parcelZza.writeStringList(list);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzs(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzt(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzu(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpk zzbpkVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzv(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzsVar);
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzw(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzs zzsVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzsVar);
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzx(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbpk zzbpkVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzy(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpk zzbpkVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbph
    public final void zzz(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbpk zzbpkVar, zzbfl zzbflVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzayc.zzd(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzayc.zzf(parcelZza, zzbpkVar);
        zzayc.zzd(parcelZza, zzbflVar);
        parcelZza.writeStringList(list);
        zzda(14, parcelZza);
    }
}
