package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f1290a;
    private final Object b;
    private final Object c;
    private final Object d;
    public volatile JSONObject e;
    private String f;
    private volatile ConcurrentHashMap<String, Boolean> g;
    private volatile ConcurrentHashMap<String, Integer> h;
    private volatile ConcurrentHashMap<String, String> i;
    private volatile com.mbridge.msdk.setting.g j;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final q0 f1291a = new q0();
    }

    public static q0 a() {
        return b.f1291a;
    }

    private static Integer b(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private static String c(String str, ConcurrentHashMap<String, String> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private ConcurrentHashMap<String, String> d() {
        synchronized (this.b) {
            try {
                if (this.i == null) {
                    this.i = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.i;
    }

    private boolean e() {
        return this.j.D() == 1;
    }

    private q0() {
        this.f1290a = new Object();
        this.b = new Object();
        this.c = new Object();
        this.d = new Object();
    }

    private int a(String str, String str2, int i) {
        if (a(true)) {
            return i;
        }
        try {
            String strOptString = this.e.optString(str, "");
            if (TextUtils.isEmpty(strOptString)) {
                return i;
            }
            String strA = i0.a(strOptString);
            return TextUtils.isEmpty(strA) ? i : new JSONObject(strA).optInt(str2, i);
        } catch (Exception unused) {
            return i;
        }
    }

    private ConcurrentHashMap<String, Integer> c() {
        synchronized (this.f1290a) {
            try {
                if (this.h == null) {
                    this.h = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.h;
    }

    public int b(String str, int i) {
        Integer numValueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
            Integer numB = b(str, concurrentHashMapC);
            if (numB != null) {
                return numB.intValue();
            }
            try {
                numValueOf = Integer.valueOf(a(str, i));
            } catch (Exception unused) {
                numValueOf = Integer.valueOf(i);
            }
            concurrentHashMapC.put(str, numValueOf);
            return numValueOf.intValue();
        } catch (Exception unused2) {
            return i;
        }
    }

    private int a(String str, int i) {
        if (a(true)) {
            return i;
        }
        try {
            return this.e.optInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    public String b(String str, String str2, boolean z) {
        String strA;
        String strC;
        try {
            if (TextUtils.isEmpty(str)) {
                return str2;
            }
            ConcurrentHashMap<String, String> concurrentHashMapD = d();
            if (z && (strC = c(str, concurrentHashMapD)) != null) {
                return strC;
            }
            try {
                strA = a(str, str2, z);
            } catch (Exception unused) {
                strA = str2;
            }
            concurrentHashMapD.put(str, strA);
            return strA;
        } catch (Exception unused2) {
            return str2;
        }
    }

    private String a(String str, String str2, boolean z) {
        if (a(z)) {
            return str2;
        }
        try {
            return this.e.optString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public boolean a(String str, boolean z) {
        try {
            return b(str, z, true);
        } catch (Exception unused) {
            return z;
        }
    }

    private static Boolean a(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private boolean a(String str, boolean z, boolean z2) {
        if (a(z2)) {
            return z;
        }
        try {
            return this.e.optInt(str, z ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z;
        }
    }

    public int b(String str, String str2, int i) {
        Integer numValueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> concurrentHashMapC = c();
                Integer numB = b(str3, concurrentHashMapC);
                if (numB != null) {
                    return numB.intValue();
                }
                try {
                    numValueOf = Integer.valueOf(a(str, str2, i));
                } catch (Exception unused) {
                    numValueOf = Integer.valueOf(i);
                }
                concurrentHashMapC.put(str3, numValueOf);
                return numValueOf.intValue();
            }
            return b(str2, i);
        } catch (Exception unused2) {
            return i;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a A[Catch: all -> 0x0010, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:21:0x0046, B:23:0x004a, B:24:0x0052, B:12:0x0012, B:14:0x001a, B:16:0x002a, B:17:0x0036, B:20:0x0044), top: B:35:0x0003, inners: #1 }] */
    private boolean a(boolean z) {
        synchronized (this.d) {
            if (this.j == null || e() || !z) {
                try {
                    if (TextUtils.isEmpty(this.f)) {
                        String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                        this.f = strB;
                        if (TextUtils.isEmpty(strB)) {
                            this.f = com.mbridge.msdk.foundation.buffer.sharedperference.a.b().a("app_id");
                        }
                    }
                    this.j = com.mbridge.msdk.setting.h.b().b(this.f);
                } catch (Exception unused) {
                    this.j = null;
                }
                if (this.j != null) {
                    this.e = this.j.j0();
                }
            } else if (this.j != null) {
                this.e = this.j.j0();
            }
            throw th;
        }
        return this.j == null || this.e == null;
    }

    public boolean b(String str, boolean z, boolean z2) {
        Boolean boolValueOf;
        Boolean boolA;
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            ConcurrentHashMap<String, Boolean> concurrentHashMapB = b();
            if (z2 && (boolA = a(str, concurrentHashMapB)) != null) {
                return boolA.booleanValue();
            }
            try {
                boolValueOf = Boolean.valueOf(a(str, z, z2));
            } catch (Exception unused) {
                boolValueOf = Boolean.valueOf(z);
            }
            concurrentHashMapB.put(str, boolValueOf);
            return boolValueOf.booleanValue();
        } catch (Exception unused2) {
            return z;
        }
    }

    private ConcurrentHashMap<String, Boolean> b() {
        synchronized (this.c) {
            try {
                if (this.g == null) {
                    this.g = new ConcurrentHashMap<>();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.g;
    }
}
