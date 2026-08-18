package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
final class zzbvp implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvr zzb;

    public zzbvp(zzbvr zzbvrVar, Context context) {
        this.zza = context;
        this.zzb = zzbvrVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x003a  */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbvo zzbvoVarZza;
        zzbvq zzbvqVar = (zzbvq) this.zzb.zza.get(this.zza);
        if (zzbvqVar != null) {
            if (zzbvqVar.zza + ((Long) zzbea.zzd.zze()).longValue() < com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()) {
                zzbvoVarZza = new zzbvn(this.zza).zza();
            } else {
                zzbvoVarZza = new zzbvn(this.zza, zzbvqVar.zzb).zza();
            }
        } else {
            zzbvoVarZza = new zzbvn(this.zza).zza();
        }
        zzbvr zzbvrVar = this.zzb;
        zzbvrVar.zza.put(this.zza, new zzbvq(zzbvrVar, zzbvoVarZza));
        return zzbvoVarZza;
    }
}
