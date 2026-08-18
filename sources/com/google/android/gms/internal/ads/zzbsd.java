package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3520gR;

/* JADX INFO: loaded from: classes3.dex */
final class zzbsd implements DialogInterface.OnClickListener {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzbsf zzc;

    public zzbsd(zzbsf zzbsfVar, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzbsfVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        DownloadManager downloadManager = (DownloadManager) this.zzc.zzb.getSystemService(C3520gR.DOWNLOAD);
        try {
            String str = this.zza;
            String str2 = this.zzb;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzv.zzq();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.zzc.zzh("Could not store picture.");
        }
    }
}
