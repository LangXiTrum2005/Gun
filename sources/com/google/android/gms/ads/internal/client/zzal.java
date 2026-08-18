package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbkl;
import com.google.android.gms.internal.ads.zzbkt;
import com.google.android.gms.internal.ads.zzbku;
import com.google.android.gms.internal.ads.zzbky;
import com.google.android.gms.internal.ads.zzbpe;

/* JADX INFO: loaded from: classes2.dex */
final class zzal extends zzbb {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbpe zzb;
    final /* synthetic */ OnH5AdsEventListener zzc;

    public zzal(zzba zzbaVar, Context context, zzbpe zzbpeVar, OnH5AdsEventListener onH5AdsEventListener) {
        this.zza = context;
        this.zzb = zzbpeVar;
        this.zzc = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @NonNull
    public final /* synthetic */ Object zza() {
        return new zzbky();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzl(ObjectWrapper.wrap(this.zza), this.zzb, 244410000, new zzbkl(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbku) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.DynamiteH5AdsManagerCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzak
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbkt.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), this.zzb, 244410000, new zzbkl(this.zzc));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException unused) {
            return null;
        }
    }
}
