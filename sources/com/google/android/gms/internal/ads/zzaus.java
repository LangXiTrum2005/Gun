package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaus implements zzauv {

    @Nullable
    private static zzaus zzb;
    private final Context zzc;
    private final zzfox zzd;
    private final zzfpe zze;
    private final zzfpg zzf;
    private final zzavx zzg;
    private final zzfni zzh;
    private final Executor zzi;
    private final zzfpd zzj;
    private final zzawm zzl;

    @Nullable
    private final zzawe zzm;

    @Nullable
    private final zzavv zzn;
    private volatile boolean zzp;
    private volatile boolean zzq;
    private final int zzr;

    @VisibleForTesting
    volatile long zza = 0;
    private final Object zzo = new Object();
    private final CountDownLatch zzk = new CountDownLatch(1);

    @VisibleForTesting
    public zzaus(@NonNull Context context, @NonNull zzfni zzfniVar, @NonNull zzfox zzfoxVar, @NonNull zzfpe zzfpeVar, @NonNull zzfpg zzfpgVar, @NonNull zzavx zzavxVar, @NonNull Executor executor, @NonNull zzfnd zzfndVar, int i, @Nullable zzawm zzawmVar, @Nullable zzawe zzaweVar, @Nullable zzavv zzavvVar) {
        this.zzq = false;
        this.zzc = context;
        this.zzh = zzfniVar;
        this.zzd = zzfoxVar;
        this.zze = zzfpeVar;
        this.zzf = zzfpgVar;
        this.zzg = zzavxVar;
        this.zzi = executor;
        this.zzr = i;
        this.zzl = zzawmVar;
        this.zzm = zzaweVar;
        this.zzn = zzavvVar;
        this.zzq = false;
        this.zzj = new zzauq(this, zzfndVar);
    }

    public static synchronized zzaus zza(@NonNull Context context, @NonNull zzarg zzargVar, boolean z) {
        zzfnj zzfnjVarZzc;
        zzfnjVarZzc = zzfnk.zzc();
        zzfnjVarZzc.zza(zzargVar.zzf());
        zzfnjVarZzc.zzg(zzargVar.zzi());
        return zzs(context, Executors.newCachedThreadPool(), zzfnjVarZzc.zzh(), z);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d5 A[Catch: all -> 0x009d, zzgyg -> 0x00a0, TryCatch #0 {zzgyg -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc A[Catch: all -> 0x009d, zzgyg -> 0x00a0, TryCatch #0 {zzgyg -> 0x00a0, blocks: (B:6:0x0021, B:8:0x0032, B:12:0x0038, B:13:0x0044, B:15:0x0052, B:17:0x0060, B:20:0x006d, B:32:0x00a3, B:36:0x00bc, B:42:0x00d5, B:43:0x00e2, B:45:0x00e8, B:47:0x00f0, B:48:0x00f2, B:39:0x00c6, B:40:0x00cd, B:23:0x0074, B:25:0x008a, B:49:0x00fc, B:50:0x0109, B:51:0x0116), top: B:58:0x0021, outer: #2 }] */
    public static /* bridge */ /* synthetic */ void zzj(zzaus zzausVar) {
        String str;
        String strZzj;
        int length;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfow zzfowVarZzu = zzausVar.zzu(1);
        if (zzfowVarZzu != null) {
            String strZzk = zzfowVarZzu.zza().zzk();
            strZzj = zzfowVarZzu.zza().zzj();
            str = strZzk;
        } else {
            str = null;
            strZzj = null;
        }
        try {
            try {
                zzfpb zzfpbVarZza = zzfns.zza(zzausVar.zzc, 1, zzausVar.zzr, str, strZzj, "1", zzausVar.zzh);
                byte[] bArr = zzfpbVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzausVar.zzh.zzd(5009, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzaxw zzaxwVarZzb = zzaxw.zzb(zzgwj.zzv(bArr, 0, length), zzgxb.zza());
                        if (zzaxwVarZzb.zzc().zzk().isEmpty() || zzaxwVarZzb.zzc().zzj().isEmpty() || zzaxwVarZzb.zzd().zzA().length == 0) {
                            zzausVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfow zzfowVarZzu2 = zzausVar.zzu(1);
                            if (zzfowVarZzu2 != null) {
                                zzaxz zzaxzVarZza = zzfowVarZzu2.zza();
                                if (zzaxwVarZzb.zzc().zzk().equals(zzaxzVarZza.zzk()) && zzaxwVarZzb.zzc().zzj().equals(zzaxzVarZza.zzj())) {
                                    zzausVar.zzh.zzd(5010, System.currentTimeMillis() - jCurrentTimeMillis);
                                }
                            }
                            zzfpd zzfpdVar = zzausVar.zzj;
                            int i = zzfpbVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcu)).booleanValue()) {
                                zZza = zzausVar.zzd.zza(zzaxwVarZzb, zzfpdVar);
                            } else if (i == 3) {
                                zZza = zzausVar.zze.zza(zzaxwVarZzb);
                            } else if (i == 4) {
                                zZza = zzausVar.zze.zzb(zzaxwVarZzb, zzfpdVar);
                            } else {
                                zzausVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfow zzfowVarZzu3 = zzausVar.zzu(1);
                                if (zzfowVarZzu3 != null) {
                                    if (zzausVar.zzf.zzc(zzfowVarZzu3)) {
                                        zzausVar.zzq = true;
                                    }
                                    zzausVar.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                zzausVar.zzh.zzd(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        zzausVar.zzh.zzd(2030, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } finally {
                zzausVar.zzk.countDown();
            }
        } catch (zzgyg e) {
            zzausVar.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    private static synchronized zzaus zzs(@NonNull Context context, @NonNull Executor executor, zzfnk zzfnkVar, boolean z) {
        try {
            if (zzb == null) {
                zzfni zzfniVarZza = zzfni.zza(context, executor, z);
                zzavg zzavgVarZzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdw)).booleanValue() ? zzavg.zzc(context) : null;
                zzawm zzawmVarZzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdx)).booleanValue() ? zzawm.zzd(context, executor) : null;
                zzawe zzaweVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcM)).booleanValue() ? new zzawe() : null;
                zzavv zzavvVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcT)).booleanValue() ? new zzavv() : null;
                zzfob zzfobVarZze = zzfob.zze(context, executor, zzfniVarZza, zzfnkVar);
                zzavw zzavwVar = new zzavw(context);
                zzavx zzavxVar = new zzavx(zzfnkVar, zzfobVarZze, new zzawk(context, zzavwVar), zzavwVar, zzavgVarZzc, zzawmVarZzd, zzaweVar, zzavvVar);
                int iZzb = zzfok.zzb(context, zzfniVarZza);
                zzfnd zzfndVar = new zzfnd();
                zzaus zzausVar = new zzaus(context, zzfniVarZza, new zzfox(context, iZzb), new zzfpe(context, iZzb, new zzaup(zzfniVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcw)).booleanValue()), new zzfpg(context, zzavxVar, zzfniVarZza, zzfndVar), zzavxVar, executor, zzfndVar, iZzb, zzawmVarZzd, zzaweVar, zzavvVar);
                zzb = zzausVar;
                zzausVar.zzm();
                zzb.zzp();
            }
        } catch (Throwable th) {
            throw th;
        }
        return zzb;
    }

    private final void zzt() {
        zzawm zzawmVar = this.zzl;
        if (zzawmVar != null) {
            zzawmVar.zzh();
        }
    }

    private final zzfow zzu(int i) {
        if (zzfok.zza(this.zzr)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcu)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzc(1);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzd(Context context, @Nullable String str, @Nullable View view) {
        return zze(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zze(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzi();
        }
        zzp();
        zzfnl zzfnlVarZza = this.zzf.zza();
        if (zzfnlVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfnlVarZza.zza(context, null, str, view, activity);
        this.zzh.zzf(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzf(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzj();
        }
        zzp();
        zzfnl zzfnlVarZza = this.zzf.zza();
        if (zzfnlVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfnlVarZza.zzc(context, null);
        this.zzh.zzf(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzg(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final String zzh(Context context, @Nullable View view, @Nullable Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcM)).booleanValue()) {
            this.zzm.zzk(context, view);
        }
        zzp();
        zzfnl zzfnlVarZza = this.zzf.zza();
        if (zzfnlVarZza == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfnlVarZza.zzb(context, null, view, activity);
        this.zzh.zzf(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzk(@Nullable MotionEvent motionEvent) {
        zzfnl zzfnlVarZza = this.zzf.zza();
        if (zzfnlVarZza != null) {
            try {
                zzfnlVarZza.zzd(null, motionEvent);
            } catch (zzfpf e) {
                this.zzh.zzc(e.zza(), -1L, e);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzl(int i, int i2, int i3) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzlP)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f = i;
        float f2 = displayMetrics.density;
        float f3 = i2;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f * f2, f3 * f2, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain);
        motionEventObtain.recycle();
        float f4 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f * f4, f3 * f4, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain2);
        motionEventObtain2.recycle();
        float f5 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i3, 1, f * f5, f3 * f5, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzk(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    public final synchronized void zzm() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfow zzfowVarZzu = zzu(1);
        if (zzfowVarZzu == null) {
            this.zzh.zzd(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zzc(zzfowVarZzu)) {
            this.zzq = true;
            this.zzk.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        zzavv zzavvVar = this.zzn;
        if (zzavvVar != null) {
            zzavvVar.zzb(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauv
    public final void zzo(@Nullable View view) {
        this.zzg.zzd(view);
    }

    public final void zzp() {
        if (this.zzp) {
            return;
        }
        synchronized (this.zzo) {
            try {
                if (!this.zzp) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfow zzfowVarZzb = this.zzf.zzb();
                    if ((zzfowVarZzb == null || zzfowVarZzb.zzd(3600L)) && zzfok.zza(this.zzr)) {
                        this.zzi.execute(new zzaur(this));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized boolean zzr() {
        return this.zzq;
    }
}
