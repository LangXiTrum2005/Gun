package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzela {
    private final zzdiq zza;
    private final zzekn zzb;
    private final zzcvw zzc;

    public zzela(zzdiq zzdiqVar, zzdrw zzdrwVar) {
        this.zza = zzdiqVar;
        final zzekn zzeknVar = new zzekn(zzdrwVar);
        this.zzb = zzeknVar;
        final zzbmi zzbmiVarZzg = zzdiqVar.zzg();
        this.zzc = new zzcvw() { // from class: com.google.android.gms.internal.ads.zzekz
            @Override // com.google.android.gms.internal.ads.zzcvw
            public final void zzdz(com.google.android.gms.ads.internal.client.zze zzeVar) {
                zzeknVar.zzdz(zzeVar);
                zzbmi zzbmiVar = zzbmiVarZzg;
                if (zzbmiVar != null) {
                    try {
                        zzbmiVar.zzf(zzeVar);
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (zzbmiVar != null) {
                    try {
                        zzbmiVar.zze(zzeVar.zza);
                    } catch (RemoteException e2) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                    }
                }
            }
        };
    }

    public final zzcvw zza() {
        return this.zzc;
    }

    public final zzcxh zzb() {
        return this.zzb;
    }

    public final zzdgl zzc() {
        return new zzdgl(this.zza, this.zzb.zzg());
    }

    public final zzekn zzd() {
        return this.zzb;
    }

    public final void zze(com.google.android.gms.ads.internal.client.zzbl zzblVar) {
        this.zzb.zzj(zzblVar);
    }
}
