package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* JADX INFO: loaded from: classes3.dex */
final class zzbzj extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzbzm zza;

    public zzbzj(zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.zza.zzo.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.zza.zzo.set(false);
    }
}
