package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.y0;
import com.mbridge.msdk.newreward.function.common.MBridgeError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class l {
    private com.mbridge.msdk.videocommon.listener.a c;
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> e;
    private Context h;
    private String j;
    private com.mbridge.msdk.videocommon.setting.c k;
    private int m;
    private k p;
    private boolean q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<CampaignEx> f2396a = new ArrayList();
    private boolean b = true;
    private String d = "";
    private c f = new a();
    private CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> g = new CopyOnWriteArrayList<>();
    private long i = 3600;
    private int l = 1;
    com.mbridge.msdk.setting.l n = null;
    com.mbridge.msdk.setting.l o = null;

    public class a implements c {
        public a() {
        }

        @Override // com.mbridge.msdk.videocommon.download.c
        public void onProgress(long j, int i) {
            if (i == 5 || i == 4) {
                l.this.b = true;
                l.this.d();
            }
            if (i == 2) {
                l.this.b = true;
            }
        }
    }

    public l(Context context, List<CampaignEx> list, String str, int i) {
        this.m = 1;
        try {
            boolean zB = j.a().b(i);
            this.q = zB;
            if (zB) {
                this.j = str;
                this.m = i;
                this.p = new k(list, str, i);
                return;
            }
        } catch (Exception unused) {
            this.p = null;
            this.q = false;
        }
        this.h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list2 = this.f2396a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.j = str;
        this.m = i;
        a(this.f2396a);
    }

    private boolean a(CampaignEx.c cVar) {
        return true;
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> c() {
        k kVar;
        return (!this.q || (kVar = this.p) == null) ? this.g : kVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00da  */
    public void d() {
        int iG;
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.j();
            return;
        }
        b();
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    if (!a(this.g)) {
                        this.b = true;
                    }
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.g) {
                        if (map != null) {
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && !value.o()) {
                                    if (this.m == 95) {
                                        this.b = true;
                                    }
                                    int iJ = value.j();
                                    CampaignEx campaignExC = value.c();
                                    if (campaignExC != null && iJ == 0) {
                                        iJ = com.mbridge.msdk.videocommon.download.b.getInstance().b(campaignExC.getId(), campaignExC.getVideoUrlEncode());
                                    }
                                    int i = iJ;
                                    value.a(new b(campaignExC));
                                    int iB = b(campaignExC);
                                    if (this.m == 1) {
                                        if (this.n == null) {
                                            this.n = com.mbridge.msdk.setting.l.i(this.j);
                                        }
                                        iB = a(campaignExC);
                                    }
                                    int i2 = iB;
                                    value.d(i2);
                                    int i3 = this.m;
                                    if (i3 == 94 || i3 == 287 || i3 == 95) {
                                        if (this.k == null) {
                                            this.k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.j, this.m == 287);
                                        }
                                        com.mbridge.msdk.videocommon.setting.c cVar = this.k;
                                        iG = cVar != null ? cVar.g() : 0;
                                    } else {
                                        if (i3 != 298) {
                                            iG = 0;
                                        } else {
                                            if (this.o == null) {
                                                this.o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                                            }
                                            com.mbridge.msdk.setting.l lVar = this.o;
                                            if (lVar != null) {
                                                iG = lVar.i();
                                            } else {
                                                iG = 0;
                                            }
                                        }
                                        if (this.m == 1) {
                                            if (this.n == null) {
                                                this.n = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                                            }
                                            com.mbridge.msdk.setting.l lVar2 = this.n;
                                            if (lVar2 != null) {
                                                iG = lVar2.i();
                                            }
                                        }
                                    }
                                    value.b(iG);
                                    int videoCtnType = campaignExC != null ? campaignExC.getVideoCtnType() : 1;
                                    value.e(videoCtnType);
                                    o0.b("UnitCacheCtroller", "ready_rate : " + i2 + " cd_rate : " + iG + " videoCtnType : " + videoCtnType);
                                    if (a(value, b(campaignExC))) {
                                        String videoUrlEncode = campaignExC != null ? campaignExC.getVideoUrlEncode() : "";
                                        com.mbridge.msdk.videocommon.listener.a aVar = this.c;
                                        if (aVar != null) {
                                            int i4 = this.m;
                                            if (i4 == 297 || i4 == 298) {
                                                try {
                                                    aVar.a(videoUrlEncode);
                                                } catch (Exception e) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        o0.b("UnitCacheCtroller", e.getMessage());
                                                    }
                                                }
                                            }
                                        }
                                        ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> concurrentHashMap = this.e;
                                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                                            com.mbridge.msdk.videocommon.listener.a aVar2 = this.e.get(campaignExC != null ? campaignExC.getRequestId() : "");
                                            if (aVar2 != null && campaignExC != null) {
                                                try {
                                                    aVar2.a(videoUrlEncode);
                                                } catch (Exception e2) {
                                                    if (MBridgeConstans.DEBUG) {
                                                        o0.b("UnitCacheCtroller", e2.getMessage());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i != 1 && (i != 5 || !a(value, i2))) {
                                        if (i == 4) {
                                            continue;
                                        } else {
                                            if (k0.s(this.h) != 9 && this.l == 2) {
                                                return;
                                            }
                                            if (i == 2 || this.b) {
                                                value.a(this.f);
                                                if (a(value, i2)) {
                                                    int i5 = this.m;
                                                    if (i5 == 94 || i5 == 287) {
                                                        value.w();
                                                    }
                                                } else {
                                                    int i6 = this.m;
                                                    if (i6 == 1 || i6 == 95 || i6 == 298) {
                                                        this.b = false;
                                                    }
                                                    value.w();
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void e() {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.k();
            return;
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.g) {
                            if (map != null) {
                                Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                    if (value != null && value.j() == 1) {
                                        value.e("playing and stop download");
                                        value.b();
                                        this.g.remove(map);
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    o0.b("UnitCacheCtroller", th2.getMessage());
                }
            }
        }
    }

    public void f(CampaignEx campaignEx) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f2396a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        a(this.f2396a);
    }

    public void b(List<CampaignEx> list) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f2396a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.f2396a);
    }

    private int c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.o == null) {
                    this.o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                }
                return this.o.C();
            }
            if (campaignEx.getAdType() == 42) {
                return a((CampaignEx) null);
            }
            if (this.k == null) {
                this.k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.j, false);
            }
            return this.k.w();
        } catch (Throwable th) {
            o0.b("UnitCacheCtroller", th.getMessage(), th);
            return 100;
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.a(aVar);
        } else {
            this.c = aVar;
        }
    }

    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f2398a;

        public b(CampaignEx campaignEx) {
            this.f2398a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            com.mbridge.msdk.videocommon.listener.a aVar;
            if (l.this.c != null) {
                l.this.c.a(str);
            }
            if (l.this.e == null || l.this.e.size() <= 0 || this.f2398a == null || (aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.e.get(this.f2398a.getRequestId())) == null) {
                return;
            }
            aVar.a(str);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            com.mbridge.msdk.videocommon.listener.a aVar;
            if (l.this.c != null) {
                l.this.c.a(str, str2);
            }
            CampaignEx campaignEx = this.f2398a;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f2398a.getRsIgnoreCheckRule().size() <= 0 || !this.f2398a.getRsIgnoreCheckRule().contains(0)) {
                if (l.this.e == null || l.this.e.size() <= 0 || this.f2398a == null || (aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.e.get(this.f2398a.getRequestId())) == null) {
                    return;
                }
                aVar.a(str, str2);
                return;
            }
            o0.c("UnitCacheCtroller", "Is not check video download status");
        }
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.a(str, aVar);
            return;
        }
        if (this.e == null) {
            this.e = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.e.put(str, aVar);
    }

    public void b() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.a();
            return;
        }
        if (q0.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.g) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i = 0;
                    while (i < this.g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null) {
                                if (jCurrentTimeMillis - value.i() > this.i * 1000 && value.j() == 1) {
                                    value.e(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                    value.c(this.l);
                                    value.b();
                                    this.g.remove(map);
                                    i--;
                                }
                                if (value.j() != 1 && value.j() != 5 && value.j() != 0) {
                                    value.b();
                                    this.g.remove(map);
                                    i--;
                                }
                            }
                        }
                        i++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:115:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c5 A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:115:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d3 A[Catch: Exception -> 0x00f2, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:115:0x00b2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00eb A[Catch: Exception -> 0x00f2, TRY_LEAVE, TryCatch #3 {Exception -> 0x00f2, blocks: (B:34:0x00b2, B:36:0x00bc, B:38:0x00c5, B:39:0x00cb, B:41:0x00d3, B:42:0x00e7, B:44:0x00eb), top: B:115:0x00b2 }] */
    private void a(List<CampaignEx> list) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        com.mbridge.msdk.videocommon.setting.a aVarC;
        com.mbridge.msdk.videocommon.setting.c cVar;
        if (list == null || list.size() == 0) {
            return;
        }
        if (list.get(0) != null) {
            this.d = list.get(0).getCurrentLocalRid();
        }
        a();
        b();
        int i = this.m;
        if (i == 1) {
            try {
                if (!TextUtils.isEmpty(this.j)) {
                    com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                    this.n = lVarE;
                    if (lVarE == null) {
                        this.n = com.mbridge.msdk.setting.l.i(this.j);
                    }
                    com.mbridge.msdk.setting.l lVar = this.n;
                    if (lVar != null) {
                        this.i = lVar.p();
                        this.l = this.n.q();
                    }
                }
            } catch (Exception unused) {
                o0.b("UnitCacheCtroller", "make sure your had put native video jar into your project");
                return;
            }
        } else if (i == 287) {
            try {
                aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
                if (aVarC == null) {
                    com.mbridge.msdk.videocommon.setting.b.b().a();
                }
                if (aVarC != null) {
                    this.i = aVarC.c();
                }
                if (!TextUtils.isEmpty(this.j)) {
                    this.k = com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                }
                cVar = this.k;
                if (cVar != null) {
                    this.l = cVar.l();
                }
            } catch (Exception unused2) {
                o0.b("UnitCacheCtroller", "make sure your had put reward jar into your project");
                return;
            }
        } else if (i == 298) {
            com.mbridge.msdk.setting.l lVarA = com.mbridge.msdk.setting.h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
            this.o = lVarA;
            if (lVarA == null) {
                this.o = com.mbridge.msdk.setting.h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
            }
            com.mbridge.msdk.setting.l lVar2 = this.o;
            if (lVar2 != null) {
                this.i = lVar2.p();
                this.l = this.o.q();
            }
        } else if (i == 94) {
            aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC == null) {
                com.mbridge.msdk.videocommon.setting.b.b().a();
            }
            if (aVarC != null) {
                this.i = aVarC.c();
            }
            if (!TextUtils.isEmpty(this.j)) {
                this.k = com.mbridge.msdk.videocommon.setting.b.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
            }
            cVar = this.k;
            if (cVar != null) {
                this.l = cVar.l();
            }
        } else if (i == 95) {
            try {
                if (!TextUtils.isEmpty(this.j)) {
                    com.mbridge.msdk.setting.l lVarE2 = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.n().b(), this.j);
                    if (lVarE2 == null) {
                        lVarE2 = com.mbridge.msdk.setting.l.j(this.j);
                    }
                    if (lVarE2 != null) {
                        this.i = lVarE2.p();
                        this.l = lVarE2.q();
                    }
                }
            } catch (Exception unused3) {
                o0.b("UnitCacheCtroller", "make sure your had put feeds jar into your project");
                return;
            }
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            CampaignEx campaignEx = list.get(i2);
            if (campaignEx != null) {
                int i3 = this.m;
                String str = (i3 != 94 && i3 != 287) ? campaignEx.getId() + campaignEx.getVideoUrlEncode() + campaignEx.getBidToken() : campaignEx.getRequestId() + campaignEx.getId() + campaignEx.getVideoUrlEncode();
                if ((d(campaignEx) || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && (copyOnWriteArrayList = this.g) != null) {
                    synchronized (copyOnWriteArrayList) {
                        int i4 = 0;
                        while (true) {
                            try {
                                if (i4 < this.g.size()) {
                                    Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i4);
                                    if (map != null && map.containsKey(str)) {
                                        com.mbridge.msdk.videocommon.download.a aVar = map.get(str);
                                        if (aVar != null) {
                                            aVar.e(campaignEx);
                                            aVar.c(this.l);
                                            aVar.b(false);
                                            map.remove(str);
                                            map.put(str, aVar);
                                            this.g.set(i4, map);
                                        }
                                        e(campaignEx);
                                        break;
                                    }
                                    i4++;
                                } else {
                                    com.mbridge.msdk.videocommon.download.a aVar2 = new com.mbridge.msdk.videocommon.download.a(this.h, campaignEx, this.j, this.l);
                                    aVar2.c(this.l);
                                    aVar2.a(this.m);
                                    HashMap map2 = new HashMap();
                                    map2.put(str, aVar2);
                                    this.g.add(map2);
                                    break;
                                }
                            } catch (Throwable th) {
                                if (MBridgeConstans.DEBUG) {
                                    o0.b("UnitCacheCtroller", th.getMessage());
                                }
                            }
                        }
                        try {
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            }
        }
        List<CampaignEx> list2 = this.f2396a;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        this.f2396a.clear();
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    eVar.a("resumed_breakpoint", "2");
                } else {
                    eVar.a("resumed_breakpoint", "1");
                }
                eVar.a("resource_type", 4);
                eVar.a("scenes", "1");
                eVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    public l(Context context, CampaignEx campaignEx, String str, int i) {
        this.m = 1;
        try {
            boolean zB = j.a().b(i);
            this.q = zB;
            if (zB) {
                this.j = str;
                this.m = i;
                this.p = new k(campaignEx, str, i);
                return;
            }
        } catch (Exception unused) {
            this.p = null;
            this.q = false;
        }
        this.h = com.mbridge.msdk.foundation.controller.c.n().d();
        List<CampaignEx> list = this.f2396a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.j = str;
        this.m = i;
        a(this.f2396a);
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return c(campaignEx);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0186 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:101:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:102:0x0193 A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_LEAVE, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01a3 A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_LEAVE, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:118:0x01bc A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:120:0x01c6 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01d3 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:124:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:130:0x01ff A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0205 A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_LEAVE, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0210 A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_ENTER, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x021d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0233 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0239 A[PHI: r0 r12
  0x0239: PHI (r0v9 java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) = 
  (r0v8 java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>)
  (r0v18 java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>)
 binds: [B:42:0x00aa, B:148:0x0237] A[DONT_GENERATE, DONT_INLINE]
  0x0239: PHI (r12v4 int) = (r12v2 int), (r12v6 int) binds: [B:42:0x00aa, B:148:0x0237] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:150:0x023e A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0242 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0262 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x0264 A[Catch: all -> 0x0035, Exception -> 0x0038, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:189:0x019b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x020e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x01eb A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:90:0x015d A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_ENTER, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x016f A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_LEAVE, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0180 A[Catch: all -> 0x0035, Exception -> 0x0038, TRY_ENTER, TryCatch #1 {Exception -> 0x0038, blocks: (B:11:0x001b, B:15:0x0027, B:32:0x0073, B:33:0x0078, B:35:0x0080, B:36:0x0090, B:38:0x0096, B:40:0x00a4, B:43:0x00ae, B:44:0x00b8, B:46:0x00be, B:53:0x00dd, B:56:0x00e5, B:59:0x00ec, B:61:0x00fc, B:62:0x0104, B:90:0x015d, B:92:0x016f, B:98:0x0180, B:100:0x0186, B:145:0x022e, B:102:0x0193, B:106:0x019d, B:108:0x01a3, B:116:0x01af, B:118:0x01bc, B:120:0x01c6, B:122:0x01d3, B:128:0x01f9, B:130:0x01ff, B:132:0x0205, B:136:0x0210, B:144:0x0226, B:147:0x0233, B:150:0x023e, B:152:0x0242, B:154:0x024c, B:156:0x0252, B:160:0x025a, B:163:0x0264, B:165:0x026e, B:167:0x0274, B:66:0x0112, B:68:0x0118, B:70:0x0122, B:73:0x012c, B:75:0x0132, B:77:0x0138, B:78:0x013d, B:80:0x0143, B:84:0x014b, B:86:0x0155, B:23:0x003b, B:25:0x0047, B:31:0x005d, B:172:0x0290, B:29:0x0051), top: B:183:0x001b, outer: #0 }] */
    public com.mbridge.msdk.videocommon.download.a b(int i, boolean z) {
        List<CampaignEx> listC;
        List<CampaignEx> list;
        boolean zIsEmpty;
        int iJ;
        int i2;
        long jI;
        int i3;
        k kVar;
        int i4 = i;
        boolean z2 = z;
        if (this.q && (kVar = this.p) != null) {
            return kVar.i();
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                int i5 = this.m;
                int i6 = 94;
                if (i5 != 94 && i5 != 287) {
                    listC = com.mbridge.msdk.videocommon.cache.a.a().c(this.j, 1);
                    if (listC == null) {
                        return null;
                    }
                } else {
                    List<CampaignEx> listB = com.mbridge.msdk.videocommon.cache.a.a().b(this.j, 1, z2);
                    if ((listB == null || listB.size() == 0) && (i4 == 94 || i4 == 287)) {
                        listB = com.mbridge.msdk.videocommon.cache.a.a().c(this.j, 1, z2);
                    }
                    if (listB != null) {
                        o0.a("UnitCacheCtroller", "UnitCache isReady campaignList = " + listB.size());
                        listC = listB;
                    } else {
                        o0.a("UnitCacheCtroller", "UnitCache isReady campaignList = 0");
                        return null;
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i7 = 0;
                while (i7 < this.g.size()) {
                    Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i7);
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                        if (value == null || value.c() == null) {
                            list = listC;
                        } else {
                            CampaignEx campaignExC = value.c();
                            Iterator<CampaignEx> it2 = listC.iterator();
                            boolean z3 = false;
                            while (it2.hasNext()) {
                                if (campaignExC.getId().equals(it2.next().getId())) {
                                    z3 = true;
                                }
                            }
                            if (z3 && ((!z2 || campaignExC.isBidCampaign()) && (z2 || !campaignExC.isBidCampaign()))) {
                                String str = campaignExC.getendcard_url();
                                String videoUrlEncode = campaignExC.getVideoUrlEncode();
                                String strE = "";
                                if (campaignExC.getRewardTemplateMode() != null) {
                                    strE = campaignExC.getRewardTemplateMode().e();
                                }
                                String str2 = strE;
                                CampaignEx.c rewardTemplateMode = campaignExC.getRewardTemplateMode();
                                if (this.m == i6 || i4 == 287) {
                                    if (TextUtils.isEmpty(str2) || str2.contains(CampaignEx.KEY_IS_CMPT_ENTRY) || a(this.m, campaignExC, str2)) {
                                        if (b(str, campaignExC)) {
                                            if (value.o()) {
                                                value.t();
                                            } else {
                                                if (y0.a(videoUrlEncode)) {
                                                    if (a(rewardTemplateMode)) {
                                                        return value;
                                                    }
                                                } else if (a(value, b(campaignExC)) && a(rewardTemplateMode)) {
                                                    return value;
                                                }
                                                zIsEmpty = TextUtils.isEmpty(value.f());
                                                iJ = value.j();
                                                if (this.m != 298) {
                                                }
                                                if (iJ == 5) {
                                                    if (value.o()) {
                                                        value.t();
                                                        this.g.remove(map);
                                                        list = listC;
                                                    } else if (!zIsEmpty) {
                                                        value.a(0, 0);
                                                        if (this.m == 95) {
                                                            return value;
                                                        }
                                                    } else {
                                                        if (a(str, campaignExC)) {
                                                        }
                                                        return null;
                                                    }
                                                } else if (!q0.a().a("u_n_c_e_d", true)) {
                                                    jI = value.i();
                                                    if (value.j() == 1) {
                                                        list = listC;
                                                        if (jCurrentTimeMillis - jI > this.i * 1000) {
                                                            value.e(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                                            value.b();
                                                            this.g.remove(map);
                                                            i7--;
                                                            i3 = this.m;
                                                            if (i3 != 1) {
                                                                continue;
                                                            }
                                                        }
                                                    } else {
                                                        list = listC;
                                                    }
                                                    if (this.m == 95) {
                                                        if (value.o()) {
                                                            return value;
                                                        }
                                                        value.t();
                                                        this.g.remove(map);
                                                    } else {
                                                        if (q0.a().a("u_n_c_e_d", true)) {
                                                        }
                                                        if (iJ == 1) {
                                                            if (value.o()) {
                                                                if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                    return value;
                                                                }
                                                            }
                                                        }
                                                        i2 = this.m;
                                                        if (i2 != 94) {
                                                        }
                                                    }
                                                } else {
                                                    list = listC;
                                                    if (this.m == 95) {
                                                        if (value.o()) {
                                                            return value;
                                                        }
                                                        value.t();
                                                        this.g.remove(map);
                                                    } else {
                                                        if (q0.a().a("u_n_c_e_d", true)) {
                                                        }
                                                        if (iJ == 1) {
                                                            if (value.o()) {
                                                                if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                    return value;
                                                                }
                                                            }
                                                        }
                                                        i2 = this.m;
                                                        if (i2 != 94) {
                                                        }
                                                    }
                                                }
                                                i7--;
                                            }
                                        } else {
                                            zIsEmpty = TextUtils.isEmpty(value.f());
                                            iJ = value.j();
                                            if (this.m != 298 && a(value, b(campaignExC))) {
                                                return value;
                                            }
                                            if (iJ == 5) {
                                                if (value.o()) {
                                                    value.t();
                                                    this.g.remove(map);
                                                    list = listC;
                                                } else if (!zIsEmpty) {
                                                    value.a(0, 0);
                                                    if (this.m == 95) {
                                                        return value;
                                                    }
                                                } else {
                                                    if (a(str, campaignExC) || !a(rewardTemplateMode)) {
                                                        return null;
                                                    }
                                                    return value;
                                                }
                                            } else if (!q0.a().a("u_n_c_e_d", true)) {
                                                jI = value.i();
                                                if (value.j() == 1) {
                                                    list = listC;
                                                    if (jCurrentTimeMillis - jI > this.i * 1000) {
                                                        value.e(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                                        value.b();
                                                        this.g.remove(map);
                                                        i7--;
                                                        i3 = this.m;
                                                        if (i3 != 1 || i3 == 94) {
                                                        }
                                                    }
                                                } else {
                                                    list = listC;
                                                }
                                                if (this.m == 95) {
                                                    if (value.o()) {
                                                        return value;
                                                    }
                                                    value.t();
                                                    this.g.remove(map);
                                                } else if (q0.a().a("u_n_c_e_d", true) && (iJ == 4 || iJ == 2)) {
                                                    this.g.remove(map);
                                                    value.b();
                                                } else {
                                                    if (iJ == 1) {
                                                        if (value.o()) {
                                                            if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY && a(value, b(campaignExC)) && a(str, campaignExC) && a(rewardTemplateMode)) {
                                                                return value;
                                                            }
                                                        }
                                                    }
                                                    i2 = this.m;
                                                    if ((i2 != 94 || i2 == 287) && a(value, b(campaignExC)) && a(str, campaignExC) && a(rewardTemplateMode)) {
                                                    }
                                                }
                                            } else {
                                                list = listC;
                                                if (this.m == 95) {
                                                    if (value.o()) {
                                                        return value;
                                                    }
                                                    value.t();
                                                    this.g.remove(map);
                                                } else {
                                                    if (q0.a().a("u_n_c_e_d", true)) {
                                                    }
                                                    if (iJ == 1) {
                                                        if (value.o()) {
                                                            if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                return value;
                                                            }
                                                        }
                                                    }
                                                    i2 = this.m;
                                                    return i2 != 94 ? value : value;
                                                }
                                            }
                                            i7--;
                                        }
                                    }
                                    list = listC;
                                } else {
                                    zIsEmpty = TextUtils.isEmpty(value.f());
                                    iJ = value.j();
                                    if (this.m != 298) {
                                    }
                                    if (iJ == 5) {
                                        if (value.o()) {
                                            value.t();
                                            this.g.remove(map);
                                            list = listC;
                                        } else if (!zIsEmpty) {
                                            value.a(0, 0);
                                            if (this.m == 95) {
                                                return value;
                                            }
                                            list = listC;
                                        } else {
                                            if (a(str, campaignExC)) {
                                            }
                                            return null;
                                        }
                                    } else if (!q0.a().a("u_n_c_e_d", true)) {
                                        jI = value.i();
                                        if (value.j() == 1) {
                                            list = listC;
                                            if (jCurrentTimeMillis - jI > this.i * 1000) {
                                                value.e(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                                value.b();
                                                this.g.remove(map);
                                                i7--;
                                                i3 = this.m;
                                                if (i3 != 1) {
                                                    continue;
                                                }
                                            }
                                        } else {
                                            list = listC;
                                        }
                                        if (this.m == 95) {
                                            if (value.o()) {
                                                return value;
                                            }
                                            value.t();
                                            this.g.remove(map);
                                        } else {
                                            if (q0.a().a("u_n_c_e_d", true)) {
                                            }
                                            if (iJ == 1) {
                                                if (value.o()) {
                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                        return value;
                                                    }
                                                }
                                            }
                                            i2 = this.m;
                                            if (i2 != 94) {
                                            }
                                        }
                                    } else {
                                        list = listC;
                                        if (this.m == 95) {
                                            if (value.o()) {
                                                return value;
                                            }
                                            value.t();
                                            this.g.remove(map);
                                        } else {
                                            if (q0.a().a("u_n_c_e_d", true)) {
                                            }
                                            if (iJ == 1) {
                                                if (value.o()) {
                                                    if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                        return value;
                                                    }
                                                }
                                            }
                                            i2 = this.m;
                                            if (i2 != 94) {
                                            }
                                        }
                                    }
                                    i7--;
                                }
                            } else {
                                list = listC;
                            }
                        }
                        z2 = z;
                        listC = list;
                        i6 = 94;
                        i4 = i;
                    }
                    i7++;
                    z2 = z;
                    i6 = 94;
                    i4 = i;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }
    }

    private boolean d(CampaignEx campaignEx) {
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

    private void a() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i = 0;
                    while (i < this.g.size()) {
                        try {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && value.c() != null && value.o()) {
                                    value.t();
                                    this.g.remove(map);
                                    i--;
                                }
                            }
                            i++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            } catch (Throwable unused) {
                o0.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01a8 A[Catch: all -> 0x00c1, Exception -> 0x0138, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b0 A[Catch: all -> 0x00c1, Exception -> 0x0138, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ba A[Catch: all -> 0x00c1, Exception -> 0x0138, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:120:0x01e8 A[Catch: all -> 0x00c1, Exception -> 0x021f, TryCatch #0 {Exception -> 0x021f, blocks: (B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:139:0x0231), top: B:201:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01f6 A[Catch: all -> 0x00c1, Exception -> 0x021f, TryCatch #0 {Exception -> 0x021f, blocks: (B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:139:0x0231), top: B:201:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:132:0x0226  */
    /* JADX WARN: Code duplicated, block: B:141:0x0242  */
    /* JADX WARN: Code duplicated, block: B:143:0x0247 A[Catch: all -> 0x00c1, Exception -> 0x0277, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x024d  */
    /* JADX WARN: Code duplicated, block: B:147:0x0250 A[Catch: all -> 0x00c1, Exception -> 0x0277, TRY_ENTER, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:149:0x0254 A[Catch: all -> 0x00c1, Exception -> 0x0277, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x0283  */
    /* JADX WARN: Code duplicated, block: B:166:0x0288  */
    /* JADX WARN: Code duplicated, block: B:172:0x029d A[Catch: all -> 0x00c1, Exception -> 0x0271, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:201:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0193 A[Catch: all -> 0x00c1, Exception -> 0x0138, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0199 A[Catch: all -> 0x00c1, Exception -> 0x0138, TryCatch #1 {all -> 0x00c1, blocks: (B:11:0x0025, B:12:0x002a, B:14:0x0032, B:15:0x0042, B:17:0x0048, B:19:0x0056, B:22:0x0065, B:23:0x006f, B:25:0x0075, B:28:0x007f, B:30:0x0089, B:32:0x0093, B:34:0x00a1, B:36:0x00af, B:38:0x00b9, B:48:0x00de, B:51:0x00e6, B:54:0x00f0, B:56:0x0100, B:58:0x010c, B:94:0x0184, B:96:0x0193, B:98:0x0199, B:100:0x01a8, B:102:0x01b0, B:104:0x01ba, B:106:0x01c1, B:108:0x01c7, B:110:0x01cb, B:114:0x01cf, B:116:0x01d8, B:118:0x01de, B:120:0x01e8, B:122:0x01f6, B:143:0x0247, B:147:0x0250, B:149:0x0254, B:151:0x025e, B:153:0x0264, B:156:0x026c, B:186:0x02ce, B:187:0x02d1, B:170:0x0293, B:172:0x029d, B:174:0x02a3, B:176:0x02a9, B:139:0x0231, B:61:0x011a, B:63:0x0120, B:65:0x012a, B:73:0x013e, B:75:0x0144, B:77:0x014a, B:78:0x0150, B:80:0x0156, B:82:0x015c, B:84:0x0163, B:86:0x016d, B:88:0x0173), top: B:203:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01a6 A[DONT_INVERT] */
    public List<com.mbridge.msdk.videocommon.download.a> a(String str, int i, boolean z, List<CampaignEx> list, boolean z2, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        long j;
        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it;
        String str2;
        String str3;
        String str4;
        boolean zIsEmpty;
        int iJ;
        long jI;
        String str5;
        long j2;
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            return kVar.a(list, z2);
        }
        ArrayList arrayList = new ArrayList();
        String str6 = "";
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList != null) {
            synchronized (copyOnWriteArrayList) {
                try {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        int i2 = 0;
                        while (i2 < this.g.size()) {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.g.get(i2);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it2 = map.entrySet().iterator();
                            while (it2.hasNext()) {
                                try {
                                    com.mbridge.msdk.videocommon.download.a value = it2.next().getValue();
                                    if (value != null && value.c() != null) {
                                        CampaignEx campaignExC = value.c();
                                        boolean z3 = false;
                                        for (CampaignEx campaignEx : list) {
                                            if (campaignExC != null && campaignEx != null && !TextUtils.isEmpty(campaignExC.getRequestId()) && !TextUtils.isEmpty(campaignEx.getRequestId()) && campaignExC.getId().equals(campaignEx.getId()) && campaignExC.getRequestId().equals(campaignEx.getRequestId())) {
                                                if (!TextUtils.isEmpty(campaignEx.getNLRid())) {
                                                    campaignExC.setNLRid(campaignEx.getNLRid());
                                                }
                                                z3 = true;
                                            }
                                        }
                                        if (!z3) {
                                            arrayList = arrayList;
                                            str6 = "campaign is not available";
                                            j = jCurrentTimeMillis;
                                            it = it2;
                                        } else if ((!z || campaignExC.isBidCampaign()) && (z || !campaignExC.isBidCampaign())) {
                                            String str7 = campaignExC.getendcard_url();
                                            String videoUrlEncode = campaignExC.getVideoUrlEncode();
                                            String strE = "";
                                            if (campaignExC.getRewardTemplateMode() != null) {
                                                strE = campaignExC.getRewardTemplateMode().e();
                                            }
                                            String str8 = strE;
                                            String str9 = str6;
                                            try {
                                                CampaignEx.c rewardTemplateMode = campaignExC.getRewardTemplateMode();
                                                it = it2;
                                                if (i == 94 || i == 287) {
                                                    if (!TextUtils.isEmpty(str8) && !str8.contains(CampaignEx.KEY_IS_CMPT_ENTRY) && !a(i, campaignExC, str8)) {
                                                        str4 = "template is null or download is not ready";
                                                    } else {
                                                        if (b(str7, campaignExC)) {
                                                            if (value.o()) {
                                                                value.t();
                                                                str4 = "task is displayed";
                                                            } else {
                                                                if (y0.a(videoUrlEncode)) {
                                                                    if (a(rewardTemplateMode)) {
                                                                        arrayList.add(value);
                                                                    } else {
                                                                        str3 = "image list is downloading or fail";
                                                                    }
                                                                } else if (a(value, b(campaignExC), z2) && a(rewardTemplateMode)) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str3 = "video and image list is downloading or fail";
                                                                }
                                                                arrayList = arrayList;
                                                                j = jCurrentTimeMillis;
                                                                str6 = str9;
                                                            }
                                                        } else {
                                                            str3 = "endcard is downloading or fail";
                                                        }
                                                        str9 = str3;
                                                        zIsEmpty = TextUtils.isEmpty(value.f());
                                                        iJ = value.j();
                                                        if (iJ == 5) {
                                                            if (value.o()) {
                                                                value.t();
                                                                this.g.remove(map);
                                                                i2--;
                                                                str4 = "task is displayed";
                                                            } else {
                                                                if (!zIsEmpty) {
                                                                    value.a(0, 0);
                                                                    if (i == 95) {
                                                                        arrayList.add(value);
                                                                    } else {
                                                                        str6 = "resource path is not effective";
                                                                    }
                                                                } else {
                                                                    if (a(str7, campaignExC) || !a(rewardTemplateMode)) {
                                                                        return null;
                                                                    }
                                                                    arrayList.add(value);
                                                                }
                                                                arrayList = arrayList;
                                                                j = jCurrentTimeMillis;
                                                                str6 = str9;
                                                            }
                                                            j = jCurrentTimeMillis;
                                                        } else {
                                                            arrayList = arrayList;
                                                            try {
                                                                if (q0.a().a("u_n_c_e_d", true)) {
                                                                    j = jCurrentTimeMillis;
                                                                } else {
                                                                    try {
                                                                        jI = value.i();
                                                                        if (value.j() == 1) {
                                                                            j2 = jCurrentTimeMillis - jI;
                                                                            j = jCurrentTimeMillis;
                                                                            if (j2 > this.i * 1000) {
                                                                                value.e(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                                                                value.b();
                                                                                this.g.remove(map);
                                                                                i2--;
                                                                                if (i != 1 || i == 94) {
                                                                                    str6 = "video download time over dlct";
                                                                                    arrayList = arrayList;
                                                                                } else {
                                                                                    str9 = "video download time over dlct";
                                                                                }
                                                                            }
                                                                        } else {
                                                                            j = jCurrentTimeMillis;
                                                                        }
                                                                        if (iJ != 4 || iJ == 2) {
                                                                            this.g.remove(map);
                                                                            value.b();
                                                                            i2--;
                                                                            str5 = "video download stop or pause";
                                                                        }
                                                                        str6 = str5;
                                                                        arrayList = arrayList;
                                                                    } catch (Exception e) {
                                                                        e = e;
                                                                        str6 = str9;
                                                                        arrayList = arrayList;
                                                                    }
                                                                }
                                                                if (iJ != 1) {
                                                                    if (value.o()) {
                                                                        str5 = "video was displayed";
                                                                        str6 = str5;
                                                                        arrayList = arrayList;
                                                                    } else {
                                                                        if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                            if (!a(value, b(campaignExC), z2) && a(str7, campaignExC) && a(rewardTemplateMode)) {
                                                                                arrayList = arrayList;
                                                                                try {
                                                                                    arrayList.add(value);
                                                                                } catch (Exception e2) {
                                                                                    e = e2;
                                                                                }
                                                                            } else {
                                                                                str9 = "video or endcard or image list is downloading or fail";
                                                                            }
                                                                        }
                                                                        if (i == 94) {
                                                                        }
                                                                        if (!a(value, b(campaignExC), z2)) {
                                                                        }
                                                                        str2 = "video or endcard or image list is downloading or fail";
                                                                        str6 = str2;
                                                                    }
                                                                    str6 = str9;
                                                                    e.printStackTrace();
                                                                } else if (i == 94 && i != 287) {
                                                                    arrayList = arrayList;
                                                                    str6 = str9;
                                                                } else if (!a(value, b(campaignExC), z2) && a(str7, campaignExC) && a(rewardTemplateMode)) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str2 = "video or endcard or image list is downloading or fail";
                                                                    str6 = str2;
                                                                }
                                                                str6 = str9;
                                                            } catch (Exception e3) {
                                                                e = e3;
                                                                arrayList = arrayList;
                                                            }
                                                        }
                                                        it2 = it;
                                                        jCurrentTimeMillis = j;
                                                    }
                                                    str6 = str4;
                                                    j = jCurrentTimeMillis;
                                                } else {
                                                    zIsEmpty = TextUtils.isEmpty(value.f());
                                                    iJ = value.j();
                                                    if (iJ == 5) {
                                                        if (value.o()) {
                                                            value.t();
                                                            this.g.remove(map);
                                                            i2--;
                                                            str4 = "task is displayed";
                                                            str6 = str4;
                                                        } else {
                                                            if (!zIsEmpty) {
                                                                value.a(0, 0);
                                                                if (i == 95) {
                                                                    arrayList.add(value);
                                                                } else {
                                                                    str6 = "resource path is not effective";
                                                                }
                                                            } else {
                                                                if (a(str7, campaignExC)) {
                                                                }
                                                                return null;
                                                            }
                                                            arrayList = arrayList;
                                                            j = jCurrentTimeMillis;
                                                            str6 = str9;
                                                        }
                                                        j = jCurrentTimeMillis;
                                                    } else {
                                                        arrayList = arrayList;
                                                        if (q0.a().a("u_n_c_e_d", true)) {
                                                            jI = value.i();
                                                            if (value.j() == 1) {
                                                                j2 = jCurrentTimeMillis - jI;
                                                                j = jCurrentTimeMillis;
                                                                if (j2 > this.i * 1000) {
                                                                    value.e(MBridgeError.ERROR_MESSAGE_DOWNLOAD_DOWNLOAD_TIMEOUT);
                                                                    value.b();
                                                                    this.g.remove(map);
                                                                    i2--;
                                                                    if (i != 1) {
                                                                    }
                                                                    str6 = "video download time over dlct";
                                                                    arrayList = arrayList;
                                                                }
                                                            } else {
                                                                j = jCurrentTimeMillis;
                                                            }
                                                            if (iJ != 4) {
                                                            }
                                                            this.g.remove(map);
                                                            value.b();
                                                            i2--;
                                                            str5 = "video download stop or pause";
                                                            str6 = str5;
                                                            arrayList = arrayList;
                                                        } else {
                                                            j = jCurrentTimeMillis;
                                                        }
                                                        if (iJ != 1) {
                                                            if (value.o()) {
                                                                str5 = "video was displayed";
                                                                str6 = str5;
                                                                arrayList = arrayList;
                                                            } else {
                                                                if (!MBridgeConstans.IS_DOWANLOAD_FINSH_PLAY) {
                                                                    if (!a(value, b(campaignExC), z2)) {
                                                                    }
                                                                    str9 = "video or endcard or image list is downloading or fail";
                                                                }
                                                                if (i == 94) {
                                                                }
                                                                if (!a(value, b(campaignExC), z2)) {
                                                                }
                                                                str2 = "video or endcard or image list is downloading or fail";
                                                                str6 = str2;
                                                            }
                                                            str6 = str9;
                                                            e.printStackTrace();
                                                        } else {
                                                            if (i == 94) {
                                                            }
                                                            if (!a(value, b(campaignExC), z2)) {
                                                            }
                                                            str2 = "video or endcard or image list is downloading or fail";
                                                            str6 = str2;
                                                        }
                                                        str6 = str9;
                                                    }
                                                    it2 = it;
                                                    jCurrentTimeMillis = j;
                                                }
                                            } catch (Exception e4) {
                                                e = e4;
                                                arrayList = arrayList;
                                            }
                                        }
                                        arrayList = arrayList;
                                        it2 = it;
                                        jCurrentTimeMillis = j;
                                    } else {
                                        arrayList = arrayList;
                                        j = jCurrentTimeMillis;
                                        it = it2;
                                        str2 = "task or task's campaign is NULL";
                                        str6 = str2;
                                        arrayList = arrayList;
                                        it2 = it;
                                        jCurrentTimeMillis = j;
                                    }
                                } catch (Exception e5) {
                                    e = e5;
                                    arrayList = arrayList;
                                }
                            }
                            i2++;
                        }
                        arrayList = arrayList;
                    } catch (Exception e6) {
                        e = e6;
                        arrayList = arrayList;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else {
            arrayList = arrayList;
        }
        try {
            if (arrayList.size() == 0 && eVar != null) {
                eVar.a("is_ready_fail_reason", str6);
            }
        } catch (Throwable th2) {
            o0.b("UnitCacheCtroller", th2.getMessage());
        }
        return arrayList;
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return y0.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || y0.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        o0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            kVar.c(str);
            return;
        }
        try {
            synchronized (this.g) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.g) != null && copyOnWriteArrayList.size() > 0) {
                        for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.g) {
                            if (map != null) {
                                for (Map.Entry<String, com.mbridge.msdk.videocommon.download.a> entry : map.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.g.remove(map);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("UnitCacheCtroller", e.getMessage());
            }
        }
    }

    public boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            CampaignEx campaignEx = list.get(i);
            if (campaignEx == null || !a(new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx, str, this.l), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i) {
        long jH = aVar.h();
        long jE = aVar.e();
        if (TextUtils.isEmpty(aVar.d())) {
            o0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i == 0) {
            if (aVar.c() != null && !TextUtils.isEmpty(aVar.c().getVideoUrlEncode())) {
                return true;
            }
        } else if (jE > 0 && jH * 100 >= jE * ((long) i)) {
            if (i != 100 || aVar.j() == 5) {
                return true;
            }
            aVar.b();
            return false;
        }
        return false;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i, boolean z) {
        long jH = aVar.h();
        long jE = aVar.e();
        if (TextUtils.isEmpty(aVar.d())) {
            o0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExC = aVar.c();
        if (campaignExC != null) {
            if (campaignExC.getRsIgnoreCheckRule() != null && campaignExC.getRsIgnoreCheckRule().size() > 0 && campaignExC.getRsIgnoreCheckRule().contains(0)) {
                o0.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExC.getIsTimeoutCheckVideoStatus() == 1 && campaignExC.getVideoCheckType() == 1) {
                return true;
            }
            if (z && campaignExC.getVideoCheckType() == 1) {
                if (i == 0) {
                    return true;
                }
                if ((jE != 0 || jH != 0) && jH >= ((long) (i / 100)) * jE) {
                    campaignExC.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !t0.l(str)) || y0.a(str) || b(str, campaignEx);
            }
            o0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th) {
            o0.b("UnitCacheCtroller", th.getMessage(), th);
            return false;
        }
    }

    private boolean a(int i, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            o0.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            o0.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(int i, boolean z) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            return kVar.d();
        }
        try {
            return b(i, z);
        } catch (Throwable th) {
            o0.b("UnitCacheCtroller", th.getMessage(), th);
            return null;
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        k kVar;
        if (this.q && (kVar = this.p) != null) {
            return kVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    for (Map<String, com.mbridge.msdk.videocommon.download.a> map : this.g) {
                        if (map != null && map.containsKey(str)) {
                            return map.get(str);
                        }
                    }
                } catch (Throwable unused) {
                    o0.b("UnitCacheCtroller", "failed to get campaignTast by cid");
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList) {
        try {
            for (Map<String, com.mbridge.msdk.videocommon.download.a> map : copyOnWriteArrayList) {
                if (map != null) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (it.next().getValue().j() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th.printStackTrace();
            return false;
        }
    }

    private int a(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.n;
            if (lVar != null) {
                return lVar.C();
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("UnitCacheCtroller", e.getMessage());
            }
        }
        return 100;
    }
}
