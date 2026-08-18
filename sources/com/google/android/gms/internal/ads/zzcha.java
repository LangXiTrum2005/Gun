package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcha {
    private final VersionInfoParcel zza;
    private final Context zzb;
    private final long zzc;
    private final WeakReference zzd;

    public /* synthetic */ zzcha(zzcgy zzcgyVar, zzcgz zzcgzVar) {
        this.zza = zzcgyVar.zza;
        this.zzb = zzcgyVar.zzb;
        this.zzd = zzcgyVar.zzd;
        this.zzc = zzcgyVar.zzc;
    }

    public final long zza() {
        return this.zzc;
    }

    public final Context zzb() {
        return this.zzb;
    }

    public final com.google.android.gms.ads.internal.zzk zzc() {
        return new com.google.android.gms.ads.internal.zzk(this.zzb, this.zza);
    }

    public final zzbfe zzd() {
        return new zzbfe(this.zzb);
    }

    public final VersionInfoParcel zze() {
        return this.zza;
    }

    public final String zzf() {
        return com.google.android.gms.ads.internal.zzv.zzq().zzc(this.zzb, this.zza.afmaVersion);
    }

    public final WeakReference zzg() {
        return this.zzd;
    }
}
