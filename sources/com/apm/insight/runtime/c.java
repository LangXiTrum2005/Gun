package com.apm.insight.runtime;

import androidx.annotation.NonNull;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.IOOMCallback;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<ICrashCallback> f173a = new CopyOnWriteArrayList();
    private final List<ICrashCallback> b = new CopyOnWriteArrayList();
    private final List<ICrashCallback> c = new CopyOnWriteArrayList();
    private final List<ICrashCallback> d = new CopyOnWriteArrayList();
    private final List<IOOMCallback> e = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.apm.insight.runtime.c$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f174a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f174a = iArr;
            try {
                iArr[CrashType.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f174a[CrashType.ANR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f174a[CrashType.JAVA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f174a[CrashType.LAUNCH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f174a[CrashType.NATIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public final void a(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = AnonymousClass1.f174a[crashType.ordinal()];
        if (i == 1) {
            this.f173a.add(iCrashCallback);
            this.b.add(iCrashCallback);
            this.c.add(iCrashCallback);
            this.d.add(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.d.add(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.b.add(iCrashCallback);
        } else if (i == 4) {
            this.f173a.add(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.c.add(iCrashCallback);
        }
    }

    public final void b(ICrashCallback iCrashCallback, CrashType crashType) {
        int i = AnonymousClass1.f174a[crashType.ordinal()];
        if (i == 1) {
            this.f173a.remove(iCrashCallback);
            this.b.remove(iCrashCallback);
            this.c.remove(iCrashCallback);
            this.d.remove(iCrashCallback);
            return;
        }
        if (i == 2) {
            this.d.remove(iCrashCallback);
            return;
        }
        if (i == 3) {
            this.b.remove(iCrashCallback);
        } else if (i == 4) {
            this.f173a.remove(iCrashCallback);
        } else {
            if (i != 5) {
                return;
            }
            this.c.remove(iCrashCallback);
        }
    }

    @NonNull
    public final List<ICrashCallback> c() {
        return this.b;
    }

    @NonNull
    public final List<ICrashCallback> d() {
        return this.c;
    }

    @NonNull
    public final List<ICrashCallback> e() {
        return this.d;
    }

    public final void a(IOOMCallback iOOMCallback) {
        this.e.add(iOOMCallback);
    }

    public final void b(IOOMCallback iOOMCallback) {
        this.e.remove(iOOMCallback);
    }

    @NonNull
    public final List<IOOMCallback> a() {
        return this.e;
    }

    @NonNull
    public final List<ICrashCallback> b() {
        return this.f173a;
    }
}
