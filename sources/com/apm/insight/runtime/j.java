package com.apm.insight.runtime;

import android.os.SystemClock;
import android.util.Printer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f181a;
    private long b = -1;
    private final List<Printer> c = new ArrayList();
    private final List<Printer> d = new ArrayList();
    private boolean e = false;

    static {
        new Printer() { // from class: com.apm.insight.runtime.j.1
            @Override // android.util.Printer
            public final void println(String str) {
                if (str == null) {
                    return;
                }
                if (str.charAt(0) == '>') {
                    j.a().a(str);
                } else if (str.charAt(0) == '<') {
                    j.a().b(str);
                }
                j.c();
            }
        };
    }

    private j() {
    }

    public static j a() {
        if (f181a == null) {
            synchronized (j.class) {
                try {
                    if (f181a == null) {
                        f181a = new j();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f181a;
    }

    public static /* synthetic */ Printer c() {
        return null;
    }

    public final boolean b() {
        return this.b != -1 && SystemClock.uptimeMillis() - this.b > 5000;
    }

    public final void b(String str) {
        this.b = SystemClock.uptimeMillis();
        try {
            a(this.d, str);
        } catch (Exception e) {
            com.apm.insight.a.b((Throwable) e);
        }
    }

    public final void a(String str) {
        this.b = -1L;
        try {
            a(this.c, str);
        } catch (Exception e) {
            com.apm.insight.a.a((Throwable) e);
        }
    }

    private static void a(List<? extends Printer> list, String str) {
        if (list == null || list.isEmpty()) {
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Printer printer = list.get(i);
                if (printer == null) {
                    return;
                }
                printer.println(str);
            }
        } catch (Throwable th) {
            com.apm.insight.a.a(th);
        }
    }
}
