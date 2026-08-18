package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
final class zzflt extends BroadcastReceiver {
    final /* synthetic */ zzflu zza;

    public zzflt(zzflu zzfluVar) {
        this.zza = zzfluVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzflu zzfluVar = this.zza;
            zzfluVar.zzd(true, zzfluVar.zzd);
            this.zza.zzc = true;
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzflu zzfluVar2 = this.zza;
            zzfluVar2.zzd(false, zzfluVar2.zzd);
            this.zza.zzc = false;
        }
    }
}
