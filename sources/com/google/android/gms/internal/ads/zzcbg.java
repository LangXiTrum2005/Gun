package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes3.dex */
@ParametersAreNonnullByDefault
public final class zzcbg extends FrameLayout implements zzcax {

    @VisibleForTesting
    final zzcbu zza;
    private final zzcbs zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbda zze;
    private final long zzf;

    @Nullable
    private final zzcay zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcbg(Context context, zzcbs zzcbsVar, int i, boolean z, zzbda zzbdaVar, zzcbr zzcbrVar) {
        super(context);
        this.zzb = zzcbsVar;
        this.zze = zzbdaVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzcbsVar.zzj());
        zzcaz zzcazVar = zzcbsVar.zzj().zza;
        zzcbt zzcbtVar = new zzcbt(context, zzcbsVar.zzn(), zzcbsVar.zzs(), zzbdaVar, zzcbsVar.zzk());
        zzcay zzcemVar = i == 3 ? new zzcem(context, zzcbtVar) : i == 2 ? new zzcck(context, zzcbtVar, zzcbsVar, z, zzcaz.zza(zzcbsVar), zzcbrVar) : new zzcaw(context, zzcbsVar, z, zzcaz.zza(zzcbsVar), zzcbrVar, new zzcbt(context, zzcbsVar.zzn(), zzcbsVar.zzs(), zzbdaVar, zzcbsVar.zzk()));
        this.zzg = zzcemVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcemVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzS)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzP)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzU)).longValue();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzR)).booleanValue();
        this.zzk = zBooleanValue;
        if (zzbdaVar != null) {
            zzbdaVar.zzd("spinner_used", true != zBooleanValue ? "0" : "1");
        }
        this.zza = new zzcbu(this);
        zzcemVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap map = new HashMap();
        Integer numZzl = zzl();
        if (numZzl != null) {
            map.put("playerId", numZzl.toString());
        }
        map.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                map.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", map);
    }

    private final boolean zzL() {
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcay zzcayVar = this.zzg;
            if (zzcayVar != null) {
                zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcba
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcayVar.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzq(z);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcax
    public final void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (i == 0) {
            this.zza.zzb();
            z = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbf(this, z));
    }

    public final void zzA(int i) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzz(i);
    }

    public final void zzB(int i) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzA(i);
    }

    public final void zzC(int i) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzS)).booleanValue()) {
            this.zzc.setBackgroundColor(i);
            this.zzd.setBackgroundColor(i);
        }
    }

    public final void zzD(int i) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzB(i);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i, int i2, int i3, int i4) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder sbT = AbstractC3950lJ.t("Set video bounds to x:", i, ";y:", i2, ";w:");
            sbT.append(i3);
            sbT.append(";h:");
            sbT.append(i4);
            com.google.android.gms.ads.internal.util.zze.zza(sbT.toString());
        }
        if (i3 == 0 || i4 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i4);
        layoutParams.setMargins(i, i2, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzb.zze(f);
        zzcayVar.zzn();
    }

    public final void zzH(float f, float f2) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar != null) {
            zzcayVar.zzu(f, f2);
        }
    }

    public final void zzI() {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzb.zzd(false);
        zzcayVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzca)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzb(String str, @Nullable String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzc(String str, @Nullable String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzd() {
        zzK(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzca)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z;
            if (!z) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzf() {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar != null && this.zzm == 0) {
            float fZzc = zzcayVar.zzc();
            zzcay zzcayVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(fZzc / 1000.0f), "videoWidth", String.valueOf(zzcayVar2.zze()), "videoHeight", String.valueOf(zzcayVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbd(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbe(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzj(int i, int i2) {
        if (this.zzk) {
            zzbcc zzbccVar = zzbcl.zzT;
            int iMax = Math.max(i / ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue(), 1);
            int iMax2 = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbccVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == iMax && this.zzp.getHeight() == iMax2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(iMax, iMax2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcax
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
        long jElapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
        if (this.zzg.getBitmap(this.zzp) != null) {
            this.zzr = true;
        }
        long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - jElapsedRealtime;
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + jElapsedRealtime2 + "ms");
        }
        if (jElapsedRealtime2 > this.zzf) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
            this.zzk = false;
            this.zzp = null;
            zzbda zzbdaVar = this.zze;
            if (zzbdaVar != null) {
                zzbdaVar.zzd("spinner_jank", Long.toString(jElapsedRealtime2));
            }
        }
    }

    @Nullable
    public final Integer zzl() {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar != null) {
            return zzcayVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        TextView textView = new TextView(zzcayVar.getContext());
        Resources resourcesZze = com.google.android.gms.ads.internal.zzv.zzp().zze();
        textView.setText(String.valueOf(resourcesZze == null ? "AdMob - " : resourcesZze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(SupportMenu.CATEGORY_MASK);
        textView.setBackgroundColor(InputDeviceCompat.SOURCE_ANY);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcay zzcayVar = this.zzg;
        if (zzcayVar != null) {
            zzcayVar.zzt();
        }
        zzJ();
    }

    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzq(boolean z) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzb.zzd(true);
        zzcayVar.zzn();
    }

    public final void zzt() {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        long jZza = zzcayVar.zza();
        if (this.zzl == jZza || jZza <= 0) {
            return;
        }
        float f = jZza / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f));
        }
        this.zzl = jZza;
    }

    public final void zzu() {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzo();
    }

    public final void zzv() {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzp();
    }

    public final void zzw(int i) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzq(i);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzx(i);
    }

    public final void zzz(int i) {
        zzcay zzcayVar = this.zzg;
        if (zzcayVar == null) {
            return;
        }
        zzcayVar.zzy(i);
    }
}
