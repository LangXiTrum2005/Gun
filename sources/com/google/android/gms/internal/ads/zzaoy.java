package com.google.android.gms.internal.ads;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: loaded from: classes3.dex */
public final class zzaoy extends Thread {
    private static final boolean zza = zzapy.zzb;
    private final BlockingQueue zzb;
    private final BlockingQueue zzc;
    private final zzaow zzd;
    private volatile boolean zze = false;
    private final zzapz zzf;
    private final zzapd zzg;

    public zzaoy(BlockingQueue blockingQueue, BlockingQueue blockingQueue2, zzaow zzaowVar, zzapd zzapdVar) {
        this.zzb = blockingQueue;
        this.zzc = blockingQueue2;
        this.zzd = zzaowVar;
        this.zzg = zzapdVar;
        this.zzf = new zzapz(this, blockingQueue2, zzapdVar);
    }

    private void zzc() throws InterruptedException {
        zzapm zzapmVar = (zzapm) this.zzb.take();
        zzapmVar.zzm("cache-queue-take");
        zzapmVar.zzt(1);
        try {
            zzapmVar.zzw();
            zzaov zzaovVarZza = this.zzd.zza(zzapmVar.zzj());
            if (zzaovVarZza == null) {
                zzapmVar.zzm("cache-miss");
                if (!this.zzf.zzc(zzapmVar)) {
                    this.zzc.put(zzapmVar);
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                if (zzaovVarZza.zza(jCurrentTimeMillis)) {
                    zzapmVar.zzm("cache-hit-expired");
                    zzapmVar.zze(zzaovVarZza);
                    if (!this.zzf.zzc(zzapmVar)) {
                        this.zzc.put(zzapmVar);
                    }
                } else {
                    zzapmVar.zzm("cache-hit");
                    zzaps zzapsVarZzh = zzapmVar.zzh(new zzapi(zzaovVarZza.zza, zzaovVarZza.zzg));
                    zzapmVar.zzm("cache-hit-parsed");
                    if (!zzapsVarZzh.zzc()) {
                        zzapmVar.zzm("cache-parsing-failed");
                        this.zzd.zzc(zzapmVar.zzj(), true);
                        zzapmVar.zze(null);
                        if (!this.zzf.zzc(zzapmVar)) {
                            this.zzc.put(zzapmVar);
                        }
                    } else if (zzaovVarZza.zzf < jCurrentTimeMillis) {
                        zzapmVar.zzm("cache-hit-refresh-needed");
                        zzapmVar.zze(zzaovVarZza);
                        zzapsVarZzh.zzd = true;
                        if (this.zzf.zzc(zzapmVar)) {
                            this.zzg.zzb(zzapmVar, zzapsVarZzh, null);
                        } else {
                            this.zzg.zzb(zzapmVar, zzapsVarZzh, new zzaox(this, zzapmVar));
                        }
                    } else {
                        this.zzg.zzb(zzapmVar, zzapsVarZzh, null);
                    }
                }
            }
        } finally {
            zzapmVar.zzt(2);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (zza) {
            zzapy.zzd("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.zzd.zzb();
        while (true) {
            try {
                zzc();
            } catch (InterruptedException unused) {
                if (this.zze) {
                    Thread.currentThread().interrupt();
                    return;
                }
                zzapy.zzb("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    public final void zzb() {
        this.zze = true;
        interrupt();
    }
}
