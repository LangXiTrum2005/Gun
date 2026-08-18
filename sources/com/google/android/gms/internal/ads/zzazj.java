package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.util.PlatformVersion;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzazj extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzaza zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzazj() {
        zzaza zzazaVar = new zzaza();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazaVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbec.zzd.zze()).intValue();
        this.zzg = ((Long) zzbec.zza.zze()).intValue();
        this.zzh = ((Long) zzbec.zze.zze()).intValue();
        this.zzi = ((Long) zzbec.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzae)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaf)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzag)).intValue();
        this.zze = ((Long) zzbec.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzai);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaj)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzak)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzal)).getClass();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00ed */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:66:0x00de->B:73:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazj.run():void");
    }

    @VisibleForTesting
    public final zzazi zza(@Nullable View view, zzayz zzayzVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzayzVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazi(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcex)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    zzayzVar.zzf();
                    webView.post(new zzazh(this, zzayzVar, webView, globalVisibleRect));
                    return new zzazi(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i = 0;
                int i2 = 0;
                for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                    zzazi zzaziVarZza = zza(viewGroup.getChildAt(i3), zzayzVar);
                    i += zzaziVarZza.zza;
                    i2 += zzaziVarZza.zzb;
                }
                return new zzazi(this, i, i2);
            }
        }
        return new zzazi(this, 0, 0);
    }

    @VisibleForTesting
    public final void zzb(View view) {
        try {
            zzayz zzayzVar = new zzayz(this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzo);
            Context contextZzb = com.google.android.gms.ads.internal.zzv.zzb().zzb();
            if (contextZzb != null && !TextUtils.isEmpty(this.zzm)) {
                String str = (String) view.getTag(contextZzb.getResources().getIdentifier((String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzah), "id", contextZzb.getPackageName()));
                if (str != null && str.equals(this.zzm)) {
                    return;
                }
            }
            zzazi zzaziVarZza = zza(view, zzayzVar);
            zzayzVar.zzj();
            if (zzaziVarZza.zza == 0 && zzaziVarZza.zzb == 0) {
                return;
            }
            int i = zzaziVarZza.zzb;
            if (i != 0) {
                if (i == 0) {
                }
                this.zzd.zza(zzayzVar);
            } else if (zzayzVar.zzb() == 0) {
                return;
            }
            if (this.zzd.zzc(zzayzVar)) {
                return;
            }
            this.zzd.zza(zzayzVar);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Exception in fetchContentOnUIThread", e);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "ContentFetchTask.fetchContent");
        }
    }

    @VisibleForTesting
    public final void zzc(zzayz zzayzVar, WebView webView, String str, boolean z) {
        zzayzVar.zze();
        try {
            if (!TextUtils.isEmpty(str)) {
                String strOptString = new JSONObject(str).optString(MimeTypes.BASE_TYPE_TEXT);
                if (this.zzn || TextUtils.isEmpty(webView.getTitle())) {
                    zzayzVar.zzi(strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzayzVar.zzi(webView.getTitle() + "\n" + strOptString, z, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzayzVar.zzl()) {
                this.zzd.zzb(zzayzVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Json string may be malformed.");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    com.google.android.gms.ads.internal.util.client.zzo.zze("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            com.google.android.gms.ads.internal.util.client.zzo.zze("ContentFetchThread: paused, pause = true");
        }
    }
}
