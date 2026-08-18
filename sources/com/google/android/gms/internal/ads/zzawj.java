package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
final class zzawj extends BroadcastReceiver {
    final /* synthetic */ zzawk zza;

    public zzawj(zzawk zzawkVar) {
        this.zza = zzawkVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzf();
    }
}
