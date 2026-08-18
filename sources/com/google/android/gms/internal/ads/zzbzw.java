package com.google.android.gms.internal.ads;

import androidx.webkit.Profile;
import com.google.android.gms.common.util.ClientLibraryUtils;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzw {
    public static final zzgcs zza;
    public static final zzgcs zzb;
    public static final zzgcs zzc;
    public static final ScheduledExecutorService zzd;
    public static final zzgct zze;
    public static final zzgcs zzf;
    public static final zzgcs zzg;

    /* JADX WARN: Code duplicated, block: B:14:0x0091  */
    static {
        Executor threadPoolExecutor;
        ExecutorService executorServiceZzc;
        ExecutorService executorServiceZzb;
        if (ClientLibraryUtils.isPackageSide()) {
            zzfqv.zza();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new zzbzs(Profile.DEFAULT_PROFILE_NAME)));
        } else {
            zzbcc zzbccVar = zzbcl.zzlf;
            if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar) == null || !((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar)).booleanValue()) {
                threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzs(Profile.DEFAULT_PROFILE_NAME));
            } else {
                zzbcc zzbccVar2 = zzbcl.zzlg;
                if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar2) != null) {
                    zzbcc zzbccVar3 = zzbcl.zzlh;
                    if (com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar3) != null) {
                        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar2)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar2)).intValue(), 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs(Profile.DEFAULT_PROFILE_NAME));
                        threadPoolExecutor2.allowCoreThreadTimeOut(((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zzb(zzbccVar3)).booleanValue());
                        threadPoolExecutor = threadPoolExecutor2;
                    } else {
                        threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzs(Profile.DEFAULT_PROFILE_NAME));
                    }
                } else {
                    threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new zzbzs(Profile.DEFAULT_PROFILE_NAME));
                }
            }
        }
        zzbzv zzbzvVar = null;
        zza = new zzbzu(threadPoolExecutor, zzbzvVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzc = zzfqv.zza().zzc(5, new zzbzs("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Loader"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorServiceZzc = threadPoolExecutor3;
        }
        zzb = new zzbzu(executorServiceZzc, zzbzvVar);
        if (ClientLibraryUtils.isPackageSide()) {
            executorServiceZzb = zzfqv.zza().zzb(new zzbzs("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor4 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new zzbzs("Activeview"));
            threadPoolExecutor4.allowCoreThreadTimeOut(true);
            executorServiceZzb = threadPoolExecutor4;
        }
        zzc = new zzbzu(executorServiceZzb, zzbzvVar);
        zzbzr zzbzrVar = new zzbzr(3, new zzbzs("Schedule"));
        zzd = zzbzrVar;
        zze = zzgcz.zzb(zzbzrVar);
        zzf = new zzbzu(new zzbzt(), zzbzvVar);
        zzg = new zzbzu(zzgcz.zzc(), zzbzvVar);
    }
}
