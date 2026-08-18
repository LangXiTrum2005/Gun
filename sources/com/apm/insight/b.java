package com.apm.insight;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public final class b implements ICrashCallback, IOOMCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IOOMCallback f58a;
    private ICrashCallback b;
    private String c;

    public b(String str, ICrashCallback iCrashCallback) {
        this.c = str;
        this.b = iCrashCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j, JSONArray jSONArray) {
        if (this.f58a == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), "header", "aid"), this.c)) {
                this.f58a.onCrash(crashType, th, thread, j);
            }
        }
    }

    @Override // com.apm.insight.ICrashCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread) {
    }

    @Override // com.apm.insight.IOOMCallback
    public final void onCrash(@NonNull CrashType crashType, @Nullable Throwable th, @Nullable Thread thread, long j) {
    }

    public b(String str, IOOMCallback iOOMCallback) {
        this.c = str;
        this.f58a = iOOMCallback;
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable Thread thread, JSONArray jSONArray) {
        if (this.b == null || jSONArray == null) {
            return;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            if (TextUtils.equals(a.a(jSONArray.optJSONObject(i), "header", "aid"), this.c)) {
                this.b.onCrash(crashType, str, thread);
            }
        }
    }

    public final void a(@NonNull CrashType crashType, @Nullable String str, @Nullable String str2, String str3) {
        d dVarA;
        if (this.b == null || (dVarA = d.a(this.c)) == null || !dVarA.a(str3, str2)) {
            return;
        }
        this.b.onCrash(crashType, str, null);
    }
}
