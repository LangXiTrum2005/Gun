package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.room.RoomMasterTable;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.k;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.i0;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.PreloadListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.tracker.network.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d extends com.mbridge.msdk.mbnative.controller.b {
    private static final String r = "d";
    private static Map<String, Map<Long, Object>> s = new HashMap();
    private static Map<String, Boolean> t = new HashMap();
    private static Map<String, k> u = new HashMap();
    private static Map<String, Integer> v = new HashMap();
    private static Map<String, Integer> w = new HashMap();
    private static d x = null;
    private static int y = -1;
    private static int z = -2;
    private j b;
    private com.mbridge.msdk.click.a c;
    private l d;
    private String e;
    private Map<String, Object> i;
    private List<Integer> j;
    protected List<Integer> k;
    private List<Integer> l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    Queue<Integer> f = null;
    Queue<Long> g = null;
    private int h = 0;
    private com.mbridge.msdk.foundation.same.task.b q = new com.mbridge.msdk.foundation.same.task.b(com.mbridge.msdk.foundation.controller.c.n().d());

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
        }
    }

    public class b extends com.mbridge.msdk.mbnative.service.net.b implements com.mbridge.msdk.foundation.same.task.d {
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private Runnable j;
        private com.mbridge.msdk.preload.listenter.a l;
        private List<String> h = null;
        private boolean i = false;
        private boolean k = true;

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f1442a;

            public a(CampaignUnit campaignUnit) {
                this.f1442a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (b.this.j != null) {
                    b bVar = b.this;
                    d.this.f1436a.removeCallbacks(bVar.j);
                }
                if (com.mbridge.msdk.util.b.a()) {
                    d.this.a(this.f1442a);
                }
                if (d.s.containsKey("0_" + b.this.unitId)) {
                    d.s.remove("0_" + b.this.unitId);
                }
                if (b.this.g > 0) {
                    if (this.f1442a.ads.size() > b.this.g) {
                        b bVar2 = b.this;
                        bVar2.d = bVar2.g;
                    } else {
                        b.this.d = this.f1442a.ads.size();
                    }
                } else if (b.this.g == -1) {
                    b.this.d = 0;
                } else if (b.this.g == -3) {
                    b.this.d = this.f1442a.ads.size();
                } else if (b.this.g == -2) {
                    if (this.f1442a.getTemplate() == 3) {
                        if (b.this.f != 0) {
                            b bVar3 = b.this;
                            bVar3.d = bVar3.f;
                        }
                    } else if (b.this.e != 0) {
                        b bVar4 = b.this;
                        bVar4.d = bVar4.e;
                    }
                    if (b.this.d <= 0) {
                        b.this.d = ((Integer) d.v.get(b.this.unitId)).intValue();
                    }
                }
                if (this.f1442a.ads.size() < b.this.d) {
                    b.this.d = this.f1442a.ads.size();
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < this.f1442a.ads.size(); i++) {
                    CampaignEx campaignEx = this.f1442a.ads.get(i);
                    campaignEx.setCampaignUnitId(b.this.unitId);
                    boolean zC = t0.c(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx.getPackageName());
                    d.this.a(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx);
                    if (arrayList.size() < b.this.d && campaignEx.getOfferType() != 99) {
                        if (t0.c(campaignEx)) {
                            campaignEx.setRtinsType(zC ? 1 : 2);
                        }
                        if (com.mbridge.msdk.foundation.same.c.b(com.mbridge.msdk.foundation.controller.c.n().d(), campaignEx)) {
                            arrayList.add(campaignEx);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList2.add(campaignEx);
                            }
                        } else {
                            t0.a(b.this.unitId, campaignEx, com.mbridge.msdk.foundation.same.a.x);
                        }
                        b.this.a(campaignEx, null, null);
                    }
                    d dVar = d.this;
                    dVar.a(dVar.m, campaignEx);
                }
                b bVar5 = b.this;
                d.this.a(arrayList2, bVar5.unitId);
                com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(this.f1442a.getAds().get(0) != null ? this.f1442a.getAds().get(0).getType() : 1);
                if (bVarA != null) {
                    bVarA.a(b.this.unitId, arrayList);
                }
                d.a(b.this.c, b.this.unitId);
                if (Looper.myLooper() != null && z) {
                    Looper.loop();
                }
                if (this.f1442a.getAds().get(0) != null) {
                    com.mbridge.msdk.click.c.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.f1442a.getAds().get(0).getMaitve(), this.f1442a.getAds().get(0).getMaitve_src());
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$b, reason: collision with other inner class name */
        public class C0191b extends com.mbridge.msdk.foundation.same.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignEx f1443a;
            final /* synthetic */ Context b;

            public C0191b(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
                this.f1443a = campaignEx;
                this.b = context;
            }

            @Override // com.mbridge.msdk.foundation.same.c.a
            public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
                com.mbridge.msdk.mbnative.report.a.a(str, cVar, this.f1443a, this.b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
            }
        }

        public class c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f1444a;
            final /* synthetic */ int b;

            public c(String str, int i) {
                this.f1444a = str;
                this.b = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (!b.this.i) {
                    if (b.this.j != null) {
                        b bVar = b.this;
                        d.this.f1436a.removeCallbacks(bVar.j);
                    }
                    if (b.this.a() == 1 || b.this.k) {
                        b bVar2 = b.this;
                        d dVar = d.this;
                        String str = this.f1444a;
                        int iA = bVar2.a();
                        b bVar3 = b.this;
                        dVar.a(str, iA, bVar3.unitId, bVar3.placementId, bVar3.l);
                    }
                } else if (b.this.k) {
                    b bVar4 = b.this;
                    d dVar2 = d.this;
                    String str2 = this.f1444a;
                    int iA2 = bVar4.a();
                    b bVar5 = b.this;
                    dVar2.a(str2, iA2, bVar5.unitId, bVar5.placementId, bVar5.l);
                }
                if (this.b == -1) {
                    d.b(b.this.c, b.this.unitId);
                }
                if (Looper.myLooper() == null || !z) {
                    return;
                }
                Looper.loop();
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.d$b$d, reason: collision with other inner class name */
        public class RunnableC0192d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ List f1445a;

            public RunnableC0192d(List list) {
                this.f1445a = list;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                if (MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD && Looper.myLooper() == null) {
                    Looper.prepare();
                    z = true;
                } else {
                    z = false;
                }
                if (!b.this.i && b.this.j != null) {
                    b bVar = b.this;
                    d.this.f1436a.removeCallbacks(bVar.j);
                }
                List list = this.f1445a;
                if (list != null && list.size() > 0) {
                    Iterator it = this.f1445a.iterator();
                    while (it.hasNext()) {
                        for (CampaignEx campaignEx : ((Frame) it.next()).getCampaigns()) {
                            d dVar = d.this;
                            dVar.a(dVar.m, campaignEx);
                        }
                    }
                    HashMap map = new HashMap();
                    map.put(Long.valueOf(System.currentTimeMillis()), this.f1445a);
                    if (d.s.containsKey("1_" + b.this.unitId)) {
                        d.s.remove("1_" + b.this.unitId);
                    }
                    d.s.put("1_" + b.this.unitId, map);
                }
                if (Looper.myLooper() == null || !z) {
                    return;
                }
                Looper.loop();
            }
        }

        public b(int i) {
            this.c = i;
        }

        public void b(List<String> list) {
            this.h = list;
        }

        public void c(int i) {
            this.e = i;
        }

        public void d(int i) {
            this.d = i;
        }

        public void e(int i) {
            this.f = i;
        }

        public void b(int i) {
            this.g = i;
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.l = aVar;
        }

        public void b(boolean z) {
            this.k = z;
        }

        @Override // com.mbridge.msdk.foundation.same.task.d
        public void a(boolean z) {
            this.i = z;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<h> list, CampaignUnit campaignUnit) {
            d.this.n = true;
            d.this.a(true, this.l, (String) null);
            d.this.a(new Thread(new a(campaignUnit)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            try {
                Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
                com.mbridge.msdk.foundation.same.c.a(campaignEx, contextD, cVar, new C0191b(campaignEx, contextD, aVar));
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(int i, String str) {
            d.this.a(new Thread(new c(str, i)));
        }

        public void a(Runnable runnable) {
            this.j = runnable;
        }

        @Override // com.mbridge.msdk.mbnative.service.net.b
        public void a(List<Frame> list) {
            d.this.a(new Thread(new RunnableC0192d(list)));
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1446a;
        private com.mbridge.msdk.foundation.same.task.d b;
        private int c;
        private String d;
        private String e;
        private com.mbridge.msdk.preload.listenter.a f;
        private boolean g = false;

        public c(int i, com.mbridge.msdk.foundation.same.task.d dVar, int i2, String str, String str2) {
            this.f1446a = i;
            this.b = dVar;
            this.c = i2;
            this.d = str;
            this.e = str2;
        }

        public void a(boolean z) {
            this.g = z;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.b.a(true);
            int i = this.f1446a;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                d.this.a("REQUEST_TIMEOUT", this.c, this.d, this.e, this.f);
            } else {
                d.this.n = true;
                if (this.g || this.c == 1) {
                    d.this.a("REQUEST_TIMEOUT", this.c, this.d, this.e, this.f);
                }
            }
        }

        public void a(com.mbridge.msdk.preload.listenter.a aVar) {
            this.f = aVar;
        }

        public void a(String str) {
            this.d = str;
        }
    }

    public d() {
        if (Looper.myLooper() == null) {
            Looper.prepare();
        }
        this.f1436a = new a();
    }

    public static Map<String, Integer> c() {
        return v;
    }

    public static Map<String, Integer> d() {
        return w;
    }

    public static Map<String, k> e() {
        return u;
    }

    public static Map<String, Map<Long, Object>> f() {
        return s;
    }

    public static Map<String, Boolean> g() {
        return t;
    }

    public static void b(int i, String str) {
        if (u.containsKey(str)) {
            k kVar = u.get(str);
            if (i == 1) {
                kVar.a(0);
            } else if (i == 2) {
                kVar.b(0);
            }
            u.put(str, kVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:81:0x01f9  */
    public void a(Map<String, Object> map, int i) {
        String str;
        String str2;
        Object obj;
        List<Campaign> listA;
        Object obj2;
        try {
            this.i = map;
            this.n = false;
            if (map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
                String str3 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                if (s.containsKey(((i + 1) % 2) + "_" + str3)) {
                    if (!s.containsKey(i + "_" + str3)) {
                        return;
                    }
                }
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                if (map.containsKey(MBridgeConstans.PREIMAGE)) {
                    this.m = ((Boolean) map.get(MBridgeConstans.PREIMAGE)).booleanValue();
                }
                com.mbridge.msdk.click.a aVar = this.c;
                if (aVar == null) {
                    this.c = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.n().d(), str3);
                } else {
                    aVar.a(str3);
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)) {
                    this.h = ((Integer) map.get(MBridgeConstans.PROPERTIES_AD_FRAME_NUM)).intValue();
                }
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY)) {
                    this.e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                if (t.containsKey(str3) && t.get(str3).booleanValue()) {
                    Map<String, Map<Long, Object>> mapF = f();
                    Map<Long, Object> map2 = mapF.get(i + "_" + str3);
                    g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
                    if (map2 != null && map2.size() > 0) {
                        Long next = map2.keySet().iterator().next();
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (gVarD == null) {
                            gVarD = com.mbridge.msdk.setting.h.b().a();
                        }
                        if (jCurrentTimeMillis - next.longValue() >= gVarD.Z() * 1000) {
                            mapF.remove(str3);
                        } else if (i == 1) {
                            return;
                        }
                    }
                }
                t.put(str3, Boolean.TRUE);
                this.p = 1;
                try {
                    if (map.containsKey("ad_num")) {
                        int iIntValue = ((Integer) map.get("ad_num")).intValue();
                        this.p = iIntValue;
                        if (iIntValue < 1) {
                            this.p = 1;
                        }
                        if (this.p > 10) {
                            this.p = 10;
                        }
                    }
                } catch (Exception unused) {
                    o0.b(r, "ADNUM MUST BE INTEGER");
                }
                v.put(str3, Integer.valueOf(this.p));
                com.mbridge.msdk.preload.listenter.a aVar2 = (!map.containsKey(MBridgeConstans.PRELOAD_RESULT_LISTENER) || (obj2 = map.get(MBridgeConstans.PRELOAD_RESULT_LISTENER)) == null) ? null : new com.mbridge.msdk.preload.listenter.a((PreloadListener) obj2);
                String strB = com.mbridge.msdk.foundation.controller.c.n().b();
                String strC = com.mbridge.msdk.foundation.controller.c.n().c();
                if (map.containsKey("app_id") && map.containsKey("app_key") && map.containsKey(MBridgeConstans.KEY_WORD)) {
                    strB = (String) map.get("app_id");
                    strC = (String) map.get("app_key");
                }
                a(strB, strC, str3);
                l lVarE = com.mbridge.msdk.setting.h.b().e(strB, str3);
                this.d = lVarE;
                if (lVarE == null) {
                    this.d = l.i(str3);
                }
                if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                    str = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                    if (TextUtils.isEmpty(str)) {
                        str = "";
                    }
                } else {
                    str = "";
                }
                String str4 = str;
                this.j = this.d.b();
                this.k = this.d.c();
                this.l = this.d.c();
                List<Integer> list = this.j;
                if (list == null || list.size() <= 0) {
                    if (aVar2 != null) {
                        aVar2.onPreloadFaild("do not have sorceList");
                        return;
                    }
                    return;
                }
                this.f = new LinkedList();
                Iterator<Integer> it = this.j.iterator();
                while (it.hasNext()) {
                    this.f.add(it.next());
                }
                List<Integer> list2 = this.l;
                if (list2 != null && list2.size() > 0) {
                    this.g = new LinkedList();
                    Iterator<Integer> it2 = this.l.iterator();
                    while (it2.hasNext()) {
                        this.g.add(Long.valueOf(it2.next().intValue() * 1000));
                    }
                }
                if (this.j.contains(1) && i == 0) {
                    try {
                        long jIntValue = this.k.get(this.j.indexOf(1)).intValue() * 1000;
                        l lVar = this.d;
                        str2 = str3;
                        obj = MBridgeConstans.NATIVE_INFO;
                        try {
                            a(1, jIntValue, i, lVar, str3, str4, false, aVar2);
                            com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(1);
                            if (bVarA != null && (listA = bVarA.a(str2, 0)) != null && listA.size() > 0) {
                                a(true, aVar2, (String) null);
                            }
                        } catch (Exception unused2) {
                        }
                    } catch (Exception unused3) {
                        str2 = str3;
                        obj = MBridgeConstans.NATIVE_INFO;
                    }
                } else {
                    str2 = str3;
                    obj = MBridgeConstans.NATIVE_INFO;
                }
                a(i, this.d, str2, str4, aVar2);
                l lVar2 = this.d;
                d().put(str2, Integer.valueOf(lVar2 != null ? lVar2.y() * this.p : 1));
                try {
                    int i2 = MBMediaView.p0;
                    e.a(com.mbridge.msdk.foundation.controller.c.n().d(), str2);
                    m0.a();
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a();
                    Object obj3 = obj;
                    int iA = a(map.containsKey(obj3) ? (String) map.get(obj3) : null);
                    if (iA <= 0) {
                        iA = this.p;
                    }
                    List<Campaign> listA2 = a(str2, iA);
                    if (listA2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i3 = 0; i3 < listA2.size(); i3++) {
                            CampaignEx campaignEx = (CampaignEx) listA2.get(i3);
                            if (!TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) {
                                arrayList.add(campaignEx);
                            }
                        }
                        if (arrayList.size() > 0) {
                            Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str2, new CopyOnWriteArrayList(arrayList), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str2);
                        }
                    }
                } catch (Throwable unused4) {
                    o0.b(r, "init cam cache failed");
                }
            }
        } catch (Exception e) {
            o0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
        }
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() > 0) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject = (JSONObject) jSONArray.opt(i);
                    if (2 == jSONObject.optInt("id", 0)) {
                        return jSONObject.optInt("ad_num");
                    }
                }
            }
        } catch (Exception e) {
            o0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
        }
        return 0;
    }

    public List<Campaign> a(String str, int i) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        l lVarE = com.mbridge.msdk.setting.h.b().e("", str);
        this.d = lVarE;
        if (lVarE == null) {
            this.d = l.i(str);
        }
        List<Integer> listB = this.d.b();
        this.j = listB;
        if (listB == null || listB.size() <= 0 || !this.j.contains(1) || (bVarA = com.mbridge.msdk.mbnative.cache.c.a(1)) == null) {
            return null;
        }
        return bVarA.a(str, i);
    }

    public void a(int i, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar) {
        Queue<Integer> queue = this.f;
        if (queue == null || queue.size() <= 0) {
            return;
        }
        try {
            int iIntValue = this.f.poll().intValue();
            long jLongValue = MBridgeConstans.REQUEST_TIME_OUT;
            Queue<Long> queue2 = this.g;
            if (queue2 != null && queue2.size() > 0) {
                jLongValue = this.g.poll().longValue();
            }
            o0.c(r, "preload start queue adsource = " + iIntValue);
            a(iIntValue, jLongValue, str, str2, this.i, i, lVar, aVar);
        } catch (Throwable unused) {
            o0.b(r, "queue poll exception");
        }
    }

    public void a(int i, long j, String str, String str2, Map<String, Object> map, int i2, l lVar, com.mbridge.msdk.preload.listenter.a aVar) {
        com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA;
        if (i != 1 && (bVarA = com.mbridge.msdk.mbnative.cache.c.a(i)) != null) {
            List<Campaign> listA = bVarA.a(str, this.p);
            if (listA != null && listA.size() > 0) {
                a(true, aVar, (String) null);
                return;
            }
        }
        if (i == 1) {
            a(i, j, i2, lVar, str, str2, true, aVar);
        } else if (i != 2) {
            a(i, j, i2, lVar, str, str2, aVar, false);
        } else {
            a(2, j, i2, lVar, str, str2, aVar, false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x029f A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:125:0x02ae A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:127:0x02c0 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:130:0x02d4 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:144:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:146:0x0302 A[Catch: Exception -> 0x00a0, TRY_ENTER, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:147:0x0317  */
    /* JADX WARN: Code duplicated, block: B:149:0x031a A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:152:0x0369 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:155:0x0378 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:160:0x03ac A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0405 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:166:0x0407 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0439 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:170:0x044d  */
    /* JADX WARN: Code duplicated, block: B:172:0x0452 A[Catch: Exception -> 0x00a0, TryCatch #1 {Exception -> 0x00a0, blocks: (B:3:0x001e, B:6:0x006d, B:8:0x0073, B:10:0x007b, B:12:0x0083, B:14:0x008b, B:16:0x0095, B:19:0x00a3, B:21:0x00ad, B:22:0x00b7, B:24:0x00c1, B:26:0x00cb, B:28:0x00d1, B:29:0x00da, B:31:0x00f3, B:32:0x00fa, B:34:0x0100, B:35:0x0105, B:37:0x012c, B:38:0x0131, B:45:0x014c, B:48:0x0154, B:50:0x015c, B:52:0x0162, B:54:0x0167, B:56:0x016b, B:60:0x017f, B:62:0x0187, B:64:0x018d, B:68:0x0198, B:69:0x01aa, B:71:0x01ae, B:72:0x01c4, B:74:0x01cc, B:76:0x01db, B:77:0x01ec, B:81:0x01fd, B:83:0x0203, B:85:0x020b, B:87:0x0215, B:89:0x021b, B:112:0x0258, B:113:0x0265, B:120:0x0276, B:122:0x029f, B:123:0x02a6, B:125:0x02ae, B:127:0x02c0, B:128:0x02c9, B:130:0x02d4, B:136:0x02e4, B:141:0x02f5, B:146:0x0302, B:150:0x032e, B:152:0x0369, B:153:0x036e, B:155:0x0378, B:157:0x0382, B:158:0x03a2, B:160:0x03ac, B:162:0x03b6, B:163:0x03d6, B:167:0x040a, B:169:0x0439, B:173:0x046b, B:172:0x0452, B:166:0x0407, B:149:0x031a, B:138:0x02ea, B:139:0x02ef, B:97:0x0228, B:99:0x022e, B:106:0x0243, B:114:0x0269, B:174:0x0471), top: B:180:0x001e }] */
    /* JADX WARN: Instruction removed from duplicated block: B:146:0x0302, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:149:0x031a, please report this as an issue */
    @Override // com.mbridge.msdk.mbnative.controller.b
    public void a(int i, long j, int i2, l lVar, String str, String str2, com.mbridge.msdk.preload.listenter.a aVar, boolean z2) {
        int i3;
        int iOptInt;
        int i4;
        int i5;
        int i6;
        String strA;
        b bVar;
        long j2;
        k kVar;
        int iA;
        JSONArray jSONArrayB;
        String str3;
        int iOptInt2;
        String string;
        List<Campaign> listA;
        List<Campaign> listA2;
        try {
            com.mbridge.msdk.foundation.db.e.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d())).a();
            int iF = this.d.f();
            int iE = this.d.e();
            com.mbridge.msdk.mbnative.service.net.a aVar2 = new com.mbridge.msdk.mbnative.service.net.a(com.mbridge.msdk.foundation.controller.c.n().d());
            com.mbridge.msdk.foundation.same.net.wrapper.e eVar = new com.mbridge.msdk.foundation.same.net.wrapper.e();
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            String strC = com.mbridge.msdk.foundation.controller.c.n().c();
            Map<String, Object> map = this.i;
            if (map != null && map.containsKey("app_id") && this.i.containsKey("app_key") && this.i.containsKey(MBridgeConstans.KEY_WORD) && this.i.get(MBridgeConstans.KEY_WORD) != null) {
                if (this.i.get("app_id") instanceof String) {
                    strB = (String) this.i.get("app_id");
                }
                if (this.i.get("app_key") instanceof String) {
                    strC = (String) this.i.get("app_key");
                }
                String str4 = this.i.get(MBridgeConstans.KEY_WORD) instanceof String ? (String) this.i.get(MBridgeConstans.KEY_WORD) : null;
                if (!TextUtils.isEmpty(str4)) {
                    eVar.a("smart", i0.b(str4));
                }
            }
            String str5 = strB;
            String str6 = strC;
            eVar.a("app_id", str5);
            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            eVar.a("req_type", "1");
            if (!TextUtils.isEmpty(this.e)) {
                eVar.a("category", this.e);
            }
            if (!TextUtils.isEmpty(str2)) {
                eVar.a(MBridgeConstans.PLACEMENT_ID, str2);
            }
            eVar.a("sign", SameMD5.getMD5(str5 + str6));
            eVar.a("only_impression", "1");
            String strD = t0.d(str);
            if (!TextUtils.isEmpty(strD)) {
                eVar.a("j", strD);
            }
            int iIntValue = v.get(str).intValue();
            if (iF != y && iF != 0 && iIntValue != 0) {
                if (i2 == 0) {
                    com.mbridge.msdk.mbnative.cache.b<String, List<Campaign>> bVarA = com.mbridge.msdk.mbnative.cache.c.a(i);
                    if (z2) {
                        if (bVarA != null && (listA2 = bVarA.a(str, iIntValue)) != null && listA2.size() > 0) {
                            a(true, aVar, (String) null);
                            return;
                        } else {
                            if (this.n) {
                                a("", i2, str, str2, aVar);
                                return;
                            }
                            return;
                        }
                    }
                    if (i != 1 && bVarA != null && (listA = bVarA.a(str, iIntValue)) != null && listA.size() > 0) {
                        a(true, aVar, (String) null);
                        return;
                    }
                }
                if (iIntValue != 0) {
                    eVar.a("ad_num", iIntValue + "");
                }
                if (this.h != 0) {
                    eVar.a("frame_num", this.h + "");
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    String str7 = (String) this.i.get(MBridgeConstans.NATIVE_INFO);
                    if (!TextUtils.isEmpty(str7)) {
                        o0.b(r, "nativeinfo" + str7);
                        try {
                            JSONArray jSONArray = new JSONArray(str7);
                            str3 = str7;
                            if (jSONArray.length() > 0) {
                                iOptInt = 0;
                                iOptInt2 = 0;
                                for (int i7 = 0; i7 < jSONArray.length(); i7++) {
                                    try {
                                        JSONObject jSONObject = (JSONObject) jSONArray.opt(i7);
                                        int i8 = iOptInt;
                                        try {
                                            int iOptInt3 = jSONObject.optInt("id", 0);
                                            if (2 == iOptInt3) {
                                                iOptInt = jSONObject.optInt("ad_num");
                                                if (iF > 0) {
                                                    try {
                                                        jSONObject.put("ad_num", iF);
                                                    } catch (JSONException e) {
                                                        e = e;
                                                        o0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
                                                        i4 = iOptInt2;
                                                        string = str3;
                                                        eVar.a(MBridgeConstans.NATIVE_INFO, string);
                                                        i3 = i4;
                                                        iF = iIntValue;
                                                        eVar.a("ad_num", iF + "");
                                                        eVar.a("ping_mode", "1");
                                                        if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                                                            com.mbridge.msdk.setting.h.b().a();
                                                        }
                                                        if (!NativeController.b(this.i)) {
                                                            jSONArrayB = t0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                                                            if (jSONArrayB.length() > 0) {
                                                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.h, t0.a(jSONArrayB));
                                                            }
                                                        }
                                                        a(eVar, i);
                                                        if (u.containsKey(str)) {
                                                            i5 = 0;
                                                        } else {
                                                            i5 = 0;
                                                        }
                                                        if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                                                            i6 = 1;
                                                            if (i == 1) {
                                                                eVar.a("tnum", this.o + "");
                                                            }
                                                            eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, i5 + "");
                                                            eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                                                            eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                                                            strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                                                            if (!TextUtils.isEmpty(strA)) {
                                                                eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
                                                            }
                                                            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                                                eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                                            }
                                                            if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                                                eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                                            }
                                                            eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                                                            bVar = new b(i);
                                                            bVar.setUnitId(str);
                                                            bVar.setPlacementId(str2);
                                                            bVar.setAdType(42);
                                                            bVar.d(iIntValue);
                                                            bVar.c(iOptInt);
                                                            bVar.e(i3);
                                                            bVar.b(iE);
                                                            bVar.a(aVar);
                                                            if (i == 1) {
                                                                bVar.b(true);
                                                            } else {
                                                                bVar.b(true);
                                                            }
                                                            bVar.b(NativeController.a(this.i));
                                                            c cVar = new c(1, bVar, i2, str, str2);
                                                            bVar.a(cVar);
                                                            bVar.a(i2);
                                                            cVar.a(aVar);
                                                            cVar.a(z2);
                                                            cVar.a(str);
                                                            if (i2 == 0) {
                                                                j2 = j;
                                                                aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                                                            } else {
                                                                j2 = j;
                                                                if (i2 == 1) {
                                                                    aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                                                                }
                                                            }
                                                            this.f1436a.postDelayed(cVar, j2);
                                                            return;
                                                        }
                                                        i6 = 1;
                                                        if (i == i6) {
                                                            eVar.a("tnum", this.p + "");
                                                        }
                                                        eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, i5 + "");
                                                        eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                                                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                                                        strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                                                        if (!TextUtils.isEmpty(strA)) {
                                                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
                                                        }
                                                        if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                                                            eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                                                        }
                                                        if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                                                            eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                                                        }
                                                        eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                                                        bVar = new b(i);
                                                        bVar.setUnitId(str);
                                                        bVar.setPlacementId(str2);
                                                        bVar.setAdType(42);
                                                        bVar.d(iIntValue);
                                                        bVar.c(iOptInt);
                                                        bVar.e(i3);
                                                        bVar.b(iE);
                                                        bVar.a(aVar);
                                                        if (i == 1) {
                                                            bVar.b(true);
                                                        } else {
                                                            bVar.b(true);
                                                        }
                                                        bVar.b(NativeController.a(this.i));
                                                        c cVar2 = new c(1, bVar, i2, str, str2);
                                                        bVar.a(cVar2);
                                                        bVar.a(i2);
                                                        cVar2.a(aVar);
                                                        cVar2.a(z2);
                                                        cVar2.a(str);
                                                        if (i2 == 0) {
                                                            j2 = j;
                                                            aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                                                        } else {
                                                            j2 = j;
                                                            if (i2 == 1) {
                                                                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                                                            }
                                                        }
                                                        this.f1436a.postDelayed(cVar2, j2);
                                                        return;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                if (3 == iOptInt3) {
                                                    iOptInt2 = jSONObject.optInt("ad_num");
                                                    if (iF > 0) {
                                                        jSONObject.put("ad_num", iF);
                                                    }
                                                }
                                                iOptInt = i8;
                                            }
                                        } catch (JSONException e2) {
                                            e = e2;
                                            iOptInt = i8;
                                        }
                                    } catch (JSONException e3) {
                                        e = e3;
                                    }
                                }
                                i4 = iOptInt2;
                            } else {
                                i4 = 0;
                                iOptInt = 0;
                            }
                            try {
                                this.o = Math.max(iOptInt, i4);
                                string = jSONArray.toString();
                            } catch (JSONException e4) {
                                e = e4;
                                iOptInt2 = i4;
                                o0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
                                i4 = iOptInt2;
                                string = str3;
                            }
                        } catch (JSONException e5) {
                            e = e5;
                            str3 = str7;
                            iOptInt = 0;
                            iOptInt2 = 0;
                        }
                        eVar.a(MBridgeConstans.NATIVE_INFO, string);
                    }
                    i3 = i4;
                    iF = iIntValue;
                    eVar.a("ad_num", iF + "");
                    eVar.a("ping_mode", "1");
                    if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                        com.mbridge.msdk.setting.h.b().a();
                    }
                    if (!NativeController.b(this.i)) {
                        jSONArrayB = t0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                        if (jSONArrayB.length() > 0) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.h, t0.a(jSONArrayB));
                        }
                    }
                    a(eVar, i);
                    if (u.containsKey(str) || (kVar = u.get(str)) == null) {
                        i5 = 0;
                    } else {
                        if (i == 1 || i != 2) {
                            iA = kVar.a();
                        } else {
                            iA = kVar.b();
                        }
                        i5 = iA;
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                        i6 = 1;
                        if (i == 1) {
                            eVar.a("tnum", this.o + "");
                        }
                        eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, i5 + "");
                        eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                        eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                        strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                        if (!TextUtils.isEmpty(strA)) {
                            eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
                        }
                        if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && (this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer)) {
                            eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                        }
                        if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && (this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer)) {
                            eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                        }
                        eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                        bVar = new b(i);
                        bVar.setUnitId(str);
                        bVar.setPlacementId(str2);
                        bVar.setAdType(42);
                        bVar.d(iIntValue);
                        bVar.c(iOptInt);
                        bVar.e(i3);
                        bVar.b(iE);
                        bVar.a(aVar);
                        if (i == 1 || z2) {
                            bVar.b(true);
                        }
                        bVar.b(NativeController.a(this.i));
                        c cVar3 = new c(1, bVar, i2, str, str2);
                        bVar.a(cVar3);
                        bVar.a(i2);
                        cVar3.a(aVar);
                        cVar3.a(z2);
                        cVar3.a(str);
                        if (i2 == 0) {
                            j2 = j;
                            aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                        } else {
                            j2 = j;
                            if (i2 == 1) {
                                aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                            }
                        }
                        this.f1436a.postDelayed(cVar3, j2);
                        return;
                    }
                    i6 = 1;
                    if (i == i6) {
                        eVar.a("tnum", this.p + "");
                    }
                    eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, i5 + "");
                    eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                    bVar = new b(i);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(iIntValue);
                    bVar.c(iOptInt);
                    bVar.e(i3);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.i));
                    c cVar4 = new c(1, bVar, i2, str, str2);
                    bVar.a(cVar4);
                    bVar.a(i2);
                    cVar4.a(aVar);
                    cVar4.a(z2);
                    cVar4.a(str);
                    if (i2 == 0) {
                        j2 = j;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    } else {
                        j2 = j;
                        if (i2 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                        }
                    }
                    this.f1436a.postDelayed(cVar4, j2);
                    return;
                }
                if (iF != z && iF != 0) {
                    i3 = 0;
                    iOptInt = 0;
                }
                eVar.a("ad_num", iF + "");
                eVar.a("ping_mode", "1");
                if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    com.mbridge.msdk.setting.h.b().a();
                }
                if (!NativeController.b(this.i)) {
                    jSONArrayB = t0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.h, t0.a(jSONArrayB));
                    }
                }
                a(eVar, i);
                if (u.containsKey(str)) {
                    i5 = 0;
                } else {
                    i5 = 0;
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i6 = 1;
                    if (i == 1) {
                        eVar.a("tnum", this.o + "");
                    }
                    eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, i5 + "");
                    eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                    bVar = new b(i);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(iIntValue);
                    bVar.c(iOptInt);
                    bVar.e(i3);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.i));
                    c cVar5 = new c(1, bVar, i2, str, str2);
                    bVar.a(cVar5);
                    bVar.a(i2);
                    cVar5.a(aVar);
                    cVar5.a(z2);
                    cVar5.a(str);
                    if (i2 == 0) {
                        j2 = j;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    } else {
                        j2 = j;
                        if (i2 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                        }
                    }
                    this.f1436a.postDelayed(cVar5, j2);
                    return;
                }
                i6 = 1;
                if (i == i6) {
                    eVar.a("tnum", this.p + "");
                }
                eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, i5 + "");
                eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                bVar = new b(i);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(iIntValue);
                bVar.c(iOptInt);
                bVar.e(i3);
                bVar.b(iE);
                bVar.a(aVar);
                if (i == 1) {
                    bVar.b(true);
                } else {
                    bVar.b(true);
                }
                bVar.b(NativeController.a(this.i));
                c cVar6 = new c(1, bVar, i2, str, str2);
                bVar.a(cVar6);
                bVar.a(i2);
                cVar6.a(aVar);
                cVar6.a(z2);
                cVar6.a(str);
                if (i2 == 0) {
                    j2 = j;
                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                } else {
                    j2 = j;
                    if (i2 == 1) {
                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    }
                }
                this.f1436a.postDelayed(cVar6, j2);
                return;
                i4 = 0;
                iOptInt = 0;
                i3 = i4;
                iF = iIntValue;
                eVar.a("ad_num", iF + "");
                eVar.a("ping_mode", "1");
                if (com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b()) == null) {
                    com.mbridge.msdk.setting.h.b().a();
                }
                if (!NativeController.b(this.i)) {
                    jSONArrayB = t0.b(com.mbridge.msdk.foundation.controller.c.n().d(), str);
                    if (jSONArrayB.length() > 0) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.h, t0.a(jSONArrayB));
                    }
                }
                a(eVar, i);
                if (u.containsKey(str)) {
                    i5 = 0;
                } else {
                    i5 = 0;
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_INFO)) {
                    i6 = 1;
                    if (i == 1) {
                        eVar.a("tnum", this.o + "");
                    }
                    eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, i5 + "");
                    eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                    eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                    strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                    if (!TextUtils.isEmpty(strA)) {
                        eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                        eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                    }
                    if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                        eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                    }
                    eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                    bVar = new b(i);
                    bVar.setUnitId(str);
                    bVar.setPlacementId(str2);
                    bVar.setAdType(42);
                    bVar.d(iIntValue);
                    bVar.c(iOptInt);
                    bVar.e(i3);
                    bVar.b(iE);
                    bVar.a(aVar);
                    if (i == 1) {
                        bVar.b(true);
                    } else {
                        bVar.b(true);
                    }
                    bVar.b(NativeController.a(this.i));
                    c cVar7 = new c(1, bVar, i2, str, str2);
                    bVar.a(cVar7);
                    bVar.a(i2);
                    cVar7.a(aVar);
                    cVar7.a(z2);
                    cVar7.a(str);
                    if (i2 == 0) {
                        j2 = j;
                        aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    } else {
                        j2 = j;
                        if (i2 == 1) {
                            aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                        }
                    }
                    this.f1436a.postDelayed(cVar7, j2);
                    return;
                }
                i6 = 1;
                if (i == i6) {
                    eVar.a("tnum", this.p + "");
                }
                eVar.a(TypedValues.CycleType.S_WAVE_OFFSET, i5 + "");
                eVar.a("ad_type", RoomMasterTable.DEFAULT_ID);
                eVar.a(CampaignEx.JSON_KEY_AD_SOURCE_ID, i + "");
                strA = com.mbridge.msdk.foundation.same.buffer.b.a(str, "native");
                if (!TextUtils.isEmpty(strA)) {
                    eVar.a(com.mbridge.msdk.foundation.same.net.wrapper.e.g, strA);
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH)) {
                    eVar.a("video_width", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_WIDTH)).intValue() + "");
                }
                if (this.i.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT)) {
                    eVar.a("video_height", ((Integer) this.i.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT)).intValue() + "");
                }
                eVar.a("video_version", MBridgeConstans.NATIVE_VIDEO_VERSION);
                bVar = new b(i);
                bVar.setUnitId(str);
                bVar.setPlacementId(str2);
                bVar.setAdType(42);
                bVar.d(iIntValue);
                bVar.c(iOptInt);
                bVar.e(i3);
                bVar.b(iE);
                bVar.a(aVar);
                if (i == 1) {
                    bVar.b(true);
                } else {
                    bVar.b(true);
                }
                bVar.b(NativeController.a(this.i));
                c cVar8 = new c(1, bVar, i2, str, str2);
                bVar.a(cVar8);
                bVar.a(i2);
                cVar8.a(aVar);
                cVar8.a(z2);
                cVar8.a(str);
                if (i2 == 0) {
                    j2 = j;
                    aVar2.choiceV3OrV5BySetting(1, eVar, bVar, "", com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                } else {
                    j2 = j;
                    if (i2 == 1) {
                        aVar2.getLoadOrSetting(1, com.mbridge.msdk.foundation.same.net.utils.d.h().b0, eVar, bVar, MBInterstitialActivity.INTENT_CAMAPIGN, com.mbridge.msdk.foundation.same.c.a(j2, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS));
                    }
                }
                this.f1436a.postDelayed(cVar8, j2);
                return;
            }
            a("The request was refused", i2, str, str2, aVar);
        } catch (Exception e6) {
            String str8 = r;
            o0.b(str8, com.mbridge.msdk.mbnative.common.a.a(e6));
            o0.b(str8, e6.getMessage());
        }
    }

    public static void a(int i, String str) {
        k kVar;
        if (u.containsKey(str)) {
            kVar = u.get(str);
        } else {
            kVar = new k();
        }
        int iIntValue = v.get(str).intValue();
        int iIntValue2 = d().containsKey(str) ? d().get(str).intValue() : 1;
        if (i == 1) {
            int iA = kVar.a() + iIntValue;
            kVar.a(iA <= iIntValue2 ? iA : 0);
        } else if (i == 2) {
            int iB = kVar.b() + iIntValue;
            kVar.b(iB <= iIntValue2 ? iB : 0);
        }
        u.put(str, kVar);
    }

    public void a(String str, int i, String str2, String str3, com.mbridge.msdk.preload.listenter.a aVar) {
        try {
            Queue<Integer> queue = this.f;
            if (queue == null || queue.size() > 0) {
                if (this.f != null) {
                    a(i, this.d, str2, str3, aVar);
                    return;
                }
            }
            a(false, aVar, str);
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
    }

    public void a(String str, String str2, String str3) {
        if (this.b == null) {
            this.b = new j();
        }
        this.b.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, str2, str3);
    }

    public void a(boolean z2, com.mbridge.msdk.preload.listenter.a aVar, String str) {
        if (z2) {
            if (aVar == null || aVar.a()) {
                return;
            }
            aVar.a(true);
            aVar.onPreloadSucceed();
            return;
        }
        if (aVar == null || aVar.a()) {
            return;
        }
        aVar.a(true);
        aVar.onPreloadFaild(str);
    }

    public void a(boolean z2, Campaign campaign) {
        if (campaign == null) {
            return;
        }
        if (z2 && campaign.getIconDrawable() == null) {
            campaign.loadIconUrlAsyncWithBlock(null);
        }
        if (z2 && campaign.getBigDrawable() == null) {
            campaign.loadImageUrlAsyncWithBlock(null);
        }
    }

    public void a(Thread thread) {
        if (!MBridgeConstans.PRELOAD_RESULT_IN_SUBTHREAD) {
            thread.run();
        } else {
            thread.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<CampaignEx> list, String str) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    try {
                        int i = MBMediaView.p0;
                        Object objInvoke = com.mbridge.msdk.videocommon.download.b.class.getMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
                        if (objInvoke != null) {
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("createUnitCache", Context.class, String.class, CopyOnWriteArrayList.class, Integer.TYPE, com.mbridge.msdk.videocommon.listener.a.class).invoke(objInvoke, com.mbridge.msdk.foundation.controller.c.n().d(), str, new CopyOnWriteArrayList(list), 1, null);
                            com.mbridge.msdk.videocommon.download.b.class.getMethod("load", String.class).invoke(objInvoke, str);
                        }
                    } catch (Exception unused) {
                        o0.b(r, "please import the videocommon aar");
                    }
                }
            } catch (Exception e) {
                o0.b(r, com.mbridge.msdk.mbnative.common.a.a(e));
            }
        }
    }
}
