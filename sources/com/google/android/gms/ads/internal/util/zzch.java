package com.google.android.gms.ads.internal.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class zzch extends BroadcastReceiver {
    final /* synthetic */ zzci zza;

    public zzch(zzci zzciVar) {
        this.zza = zzciVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zze(context, intent);
    }
}
