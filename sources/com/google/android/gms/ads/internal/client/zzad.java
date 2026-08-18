package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzbtg;
import com.google.android.gms.internal.ads.zzbth;
import com.google.android.gms.internal.ads.zzbuh;

/* JADX INFO: loaded from: classes2.dex */
final class zzad extends zzbb {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzba zzb;

    public zzad(zzba zzbaVar, Activity activity) {
        this.zza = activity;
        this.zzb = zzbaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza() {
        zzba.zzv(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    public final /* bridge */ /* synthetic */ Object zzb(zzcp zzcpVar) throws RemoteException {
        return zzcpVar.zzn(ObjectWrapper.wrap(this.zza));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbb
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbcl.zza(this.zza);
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzkA)).booleanValue()) {
            zzba zzbaVar = this.zzb;
            return zzbaVar.zze.zza(this.zza);
        }
        try {
            return zzbtd.zzI(((zzbth) com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", new com.google.android.gms.ads.internal.util.client.zzq() { // from class: com.google.android.gms.ads.internal.client.zzac
                @Override // com.google.android.gms.ads.internal.util.client.zzq
                public final Object zza(Object obj) {
                    return zzbtg.zzb((IBinder) obj);
                }
            })).zze(ObjectWrapper.wrap(this.zza)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e) {
            this.zzb.zzg = zzbuh.zza(this.zza.getApplicationContext());
            this.zzb.zzg.zzh(e, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }
}
