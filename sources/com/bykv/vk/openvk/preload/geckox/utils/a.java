package com.bykv.vk.openvk.preload.geckox.utils;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f362a;

    public static String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            GeckoLogger.w("gecko-debug-tag", "getVersion:", e);
            return "null";
        }
    }

    public static String b(Context context) {
        try {
            PackageManager packageManager = context.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
            return applicationInfo == null ? "" : applicationInfo.loadLabel(packageManager).toString();
        } catch (Throwable th) {
            GeckoLogger.w("gecko-debug-tag", "getApplicationName:", th);
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    public static String c(Context context) {
        String str;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (!TextUtils.isEmpty(f362a)) {
            return f362a;
        }
        String strA = a();
        f362a = strA;
        if (!TextUtils.isEmpty(strA)) {
            return f362a;
        }
        String strB = b();
        f362a = strB;
        if (!TextUtils.isEmpty(strB)) {
            return f362a;
        }
        if (context != null) {
            int iMyPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                str = null;
            } else {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.pid == iMyPid) {
                        str = runningAppProcessInfo.processName;
                    }
                }
                str = null;
            }
        } else {
            str = null;
        }
        f362a = str;
        return str;
    }

    private static String a() {
        if (Build.VERSION.SDK_INT < 28) {
            return null;
        }
        try {
            return Application.getProcessName();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static String b() {
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, Application.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(null, new Object[0]);
            if (objInvoke instanceof String) {
                return (String) objInvoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static void a(Throwable th) {
        GeckoLogger.w("gecko-debug-tag", "throwIfDebug:", th);
    }
}
