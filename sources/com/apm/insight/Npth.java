package com.apm.insight;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import com.apm.insight.runtime.ConfigManager;
import com.apm.insight.runtime.m;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Npth {
    private static boolean sInit;

    public static void addAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            e.b().b(attachUserData, crashType);
        }
    }

    public static void addAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            e.b().a(attachUserData, crashType);
        }
    }

    public static void addTags(Map<? extends String, ? extends String> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        e.b().a(map);
    }

    public static void checkInnerNpth(boolean z) {
        m.c(z);
    }

    public static void dumpHprof(String str) {
        m.c(str);
    }

    public static void enableAnrInfo(boolean z) {
        m.b(z);
    }

    public static void enableLoopMonitor(boolean z) {
        m.a(z);
    }

    public static void enableNativeDump(boolean z) {
        m.d(z);
    }

    public static void enableThreadsBoost() {
        e.l();
    }

    public static ConfigManager getConfigManager() {
        return e.i();
    }

    public static boolean hasCrash() {
        return m.l();
    }

    public static boolean hasCrashWhenJavaCrash() {
        return m.m();
    }

    public static boolean hasCrashWhenNativeCrash() {
        return m.n();
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams) {
        init(context, iCommonParams, true, false, false);
    }

    public static synchronized void initMiniApp(@NonNull Context context, @NonNull ICommonParams iCommonParams) {
        e.o();
        init(context, iCommonParams, true, false, true, true);
    }

    public static boolean isANREnable() {
        return m.c();
    }

    public static boolean isInit() {
        return sInit;
    }

    public static boolean isJavaCrashEnable() {
        return m.b();
    }

    public static boolean isNativeCrashEnable() {
        return m.d();
    }

    public static boolean isRunning() {
        return m.i();
    }

    public static boolean isStopUpload() {
        return m.o();
    }

    public static void openANRMonitor() {
        m.g();
    }

    public static void openJavaCrashMonitor() {
        m.f();
    }

    public static boolean openNativeCrashMonitor() {
        return m.h();
    }

    public static void registerCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        m.a(iCrashCallback, crashType);
    }

    public static void registerOOMCallback(IOOMCallback iOOMCallback) {
        m.a(iOOMCallback);
    }

    public static void registerSdk(int i, String str) {
        e.a(i, str);
    }

    public static void removeAttachLongUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            e.b().b(crashType, attachUserData);
        }
    }

    public static void removeAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            e.b().a(crashType, attachUserData);
        }
    }

    public static void reportDartError(String str) {
        m.a(str);
    }

    @Deprecated
    public static void reportError(@NonNull Throwable th) {
        m.a(th);
    }

    public static void setAlogFlushAddr(long j) {
        m.k();
    }

    public static void setAlogFlushV2Addr(long j) {
        m.a(j);
    }

    public static void setAlogLogDirAddr(long j) {
        m.b(j);
    }

    public static void setAlogWriteAddr(long j) {
    }

    public static void setApplication(Application application) {
        e.a(application);
    }

    @Deprecated
    public static void setAttachUserData(AttachUserData attachUserData, CrashType crashType) {
        if (attachUserData != null) {
            e.b().a(attachUserData, crashType);
        }
    }

    public static void setBusiness(String str) {
        if (str != null) {
            e.a(str);
        }
    }

    public static void setCrashFilter(ICrashFilter iCrashFilter) {
        e.b().a(iCrashFilter);
    }

    public static void setCurProcessName(String str) {
        com.apm.insight.l.a.a(str);
    }

    public static void stopAnr() {
        m.j();
    }

    public static void stopUpload() {
        m.p();
    }

    public static void unregisterCrashCallback(ICrashCallback iCrashCallback, CrashType crashType) {
        m.b(iCrashCallback, crashType);
    }

    public static void unregisterOOMCallback(IOOMCallback iOOMCallback, CrashType crashType) {
        m.b(iOOMCallback);
    }

    @Deprecated
    public static void reportError(String str) {
        m.b(str);
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z, boolean z2, boolean z3) {
        init(context, iCommonParams, z, z, z2, z3);
    }

    public static synchronized void initMiniApp(@NonNull Context context, @NonNull ICommonParams iCommonParams, int i, String str) {
        e.o();
        e.b(i, str);
        init(context, iCommonParams, true, true, true, true);
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4) {
        init(context, iCommonParams, z, z2, z3, z4, 0L);
    }

    public static synchronized void init(@NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        Application applicationH;
        Context baseContext = context;
        synchronized (Npth.class) {
            try {
                if (e.h() != null) {
                    applicationH = e.h();
                } else if (baseContext instanceof Application) {
                    applicationH = (Application) baseContext;
                    if (applicationH.getBaseContext() == null) {
                        throw new IllegalArgumentException("The Application passed in when init has not been attached, please pass a attachBaseContext as param and call Npth.setApplication(Application) before init.");
                    }
                } else {
                    try {
                        applicationH = (Application) context.getApplicationContext();
                        if (applicationH != null) {
                            if (applicationH.getBaseContext() != null) {
                                baseContext = applicationH.getBaseContext();
                            }
                        } else {
                            throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                        }
                    } catch (Throwable unused) {
                        throw new IllegalArgumentException("Can not get the Application instance since a baseContext was passed in when init, please call Npth.setApplication(Application) before init.");
                    }
                }
                init(applicationH, baseContext, iCommonParams, z, z2, z3, z4, j);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized void init(@NonNull Application application, @NonNull Context context, @NonNull ICommonParams iCommonParams, boolean z, boolean z2, boolean z3, boolean z4, long j) {
        if (sInit) {
            return;
        }
        sInit = true;
        m.a(application, context);
        e.a(application, context, iCommonParams);
        Map<String, Object> mapA = e.a().a();
        MonitorCrash monitorCrashInit = MonitorCrash.init(context, String.valueOf(com.apm.insight.l.c.AnonymousClass1.a(mapA.get("aid"), 4444)), com.apm.insight.l.c.AnonymousClass1.a(mapA.get("update_version_code"), 0), String.valueOf(mapA.get("app_version")));
        if (monitorCrashInit != null) {
            monitorCrashInit.config().setDeviceId(e.a().d()).setChannel(String.valueOf(mapA.get("channel")));
        }
    }
}
