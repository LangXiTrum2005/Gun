package com.google.android.gms.ads.internal;

import android.os.RemoteException;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.zzfdk;

/* JADX INFO: loaded from: classes2.dex */
final class zzo extends WebViewClient {
    final /* synthetic */ zzu zza;

    public zzo(zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        zzu zzuVar = this.zza;
        if (zzuVar.zzg != null) {
            try {
                zzuVar.zzg.zzf(zzfdk.zzd(1, null, null));
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        zzu zzuVar2 = this.zza;
        if (zzuVar2.zzg != null) {
            try {
                zzuVar2.zzg.zze(0);
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.startsWith(this.zza.zzq())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            zzu zzuVar = this.zza;
            if (zzuVar.zzg != null) {
                try {
                    zzuVar.zzg.zzf(zzfdk.zzd(3, null, null));
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            zzu zzuVar2 = this.zza;
            if (zzuVar2.zzg != null) {
                try {
                    zzuVar2.zzg.zze(3);
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            zzu zzuVar3 = this.zza;
            if (zzuVar3.zzg != null) {
                try {
                    zzuVar3.zzg.zzf(zzfdk.zzd(1, null, null));
                } catch (RemoteException e3) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e3);
                }
            }
            zzu zzuVar4 = this.zza;
            if (zzuVar4.zzg != null) {
                try {
                    zzuVar4.zzg.zze(0);
                } catch (RemoteException e4) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzV(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            zzu zzuVar5 = this.zza;
            if (zzuVar5.zzg != null) {
                try {
                    zzuVar5.zzg.zzi();
                } catch (RemoteException e5) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
                }
            }
            this.zza.zzV(this.zza.zzb(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        zzu zzuVar6 = this.zza;
        if (zzuVar6.zzg != null) {
            try {
                zzuVar6.zzg.zzc();
                this.zza.zzg.zzh();
            } catch (RemoteException e6) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        zzu.zzw(this.zza, zzu.zzo(this.zza, str));
        return true;
    }
}
