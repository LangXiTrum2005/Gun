package com.apm.insight.entity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.apm.insight.e;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;

/* JADX INFO: loaded from: classes.dex */
public final class c extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f91a;

    private c(String str) {
        this.f91a = str;
    }

    @NonNull
    public static c a(@NonNull StackTraceElement stackTraceElement, @NonNull String str, @Nullable String str2, @NonNull String str3, boolean z, String str4, String str5) {
        c cVar = new c(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        cVar.a("event_type", (Object) "exception");
        cVar.a("log_type", (Object) str5);
        cVar.a("timestamp", Long.valueOf(System.currentTimeMillis()));
        cVar.a("crash_time", Long.valueOf(System.currentTimeMillis()));
        cVar.a("class_ref", (Object) className);
        cVar.a("method", (Object) methodName);
        cVar.a("line_num", Integer.valueOf(lineNumber));
        cVar.a("stack", (Object) str);
        cVar.a("exception_type", (Object) 1);
        cVar.a("ensure_type", (Object) str4);
        cVar.a("is_core", Integer.valueOf(z ? 1 : 0));
        cVar.a(PglCryptUtils.KEY_MESSAGE, (Object) str2);
        cVar.a("process_name", (Object) com.apm.insight.l.a.d(e.g()));
        cVar.a("crash_thread_name", (Object) str3);
        d.b(cVar.c());
        return cVar;
    }
}
