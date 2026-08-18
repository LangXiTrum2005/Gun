package com.apm.insight.runtime;

import com.apm.insight.nativecrash.NativeImpl;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class f {
    static {
        new Comparator<Object>() { // from class: com.apm.insight.runtime.f.1
            @Override // java.util.Comparator
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return 0;
            }
        };
    }

    public static long a(int i) {
        return o.a.a() * NativeImpl.c(i);
    }
}
