package com.mbridge.msdk.dycreator.subjectfactory;

import com.mbridge.msdk.dycreator.viewobserver.c;
import com.mbridge.msdk.dycreator.viewobserver.d;
import com.mbridge.msdk.dycreator.viewobserver.f;
import com.mbridge.msdk.dycreator.viewobserver.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f1088a;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.subjectfactory.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0158a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f1089a;

        static {
            int[] iArr = new int[b.values().length];
            f1089a = iArr;
            try {
                iArr[b.VIEW_OBSERVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1089a[b.CLICK_OBSERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1089a[b.EFFECT_OBSERVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1089a[b.REPORT_OBSERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        VIEW_OBSERVER,
        CLICK_OBSERVER,
        EFFECT_OBSERVER,
        REPORT_OBSERVER
    }

    private a() {
    }

    public static a a() {
        if (f1088a == null) {
            synchronized (a.class) {
                try {
                    if (f1088a == null) {
                        f1088a = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f1088a;
    }

    public <T extends com.mbridge.msdk.dycreator.viewobserver.a> T a(b bVar) {
        int i = C0158a.f1089a[bVar.ordinal()];
        if (i == 1) {
            return new d();
        }
        if (i == 2) {
            return new c();
        }
        if (i == 3) {
            return new f();
        }
        if (i != 4) {
            return null;
        }
        return new h();
    }
}
