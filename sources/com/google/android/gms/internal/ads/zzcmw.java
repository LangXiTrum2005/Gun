package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcmw implements zzcvt, zzcxh, zzcwn, com.google.android.gms.ads.internal.client.zza, zzcwj, zzddj {
    private final Context zza;
    private final Executor zzb;
    private final Executor zzc;
    private final ScheduledExecutorService zzd;
    private final zzfca zze;
    private final zzfbo zzf;
    private final zzfiv zzg;
    private final zzfcv zzh;
    private final zzava zzi;
    private final zzbds zzj;
    private final WeakReference zzk;
    private final WeakReference zzl;

    @Nullable
    private final zzcut zzm;
    private boolean zzn;
    private final AtomicBoolean zzo = new AtomicBoolean();

    public zzcmw(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, zzfca zzfcaVar, zzfbo zzfboVar, zzfiv zzfivVar, zzfcv zzfcvVar, @Nullable View view, @Nullable zzcex zzcexVar, zzava zzavaVar, zzbds zzbdsVar, zzbdu zzbduVar, zzfhh zzfhhVar, @Nullable zzcut zzcutVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = executor2;
        this.zzd = scheduledExecutorService;
        this.zze = zzfcaVar;
        this.zzf = zzfboVar;
        this.zzg = zzfivVar;
        this.zzh = zzfcvVar;
        this.zzi = zzavaVar;
        this.zzk = new WeakReference(view);
        this.zzl = new WeakReference(zzcexVar);
        this.zzj = zzbdsVar;
        this.zzm = zzcutVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List zzu() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzll)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzq();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(this.zza)) {
                com.google.android.gms.ads.internal.zzv.zzq();
                Integer numZzt = com.google.android.gms.ads.internal.util.zzs.zzt(this.zza);
                if (numZzt != null) {
                    int iMin = Math.min(numZzt.intValue(), 20);
                    ArrayList arrayList = new ArrayList();
                    Iterator it = this.zzf.zzd.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Uri.parse((String) it.next()).buildUpon().appendQueryParameter("dspct", Integer.toString(iMin)).toString());
                    }
                    return arrayList;
                }
            }
        }
        return this.zzf.zzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzv() {
        String strZzh;
        int i;
        List list = this.zzf.zzd;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdE)).booleanValue()) {
            strZzh = this.zzi.zzc().zzh(this.zza, (View) this.zzk.get(), null);
        } else {
            strZzh = null;
        }
        if ((((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaB)).booleanValue() && this.zze.zzb.zzb.zzh) || !((Boolean) zzbek.zzh.zze()).booleanValue()) {
            this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, false, strZzh, null, zzu()));
            return;
        }
        if (((Boolean) zzbek.zzg.zze()).booleanValue() && ((i = this.zzf.zzb) == 1 || i == 2 || i == 5)) {
        }
        zzgch.zzr((zzgby) zzgch.zzo(zzgby.zzu(zzgch.zzh(null)), ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbe)).longValue(), TimeUnit.MILLISECONDS, this.zzd), new zzcmv(this, strZzh), this.zzb);
    }

    private final void zzw(final int i, final int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.zzk.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            zzv();
        } else {
            this.zzd.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcms
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzo(i, i2);
                }
            }, i2, TimeUnit.MILLISECONDS);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        if (!(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzaB)).booleanValue() && this.zze.zzb.zzb.zzh) && ((Boolean) zzbek.zzd.zze()).booleanValue()) {
            zzgch.zzr((zzgby) zzgch.zze(zzgby.zzu(this.zzj.zza()), Throwable.class, new zzfuc() { // from class: com.google.android.gms.internal.ads.zzcmq
                @Override // com.google.android.gms.internal.ads.zzfuc
                public final Object apply(Object obj) {
                    return "failure_click_attok";
                }
            }, zzbzw.zzg), new zzcmu(this), this.zzb);
            return;
        }
        zzfcv zzfcvVar = this.zzh;
        zzfiv zzfivVar = this.zzg;
        zzfca zzfcaVar = this.zze;
        zzfbo zzfboVar = this.zzf;
        zzfcvVar.zzc(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzc), true == com.google.android.gms.ads.internal.zzv.zzp().zzA(this.zza) ? 2 : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzb() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzc() {
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzdq(zzbvw zzbvwVar, String str, String str2) {
        zzfcv zzfcvVar = this.zzh;
        zzfiv zzfivVar = this.zzg;
        zzfbo zzfboVar = this.zzf;
        zzfcvVar.zza(zzfivVar.zze(zzfboVar, zzfboVar.zzh, zzbvwVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zze() {
        zzfcv zzfcvVar = this.zzh;
        zzfiv zzfivVar = this.zzg;
        zzfca zzfcaVar = this.zze;
        zzfbo zzfboVar = this.zzf;
        zzfcvVar.zza(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzi));
    }

    @Override // com.google.android.gms.internal.ads.zzcvt
    public final void zzf() {
        zzfcv zzfcvVar = this.zzh;
        zzfiv zzfivVar = this.zzg;
        zzfca zzfcaVar = this.zze;
        zzfbo zzfboVar = this.zzf;
        zzfcvVar.zza(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzg));
    }

    public final /* synthetic */ void zzn() {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmr
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzv();
            }
        });
    }

    public final /* synthetic */ void zzo(final int i, final int i2) {
        this.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmt
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzp(i, i2);
            }
        });
    }

    public final /* synthetic */ void zzp(int i, int i2) {
        zzw(i - 1, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcwj
    public final void zzq(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbD)).booleanValue()) {
            this.zzh.zza(this.zzg.zzc(this.zze, this.zzf, zzfiv.zzf(2, zzeVar.zza, this.zzf.zzo)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcwn
    public final void zzr() {
        if (this.zzo.compareAndSet(false, true)) {
            int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdN)).intValue();
            if (iIntValue > 0) {
                zzw(iIntValue, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdO)).intValue());
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdM)).booleanValue()) {
                this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzn();
                    }
                });
            } else {
                zzv();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxh
    public final synchronized void zzs() {
        zzcut zzcutVar;
        try {
            if (this.zzn) {
                ArrayList arrayList = new ArrayList(zzu());
                arrayList.addAll(this.zzf.zzf);
                this.zzh.zza(this.zzg.zzd(this.zze, this.zzf, true, null, null, arrayList));
            } else {
                zzfcv zzfcvVar = this.zzh;
                zzfiv zzfivVar = this.zzg;
                zzfca zzfcaVar = this.zze;
                zzfbo zzfboVar = this.zzf;
                zzfcvVar.zza(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzm));
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdJ)).booleanValue() && (zzcutVar = this.zzm) != null) {
                    List listZzh = zzfiv.zzh(zzfiv.zzg(zzcutVar.zzb().zzm, zzcutVar.zza().zzg()), this.zzm.zza().zza());
                    zzfcv zzfcvVar2 = this.zzh;
                    zzfiv zzfivVar2 = this.zzg;
                    zzcut zzcutVar2 = this.zzm;
                    zzfcvVar2.zza(zzfivVar2.zzc(zzcutVar2.zzc(), zzcutVar2.zzb(), listZzh));
                }
                zzfcv zzfcvVar3 = this.zzh;
                zzfiv zzfivVar3 = this.zzg;
                zzfca zzfcaVar2 = this.zze;
                zzfbo zzfboVar2 = this.zzf;
                zzfcvVar3.zza(zzfivVar3.zzc(zzfcaVar2, zzfboVar2, zzfboVar2.zzf));
            }
            this.zzn = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddj
    public final void zzt() {
        zzfcv zzfcvVar = this.zzh;
        zzfiv zzfivVar = this.zzg;
        zzfca zzfcaVar = this.zze;
        zzfbo zzfboVar = this.zzf;
        zzfcvVar.zza(zzfivVar.zzc(zzfcaVar, zzfboVar, zzfboVar.zzau));
    }
}
