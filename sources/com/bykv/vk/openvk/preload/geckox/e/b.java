package com.bykv.vk.openvk.preload.geckox.e;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b {
    private String b;
    private String d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f343a = new HashMap();
    private AtomicBoolean c = new AtomicBoolean(false);

    public b(Context context, String str, File file) {
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("access key empty");
        }
        this.b = str;
        if (file == null) {
            this.d = new File(context.getFilesDir(), DM.m(new StringBuilder("gecko_offline_res_x"), File.separator, str)).getAbsolutePath();
        } else {
            this.d = new File(file, str).getAbsolutePath();
        }
    }

    private a d(String str) {
        a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f343a) {
            try {
                aVar = this.f343a.get(strSubstring);
                if (aVar == null) {
                    aVar = new a(this.d, strSubstring);
                    this.f343a.put(strSubstring, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    public final String a() {
        return this.d;
    }

    public final int b(String str) throws Exception {
        if (this.c.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).c(str);
    }

    public final boolean c(String str) throws Exception {
        if (this.c.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).b(str);
    }

    public final InputStream a(String str) throws Exception {
        if (this.c.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).a(str);
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        synchronized (this.f343a) {
            try {
                Collection<a> collectionValues = this.f343a.values();
                if (collectionValues == null) {
                    return map;
                }
                for (a aVar : collectionValues) {
                    map.put(aVar.b(), aVar.a());
                }
                return map;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() throws Exception {
        if (this.c.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (this.f343a) {
            try {
                Iterator<a> it = this.f343a.values().iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
                this.f343a.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
