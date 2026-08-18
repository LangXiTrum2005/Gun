package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcck extends zzcay implements TextureView.SurfaceTextureListener, zzcbi {
    private final zzcbs zzc;
    private final zzcbt zzd;
    private final zzcbr zze;
    private zzcax zzf;
    private Surface zzg;
    private zzcbj zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcbq zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcck(Context context, zzcbt zzcbtVar, zzcbs zzcbsVar, boolean z, boolean z2, zzcbr zzcbrVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzcbsVar;
        this.zzd = zzcbtVar;
        this.zzn = z;
        this.zze = zzcbrVar;
        setSurfaceTextureListener(this);
        zzcbtVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccj
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z, @Nullable Integer num) {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null && !z) {
            zzcbjVar.zzP(num);
            return;
        }
        if (this.zzi == null || this.zzg == null) {
            return;
        }
        if (z) {
            if (!zzad()) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzcbjVar.zzU();
                zzY();
            }
        }
        if (this.zzi.startsWith("cache:")) {
            zzcde zzcdeVarZzp = this.zzc.zzp(this.zzi);
            if (zzcdeVarZzp instanceof zzcdn) {
                zzcbj zzcbjVarZza = ((zzcdn) zzcdeVarZzp).zza();
                this.zzh = zzcbjVarZza;
                zzcbjVarZza.zzP(num);
                if (!this.zzh.zzV()) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzcdeVarZzp instanceof zzcdk)) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
                zzcdk zzcdkVar = (zzcdk) zzcdeVarZzp;
                String strZzF = zzF();
                ByteBuffer byteBufferZzl = zzcdkVar.zzl();
                boolean zZzm = zzcdkVar.zzm();
                String strZzk = zzcdkVar.zzk();
                if (strZzk == null) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Stream cache URL is null.");
                    return;
                } else {
                    zzcbj zzcbjVarZzE = zzE(num);
                    this.zzh = zzcbjVarZzE;
                    zzcbjVarZzE.zzG(new Uri[]{Uri.parse(strZzk)}, strZzF, byteBufferZzl, zZzm);
                }
            }
        } else {
            this.zzh = zzE(num);
            String strZzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzj.length];
            int i = 0;
            while (true) {
                String[] strArr = this.zzj;
                if (i >= strArr.length) {
                    break;
                }
                uriArr[i] = Uri.parse(strArr[i]);
                i++;
            }
            this.zzh.zzF(uriArr, strZzF2);
        }
        this.zzh.zzL(this);
        zzZ(this.zzg, false);
        if (this.zzh.zzV()) {
            int iZzt = this.zzh.zzt();
            this.zzl = iZzt;
            if (iZzt == 3) {
                zzV();
            }
        }
    }

    private final void zzX() {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcbj zzcbjVar = this.zzh;
            if (zzcbjVar != null) {
                zzcbjVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z) {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzcbjVar.zzS(surface, z);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i, int i2) {
        float f = i2 > 0 ? i / i2 : 1.0f;
        if (this.zzs != f) {
            this.zzs = f;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcbj zzcbjVar = this.zzh;
        return (zzcbjVar == null || !zzcbjVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = this.zzs;
        if (f != 0.0f && this.zzm == null) {
            float f2 = measuredWidth;
            float f3 = f2 / measuredHeight;
            if (f > f3) {
                measuredHeight = (int) (f2 / f);
            }
            if (f < f3) {
                measuredWidth = (int) (measuredHeight * f);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcbq zzcbqVar = this.zzm;
        if (zzcbqVar != null) {
            zzcbqVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.zzn) {
            zzcbq zzcbqVar = new zzcbq(getContext());
            this.zzm = zzcbqVar;
            zzcbqVar.zzd(surfaceTexture, i, i2);
            this.zzm.start();
            SurfaceTexture surfaceTextureZzb = this.zzm.zzb();
            if (surfaceTextureZzb != null) {
                surfaceTexture = surfaceTextureZzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i, i2);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccg
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcbq zzcbqVar = this.zzm;
        if (zzcbqVar != null) {
            zzcbqVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccc
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i, final int i2) {
        zzcbq zzcbqVar = this.zzm;
        if (zzcbqVar != null) {
            zzcbqVar.zzc(i, i2);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccb
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzO(i, i2);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcca
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzQ(i);
            }
        });
        super.onWindowVisibilityChanged(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzA(int i) {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzN(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzB(int i) {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzR(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzC(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzl == 4) {
            z = true;
        }
        this.zzi = str;
        zzW(z, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzD(int i, int i2) {
        this.zzq = i;
        this.zzr = i2;
        zzaa();
    }

    public final zzcbj zzE(@Nullable Integer num) {
        zzcbr zzcbrVar = this.zze;
        zzcbs zzcbsVar = this.zzc;
        zzcef zzcefVar = new zzcef(zzcbsVar.getContext(), zzcbrVar, zzcbsVar, num);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("ExoPlayerAdapter initialized.");
        return zzcefVar;
    }

    public final String zzF() {
        zzcbs zzcbsVar = this.zzc;
        return com.google.android.gms.ads.internal.zzv.zzq().zzc(zzcbsVar.getContext(), zzcbsVar.zzn().afmaVersion);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z, long j) {
        this.zzc.zzv(z, j);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i, int i2) {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzj(i, i2);
        }
    }

    public final /* synthetic */ void zzP() {
        float fZza = this.zzb.zza();
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzcbjVar.zzT(fZza, false);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("", e);
        }
    }

    public final /* synthetic */ void zzQ(int i) {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.onWindowVisibilityChanged(i);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcax zzcaxVar = this.zzf;
        if (zzcaxVar != null) {
            zzcaxVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzb() {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzf() {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzg() {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final long zzh() {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(final boolean z, final long j) {
        if (this.zzc != null) {
            zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccd
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzJ(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzk(String str, Exception exc) {
        final String strZzT = zzT(str, exc);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("ExoPlayerAdapter error: ".concat(strZzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcch
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzG(strZzT);
            }
        });
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzl(String str, Exception exc) {
        final String strZzT = zzT("onLoadException", exc);
        com.google.android.gms.ads.internal.util.client.zzo.zzj("ExoPlayerAdapter exception: ".concat(strZzT));
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcce
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzK(strZzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzm(int i) {
        if (this.zzl != i) {
            this.zzl = i;
            if (i == 3) {
                zzV();
                return;
            }
            if (i != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcci
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzH();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay, com.google.android.gms.internal.ads.zzcbv
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccf
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcby
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzq(int i) {
        if (zzac()) {
            this.zzh.zzI(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzr(zzcax zzcaxVar) {
        this.zzf = zzcaxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzs(@Nullable String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzu(float f, float f2) {
        zzcbq zzcbqVar = this.zzm;
        if (zzcbqVar != null) {
            zzcbqVar.zzf(f, f2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbx
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    @Nullable
    public final Integer zzw() {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            return zzcbjVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzx(int i) {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzJ(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzy(int i) {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzK(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcay
    public final void zzz(int i) {
        zzcbj zzcbjVar = this.zzh;
        if (zzcbjVar != null) {
            zzcbjVar.zzM(i);
        }
    }
}
