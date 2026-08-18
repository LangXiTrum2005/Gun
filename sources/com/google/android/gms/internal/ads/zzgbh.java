package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgbh extends zzgbm {
    private static final zzgcq zza = new zzgcq(zzgbh.class);

    @CheckForNull
    private zzfxi zzb;
    private final boolean zzc;
    private final boolean zzf;

    public zzgbh(zzfxi zzfxiVar, boolean z, boolean z2) {
        super(zzfxiVar.size());
        this.zzb = zzfxiVar;
        this.zzc = z;
        this.zzf = z2;
    }

    private final void zzG(int i, Future future) {
        try {
            zzf(i, zzgdk.zza(future));
        } catch (ExecutionException e) {
            zzI(e.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzx(@CheckForNull zzfxi zzfxiVar) {
        int iZzA = zzA();
        int i = 0;
        zzfun.zzm(iZzA >= 0, "Less than 0 remaining futures");
        if (iZzA == 0) {
            if (zzfxiVar != null) {
                zzfzt it = zzfxiVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            zzF();
            zzu();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzc && !zzd(th) && zzL(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzK, reason: merged with bridge method [inline-methods] */
    public final void zzw(int i, AI ai) {
        try {
            if (ai.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, ai);
            }
        } finally {
            zzx(null);
        }
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @CheckForNull
    public final String zza() {
        zzfxi zzfxiVar = this.zzb;
        return zzfxiVar != null ? "futures=".concat(zzfxiVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzfxi zzfxiVar = this.zzb;
        zzy(1);
        if ((zzfxiVar != null) && isCancelled()) {
            boolean zZzt = zzt();
            zzfzt it = zzfxiVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbm
    public final void zze(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzL(set, thZzl);
    }

    public abstract void zzf(int i, Object obj);

    public abstract void zzu();

    public final void zzv() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzu();
            return;
        }
        if (!this.zzc) {
            final zzfxi zzfxiVar = this.zzf ? this.zzb : null;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbg
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzx(zzfxiVar);
                }
            };
            zzfzt it = this.zzb.iterator();
            while (it.hasNext()) {
                AI ai = (AI) it.next();
                if (ai.isDone()) {
                    zzx(zzfxiVar);
                } else {
                    ai.addListener(runnable, zzgbv.INSTANCE);
                }
            }
            return;
        }
        zzfzt it2 = this.zzb.iterator();
        final int i = 0;
        while (it2.hasNext()) {
            final AI ai2 = (AI) it2.next();
            int i2 = i + 1;
            if (ai2.isDone()) {
                zzw(i, ai2);
            } else {
                ai2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgbf
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzw(i, ai2);
                    }
                }, zzgbv.INSTANCE);
            }
            i = i2;
        }
    }

    public void zzy(int i) {
        this.zzb = null;
    }
}
