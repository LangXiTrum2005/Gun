package com.mbridge.msdk.reward.request;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c extends com.mbridge.msdk.foundation.same.net.c<JSONObject> {
    private static final String d = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1797a;
    private String b;
    private com.mbridge.msdk.foundation.same.report.metrics.c c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1798a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ List c;
        final /* synthetic */ int d;

        /* JADX INFO: renamed from: com.mbridge.msdk.reward.request.c$a$a, reason: collision with other inner class name */
        public class RunnableC0235a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f1799a;

            public RunnableC0235a(CampaignUnit campaignUnit) {
                this.f1799a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f1799a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f1799a.getAds().size() > 0) {
                    this.f1799a.setMetricsData(c.this.c);
                    a aVar = a.this;
                    c.this.a(aVar.c, this.f1799a);
                    c.this.saveRequestTime(this.f1799a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f1799a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = a.this.b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a aVar2 = a.this;
                c cVar = c.this;
                cVar.a(aVar2.d, msg, cVar.c);
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i) {
            this.f1798a = str;
            this.b = jSONObject;
            this.c = list;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0235a("v5".equals(this.f1798a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.b.optJSONObject("data"), c.this.b) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.b.optJSONObject("data"), c.this.b)));
        }
    }

    public abstract void a(int i, String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar);

    public abstract void a(List<Frame> list);

    public abstract void a(List<h> list, CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        o0.b(d, "errorCode = " + aVar.f1202a);
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(aVar.f1202a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
        bVar.a("campaign_request_error", aVar);
        bVar.b(aVar.b);
        this.c.a(bVar);
        a(aVar.f1202a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar), this.c);
    }

    @Override // com.mbridge.msdk.foundation.same.net.c
    public void onPreExecute() {
        super.onPreExecute();
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        com.mbridge.msdk.foundation.same.net.toolbox.a aVar;
        super.onSuccess(eVar);
        if (eVar == null || (aVar = eVar.b) == null) {
            return;
        }
        int i = this.f1797a;
        if (i == 0) {
            b(aVar.b, eVar.c);
        } else if (i == 1) {
            a(aVar.b, eVar.c);
        }
    }

    private void b(List<h> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 != iOptInt) {
            a(list, jSONObject, iOptInt, this.c);
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(String str) {
        this.b = str;
    }

    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        this.c = cVar;
    }

    private void a(List<h> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"), this.b);
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"), this.b);
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                List<Frame> listFrames = campaignUnit.getListFrames();
                a(listFrames);
                saveRequestTime(listFrames.size());
                return;
            } else {
                String msg = campaignUnit != null ? campaignUnit.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                a(iOptInt, msg, this.c);
                return;
            }
        }
        a(list, jSONObject, iOptInt, this.c);
    }

    private void a(List<h> list, JSONObject jSONObject, int i, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        com.mbridge.msdk.foundation.error.b bVarA;
        String strB = "";
        if (list != null && list.size() > 0) {
            for (h hVar : list) {
                if (hVar != null) {
                    String strA = hVar.a();
                    if (!TextUtils.isEmpty(strA) && strA.equals("data_res_type")) {
                        strB = hVar.b();
                    }
                }
            }
        }
        String strH = "errorCode: 3507 errorMessage: data load failed, errorMsg is " + jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE);
        if (!TextUtils.isEmpty(strB) && strB.equals("1")) {
            com.mbridge.msdk.foundation.error.b bVarA2 = com.mbridge.msdk.foundation.error.a.a(880018, strH);
            if (cVar != null) {
                cVar.a(bVarA2);
                cVar.c(true);
                if (TextUtils.isEmpty(strH)) {
                    strH = bVarA2.h();
                }
            }
            a(i, strH, cVar);
            return;
        }
        if (i == -1) {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880017, strH);
        } else {
            bVarA = com.mbridge.msdk.foundation.error.a.a(880003, strH);
        }
        if (cVar != null) {
            cVar.a(bVarA);
            cVar.c(false);
            if (TextUtils.isEmpty(strH)) {
                strH = bVarA.h();
            }
        }
        a(i, strH, cVar);
    }
}
