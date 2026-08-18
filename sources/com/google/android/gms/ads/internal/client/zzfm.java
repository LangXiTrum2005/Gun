package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.ads.zzblu;
import com.google.android.gms.internal.ads.zzbpe;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class zzfm extends zzcy {
    private zzblu zza;

    public final /* synthetic */ void zzb() {
        zzblu zzbluVar = this.zza;
        if (zzbluVar != null) {
            try {
                zzbluVar.zzb(Collections.emptyList());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Could not notify onComplete event.", e);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final float zze() throws RemoteException {
        return 1.0f;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return "";
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        return Collections.emptyList();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(@Nullable String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzk() throws RemoteException {
        com.google.android.gms.ads.internal.util.client.zzo.zzg("The initialization is not processed because MobileAdsSettingsManager is not created successfully.");
        com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzfl
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzb();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzl(@Nullable String str, IObjectWrapper iObjectWrapper) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(zzdl zzdlVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpe zzbpeVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzp(boolean z) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzq(float f) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzr(String str) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblu zzbluVar) throws RemoteException {
        this.zza = zzbluVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(zzfv zzfvVar) throws RemoteException {
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final boolean zzv() throws RemoteException {
        return false;
    }
}
