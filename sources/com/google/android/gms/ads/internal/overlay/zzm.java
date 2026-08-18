package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbbj;
import com.google.android.gms.internal.ads.zzbcc;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbif;
import com.google.android.gms.internal.ads.zzbih;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsx;
import com.google.android.gms.internal.ads.zzbtd;
import com.google.android.gms.internal.ads.zzcex;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzcgn;
import com.google.android.gms.internal.ads.zzcgp;
import com.google.android.gms.internal.ads.zzcgr;
import com.google.android.gms.internal.ads.zzcwg;
import com.google.android.gms.internal.ads.zzdds;
import com.google.android.gms.internal.ads.zzdrv;
import com.google.android.gms.internal.ads.zzdrw;
import com.google.android.gms.internal.ads.zzebw;
import com.google.android.gms.internal.ads.zzebx;
import com.google.android.gms.internal.ads.zzecp;
import com.google.android.gms.internal.ads.zzecr;
import com.google.android.gms.internal.ads.zzfqw;
import com.google.android.gms.internal.ads.zzfve;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.umeng.ccg.a;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public class zzm extends zzbtd implements zzag {

    @VisibleForTesting
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;

    @Nullable
    @VisibleForTesting
    AdOverlayInfoParcel zzc;

    @VisibleForTesting
    zzcex zzd;

    @VisibleForTesting
    zzi zze;

    @VisibleForTesting
    zzu zzf;

    @VisibleForTesting
    FrameLayout zzh;

    @VisibleForTesting
    WebChromeClient.CustomViewCallback zzi;

    @VisibleForTesting
    zzh zzl;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private Toolbar zzw;

    @VisibleForTesting
    boolean zzg = false;

    @VisibleForTesting
    boolean zzj = false;

    @VisibleForTesting
    boolean zzk = false;

    @VisibleForTesting
    boolean zzm = false;

    @VisibleForTesting
    int zzn = 1;
    private final Object zzo = new Object();
    private final View.OnClickListener zzp = new zzf(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    private final void zzJ(View view) {
        zzecr zzecrVarZzQ;
        zzecp zzecpVarZzP;
        zzcex zzcexVar = this.zzd;
        if (zzcexVar == null) {
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzff)).booleanValue() && (zzecpVarZzP = zzcexVar.zzP()) != null) {
            zzecpVarZzP.zza(view);
        } else if (((Boolean) zzbe.zzc().zza(zzbcl.zzfe)).booleanValue() && (zzecrVarZzQ = zzcexVar.zzQ()) != null && zzecrVarZzQ.zzb()) {
            com.google.android.gms.ads.internal.zzv.zzB().zzg(zzecrVarZzQ.zza(), view);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0038  */
    private final void zzK(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        int i;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        boolean z = true;
        boolean z2 = false;
        boolean z3 = (adOverlayInfoParcel2 == null || (zzlVar2 = adOverlayInfoParcel2.zzo) == null || !zzlVar2.zzb) ? false : true;
        boolean zZzd = com.google.android.gms.ads.internal.zzv.zzr().zzd(this.zzb, configuration);
        if (!this.zzk || z3) {
            if (zZzd) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzaP)).booleanValue()) {
                    z = false;
                }
            }
            adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzg) {
                z2 = true;
            }
        } else if (((Boolean) zzbe.zzc().zza(zzbcl.zzaQ)).booleanValue()) {
            if (zZzd) {
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzaP)).booleanValue()) {
                    z = false;
                }
            }
            adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel != null) {
                z2 = true;
            }
        } else {
            z = false;
        }
        Window window = this.zzb.getWindow();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzbn)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z) {
                i = z2 ? 5894 : 5380;
            } else {
                i = 256;
            }
            decorView.setSystemUiVisibility(i);
            return;
        }
        if (!z) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (z2) {
            window.getDecorView().setSystemUiVisibility(4098);
        }
    }

    private static final void zzL(@Nullable zzecr zzecrVar, @Nullable View view) {
        if (zzecrVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzfe)).booleanValue() && zzecrVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzv.zzB().zzj(zzecrVar.zza(), view);
    }

    public final void zzA(int i) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzbe.zzc().zza(zzbcl.zzfQ)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzbe.zzc().zza(zzbcl.zzfR)).intValue()) {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= ((Integer) zzbe.zzc().zza(zzbcl.zzfS)).intValue()) {
                    if (i2 <= ((Integer) zzbe.zzc().zza(zzbcl.zzfT)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z) {
        if (z) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    public final void zzD(boolean z) throws zzg {
        boolean z2;
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        Window window = this.zzb.getWindow();
        if (window == null) {
            throw new zzg("Invalid activity, no window available.");
        }
        zzcex zzcexVar = this.zzc.zzd;
        zzcgp zzcgpVarZzN = zzcexVar != null ? zzcexVar.zzN() : null;
        boolean z3 = zzcgpVarZzN != null && zzcgpVarZzN.zzT();
        this.zzm = false;
        if (z3) {
            int i = this.zzc.zzj;
            if (i == 6) {
                z2 = this.zzb.getResources().getConfiguration().orientation == 1;
                this.zzm = z2;
            } else if (i == 7) {
                z2 = this.zzb.getResources().getConfiguration().orientation == 2;
                this.zzm = z2;
            } else {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        com.google.android.gms.ads.internal.util.client.zzo.zze("Delay onShow to next orientation change: " + z2);
        zzA(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zze("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        this.zzb.setContentView(this.zzl);
        this.zzs = true;
        if (z) {
            try {
                com.google.android.gms.ads.internal.zzv.zzA();
                Activity activity = this.zzb;
                zzcex zzcexVar2 = this.zzc.zzd;
                zzcgr zzcgrVarZzO = zzcexVar2 != null ? zzcexVar2.zzO() : null;
                zzcex zzcexVar3 = this.zzc.zzd;
                String strZzU = zzcexVar3 != null ? zzcexVar3.zzU() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                zzcex zzcexVar4 = adOverlayInfoParcel.zzd;
                zzcex zzcexVarZza = zzcfk.zza(activity, zzcgrVarZzO, strZzU, true, z3, null, null, versionInfoParcel, null, null, zzcexVar4 != null ? zzcexVar4.zzj() : null, zzbbj.zza(), null, null, null, null);
                this.zzd = zzcexVarZza;
                zzcgp zzcgpVarZzN2 = zzcexVarZza.zzN();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbif zzbifVar = adOverlayInfoParcel2.zzp;
                zzbih zzbihVar = adOverlayInfoParcel2.zze;
                zzac zzacVar = adOverlayInfoParcel2.zzi;
                zzcex zzcexVar5 = adOverlayInfoParcel2.zzd;
                zzcgpVarZzN2.zzV(null, zzbifVar, null, zzbihVar, zzacVar, true, null, zzcexVar5 != null ? zzcexVar5.zzN().zzd() : null, null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzN().zzC(new zzcgn() { // from class: com.google.android.gms.ads.internal.overlay.zze
                    @Override // com.google.android.gms.internal.ads.zzcgn
                    public final void zza(boolean z4, int i2, String str, String str2) {
                        zzcex zzcexVar6 = this.zza.zzd;
                        if (zzcexVar6 != null) {
                            zzcexVar6.zzaa();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzg("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", C.UTF8_NAME, null);
                }
                zzcex zzcexVar6 = this.zzc.zzd;
                if (zzcexVar6 != null) {
                    zzcexVar6.zzaw(this);
                }
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Error obtaining webview.", e);
                throw new zzg("Could not obtain webview for the overlay.", e);
            }
        } else {
            zzcex zzcexVar7 = this.zzc.zzd;
            this.zzd = zzcexVar7;
            zzcexVar7.zzan(this.zzb);
        }
        if (this.zzc.zzw) {
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzG(), false);
        }
        this.zzd.zzai(this);
        zzcex zzcexVar8 = this.zzc.zzd;
        if (zzcexVar8 != null) {
            zzL(zzcexVar8.zzQ(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.zzd.zzF());
            }
            if (this.zzk) {
                this.zzd.zzam();
            }
            if (!this.zzc.zzw || Build.VERSION.SDK_INT < 24) {
                this.zzl.addView(this.zzd.zzF(), -1, -1);
            } else {
                Toolbar toolbar = new Toolbar(this.zzb);
                this.zzw = toolbar;
                toolbar.setId(View.generateViewId());
                this.zzd.zzF().setId(View.generateViewId());
                this.zzw.setBackgroundColor(-12303292);
                this.zzw.setVisibility(0);
                try {
                    this.zzw.setNavigationIcon(com.google.android.gms.ads.internal.zzv.zzp().zze().getDrawable(R.drawable.admob_close_button_white_cross, null));
                } catch (Resources.NotFoundException | NullPointerException e2) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e2);
                }
                this.zzw.setNavigationOnClickListener(this.zzp);
                this.zzw.setTitleMarginStart(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.zzl.addView(this.zzw, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.zzw.getId());
                layoutParams2.addRule(12);
                this.zzl.addView(this.zzd.zzF(), layoutParams2);
                zzJ(this.zzw);
            }
        }
        if (!z && !this.zzm) {
            zze();
        }
        if (this.zzc.zzk != 5) {
            zzw(z3);
            if (this.zzd.zzaB()) {
                zzy(z3, true);
                return;
            }
            return;
        }
        Activity activity2 = this.zzb;
        zzebw zzebwVarZze = zzebx.zze();
        zzebwVarZze.zza(activity2);
        zzebwVarZze.zzb(this);
        zzebwVarZze.zzc(this.zzc.zzq);
        zzebwVarZze.zzd(this.zzc.zzr);
        try {
            zzf(zzebwVarZze.zze());
        } catch (RemoteException | zzg e3) {
            throw new zzg(e3.getMessage(), e3);
        }
    }

    public final void zzE() {
        synchronized (this.zzo) {
            try {
                this.zzr = true;
                Runnable runnable = this.zzq;
                if (runnable != null) {
                    zzfqw zzfqwVar = com.google.android.gms.ads.internal.util.zzs.zza;
                    zzfqwVar.removeCallbacks(runnable);
                    zzfqwVar.post(this.zzq);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzt) {
            return;
        }
        this.zzt = true;
        zzcex zzcexVar = this.zzd;
        if (zzcexVar != null) {
            zzcexVar.zzZ(this.zzn - 1);
            synchronized (this.zzo) {
                try {
                    if (!this.zzr && this.zzd.zzaC()) {
                        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeQ)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                            zzrVar.zzdo();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzc();
                            }
                        };
                        this.zzq = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbe.zzc().zza(zzbcl.zzbg)).longValue());
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        zzc();
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zziN)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzaH = this.zzd.zzaH();
        if (!zZzaH) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zZzaH;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        this.zzb.overridePendingTransition(0, 0);
        zzcex zzcexVar = this.zzd;
        if (zzcexVar != null) {
            zzcexVar.zzai(null);
        }
    }

    @VisibleForTesting
    public final void zzc() {
        zzcex zzcexVar;
        zzr zzrVar;
        if (this.zzu) {
            return;
        }
        this.zzu = true;
        zzcex zzcexVar2 = this.zzd;
        if (zzcexVar2 != null) {
            this.zzl.removeView(zzcexVar2.zzF());
            zzi zziVar = this.zze;
            if (zziVar != null) {
                this.zzd.zzan(zziVar.zzd);
                this.zzd.zzaq(false);
                if (((Boolean) zzbe.zzc().zza(zzbcl.zzmz)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzF());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzF = this.zzd.zzF();
                zzi zziVar2 = this.zze;
                viewGroup.addView(viewZzF, zziVar2.zza, zziVar2.zzb);
                this.zze = null;
            } else if (this.zzb.getApplicationContext() != null) {
                this.zzd.zzan(this.zzb.getApplicationContext());
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzds(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcexVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcexVar.zzQ(), this.zzc.zzd.zzF());
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(zzebx zzebxVar) throws RemoteException, zzg {
        zzbsx zzbsxVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbsxVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzg("noioou");
        }
        zzbsxVar.zzg(ObjectWrapper.wrap(zzebxVar));
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzh(int i, int i2, Intent intent) {
        zzdrw zzdrwVarZze;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i == 236) {
            zzbcc zzbccVar = zzbcl.zzmV;
            if (((Boolean) zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zze.zza("Callback from intent launch with requestCode: 236 and resultCode: " + i2);
                zzcex zzcexVar = this.zzd;
                if (zzcexVar == null || zzcexVar.zzN() == null || (zzdrwVarZze = zzcexVar.zzN().zze()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbe.zzc().zza(zzbccVar)).booleanValue()) {
                    return;
                }
                zzdrv zzdrvVarZza = zzdrwVarZze.zza();
                zzdrvVarZza.zzb(a.w, "hilca");
                zzdrvVarZza.zzb("gqi", zzfve.zzc(adOverlayInfoParcel.zzq));
                StringBuilder sb = new StringBuilder();
                sb.append(i2);
                zzdrvVarZza.zzb("hilr", sb.toString());
                if (i2 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdrvVarZza.zzb("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdrvVarZza.zzb("hills", stringExtra2);
                    }
                }
                zzdrvVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzK((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public void zzl(Bundle bundle) {
        if (!this.zzs) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(this.zzb.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzg("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.zzb.setShowWhenLocked(true);
                } else {
                    this.zzb.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (this.zzb.getIntent() != null) {
                this.zzv = this.zzb.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z = zzlVar.zza;
                this.zzk = z;
                if (z) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzk(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzk(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzv) {
                    zzcwg zzcwgVar = this.zzc.zzt;
                    if (zzcwgVar != null) {
                        zzcwgVar.zze();
                    }
                    zzr zzrVar = this.zzc.zzc;
                    if (zzrVar != null) {
                        zzrVar.zzdp();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdds zzddsVar = this.zzc.zzu;
                    if (zzddsVar != null) {
                        zzddsVar.zzdd();
                    }
                }
            }
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            zzh zzhVar = new zzh(activity, adOverlayInfoParcel3.zzn, adOverlayInfoParcel3.zzm.afmaVersion, adOverlayInfoParcel3.zzs);
            this.zzl = zzhVar;
            zzhVar.setId(1000);
            com.google.android.gms.ads.internal.zzv.zzr().zzk(this.zzb);
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            int i = adOverlayInfoParcel4.zzk;
            if (i == 1) {
                zzD(false);
                return;
            }
            if (i == 2) {
                this.zze = new zzi(adOverlayInfoParcel4.zzd);
                zzD(false);
            } else if (i == 3) {
                zzD(true);
            } else {
                if (i != 5) {
                    throw new zzg("Could not determine ad overlay type.");
                }
                zzD(false);
            }
        } catch (zzg e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj(e.getMessage());
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzm() {
        zzcex zzcexVar = this.zzd;
        if (zzcexVar != null) {
            try {
                this.zzl.removeView(zzcexVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzo() {
        zzr zzrVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdi();
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzeS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzp(int i, String[] strArr, int[] iArr) {
        if (i == 12345) {
            Activity activity = this.zzb;
            zzebw zzebwVarZze = zzebx.zze();
            zzebwVarZze.zza(activity);
            zzebwVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zzebwVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzr() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdE();
        }
        zzK(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeS)).booleanValue()) {
            return;
        }
        zzcex zzcexVar = this.zzd;
        if (zzcexVar == null || zzcexVar.zzaE()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
        } else {
            this.zzd.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzt() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeS)).booleanValue()) {
            zzcex zzcexVar = this.zzd;
            if (zzcexVar == null || zzcexVar.zzaE()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzu() {
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzeS)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzv() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdr();
    }

    public final void zzw(boolean z) {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzbe.zzc().zza(zzbcl.zzeV)).intValue();
        boolean z2 = ((Boolean) zzbe.zzc().zza(zzbcl.zzbj)).booleanValue() || z;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z2 ? 0 : iIntValue;
        zztVar.zzb = true != z2 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z2 ? 9 : 11);
        zzy(z, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzJ(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbte
    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean z, boolean z2) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z3 = true;
        boolean z4 = ((Boolean) zzbe.zzc().zza(zzbcl.zzbh)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z5 = ((Boolean) zzbe.zzc().zza(zzbcl.zzbi)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z && z2 && z4 && !z5) {
            new zzbsi(this.zzd, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z5 && (!z2 || z4)) {
                z3 = false;
            }
            zzuVar.zzb(z3);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
