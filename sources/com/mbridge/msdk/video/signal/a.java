package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.mbridge.msdk.out.NativeListener;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4363q1;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.N2;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.VN;

/* JADX INFO: loaded from: classes2.dex */
public interface a extends e {

    /* JADX INFO: renamed from: com.mbridge.msdk.video.signal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0270a extends NativeListener.NativeTrackingListener {
        void a();

        void a(int i, String str);

        void a(boolean z);

        void onInitSuccess();
    }

    void a(int i);

    void a(int i, String str);

    void a(InterfaceC0270a interfaceC0270a);

    void a(String str);

    void a(boolean z);

    boolean a();

    int b();

    void b(int i);

    void b(boolean z);

    String c();

    void c(int i);

    int d();

    void d(int i);

    String e();

    void e(int i);

    String f(int i);

    void f();

    String g();

    void g(int i);

    void h();

    int i();

    void release();

    void setActivity(Activity activity);

    void setAdEvents(C4363q1 c4363q1);

    void setAdSession(N2 n2);

    void setRewardUnitSetting(com.mbridge.msdk.videocommon.setting.c cVar);

    void setUnitId(String str);

    void setVideoEvents(VN vn);

    void setWebViewFront(int i);
}
