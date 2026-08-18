package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbgf;
import com.google.android.gms.internal.ads.zzbgi;
import com.google.android.gms.internal.ads.zzbgj;
import com.google.android.gms.internal.ads.zzbuh;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
final class zzaz extends zzbb {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzba zzd;

    public zzaz(zzba zzbaVar, View view, HashMap map, HashMap map2) {
        this.zza = view;
        this.zzb = map;
        this.zzc = map2;
        this.zzd = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        HashMap map = this.zzc;
        return zzcpVar.zzk(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(map));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zza.getContext());
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            zzba zzbaVar = this.zzd;
            return zzbaVar.zzf.zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbgf.zze(((zzbgj) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzay
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbgi.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            this.zzd.zzg = zzbuh.zza(this.zza.getContext());
            this.zzd.zzg.zzh(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }
}
