package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbfz;
import com.google.android.gms.internal.ads.zzbgc;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbuh;

/* JADX INFO: loaded from: classes2.dex */
final class zzax extends zzbb {
    final /* synthetic */ FrameLayout zza;
    final /* synthetic */ FrameLayout zzb;
    final /* synthetic */ Context zzc;
    final /* synthetic */ zzba zzd;

    public zzax(zzba zzbaVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zzc, "native_ad_view_delegate");
        return new zzfn();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzj(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zzc);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            zzba zzbaVar = this.zzd;
            return zzbaVar.zzd.zza(this.zzc, this.zza, this.zzb);
        }
        try {
            return zzbfz.zzdy(((zzbgd) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzaw
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbgc.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 244410000));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            this.zzd.zzg = zzbuh.zza(this.zzc);
            this.zzd.zzg.zzh(e, "ClientApiBroker.createNativeAdViewDelegate");
            return null;
        }
    }
}
