package com.google.android.gms.internal.ads;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzgax<V> extends zzgdl implements AI {
    private static final Object zzbd;
    private static final zza zzbg;
    static final boolean zzd;
    static final zzgcq zze;

    @CheckForNull
    private volatile zzd listeners;

    @CheckForNull
    private volatile Object value;

    @CheckForNull
    private volatile zzk waiters;

    abstract class zza {
        public /* synthetic */ zza(zzgba zzgbaVar) {
        }

        public abstract zzd zza(zzgax zzgaxVar, zzd zzdVar);

        public abstract zzk zzb(zzgax zzgaxVar, zzk zzkVar);

        public abstract void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2);

        public abstract void zzd(zzk zzkVar, Thread thread);

        public abstract boolean zze(zzgax zzgaxVar, @CheckForNull zzd zzdVar, zzd zzdVar2);

        public abstract boolean zzf(zzgax zzgaxVar, @CheckForNull Object obj, Object obj2);

        public abstract boolean zzg(zzgax zzgaxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2);
    }

    final class zzb {

        @CheckForNull
        static final zzb zza;

        @CheckForNull
        static final zzb zzb;
        final boolean zzc;

        @CheckForNull
        final Throwable zzd;

        static {
            if (zzgax.zzd) {
                zzb = null;
                zza = null;
            } else {
                zzb = new zzb(false, null);
                zza = new zzb(true, null);
            }
        }

        public zzb(boolean z, @CheckForNull Throwable th) {
            this.zzc = z;
            this.zzd = th;
        }
    }

    final class zzc {
        static final zzc zza = new zzc(new Throwable("Failure occurred while trying to finish a future.") { // from class: com.google.android.gms.internal.ads.zzgax.zzc.1
            {
                super("Failure occurred while trying to finish a future.");
            }

            @Override // java.lang.Throwable
            public final synchronized Throwable fillInStackTrace() {
                return this;
            }
        });
        final Throwable zzb;

        public zzc(Throwable th) {
            th.getClass();
            this.zzb = th;
        }
    }

    final class zzd {
        static final zzd zza = new zzd();

        @CheckForNull
        zzd next;

        @CheckForNull
        final Runnable zzb;

        @CheckForNull
        final Executor zzc;

        public zzd() {
            this.zzb = null;
            this.zzc = null;
        }

        public zzd(Runnable runnable, Executor executor) {
            this.zzb = runnable;
            this.zzc = executor;
        }
    }

    final class zze extends zza {
        final AtomicReferenceFieldUpdater<zzk, Thread> zza;
        final AtomicReferenceFieldUpdater<zzk, zzk> zzb;
        final AtomicReferenceFieldUpdater<? super zzgax<?>, zzk> zzc;
        final AtomicReferenceFieldUpdater<? super zzgax<?>, zzd> zzd;
        final AtomicReferenceFieldUpdater<? super zzgax<?>, Object> zze;

        public zze(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super(null);
            this.zza = atomicReferenceFieldUpdater;
            this.zzb = atomicReferenceFieldUpdater2;
            this.zzc = atomicReferenceFieldUpdater3;
            this.zzd = atomicReferenceFieldUpdater4;
            this.zze = atomicReferenceFieldUpdater5;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final zzd zza(zzgax zzgaxVar, zzd zzdVar) {
            return this.zzd.getAndSet(zzgaxVar, zzdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final zzk zzb(zzgax zzgaxVar, zzk zzkVar) {
            return this.zzc.getAndSet(zzgaxVar, zzkVar);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            this.zzb.lazySet(zzkVar, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            this.zza.lazySet(zzkVar, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zze(zzgax zzgaxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzgay.zza(this.zzd, zzgaxVar, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zzf(zzgax zzgaxVar, @CheckForNull Object obj, Object obj2) {
            return zzgay.zza(this.zze, zzgaxVar, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zzg(zzgax zzgaxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzgay.zza(this.zzc, zzgaxVar, zzkVar, zzkVar2);
        }
    }

    final class zzf<V> implements Runnable {
        final zzgax<V> zza;
        final AI zzb;

        public zzf(zzgax zzgaxVar, AI ai) {
            this.zza = zzgaxVar;
            this.zzb = ai;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (((zzgax) this.zza).value != this) {
                return;
            }
            AI ai = this.zzb;
            if (zzgax.zzbg.zzf(this.zza, this, zzgax.zze(ai))) {
                zzgax.zzx(this.zza, false);
            }
        }
    }

    final class zzg extends zza {
        private zzg() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final zzd zza(zzgax zzgaxVar, zzd zzdVar) {
            zzd zzdVar2;
            synchronized (zzgaxVar) {
                try {
                    zzdVar2 = zzgaxVar.listeners;
                    if (zzdVar2 != zzdVar) {
                        zzgaxVar.listeners = zzdVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final zzk zzb(zzgax zzgaxVar, zzk zzkVar) {
            zzk zzkVar2;
            synchronized (zzgaxVar) {
                try {
                    zzkVar2 = zzgaxVar.waiters;
                    if (zzkVar2 != zzkVar) {
                        zzgaxVar.waiters = zzkVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zzkVar.next = zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zzkVar.thread = thread;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zze(zzgax zzgaxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            synchronized (zzgaxVar) {
                try {
                    if (zzgaxVar.listeners != zzdVar) {
                        return false;
                    }
                    zzgaxVar.listeners = zzdVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zzf(zzgax zzgaxVar, @CheckForNull Object obj, Object obj2) {
            synchronized (zzgaxVar) {
                try {
                    if (zzgaxVar.value != obj) {
                        return false;
                    }
                    zzgaxVar.value = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zzg(zzgax zzgaxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            synchronized (zzgaxVar) {
                try {
                    if (zzgaxVar.waiters != zzkVar) {
                        return false;
                    }
                    zzgaxVar.waiters = zzkVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public /* synthetic */ zzg(zzgba zzgbaVar) {
            super(null);
        }
    }

    interface zzh<V> extends AI {
        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI
        /* synthetic */ void addListener(Runnable runnable, Executor executor);
    }

    abstract class zzi<V> extends zzgax<V> implements zzh<V> {
    }

    final class zzj extends zza {
        static final Unsafe zza;
        static final long zzb;
        static final long zzc;
        static final long zzd;
        static final long zze;
        static final long zzf;

        static {
            Unsafe unsafe;
            try {
                try {
                    unsafe = Unsafe.getUnsafe();
                } catch (SecurityException unused) {
                    unsafe = (Unsafe) AccessController.doPrivileged(new PrivilegedExceptionAction<Unsafe>() { // from class: com.google.android.gms.internal.ads.zzgax.zzj.1
                        @Override // java.security.PrivilegedExceptionAction
                        public final /* bridge */ /* synthetic */ Unsafe run() throws Exception {
                            for (Field field : Unsafe.class.getDeclaredFields()) {
                                field.setAccessible(true);
                                Object obj = field.get(null);
                                if (Unsafe.class.isInstance(obj)) {
                                    return (Unsafe) Unsafe.class.cast(obj);
                                }
                            }
                            throw new NoSuchFieldError("the Unsafe");
                        }
                    });
                }
                try {
                    zzc = unsafe.objectFieldOffset(zzgax.class.getDeclaredField("waiters"));
                    zzb = unsafe.objectFieldOffset(zzgax.class.getDeclaredField("listeners"));
                    zzd = unsafe.objectFieldOffset(zzgax.class.getDeclaredField(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                    zze = unsafe.objectFieldOffset(zzk.class.getDeclaredField("thread"));
                    zzf = unsafe.objectFieldOffset(zzk.class.getDeclaredField("next"));
                    zza = unsafe;
                } catch (NoSuchFieldException e) {
                    throw new RuntimeException(e);
                }
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }

        private zzj() {
            throw null;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final zzd zza(zzgax zzgaxVar, zzd zzdVar) {
            zzd zzdVar2;
            do {
                zzdVar2 = zzgaxVar.listeners;
                if (zzdVar == zzdVar2) {
                    break;
                }
            } while (!zze(zzgaxVar, zzdVar2, zzdVar));
            return zzdVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final zzk zzb(zzgax zzgaxVar, zzk zzkVar) {
            zzk zzkVar2;
            do {
                zzkVar2 = zzgaxVar.waiters;
                if (zzkVar == zzkVar2) {
                    break;
                }
            } while (!zzg(zzgaxVar, zzkVar2, zzkVar));
            return zzkVar2;
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final void zzc(zzk zzkVar, @CheckForNull zzk zzkVar2) {
            zza.putObject(zzkVar, zzf, zzkVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final void zzd(zzk zzkVar, Thread thread) {
            zza.putObject(zzkVar, zze, thread);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zze(zzgax zzgaxVar, @CheckForNull zzd zzdVar, zzd zzdVar2) {
            return zzgaz.zza(zza, zzgaxVar, zzb, zzdVar, zzdVar2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zzf(zzgax zzgaxVar, @CheckForNull Object obj, Object obj2) {
            return zzgaz.zza(zza, zzgaxVar, zzd, obj, obj2);
        }

        @Override // com.google.android.gms.internal.ads.zzgax.zza
        public final boolean zzg(zzgax zzgaxVar, @CheckForNull zzk zzkVar, @CheckForNull zzk zzkVar2) {
            return zzgaz.zza(zza, zzgaxVar, zzc, zzkVar, zzkVar2);
        }

        public /* synthetic */ zzj(zzgba zzgbaVar) {
            super(null);
        }
    }

    final class zzk {
        static final zzk zza = new zzk(false);

        @CheckForNull
        volatile zzk next;

        @CheckForNull
        volatile Thread thread;

        public zzk() {
            zzgax.zzbg.zzd(this, Thread.currentThread());
        }

        public zzk(boolean z) {
        }
    }

    static {
        boolean z;
        Throwable th;
        Throwable th2;
        zza zzgVar;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        zzd = z;
        zze = new zzgcq(zzgax.class);
        zzgba zzgbaVar = null;
        try {
            zzgVar = new zzj(zzgbaVar);
            th2 = null;
            th = null;
        } catch (Error | Exception e) {
            try {
                th = null;
                th2 = e;
                zzgVar = new zze(AtomicReferenceFieldUpdater.newUpdater(zzk.class, Thread.class, "thread"), AtomicReferenceFieldUpdater.newUpdater(zzk.class, zzk.class, "next"), AtomicReferenceFieldUpdater.newUpdater(zzgax.class, zzk.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(zzgax.class, zzd.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(zzgax.class, Object.class, AppMeasurementSdk.ConditionalUserProperty.VALUE));
            } catch (Error | Exception e2) {
                th = e2;
                th2 = e;
                zzgVar = new zzg(zzgbaVar);
            }
        }
        zzbg = zzgVar;
        if (th != null) {
            zzgcq zzgcqVar = zze;
            Logger loggerZza = zzgcqVar.zza();
            Level level = Level.SEVERE;
            loggerZza.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            zzgcqVar.zza().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        zzbd = new Object();
    }

    private static final Object zzA(Object obj) throws ExecutionException {
        if (obj instanceof zzb) {
            Throwable th = ((zzb) obj).zzd;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof zzc) {
            throw new ExecutionException(((zzc) obj).zzb);
        }
        if (obj == zzbd) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object zze(AI ai) {
        Throwable thZzl;
        if (ai instanceof zzh) {
            Object zzbVar = ((zzgax) ai).value;
            if (zzbVar instanceof zzb) {
                zzb zzbVar2 = (zzb) zzbVar;
                if (zzbVar2.zzc) {
                    Throwable th = zzbVar2.zzd;
                    zzbVar = th != null ? new zzb(false, th) : zzb.zzb;
                }
            }
            Objects.requireNonNull(zzbVar);
            return zzbVar;
        }
        if ((ai instanceof zzgdl) && (thZzl = ((zzgdl) ai).zzl()) != null) {
            return new zzc(thZzl);
        }
        boolean zIsCancelled = ai.isCancelled();
        if ((!zzd) && zIsCancelled) {
            zzb zzbVar3 = zzb.zzb;
            Objects.requireNonNull(zzbVar3);
            return zzbVar3;
        }
        try {
            Object objZzf = zzf(ai);
            if (zIsCancelled) {
                return new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ai))));
            }
            return objZzf == null ? zzbd : objZzf;
        } catch (Error e) {
            e = e;
            return new zzc(e);
        } catch (CancellationException e2) {
            return !zIsCancelled ? new zzc(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(ai)), e2)) : new zzb(false, e2);
        } catch (ExecutionException e3) {
            return zIsCancelled ? new zzb(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(ai)), e3)) : new zzc(e3.getCause());
        } catch (Exception e4) {
            e = e4;
            return new zzc(e);
        }
    }

    private static Object zzf(Future future) throws ExecutionException {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void zzu(StringBuilder sb) {
        try {
            Object objZzf = zzf(this);
            sb.append("SUCCESS, result=[");
            if (objZzf == null) {
                sb.append("null");
            } else if (objZzf == this) {
                sb.append("this future");
            } else {
                sb.append(objZzf.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(objZzf)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    private final void zzv(StringBuilder sb) {
        String strConcat;
        int length = sb.length();
        sb.append("PENDING");
        Object obj = this.value;
        if (obj instanceof zzf) {
            sb.append(", setFuture=[");
            zzw(sb, ((zzf) obj).zzb);
            sb.append("]");
        } else {
            try {
                strConcat = zzfve.zza(zza());
            } catch (Exception | StackOverflowError e) {
                strConcat = "Exception thrown from implementation: ".concat(String.valueOf(e.getClass()));
            }
            if (strConcat != null) {
                sb.append(", info=[");
                sb.append(strConcat);
                sb.append("]");
            }
        }
        if (isDone()) {
            sb.delete(length, sb.length());
            zzu(sb);
        }
    }

    private final void zzw(StringBuilder sb, @CheckForNull Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e) {
            e = e;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e2) {
            e = e2;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzx(zzgax zzgaxVar, boolean z) {
        zzd zzdVar = null;
        while (true) {
            for (zzk zzkVarZzb = zzbg.zzb(zzgaxVar, zzk.zza); zzkVarZzb != null; zzkVarZzb = zzkVarZzb.next) {
                Thread thread = zzkVarZzb.thread;
                if (thread != null) {
                    zzkVarZzb.thread = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                zzgaxVar.zzq();
            }
            zzgaxVar.zzb();
            zzd zzdVar2 = zzdVar;
            zzd zzdVarZza = zzbg.zza(zzgaxVar, zzd.zza);
            zzd zzdVar3 = zzdVar2;
            while (zzdVarZza != null) {
                zzd zzdVar4 = zzdVarZza.next;
                zzdVarZza.next = zzdVar3;
                zzdVar3 = zzdVarZza;
                zzdVarZza = zzdVar4;
            }
            while (zzdVar3 != null) {
                zzdVar = zzdVar3.next;
                Runnable runnable = zzdVar3.zzb;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof zzf) {
                    zzf zzfVar = (zzf) runnable2;
                    zzgaxVar = zzfVar.zza;
                    if (zzgaxVar.value == zzfVar) {
                        if (zzbg.zzf(zzgaxVar, zzfVar, zze(zzfVar.zzb))) {
                            z = false;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = zzdVar3.zzc;
                    Objects.requireNonNull(executor);
                    zzy(runnable2, executor);
                }
                zzdVar3 = zzdVar;
            }
            return;
        }
    }

    private static void zzy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            zze.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", AbstractC5044xl.m("RuntimeException while executing runnable ", String.valueOf(runnable), " with executor ", String.valueOf(executor)), (Throwable) e);
        }
    }

    private final void zzz(zzk zzkVar) {
        zzkVar.thread = null;
        while (true) {
            zzk zzkVar2 = this.waiters;
            if (zzkVar2 != zzk.zza) {
                zzk zzkVar3 = null;
                while (zzkVar2 != null) {
                    zzk zzkVar4 = zzkVar2.next;
                    if (zzkVar2.thread != null) {
                        zzkVar3 = zzkVar2;
                    } else if (zzkVar3 != null) {
                        zzkVar3.next = zzkVar4;
                        if (zzkVar3.thread == null) {
                        }
                    } else if (!zzbg.zzg(this, zzkVar2, zzkVar4)) {
                    }
                    zzkVar2 = zzkVar4;
                }
                return;
            }
            return;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI
    public void addListener(Runnable runnable, Executor executor) {
        zzd zzdVar;
        zzfun.zzc(runnable, "Runnable was null.");
        zzfun.zzc(executor, "Executor was null.");
        if (!isDone() && (zzdVar = this.listeners) != zzd.zza) {
            zzd zzdVar2 = new zzd(runnable, executor);
            do {
                zzdVar2.next = zzdVar;
                if (zzbg.zze(this, zzdVar, zzdVar2)) {
                    return;
                } else {
                    zzdVar = this.listeners;
                }
            } while (zzdVar != zzd.zza);
        }
        zzy(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        zzb zzbVar;
        Object obj = this.value;
        if (!(obj instanceof zzf) && !(obj == null)) {
            return false;
        }
        if (zzd) {
            zzbVar = new zzb(z, new CancellationException("Future.cancel() was called."));
        } else {
            zzbVar = z ? zzb.zza : zzb.zzb;
            Objects.requireNonNull(zzbVar);
        }
        boolean z2 = false;
        zzgax<V> zzgaxVar = this;
        while (true) {
            if (zzbg.zzf(zzgaxVar, obj, zzbVar)) {
                zzx(zzgaxVar, z);
                if (obj instanceof zzf) {
                    AI ai = ((zzf) obj).zzb;
                    if (ai instanceof zzh) {
                        zzgaxVar = (zzgax) ai;
                        obj = zzgaxVar.value;
                        if ((obj == null) | (obj instanceof zzf)) {
                            z2 = true;
                        }
                    } else {
                        ai.cancel(z);
                    }
                }
                return true;
            }
            obj = zzgaxVar.value;
            if (!(obj instanceof zzf)) {
                return z2;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public Object get() throws ExecutionException, InterruptedException {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.value;
        if ((obj2 != null) && (!(obj2 instanceof zzf))) {
            return zzA(obj2);
        }
        zzk zzkVar = this.waiters;
        if (zzkVar != zzk.zza) {
            zzk zzkVar2 = new zzk();
            do {
                zza zzaVar = zzbg;
                zzaVar.zzc(zzkVar2, zzkVar);
                if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            zzz(zzkVar2);
                            throw new InterruptedException();
                        }
                        obj = this.value;
                    } while (!((obj != null) & (!(obj instanceof zzf))));
                    return zzA(obj);
                }
                zzkVar = this.waiters;
            } while (zzkVar != zzk.zza);
        }
        Object obj3 = this.value;
        Objects.requireNonNull(obj3);
        return zzA(obj3);
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.value instanceof zzb;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        Object obj = this.value;
        return (obj != null) & (!(obj instanceof zzf));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            zzu(sb);
        } else {
            zzv(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CheckForNull
    public String zza() {
        if (this instanceof ScheduledFuture) {
            return AbstractC5044xl.i("remaining delay=[", ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS), " ms]");
        }
        return null;
    }

    public void zzb() {
    }

    public boolean zzc(Object obj) {
        if (obj == null) {
            obj = zzbd;
        }
        if (!zzbg.zzf(this, null, obj)) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    public boolean zzd(Throwable th) {
        th.getClass();
        if (!zzbg.zzf(this, null, new zzc(th))) {
            return false;
        }
        zzx(this, false);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgdl
    @CheckForNull
    public final Throwable zzl() {
        if (!(this instanceof zzh)) {
            return null;
        }
        Object obj = this.value;
        if (obj instanceof zzc) {
            return ((zzc) obj).zzb;
        }
        return null;
    }

    public void zzq() {
    }

    public final void zzr(@CheckForNull Future future) {
        if ((future != null) && isCancelled()) {
            future.cancel(zzt());
        }
    }

    public final boolean zzs(AI ai) {
        zzc zzcVar;
        ai.getClass();
        Object obj = this.value;
        if (obj == null) {
            if (ai.isDone()) {
                if (!zzbg.zzf(this, null, zze(ai))) {
                    return false;
                }
                zzx(this, false);
                return true;
            }
            zzf zzfVar = new zzf(this, ai);
            if (zzbg.zzf(this, null, zzfVar)) {
                try {
                    ai.addListener(zzfVar, zzgbv.INSTANCE);
                } catch (Throwable th) {
                    try {
                        zzcVar = new zzc(th);
                    } catch (Error | Exception unused) {
                        zzcVar = zzc.zza;
                    }
                    zzbg.zzf(this, zzfVar, zzcVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof zzb) {
            ai.cancel(((zzb) obj).zzc);
        }
        return false;
    }

    public final boolean zzt() {
        Object obj = this.value;
        return (obj instanceof zzb) && ((zzb) obj).zzc;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.value;
            boolean z = true;
            if ((obj != null) & (!(obj instanceof zzf))) {
                return zzA(obj);
            }
            long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                zzk zzkVar = this.waiters;
                if (zzkVar != zzk.zza) {
                    zzk zzkVar2 = new zzk();
                    while (true) {
                        zza zzaVar = zzbg;
                        zzaVar.zzc(zzkVar2, zzkVar);
                        if (zzaVar.zzg(this, zzkVar, zzkVar2)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.value;
                                    if ((obj2 != null) & (!(obj2 instanceof zzf))) {
                                        return zzA(obj2);
                                    }
                                    nanos = jNanoTime - System.nanoTime();
                                } else {
                                    zzz(zzkVar2);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            zzz(zzkVar2);
                            break;
                        }
                        zzkVar = this.waiters;
                        if (zzkVar == zzk.zza) {
                        }
                    }
                }
                Object obj3 = this.value;
                Objects.requireNonNull(obj3);
                return zzA(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.value;
                if ((obj4 != null) & (!(obj4 instanceof zzf))) {
                    return zzA(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = jNanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String string = toString();
            String string2 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = string2.toLowerCase(locale);
            String strConcat = "Waited " + j + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String strConcat2 = strConcat.concat(" (plus ");
                long j2 = -nanos;
                long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
                long nanos2 = j2 - timeUnit.toNanos(jConvert);
                if (jConvert != 0 && nanos2 <= 1000) {
                    z = false;
                }
                if (jConvert > 0) {
                    String strConcat3 = strConcat2 + jConvert + " " + lowerCase;
                    if (z) {
                        strConcat3 = strConcat3.concat(",");
                    }
                    strConcat2 = strConcat3.concat(" ");
                }
                if (z) {
                    strConcat2 = strConcat2 + nanos2 + " nanoseconds ";
                }
                strConcat = strConcat2.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(strConcat.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(DM.i(strConcat, " for ", string));
        }
        throw new InterruptedException();
    }
}
