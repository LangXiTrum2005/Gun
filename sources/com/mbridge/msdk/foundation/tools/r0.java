package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static String f1292a = "";
    private static volatile boolean b = false;
    private static int c = -1;
    private static int d = -1;
    private static long e;

    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            r0.b();
        }
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            if (b) {
                return;
            }
            b = true;
            File externalFilesDir = context.getExternalFilesDir(null);
            if (externalFilesDir != null) {
                f1292a = externalFilesDir.getAbsolutePath();
            }
            try {
                b(context);
            } catch (Exception unused) {
                b(context);
            }
        } catch (Exception e2) {
            o0.b("SameSDCardTool", e2.getMessage());
        }
    }

    private static void b(Context context) {
        File externalFilesDir;
        if (TextUtils.isEmpty(f1292a) && (externalFilesDir = context.getExternalFilesDir(null)) != null) {
            f1292a = externalFilesDir.getAbsolutePath();
        }
        if (!TextUtils.isEmpty(f1292a)) {
            com.mbridge.msdk.foundation.same.directory.e.a(new com.mbridge.msdk.foundation.same.directory.d(f1292a));
            com.mbridge.msdk.foundation.same.directory.e.b().a();
        }
        b();
    }

    public static int c() {
        return d;
    }

    public static int a() {
        if (System.currentTimeMillis() - e > 1800000) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a());
        }
        return c;
    }

    public static void b() {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            long blockSize = statFs.getBlockSize();
            long availableBlocks = statFs.getAvailableBlocks();
            d = Long.valueOf(((((long) statFs.getBlockCount()) * blockSize) / 1000) / 1000).intValue();
            c = Long.valueOf(((availableBlocks * blockSize) / 1000) / 1000).intValue();
            e = System.currentTimeMillis();
        } catch (Exception e2) {
            o0.b("SameSDCardTool", e2.getMessage());
        }
    }
}
