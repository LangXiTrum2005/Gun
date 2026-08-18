package com.mbridge.msdk.reward.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.reward.player.MBRewardVideoActivity;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {
    private String B;
    private h C;
    private List<CampaignEx> S;
    private CopyOnWriteArrayList<CampaignEx> T;
    private List<CampaignEx> U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1752a;
    private String b;
    private String c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private String h;
    private com.mbridge.msdk.video.bt.module.orglistener.h i;
    private volatile com.mbridge.msdk.reward.adapter.a j;
    private com.mbridge.msdk.videocommon.setting.c k;
    private boolean q;
    private boolean r;
    private String t;
    private int u;
    private int v;
    private int w;
    private CampaignUnit x;
    private CopyOnWriteArrayList<CampaignEx> y;
    private boolean l = false;
    private boolean m = false;
    public Object n = new Object();
    private CopyOnWriteArrayList<CampaignEx> o = new CopyOnWriteArrayList<>();
    private int p = 2;
    private String s = "";
    private boolean z = false;
    private long A = 0;
    private boolean D = false;
    private boolean E = false;
    public String F = "";
    public String G = "";
    public String H = "";
    private Handler I = new a(Looper.getMainLooper());
    private boolean J = false;
    private long K = 0;
    volatile boolean L = false;
    volatile boolean M = false;
    volatile boolean N = false;
    volatile boolean O = false;
    volatile boolean P = false;
    public volatile boolean Q = false;
    private String R = "";

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Code duplicated, block: B:93:0x025d  */
        /* JADX WARN: Code duplicated, block: B:94:0x025f  */
        /* JADX WARN: Code duplicated, block: B:98:0x028f  */
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            com.mbridge.msdk.foundation.error.b bVarA;
            boolean z;
            CampaignEx campaignEx;
            com.mbridge.msdk.foundation.same.report.metrics.c cVarA = c.this.a(message);
            try {
                try {
                    switch (message.what) {
                        case 1:
                        case 2:
                            c.this.a((String) message.obj, cVarA);
                            break;
                        case 3:
                            if (c.this.j != null) {
                                c.this.j.a("campaign is ok", cVarA);
                            }
                            Message message2 = new Message();
                            message2.what = 5;
                            if (cVarA != null) {
                                Bundle bundle = new Bundle();
                                bundle.putString("metrics_data_lrid", cVarA.o());
                                message2.setData(bundle);
                            }
                            sendMessageDelayed(message2, com.mbridge.msdk.foundation.same.a.L);
                            break;
                        case 4:
                            if (c.this.j != null) {
                                c cVar = c.this;
                                cVar.a(cVar.b, (List<CampaignEx>) c.this.S, c.this.r, "");
                                try {
                                    com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880002, "unknow error in load failed");
                                    Object obj = message.obj;
                                    if (obj == null) {
                                        if (c.this.I != null) {
                                            c.this.I.removeMessages(5);
                                        }
                                        removeMessages(6);
                                        o0.a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================00000");
                                        if (!c.this.P) {
                                            c.this.P = true;
                                            bVarA = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3506 errorMessage: data load failed");
                                            bVarA2 = bVarA;
                                        }
                                    } else {
                                        String str = (String) obj;
                                        int i = message.arg1;
                                        if (TextUtils.isEmpty(str)) {
                                            if (c.this.I != null) {
                                                c.this.I.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            o0.a("RewardMVVideoAdapter", "=====================onVideoLoadFail=====================11111");
                                            if (!c.this.P) {
                                                c.this.P = true;
                                                bVarA = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg null");
                                            }
                                        } else {
                                            if (c.this.I != null) {
                                                c.this.I.removeMessages(5);
                                            }
                                            removeMessages(6);
                                            bVarA = i == 880021 ? com.mbridge.msdk.foundation.error.a.a(880021, "errorCode: 3507 errorMessage: data load failed, errorMsg is APP ALREADY INSTALLED") : (i == 880003 || i == 6 || i == 7) ? com.mbridge.msdk.foundation.error.a.a(880003, "errorCode: 3507 errorMessage: data load failed, errorMsg is ".concat(str)) : com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3507 errorMessage: data load failed, errorMsg is ".concat(str));
                                        }
                                        bVarA2 = bVarA;
                                    }
                                    c.this.P = true;
                                    if (cVarA != null) {
                                        cVarA.b(c.this.S);
                                        if (cVarA.p() == null) {
                                            cVarA.a(bVarA2);
                                        } else {
                                            bVarA2 = cVarA.p();
                                        }
                                    }
                                    c.this.j.a(c.this.S, bVarA2, cVarA);
                                } catch (Exception e) {
                                    if (c.this.I != null) {
                                        c.this.I.removeMessages(5);
                                    }
                                    removeMessages(6);
                                    c cVar2 = c.this;
                                    cVar2.a(cVar2.b, (List<CampaignEx>) c.this.S, c.this.r, "");
                                    com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880002, "errorCode: 3508 errorMessage: data load failed, exception is: " + e.getMessage());
                                    if (cVarA != null) {
                                        cVarA.b(c.this.S);
                                        cVarA.a(bVarA3);
                                    }
                                    c.this.j.a(c.this.S, bVarA3, cVarA);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (c.this.j != null) {
                                if (c.this.S != null && c.this.S.size() > 0) {
                                    CampaignEx campaignEx2 = (CampaignEx) c.this.S.get(0);
                                    boolean z2 = !TextUtils.isEmpty(campaignEx2.getCMPTEntryUrl());
                                    int nscpt = campaignEx2.getNscpt();
                                    c cVar3 = c.this;
                                    if (cVar3.a((List<CampaignEx>) cVar3.y, z2, nscpt, true, false)) {
                                        c cVar4 = c.this;
                                        cVar4.a(cVar4.b, (List<CampaignEx>) c.this.S, (List<CampaignEx>) c.this.U, c.this.r);
                                        sendEmptyMessage(6);
                                        removeMessages(5);
                                        if (!c.this.O) {
                                            c.this.O = true;
                                            c.this.j.a(c.this.y, cVarA);
                                        }
                                    }
                                }
                                c cVar5 = c.this;
                                cVar5.a(cVar5.b, (List<CampaignEx>) c.this.S, c.this.r, "");
                                if (c.this.I != null) {
                                    c.this.I.removeMessages(5);
                                    c.this.I.removeMessages(6);
                                }
                                CampaignEx campaignEx3 = (c.this.S == null || c.this.S.size() <= 0) ? null : (CampaignEx) c.this.S.get(0);
                                if (campaignEx3 == null && c.this.T != null && c.this.T.size() > 0) {
                                    campaignEx3 = (CampaignEx) c.this.T.get(0);
                                }
                                if (!c.this.P || (c.this.Q && campaignEx3 != null && !TextUtils.isEmpty(campaignEx3.getNLRid()))) {
                                    com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880010, "errorCode: 3401 errorMessage: resource load timeout");
                                    c.this.P = true;
                                    if (cVarA != null) {
                                        cVarA.a(bVarA4);
                                    }
                                    c.this.j.a(c.this.S, bVarA4, cVarA);
                                    if (c.this.y != null && c.this.y.size() > 0) {
                                        boolean z3 = false;
                                        for (CampaignEx campaignEx4 : c.this.y) {
                                            if (campaignEx4 != null) {
                                                try {
                                                    if (!TextUtils.isEmpty(campaignEx4.getVideoUrlEncode()) && !ResDownloadCheckManager.getInstance().containsVideoKey(campaignEx4.getVideoUrlEncode())) {
                                                        z = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getendcard_url()) && !ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getendcard_url())) {
                                                        z = true;
                                                    }
                                                    if (campaignEx4 != null && !TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl())) {
                                                        if (!ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                            z = true;
                                                        } else if (!z3 && !z) {
                                                            if (com.mbridge.msdk.videocommon.a.b(c.this.b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                                z3 = true;
                                                            }
                                                        }
                                                    }
                                                    if (campaignEx4 != null && campaignEx4.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx4.getRewardTemplateMode().e()) && !campaignEx4.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) && ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getRewardTemplateMode().e()) && TextUtils.isEmpty(campaignEx4.getCMPTEntryUrl()) && !z) {
                                                        com.mbridge.msdk.videocommon.a.a(campaignEx4.getAdType(), campaignEx4);
                                                    }
                                                } catch (Exception e2) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        o0.b("RewardMVVideoAdapter", e2.getMessage());
                                                    }
                                                }
                                            }
                                            z = false;
                                            if (campaignEx4 != null) {
                                                z = true;
                                            }
                                            if (campaignEx4 != null) {
                                                if (!ResDownloadCheckManager.getInstance().containsZipKey(campaignEx4.getCMPTEntryUrl())) {
                                                    z = true;
                                                } else if (!z3) {
                                                    if (com.mbridge.msdk.videocommon.a.b(c.this.b + "_" + campaignEx4.getRequestId() + "_" + campaignEx4.getCMPTEntryUrl()) == null) {
                                                        z3 = true;
                                                    }
                                                }
                                            }
                                            if (campaignEx4 != null) {
                                                com.mbridge.msdk.videocommon.a.a(campaignEx4.getAdType(), campaignEx4);
                                            }
                                        }
                                        break;
                                    }
                                }
                            }
                            break;
                        case 6:
                            c cVar6 = c.this;
                            cVar6.a(cVar6.b, (List<CampaignEx>) c.this.S, (List<CampaignEx>) c.this.U, c.this.r);
                            if (c.this.j != null) {
                                removeMessages(6);
                                if (c.this.I != null) {
                                    c.this.I.removeMessages(5);
                                }
                                if (c.this.j != null && !c.this.O) {
                                    c.this.O = true;
                                    c.this.j.a(c.this.y, cVarA);
                                    break;
                                }
                            }
                            break;
                        case 8:
                            if (c.this.j != null && (campaignEx = (CampaignEx) message.obj) != null && !TextUtils.isEmpty(c.this.b)) {
                                com.mbridge.msdk.reward.report.a.a(c.this.f1752a, campaignEx, c.this.b);
                                c.this.l();
                                break;
                            }
                            break;
                    }
                } catch (Throwable th) {
                    o0.a("RewardMVVideoAdapter", th.getMessage());
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
    }

    public class b extends com.mbridge.msdk.reward.request.a {
        final /* synthetic */ com.mbridge.msdk.foundation.same.report.metrics.c e;

        public b(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.e = cVar;
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void a(CampaignUnit campaignUnit) throws Throwable {
            CampaignEx campaignEx;
            try {
                c.this.c(campaignUnit);
                c.this.a(campaignUnit);
                if (campaignUnit != null) {
                    c.this.F = campaignUnit.getRequestId();
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
                if (c.this.y != null && c.this.y.size() > 0 && (campaignEx = (CampaignEx) c.this.y.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                    c.this.y.clear();
                }
                if (c.this.S != null) {
                    c.this.S.clear();
                }
                c.this.L = false;
                c.this.M = false;
                synchronized (c.this.n) {
                    try {
                        if (c.this.N) {
                            c.this.N = false;
                        }
                        c.this.P = false;
                        c.this.O = false;
                        c.this.b("exception after load success", this.e);
                        c.this.n();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.reward.request.a
        public void b(int i, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            CampaignEx campaignEx;
            if (i == -1) {
                c.this.A = System.currentTimeMillis();
            }
            if (c.this.y != null && c.this.y.size() > 0 && (campaignEx = (CampaignEx) c.this.y.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
                c.this.y.clear();
            }
            if (c.this.S != null) {
                c.this.S.clear();
            }
            c.this.L = false;
            c.this.M = false;
            synchronized (c.this.n) {
                try {
                    if (c.this.N) {
                        c.this.N = false;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c.this.a(cVar, i);
            c.this.P = false;
            c.this.O = false;
            if (!c.this.J) {
                c.this.a(i, str, cVar);
            }
            c.this.n();
        }
    }

    public class d implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f1760a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1761a;
            final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

            public a(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f1761a = str;
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.b, (List<CampaignEx>) c.this.S, c.this.r, this.f1761a);
                if (c.this.I != null) {
                    c.this.I.removeMessages(5);
                }
                if (c.this.P || c.this.j == null) {
                    return;
                }
                c.this.P = true;
                com.mbridge.msdk.foundation.error.b bVar = this.b;
                if (bVar != null) {
                    bVar.d("errorCode: 3202 errorMessage: temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f1760a == null) {
                    dVar.f1760a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f1760a.b(c.this.y);
                d.this.f1760a.a(this.b);
                c.this.j.a(c.this.S, this.b, d.this.f1760a);
                o0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板 onVideoLoadFail");
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1762a;
            final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

            public b(String str, com.mbridge.msdk.foundation.error.b bVar) {
                this.f1762a = str;
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.b, (List<CampaignEx>) c.this.S, c.this.r, this.f1762a);
                if (c.this.I != null) {
                    c.this.I.removeMessages(5);
                }
                if (c.this.P || c.this.j == null) {
                    return;
                }
                c.this.P = true;
                com.mbridge.msdk.foundation.error.b bVar = this.b;
                if (bVar != null) {
                    bVar.d("errorCode: 3203 errorMessage: tpl temp resource download failed");
                }
                d dVar = d.this;
                if (dVar.f1760a == null) {
                    dVar.f1760a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                d dVar2 = d.this;
                dVar2.f1760a.b(c.this.y);
                d.this.f1760a.a(this.b);
                c.this.j.a(c.this.S, this.b, d.this.f1760a);
                o0.a("RewardMVVideoAdapter", "播放模板下载失败，大模板，nscpt 1 onVideoLoadFail");
            }
        }

        public d(CampaignEx campaignEx, boolean z, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = i;
            this.f1760a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            o0.a("RewardMVVideoAdapter", "template 下载失败： ");
            if (bVar != null) {
                bVar.d("errorCode: 3202 errorMessage: temp resource download failed");
            }
            if (!this.c && c.this.j != null && c.this.I != null) {
                o0.a("RewardMVVideoAdapter", "播放模板下载失败，非大模板");
                if (this.b.getRsIgnoreCheckRule() == null || this.b.getRsIgnoreCheckRule().size() <= 0 || !this.b.getRsIgnoreCheckRule().contains(1)) {
                    c.this.I.post(new a(str2, bVar));
                    return;
                } else {
                    o0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                    return;
                }
            }
            if (this.d == 1) {
                if (this.b.getRsIgnoreCheckRule() != null && this.b.getRsIgnoreCheckRule().size() > 0) {
                    if (this.b.getRsIgnoreCheckRule().contains(3)) {
                        o0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                        return;
                    } else if (this.b.getCMPTEntryUrl().equals(this.b.getendcard_url()) && this.b.getRsIgnoreCheckRule().contains(2)) {
                        o0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                        return;
                    }
                }
                if (c.this.j == null || c.this.I == null) {
                    return;
                }
                c.this.I.post(new b(str2, bVar));
            }
        }
    }

    public class f extends com.mbridge.msdk.foundation.same.c.a {
        public f() {
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.reward.report.metrics.a.a().a(str, cVar);
        }
    }

    public class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignUnit f1767a;

        public g(CampaignUnit campaignUnit) {
            this.f1767a = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.a(com.mbridge.msdk.foundation.db.g.a(c.this.f1752a)).a();
            CampaignUnit campaignUnit = this.f1767a;
            if (campaignUnit == null || campaignUnit.getAds() == null || this.f1767a.getAds().size() <= 0) {
                return;
            }
            c.this.d(this.f1767a.getAds());
        }
    }

    public class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1768a;
        private com.mbridge.msdk.foundation.same.report.metrics.c b;

        public h(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f1768a = str;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (c.this.D) {
                    return;
                }
                c.this.E = true;
                if (c.this.I != null) {
                    Message messageObtainMessage = c.this.I.obtainMessage();
                    messageObtainMessage.obj = this.f1768a;
                    messageObtainMessage.what = 2;
                    if (this.b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.b.o());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.I.sendMessage(messageObtainMessage);
                }
            } catch (Exception e) {
                o0.b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    public class i implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f1769a;
        private com.mbridge.msdk.foundation.same.report.metrics.c b;

        public i(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            this.f1769a = str;
            this.b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    c cVar = c.this;
                    cVar.t = com.mbridge.msdk.b.a(cVar.b, c.this.f1752a);
                }
                c cVar2 = c.this;
                cVar2.h = t0.a(cVar2.f1752a, c.this.b);
                if (c.this.E) {
                    return;
                }
                if (c.this.C != null && c.this.I != null) {
                    c.this.I.removeCallbacks(c.this.C);
                }
                c.this.D = true;
                if (c.this.I != null) {
                    Message messageObtainMessage = c.this.I.obtainMessage();
                    messageObtainMessage.obj = this.f1769a;
                    messageObtainMessage.what = 1;
                    if (this.b != null) {
                        Bundle bundle = new Bundle();
                        bundle.putString("metrics_data_lrid", this.b.o());
                        messageObtainMessage.setData(bundle);
                    }
                    c.this.I.sendMessage(messageObtainMessage);
                }
                if (TextUtils.isEmpty(c.this.h)) {
                    return;
                }
                o0.b("RewardMVVideoAdapter", "excludeId : " + c.this.h);
            } catch (Exception e) {
                o0.b("RewardMVVideoAdapter", e.getMessage());
            }
        }
    }

    public c(Context context, String str, String str2) {
        try {
            this.f1752a = context.getApplicationContext();
            this.b = str2;
            this.c = str;
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private String i() {
        try {
            if (y0.b(com.mbridge.msdk.reward.controller.a.W)) {
                return com.mbridge.msdk.reward.controller.a.W;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return "";
    }

    private String k() {
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.n().b());
        return com.mbridge.msdk.foundation.same.net.utils.d.h().a(this.B, TextUtils.isEmpty(this.B) ? gVarB.p0() : gVarB.B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            if (y0.b(this.b)) {
                com.mbridge.msdk.reward.controller.a.a(this.b, 0);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void c(String str) {
        this.s = str;
    }

    public void d(boolean z) {
        this.q = z;
    }

    public void e(boolean z) {
        this.r = z;
    }

    public void f(boolean z) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (z || (copyOnWriteArrayList = this.y) == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.y);
    }

    public boolean g(boolean z) {
        if (z) {
            List<CampaignEx> list = this.U;
            if (list == null || list.size() <= 0) {
                return false;
            }
            for (CampaignEx campaignEx : this.U) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(1);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e(), true);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.U, "load_timeout", 1);
            return true;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.y;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return false;
        }
        for (CampaignEx campaignEx2 : this.y) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(1);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().e())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().e(), true);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.y, "load_timeout", 1);
        return true;
    }

    public void h(boolean z) {
        if (z) {
            List<CampaignEx> list = this.U;
            if (list == null || list.size() <= 0) {
                return;
            }
            for (CampaignEx campaignEx : this.U) {
                if (campaignEx != null) {
                    campaignEx.setLoadTimeoutState(0);
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e(), false);
                    }
                }
            }
            com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.U, "load_timeout", 0);
            return;
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.y;
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
            return;
        }
        for (CampaignEx campaignEx2 : this.y) {
            if (campaignEx2 != null) {
                campaignEx2.setLoadTimeoutState(0);
                if (campaignEx2.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx2.getRewardTemplateMode().e())) {
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.b + "_" + campaignEx2.getRequestId() + "_" + campaignEx2.getRewardTemplateMode().e(), false);
                }
            }
        }
        com.mbridge.msdk.videocommon.cache.a.a().a(this.b, this.y, "load_timeout", 0);
    }

    public String j() {
        return this.b;
    }

    public boolean l() {
        return b(false);
    }

    public boolean m() {
        List<CampaignEx> listC = com.mbridge.msdk.videocommon.cache.a.a().c(this.b, 1, this.r, this.s);
        if (listC == null || listC.size() <= 0) {
            o0.a("test_isReay_db", "database has not can use data");
            return false;
        }
        CampaignEx campaignEx = listC.get(0);
        int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.b, 1, this.r, this.s);
        if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || listC.size() >= iA) {
            return a(listC, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(List<CampaignEx> list) {
        if (this.f1752a == null || list == null || list.size() == 0) {
            return;
        }
        j jVarA = j.a(com.mbridge.msdk.foundation.db.g.a(this.f1752a));
        for (int i2 = 0; i2 < list.size(); i2++) {
            CampaignEx campaignEx = list.get(i2);
            if (campaignEx != null) {
                if (com.mbridge.msdk.util.b.a()) {
                    if (t0.c(this.f1752a, campaignEx.getPackageName())) {
                        com.mbridge.msdk.b.a(campaignEx);
                    } else {
                        a(jVarA, campaignEx);
                    }
                } else {
                    a(jVarA, campaignEx);
                }
            }
        }
    }

    private String e() {
        return com.mbridge.msdk.b.a();
    }

    public void c(boolean z) {
        this.J = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(CampaignUnit campaignUnit) {
        if (campaignUnit == null || campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c metricsData = campaignUnit.getMetricsData();
            if (metricsData != null) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 1);
                eVar.a("timeout", Integer.valueOf(this.f));
                eVar.a("hst", k());
                ArrayList<CampaignEx> ads = campaignUnit.getAds();
                metricsData.b(ads);
                ArrayList<Integer> rsIgnoreCheckRule = ads.get(0).getRsIgnoreCheckRule();
                if (rsIgnoreCheckRule != null) {
                    eVar.a("ignore_video", Integer.valueOf(!rsIgnoreCheckRule.contains(0) ? 1 : 0));
                    eVar.a("ignore_template", Integer.valueOf(!rsIgnoreCheckRule.contains(1) ? 1 : 0));
                    eVar.a("ignore_ec", Integer.valueOf(!rsIgnoreCheckRule.contains(2) ? 1 : 0));
                } else {
                    eVar.a("ignore_video", 1);
                    eVar.a("ignore_template", 1);
                    eVar.a("ignore_ec", 1);
                }
                metricsData.a("2000126", eVar);
                campaignUnit.setLocalRequestId(metricsData.o());
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", metricsData);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
    }

    public CopyOnWriteArrayList<CampaignEx> f() {
        return this.T;
    }

    public void b(String str) {
        this.H = str;
    }

    public boolean b(boolean z) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.cache.a.a().b(this.b, 1, this.r, this.s);
        if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
            CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
            int iA = com.mbridge.msdk.videocommon.cache.a.a().a(this.b, 1, this.r, this.s);
            if (TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()) || campaignEx.getNscpt() != 1 || copyOnWriteArrayListB.size() >= iA) {
                return a(copyOnWriteArrayListB, !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl()), campaignEx.getNscpt(), z);
            }
            if (z) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("event_name", "is_ready_cltr");
                eVar.a("reason", "nscpt error");
                a(cVar, eVar, copyOnWriteArrayListB);
            }
            return false;
        }
        o0.a("RewardVideoController", "database has not can use data");
        if (z) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("event_name", "is_ready_cse");
            eVar2.a("reason", "no effective campaign list");
        }
        return false;
    }

    public class e implements com.mbridge.msdk.reward.adapter.b.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f1763a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        public e(CampaignEx campaignEx, boolean z, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = i;
            this.f1763a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, String str3, String str4) {
            o0.a("RewardMVVideoAdapter", "大模板业务，大模板下载成功");
            c.this.M = true;
            if (!c.this.L || c.this.N || c.this.I == null) {
                return;
            }
            synchronized (c.this.n) {
                try {
                    if (c.this.N) {
                        return;
                    }
                    c.this.N = true;
                    c.this.I.post(new a(str3, str, str2));
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.n
        public void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar) {
            o0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败");
            if (this.b.getRsIgnoreCheckRule() != null && this.b.getRsIgnoreCheckRule().size() > 0) {
                if (this.b.getRsIgnoreCheckRule().contains(3)) {
                    o0.c("RewardMVVideoAdapter", "tpl download fail but hit ignoreCheckRule");
                    return;
                } else if (this.b.getCMPTEntryUrl().equals(this.b.getendcard_url()) && this.b.getRsIgnoreCheckRule().contains(2)) {
                    o0.c("RewardMVVideoAdapter", "endcard download fail but hit ignoreCheckRule at 3203");
                    return;
                }
            }
            c cVar = c.this;
            cVar.a(cVar.b, (List<CampaignEx>) c.this.S, c.this.r, str2);
            c.this.M = false;
            if (c.this.I != null) {
                c.this.I.removeMessages(5);
            }
            if (c.this.j == null || c.this.P) {
                return;
            }
            c.this.P = true;
            if (bVar != null) {
                bVar.d("errorCode: 3203 errorMessage: tpl temp resource download failed");
            }
            if (this.f1763a == null) {
                this.f1763a = new com.mbridge.msdk.foundation.same.report.metrics.c();
            }
            this.f1763a.b(c.this.y);
            this.f1763a.a(bVar);
            c.this.j.a(c.this.S, bVar, this.f1763a);
            o0.a("RewardMVVideoAdapter", "大模板业务，大模板下载失败 onVideoLoadFail");
        }

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1764a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;

            public a(String str, String str2, String str3) {
                this.f1764a = str;
                this.b = str2;
                this.c = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z = c.this.z;
                Handler handler = c.this.I;
                boolean z2 = c.this.q;
                boolean z3 = c.this.r;
                String str = this.f1764a;
                String requestIdNotice = e.this.b.getRequestIdNotice();
                String str2 = this.b;
                String str3 = this.c;
                String cMPTEntryUrl = e.this.b.getCMPTEntryUrl();
                int i = c.this.p;
                e eVar = e.this;
                bVarB.a(z, handler, z2, z3, str, requestIdNotice, str2, str3, cMPTEntryUrl, i, eVar.b, c.this.y, H5DownLoadManager.getInstance().getH5ResAddress(e.this.b.getCMPTEntryUrl()), this.c, c.this.k, new C0226a(), false);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$e$a$a, reason: collision with other inner class name */
            public class C0226a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0226a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0272a c0272a) {
                    AbstractC3888ke0.s("模板加载成功 requestId ", str4, "HBOPTIMIZE");
                    c cVar = c.this;
                    CopyOnWriteArrayList copyOnWriteArrayList = cVar.y;
                    e eVar = e.this;
                    if (cVar.a(copyOnWriteArrayList, eVar.c, eVar.d)) {
                        c cVar2 = c.this;
                        cVar2.a(cVar2.b, (List<CampaignEx>) c.this.S, (List<CampaignEx>) c.this.U, c.this.r);
                        if (c.this.I != null) {
                            c.this.I.removeMessages(5);
                        }
                        if (c.this.j == null || c.this.O) {
                            return;
                        }
                        c.this.O = true;
                        e eVar2 = e.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar3 = eVar2.f1763a;
                        if (cVar3 != null) {
                            cVar3.b(c.this.y);
                        }
                        c.this.j.a(c.this.y, e.this.f1763a);
                        return;
                    }
                    c cVar4 = c.this;
                    cVar4.a(str3, (List<CampaignEx>) cVar4.S, c.this.r, a.this.f1764a);
                    if (c.this.I != null) {
                        c.this.I.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.P) {
                        return;
                    }
                    c.this.P = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880008, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    e eVar3 = e.this;
                    if (eVar3.f1763a == null) {
                        eVar3.f1763a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar4 = e.this;
                    eVar4.f1763a.b(c.this.y);
                    e.this.f1763a.a(bVarA);
                    c.this.j.a(c.this.S, bVarA, e.this.f1763a);
                    o0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载成功 isReady false  onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0272a c0272a, com.mbridge.msdk.foundation.error.b bVar) {
                    o0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败");
                    o0.b("HBOPTIMIZE", "模板加载失败 requestId " + str2);
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.c, (List<CampaignEx>) cVar.S, c.this.r, str2);
                    if (c.this.I != null) {
                        c.this.I.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.P) {
                        return;
                    }
                    c.this.P = true;
                    e eVar = e.this;
                    if (eVar.f1763a == null) {
                        eVar.f1763a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    e eVar2 = e.this;
                    eVar2.f1763a.b(c.this.y);
                    e.this.f1763a.a(bVar);
                    c.this.j.a(c.this.S, bVar, e.this.f1763a);
                    o0.a("RewardMVVideoAdapter", "大模板业务，大模板预加载失败 onVideoLoadFail");
                }
            }
        }
    }

    private void d() {
        try {
            Map<String, Long> map = com.mbridge.msdk.foundation.same.buffer.b.l;
            if (map == null || map.size() <= 0) {
                return;
            }
            com.mbridge.msdk.foundation.same.buffer.b.l.clear();
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public String a(boolean z) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB;
        CampaignEx campaignEx;
        if (z) {
            if (TextUtils.isEmpty(this.G) && (copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.b)) != null && copyOnWriteArrayListB.size() > 0 && (campaignEx = copyOnWriteArrayListB.get(0)) != null) {
                this.G = campaignEx.getRequestId();
            }
            return this.G;
        }
        return this.F;
    }

    public String g() {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.y;
        if (copyOnWriteArrayList != null && !copyOnWriteArrayList.isEmpty()) {
            return com.mbridge.msdk.foundation.same.c.b(this.y);
        }
        return com.mbridge.msdk.foundation.same.c.b(this.U);
    }

    public CopyOnWriteArrayList<CampaignEx> h() {
        return this.y;
    }

    public void a(int i2) {
        this.p = i2;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c, reason: collision with other inner class name */
    public class C0223c implements com.mbridge.msdk.reward.adapter.b.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        com.mbridge.msdk.foundation.same.report.metrics.c f1754a;
        final /* synthetic */ CampaignEx b;
        final /* synthetic */ boolean c;
        final /* synthetic */ int d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$c, reason: collision with other inner class name */
        public class RunnableC0225c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CopyOnWriteArrayList f1759a;
            final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

            public RunnableC0225c(CopyOnWriteArrayList copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
                this.f1759a = copyOnWriteArrayList;
                this.b = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar = c.this;
                cVar.a(cVar.b, this.f1759a, c.this.r, "");
                if (c.this.I != null) {
                    c.this.I.removeMessages(5);
                }
                if (c.this.P || c.this.j == null) {
                    return;
                }
                c.this.P = true;
                C0223c c0223c = C0223c.this;
                if (c0223c.f1754a == null) {
                    c0223c.f1754a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                }
                C0223c c0223c2 = C0223c.this;
                c0223c2.f1754a.b(c.this.y);
                com.mbridge.msdk.foundation.error.b bVar = this.b;
                if (bVar != null) {
                    bVar.d("errorCode: 3201 errorMessage: campaign resource download failed");
                }
                C0223c.this.f1754a.a(this.b);
                c.this.j.a(this.f1759a, this.b, C0223c.this.f1754a);
                o0.a("RewardMVVideoAdapter", "Campaign 下载失败：onVideoLoadFail");
            }
        }

        public C0223c(CampaignEx campaignEx, boolean z, int i) {
            this.b = campaignEx;
            this.c = z;
            this.d = i;
            this.f1754a = com.mbridge.msdk.foundation.same.report.metrics.d.b().c().get(campaignEx.getLocalRequestId());
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            c.this.L = true;
            if (this.c) {
                if (!c.this.M || c.this.N || c.this.I == null) {
                    return;
                }
                synchronized (c.this.n) {
                    try {
                        if (c.this.N) {
                            return;
                        }
                        c.this.N = true;
                        c.this.I.post(new b(str3, str2, copyOnWriteArrayList));
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            for (CampaignEx campaignEx : copyOnWriteArrayList) {
                if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e()) || campaignEx.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY) || c.this.I == null) {
                    c cVar = c.this;
                    if (cVar.a(cVar.y, this.c, this.d)) {
                        c cVar2 = c.this;
                        cVar2.a(cVar2.b, copyOnWriteArrayList, (List<CampaignEx>) c.this.U, c.this.r);
                        if (c.this.I != null) {
                            c.this.I.removeMessages(5);
                        }
                        if (c.this.j != null && !c.this.O) {
                            c.this.O = true;
                            com.mbridge.msdk.foundation.same.report.metrics.c cVar3 = this.f1754a;
                            if (cVar3 != null) {
                                cVar3.b(c.this.y);
                            }
                            c.this.j.a(c.this.y, this.f1754a);
                        }
                    } else {
                        c cVar4 = c.this;
                        cVar4.a(str2, (List<CampaignEx>) cVar4.S, c.this.r, str3);
                        if (c.this.I != null) {
                            c.this.I.removeMessages(5);
                        }
                        if (c.this.j != null && !c.this.P) {
                            c.this.P = true;
                            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3503 errorMessage: have no temp but isReady false");
                            if (this.f1754a == null) {
                                this.f1754a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            }
                            this.f1754a.b(c.this.y);
                            this.f1754a.a(bVarA);
                            c.this.j.a(c.this.y, bVarA, this.f1754a);
                            o0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，不存在播放模板,isReay false onVideoLoadFail");
                        }
                    }
                } else {
                    c.this.I.post(new a(campaignEx, str, str2, str3, copyOnWriteArrayList));
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f1755a;
            final /* synthetic */ String b;
            final /* synthetic */ String c;
            final /* synthetic */ String d;
            final /* synthetic */ CopyOnWriteArrayList e;

            public a(CampaignEx campaignEx, String str, String str2, String str3, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f1755a = campaignEx;
                this.b = str;
                this.c = str2;
                this.d = str3;
                this.e = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z = c.this.z;
                Handler handler = c.this.I;
                boolean z2 = c.this.q;
                boolean z3 = c.this.r;
                String strE = this.f1755a.getRewardTemplateMode().e();
                int i = c.this.p;
                C0223c c0223c = C0223c.this;
                bVarB.a(z, handler, z2, z3, null, strE, i, c0223c.b, c.this.y, H5DownLoadManager.getInstance().getH5ResAddress(this.f1755a.getRewardTemplateMode().e()), this.b, this.c, this.d, this.f1755a.getRequestIdNotice(), c.this.k, new C0224a());
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$a$a, reason: collision with other inner class name */
            public class C0224a implements com.mbridge.msdk.reward.adapter.b.o {
                public C0224a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0272a c0272a) {
                    c cVar = c.this;
                    CopyOnWriteArrayList copyOnWriteArrayList = cVar.y;
                    C0223c c0223c = C0223c.this;
                    if (cVar.a(copyOnWriteArrayList, c0223c.c, c0223c.d)) {
                        c cVar2 = c.this;
                        String str6 = cVar2.b;
                        a aVar = a.this;
                        cVar2.a(str6, aVar.e, (List<CampaignEx>) c.this.U, c.this.r);
                        if (c.this.I != null) {
                            c.this.I.removeMessages(5);
                        }
                        if (c.this.j == null || c.this.O) {
                            return;
                        }
                        c.this.O = true;
                        C0223c c0223c2 = C0223c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar3 = c0223c2.f1754a;
                        if (cVar3 != null) {
                            cVar3.b(c.this.y);
                        }
                        c.this.j.a(c.this.y, C0223c.this.f1754a);
                        return;
                    }
                    c cVar4 = c.this;
                    cVar4.a(str3, (List<CampaignEx>) cVar4.S, c.this.r, str4);
                    if (c.this.I != null) {
                        c.this.I.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.P) {
                        return;
                    }
                    c.this.P = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3502 errorMessage: temp preload success but isReady false");
                    C0223c c0223c3 = C0223c.this;
                    if (c0223c3.f1754a == null) {
                        c0223c3.f1754a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0223c c0223c4 = C0223c.this;
                    c0223c4.f1754a.b(c.this.y);
                    C0223c.this.f1754a.a(bVarA);
                    c.this.j.a(c.this.y, bVarA, C0223c.this.f1754a);
                    o0.a("RewardMVVideoAdapter", "Campaign 下载成功： 非大模板，播放模板预加载成功,isReay false onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0272a c0272a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "preload template failed is tpl :" + C0223c.this.c);
                    }
                    if (C0223c.this.b.getRsIgnoreCheckRule() != null && C0223c.this.b.getRsIgnoreCheckRule().size() > 0 && C0223c.this.b.getRsIgnoreCheckRule().contains(1)) {
                        o0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    a aVar = a.this;
                    c cVar = c.this;
                    cVar.a(aVar.c, (List<CampaignEx>) cVar.S, c.this.r, str2);
                    if (c.this.I != null) {
                        c.this.I.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.P) {
                        return;
                    }
                    c.this.P = true;
                    C0223c c0223c = C0223c.this;
                    if (c0223c.f1754a == null) {
                        c0223c.f1754a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0223c c0223c2 = C0223c.this;
                    c0223c2.f1754a.b(c.this.y);
                    C0223c.this.f1754a.a(bVar);
                    c.this.j.a(c.this.S, bVar, C0223c.this.f1754a);
                    o0.a("RewardMVVideoAdapter", "Campaign 下载失败： 非大模板，播放模板预加载失败 onVideoLoadFail");
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1757a;
            final /* synthetic */ String b;
            final /* synthetic */ CopyOnWriteArrayList c;

            public b(String str, String str2, CopyOnWriteArrayList copyOnWriteArrayList) {
                this.f1757a = str;
                this.b = str2;
                this.c = copyOnWriteArrayList;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.mbridge.msdk.reward.adapter.b bVarB = com.mbridge.msdk.reward.adapter.b.b();
                boolean z = c.this.z;
                Handler handler = c.this.I;
                boolean z2 = c.this.q;
                boolean z3 = c.this.r;
                String str = this.f1757a;
                String requestIdNotice = C0223c.this.b.getRequestIdNotice();
                String str2 = c.this.c;
                String str3 = this.b;
                String cMPTEntryUrl = C0223c.this.b.getCMPTEntryUrl();
                int i = c.this.p;
                C0223c c0223c = C0223c.this;
                bVarB.a(z, handler, z2, z3, str, requestIdNotice, str2, str3, cMPTEntryUrl, i, c0223c.b, c.this.y, H5DownLoadManager.getInstance().getH5ResAddress(C0223c.this.b.getCMPTEntryUrl()), this.b, c.this.k, new a(), false);
            }

            /* JADX INFO: renamed from: com.mbridge.msdk.reward.adapter.c$c$b$a */
            public class a implements com.mbridge.msdk.reward.adapter.b.o {
                public a() {
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, String str4, String str5, com.mbridge.msdk.videocommon.a.C0272a c0272a) {
                    c cVar = c.this;
                    CopyOnWriteArrayList copyOnWriteArrayList = cVar.y;
                    C0223c c0223c = C0223c.this;
                    if (cVar.a(copyOnWriteArrayList, c0223c.c, c0223c.d)) {
                        c cVar2 = c.this;
                        String str6 = cVar2.b;
                        b bVar = b.this;
                        cVar2.a(str6, bVar.c, (List<CampaignEx>) c.this.U, c.this.r);
                        if (c.this.I != null) {
                            c.this.I.removeMessages(5);
                        }
                        if (c.this.j == null || c.this.O) {
                            return;
                        }
                        c.this.O = true;
                        C0223c c0223c2 = C0223c.this;
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar3 = c0223c2.f1754a;
                        if (cVar3 != null) {
                            cVar3.b(c.this.y);
                        }
                        c.this.j.a(c.this.y, C0223c.this.f1754a);
                        return;
                    }
                    c cVar4 = c.this;
                    cVar4.a(str3, (List<CampaignEx>) cVar4.S, c.this.r, str4);
                    if (c.this.I != null) {
                        c.this.I.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.P) {
                        return;
                    }
                    c.this.P = true;
                    com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880015, "errorCode: 3505 errorMessage: tpl temp preload success but isReady false");
                    C0223c c0223c3 = C0223c.this;
                    if (c0223c3.f1754a == null) {
                        c0223c3.f1754a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0223c c0223c4 = C0223c.this;
                    c0223c4.f1754a.b(c.this.y);
                    C0223c.this.f1754a.a(bVarA);
                    c.this.j.a(c.this.S, bVarA, C0223c.this.f1754a);
                    o0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载成功,isReady false onVideoLoadFail");
                }

                @Override // com.mbridge.msdk.reward.adapter.b.o
                public void a(String str, String str2, String str3, com.mbridge.msdk.videocommon.a.C0272a c0272a, com.mbridge.msdk.foundation.error.b bVar) {
                    if (bVar != null) {
                        bVar.a("his_reason", "errorCode: 3303 errorMessage: tpl temp preload failed");
                    }
                    if (C0223c.this.b.getRsIgnoreCheckRule() != null && C0223c.this.b.getRsIgnoreCheckRule().size() > 0 && C0223c.this.b.getRsIgnoreCheckRule().contains(3)) {
                        o0.c("RewardMVVideoAdapter", "template download fail but hit ignoreCheckRule");
                        return;
                    }
                    b bVar2 = b.this;
                    c cVar = c.this;
                    cVar.a(bVar2.b, (List<CampaignEx>) cVar.S, c.this.r, str2);
                    if (c.this.I != null) {
                        c.this.I.removeMessages(5);
                    }
                    if (c.this.j == null || c.this.P) {
                        return;
                    }
                    c.this.P = true;
                    C0223c c0223c = C0223c.this;
                    if (c0223c.f1754a == null) {
                        c0223c.f1754a = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    C0223c c0223c2 = C0223c.this;
                    c0223c2.f1754a.b(c.this.y);
                    C0223c.this.f1754a.a(bVar);
                    c.this.j.a(c.this.S, bVar, C0223c.this.f1754a);
                    o0.a("RewardMVVideoAdapter", "Campaign 下载成功： 大模板预加载失败 onVideoLoadFail");
                }
            }
        }

        @Override // com.mbridge.msdk.reward.adapter.b.h
        public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar) {
            c.this.L = false;
            if (c.this.j == null || c.this.I == null) {
                return;
            }
            c.this.I.post(new RunnableC0225c(copyOnWriteArrayList, bVar));
        }
    }

    public boolean a(CampaignEx campaignEx, boolean z, com.mbridge.msdk.foundation.error.b bVar, int i2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.cache.c cVar2;
        com.mbridge.msdk.foundation.cache.c cVar3 = new com.mbridge.msdk.foundation.cache.c();
        com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(this.b, this.q);
        boolean z2 = false;
        if (aVar.a(this.B)) {
            return false;
        }
        if (!this.Q) {
            this.Q = true;
            cVar3 = aVar.a(this.B, cVar, campaignEx, bVar, i2, this);
            if (cVar3 != null && cVar3.g() > com.mbridge.msdk.foundation.cache.c.i) {
                if (cVar3.c() != null && cVar3.c().size() > 0) {
                    a(cVar3.c(), true, true);
                } else if (cVar3.g() == com.mbridge.msdk.foundation.cache.c.k && bVar != null) {
                    bVar.a(com.mbridge.msdk.foundation.error.a.b(880038));
                    bVar.e(cVar3.e());
                }
            }
            cVar2 = cVar3;
            aVar.a(cVar, this.B, cVar2, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 3);
            return z2;
        }
        cVar3.d("isCandidate:false");
        cVar3.a(com.mbridge.msdk.foundation.cache.c.k);
        cVar2 = cVar3;
        z2 = true;
        aVar.a(cVar, this.B, cVar2, (List<com.mbridge.msdk.foundation.cache.a.b>) null, (JSONObject) null, 3);
        return z2;
    }

    public void b(String str, boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        boolean zA;
        try {
            if (this.f1752a == null) {
                com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
                if (cVar != null) {
                    cVar.a(bVarA);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
                return;
            }
            if (y0.a(this.b)) {
                com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
                if (cVar != null) {
                    cVar.a(bVarA2);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
                return;
            }
            if (this.k == null) {
                com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
                if (cVar != null) {
                    cVar.a(bVarA3);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null", cVar);
                return;
            }
            if (TextUtils.isEmpty(str)) {
                if (System.currentTimeMillis() - this.A < this.k.p() * 1000) {
                    com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880018, "errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY");
                    if (cVar != null) {
                        cVar.a(bVarA4);
                        cVar.b(true);
                    }
                    b("errorCode: 3507 errorMessage: data load failed, errorMsg is EXCEPTION_RETURN_EMPTY", cVar);
                    return;
                }
            }
            String strO = "";
            if (cVar != null) {
                strO = cVar.o();
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = new com.mbridge.msdk.reward.adapter.d(this.c, this.b, this.q, this.k, strO).a(this.g, this.h, this.d, i(), e(), this.t, str, z, this.u);
            if (eVarA == null) {
                com.mbridge.msdk.foundation.error.b bVarA5 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null");
                if (cVar != null) {
                    cVar.a(bVarA5);
                }
                b("errorCode: 3507 errorMessage: data load failed, errorMsg is Load param is null", cVar);
                return;
            }
            this.K = System.currentTimeMillis();
            com.mbridge.msdk.reward.request.b bVar = new com.mbridge.msdk.reward.request.b(this.f1752a);
            b bVar2 = new b(cVar);
            bVar2.a(str);
            bVar2.setUnitId(this.b);
            bVar2.setPlacementId(this.c);
            bVar2.setAdType(this.q ? 287 : 94);
            bVar2.a(cVar);
            try {
                zA = com.mbridge.msdk.videocommon.download.j.a().a(this.q ? 287 : 94);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("RewardMVVideoAdapter", "isRewardVideoRefactorForCampaignRequest exception " + e2.getMessage());
                }
                zA = false;
            }
            try {
                if (com.mbridge.msdk.foundation.same.net.utils.c.b().a(eVarA) == null) {
                    com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                    eVar.a("hst", k());
                    cVar.a("2000125", eVar);
                    com.mbridge.msdk.reward.report.metrics.a.a().a("2000125", cVar);
                }
            } catch (Exception e3) {
                if (MBridgeConstans.DEBUG) {
                    e3.printStackTrace();
                }
            }
            if (zA) {
                bVar.getCampaign(1, str, eVarA, bVar2, com.mbridge.msdk.foundation.same.c.a(this.f * 1000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
            } else {
                bVar.choiceV3OrV5BySetting(1, eVarA, bVar2, str, com.mbridge.msdk.foundation.same.c.a(this.f * 1000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            b("Load exception", cVar);
            n();
        }
    }

    private void c() {
        try {
            com.mbridge.msdk.foundation.db.i.a(com.mbridge.msdk.foundation.db.g.a(this.f1752a)).a(this.b);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public void c(List<CampaignEx> list) {
        this.U = list;
    }

    public void a(com.mbridge.msdk.videocommon.setting.c cVar) {
        try {
            this.k = cVar;
            if (cVar == null || cVar.o() * 1000 == com.mbridge.msdk.foundation.same.a.L) {
                return;
            }
            com.mbridge.msdk.foundation.same.a.L = this.k.o() * 1000;
        } catch (Throwable th) {
            o0.b("RewardMVVideoAdapter", th.getMessage(), th);
        }
    }

    public boolean a(List<CampaignEx> list, boolean z, int i2, boolean z2) {
        return a(list, z, i2, false, z2);
    }

    public boolean a(List<CampaignEx> list, boolean z, int i2) {
        return a(list, z, i2, false, false);
    }

    public boolean a(List<CampaignEx> list, boolean z) {
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.b, list)) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            o0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            o0.c("RewardMVVideoAdapter", "Is not check big template ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        o0.a("RewardVideoController", "大模板业务，开始检查大模板预加载情况，大模板预加载成功");
                        return true;
                    }
                } else {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        o0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e())) {
                            o0.a("RewardVideoController", "非大模板业务，存在播放模板，播放模板预加载成功");
                            return true;
                        }
                    } else {
                        o0.a("RewardVideoController", "非大模板 没有 template");
                        return true;
                    }
                }
            }
        } else {
            o0.a("RewardVideoController", "数据为空");
        }
        return false;
    }

    public boolean a(List<CampaignEx> list, boolean z, int i2, boolean z2, boolean z3) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        if (list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            boolean zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, this.b, this.r, list.size(), z, i2, list, z2, eVar);
            eVar.a("event_name", "is_ready_crwtpl_" + zA);
            if (z3) {
                a(cVar, eVar, list);
            }
            if (zA) {
                if (z) {
                    if (campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                        if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                            o0.c("RewardMVVideoAdapter", "Is not check big template download status");
                            return true;
                        }
                        if (campaignEx.getCMPTEntryUrl().equals(campaignEx.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                            o0.c("RewardMVVideoAdapter", "Is not check big template of ENDCARD download status");
                            return true;
                        }
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getCMPTEntryUrl())) {
                        return true;
                    }
                    if (z3) {
                        eVar.a("event_name", "is_ready_crwtpl_" + zA);
                        eVar.a("reason", "h5 big template checkPreLoadState error");
                        a(cVar, eVar, list);
                    }
                } else {
                    if (campaignEx != null && campaignEx.isDynamicView()) {
                        return true;
                    }
                    if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                        o0.c("RewardMVVideoAdapter", "Is not check template download status");
                        return true;
                    }
                    if (campaignEx == null || campaignEx.getRewardTemplateMode() == null || TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                        return true;
                    }
                    String str = this.b + "_" + campaignEx.getRequestId() + "_" + campaignEx.getRewardTemplateMode().e();
                    if (z3) {
                        ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str, true);
                    }
                    if (ResDownloadCheckManager.getInstance().checkPreLoadState(str)) {
                        return true;
                    }
                    if (z3) {
                        eVar.a("event_name", "is_ready_crwtpl_" + zA);
                        eVar.a("reason", "h5 template checkPreLoadState error");
                        a(cVar, eVar, list);
                    }
                }
            }
        } else {
            eVar.a("event_name", "is_ready_crwtpl_empty");
            eVar.a("reason", "campaign list is empty error");
        }
        a(cVar, eVar, list);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.I != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.o());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.I.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.I.sendMessage(messageObtain);
            }
        }
    }

    private void b() {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            try {
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                com.mbridge.msdk.videocommon.cache.a.a().a(gVarD.a0() * 1000, this.b);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b6 A[Catch: all -> 0x0019, Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:106:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:110:0x01d6 A[Catch: all -> 0x0019, Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x01da A[Catch: all -> 0x0019, Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x0206 A[PHI: r13
  0x0206: PHI (r13v4 'e' java.io.IOException) = (r13v7 'e' java.io.IOException), (r13v8 'e' java.io.IOException) binds: [B:127:0x0204, B:119:0x01f5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:160:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x017e A[Catch: all -> 0x0019, Exception -> 0x001c, PHI: r2
  0x017e: PHI (r2v9 java.io.FileOutputStream) = (r2v8 java.io.FileOutputStream), (r2v13 java.io.FileOutputStream) binds: [B:38:0x008c, B:82:0x016f] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0186 A[Catch: all -> 0x0019, Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x018c A[Catch: all -> 0x0019, Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x01a1 A[Catch: all -> 0x0019, Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x01ab A[Catch: all -> 0x0019, Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b0 A[Catch: all -> 0x0019, Exception -> 0x001c, TryCatch #3 {Exception -> 0x001c, blocks: (B:8:0x0011, B:10:0x0015, B:16:0x0021, B:18:0x0027, B:20:0x0031, B:22:0x003e, B:24:0x0048, B:25:0x004d, B:27:0x0053, B:28:0x0064, B:30:0x006a, B:31:0x0072, B:33:0x0077, B:37:0x0082, B:39:0x008e, B:41:0x009c, B:77:0x0156, B:79:0x0165, B:81:0x016b, B:83:0x0171, B:85:0x017a, B:86:0x017d, B:76:0x0153, B:45:0x00a9, B:48:0x00b4, B:87:0x017e, B:89:0x0186, B:91:0x018c, B:93:0x0196, B:98:0x01ab, B:99:0x01b0, B:101:0x01b6, B:103:0x01bc, B:107:0x01cb, B:108:0x01ce, B:110:0x01d6, B:112:0x01e5, B:111:0x01da, B:96:0x01a1), top: B:143:0x0011 }] */
    private CopyOnWriteArrayList<CampaignEx> b(CampaignUnit campaignUnit) throws Throwable {
        FileOutputStream fileOutputStream;
        IOException e2;
        com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
        int i2;
        String str;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        if (MBridgeConstans.DEBUG && com.mbridge.msdk.util.e.f2083a) {
            return copyOnWriteArrayList;
        }
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                com.mbridge.msdk.videocommon.setting.c cVar = this.k;
                if (cVar != null) {
                    cVar.b();
                }
                if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
                    ArrayList<CampaignEx> ads = campaignUnit.getAds();
                    this.S = ads;
                    if (campaignUnit.getAds() == null || campaignUnit.getAds().size() <= 0) {
                        metricsData = null;
                    } else {
                        ArrayList<CampaignEx> ads2 = campaignUnit.getAds();
                        for (int i3 = 0; i3 < ads2.size(); i3++) {
                            CampaignEx campaignEx = ads2.get(i3);
                            campaignEx.setCampaignUnitId(this.b);
                            ads2.set(i3, campaignEx);
                        }
                        metricsData = campaignUnit.getMetricsData();
                        if (metricsData == null) {
                            metricsData = new com.mbridge.msdk.foundation.same.report.metrics.c();
                            campaignUnit.setMetricsData(metricsData);
                        }
                        metricsData.b(ads2);
                    }
                    for (int i4 = 0; i4 < ads.size() && i4 < Integer.MAX_VALUE; i4++) {
                        CampaignEx campaignEx2 = ads.get(i4);
                        if (campaignEx2.isMraid()) {
                            if (TextUtils.isEmpty(campaignEx2.getMraid().trim())) {
                                continue;
                            } else {
                                if (campaignEx2.getAdType() == 287) {
                                    str = ExifInterface.GPS_MEASUREMENT_3D;
                                } else if (campaignEx2.getAdType() == 94) {
                                    str = "1";
                                } else {
                                    str = campaignEx2.getAdType() == 42 ? "2" : "";
                                }
                                try {
                                    try {
                                        String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                                        String md5 = SameMD5.getMD5(campaignEx2.getMraid());
                                        if (TextUtils.isEmpty(md5)) {
                                            md5 = String.valueOf(System.currentTimeMillis());
                                        }
                                        File file = new File(strB, md5.concat(".html"));
                                        fileOutputStream = new FileOutputStream(file);
                                        try {
                                            fileOutputStream.write(("<script>" + com.mbridge.msdk.setting.util.a.a().b() + "</script>" + campaignEx2.getMraid()).getBytes());
                                            fileOutputStream.flush();
                                            campaignEx2.setMraid(file.getAbsolutePath());
                                            com.mbridge.msdk.foundation.same.report.g.a(campaignEx2, "", this.b, str);
                                            try {
                                                fileOutputStream.close();
                                                fileOutputStream2 = fileOutputStream;
                                            } catch (Exception e3) {
                                                e = e3;
                                                fileOutputStream2 = fileOutputStream;
                                                e.printStackTrace();
                                                if (fileOutputStream2 != null) {
                                                    try {
                                                        fileOutputStream2.close();
                                                    } catch (IOException e4) {
                                                        e2 = e4;
                                                        if (MBridgeConstans.DEBUG) {
                                                            o0.b("RewardMVVideoAdapter", e2.getMessage());
                                                        }
                                                    }
                                                }
                                                return copyOnWriteArrayList;
                                            } catch (Throwable th) {
                                                th = th;
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (IOException e5) {
                                                        if (MBridgeConstans.DEBUG) {
                                                            o0.b("RewardMVVideoAdapter", e5.getMessage());
                                                        }
                                                    }
                                                }
                                                throw th;
                                            }
                                        } catch (Exception e6) {
                                            e = e6;
                                            fileOutputStream2 = fileOutputStream;
                                            e.printStackTrace();
                                            campaignEx2.setMraid("");
                                            com.mbridge.msdk.foundation.same.report.g.a(campaignEx2, e.getMessage(), this.b, str);
                                            if (fileOutputStream2 != null) {
                                                fileOutputStream2.close();
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            fileOutputStream2 = fileOutputStream;
                                            if (fileOutputStream2 != null) {
                                                fileOutputStream2.close();
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Exception e7) {
                                    e = e7;
                                }
                                File file2 = new File(campaignEx2.getMraid());
                                if (!file2.exists() || !file2.isFile() || !file2.canRead()) {
                                    b("mraid resource write fail", metricsData);
                                } else if (campaignEx2.getOfferType() == 99) {
                                    if (b(campaignEx2)) {
                                        if (!y0.a(campaignEx2.getendcard_url())) {
                                        }
                                        if (com.mbridge.msdk.util.b.a()) {
                                            if (t0.c(this.f1752a, campaignEx2.getPackageName())) {
                                                i2 = 1;
                                            } else {
                                                i2 = 2;
                                            }
                                            campaignEx2.setRtinsType(i2);
                                        }
                                        if (com.mbridge.msdk.foundation.same.c.b(this.f1752a, campaignEx2)) {
                                            copyOnWriteArrayList.add(campaignEx2);
                                        } else {
                                            t0.a(this.b, campaignEx2, com.mbridge.msdk.foundation.same.a.x);
                                            this.R = "APP ALREADY INSTALLED";
                                        }
                                        a(campaignEx2, metricsData);
                                    } else if (y0.a(campaignEx2.getVideoUrlEncode())) {
                                        this.R = "No video campaign";
                                    } else {
                                        if (com.mbridge.msdk.util.b.a()) {
                                            if (t0.c(this.f1752a, campaignEx2.getPackageName())) {
                                                i2 = 1;
                                            } else {
                                                i2 = 2;
                                            }
                                            campaignEx2.setRtinsType(i2);
                                        }
                                        if (com.mbridge.msdk.foundation.same.c.b(this.f1752a, campaignEx2)) {
                                            copyOnWriteArrayList.add(campaignEx2);
                                        } else {
                                            t0.a(this.b, campaignEx2, com.mbridge.msdk.foundation.same.a.x);
                                            this.R = "APP ALREADY INSTALLED";
                                        }
                                        a(campaignEx2, metricsData);
                                    }
                                }
                            }
                        } else if (campaignEx2.getOfferType() == 99) {
                            if (b(campaignEx2)) {
                                if (!y0.a(campaignEx2.getendcard_url()) && TextUtils.isEmpty(campaignEx2.getMraid())) {
                                    this.R = "No video campaign";
                                } else {
                                    if (com.mbridge.msdk.util.b.a() && t0.c(campaignEx2)) {
                                        if (t0.c(this.f1752a, campaignEx2.getPackageName())) {
                                            i2 = 1;
                                        } else {
                                            i2 = 2;
                                        }
                                        campaignEx2.setRtinsType(i2);
                                    }
                                    if (com.mbridge.msdk.foundation.same.c.b(this.f1752a, campaignEx2)) {
                                        copyOnWriteArrayList.add(campaignEx2);
                                    } else {
                                        t0.a(this.b, campaignEx2, com.mbridge.msdk.foundation.same.a.x);
                                        this.R = "APP ALREADY INSTALLED";
                                    }
                                    a(campaignEx2, metricsData);
                                }
                            } else if (y0.a(campaignEx2.getVideoUrlEncode())) {
                                this.R = "No video campaign";
                            } else {
                                if (com.mbridge.msdk.util.b.a()) {
                                    if (t0.c(this.f1752a, campaignEx2.getPackageName())) {
                                        i2 = 1;
                                    } else {
                                        i2 = 2;
                                    }
                                    campaignEx2.setRtinsType(i2);
                                }
                                if (com.mbridge.msdk.foundation.same.c.b(this.f1752a, campaignEx2)) {
                                    copyOnWriteArrayList.add(campaignEx2);
                                } else {
                                    t0.a(this.b, campaignEx2, com.mbridge.msdk.foundation.same.a.x);
                                    this.R = "APP ALREADY INSTALLED";
                                }
                                a(campaignEx2, metricsData);
                            }
                        }
                    }
                }
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                    } catch (IOException e8) {
                        e2 = e8;
                        if (MBridgeConstans.DEBUG) {
                            o0.b("RewardMVVideoAdapter", e2.getMessage());
                        }
                    }
                }
            } catch (Exception e9) {
                e = e9;
            }
            return copyOnWriteArrayList;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public void a(com.mbridge.msdk.video.bt.module.orglistener.h hVar, String str, String str2, int i2, String str3, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            this.i = hVar;
            if (this.f1752a != null && !y0.a(this.b)) {
                Intent intent = new Intent(this.f1752a, (Class<?>) MBRewardVideoActivity.class);
                intent.putExtra(MBRewardVideoActivity.INTENT_UNITID, this.b);
                intent.putExtra(MBridgeConstans.PLACEMENT_ID, this.c);
                intent.putExtra(MBRewardVideoActivity.INTENT_REWARD, str);
                intent.putExtra(MBRewardVideoActivity.INTENT_MUTE, i2);
                intent.putExtra(MBRewardVideoActivity.INTENT_ISIV, this.q);
                intent.putExtra(MBRewardVideoActivity.INTENT_ISBID, this.r);
                intent.putExtra(MBRewardVideoActivity.INTENT_EXTRADATA, str3);
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(this.b);
                boolean z = false;
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    CampaignEx campaignEx = copyOnWriteArrayListB.get(0);
                    if (campaignEx != null) {
                        this.G = campaignEx.getRequestId();
                    }
                    if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                        z = true;
                    }
                    a();
                } else {
                    com.mbridge.msdk.video.bt.module.orglistener.h hVar2 = this.i;
                    if (hVar2 != null) {
                        hVar2.a(cVar, "load failed");
                        return;
                    }
                }
                intent.putExtra(MBRewardVideoActivity.INTENT_ISBIG_OFFER, z);
                if (this.q) {
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_MODETYPE, this.u);
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUETYPE, this.v);
                    intent.putExtra(MBRewardVideoActivity.INTENT_IVREWARD_VALUE, this.w);
                }
                if (!TextUtils.isEmpty(str2)) {
                    intent.putExtra(MBRewardVideoActivity.INTENT_USERID, str2);
                }
                RewardUnitCacheManager.getInstance().add(this.c, this.b, this.k);
                try {
                    if (com.mbridge.msdk.foundation.controller.c.n() != null && com.mbridge.msdk.foundation.controller.c.n().f() != null) {
                        ((Activity) com.mbridge.msdk.foundation.controller.c.n().f()).startActivity(intent);
                        return;
                    }
                } catch (Throwable th) {
                    o0.b("RewardMVVideoAdapter", th.getMessage());
                }
                intent.addFlags(268435456);
                this.f1752a.startActivity(intent);
                return;
            }
            com.mbridge.msdk.video.bt.module.orglistener.h hVar3 = this.i;
            if (hVar3 != null) {
                hVar3.a(cVar, "context or unitid is null");
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            com.mbridge.msdk.video.bt.module.orglistener.h hVar4 = this.i;
            if (hVar4 != null) {
                hVar4.a(cVar, "show failed, exception is " + e2.getMessage());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006f A[EDGE_INSN: B:26:0x006f->B:27:0x0072 BREAK  A[LOOP:0: B:18:0x004e->B:40:0x004e]] */
    private void a() {
        String strD;
        String strB;
        List<com.mbridge.msdk.foundation.entity.d> listA = com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(this.b, this.G);
        if (listA != null) {
            int size = listA.size();
            String strD2 = com.mbridge.msdk.foundation.same.buffer.b.d(this.b);
            if (size == 0) {
                return;
            }
            try {
                if (size == 1) {
                    if (listA.get(0) != null) {
                        strD = listA.get(0).d();
                        strB = listA.get(0).b();
                    } else {
                        strB = "";
                        strD = "";
                        break;
                    }
                } else if (!TextUtils.isEmpty(strD2)) {
                    Iterator<com.mbridge.msdk.foundation.entity.d> it = listA.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            com.mbridge.msdk.foundation.entity.d next = it.next();
                            if (next != null && strD2.equals(next.a())) {
                                strD = next.d();
                                strB = next.b();
                                break;
                            }
                        } else {
                            strB = "";
                            strD = "";
                            break;
                        }
                    }
                } else {
                    strB = "";
                    strD = "";
                    break;
                }
                if (TextUtils.isEmpty(strD) || !strD.equals(this.G)) {
                    return;
                }
                com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).b(strD2, this.b);
                com.mbridge.msdk.foundation.same.buffer.b.a(this.b, this.G, strB);
                com.mbridge.msdk.foundation.same.buffer.b.e(this.b);
            } catch (Exception e2) {
                o0.a("RewardMVVideoAdapter", e2.getMessage());
            }
        }
    }

    public void a(int i2, int i3, boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        a(i2, i3, z, "", this.z, cVar);
    }

    public void a(int i2, int i3, boolean z, String str, boolean z2, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        CampaignEx campaignEx;
        this.e = i2;
        this.f = i3;
        this.g = z;
        this.B = str;
        this.z = z2;
        boolean zB = false;
        this.Q = false;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.y;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0 && (campaignEx = this.y.get(0)) != null && TextUtils.isEmpty(campaignEx.getNLRid())) {
            this.y.clear();
        }
        List<CampaignEx> list = this.S;
        if (list != null) {
            list.clear();
        }
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.T;
        if (copyOnWriteArrayList2 != null) {
            copyOnWriteArrayList2.clear();
        }
        this.L = false;
        this.M = false;
        synchronized (this.n) {
            try {
                if (this.N) {
                    this.N = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.P = false;
        this.O = false;
        try {
            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(this.f1752a);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardMVVideoAdapter", e2.getMessage());
            }
        }
        if (!zB) {
            com.mbridge.msdk.foundation.error.b bVarA = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available");
            if (cVar != null) {
                cVar.a(bVarA);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is WebView is not available", cVar);
            return;
        }
        if (this.f1752a == null) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null");
            if (cVar != null) {
                cVar.a(bVarA2);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is Context is null", cVar);
            return;
        }
        if (y0.a(this.b)) {
            com.mbridge.msdk.foundation.error.b bVarA3 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null");
            if (cVar != null) {
                cVar.a(bVarA3);
            }
            b("errorCode: 3507 errorMessage: data load failed, errorMsg is UnitId is null", cVar);
            return;
        }
        if (this.k == null) {
            com.mbridge.msdk.foundation.error.b bVarA4 = com.mbridge.msdk.foundation.error.a.a(880001, "errorCode: 3507 errorMessage: data load failed, errorMsg is RewardUnitSetting is null");
            if (cVar != null) {
                cVar.a(bVarA4);
            }
            b("RewardUnitSetting is null", cVar);
            return;
        }
        d();
        c();
        o0.c("RewardMVVideoAdapter", "load 开始清除过期数据");
        b();
        a(str, z2, cVar);
    }

    private void b(List<CampaignEx> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    this.d += list.size();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        com.mbridge.msdk.videocommon.setting.c cVar = this.k;
        if (cVar == null || this.d > cVar.r()) {
            this.d = 0;
        }
        if (y0.b(this.b)) {
            com.mbridge.msdk.reward.controller.a.a(this.b, this.d);
        }
    }

    private boolean b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x002a A[Catch: Exception -> 0x0027, TryCatch #0 {Exception -> 0x0027, blocks: (B:4:0x0004, B:6:0x000a, B:14:0x0021, B:18:0x002f, B:20:0x004d, B:22:0x0055, B:24:0x0059, B:27:0x0062, B:29:0x007b, B:28:0x0070, B:30:0x0091, B:17:0x002a), top: B:36:0x0004 }] */
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, int i2) {
        Object objA;
        if (cVar != null) {
            try {
                if (cVar.B()) {
                    return;
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (i2 == 3 || i2 == 880023 || i2 == 880041) {
                    eVar.a("result", "2");
                } else {
                    switch (i2) {
                        case 10:
                        case 11:
                        case 12:
                            eVar.a("result", "2");
                            break;
                        default:
                            eVar.a("result", "1");
                            break;
                    }
                }
                eVar.a("timeout", this.f + "");
                com.mbridge.msdk.foundation.error.b bVarP = cVar.p();
                if (bVarP != null && (objA = bVarP.a("campaign_request_error")) != null && (objA instanceof com.mbridge.msdk.foundation.same.net.exception.a)) {
                    if (((com.mbridge.msdk.foundation.same.net.exception.a) objA).c != null) {
                        eVar.a("code", Integer.valueOf(((com.mbridge.msdk.foundation.same.net.exception.a) objA).c.d));
                    } else {
                        eVar.a("code", Integer.valueOf(bVarP.b()));
                    }
                    eVar.a("reason", bVarP.h());
                    eVar.a("err_desc", bVarP.e());
                    cVar.a((com.mbridge.msdk.foundation.error.b) null);
                }
                eVar.a("hst", k());
                cVar.a("2000126", eVar);
                com.mbridge.msdk.reward.report.metrics.a.a().a("2000126", cVar);
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.I != null) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 3;
            if (cVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.o());
                messageObtain.setData(bundle);
            }
            this.I.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i2, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.I != null) {
            if (TextUtils.isEmpty(str)) {
                str = "load fail exception";
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = str;
            messageObtain.arg1 = i2;
            if (cVar != null) {
                cVar.b(true);
                Bundle bundle = new Bundle();
                bundle.putString("metrics_data_lrid", cVar.o());
                messageObtain.setData(bundle);
            }
            if (str.contains("exception")) {
                this.I.sendMessageAtFrontOfQueue(messageObtain);
            } else {
                this.I.sendMessage(messageObtain);
            }
        }
    }

    private void a(j jVar, CampaignEx campaignEx) {
        if (jVar == null || jVar.a(campaignEx.getId())) {
            return;
        }
        com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
        gVar.a(campaignEx.getId());
        gVar.b(campaignEx.getFca());
        gVar.c(campaignEx.getFcb());
        gVar.a(0);
        gVar.d(0);
        gVar.a(System.currentTimeMillis());
        jVar.b(gVar);
    }

    private void a(String str, String str2, List<CampaignEx> list) {
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, str2, list);
        }
    }

    public void a(com.mbridge.msdk.reward.adapter.a aVar) {
        this.j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit) throws Throwable {
        this.x = campaignUnit;
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = b(campaignUnit);
        new com.mbridge.msdk.reward.candidate.a(this.b, this.q).a(copyOnWriteArrayListB, this.B, this, this.b);
        a(copyOnWriteArrayListB, true, false);
    }

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, boolean z, boolean z2) {
        com.mbridge.msdk.foundation.same.report.metrics.c metricsData;
        try {
            if (z2) {
                this.S = copyOnWriteArrayList;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
                this.T = copyOnWriteArrayList2;
                metricsData = a(copyOnWriteArrayList2);
            } else {
                metricsData = this.x.getMetricsData();
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                o0.b("RewardMVVideoAdapter", e2.getMessage());
            }
            metricsData = null;
        }
        a(this.x, copyOnWriteArrayList);
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            o0.c("RewardMVVideoAdapter", "onload load success size:" + copyOnWriteArrayList.size());
            if (z) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                if (z2) {
                    eVar.a("cache", 1);
                } else {
                    eVar.a("cache", 2);
                }
                if (metricsData != null) {
                    metricsData.a("2000127", eVar);
                    metricsData.a("2000048", eVar);
                }
                a(metricsData);
            }
            CampaignUnit campaignUnit = this.x;
            if (campaignUnit != null) {
                a(campaignUnit.getSessionId());
            }
            b(copyOnWriteArrayList);
            if (copyOnWriteArrayList.size() > 0) {
                o0.c("RewardMVVideoAdapter", "#######onload 把广告存在本地 size:" + copyOnWriteArrayList.size());
                a(this.c, this.b, copyOnWriteArrayList);
            }
            CampaignEx campaignEx = copyOnWriteArrayList.get(0);
            this.y = copyOnWriteArrayList;
            a(campaignEx);
            return;
        }
        o0.c("RewardMVVideoAdapter", "onload load fail, callback campaign have not video");
        if (TextUtils.isEmpty(this.R)) {
            this.R = "APP ALREADY INSTALLED";
        }
        a(this.R.contains("INSTALL") ? 880021 : 880003, this.R, metricsData);
    }

    private void a(CampaignEx campaignEx) {
        boolean z = !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl());
        int nscpt = campaignEx.getNscpt();
        this.L = false;
        this.M = false;
        synchronized (this.n) {
            try {
                if (this.N) {
                    this.N = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.P = false;
        this.O = false;
        if (this.r) {
            com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(campaignEx.getBidToken(), campaignEx.getCampaignUnitId(), campaignEx.getEncryptPrice());
        }
        com.mbridge.msdk.reward.adapter.b.b().a(this.f1752a, z, nscpt, this.r, this.q ? 287 : 94, this.c, this.b, campaignEx.getRequestId(), this.y, new C0223c(campaignEx, z, nscpt), new d(campaignEx, z, nscpt));
        if (z) {
            com.mbridge.msdk.reward.adapter.b.b().a(this.f1752a, campaignEx, this.c, this.b, campaignEx.getRequestId(), new e(campaignEx, z, nscpt));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, List<CampaignEx> list2, boolean z) {
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, list2, z);
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx : list2) {
                if (campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                    StringBuilder sbQ = DM.q(str, "_");
                    sbQ.append(campaignEx.getId());
                    sbQ.append("_");
                    sbQ.append(campaignEx.getRequestId());
                    sbQ.append("_");
                    sbQ.append(campaignEx.getRewardTemplateMode().e());
                    com.mbridge.msdk.videocommon.a.e(sbQ.toString());
                    com.mbridge.msdk.videocommon.a.b(campaignEx.getAdType(), campaignEx);
                }
            }
        }
        if (z) {
            a(str, list, list2);
        }
        if (list == null || list.size() <= 0) {
            return;
        }
        try {
            CampaignEx campaignEx2 = list.get(0);
            com.mbridge.msdk.reward.candidate.a aVar = new com.mbridge.msdk.reward.candidate.a(str, this.q);
            if (campaignEx2 == null || !TextUtils.isEmpty(campaignEx2.getNLRid())) {
                return;
            }
            aVar.a(campaignEx2.getLocalRequestId(), campaignEx2.getRequestId(), 1, campaignEx2.getEcppv());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    private void a(String str, List<CampaignEx> list, List<CampaignEx> list2) {
        CampaignEx campaignEx;
        String requestId;
        int vcn;
        String bidToken;
        String localRequestId = "";
        if (list == null) {
            vcn = 1;
            requestId = "";
            bidToken = requestId;
        } else {
            try {
                if (list.size() <= 0 || (campaignEx = list.get(0)) == null) {
                    vcn = 1;
                    requestId = "";
                    bidToken = requestId;
                } else {
                    requestId = campaignEx.getRequestId();
                    vcn = campaignEx.getVcn();
                    bidToken = campaignEx.getBidToken();
                    if (TextUtils.isEmpty(campaignEx.getNLRid())) {
                        localRequestId = campaignEx.getLocalRequestId();
                    }
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                    return;
                }
                return;
            }
        }
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().b(str, localRequestId);
            com.mbridge.msdk.videocommon.cache.a.a().b(str);
        }
        if (com.mbridge.msdk.videocommon.cache.a.a() != null) {
            com.mbridge.msdk.videocommon.cache.a.a().a(str, vcn);
        }
        if (list != null && list.size() > 0) {
            com.mbridge.msdk.reward.controller.a.a(requestId, bidToken);
            for (CampaignEx campaignEx2 : list) {
                if (campaignEx2 != null) {
                    com.mbridge.msdk.foundation.same.buffer.b.a(campaignEx2.getCampaignUnitId(), campaignEx2.getRequestId(), campaignEx2.getId(), campaignEx2.getPlct(), campaignEx2.getPlctb(), campaignEx2.getTimestamp());
                }
            }
        }
        if (list2 != null && list2.size() > 0) {
            for (CampaignEx campaignEx3 : list2) {
                if (campaignEx3 != null) {
                    com.mbridge.msdk.foundation.same.buffer.b.c(campaignEx3.getCampaignUnitId(), campaignEx3.getRequestId());
                }
            }
        }
        com.mbridge.msdk.foundation.same.buffer.b.e(str);
        com.mbridge.msdk.foundation.db.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list, boolean z, String str2) {
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0) {
            CampaignEx campaignEx = list.get(0);
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getEcppv()) && !TextUtils.isEmpty(str2)) {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z, str2);
                return;
            } else {
                com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, list, z);
                return;
            }
        }
        com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a(str, (CampaignEx) null, z, str2);
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f1752a, cVar, new f());
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    private void a(CampaignUnit campaignUnit, List<CampaignEx> list) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new g(campaignUnit));
    }

    private void a(String str) {
        if (y0.b(str)) {
            com.mbridge.msdk.reward.controller.a.W = str;
        }
    }

    public void a(int i2, int i3, int i4) {
        this.u = i2;
        this.v = i3;
        this.w = i4;
    }

    public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        if (this.k != null && TextUtils.isEmpty(str)) {
            int iQ = this.k.q() * 1000;
            List<CampaignEx> list = this.U;
            if (list != null && list.size() > 0) {
                if (System.currentTimeMillis() - this.U.get(0).getTimestamp() < iQ) {
                    b("hit ltorwc", cVar);
                    return;
                }
            }
        }
        b(str, this.z, cVar);
    }

    public void a(String str, boolean z, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.same.threadpool.a.f().execute(new i(str, cVar));
        if (this.I != null) {
            h hVar = new h(str, cVar);
            this.C = hVar;
            this.I.postDelayed(hVar, 90000L);
            return;
        }
        b(str, z, cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(Message message) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        if (message == null) {
            return cVar;
        }
        try {
            Bundle data = message.getData();
            return data != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().a(data.getString("metrics_data_lrid")) : cVar;
        } catch (Exception e2) {
            if (!MBridgeConstans.DEBUG) {
                return cVar;
            }
            e2.printStackTrace();
            return cVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0059  */
    /* JADX WARN: Code duplicated, block: B:16:0x005c  */
    private com.mbridge.msdk.foundation.same.report.metrics.c a(List<CampaignEx> list) {
        int i2;
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        String localRequestId = "";
        if (list != null) {
            try {
                if (list.size() > 0) {
                    if (list.get(0) != null) {
                        localRequestId = list.get(0).getLocalRequestId();
                    }
                    cVar.h(localRequestId);
                    cVar.b(list);
                }
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
                eVar.a("auto_load", 2);
                cVar.a("2000127", eVar);
                cVar.a("2000048", eVar);
                if (this.q) {
                    i2 = 287;
                } else {
                    i2 = 94;
                }
                cVar.a(i2);
                cVar.g("1");
                cVar.e("2");
                if (!TextUtils.isEmpty(localRequestId) && !com.mbridge.msdk.foundation.same.report.metrics.d.b().c().containsKey(localRequestId)) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(localRequestId, cVar);
                }
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        } else {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            eVar2.a(CampaignEx.JSON_KEY_HB, 1);
            eVar2.a("auto_load", 2);
            cVar.a("2000127", eVar2);
            cVar.a("2000048", eVar2);
            if (this.q) {
                i2 = 287;
            } else {
                i2 = 94;
            }
            cVar.a(i2);
            cVar.g("1");
            cVar.e("2");
            if (!TextUtils.isEmpty(localRequestId)) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().c().put(localRequestId, cVar);
            }
        }
        return cVar;
    }

    private void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.e eVar, List<CampaignEx> list) {
        if (cVar != null) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        cVar.b(list);
                        CampaignEx campaignEx = list.get(0);
                        if (campaignEx != null) {
                            cVar.h(campaignEx.getLocalRequestId());
                        }
                    }
                } catch (Exception e2) {
                    if (MBridgeConstans.DEBUG) {
                        e2.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            cVar.m(this.b);
            cVar.a(this.q ? 287 : 94);
            if (eVar != null) {
                cVar.a("m_temp_is_ready_check", eVar);
            }
            com.mbridge.msdk.reward.report.metrics.a.a().a("m_temp_is_ready_check", cVar);
        }
    }
}
