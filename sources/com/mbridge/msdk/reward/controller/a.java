package com.mbridge.msdk.reward.controller;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.w0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import com.mbridge.msdk.videocommon.listener.InterVideoOutListener;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public static String V = "";
    public static String W;
    private static ConcurrentHashMap<String, Integer> X = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, String> Y = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, i> Z = new ConcurrentHashMap<>();
    private Queue<Integer> E;
    private String F;
    private CopyOnWriteArrayList<CampaignEx> O;
    private List<CampaignEx> P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1772a;
    private com.mbridge.msdk.reward.adapter.c b;
    private com.mbridge.msdk.videocommon.setting.c c;
    private com.mbridge.msdk.videocommon.setting.a d;
    private volatile InterVideoOutListener e;
    private volatile h f;
    private String g;
    private String h;
    private MBridgeIds i;
    g j;
    private String k;
    private volatile String l;
    private String m;
    private int q;
    private int r;
    private int s;
    private boolean x;
    private int n = 0;
    private int p = 2;
    private boolean t = false;
    private boolean u = false;
    private boolean v = false;
    private boolean w = false;
    private boolean y = false;
    private ArrayList<Integer> z = new ArrayList<>(7);
    private boolean A = false;
    private final Object B = new Object();
    public boolean C = false;
    private List<CampaignEx> D = new ArrayList();
    private com.mbridge.msdk.foundation.db.g G = null;
    private volatile boolean H = true;
    private volatile boolean I = false;
    private volatile boolean J = false;
    private volatile boolean K = false;
    private volatile boolean L = false;
    private volatile boolean M = false;
    private volatile boolean N = false;
    volatile boolean Q = false;
    volatile boolean R = false;
    volatile boolean S = false;
    volatile boolean T = false;
    volatile boolean U = false;
    private Handler o = new com.mbridge.msdk.reward.controller.b(this);

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$a, reason: collision with other inner class name */
    public class C0227a implements com.mbridge.msdk.videocommon.net.c {
        public C0227a() {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void a(String str) {
        }

        @Override // com.mbridge.msdk.videocommon.net.c
        public void onFailed(String str) {
        }
    }

    public class c implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f1779a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ CopyOnWriteArrayList c;
        final /* synthetic */ boolean d;
        final /* synthetic */ int e;

        public c(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, boolean z, int i) {
            this.b = campaignEx;
            this.c = copyOnWriteArrayList;
            this.d = z;
            this.e = i;
            this.f1779a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId = bVar == null ? "" : bVar.f().getUnitId();
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.P);
            if (bVar != null) {
                bVar.d("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (this.f1779a == null) {
                this.f1779a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f1779a.b(this.c);
            this.f1779a.a(bVar);
            if (!this.d && a.this.f != null) {
                if (a.this.T) {
                    return;
                }
                a.this.T = true;
                a.this.f.b(bVar, this.f1779a);
                return;
            }
            if (this.e != 1 || a.this.T || a.this.f == null) {
                return;
            }
            a.this.T = true;
            a.this.f.b(bVar, this.f1779a);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.G == null) {
                    a.this.G = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
                }
                com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(a.this.G);
                if (hVarA != null) {
                    hVarA.b(a.this.h);
                }
            } catch (Throwable unused) {
                o0.b("RewardVideoController", "can't find DailyPlayCapDao");
            }
        }
    }

    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.mbridge.msdk.reward.adapter.c f1784a;
        private final int b;
        private final boolean c;
        private boolean d = false;
        private int e;
        private String f;
        private com.mbridge.msdk.foundation.same.report.metrics.c g;

        public f(com.mbridge.msdk.reward.adapter.c cVar, int i, boolean z, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar2) {
            this.f1784a = cVar;
            this.b = i;
            this.c = z;
            if (cVar != null) {
                cVar.c(false);
            }
            this.f = str;
            this.g = cVar2;
        }

        public void a() {
            this.d = true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.d) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = this.f1784a;
            if (cVar != null) {
                cVar.c(true);
            }
            o0.b("RewardVideoController", "adSource=" + this.b + " CommonCancelTimeTask mIsDevCall：" + this.c);
            a.this.a(com.mbridge.msdk.foundation.error.a.a(880023, "v3 is timeout"), this.g);
        }

        public void a(int i) {
            this.e = i;
        }
    }

    public class g implements com.mbridge.msdk.reward.adapter.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.reward.adapter.c f1785a;
        private boolean b;
        private f c;

        public g(com.mbridge.msdk.reward.adapter.c cVar, boolean z) {
            this.f1785a = cVar;
            this.b = z;
        }

        public void a(f fVar) {
            this.c = fVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.c;
            if (fVar != null) {
                fVar.a();
                a.this.o.removeCallbacks(this.c);
            }
            if (a.this.f != null) {
                a.this.f.a(a.this.l, a.this.h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.c;
            if (fVar != null) {
                fVar.a();
                a.this.o.removeCallbacks(this.c);
            }
            a.this.a(list);
            if (a.this.f != null) {
                a.this.f.c(a.this.l, a.this.h, cVar);
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            f fVar = this.c;
            if (fVar != null) {
                fVar.a();
                a.this.o.removeCallbacks(this.c);
            }
            com.mbridge.msdk.reward.adapter.c cVar2 = this.f1785a;
            if (cVar2 != null) {
                cVar2.a((com.mbridge.msdk.reward.adapter.a) null);
                this.f1785a = null;
            }
            a.this.a(list);
            if (a.this.f != null) {
                a.this.f.a(bVar, cVar);
            }
        }
    }

    public final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<InterVideoOutListener> f1786a;
        private volatile AtomicInteger b;
        private Handler c;
        private String d;
        private boolean e;

        public /* synthetic */ h(a aVar, InterVideoOutListener interVideoOutListener, Handler handler, String str, C0227a c0227a) {
            this(interVideoOutListener, handler, str);
        }

        public void c(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f1786a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.b.get() == 2 || this.c == null) {
                return;
            }
            this.b.set(2);
            if (a.this.K) {
                return;
            }
            a.this.K = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.b(a.this.D);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putString("metrics_data_lrid", cVar.o());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.c.sendMessage(messageObtain);
            }
        }

        public void d(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            Handler handler = this.c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f1786a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.b.get() == 2 || this.c == null) {
                return;
            }
            if (this.b.get() == 1) {
                this.b.set(3);
            }
            if (a.this.K) {
                return;
            }
            a.this.K = true;
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            cVar.a(true);
            cVar.b(a.this.D);
            a.this.a("2000048", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putSerializable("metrics_data_lrid", cVar.o());
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 9;
                this.c.sendMessage(messageObtain);
            }
            if (a.this.L) {
                this.b.set(2);
            }
        }

        private h(InterVideoOutListener interVideoOutListener, Handler handler, String str) {
            this.f1786a = new WeakReference<>(interVideoOutListener);
            this.b = new AtomicInteger(0);
            this.c = handler;
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f1786a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.c == null || a.this.J) {
                return;
            }
            a.this.J = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, true);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.o());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.c.sendMessage(messageObtain);
                if (q0.a().a("l_s_i_l_v_s", false)) {
                    d(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int a() {
            return this.b.get();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i) {
            this.b.set(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, String str2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f1786a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if ((this.b.get() != 1 && this.b.get() != 3) || this.c == null || a.this.J) {
                return;
            }
            a.this.J = true;
            a.this.a("2000127", cVar, interVideoOutListener);
            if (interVideoOutListener != null) {
                Message messageObtain = Message.obtain();
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                bundle.putBoolean(MBridgeConstans.PROPERTIES_IS_CACHED_CAMPAIGN, false);
                if (cVar != null) {
                    bundle.putString("metrics_data_lrid", cVar.o());
                }
                messageObtain.setData(bundle);
                messageObtain.obj = str2;
                messageObtain.what = 17;
                this.c.sendMessage(messageObtain);
                if (q0.a().a("l_s_i_l_v_s", false)) {
                    c(str, str2, cVar);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            WeakReference<InterVideoOutListener> weakReference = this.f1786a;
            a.this.a("2000047", cVar, weakReference != null ? weakReference.get() : null);
            if (this.c != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 18;
                if (cVar != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVar.o());
                    messageObtain.setData(bundle);
                }
                this.c.sendMessage(messageObtain);
            }
        }

        public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            String strH;
            CampaignEx campaignEx;
            if (bVar != null && cVar != null) {
                strH = bVar.h();
                cVar.a(bVar);
            } else {
                strH = "";
            }
            if (a.this.b != null) {
                a.this.b.a(a.this.j);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListF = a.this.b.f();
                CampaignEx campaignEx2 = (a.this.D == null || a.this.D.size() == 0) ? null : (CampaignEx) a.this.D.get(0);
                if (campaignEx2 != null) {
                    campaignEx = campaignEx2;
                } else if (copyOnWriteArrayListF == null || copyOnWriteArrayListF.size() == 0) {
                    campaignEx = null;
                } else {
                    campaignEx2 = copyOnWriteArrayListF.get(0);
                    campaignEx = campaignEx2;
                }
                if (a.this.u && ((campaignEx == null || TextUtils.isEmpty(campaignEx.getNLRid())) && ((copyOnWriteArrayListF == null || copyOnWriteArrayListF.size() == 0) && a.this.b.a(campaignEx, true, bVar, 2, cVar)))) {
                    return;
                } else {
                    a.this.b.a((com.mbridge.msdk.reward.adapter.a) null);
                }
            }
            Handler handler = this.c;
            if (handler != null) {
                handler.removeMessages(1001002);
            }
            WeakReference<InterVideoOutListener> weakReference = this.f1786a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.b.get() == 2 || this.c == null) {
                return;
            }
            a.this.L = true;
            if (!a.this.N || strH.contains("resource load timeout")) {
                a.this.M = true;
            }
            if (a.this.K) {
                this.b.set(2);
            }
            if (a.this.L && a.this.M && !a.this.K) {
                this.b.set(2);
                a.this.a("2000047", cVar, interVideoOutListener);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strH;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.o());
                        messageObtain.setData(bundle);
                    }
                    this.c.sendMessage(messageObtain);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            String strH;
            WeakReference<InterVideoOutListener> weakReference = this.f1786a;
            InterVideoOutListener interVideoOutListener = weakReference != null ? weakReference.get() : null;
            if (this.b.get() == 2 || this.c == null) {
                return;
            }
            a.this.M = true;
            if (bVar != null) {
                strH = bVar.h();
            } else {
                strH = "";
            }
            if (strH.contains("resource load timeout")) {
                a.this.L = true;
            }
            if (a.this.M && a.this.L && !a.this.K) {
                this.b.set(2);
                if (interVideoOutListener != null) {
                    Message messageObtain = Message.obtain();
                    messageObtain.obj = strH;
                    messageObtain.what = 16;
                    if (cVar != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", cVar.o());
                        messageObtain.setData(bundle);
                    }
                    this.c.sendMessage(messageObtain);
                }
                if (cVar == null) {
                    cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                cVar.a(true);
                a.this.a("2000047", cVar, interVideoOutListener);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.b.set(2);
            b(str, cVar);
        }

        public void a(boolean z) {
            this.e = z;
        }
    }

    public final class i extends com.mbridge.msdk.video.bt.module.orglistener.b {
        private a c;
        private Handler d;
        private int e;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$i$a, reason: collision with other inner class name */
        public class RunnableC0234a implements Runnable {
            public RunnableC0234a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.c != null) {
                    i.this.c.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, a.this.t ? 287 : 94, a.this.h, true, 1));
                }
            }
        }

        public /* synthetic */ i(a aVar, a aVar2, Handler handler, C0227a c0227a) {
            this(aVar2, handler);
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void b(String str, String str2) {
            try {
                a aVar = this.c;
                if (aVar == null || aVar.e == null) {
                    return;
                }
                try {
                    this.c.e.onVideoComplete(a.this.i);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardVideoController", e.getMessage());
                    }
                }
                this.e = 5;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        public void e() {
            a.this.z.clear();
            this.c = null;
        }

        private i(a aVar, Handler handler) {
            this.e = 0;
            this.c = aVar;
            this.d = handler;
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a aVar = a.this;
            aVar.C = false;
            try {
                com.mbridge.msdk.reward.candidate.a aVar2 = new com.mbridge.msdk.reward.candidate.a(aVar.h, a.this.t);
                a aVar3 = this.c;
                aVar2.a(cVar.o(), (aVar3 == null || aVar3.b == null) ? "" : this.c.b.G, 3, a.V);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e.getMessage());
                }
            }
            try {
                a aVar4 = this.c;
                if (aVar4 != null) {
                    aVar4.A = true;
                    if (this.c.b != null) {
                        this.c.b.G = "";
                    }
                    this.c.q();
                    if (a.this.u) {
                        a.this.a();
                    }
                    a aVar5 = a.this;
                    aVar5.a("2000130", cVar, aVar5.e, "");
                    b();
                    if (this.c.e != null) {
                        this.c.e.onAdShow(a.this.i);
                        this.e = 2;
                    }
                }
            } catch (Throwable th) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", th.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z, com.mbridge.msdk.videocommon.entity.c cVar2) {
            try {
                a aVar = this.c;
                if (aVar != null && aVar.e != null) {
                    if (cVar2 == null) {
                        cVar2 = com.mbridge.msdk.videocommon.entity.c.a(this.c.m);
                    }
                    if (a.this.u) {
                        a.this.a();
                        a.this.v();
                        com.mbridge.msdk.foundation.same.buffer.b.d(a.this.h, a.this.m());
                    }
                    this.c.e.onAdClose(a.this.i, new RewardInfo(z, cVar2.c(), String.valueOf(cVar2.a())));
                    this.e = 7;
                    this.c.A = false;
                    e();
                }
                com.mbridge.msdk.foundation.same.report.metrics.d.b().b("2000152", cVar, null);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
            try {
                a aVar = a.this;
                aVar.C = false;
                if (this.c != null) {
                    if (aVar.u) {
                        a.this.a();
                    }
                    this.c.A = false;
                    a.this.a("2000131", cVar, this.c.e, str);
                    a();
                    if (this.c.e != null) {
                        try {
                            this.c.e.onShowFail(cVar, a.this.i, str);
                        } catch (Exception e) {
                            if (MBridgeConstans.DEBUG) {
                                o0.b("RewardVideoController", e.getMessage());
                            }
                        }
                        this.e = 4;
                    }
                }
            } catch (Exception e2) {
                this.e = 0;
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z, String str, String str2) {
            try {
                a aVar = this.c;
                if (aVar == null || aVar.e == null) {
                    return;
                }
                if (a.this.u) {
                    a.this.a();
                }
                this.c.A = false;
                try {
                    this.c.e.onVideoAdClicked(z, a.this.i);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardVideoController", e.getMessage());
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(boolean z, int i) {
            try {
                a aVar = this.c;
                if (aVar != null && aVar.e != null) {
                    try {
                        this.c.e.onAdCloseWithIVReward(a.this.i, new RewardInfo(z, i));
                    } catch (Exception e) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("RewardVideoController", e.getMessage());
                        }
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(String str, String str2) {
            try {
                a aVar = this.c;
                if (aVar == null || aVar.e == null) {
                    return;
                }
                try {
                    this.c.e.onEndcardShow(a.this.i);
                    com.mbridge.msdk.foundation.feedback.b.b().a(str2 + "_2", 2);
                } catch (Exception e) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardVideoController", e.getMessage());
                    }
                }
                this.e = 6;
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
        public void a(int i, String str, String str2) {
            this.e = i;
            a aVar = this.c;
            if (aVar == null || aVar.u || this.c.t || this.c.c == null || !this.c.c.a(this.e) || this.c.f == null || this.c.f.a() == 1 || this.c.f.a() == 3 || a.this.z.contains(Integer.valueOf(this.e))) {
                return;
            }
            a.this.z.add(Integer.valueOf(this.e));
            int iF = this.c.c.f() * 1000;
            if (this.e == 4) {
                iF = PathInterpolatorCompat.MAX_NUM_POINTS;
            }
            Handler handler = this.d;
            if (handler != null) {
                handler.removeMessages(1001001);
                this.d.sendEmptyMessageDelayed(1001001, iF);
            } else {
                new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0234a(), iF);
            }
        }
    }

    private void x() {
        try {
            List<CampaignEx> listC = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f1772a)).c(this.h);
            if (listC == null || listC.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : listC) {
                if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                } else {
                    com.mbridge.msdk.videocommon.a.e(this.h + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl());
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        com.mbridge.msdk.videocommon.a.e(this.h + "_" + campaignEx.getId() + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e());
                    }
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    private void w() {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f1772a)).b(this.h);
    }

    public void f(boolean z) {
        this.y = z;
    }

    public MBridgeIds g() {
        return this.i;
    }

    public List<CampaignEx> h() {
        return this.P;
    }

    public CopyOnWriteArrayList<CampaignEx> i() {
        return this.O;
    }

    public String j() {
        com.mbridge.msdk.reward.adapter.c cVar = this.b;
        return cVar != null ? cVar.g() : "";
    }

    public h k() {
        return this.f;
    }

    public String l() {
        return this.l;
    }

    public String m() {
        com.mbridge.msdk.reward.adapter.c cVar = this.b;
        return cVar != null ? cVar.a(this.A) : "";
    }

    public com.mbridge.msdk.reward.adapter.c n() {
        return this.b;
    }

    public InterVideoOutListener o() {
        return this.e;
    }

    public String p() {
        return this.h;
    }

    public void q() {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e());
    }

    public boolean r() {
        return this.u;
    }

    public boolean s() {
        return this.x;
    }

    public boolean t() {
        return this.t;
    }

    public boolean u() {
        return (this.e == null || this.f == null) ? false : true;
    }

    public void v() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (!this.A || (concurrentHashMap = Y) == null || concurrentHashMap.containsKey(m())) {
            return;
        }
        Y.remove(m());
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c b(boolean z, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        String strA;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        try {
            b(z);
            if (TextUtils.isEmpty(str)) {
                strA = SameMD5.getMD5(t0.d());
            } else {
                strA = a(str);
            }
            cVar2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strA);
            if (cVar2 == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(strA, cVar);
                    cVar.d(true);
                    cVar2 = cVar;
                } catch (Exception e2) {
                    e = e2;
                }
            }
            cVar2.h(strA);
            cVar2.m(this.h);
            if (eVar != null) {
                if (eVar.a("adtp")) {
                    cVar2.a(Integer.parseInt((String) eVar.b("adtp")));
                }
                if (eVar.a(CampaignEx.JSON_KEY_HB)) {
                    String str2 = (String) eVar.b(CampaignEx.JSON_KEY_HB);
                    cVar2.g(str2);
                    if (str2.equals("1")) {
                        cVar2.f(str);
                    }
                }
            }
            cVar2.e(z ? "2" : "1");
            if (!z) {
                return cVar2;
            }
            com.mbridge.msdk.reward.report.metrics.a.a().a("2000123", cVar2);
            return cVar2;
        } catch (Exception e3) {
            e = e3;
            cVar = cVar2;
        }
        if (MBridgeConstans.DEBUG) {
            o0.b("RewardVideoController", e.getMessage());
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() <= 0 || this.K) {
                    return;
                }
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).b(list, str);
            } catch (Throwable th) {
                o0.b("RewardVideoController", th.getMessage());
            }
        }
    }

    private void f() {
        com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(this.f1772a, this.l, this.h);
        this.b = cVar;
        cVar.d(this.t);
        this.b.e(this.u);
        if (this.t) {
            this.b.a(this.q, this.r, this.s);
        }
        this.b.a(this.c);
    }

    public void d(boolean z) {
        this.t = z;
        if (z) {
            this.p = com.mbridge.msdk.foundation.same.a.X;
        } else {
            this.p = com.mbridge.msdk.foundation.same.a.W;
        }
    }

    public void e(boolean z) {
        this.u = z;
    }

    public class d implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f1780a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ CopyOnWriteArrayList c;
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c d;
        final /* synthetic */ boolean e;
        final /* synthetic */ int f;

        public d(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar, boolean z, int i) {
            this.b = campaignEx;
            this.c = copyOnWriteArrayList;
            this.d = cVar;
            this.e = z;
            this.f = i;
            this.f1780a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            a.this.R = true;
            if (!a.this.Q || a.this.S || a.this.o == null) {
                return;
            }
            a.this.S = true;
            a.this.o.post(new RunnableC0232a(str3, str, str2));
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            String unitId;
            if (bVar != null) {
                unitId = bVar.f().getUnitId();
                bVar.d("errorCode: 3203 errorMessage: tpl temp resource download failed");
            } else {
                unitId = "";
            }
            a aVar = a.this;
            aVar.c(unitId, (List<CampaignEx>) aVar.P);
            if (this.f1780a == null) {
                this.f1780a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f1780a.a(bVar);
            this.f1780a.b(this.c);
            a.this.R = false;
            if (a.this.f == null || a.this.T) {
                return;
            }
            a.this.T = true;
            a.this.f.b(bVar, this.f1780a);
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a, reason: collision with other inner class name */
        public class RunnableC0232a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1781a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            public RunnableC0232a(String str, String str2, String str3) {
                this.f1781a = str;
                this.b = str2;
                this.c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z = a.this.y;
                Handler handler = a.this.o;
                boolean z2 = a.this.t;
                boolean z3 = a.this.u;
                String str = this.f1781a;
                String requestIdNotice = d.this.b.getRequestIdNotice();
                String str2 = this.b;
                String str3 = this.c;
                String cMPTEntryUrl = d.this.b.getCMPTEntryUrl();
                int i = a.this.p;
                d dVar = d.this;
                bVarB.a(z, handler, z2, z3, str, requestIdNotice, str2, str3, cMPTEntryUrl, i, dVar.b, dVar.c, H5DownLoadManager.getInstance().getH5ResAddress(d.this.b.getCMPTEntryUrl()), this.c, a.this.c, new C0233a(), true);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$d$a$a, reason: collision with other inner class name */
            public class C0233a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0233a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0272a c0272a) {
                    d dVar = d.this;
                    com.mbridge.msdk.reward.adapter.c cVar = dVar.d;
                    if (cVar != null && cVar.a(dVar.c, dVar.e, dVar.f)) {
                        if (a.this.f == null || a.this.U) {
                            return;
                        }
                        a.this.U = true;
                        o0.a("RewardVideoController", "Cache onVideoLoadSuccess");
                        d dVar2 = d.this;
                        a.this.a(dVar2.c);
                        d dVar3 = d.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = dVar3.f1780a;
                        if (cVar2 != null) {
                            cVar2.b(dVar3.c);
                        }
                        a.this.f.d(str2, str3, d.this.f1780a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.P);
                    if (a.this.f == null || a.this.T) {
                        return;
                    }
                    a.this.T = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    d dVar4 = d.this;
                    if (dVar4.f1780a == null) {
                        dVar4.f1780a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar5 = d.this;
                    dVar5.f1780a.b(dVar5.c);
                    d.this.f1780a.a(bVarA);
                    a.this.f.b(bVarA, d.this.f1780a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0272a c0272a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0232a runnableC0232a = RunnableC0232a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0232a.c, (List<CampaignEx>) aVar.P);
                    if (a.this.f == null || a.this.T) {
                        return;
                    }
                    a.this.T = true;
                    if (bVar != null) {
                        bVar.d("errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    d dVar = d.this;
                    if (dVar.f1780a == null) {
                        dVar.f1780a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    d dVar2 = d.this;
                    dVar2.f1780a.b(dVar2.c);
                    d.this.f1780a.a(bVar);
                    a.this.f.b(bVar, d.this.f1780a);
                }
            }
        }
    }

    public void e() {
        m0.b();
    }

    private boolean d() {
        if (this.b == null) {
            f();
        }
        com.mbridge.msdk.reward.adapter.c cVar = this.b;
        if (cVar != null) {
            return cVar.l();
        }
        return false;
    }

    public void c(String str, String str2) {
        try {
            this.f1772a = com.mbridge.msdk.foundation.controller.c.n().d();
            this.h = str2;
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            this.l = str;
            this.i = new MBridgeIds(this.l, this.h);
            this.d = com.mbridge.msdk.videocommon.setting.b.b().c();
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new com.mbridge.msdk.reward.controller.c(this.f1772a, this.h));
            if (this.G == null) {
                this.G = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        } catch (Throwable th) {
            o0.b("RewardVideoController", th.getMessage(), th);
        }
    }

    public void a(int i2) {
        this.p = i2;
    }

    public void a(String str, String str2, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            w0.b(this.f1772a, "MBridge_ConfirmTitle" + this.h, str.trim());
        }
        if (!TextUtils.isEmpty(str2)) {
            w0.b(this.f1772a, "MBridge_ConfirmContent" + this.h, str2.trim());
        }
        if (!TextUtils.isEmpty(str4)) {
            w0.b(this.f1772a, "MBridge_CancelText" + this.h, str4.trim());
        }
        if (TextUtils.isEmpty(str3)) {
            return;
        }
        w0.b(this.f1772a, "MBridge_ConfirmText" + this.h, str3.trim());
    }

    private void d(String str, String str2) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar.m(this.h);
            cVar.a(this.t ? 287 : 94);
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("event_name", str);
            eVar.a("reason", str2);
            cVar.a("m_temp_is_ready_check", eVar);
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_temp_is_ready_check", cVar);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public class b implements com.mbridge.msdk.reward.adapter.b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f1774a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c d;
        final /* synthetic */ int e;

        public b(CampaignEx campaignEx, boolean z, com.mbridge.msdk.reward.adapter.c cVar, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = cVar;
            this.e = i;
            this.f1774a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            a.this.Q = true;
            if (this.c) {
                if (!a.this.R || a.this.S || a.this.o == null) {
                    return;
                }
                a.this.S = true;
                a.this.o.post(new RunnableC0230b(str3, str, str2, copyOnWriteArrayList));
                return;
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e()) || campaignEx.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a.this.o == null) {
                    com.mbridge.msdk.reward.adapter.c cVar = this.d;
                    if (cVar == null || !cVar.a(copyOnWriteArrayList, this.c, this.e)) {
                        a aVar = a.this;
                        aVar.c(str2, (List<CampaignEx>) aVar.P);
                        if (a.this.f != null && !a.this.T) {
                            a.this.T = true;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f1774a == null) {
                                this.f1774a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f1774a.b(a.this.O);
                            this.f1774a.a(bVarA);
                            a.this.f.b(bVarA, this.f1774a);
                        }
                    } else if (a.this.f != null && !a.this.U) {
                        a.this.U = true;
                        o0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        a.this.a(copyOnWriteArrayList);
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = this.f1774a;
                        if (cVar2 != null) {
                            cVar2.b(copyOnWriteArrayList);
                        }
                        a.this.f.d(str, str2, this.f1774a);
                    }
                } else {
                    a.this.o.post(new RunnableC0228a(campaignEx, copyOnWriteArrayList, str, str2, str3));
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a, reason: collision with other inner class name */
        public class RunnableC0228a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f1775a;
            final /* synthetic */ CopyOnWriteArrayList b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ String e;

            public RunnableC0228a(CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, String str2, String str3) {
                this.f1775a = campaignEx;
                this.b = copyOnWriteArrayList;
                this.c = str;
                this.d = str2;
                this.e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.y, a.this.o, a.this.t, a.this.u, null, this.f1775a.getRewardTemplateMode().e(), a.this.p, b.this.b, this.b, H5DownLoadManager.getInstance().getH5ResAddress(this.f1775a.getRewardTemplateMode().e()), this.c, this.d, this.e, this.f1775a.getRequestIdNotice(), a.this.c, new C0229a());
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$a$a, reason: collision with other inner class name */
            public class C0229a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0229a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0272a c0272a) {
                    RunnableC0228a runnableC0228a = RunnableC0228a.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.d;
                    if (cVar != null && cVar.a(runnableC0228a.b, bVar.c, bVar.e)) {
                        if (a.this.f == null || a.this.U) {
                            return;
                        }
                        a.this.U = true;
                        RunnableC0228a runnableC0228a2 = RunnableC0228a.this;
                        a.this.a(runnableC0228a2.b);
                        a.this.f.d(str2, str3, b.this.f1774a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.P);
                    if (a.this.f == null || a.this.T) {
                        return;
                    }
                    a.this.T = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f1774a == null) {
                        bVar2.f1774a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0228a runnableC0228a3 = RunnableC0228a.this;
                    b.this.f1774a.b(runnableC0228a3.b);
                    b.this.f1774a.a(bVarA);
                    a.this.f.b(bVarA, b.this.f1774a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0272a c0272a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0228a runnableC0228a = RunnableC0228a.this;
                    a aVar = a.this;
                    aVar.c(runnableC0228a.d, (List<CampaignEx>) aVar.P);
                    if (a.this.f == null || a.this.T) {
                        return;
                    }
                    a.this.T = true;
                    bVar.d("errorCode: 3301 errorMessage: temp preload failed");
                    b bVar2 = b.this;
                    if (bVar2.f1774a == null) {
                        bVar2.f1774a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b bVar3 = b.this;
                    bVar3.f1774a.b(a.this.O);
                    b.this.f1774a.a(bVar);
                    a.this.f.b(bVar, b.this.f1774a);
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b, reason: collision with other inner class name */
        public class RunnableC0230b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1777a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ CopyOnWriteArrayList d;

            public RunnableC0230b(String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f1777a = str;
                this.b = str2;
                this.c = str3;
                this.d = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b.b().a(a.this.y, a.this.o, a.this.t, a.this.u, this.f1777a, b.this.b.getRequestIdNotice(), this.b, this.c, b.this.b.getCMPTEntryUrl(), a.this.p, b.this.b, this.d, H5DownLoadManager.getInstance().getH5ResAddress(b.this.b.getCMPTEntryUrl()), this.c, a.this.c, new C0231a(), true);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.controller.a$b$b$a, reason: collision with other inner class name */
            public class C0231a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0231a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0272a c0272a) {
                    RunnableC0230b runnableC0230b = RunnableC0230b.this;
                    b bVar = b.this;
                    com.mbridge.msdk.reward.adapter.c cVar = bVar.d;
                    if (cVar != null && cVar.a(runnableC0230b.d, bVar.c, bVar.e)) {
                        if (a.this.f == null || a.this.U) {
                            return;
                        }
                        a.this.U = true;
                        o0.a("RewardVideoController", "Cache onVideoLoadSuccessForCache");
                        RunnableC0230b runnableC0230b2 = RunnableC0230b.this;
                        a.this.a(runnableC0230b2.d);
                        RunnableC0230b runnableC0230b3 = RunnableC0230b.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = b.this.f1774a;
                        if (cVar2 != null) {
                            cVar2.b(runnableC0230b3.d);
                        }
                        a.this.f.d(str2, str3, b.this.f1774a);
                        return;
                    }
                    a aVar = a.this;
                    aVar.c(str3, (List<CampaignEx>) aVar.P);
                    if (a.this.f == null || a.this.T) {
                        return;
                    }
                    a.this.T = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3504 errorMessage: tpl temp preload success but isReady false");
                    b bVar2 = b.this;
                    if (bVar2.f1774a == null) {
                        bVar2.f1774a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    b.this.f1774a.a(bVarA);
                    RunnableC0230b runnableC0230b4 = RunnableC0230b.this;
                    b.this.f1774a.b(runnableC0230b4.d);
                    a.this.f.b(bVarA, b.this.f1774a);
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0272a c0272a, com.mbridge.msdk.foundation.error.b bVar) {
                    RunnableC0230b runnableC0230b = RunnableC0230b.this;
                    a aVar = a.this;
                    aVar.c(runnableC0230b.c, (List<CampaignEx>) aVar.P);
                    if (a.this.f == null || a.this.T) {
                        return;
                    }
                    a.this.T = true;
                    if (bVar != null) {
                        bVar.d("errorCode: 3302 errorMessage: tpl preload failed");
                    }
                    b bVar2 = b.this;
                    if (bVar2.f1774a == null) {
                        bVar2.f1774a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    RunnableC0230b runnableC0230b2 = RunnableC0230b.this;
                    b.this.f1774a.b(runnableC0230b2.d);
                    b.this.f1774a.a(bVar);
                    a.this.f.b(bVar, b.this.f1774a);
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            a.this.Q = false;
            a aVar = a.this;
            aVar.c(aVar.h, (List<CampaignEx>) a.this.P);
            if (a.this.f == null || a.this.T) {
                return;
            }
            a.this.T = true;
            if (this.f1774a == null) {
                this.f1774a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f1774a.b(copyOnWriteArrayList);
            if (bVar != null) {
                bVar.d("errorCode: 3201 errorMessage: campaign resource download failed");
            }
            this.f1774a.a(bVar);
            a.this.f.b(bVar, this.f1774a);
        }
    }

    public boolean c(boolean z) {
        try {
            if (c()) {
                if (z) {
                    d("is_ready_start", "over cap check error");
                }
            } else if (this.u) {
                try {
                    return a(z);
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardVideoController", e2.getMessage());
                    }
                }
            } else {
                return d();
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", th.getMessage());
            }
        }
        return false;
    }

    public void a(int i2, int i3, int i4) {
        this.q = i2;
        this.r = i3;
        if (i3 == com.mbridge.msdk.foundation.same.a.K) {
            this.s = i4 < 0 ? 5 : i4;
        }
        if (i3 == com.mbridge.msdk.foundation.same.a.J) {
            this.s = i4 < 0 ? 80 : i4;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ivRewardEnable", 1);
            jSONObject.put("ivRewardMode", i2 == com.mbridge.msdk.foundation.same.a.H ? 0 : 1);
            jSONObject.put("ivRewardPlayValueMode", i3 == com.mbridge.msdk.foundation.same.a.J ? 0 : 1);
            jSONObject.put("ivRewardPlayValue", i4);
            com.mbridge.msdk.setting.h.b().i(this.h, jSONObject.toString());
        } catch (Exception unused) {
            o0.b("RewardVideoController", "setIVRewardEnable to SP was ERROR");
        }
    }

    private boolean c() {
        try {
            if (this.G == null) {
                this.G = com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d());
            }
            com.mbridge.msdk.foundation.db.h hVarA = com.mbridge.msdk.foundation.db.h.a(this.G);
            if (this.c == null) {
                this.c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.h, this.t);
            }
            return hVarA != null && hVarA.a(this.h, this.c.k());
        } catch (Throwable unused) {
            o0.b("RewardVideoController", "cap check error");
        }
    }

    private void b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f != null) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880001, "");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f.a(strB, cVar);
        }
    }

    public static void a(String str, int i2) {
        try {
            if (X == null || !y0.b(str)) {
                return;
            }
            X.put(str, Integer.valueOf(i2));
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    private CopyOnWriteArrayList<CampaignEx> b(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int vcn = 1;
                    for (CampaignEx campaignEx : list) {
                        if (campaignEx != null) {
                            if (campaignEx.getVcn() > vcn) {
                                vcn = campaignEx.getVcn();
                            }
                            if (campaignEx.getTokenRule() == 1) {
                                String requestId = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId)) {
                                    if (linkedHashMap.containsKey(requestId)) {
                                        List list2 = (List) linkedHashMap.get(requestId);
                                        if (list2 != null) {
                                            list2.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList = new ArrayList();
                                        arrayList.add(campaignEx);
                                        linkedHashMap.put(requestId, arrayList);
                                    }
                                }
                            } else {
                                String requestId2 = campaignEx.getRequestId();
                                if (!TextUtils.isEmpty(requestId2)) {
                                    if (linkedHashMap2.containsKey(requestId2)) {
                                        List list3 = (List) linkedHashMap2.get(requestId2);
                                        if (list3 != null) {
                                            list3.add(campaignEx);
                                        }
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        arrayList2.add(campaignEx);
                                        linkedHashMap2.put(requestId2, arrayList2);
                                    }
                                }
                            }
                        }
                    }
                    if (linkedHashMap2.size() + linkedHashMap.size() >= vcn && linkedHashMap.size() > 0 && linkedHashMap.entrySet() != null && linkedHashMap.entrySet().iterator() != null && linkedHashMap.entrySet().iterator().next() != null && ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue() != null) {
                        copyOnWriteArrayList.addAll((Collection) ((Map.Entry) linkedHashMap.entrySet().iterator().next()).getValue());
                        com.mbridge.msdk.foundation.same.buffer.b.a(this.h, str, vcn);
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e2.getMessage());
                }
            }
        }
        return copyOnWriteArrayList;
    }

    public static void a(String str, String str2) {
        ConcurrentHashMap<String, String> concurrentHashMap;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (concurrentHashMap = Y) == null || concurrentHashMap.containsKey(str)) {
            return;
        }
        Y.put(str, str2);
    }

    public void a() {
        try {
            String str = "";
            MBridgeIds mBridgeIds = this.i;
            if (mBridgeIds != null) {
                if (!this.A) {
                    mBridgeIds.setBidToken("");
                    return;
                }
                String strM = m();
                if (TextUtils.isEmpty(strM)) {
                    return;
                }
                ConcurrentHashMap<String, String> concurrentHashMap = Y;
                if (concurrentHashMap != null && concurrentHashMap.containsKey(strM) && !TextUtils.isEmpty(Y.get(strM))) {
                    str = Y.get(strM);
                }
                this.i.setBidToken(str);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public void a(InterVideoOutListener interVideoOutListener) {
        this.e = interVideoOutListener;
        this.f = new h(this, interVideoOutListener, this.o, this.h, null);
    }

    public void a(boolean z, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        a(z, "", eVar);
    }

    public void a(boolean z, String str, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = b(z, str, eVar);
        if (this.f == null) {
            this.f = new h(this, null, this.o, this.h, null);
        }
        if (this.f != null && this.f.a() == 1) {
            a(z, cVarB);
            return;
        }
        if (this.f != null && this.f.a() == 3) {
            this.H = false;
        } else {
            this.H = true;
            if (this.f != null) {
                this.f.a(1);
            }
        }
        this.x = z;
        this.o.removeMessages(1001001);
        this.K = false;
        this.J = false;
        this.L = false;
        this.M = false;
        x();
        w();
        com.mbridge.msdk.reward.adapter.b.b().c();
        try {
            if (TextUtils.isEmpty(str)) {
                if (this.t) {
                    com.mbridge.msdk.timer.b.getInstance().addInterstitialList(this.l, this.h);
                } else {
                    com.mbridge.msdk.timer.b.getInstance().addRewardList(this.l, this.h);
                }
            }
            if (this.u && TextUtils.isEmpty(str)) {
                a(cVarB);
                return;
            }
            if (com.mbridge.msdk.system.a.map == null) {
                b(cVarB);
                return;
            }
            com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.h);
            this.c = cVarD;
            if (cVarD == null) {
                this.F = com.mbridge.msdk.foundation.controller.c.n().b();
                com.mbridge.msdk.videocommon.setting.b.b().a(this.F, com.mbridge.msdk.foundation.controller.c.n().c(), this.h, new C0227a());
                this.c = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.h, this.t);
            }
            if (!TextUtils.isEmpty(this.l)) {
                this.c.f(this.l);
            }
            int iN = this.c.n() * 1000;
            if (this.o != null) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 1001002;
                if (cVarB != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("metrics_data_lrid", cVarB.o());
                    messageObtain.setData(bundle);
                }
                this.o.sendMessageDelayed(messageObtain, iN);
            }
            this.E = this.c.z();
            try {
                a(z, str, cVarB);
            } catch (Exception e2) {
                if (this.f != null) {
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load exception");
                    if (cVarB != null) {
                        cVarB.a(bVarA);
                        cVarB.b(true);
                    }
                    this.f.a(bVarA, cVarB);
                }
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e2.getMessage());
                }
            }
        } catch (Exception e3) {
            if (this.f != null) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "");
                if (cVarB != null) {
                    cVarB.a(bVarA2);
                    cVarB.b(true);
                }
                this.f.a(bVarA2, cVarB);
            }
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", e3.getMessage());
            }
        }
    }

    private boolean b(String str, String str2) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar = this.b;
            if (cVar == null || !str.equals(cVar.j())) {
                com.mbridge.msdk.reward.adapter.c cVar2 = new com.mbridge.msdk.reward.adapter.c(this.f1772a, this.l, str);
                this.b = cVar2;
                cVar2.d(this.t);
                this.b.e(this.u);
            }
            this.b.a(this.p);
            this.b.a(this.c);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", e2.getMessage());
            }
        }
        List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(str, 1, this.u);
        this.P = com.mbridge.msdk.videocommon.cache.a.a().a(str, 1, this.u);
        if (listB != null && listB.size() > 0) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, listB, str2);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.O;
            if (copyOnWriteArrayList == null) {
                this.O = new CopyOnWriteArrayList<>();
            } else {
                copyOnWriteArrayList.clear();
            }
            for (CampaignEx campaignEx : listB) {
                campaignEx.setLocalRequestId(str2);
                this.O.add(campaignEx);
            }
            a(this.O);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.O;
        if (copyOnWriteArrayList2 == null) {
            return false;
        }
        copyOnWriteArrayList2.clear();
        return false;
    }

    private boolean b() {
        if (this.b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.h);
        if (listA == null || listA.size() <= 0) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.b.c(cVar.a());
                this.b.b(cVar.d());
                if (this.b.m()) {
                    return true;
                }
                com.mbridge.msdk.videocommon.cache.a.a().c(this.h, cVar.a());
            }
        }
        return false;
    }

    private void b(boolean z) {
        List<String> listE;
        if (z) {
            try {
                com.mbridge.msdk.foundation.db.e eVarA = com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(this.f1772a));
                if (eVarA != null && (listE = eVarA.e(this.h)) != null && listE.size() > 0) {
                    Iterator<String> it = listE.iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().c(it.next());
                    }
                }
                LinkedHashMap<String, com.mbridge.msdk.foundation.same.report.metrics.c> linkedHashMapC = com.mbridge.msdk.foundation.same.report.metrics.d.b().c();
                if (linkedHashMapC == null || linkedHashMapC.size() <= 0) {
                    return;
                }
                Iterator<Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c>> it2 = linkedHashMapC.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry<String, com.mbridge.msdk.foundation.same.report.metrics.c> next = it2.next();
                    if (next != null && next.getValue().A()) {
                        it2.remove();
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f != null) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880035, "");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f.a("bidToken is empty", cVar);
        }
    }

    private void a(boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (!this.x) {
            if (z) {
                this.x = z;
            }
        } else if (z) {
            String strB = com.mbridge.msdk.foundation.error.a.b(880016, "errorCode: 3501 errorMessage: current unit is loading");
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880016, "errorCode: 3501 errorMessage: current unit is loading");
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            this.f.b(strB, cVar);
        }
    }

    private void a(boolean z, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.reward.candidate.a aVar;
        com.mbridge.msdk.reward.candidate.a aVar2;
        if (this.f != null) {
            if (!this.u) {
                this.N = b(this.h, cVar.o());
                if (this.N) {
                    if (!c()) {
                        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.O;
                        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                            return;
                        }
                        try {
                            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                            eVar.a("cache", 1);
                            cVar.a("2000127", eVar);
                            cVar.a("2000048", eVar);
                            cVar.a(copyOnWriteArrayList);
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                o0.b("RewardVideoController", e2.getMessage());
                            }
                        }
                        this.f.b(this.l, this.h, cVar);
                        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
                        this.f.a(this.u);
                        com.mbridge.msdk.reward.adapter.c cVar2 = this.b;
                        if (cVar2 != null && cVar2.a(copyOnWriteArrayList, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
                            a(copyOnWriteArrayList);
                            this.f.d(this.l, this.h, cVar);
                        } else {
                            a(copyOnWriteArrayList, this.b);
                        }
                        if (this.H) {
                            com.mbridge.msdk.reward.adapter.c cVar3 = this.b;
                            if (cVar3 != null) {
                                cVar3.c(this.O);
                            }
                            a(this.E, z, str, cVar);
                            return;
                        }
                        return;
                    }
                    o0.a("RewardVideoController", "非BID，本地存在可用的缓存，超过上限");
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.O;
                    if (copyOnWriteArrayList2 != null && copyOnWriteArrayList2.size() > 0) {
                        Iterator<CampaignEx> it = this.O.iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.cache.a.a().a(it.next(), this.h);
                        }
                    }
                    com.mbridge.msdk.reward.adapter.c cVar4 = this.b;
                    if (cVar4 != null) {
                        cVar4.c(this.O);
                    }
                    if (z) {
                        if (this.f != null) {
                            String strB = com.mbridge.msdk.foundation.error.a.b(880019, "");
                            cVar.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                            cVar.b(true);
                            this.f.a(strB, cVar);
                            return;
                        }
                        return;
                    }
                    this.N = false;
                    this.f.a(this.u);
                    a(this.E, z, str, cVar);
                    return;
                }
                if (!c()) {
                    this.N = false;
                    com.mbridge.msdk.reward.adapter.c cVar5 = this.b;
                    if (cVar5 != null) {
                        cVar5.c(this.O);
                    }
                    this.f.a(this.u);
                    a(this.E, z, str, cVar);
                    return;
                }
                if (z) {
                    if (this.f != null) {
                        String strB2 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                        cVar.a(com.mbridge.msdk.foundation.error.a.a(880019, ""));
                        cVar.b(true);
                        this.f.a(strB2, cVar);
                        return;
                    }
                    return;
                }
                this.N = false;
                com.mbridge.msdk.reward.adapter.c cVar6 = this.b;
                if (cVar6 != null) {
                    cVar6.c(this.O);
                }
                this.f.a(this.u);
                a(this.E, z, str, cVar);
                return;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.cache.a.a().b(this.h, 1, this.u, "");
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB2 = null;
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                if (!c()) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListA = a(str, copyOnWriteArrayListB);
                    if (copyOnWriteArrayListA != null && copyOnWriteArrayListA.size() > 0) {
                        a(copyOnWriteArrayListA, str, cVar);
                        return;
                    }
                    try {
                        com.mbridge.msdk.reward.candidate.a aVar3 = new com.mbridge.msdk.reward.candidate.a(this.h, this.t);
                        com.mbridge.msdk.foundation.cache.c cVar7 = new com.mbridge.msdk.foundation.cache.c();
                        if (aVar3.a(str)) {
                            if (this.b == null) {
                                com.mbridge.msdk.reward.adapter.c cVar8 = new com.mbridge.msdk.reward.adapter.c(this.f1772a, this.l, this.h);
                                this.b = cVar8;
                                cVar8.d(this.t);
                                this.b.e(this.u);
                                if (this.t) {
                                    this.b.a(this.q, this.r, this.s);
                                }
                                this.b.a(this.p);
                                this.b.a(this.c);
                            }
                            aVar2 = aVar3;
                            cVar7 = aVar3.a(str, cVar, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.b);
                            if (cVar7 != null && cVar7.g() == com.mbridge.msdk.foundation.cache.c.l && cVar7.c() != null && cVar7.c().size() > 0 && this.b != null) {
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC = cVar7.c();
                                ArrayList arrayList = new ArrayList();
                                for (CampaignEx campaignEx2 : copyOnWriteArrayListB) {
                                    if (campaignEx2 != null) {
                                        String requestId = campaignEx2.getRequestId();
                                        if (!TextUtils.isEmpty(requestId)) {
                                            for (int i2 = 0; i2 < copyOnWriteArrayListC.size(); i2++) {
                                                CampaignEx campaignEx3 = copyOnWriteArrayListC.get(i2);
                                                if (campaignEx3 != null) {
                                                    if (requestId.equals(campaignEx3.getRequestId())) {
                                                        break;
                                                    } else if (i2 == copyOnWriteArrayListC.size() - 1) {
                                                        arrayList.add(campaignEx2);
                                                    }
                                                }
                                            }
                                            if (copyOnWriteArrayListC.size() != 0) {
                                                break;
                                            }
                                            arrayList.add(campaignEx2);
                                            break;
                                        }
                                    }
                                }
                                this.b.c(arrayList);
                                this.b.a(cVar7.c(), false, true);
                                copyOnWriteArrayListB2 = new CopyOnWriteArrayList<>(cVar7.c());
                            }
                        } else {
                            aVar2 = aVar3;
                            copyOnWriteArrayListB2 = b(str, copyOnWriteArrayListB);
                            if (copyOnWriteArrayListB2.size() > 0) {
                                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, copyOnWriteArrayListB2);
                            }
                            cVar7.d("cb is closed");
                            cVar7.a(com.mbridge.msdk.foundation.cache.c.k);
                        }
                        aVar2.a(cVar, str, cVar7, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 1);
                        if (copyOnWriteArrayListB2 != null && copyOnWriteArrayListB2.size() > 0) {
                            a(copyOnWriteArrayListB2, str, cVar);
                            if (this.b != null && !aVar2.a(str)) {
                                this.b.c(copyOnWriteArrayListB2);
                            }
                        }
                    } catch (Exception e3) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("RewardVideoController", e3.getMessage());
                        }
                    }
                    this.N = false;
                    this.f.a(this.u);
                    a(this.E, z, str, cVar);
                    return;
                }
                com.mbridge.msdk.videocommon.cache.a.a().a(this.h, str);
                if (!z || this.f == null) {
                    return;
                }
                String strB3 = com.mbridge.msdk.foundation.error.a.b(880019, "");
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880019, "");
                if (cVar != null) {
                    cVar.a(bVarA);
                    cVar.b(true);
                }
                this.f.a(strB3, cVar);
                return;
            }
            if (!c()) {
                try {
                    com.mbridge.msdk.reward.candidate.a aVar4 = new com.mbridge.msdk.reward.candidate.a(this.h, this.t);
                    com.mbridge.msdk.foundation.cache.c cVar9 = new com.mbridge.msdk.foundation.cache.c();
                    if (aVar4.a(str)) {
                        if (this.b == null) {
                            com.mbridge.msdk.reward.adapter.c cVar10 = new com.mbridge.msdk.reward.adapter.c(this.f1772a, this.l, this.h);
                            this.b = cVar10;
                            cVar10.d(this.t);
                            this.b.e(this.u);
                            if (this.t) {
                                this.b.a(this.q, this.r, this.s);
                            }
                            this.b.a(this.p);
                            this.b.a(this.c);
                        }
                        aVar = aVar4;
                        cVar9 = aVar4.a(str, cVar, (CampaignEx) null, new com.mbridge.msdk.foundation.error.b(880038), 1, this.b);
                        if (cVar9 != null && cVar9.g() == com.mbridge.msdk.foundation.cache.c.l && cVar9.c() != null && cVar9.c().size() > 0 && this.b != null) {
                            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListC2 = cVar9.c();
                            if (copyOnWriteArrayListB != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (CampaignEx campaignEx4 : copyOnWriteArrayListB) {
                                    if (campaignEx4 != null) {
                                        String requestId2 = campaignEx4.getRequestId();
                                        if (!TextUtils.isEmpty(requestId2)) {
                                            for (int i3 = 0; i3 < copyOnWriteArrayListC2.size(); i3++) {
                                                CampaignEx campaignEx5 = copyOnWriteArrayListC2.get(i3);
                                                if (campaignEx5 != null) {
                                                    if (requestId2.equals(campaignEx5.getRequestId())) {
                                                        break;
                                                    } else if (i3 == copyOnWriteArrayListC2.size() - 1) {
                                                        arrayList2.add(campaignEx4);
                                                    }
                                                }
                                            }
                                            if (copyOnWriteArrayListC2.size() != 0) {
                                                break;
                                            }
                                            arrayList2.add(campaignEx4);
                                            break;
                                        }
                                    }
                                }
                                this.b.c(arrayList2);
                            }
                            this.b.a(cVar9.c(), false, true);
                            copyOnWriteArrayListB2 = new CopyOnWriteArrayList<>(cVar9.c());
                        }
                    } else {
                        aVar = aVar4;
                        copyOnWriteArrayListB2 = b(str, copyOnWriteArrayListB);
                        if (copyOnWriteArrayListB2.size() > 0) {
                            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(str, copyOnWriteArrayListB2);
                        }
                        cVar9.d("cb is closed 2");
                        cVar9.a(com.mbridge.msdk.foundation.cache.c.k);
                    }
                    aVar.a(cVar, str, cVar9, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 1);
                    if (copyOnWriteArrayListB2 != null && copyOnWriteArrayListB2.size() > 0) {
                        a(copyOnWriteArrayListB2, str, cVar);
                        if (this.b != null && !aVar.a(str)) {
                            this.b.c(copyOnWriteArrayListB2);
                        }
                    }
                } catch (Exception e4) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardVideoController", e4.getMessage());
                    }
                }
                this.N = false;
                this.f.a(this.u);
                a(this.E, z, str, cVar);
                return;
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.h, str);
            if (!z || this.f == null) {
                return;
            }
            String strB4 = com.mbridge.msdk.foundation.error.a.b(880019, "");
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880019, "");
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.b(true);
            }
            this.f.a(strB4, cVar);
        }
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            cVar.a("2000127", eVar);
            cVar.a("2000048", eVar);
            cVar.a(copyOnWriteArrayList);
        } catch (Exception e2) {
            o0.b("RewardVideoController", e2.getMessage());
        }
        this.N = true;
        this.f.a(this.u);
        this.f.b(this.l, this.h, cVar);
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        a(campaignEx.getRequestId(), str);
        com.mbridge.msdk.reward.adapter.c cVar2 = this.b;
        if (cVar2 != null && cVar2.a(copyOnWriteArrayList, true ^ TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt())) {
            a(copyOnWriteArrayList);
            this.f.d(this.l, this.h, cVar);
        } else {
            a(copyOnWriteArrayList, this.b);
        }
    }

    private CopyOnWriteArrayList<CampaignEx> a(String str, List<CampaignEx> list) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (list != null && list.size() > 0 && !TextUtils.isEmpty(str)) {
            for (CampaignEx campaignEx : list) {
                if (campaignEx != null && str.equals(campaignEx.getBidToken())) {
                    copyOnWriteArrayList.add(campaignEx);
                }
            }
        }
        return copyOnWriteArrayList;
    }

    private void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.reward.adapter.c cVar) {
        CampaignEx campaignEx = copyOnWriteArrayList.get(0);
        boolean z = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.Q = false;
        this.R = false;
        this.S = false;
        this.T = false;
        this.U = false;
        com.mbridge.msdk.reward.adapter.b.b().a(this.f1772a, z, nscpt, this.u, this.t ? 287 : 94, this.l, this.h, campaignEx.getRequestId(), copyOnWriteArrayList, new b(campaignEx, z, cVar, nscpt), new c(campaignEx, copyOnWriteArrayList, z, nscpt));
        if (z) {
            com.mbridge.msdk.reward.adapter.b.b().a(this.f1772a, campaignEx, this.l, this.h, campaignEx.getRequestId(), new d(campaignEx, copyOnWriteArrayList, cVar, z, nscpt));
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0020  */
    private void a(Queue<Integer> queue, boolean z, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        Integer numPoll;
        int iIntValue;
        if (queue != null) {
            try {
                if (queue.size() <= 0 || (numPoll = queue.poll()) == null) {
                    iIntValue = 25;
                } else {
                    iIntValue = numPoll.intValue();
                }
            } catch (Exception e2) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + e2.getMessage());
                if (cVar != null) {
                    cVar.a(bVarA);
                    cVar.b(true);
                }
                a(bVarA, cVar);
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e2.getMessage());
                    return;
                }
                return;
            }
        } else {
            iIntValue = 25;
        }
        try {
            a(1, iIntValue, z, str, cVar);
        } catch (Exception e3) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880020, "load mv api error:" + e3.getMessage());
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.b(true);
            }
            a(bVarA2, cVar);
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", e3.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.f != null) {
            this.M = true;
            this.f.a(bVar, cVar);
        }
    }

    public void a(int i2, int i3, boolean z, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.reward.adapter.c cVar2 = this.b;
            if (cVar2 == null || !this.h.equals(cVar2.j())) {
                com.mbridge.msdk.reward.adapter.c cVar3 = new com.mbridge.msdk.reward.adapter.c(this.f1772a, this.l, this.h);
                this.b = cVar3;
                cVar3.d(this.t);
                this.b.e(this.u);
            }
            if (this.t) {
                this.b.a(this.q, this.r, this.s);
            }
            this.b.a(this.p);
            this.b.a(this.c);
            f fVar = new f(this.b, i2, z, str, cVar);
            fVar.a(i3);
            g gVar = new g(this.b, z);
            this.j = gVar;
            gVar.a(fVar);
            this.b.a(this.j);
            this.b.a(i2, i3, z, str, this.y, cVar);
            this.o.postDelayed(fVar, i3 * 1000);
        } catch (Exception e2) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880020, e2.getMessage());
            if (cVar != null) {
                cVar.a(bVarA);
                cVar.b(true);
            }
            a(bVarA, cVar);
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", e2.getMessage());
            }
        }
    }

    private void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        boolean zL;
        boolean zM;
        try {
            if (this.b == null) {
                f();
            }
            if (this.b != null) {
                o0.b("RewardVideoController", "controller 819");
                if (this.u) {
                    zL = a(false);
                } else {
                    zL = this.b.l();
                }
                C0227a c0227a = null;
                if (zL) {
                    o0.c("RewardVideoController", "invoke adapter show isReady");
                    i iVar = new i(this, this, this.o, c0227a);
                    Z.put(this.h, iVar);
                    this.b.a(iVar, str, this.g, this.p, this.k, cVar);
                    this.C = false;
                    return;
                }
                if (this.u) {
                    zM = b();
                } else {
                    zM = this.b.m();
                }
                if (zM) {
                    o0.c("RewardVideoController", "invoke adapter show isSpareOfferReady");
                    i iVar2 = new i(this, this, this.o, c0227a);
                    Z.put(this.h, iVar2);
                    this.b.a(iVar2, str, this.g, this.p, this.k, cVar);
                    this.C = false;
                    return;
                }
            }
            this.C = false;
            a("2000131", cVar, this.e, "can't show because load is failed");
            if (this.e != null) {
                try {
                    this.e.onShowFail(cVar, this.i, "can't show because load is failed");
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardVideoController", e2.getMessage());
                    }
                }
            }
            if (this.t || this.u || (cVar3 = this.c) == null || !cVar3.a(4) || this.f == null || this.f.a() == 1 || this.f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.h, true, 1));
        } catch (Exception e3) {
            this.C = false;
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", e3.getLocalizedMessage());
            }
            a("2000131", cVar, this.e, "show exception");
            if (this.e != null) {
                try {
                    this.e.onShowFail(cVar, this.i, "show exception");
                } catch (Exception unused) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardVideoController", e3.getMessage());
                    }
                }
            }
            if (this.t || this.u || (cVar2 = this.c) == null || !cVar2.a(4) || this.f == null || this.f.a() == 1 || this.f.a() == 3) {
                return;
            }
            a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.h, true, 1));
        }
    }

    private boolean a(boolean z) {
        if (z) {
            d("is_ready_start", "");
        }
        if (this.b == null) {
            f();
        }
        List<com.mbridge.msdk.foundation.entity.c> listA = com.mbridge.msdk.videocommon.cache.a.a().a(this.h);
        if (listA == null || listA.size() <= 0) {
            if (!z) {
                return false;
            }
            d("is_ready_ctir_false", "no effective campaign list");
            return false;
        }
        String strD = com.mbridge.msdk.foundation.same.buffer.b.d(this.h);
        boolean zA = TextUtils.isEmpty(strD) ? false : a(listA, strD);
        if (z) {
            d("is_ready_ctir_" + zA, "");
        }
        if (zA) {
            return zA;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : listA) {
            if (cVar != null) {
                this.b.c(cVar.a());
                this.b.b(cVar.d());
                if (this.b.b(z)) {
                    return true;
                }
            }
        }
        return zA;
    }

    private boolean a(List<com.mbridge.msdk.foundation.entity.c> list, String str) {
        if (list == null) {
            return false;
        }
        for (com.mbridge.msdk.foundation.entity.c cVar : list) {
            if (cVar != null && str.equals(cVar.b())) {
                this.b.c(cVar.a());
                this.b.b(cVar.d());
                if (this.b.l()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:129:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public void a(String str, String str2, String str3, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.videocommon.setting.c cVar;
        com.mbridge.msdk.videocommon.setting.c cVar2;
        com.mbridge.msdk.videocommon.setting.c cVar3;
        com.mbridge.msdk.videocommon.setting.c cVar4;
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(eVar);
        try {
            this.m = str;
            this.g = str2;
            this.k = str3;
            synchronized (this.B) {
                if (this.C) {
                    a("2000131", cVarA, this.e, "campaing is show progressing ");
                    if (this.e != null) {
                        try {
                            this.e.onShowFail(cVarA, this.i, "campaing is show progressing ");
                        } catch (Exception e2) {
                            if (MBridgeConstans.DEBUG) {
                                o0.b("RewardVideoController", e2.getMessage());
                            }
                        }
                    }
                    return;
                }
                this.C = true;
                Context context = this.f1772a;
                if (context == null) {
                    a("2000131", cVarA, this.e, "context is null");
                    if (this.e != null) {
                        try {
                            this.e.onShowFail(cVarA, this.i, "context is null");
                        } catch (Exception e3) {
                            if (MBridgeConstans.DEBUG) {
                                o0.b("RewardVideoController", e3.getMessage());
                            }
                        }
                    }
                    if (!this.t && !this.u && (cVar4 = this.c) != null && cVar4.a(4) && this.f != null && this.f.a() != 1 && this.f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.h, true, 1));
                    }
                    this.C = false;
                    return;
                }
                if (this.t && !t0.m(context) && q0.a().a("s_a_w_n_c", true)) {
                    a("2000131", cVarA, this.e, "network exception");
                    if (this.e != null) {
                        try {
                            this.e.onShowFail(cVarA, this.i, "network exception");
                        } catch (Exception e4) {
                            if (MBridgeConstans.DEBUG) {
                                o0.b("RewardVideoController", e4.getMessage());
                            }
                        }
                    }
                    if (!this.t && !this.u && (cVar3 = this.c) != null && cVar3.a(4) && this.f != null && this.f.a() != 1 && this.f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.h, true, 1));
                    }
                    this.C = false;
                    return;
                }
                if (c()) {
                    a("2000131", cVarA, this.e, "Play more than limit");
                    if (this.e != null) {
                        try {
                            this.e.onShowFail(cVarA, this.i, "Play more than limit");
                        } catch (Exception e5) {
                            if (MBridgeConstans.DEBUG) {
                                o0.b("RewardVideoController", e5.getMessage());
                            }
                        }
                    }
                    if (!this.t && !this.u && (cVar2 = this.c) != null && cVar2.a(4) && this.f != null && this.f.a() != 1 && this.f.a() != 3) {
                        a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.h, true, 1));
                    }
                    this.C = false;
                    return;
                }
                if (TextUtils.isEmpty(this.g)) {
                    this.g = com.mbridge.msdk.foundation.tools.f.d();
                }
                try {
                    String str4 = new SimpleDateFormat("dd").format(new Date());
                    String str5 = (String) w0.a(this.f1772a, "reward_date", "0");
                    if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str4) && !str5.equals(str4)) {
                        w0.b(this.f1772a, "reward_date", str4);
                    }
                } catch (Exception e6) {
                    if (MBridgeConstans.DEBUG) {
                        o0.b("RewardVideoController", e6.getMessage());
                    }
                }
                a(str, cVarA);
                return;
                this.C = false;
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e.getLocalizedMessage());
                }
                a("2000131", cVarA, this.e, "show exception");
                if (this.e != null) {
                    try {
                        this.e.onShowFail(cVarA, this.i, "show exception");
                    } catch (Exception unused) {
                        if (MBridgeConstans.DEBUG) {
                            o0.b("RewardVideoController", e.getMessage());
                        }
                    }
                }
                if (!this.t || this.u || (cVar = this.c) == null || !cVar.a(4) || this.f == null || this.f.a() == 1 || this.f.a() == 3) {
                    return;
                }
                a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, 94, this.h, true, 1));
            }
        } catch (Exception e7) {
            this.C = false;
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardVideoController", e7.getLocalizedMessage());
            }
            a("2000131", cVarA, this.e, "show exception");
            if (this.e != null) {
                this.e.onShowFail(cVarA, this.i, "show exception");
            }
            if (this.t) {
            }
        }
    }

    private com.mbridge.msdk.foundation.same.report.metrics.c a(com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar;
        CampaignEx campaignEx;
        try {
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.h);
            String currentLocalRid = "";
            if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                currentLocalRid = campaignEx.getCurrentLocalRid();
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = TextUtils.isEmpty(currentLocalRid) ? null : com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(currentLocalRid);
            if (cVar2 != null) {
                cVar2.b(copyOnWriteArrayListB);
                cVar2.a("2000128", eVar);
                cVar2.h(currentLocalRid);
                cVar2.m(this.h);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar2);
                return cVar2;
            }
            cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
            try {
                cVar.m(this.h);
                eVar.a("metrics_data_reason", "未获取到待展示的campaign信息 本地new metricsData");
                cVar.a("2000128", eVar);
                if (TextUtils.isEmpty(currentLocalRid)) {
                    cVar.h(SameMD5.getMD5(t0.d()));
                } else {
                    cVar.h(currentLocalRid);
                    cVar.b(copyOnWriteArrayListB);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(currentLocalRid, cVar);
                }
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000128", cVar);
            } catch (Exception e2) {
                e = e2;
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardVideoController", e.getMessage());
                }
            }
            return cVar;
        } catch (Exception e3) {
            e = e3;
            cVar = null;
        }
    }

    public void a(List<CampaignEx> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        this.D = list;
    }

    private String a(String str) {
        String md5 = "";
        try {
            if (TextUtils.isEmpty(str)) {
                md5 = SameMD5.getMD5(t0.d());
            }
            String[] strArrSplit = str.split("_");
            if (strArrSplit != null && strArrSplit.length >= 3) {
                md5 = strArrSplit[2];
            }
            return TextUtils.isEmpty(md5) ? SameMD5.getMD5(t0.d()) : md5;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return "";
            }
            e2.printStackTrace();
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001f  */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA;
        if (message != null) {
            try {
                Bundle data = message.getData();
                if (data != null) {
                    cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(data.getString("metrics_data_lrid"));
                } else {
                    cVarA = null;
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else {
            cVarA = null;
        }
        return cVarA == null ? new com.mbridge.msdk.foundation.same.report.metrics.c() : cVarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener) {
        if (this.x) {
            if (cVar == null) {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.D);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (interVideoOutListener != null) {
                    eVar.a("listener_state", 1);
                } else {
                    eVar.a("listener_state", 2);
                }
                cVar.a(str, eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar, InterVideoOutListener interVideoOutListener, String str2) {
        if (cVar == null) {
            try {
                cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                cVar.b(this.D);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (!TextUtils.isEmpty(str2)) {
            eVar.a("reason", str2);
        }
        if (interVideoOutListener != null) {
            eVar.a("listener_state", 1);
        } else {
            eVar.a("listener_state", 2);
        }
        cVar.a(str, eVar);
        com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:17:0x0040 A[Catch: Exception -> 0x002b, TryCatch #0 {Exception -> 0x002b, blocks: (B:4:0x0009, B:6:0x000f, B:8:0x0016, B:12:0x002f, B:14:0x0039, B:17:0x0040, B:21:0x0075, B:23:0x0088, B:25:0x0096), top: B:31:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:20:0x0073  */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        String nLRid;
        String str;
        int i2;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
        String localRequestId = "";
        if (list == null) {
            str = "";
            if (TextUtils.isEmpty(localRequestId)) {
                return cVar;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
            eVar.a("auto_load", 2);
            cVar2.a("2000127", eVar);
            cVar2.a("2000048", eVar);
            if (this.t) {
                i2 = 287;
            } else {
                i2 = 94;
            }
            cVar2.a(i2);
            cVar2.g("1");
            cVar2.e("2");
            if (!TextUtils.isEmpty(str)) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str, cVar2);
            }
        } else {
            try {
                if (list.size() <= 0) {
                    str = "";
                } else {
                    if (list.get(0) == null) {
                        nLRid = "";
                    } else {
                        localRequestId = list.get(0).getLocalRequestId();
                        nLRid = list.get(0).getNLRid();
                    }
                    cVar2.h(localRequestId);
                    cVar2.b(list);
                    str = localRequestId;
                    localRequestId = nLRid;
                }
                if (TextUtils.isEmpty(localRequestId)) {
                    return cVar;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar2.a("cache", 1);
                eVar2.a(CampaignEx.JSON_KEY_HB, 1);
                eVar2.a("auto_load", 2);
                cVar2.a("2000127", eVar2);
                cVar2.a("2000048", eVar2);
                if (this.t) {
                    i2 = 287;
                } else {
                    i2 = 94;
                }
                cVar2.a(i2);
                cVar2.g("1");
                cVar2.e("2");
                if (!TextUtils.isEmpty(str) && !com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(str)) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(str, cVar2);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        return cVar2;
    }
}
