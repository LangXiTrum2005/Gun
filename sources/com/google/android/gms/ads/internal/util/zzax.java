package com.google.android.gms.ads.internal.util;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
final class zzax implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    public zzax(zzay zzayVar, Context context, String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder builderZzL = zzs.zzL(this.zza);
        builderZzL.setMessage(this.zzb);
        if (this.zzc) {
            builderZzL.setTitle("Error");
        } else {
            builderZzL.setTitle("Info");
        }
        if (this.zzd) {
            builderZzL.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderZzL.setPositiveButton("Learn More", new zzaw(this, this.zza));
            builderZzL.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderZzL.create().show();
    }
}
