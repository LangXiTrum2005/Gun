package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes3.dex */
final class zzbaq implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbar zza;

    public zzbaq(zzbar zzbarVar) {
        this.zza = zzbarVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            try {
                this.zza.zzf = null;
                zzbar zzbarVar = this.zza;
                if (zzbarVar.zzd != null) {
                    zzbarVar.zzd = null;
                }
                this.zza.zzc.notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
