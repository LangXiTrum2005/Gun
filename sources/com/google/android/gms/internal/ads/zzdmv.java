package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdmv extends zzbhs {

    @Nullable
    private final String zza;
    private final zzdia zzb;
    private final zzdif zzc;
    private final zzdrw zzd;

    public zzdmv(@Nullable String str, zzdia zzdiaVar, zzdif zzdifVar, zzdrw zzdrwVar) {
        this.zza = str;
        this.zzb = zzdiaVar;
        this.zzc = zzdifVar;
        this.zzd = zzdrwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzA() {
        this.zzb.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzB(Bundle bundle) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzmO)).booleanValue()) {
            this.zzb.zzI(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzC(Bundle bundle) throws RemoteException {
        this.zzb.zzM(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzD() {
        this.zzb.zzO();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzE(com.google.android.gms.ads.internal.client.zzdd zzddVar) throws RemoteException {
        this.zzb.zzP(zzddVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzF(com.google.android.gms.ads.internal.client.zzdr zzdrVar) throws RemoteException {
        try {
            if (!zzdrVar.zzf()) {
                this.zzd.zze();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Error in making CSI ping for reporting paid event callback", e);
        }
        this.zzb.zzQ(zzdrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzG(zzbhq zzbhqVar) throws RemoteException {
        this.zzb.zzR(zzbhqVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzH() {
        return this.zzb.zzW();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzI() throws RemoteException {
        return (this.zzc.zzH().isEmpty() || this.zzc.zzk() == null) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final boolean zzJ(Bundle bundle) throws RemoteException {
        return this.zzb.zzZ(bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final double zze() throws RemoteException {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final Bundle zzf() throws RemoteException {
        return this.zzc.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdy zzg() throws RemoteException {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzgC)).booleanValue()) {
            return this.zzb.zzm();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final com.google.android.gms.ads.internal.client.zzeb zzh() throws RemoteException {
        return this.zzc.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final zzbfp zzi() throws RemoteException {
        return this.zzc.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final zzbft zzj() throws RemoteException {
        return this.zzb.zzc().zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final zzbfw zzk() throws RemoteException {
        return this.zzc.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final IObjectWrapper zzl() throws RemoteException {
        return this.zzc.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final IObjectWrapper zzm() throws RemoteException {
        return ObjectWrapper.wrap(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzn() throws RemoteException {
        return this.zzc.zzx();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzo() throws RemoteException {
        return this.zzc.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzp() throws RemoteException {
        return this.zzc.zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzq() throws RemoteException {
        return this.zzc.zzB();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzr() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzs() throws RemoteException {
        return this.zzc.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final String zzt() throws RemoteException {
        return this.zzc.zzE();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final List zzu() throws RemoteException {
        return this.zzc.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final List zzv() throws RemoteException {
        return zzI() ? this.zzc.zzH() : Collections.emptyList();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzw() throws RemoteException {
        this.zzb.zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzx() throws RemoteException {
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzy(@Nullable com.google.android.gms.ads.internal.client.zzdh zzdhVar) throws RemoteException {
        this.zzb.zzC(zzdhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbht
    public final void zzz(Bundle bundle) throws RemoteException {
        this.zzb.zzG(bundle);
    }
}
