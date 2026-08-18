package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcgd {
    private final zzcge zza;
    private final zzcgc zzb;

    public zzcgd(zzcge zzcgeVar, zzcgc zzcgcVar) {
        this.zzb = zzcgcVar;
        this.zza = zzcgeVar;
    }

    @JavascriptInterface
    public String getClickSignals(String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.zze.zza("Click string is empty, not proceeding.");
            return "";
        }
        zzava zzavaVarZzI = ((zzcgk) this.zza).zzI();
        if (zzavaVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzauv zzauvVarZzc = zzavaVarZzI.zzc();
        if (zzauvVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzcge zzcgeVar = this.zza;
        return zzauvVarZzc.zze(zzcgeVar.getContext(), str, ((zzcgm) zzcgeVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public String getViewSignals() {
        zzava zzavaVarZzI = ((zzcgk) this.zza).zzI();
        if (zzavaVarZzI == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signal utils is empty, ignoring.");
            return "";
        }
        zzauv zzauvVarZzc = zzavaVarZzI.zzc();
        if (zzauvVarZzc == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Signals object is empty, ignoring.");
            return "";
        }
        if (this.zza.getContext() == null) {
            com.google.android.gms.ads.internal.util.zze.zza("Context is null, ignoring.");
            return "";
        }
        zzcge zzcgeVar = this.zza;
        return zzauvVarZzc.zzh(zzcgeVar.getContext(), ((zzcgm) zzcgeVar).zzF(), this.zza.zzi());
    }

    @JavascriptInterface
    public void notify(final String str) {
        if (TextUtils.isEmpty(str)) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("URL is empty, ignoring message");
        } else {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza(str);
                }
            });
        }
    }

    public final /* synthetic */ void zza(String str) {
        Uri uri = Uri.parse(str);
        zzcff zzcffVarZzaO = ((zzcfw) this.zzb.zza).zzaO();
        if (zzcffVarZzaO == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to pass GMSG, no AdWebViewClient for AdWebView!");
        } else {
            zzcffVarZzaO.zzk(uri);
        }
    }
}
