package com.apm.insight.l;

import android.annotation.TargetApi;
import android.app.ActivityManager;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f146a = new b(0);

    public static class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public long a(ActivityManager.MemoryInfo memoryInfo) {
            return 0L;
        }
    }

    @TargetApi(16)
    public static class b extends a {
        private b() {
            super((byte) 0);
        }

        @Override // com.apm.insight.l.i.a
        public final long a(ActivityManager.MemoryInfo memoryInfo) {
            return memoryInfo.totalMem;
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    public static long a(ActivityManager.MemoryInfo memoryInfo) {
        return f146a.a(memoryInfo);
    }
}
