package com.mbridge.msdk.click.retry;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, b> f976a;
    private final int b;
    private int c;

    public c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.b = i;
        this.f976a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, b bVar) {
        return 1;
    }

    public final b a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVar = this.f976a.get(str);
                if (bVar != null) {
                    return bVar;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }

    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                b bVarRemove = this.f976a.remove(str);
                if (bVarRemove != null) {
                    this.c -= b(str, bVarRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean a(String str, b bVar) {
        if (str != null && bVar != null) {
            synchronized (this) {
                try {
                    this.c += b(str, bVar);
                    b bVarPut = this.f976a.put(str, bVar);
                    if (bVarPut != null) {
                        this.c -= b(str, bVarPut);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private void a(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.c < 0 || (this.f976a.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c > i && !this.f976a.isEmpty()) {
                        Map.Entry<String, b> next = this.f976a.entrySet().iterator().next();
                        if (next == null) {
                            return;
                        }
                        String key = next.getKey();
                        try {
                            int iB = b(key, next.getValue());
                            this.f976a.remove(key);
                            this.c -= iB;
                        } catch (Throwable unused) {
                        }
                    }
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f976a.keySet());
        }
        return hashSet;
    }
}
