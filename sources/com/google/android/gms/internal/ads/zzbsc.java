package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbsc extends zzbsi {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcex zzj;
    private final Activity zzk;
    private zzcgr zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsj zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", TtmlNode.CENTER, "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbsc(zzcex zzcexVar, zzbsj zzbsjVar) {
        super(zzcexVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcexVar;
        this.zzk = zzcexVar.zzi();
        this.zzo = zzbsjVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkI)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkJ)).booleanValue()) {
            ViewParent parent = ((View) this.zzj).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.zzj);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkK)).booleanValue()) {
                try {
                    this.zzr.addView((View) this.zzj);
                    this.zzj.zzaj(this.zzl);
                } catch (IllegalStateException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                this.zzr.addView((View) this.zzj);
                this.zzj.zzaj(this.zzl);
            }
        }
        if (z) {
            zzl(MRAIDCommunicatorUtil.STATES_DEFAULT);
            zzbsj zzbsjVar = this.zzo;
            if (zzbsjVar != null) {
                zzbsjVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zza(final boolean z) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzkH)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzc(z);
                    } else {
                        zzbzw.zzf.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsa
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zzc(z);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:162:0x0382  */
    /* JADX WARN: Code duplicated, block: B:87:0x018d  */
    public final void zzb(Map map) {
        byte b;
        int i;
        byte b2;
        int i2;
        int i3;
        int i4;
        int i5;
        synchronized (this.zzi) {
            try {
                if (this.zzk == null) {
                    zzh("Not an activity context. Cannot resize.");
                    return;
                }
                if (this.zzj.zzO() == null) {
                    zzh("Webview is not yet available, size is not set.");
                    return;
                }
                if (this.zzj.zzO().zzi()) {
                    zzh("Is interstitial. Cannot resize an interstitial.");
                    return;
                }
                if (this.zzj.zzaF()) {
                    zzh("Cannot resize an expanded banner.");
                    return;
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zzh = com.google.android.gms.ads.internal.util.zzs.zzO((String) map.get("width"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zze = com.google.android.gms.ads.internal.util.zzs.zzO((String) map.get("height"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zzf = com.google.android.gms.ads.internal.util.zzs.zzO((String) map.get("offsetX"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    this.zzg = com.google.android.gms.ads.internal.util.zzs.zzO((String) map.get("offsetY"));
                }
                if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                    this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                }
                String str = (String) map.get("customClosePosition");
                if (!TextUtils.isEmpty(str)) {
                    this.zza = str;
                }
                if (this.zzh < 0 || this.zze < 0) {
                    zzh("Invalid width and height options. Cannot resize.");
                    return;
                }
                Window window = this.zzk.getWindow();
                if (window != null && window.getDecorView() != null) {
                    com.google.android.gms.ads.internal.zzv.zzq();
                    int[] iArrZzV = com.google.android.gms.ads.internal.util.zzs.zzV(this.zzk);
                    com.google.android.gms.ads.internal.zzv.zzq();
                    int[] iArrZzR = com.google.android.gms.ads.internal.util.zzs.zzR(this.zzk);
                    int i6 = iArrZzV[0];
                    int i7 = iArrZzV[1];
                    int i8 = this.zzh;
                    int[] iArr = null;
                    if (i8 < 50 || i8 > i6) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzj("Width is too small or too large.");
                    } else {
                        int i9 = this.zze;
                        if (i9 < 50 || i9 > i7) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Height is too small or too large.");
                        } else if (i9 == i7 && i8 == i6) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot resize to a full-screen ad.");
                        } else if (this.zzb) {
                            switch (this.zza) {
                                case "center":
                                    b2 = 2;
                                    break;
                                case "top-left":
                                    b2 = 0;
                                    break;
                                case "bottom-left":
                                    b2 = 3;
                                    break;
                                case "bottom-right":
                                    b2 = 5;
                                    break;
                                case "bottom-center":
                                    b2 = 4;
                                    break;
                                case "top-center":
                                    b2 = 1;
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            if (b2 == 0) {
                                i2 = this.zzc + this.zzf;
                                i3 = this.zzd;
                            } else if (b2 != 1) {
                                if (b2 != 2) {
                                    if (b2 == 3) {
                                        i2 = this.zzc + this.zzf;
                                        i5 = this.zzd;
                                    } else if (b2 == 4) {
                                        i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                        i5 = this.zzd;
                                    } else if (b2 != 5) {
                                        i2 = ((this.zzc + this.zzf) + i8) - 50;
                                        i3 = this.zzd;
                                    } else {
                                        i2 = ((this.zzc + this.zzf) + i8) - 50;
                                        i5 = this.zzd;
                                    }
                                    i4 = ((i5 + this.zzg) + i9) - 50;
                                } else {
                                    i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                    i4 = ((this.zzd + this.zzg) + (i9 >> 1)) - 25;
                                }
                                if (i2 >= 0 && i2 + 50 <= i6 && i4 >= iArrZzR[0] && i4 + 50 <= iArrZzR[1]) {
                                    iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                                }
                            } else {
                                i2 = ((this.zzc + this.zzf) + (i8 >> 1)) - 25;
                                i3 = this.zzd;
                            }
                            i4 = i3 + this.zzg;
                            if (i2 >= 0) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzv.zzq();
                            int[] iArrZzV2 = com.google.android.gms.ads.internal.util.zzs.zzV(this.zzk);
                            com.google.android.gms.ads.internal.zzv.zzq();
                            int[] iArrZzR2 = com.google.android.gms.ads.internal.util.zzs.zzR(this.zzk);
                            int i10 = iArrZzV2[0];
                            int i11 = this.zzc + this.zzf;
                            int i12 = this.zzd + this.zzg;
                            if (i11 < 0) {
                                i = 0;
                            } else {
                                int i13 = this.zzh;
                                i = i11 + i13 > i10 ? i10 - i13 : i11;
                            }
                            int i14 = iArrZzR2[0];
                            if (i12 < i14) {
                                i12 = i14;
                            } else {
                                int i15 = this.zze;
                                int i16 = i12 + i15;
                                int i17 = iArrZzR2[1];
                                if (i16 > i17) {
                                    i12 = i17 - i15;
                                }
                            }
                            iArr = new int[]{i, i12};
                        }
                    }
                    if (iArr == null) {
                        zzh("Resize location out of screen or close button is not visible.");
                        return;
                    }
                    com.google.android.gms.ads.internal.client.zzbc.zzb();
                    int iZzx = com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zzk, this.zzh);
                    com.google.android.gms.ads.internal.client.zzbc.zzb();
                    int iZzx2 = com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zzk, this.zze);
                    ViewParent parent = ((View) this.zzj).getParent();
                    if (parent == null || !(parent instanceof ViewGroup)) {
                        zzh("Webview is detached, probably in the middle of a resize or expand.");
                        return;
                    }
                    ViewGroup viewGroup = (ViewGroup) parent;
                    viewGroup.removeView((View) this.zzj);
                    PopupWindow popupWindow = this.zzp;
                    if (popupWindow == null) {
                        this.zzr = viewGroup;
                        com.google.android.gms.ads.internal.zzv.zzq();
                        Object obj = this.zzj;
                        ((View) obj).setDrawingCacheEnabled(true);
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) obj).getDrawingCache());
                        ((View) obj).setDrawingCacheEnabled(false);
                        ImageView imageView = new ImageView(this.zzk);
                        this.zzm = imageView;
                        imageView.setImageBitmap(bitmapCreateBitmap);
                        this.zzl = this.zzj.zzO();
                        this.zzr.addView(this.zzm);
                    } else {
                        popupWindow.dismiss();
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(this.zzk);
                    this.zzq = relativeLayout;
                    relativeLayout.setBackgroundColor(0);
                    this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzx, iZzx2));
                    com.google.android.gms.ads.internal.zzv.zzq();
                    PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iZzx, iZzx2, false);
                    this.zzp = popupWindow2;
                    popupWindow2.setOutsideTouchable(false);
                    this.zzp.setTouchable(true);
                    this.zzp.setClippingEnabled(!this.zzb);
                    this.zzq.addView((View) this.zzj, -1, -1);
                    this.zzn = new LinearLayout(this.zzk);
                    com.google.android.gms.ads.internal.client.zzbc.zzb();
                    int iZzx3 = com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zzk, 50);
                    com.google.android.gms.ads.internal.client.zzbc.zzb();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzx3, com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zzk, 50));
                    switch (this.zza) {
                        case "center":
                            b = 2;
                            break;
                        case "top-left":
                            b = 0;
                            break;
                        case "bottom-left":
                            b = 3;
                            break;
                        case "bottom-right":
                            b = 5;
                            break;
                        case "bottom-center":
                            b = 4;
                            break;
                        case "top-center":
                            b = 1;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(9);
                    } else if (b == 1) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(14);
                    } else if (b == 2) {
                        layoutParams.addRule(13);
                    } else if (b == 3) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(9);
                    } else if (b == 4) {
                        layoutParams.addRule(12);
                        layoutParams.addRule(14);
                    } else if (b != 5) {
                        layoutParams.addRule(10);
                        layoutParams.addRule(11);
                    } else {
                        layoutParams.addRule(12);
                        layoutParams.addRule(11);
                    }
                    this.zzn.setOnClickListener(new zzbsb(this));
                    this.zzn.setContentDescription("Close button");
                    this.zzq.addView(this.zzn, layoutParams);
                    try {
                        PopupWindow popupWindow3 = this.zzp;
                        View decorView = window.getDecorView();
                        com.google.android.gms.ads.internal.client.zzbc.zzb();
                        int iZzx4 = com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zzk, iArr[0]);
                        com.google.android.gms.ads.internal.client.zzbc.zzb();
                        popupWindow3.showAtLocation(decorView, 0, iZzx4, com.google.android.gms.ads.internal.util.client.zzf.zzx(this.zzk, iArr[1]));
                        int i18 = iArr[0];
                        int i19 = iArr[1];
                        zzbsj zzbsjVar = this.zzo;
                        if (zzbsjVar != null) {
                            zzbsjVar.zza(i18, i19, this.zzh, this.zze);
                        }
                        this.zzj.zzaj(zzcgr.zzb(iZzx, iZzx2));
                        int i20 = iArr[0];
                        int i21 = iArr[1];
                        com.google.android.gms.ads.internal.zzv.zzq();
                        zzk(i20, i21 - com.google.android.gms.ads.internal.util.zzs.zzR(this.zzk)[0], this.zzh, this.zze);
                        zzl(MRAIDCommunicatorUtil.STATES_RESIZED);
                        return;
                    } catch (RuntimeException e) {
                        zzh("Cannot show popup window: " + e.getMessage());
                        this.zzq.removeView((View) this.zzj);
                        ViewGroup viewGroup2 = this.zzr;
                        if (viewGroup2 != null) {
                            viewGroup2.removeView(this.zzm);
                            this.zzr.addView((View) this.zzj);
                            this.zzj.zzaj(this.zzl);
                        }
                        return;
                    }
                }
                zzh("Activity context is not ready, cannot get window or decor view.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzd(int i, int i2, boolean z) {
        synchronized (this.zzi) {
            this.zzc = i;
            this.zzd = i2;
        }
    }

    public final void zze(int i, int i2) {
        this.zzc = i;
        this.zzd = i2;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzi) {
            z = this.zzp != null;
        }
        return z;
    }
}
