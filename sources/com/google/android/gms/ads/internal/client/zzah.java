package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbpe;
import com.google.android.gms.internal.ads.zzbyw;
import com.google.android.gms.internal.ads.zzbyx;

/* JADX INFO: loaded from: classes2.dex */
final class zzah extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpe zzb;

    public zzah(zzba zzbaVar, Context context, zzbpe zzbpeVar) {
        this.zza = context;
        this.zzb = zzbpeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzq(ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbyx) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteSignalGeneratorCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzag
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbyw.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 244410000);
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
