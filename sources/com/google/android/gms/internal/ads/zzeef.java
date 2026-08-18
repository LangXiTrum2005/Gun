package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
final class zzeef extends zzbqq {
    final /* synthetic */ zzeeh zza;
    private final zzecz zzb;

    public /* synthetic */ zzeef(zzeeh zzeehVar, zzecz zzeczVar, zzeeg zzeegVar) {
        this.zza = zzeehVar;
        this.zzb = zzeczVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zze(String str) throws RemoteException {
        ((zzees) this.zzb.zzc).zzi(0, str);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzf(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        ((zzees) this.zzb.zzc).zzh(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzees) this.zzb.zzc).zzo();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzh(zzbpn zzbpnVar) throws RemoteException {
        this.zza.zzd = zzbpnVar;
        ((zzees) this.zzb.zzc).zzo();
    }
}
