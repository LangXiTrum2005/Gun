package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.ArrayMap;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2871Wx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2784To;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2897Xx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2923Yx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3568gy;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3692iN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3877kY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4165nl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4391qK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4439qr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4478rK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4710tz;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4830vK;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ExecutorServiceC3480fy;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2459Ha;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.NN;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Tg0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ThreadFactoryC3304dy;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ThreadFactoryC4448r0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VY;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XO;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ComponentCallbacks2 {
    public static volatile a h;
    public static volatile boolean i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2459Ha f214a;
    public final C4830vK b;
    public final C2923Yx c;
    public final C4391qK d;
    public final com.bumptech.glide.manager.a e;
    public final C4710tz f;
    public final ArrayList g = new ArrayList();

    public a(Context context, C4439qr c4439qr, C4830vK c4830vK, InterfaceC2459Ha interfaceC2459Ha, C4391qK c4391qK, com.bumptech.glide.manager.a aVar, C4710tz c4710tz, int i2, NN nn, ArrayMap arrayMap, List list, ArrayList arrayList, AbstractC2995aW abstractC2995aW, C3568gy c3568gy) {
        this.f214a = interfaceC2459Ha;
        this.d = c4391qK;
        this.b = c4830vK;
        this.e = aVar;
        this.f = c4710tz;
        this.c = new C2923Yx(context, c4391qK, new C3877kY(this, arrayList, abstractC2995aW), new C4710tz(20), nn, arrayMap, list, c4439qr, c3568gy, i2);
    }

    public static a a(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (h == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (a.class) {
                if (h == null) {
                    if (i) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    i = true;
                    try {
                        b(context, generatedAppGlideModule);
                        i = false;
                    } catch (Throwable th) {
                        i = false;
                        throw th;
                    }
                }
            }
        }
        return h;
    }

    public static void b(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        C2897Xx c2897Xx = new C2897Xx();
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        C2784To.d(str);
                        throw null;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC3950lJ.z(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                AbstractC3950lJ.z(it2.next());
                throw null;
            }
        }
        c2897Xx.n = null;
        Iterator it3 = arrayList.iterator();
        if (it3.hasNext()) {
            AbstractC3950lJ.z(it3.next());
            throw null;
        }
        if (c2897Xx.g == null) {
            ThreadFactoryC4448r0 threadFactoryC4448r0 = new ThreadFactoryC4448r0();
            if (ExecutorServiceC3480fy.c == 0) {
                ExecutorServiceC3480fy.c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = ExecutorServiceC3480fy.c;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            c2897Xx.g = new ExecutorServiceC3480fy(new ThreadPoolExecutor(i2, i2, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC3304dy(threadFactoryC4448r0, "source", false)));
        }
        if (c2897Xx.h == null) {
            int i3 = ExecutorServiceC3480fy.c;
            ThreadFactoryC4448r0 threadFactoryC4448r1 = new ThreadFactoryC4448r0();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            c2897Xx.h = new ExecutorServiceC3480fy(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC3304dy(threadFactoryC4448r1, "disk-cache", true)));
        }
        if (c2897Xx.o == null) {
            if (ExecutorServiceC3480fy.c == 0) {
                ExecutorServiceC3480fy.c = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i4 = ExecutorServiceC3480fy.c >= 4 ? 2 : 1;
            ThreadFactoryC4448r0 threadFactoryC4448r2 = new ThreadFactoryC4448r0();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            c2897Xx.o = new ExecutorServiceC3480fy(new ThreadPoolExecutor(i4, i4, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new ThreadFactoryC3304dy(threadFactoryC4448r2, "animation", true)));
        }
        if (c2897Xx.j == null) {
            c2897Xx.j = new XO(new WO(applicationContext));
        }
        if (c2897Xx.k == null) {
            c2897Xx.k = new C4710tz(18);
        }
        if (c2897Xx.d == null) {
            int i5 = c2897Xx.j.f3966a;
            if (i5 > 0) {
                c2897Xx.d = new C4478rK(i5);
            } else {
                c2897Xx.d = new G7();
            }
        }
        if (c2897Xx.e == null) {
            c2897Xx.e = new C4391qK(c2897Xx.j.d);
        }
        if (c2897Xx.f == null) {
            c2897Xx.f = new C4830vK(c2897Xx.j.b);
        }
        if (c2897Xx.i == null) {
            c2897Xx.i = new KD(new C3692iN(10, applicationContext, "image_manager_disk_cache"));
        }
        if (c2897Xx.c == null) {
            c2897Xx.c = new C4439qr(c2897Xx.f, c2897Xx.i, c2897Xx.h, c2897Xx.g, new ExecutorServiceC3480fy(new ThreadPoolExecutor(0, Integer.MAX_VALUE, ExecutorServiceC3480fy.b, TimeUnit.MILLISECONDS, new SynchronousQueue(), new ThreadFactoryC3304dy(new ThreadFactoryC4448r0(), "source-unlimited", false))), c2897Xx.o);
        }
        List list = c2897Xx.p;
        if (list == null) {
            c2897Xx.p = Collections.emptyList();
        } else {
            c2897Xx.p = Collections.unmodifiableList(list);
        }
        C4165nl c4165nl = c2897Xx.b;
        c4165nl.getClass();
        a aVar = new a(applicationContext, c2897Xx.c, c2897Xx.f, c2897Xx.d, c2897Xx.e, new com.bumptech.glide.manager.a(c2897Xx.n), c2897Xx.k, c2897Xx.l, c2897Xx.m, c2897Xx.f4000a, c2897Xx.p, arrayList, generatedAppGlideModule, new C3568gy(c4165nl));
        applicationContext.registerComponentCallbacks(aVar);
        h = aVar;
    }

    public static VY d(Context context) {
        AbstractC2871Wx.V(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return a(context).e.b(context);
    }

    public final void c(VY vy) {
        synchronized (this.g) {
            try {
                if (!this.g.contains(vy)) {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
                this.g.remove(vy);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        Tg0.a();
        this.b.e(0L);
        this.f214a.k();
        this.d.a();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        Tg0.a();
        synchronized (this.g) {
            try {
                Iterator it = this.g.iterator();
                while (it.hasNext()) {
                    ((VY) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.b.f(i2);
        this.f214a.i(i2);
        this.d.i(i2);
    }
}
