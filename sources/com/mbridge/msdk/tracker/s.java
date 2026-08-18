package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.unity3d.services.UnityAdsConstants;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes2.dex */
class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f2073a;
    private final int b;
    private final int c;
    private final int d;
    private final k e;
    private Handler i;
    private final AtomicInteger f = new AtomicInteger(0);
    private final AtomicInteger g = new AtomicInteger(0);
    private final Object h = new Object();
    private boolean j = true;
    private long k = 0;
    private volatile boolean l = false;
    private volatile boolean m = false;

    public static final class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final s f2075a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.f2075a = sVar;
        }

        private void a(String str) {
            this.f2075a.e.v();
            this.f2075a.g.addAndGet(0);
            this.f2075a.f2073a.b();
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception unused) {
                if (com.mbridge.msdk.tracker.a.f2024a) {
                    this.f2075a.e.v();
                }
            }
            if (this.f2075a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f2075a.f.get(), this.f2075a.k, this.f2075a.c));
            } catch (Exception unused2) {
                if (com.mbridge.msdk.tracker.a.f2024a) {
                    this.f2075a.e.v();
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i = message.what;
            if (i == 2 || i == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.f2024a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i == 5) {
                if (com.mbridge.msdk.tracker.a.f2024a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f2075a.a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            if (i != 6) {
                if (i != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.f2024a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.f2075a.k();
                b();
                if (com.mbridge.msdk.tracker.a.f2024a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.f2024a && !y.b(eVar)) {
                a(DM.B("收到 Event( ", eVar.b(), " )，当前 Event 数量："));
            }
            if (y.a(eVar) || this.f2075a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.f2024a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private synchronized void a() {
            try {
                this.f2075a.h();
            } catch (Exception unused) {
                if (com.mbridge.msdk.tracker.a.f2024a) {
                    this.f2075a.e.v();
                }
            }
        }
    }

    public s(k kVar) {
        this.f2073a = kVar.d();
        this.b = kVar.i();
        this.c = kVar.l();
        this.d = kVar.j();
        this.e = kVar;
    }

    private void l() {
        this.f2073a.c();
    }

    public void k() {
        synchronized (this.h) {
            try {
                if (!this.l) {
                    this.l = true;
                    l();
                }
                if (!this.m) {
                    this.m = true;
                    this.g.addAndGet(this.f2073a.b());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private List<i> c() {
        return this.f2073a.a(this.b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f2024a) {
                this.e.v();
                return;
            }
            return;
        }
        a(listC);
        this.g.addAndGet(-listC.size());
        if (com.mbridge.msdk.tracker.a.f2024a) {
            this.e.v();
            this.g.addAndGet(0);
            this.f2073a.b();
        }
        try {
            if (this.e.a()) {
                o oVarM = this.e.m();
                oVarM.a(new a(this.i, this));
                Map<String, String> map = new HashMap<>();
                try {
                    map = this.e.f().a(this.e.u(), listC, this.e.o());
                } catch (Exception unused) {
                    if (com.mbridge.msdk.tracker.a.f2024a) {
                        this.e.v();
                    }
                }
                oVarM.b(new t(listC), map, y.a(listC));
                return;
            }
        } catch (IllegalStateException unused2) {
            if (com.mbridge.msdk.tracker.a.f2024a) {
                this.e.v();
            }
        }
        if (com.mbridge.msdk.tracker.a.f2024a) {
            this.e.v();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f.set(0);
    }

    public void b() {
        this.i.removeMessages(1);
        Handler handler = this.i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.g.incrementAndGet();
    }

    public boolean f() {
        return this.g.addAndGet(0) >= this.b;
    }

    public boolean g() {
        return this.j;
    }

    public void j() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.c);
        this.j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f2073a.c(list);
    }

    public void a(e eVar) {
        if (this.i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f.get(), this.k, this.c);
        if (jA > this.c) {
            Handler handler = this.i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    public static final class a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f2074a;
        private final s b;

        public a(Handler handler, s sVar) {
            this.f2074a = handler;
            this.b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.b.b(tVar.a());
            this.b.i();
            this.b.k = 0L;
            if (this.b.f()) {
                Handler handler = this.f2074a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f2024a) {
                this.b.e.v();
                tVar.a().size();
                this.b.g.addAndGet(0);
                this.b.f2073a.b();
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i, String str) {
            this.b.a(tVar.a(), str);
            this.b.k = System.currentTimeMillis();
            int iD = this.b.d();
            if (iD <= 10) {
                this.f2074a.removeMessages(3);
                Handler handler = this.f2074a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), ((long) iD) * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f2024a) {
                this.b.e.v();
                tVar.a().size();
                this.b.g.addAndGet(0);
                this.b.f2073a.b();
            }
        }
    }

    private void a(List<i> list) {
        this.f2073a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f2024a) {
            return;
        }
        this.f2073a.a();
        if (com.mbridge.msdk.tracker.a.f2024a) {
            this.e.v();
            this.g.addAndGet(0);
            this.f2073a.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z = !iVar.g() && iVar.c() >= this.d;
                boolean z2 = !iVar.h() && iVar.b() < System.currentTimeMillis();
                if (!z && !z2) {
                    iVar.a(iVar.c() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.f2073a.a(list);
        this.g.addAndGet(i);
    }
}
