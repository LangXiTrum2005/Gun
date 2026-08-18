package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;

/* JADX INFO: loaded from: classes2.dex */
final class zzan extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzs zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ zzbpe zzd;
    final /* synthetic */ zzba zze;

    public zzan(zzba zzbaVar, Context context, zzs zzsVar, String str, zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = str;
        this.zzd = zzbpeVar;
        this.zze = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "app_open");
        return new zzfk();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzc(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, this.zzd, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        return this.zze.zza.zza(this.zza, this.zzb, this.zzc, this.zzd, 4);
    }
}
