package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.common.util.Clock;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcdn extends zzcde implements zzcbi {
    public static final /* synthetic */ int zzd = 0;
    private zzcbj zze;
    private String zzf;
    private boolean zzg;
    private boolean zzh;
    private zzccw zzi;
    private long zzj;
    private long zzk;

    public zzcdn(zzcbs zzcbsVar, zzcbr zzcbrVar) {
        super(zzcbsVar);
        zzcef zzcefVar = new zzcef(zzcbsVar.getContext(), zzcbrVar, (zzcbs) this.zzc.get(), null);
        com.google.android.gms.ads.internal.util.client.zzo.zzi("ExoPlayerAdapter initialized.");
        this.zze = zzcefVar;
        zzcefVar.zzL(this);
    }

    public static final String zzc(String str) {
        return "cache:".concat(String.valueOf(com.google.android.gms.ads.internal.util.client.zzf.zzf(str)));
    }

    private static String zzd(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzx(long j) {
        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdm
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.zza.zzb();
            }
        }, j);
    }

    @Override // com.google.android.gms.internal.ads.zzcde, com.google.android.gms.common.api.Releasable
    public final void release() {
        zzcbj zzcbjVar = this.zze;
        if (zzcbjVar != null) {
            zzcbjVar.zzL(null);
            this.zze.zzH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzD(int i, int i2) {
    }

    public final zzcbj zza() {
        synchronized (this) {
            this.zzh = true;
            notify();
        }
        this.zze.zzL(null);
        zzcbj zzcbjVar = this.zze;
        this.zze = null;
        return zzcbjVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb() throws Throwable {
        String str;
        zzcdn zzcdnVar;
        zzcdn zzcdnVar2;
        zzcdn zzcdnVar3;
        long j;
        String str2;
        zzcdn zzcdnVar4;
        long j2;
        String strZzc = zzc(this.zzf);
        try {
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzK)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzs)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
            try {
                synchronized (this) {
                    try {
                        if (com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis() - this.zzj > jLongValue) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue + " ms");
                        }
                        if (this.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.zzh) {
                            if (!this.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = this.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = this.zze.zzv();
                                if (jZzv != this.zzk) {
                                    try {
                                        str2 = strZzc;
                                        try {
                                            zzo(this.zzf, strZzc, jZzv, jZzz, jZzv > 0, zBooleanValue ? this.zze.zzA() : -1L, zBooleanValue ? this.zze.zzx() : -1L, zBooleanValue ? this.zze.zzB() : -1L, zzcbj.zzs(), zzcbj.zzu());
                                            zzcdnVar4 = this;
                                            j = jZzv;
                                            try {
                                                zzcdnVar4.zzk = j;
                                                j2 = jZzz;
                                                zzcdnVar4 = zzcdnVar4;
                                            } catch (Throwable th) {
                                                th = th;
                                                str = str2;
                                                zzcdnVar = zzcdnVar4;
                                                try {
                                                    throw th;
                                                } catch (Exception e) {
                                                    e = e;
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + zzcdnVar.zzf + " Exception: " + e.getMessage());
                                                    com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
                                                    release();
                                                    zzcdnVar.zzg(zzcdnVar.zzf, str, "error", zzd("error", e));
                                                    zzcdnVar2 = zzcdnVar;
                                                    com.google.android.gms.ads.internal.zzv.zzz().zzc(zzcdnVar2.zzi);
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            zzcdnVar4 = this;
                                            str = str2;
                                            zzcdnVar = zzcdnVar4;
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str2 = strZzc;
                                        zzcdnVar4 = this;
                                    }
                                } else {
                                    j = jZzv;
                                    str2 = strZzc;
                                    zzcdnVar4 = this;
                                    j2 = jZzz;
                                }
                                if (j >= j2) {
                                    zzcdnVar4.zzj(zzcdnVar4.zzf, str2, j2);
                                    zzcdnVar2 = zzcdnVar4;
                                } else if (zzcdnVar4.zze.zzw() >= jIntValue && j > 0) {
                                    zzcdnVar2 = zzcdnVar4;
                                }
                            } else {
                                zzcdnVar3 = this;
                            }
                            zzcdnVar3.zzx(((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzL)).longValue());
                            return;
                        }
                        zzcdnVar2 = this;
                        com.google.android.gms.ads.internal.zzv.zzz().zzc(zzcdnVar2.zzi);
                    } catch (Throwable th4) {
                        th = th4;
                        str = strZzc;
                        zzcdnVar = this;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                zzcdnVar = zBooleanValue;
            }
        } catch (Exception e2) {
            e = e2;
            str = strZzc;
            zzcdnVar = this;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzf() {
        synchronized (this) {
            this.zzg = true;
            notify();
            release();
        }
        String str = this.zzf;
        if (str != null) {
            zzg(this.zzf, zzc(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzi(final boolean z, final long j) {
        final zzcbs zzcbsVar = (zzcbs) this.zzc.get();
        if (zzcbsVar != null) {
            zzbzw.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdl
                @Override // java.lang.Runnable
                public final void run() {
                    zzcbsVar.zzv(z, j);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzk(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Precache error", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzl(String str, Exception exc) {
        com.google.android.gms.ads.internal.util.client.zzo.zzk("Precache exception", exc);
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzm(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzp(int i) {
        this.zze.zzJ(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzq(int i) {
        this.zze.zzK(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzr(int i) {
        this.zze.zzM(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final void zzs(int i) {
        this.zze.zzN(i);
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzt(String str) {
        return zzu(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [com.google.android.gms.internal.ads.zzcbs] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.gms.internal.ads.zzcde, com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [com.google.android.gms.internal.ads.zzcdn] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.zzcde] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12, types: [int] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzu(String str, String[] strArr) throws Throwable {
        ?? r6;
        String str2;
        ?? r5;
        long j;
        ?? r7;
        ?? r8;
        String str3;
        long j2;
        ?? r15 = this;
        ?? r13 = str;
        r15.zzf = r13;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            r15.zze.zzF(uriArr, r15.zzb);
            ?? r0 = (zzcbs) r15.zzc.get();
            if (r0 != 0) {
                r0.zzt(strZzc, r15);
            }
            Clock clockZzC = com.google.android.gms.ads.internal.zzv.zzC();
            long jCurrentTimeMillis = clockZzC.currentTimeMillis();
            long jLongValue = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzL)).longValue();
            long jLongValue2 = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzK)).longValue() * 1000;
            long jIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzs)).intValue();
            boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzbY)).booleanValue();
            long j3 = -1;
            long j4 = jIntValue;
            r13 = r13;
            r15 = r15;
            while (true) {
                synchronized (this) {
                    try {
                        if (clockZzC.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            throw new IOException("Timeout reached. Limit: " + jLongValue2 + " ms");
                        }
                        if (r15.zzg) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!r15.zzh) {
                            if (!r15.zze.zzV()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long jZzz = r15.zze.zzz();
                            if (jZzz > 0) {
                                long jZzv = r15.zze.zzv();
                                if (jZzv != j3) {
                                    try {
                                        long j5 = jZzz;
                                        str3 = strZzc;
                                        try {
                                            zzo(str, strZzc, jZzv, j5, jZzv > 0, zBooleanValue ? r15.zze.zzA() : -1L, zBooleanValue ? r15.zze.zzx() : -1L, zBooleanValue ? r15.zze.zzB() : -1L, zzcbj.zzs(), zzcbj.zzu());
                                            j3 = jZzv;
                                            j2 = jZzz;
                                            r7 = j5;
                                        } catch (Throwable th) {
                                            th = th;
                                            r5 = this;
                                            r6 = str;
                                            str2 = str3;
                                            try {
                                                throw th;
                                            } catch (Exception e) {
                                                e = e;
                                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + r6 + " Exception: " + e.getMessage());
                                                com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
                                                release();
                                                r5.zzg(r6, str2, "error", zzd("error", e));
                                                return false;
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str3 = strZzc;
                                    }
                                } else {
                                    str3 = strZzc;
                                    j2 = jZzz;
                                    r7 = j4;
                                }
                                r8 = (jZzv > j2 ? 1 : (jZzv == j2 ? 0 : -1));
                                if (r8 >= 0) {
                                    zzj(str, str3, j2);
                                } else {
                                    try {
                                        zzcdn zzcdnVar = this;
                                        r7 = str;
                                        str2 = str3;
                                        if (zzcdnVar.zze.zzw() < j4 || jZzv <= 0) {
                                            r8 = zzcdnVar;
                                            j = j4;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        r5 = r8;
                                        r6 = r7;
                                        throw th;
                                    }
                                }
                            } else {
                                j = j4;
                                jLongValue2 = jLongValue2;
                                r7 = r13;
                                str2 = strZzc;
                                r8 = r15;
                            }
                            try {
                                r8.wait(jLongValue);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        }
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        r6 = r13;
                        str2 = strZzc;
                        r5 = r15;
                    }
                }
                return true;
                jLongValue = jLongValue;
                r15 = r8;
                r13 = r7;
                strZzc = str2;
                j4 = j;
                jLongValue2 = jLongValue2;
            }
        } catch (Exception e2) {
            e = e2;
            r6 = r13;
            str2 = strZzc;
            r5 = r15;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbi
    public final void zzv() {
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.zzcde
    public final boolean zzw(String str, String[] strArr, zzccw zzccwVar) {
        this.zzf = str;
        this.zzi = zzccwVar;
        String strZzc = zzc(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                uriArr[i] = Uri.parse(strArr[i]);
            }
            this.zze.zzF(uriArr, this.zzb);
            zzcbs zzcbsVar = (zzcbs) this.zzc.get();
            if (zzcbsVar != null) {
                zzcbsVar.zzt(strZzc, this);
            }
            this.zzj = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
            this.zzk = -1L;
            zzx(0L);
            return true;
        } catch (Exception e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to preload url " + str + " Exception: " + e.getMessage());
            com.google.android.gms.ads.internal.zzv.zzp().zzv(e, "VideoStreamExoPlayerCache.preload");
            release();
            zzg(str, strZzc, "error", zzd("error", e));
            return false;
        }
    }
}
