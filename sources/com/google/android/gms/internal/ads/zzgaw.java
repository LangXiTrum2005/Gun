package com.google.android.gms.internal.ads;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.concurrent.ExecutionException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgaw extends zzgbx implements Runnable {

    @CheckForNull
    AI zza;

    @CheckForNull
    Class zzb;

    @CheckForNull
    Object zzc;

    public zzgaw(AI ai, Class cls, Object obj) {
        ai.getClass();
        this.zza = ai;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        Object objZzp;
        AI ai = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((ai == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = ai instanceof zzgdl ? ((zzgdl) ai).zzl() : null;
            objZzp = th == null ? zzgch.zzp(ai) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException(AbstractC5044xl.n("Future type ", String.valueOf(ai.getClass()), " threw ", String.valueOf(e.getClass()), " without a cause"));
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            zzc(objZzp);
            return;
        }
        if (!cls.isInstance(th)) {
            zzs(ai);
            return;
        }
        try {
            Object objZze = zze(obj, th);
            this.zzb = null;
            this.zzc = null;
            zzf(objZze);
        } catch (Throwable th2) {
            try {
                zzgda.zza(th2);
                zzd(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @CheckForNull
    public final String zza() {
        AI ai = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        String strZza = super.zza();
        String strB = ai != null ? DM.B("inputFuture=[", ai.toString(), "], ") : "";
        if (cls == null || obj == null) {
            if (strZza != null) {
                return strB.concat(strZza);
            }
            return null;
        }
        return strB + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + "]";
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    public abstract Object zze(Object obj, Throwable th) throws Exception;

    public abstract void zzf(Object obj);
}
