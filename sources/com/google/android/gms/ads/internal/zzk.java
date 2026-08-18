package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzarg;
import com.google.android.gms.internal.ads.zzauo;
import com.google.android.gms.internal.ads.zzaus;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzaux;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzbcl;
import com.google.android.gms.internal.ads.zzbzw;
import com.google.android.gms.internal.ads.zzfni;
import com.google.android.gms.internal.ads.zzfok;
import com.google.android.gms.internal.ads.zzfpe;
import com.google.android.gms.internal.ads.zzgch;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class zzk implements Runnable, zzauv {

    @VisibleForTesting
    protected boolean zza;
    private final boolean zzf;
    private final boolean zzg;
    private final Executor zzh;
    private final zzfni zzi;
    private Context zzj;
    private final Context zzk;
    private VersionInfoParcel zzl;
    private final VersionInfoParcel zzm;
    private final boolean zzn;
    private int zzo;
    private final List zzc = new Vector();
    private final AtomicReference zzd = new AtomicReference();
    private final AtomicReference zze = new AtomicReference();
    final CountDownLatch zzb = new CountDownLatch(1);

    public zzk(Context context, VersionInfoParcel versionInfoParcel) {
        this.zzj = context;
        this.zzk = context;
        this.zzl = versionInfoParcel;
        this.zzm = versionInfoParcel;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.zzh = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzbe.zzc().zza(zzbcl.zzcy)).booleanValue();
        this.zzn = zBooleanValue;
        this.zzi = zzfni.zza(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.zzf = ((Boolean) zzbe.zzc().zza(zzbcl.zzcv)).booleanValue();
        this.zzg = ((Boolean) zzbe.zzc().zza(zzbcl.zzcz)).booleanValue();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcx)).booleanValue()) {
            this.zzo = 2;
        } else {
            this.zzo = 1;
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzdA)).booleanValue()) {
            this.zza = zzi();
        }
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzdu)).booleanValue()) {
            zzbzw.zza.execute(this);
            return;
        }
        zzbc.zzb();
        if (com.google.android.gms.ads.internal.util.client.zzf.zzu()) {
            zzbzw.zza.execute(this);
        } else {
            run();
        }
    }

    @Nullable
    private final zzauv zzq() {
        return zzm() == 2 ? (zzauv) this.zze.get() : (zzauv) this.zzd.get();
    }

    private final void zzr() {
        List list = this.zzc;
        zzauv zzauvVarZzq = zzq();
        if (list.isEmpty() || zzauvVarZzq == null) {
            return;
        }
        for (Object[] objArr : this.zzc) {
            int length = objArr.length;
            if (length == 1) {
                zzauvVarZzq.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                zzauvVarZzq.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.zzc.clear();
    }

    private final void zzs(boolean z) {
        String str = this.zzl.afmaVersion;
        Context contextZzt = zzt(this.zzj);
        zzare zzareVarZza = zzarg.zza();
        zzareVarZza.zza(z);
        zzareVarZza.zzb(str);
        this.zzd.set(zzauz.zzu(contextZzt, new zzaux((zzarg) zzareVarZza.zzbr())));
    }

    private static final Context zzt(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final zzaus zzu(Context context, VersionInfoParcel versionInfoParcel, boolean z, boolean z2) {
        zzare zzareVarZza = zzarg.zza();
        zzareVarZza.zza(z);
        zzareVarZza.zzb(versionInfoParcel.afmaVersion);
        return zzaus.zza(zzt(context), (zzarg) zzareVarZza.zzbr(), z2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzdA)).booleanValue()) {
                this.zza = zzi();
            }
            boolean z = this.zzl.isClientJar;
            final boolean z2 = false;
            if (!((Boolean) zzbe.zzc().zza(zzbcl.zzbf)).booleanValue() && z) {
                z2 = true;
            }
            if (zzm() == 1) {
                zzs(z2);
                if (this.zzo == 2) {
                    this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzi
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzc(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    zzaus zzausVarZzu = zzu(this.zzj, this.zzl, z2, this.zzn);
                    this.zze.set(zzausVarZzu);
                    if (this.zzg && !zzausVarZzu.zzr()) {
                        this.zzo = 1;
                        zzs(z2);
                    }
                } catch (NullPointerException e) {
                    this.zzo = 1;
                    zzs(z2);
                    this.zzi.zzc(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
        } catch (Throwable th) {
            this.zzb.countDown();
            this.zzj = null;
            this.zzl = null;
            throw th;
        }
    }

    public final String zzb(Context context, byte[] bArr) {
        zzauv zzauvVarZzq;
        if (!zzj() || (zzauvVarZzq = zzq()) == null) {
            return "";
        }
        zzr();
        return zzauvVarZzq.zzf(zzt(context));
    }

    public final /* synthetic */ void zzc(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            zzu(this.zzk, this.zzm, z, this.zzn).zzp();
        } catch (NullPointerException e) {
            this.zzi.zzc(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzd(Context context, String str, View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zze(Context context, String str, View view, Activity activity) {
        if (!zzj()) {
            return "";
        }
        zzauv zzauvVarZzq = zzq();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
            zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 4, null);
        }
        if (zzauvVarZzq == null) {
            return "";
        }
        zzr();
        return zzauvVarZzq.zze(zzt(context), str, view, activity);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzf(Context context) {
        return zzb(context, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzg(final Context context) {
        try {
            return (String) zzgch.zzj(new Callable() { // from class: com.google.android.gms.ads.internal.zzh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.zza.zzb(context, null);
                }
            }, this.zzh).get(((Integer) zzbe.zzc().zza(zzbcl.zzcP)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException unused) {
            return Integer.toString(17);
        } catch (TimeoutException unused2) {
            return zzauo.zza(context, this.zzm.afmaVersion, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzbe.zzc().zza(zzbcl.zzky)).booleanValue()) {
            zzauv zzauvVarZzq = zzq();
            if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
                zzv.zzq();
                com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
            }
            return zzauvVarZzq != null ? zzauvVarZzq.zzh(context, view, activity) : "";
        }
        if (!zzj()) {
            return "";
        }
        zzauv zzauvVarZzq2 = zzq();
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzkz)).booleanValue()) {
            zzv.zzq();
            com.google.android.gms.ads.internal.util.zzs.zzK(view, 2, null);
        }
        return zzauvVarZzq2 != null ? zzauvVarZzq2.zzh(context, view, activity) : "";
    }

    public final boolean zzi() {
        Context context = this.zzj;
        zzj zzjVar = new zzj(this);
        zzfni zzfniVar = this.zzi;
        return new zzfpe(this.zzj, zzfok.zzb(context, zzfniVar), zzjVar, ((Boolean) zzbe.zzc().zza(zzbcl.zzcw)).booleanValue()).zzd(1);
    }

    public final boolean zzj() {
        try {
            this.zzb.await();
            return true;
        } catch (InterruptedException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzk(MotionEvent motionEvent) {
        zzauv zzauvVarZzq = zzq();
        if (zzauvVarZzq == null) {
            this.zzc.add(new Object[]{motionEvent});
        } else {
            zzr();
            zzauvVarZzq.zzk(motionEvent);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzl(int i, int i2, int i3) {
        zzauv zzauvVarZzq = zzq();
        if (zzauvVarZzq == null) {
            this.zzc.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            zzr();
            zzauvVarZzq.zzl(i, i2, i3);
        }
    }

    public final int zzm() {
        if (!this.zzf || this.zza) {
            return this.zzo;
        }
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzauv zzauvVarZzq;
        zzauv zzauvVarZzq2;
        if (((Boolean) zzbe.zzc().zza(zzbcl.zzcU)).booleanValue()) {
            if (this.zzb.getCount() != 0 || (zzauvVarZzq2 = zzq()) == null) {
                return;
            }
            zzauvVarZzq2.zzn(stackTraceElementArr);
            return;
        }
        if (!zzj() || (zzauvVarZzq = zzq()) == null) {
            return;
        }
        zzauvVarZzq.zzn(stackTraceElementArr);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzo(View view) {
        zzauv zzauvVarZzq = zzq();
        if (zzauvVarZzq != null) {
            zzauvVarZzq.zzo(view);
        }
    }

    public final int zzp() {
        return this.zzo;
    }
}
