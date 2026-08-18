package com.bytedance.sdk.openadsdk.multipro.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.IBinderPool;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.JXs;
import com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.ZU;
import com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.ebl;
import com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.lc;

/* JADX INFO: loaded from: classes2.dex */
public class BinderPoolService extends Service {
    public static volatile boolean Lxb;
    private static boolean lk;
    private final Binder LD = new Lxb();

    public static class Lxb extends IBinderPool.Stub {
        @Override // com.bytedance.sdk.openadsdk.IBinderPool
        public IBinder queryBinder(int i) throws RemoteException {
            if (i == 0) {
                return ebl.Lxb();
            }
            if (i == 1) {
                return JXs.Lxb();
            }
            if (i == 4) {
                return com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.lk.Lxb();
            }
            if (i == 5) {
                return lc.LD();
            }
            if (i == 6) {
                return ZU.Lxb();
            }
            if (i != 7) {
                return null;
            }
            return com.bytedance.sdk.openadsdk.multipro.aidl.Lxb.LD.Lxb();
        }
    }

    @Override // android.app.Service
    @Nullable
    public IBinder onBind(Intent intent) {
        return this.LD;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        kqm.LD(getApplicationContext());
        Lxb = true;
        if (!lk) {
            com.bytedance.sdk.component.utils.ebl.LD().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.multipro.aidl.BinderPoolService.1
                @Override // java.lang.Runnable
                public void run() {
                    VVE.TA().Lxb(BinderPoolService.this.getApplicationContext());
                }
            });
        }
        lk = true;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }
}
