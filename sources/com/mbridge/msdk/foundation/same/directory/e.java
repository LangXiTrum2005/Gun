package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.r0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class e {
    private static volatile e c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1185a;
    private final ArrayList<a> b = new ArrayList<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f1186a;
        public c b;

        public a(c cVar, File file) {
            this.b = cVar;
            this.f1186a = file;
        }
    }

    private e(b bVar) {
        this.f1185a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().b == null || b().b.isEmpty()) {
                return null;
            }
            for (a aVar : b().b) {
                if (aVar.b.equals(cVar)) {
                    return aVar.f1186a;
                }
            }
            return null;
        } catch (Throwable th) {
            o0.b("MBridgeDirManager", th.getMessage(), th);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        try {
            if (c == null && com.mbridge.msdk.foundation.controller.c.n().d() != null) {
                r0.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th) {
            throw th;
        }
        return c;
    }

    public static synchronized void a(b bVar) {
        if (c == null) {
            c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f1185a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        this.b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA == null) {
            return true;
        }
        Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
        while (it.hasNext()) {
            if (!a(it.next())) {
                return false;
            }
        }
        return true;
    }
}
