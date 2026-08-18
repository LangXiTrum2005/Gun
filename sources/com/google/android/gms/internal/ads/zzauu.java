package com.google.android.gms.internal.ads;

import android.os.ConditionVariable;
import androidx.annotation.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes3.dex */
public final class zzauu {

    @VisibleForTesting
    protected volatile Boolean zzb;
    private final zzawd zze;
    private static final ConditionVariable zzc = new ConditionVariable();

    @VisibleForTesting
    protected static volatile zzfpk zza = null;
    private static volatile Random zzd = null;

    public zzauu(zzawd zzawdVar) {
        this.zze = zzawdVar;
        zzawdVar.zzk().execute(new zzaut(this));
    }

    public static final int zzd() {
        try {
            return ThreadLocalRandom.current().nextInt();
        } catch (RuntimeException unused) {
            if (zzd == null) {
                synchronized (zzauu.class) {
                    try {
                        if (zzd == null) {
                            zzd = new Random();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return zzd.nextInt();
        }
    }

    public final void zzc(int i, int i2, long j, String str, Exception exc) {
        try {
            zzc.block();
            if (!this.zzb.booleanValue() || zza == null) {
                return;
            }
            zzari zzariVarZza = zzarm.zza();
            zzariVarZza.zza(this.zze.zza.getPackageName());
            zzariVarZza.zze(j);
            if (str != null) {
                zzariVarZza.zzb(str);
            }
            if (exc != null) {
                StringWriter stringWriter = new StringWriter();
                exc.printStackTrace(new PrintWriter(stringWriter));
                zzariVarZza.zzf(stringWriter.toString());
                zzariVarZza.zzd(exc.getClass().getName());
            }
            zzfpi zzfpiVarZza = zza.zza(((zzarm) zzariVarZza.zzbr()).zzaV());
            zzfpiVarZza.zza(i);
            if (i2 != -1) {
                zzfpiVarZza.zzb(i2);
            }
            zzfpiVarZza.zzc();
        } catch (Exception unused) {
        }
    }
}
