package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;

/* JADX INFO: loaded from: classes3.dex */
public class zzeik extends zzbpj {
    private final zzcvr zza;
    private final zzddq zzb;
    private final zzcwl zzc;
    private final zzcxa zzd;
    private final zzcxf zze;
    private final zzdap zzf;
    private final zzcxz zzg;
    private final zzden zzh;
    private final zzdal zzi;
    private final zzcwg zzj;

    public zzeik(zzcvr zzcvrVar, zzddq zzddqVar, zzcwl zzcwlVar, zzcxa zzcxaVar, zzcxf zzcxfVar, zzdap zzdapVar, zzcxz zzcxzVar, zzden zzdenVar, zzdal zzdalVar, zzcwg zzcwgVar) {
        this.zza = zzcvrVar;
        this.zzb = zzddqVar;
        this.zzc = zzcwlVar;
        this.zzd = zzcxaVar;
        this.zze = zzcxfVar;
        this.zzf = zzdapVar;
        this.zzg = zzcxzVar;
        this.zzh = zzdenVar;
        this.zzi = zzdalVar;
        this.zzj = zzcwgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zze() {
        this.zza.onAdClicked();
        this.zzb.zzdd();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzf() {
        this.zzg.zzds(4);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzg(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzi(int i, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    @Deprecated
    public final void zzj(int i) throws RemoteException {
        zzk(new com.google.android.gms.ads.internal.client.zze(i, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzk(com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zzj.zza(zzfdk.zzc(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzl(String str) {
        zzk(new com.google.android.gms.ads.internal.client.zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzm() {
        this.zzc.zza();
        this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzn() {
        this.zzd.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzo() {
        this.zze.zzs();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzp() {
        this.zzg.zzdp();
        this.zzi.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzq(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzr(zzbgq zzbgqVar, String str) {
    }

    public void zzs(zzbwi zzbwiVar) {
    }

    public void zzt(zzbwm zzbwmVar) throws RemoteException {
    }

    public void zzu() throws RemoteException {
    }

    public void zzv() {
        this.zzh.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzw() {
        this.zzh.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbpk
    public final void zzx() throws RemoteException {
        this.zzh.zzc();
    }

    public void zzy() {
        this.zzh.zzd();
    }
}
