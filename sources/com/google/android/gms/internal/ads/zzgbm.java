package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes3.dex */
abstract class zzgbm extends zzgax.zzi {
    private static final zzgbi zzbe;
    private static final zzgcq zzbf = new zzgcq(zzgbm.class);
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        zzgbi zzgbkVar;
        Throwable th;
        zzgbl zzgblVar = null;
        try {
            zzgbkVar = new zzgbj(AtomicReferenceFieldUpdater.newUpdater(zzgbm.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgbm.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            zzgbkVar = new zzgbk(zzgblVar);
            th = th2;
        }
        zzbe = zzgbkVar;
        if (th != null) {
            zzbf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    public zzgbm(int i) {
        this.remaining = i;
    }

    public final int zzA() {
        return zzbe.zza(this);
    }

    public final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(setNewSetFromMap);
        zzbe.zzb(this, null, setNewSetFromMap);
        Set<Throwable> set2 = this.seenExceptions;
        Objects.requireNonNull(set2);
        return set2;
    }

    public final void zzF() {
        this.seenExceptions = null;
    }

    public abstract void zze(Set set);
}
