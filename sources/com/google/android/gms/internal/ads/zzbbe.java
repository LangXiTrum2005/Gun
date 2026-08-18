package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes3.dex */
final class zzbbe implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcab zza;
    final /* synthetic */ zzbbf zzb;

    public zzbbe(zzbbf zzbbfVar, zzcab zzcabVar) {
        this.zza = zzcabVar;
        this.zzb = zzbbfVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zzd(new RuntimeException("Connection failed."));
        }
    }
}
