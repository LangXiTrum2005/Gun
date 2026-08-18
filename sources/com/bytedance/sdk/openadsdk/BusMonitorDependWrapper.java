package com.bytedance.sdk.openadsdk;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.openadsdk.VVE.LD;
import com.bytedance.sdk.openadsdk.VVE.LD.Lxb;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BusMonitorDependWrapper implements LD {
    private Handler LD;
    private LD Lxb;

    public BusMonitorDependWrapper(LD ld) {
        this.Lxb = ld;
    }

    public static Context getReflectContext() {
        try {
            Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
            method.setAccessible(true);
            Object objInvoke = method.invoke(null, new Object[0]);
            return (Application) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.VVE.LD
    public Context getContext() {
        LD ld = this.Lxb;
        return (ld == null || ld.getContext() == null) ? getReflectContext() : this.Lxb.getContext();
    }

    @Override // com.bytedance.sdk.openadsdk.VVE.LD
    public Handler getHandler() {
        LD ld = this.Lxb;
        if (ld != null && ld.getHandler() != null) {
            return this.Lxb.getHandler();
        }
        if (this.LD == null) {
            HandlerThread handlerThread = new HandlerThread("pag_monitor");
            handlerThread.start();
            this.LD = new Handler(handlerThread.getLooper());
        }
        return this.LD;
    }

    @Override // com.bytedance.sdk.openadsdk.VVE.LD
    public int getOnceLogCount() {
        LD ld = this.Lxb;
        if (ld != null) {
            return ld.getOnceLogCount();
        }
        return 20;
    }

    @Override // com.bytedance.sdk.openadsdk.VVE.LD
    public int getOnceLogInterval() {
        LD ld = this.Lxb;
        if (ld != null) {
            return ld.getOnceLogInterval();
        }
        return 1000;
    }

    @Override // com.bytedance.sdk.openadsdk.VVE.LD
    public int getUploadIntervalTime() {
        int uploadIntervalTime;
        LD ld = this.Lxb;
        if (ld == null || (uploadIntervalTime = ld.getUploadIntervalTime()) < 1800000) {
            return 1800000;
        }
        return uploadIntervalTime;
    }

    @Override // com.bytedance.sdk.openadsdk.VVE.LD
    public boolean isMonitorOpen() {
        LD ld = this.Lxb;
        if (ld != null) {
            return ld.isMonitorOpen();
        }
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.VVE.LD
    public void onMonitorUpload(List<Lxb> list) {
        LD ld = this.Lxb;
        if (ld != null) {
            ld.onMonitorUpload(list);
        }
    }
}
