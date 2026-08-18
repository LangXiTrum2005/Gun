package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzayy;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbej;
import com.google.android.gms.internal.ads.zzbpa;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class zzel {

    @VisibleForTesting
    final zzbd zza;
    private final zzbpa zzb;
    private final zzr zzc;
    private final AtomicBoolean zzd;
    private final VideoController zze;

    @Nullable
    private zza zzf;
    private AdListener zzg;
    private AdSize[] zzh;

    @Nullable
    private AppEventListener zzi;

    @Nullable
    private zzby zzj;
    private VideoOptions zzk;
    private String zzl;
    private final ViewGroup zzm;
    private int zzn;
    private boolean zzo;

    @Nullable
    private OnPaidEventListener zzp;

    public zzel(ViewGroup viewGroup) {
        this(viewGroup, null, false, zzr.zza, null, 0);
    }

    private static zzs zzD(Context context, AdSize[] adSizeArr, int i) {
        for (AdSize adSize : adSizeArr) {
            if (adSize.equals(AdSize.INVALID)) {
                return new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
            }
        }
        zzs zzsVar = new zzs(context, adSizeArr);
        zzsVar.zzj = zzE(i);
        return zzsVar;
    }

    private static boolean zzE(int i) {
        return i == 1;
    }

    public final boolean zzA() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzY();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final boolean zzB() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                return zzbyVar.zzZ();
            }
            return false;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public final AdSize[] zzC() {
        return this.zzh;
    }

    public final AdListener zza() {
        return this.zzg;
    }

    @Nullable
    public final AdSize zzb() {
        zzs zzsVarZzg;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null && (zzsVarZzg = zzbyVar.zzg()) != null) {
                return com.google.android.gms.ads.zzc.zzc(zzsVarZzg.zze, zzsVarZzg.zzb, zzsVarZzg.zza);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        AdSize[] adSizeArr = this.zzh;
        if (adSizeArr != null) {
            return adSizeArr[0];
        }
        return null;
    }

    @Nullable
    public final OnPaidEventListener zzc() {
        return this.zzp;
    }

    @Nullable
    public final ResponseInfo zzd() {
        zzdy zzdyVarZzk = null;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzdyVarZzk = zzbyVar.zzk();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zza(zzdyVarZzk);
    }

    public final VideoController zzf() {
        return this.zze;
    }

    public final VideoOptions zzg() {
        return this.zzk;
    }

    @Nullable
    public final AppEventListener zzh() {
        return this.zzi;
    }

    @Nullable
    public final zzeb zzi() {
        zzby zzbyVar = this.zzj;
        if (zzbyVar != null) {
            try {
                return zzbyVar.zzl();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return null;
    }

    public final String zzj() {
        zzby zzbyVar;
        if (this.zzl == null && (zzbyVar = this.zzj) != null) {
            try {
                this.zzl = zzbyVar.zzr();
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        return this.zzl;
    }

    public final void zzk() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzx();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final /* synthetic */ void zzl(IObjectWrapper iObjectWrapper) {
        this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d8 A[Catch: RemoteException -> 0x00d6, TRY_LEAVE, TryCatch #1 {RemoteException -> 0x00d6, blocks: (B:27:0x00a5, B:29:0x00ab, B:31:0x00b9, B:33:0x00cb, B:36:0x00d8), top: B:51:0x00a5, outer: #0 }] */
    public final void zzm(zzei zzeiVar) {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.zzj == null) {
                if (this.zzh == null || this.zzl == null) {
                    throw new IllegalStateException("The ad size and ad unit ID must be set before loadAd is called.");
                }
                Context context = this.zzm.getContext();
                zzs zzsVarZzD = zzD(context, this.zzh, this.zzn);
                zzby zzbyVar = "search_v2".equals(zzsVarZzD.zza) ? (zzby) new zzao(zzbc.zza(), context, zzsVarZzD, this.zzl).zzd(context, false) : (zzby) new zzam(zzbc.zza(), context, zzsVarZzD, this.zzl, this.zzb).zzd(context, false);
                this.zzj = zzbyVar;
                zzbyVar.zzD(new zzg(this.zza));
                zza zzaVar = this.zzf;
                if (zzaVar != null) {
                    this.zzj.zzC(new zzb(zzaVar));
                }
                AppEventListener appEventListener = this.zzi;
                if (appEventListener != null) {
                    this.zzj.zzG(new zzayy(appEventListener));
                }
                if (this.zzk != null) {
                    this.zzj.zzU(new zzga(this.zzk));
                }
                this.zzj.zzP(new zzfs(this.zzp));
                this.zzj.zzN(this.zzo);
                zzby zzbyVar2 = this.zzj;
                if (zzbyVar2 != null) {
                    try {
                        final IObjectWrapper iObjectWrapperZzn = zzbyVar2.zzn();
                        if (iObjectWrapperZzn != null) {
                            if (((Boolean) zzbej.zzf.zze()).booleanValue()) {
                                if (((Boolean) zzbe.zzc().zza(zzbcl.zzla)).booleanValue()) {
                                    com.google.android.gms.ads.internal.util.client.zzf.zza.post(new Runnable() { // from class: com.google.android.gms.ads.internal.client.zzej
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            this.zza.zzl(iObjectWrapperZzn);
                                        }
                                    });
                                } else {
                                    this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapperZzn));
                                }
                            } else {
                                this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapperZzn));
                            }
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                    }
                }
            }
            if (zzeiVar != null) {
                zzeiVar.zzq(jCurrentTimeMillis);
            }
            zzby zzbyVar3 = this.zzj;
            zzbyVar3.getClass();
            zzbyVar3.zzab(this.zzc.zza(this.zzm.getContext(), zzeiVar));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
        }
    }

    public final void zzn() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzz();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzo() {
        if (this.zzd.getAndSet(true)) {
            return;
        }
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzA();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzp() {
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzB();
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzq(@Nullable zza zzaVar) {
        try {
            this.zzf = zzaVar;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzC(zzaVar != null ? new zzb(zzaVar) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzr(AdListener adListener) {
        this.zzg = adListener;
        this.zza.zza(adListener);
    }

    public final void zzs(AdSize... adSizeArr) {
        if (this.zzh != null) {
            throw new IllegalStateException("The ad size can only be set once on AdView.");
        }
        zzt(adSizeArr);
    }

    public final void zzt(AdSize... adSizeArr) {
        this.zzh = adSizeArr;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzF(zzD(this.zzm.getContext(), this.zzh, this.zzn));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
        this.zzm.requestLayout();
    }

    public final void zzu(String str) {
        if (this.zzl != null) {
            throw new IllegalStateException("The ad unit ID can only be set once on AdView.");
        }
        this.zzl = str;
    }

    public final void zzv(@Nullable AppEventListener appEventListener) {
        try {
            this.zzi = appEventListener;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzG(appEventListener != null ? new zzayy(appEventListener) : null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzw(boolean z) {
        this.zzo = z;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzN(z);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzx(@Nullable OnPaidEventListener onPaidEventListener) {
        try {
            this.zzp = onPaidEventListener;
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzP(new zzfs(onPaidEventListener));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final void zzy(VideoOptions videoOptions) {
        this.zzk = videoOptions;
        try {
            zzby zzbyVar = this.zzj;
            if (zzbyVar != null) {
                zzbyVar.zzU(videoOptions == null ? null : new zzga(videoOptions));
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
        }
    }

    public final boolean zzz(zzby zzbyVar) {
        try {
            IObjectWrapper iObjectWrapperZzn = zzbyVar.zzn();
            if (iObjectWrapperZzn == null || ((View) ObjectWrapper.unwrap(iObjectWrapperZzn)).getParent() != null) {
                return false;
            }
            this.zzm.addView((View) ObjectWrapper.unwrap(iObjectWrapperZzn));
            this.zzj = zzbyVar;
            return true;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return false;
        }
    }

    public zzel(ViewGroup viewGroup, int i) {
        this(viewGroup, null, false, zzr.zza, null, i);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z) {
        this(viewGroup, attributeSet, z, zzr.zza, null, 0);
    }

    public zzel(ViewGroup viewGroup, AttributeSet attributeSet, boolean z, int i) {
        this(viewGroup, attributeSet, z, zzr.zza, null, i);
    }

    @VisibleForTesting
    public zzel(ViewGroup viewGroup, @Nullable AttributeSet attributeSet, boolean z, zzr zzrVar, @Nullable zzby zzbyVar, int i) {
        zzs zzsVar;
        this.zzb = new zzbpa();
        this.zze = new VideoController();
        this.zza = new zzek(this);
        this.zzm = viewGroup;
        this.zzc = zzrVar;
        this.zzj = null;
        this.zzd = new AtomicBoolean(false);
        this.zzn = i;
        if (attributeSet != null) {
            Context context = viewGroup.getContext();
            try {
                zzaa zzaaVar = new zzaa(context, attributeSet);
                this.zzh = zzaaVar.zzb(z);
                this.zzl = zzaaVar.zza();
                if (viewGroup.isInEditMode()) {
                    com.google.android.gms.ads.internal.util.client.zzf zzfVarZzb = zzbc.zzb();
                    AdSize adSize = this.zzh[0];
                    int i2 = this.zzn;
                    if (adSize.equals(AdSize.INVALID)) {
                        zzsVar = new zzs("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
                    } else {
                        zzs zzsVar2 = new zzs(context, adSize);
                        zzsVar2.zzj = zzE(i2);
                        zzsVar = zzsVar2;
                    }
                    zzfVarZzb.zzm(viewGroup, zzsVar, "Ads by Google");
                }
            } catch (IllegalArgumentException e) {
                zzbc.zzb().zzl(viewGroup, new zzs(context, AdSize.BANNER), e.getMessage(), e.getMessage());
            }
        }
    }
}
