package com.google.android.gms.internal.ads;

import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* JADX INFO: loaded from: classes3.dex */
final class zzbll implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcab zza;

    public zzbll(zzblm zzblmVar, zzcab zzcabVar) {
        this.zza = zzcabVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        this.zza.zzd(new RuntimeException("Connection failed."));
    }
}
