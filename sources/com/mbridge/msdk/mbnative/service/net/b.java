package com.mbridge.msdk.mbnative.service.net;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class b extends c<JSONObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f1452a;
    private String b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1453a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ List c;
        final /* synthetic */ int d;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbnative.service.net.b$a$a, reason: collision with other inner class name */
        public class RunnableC0194a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f1454a;

            public RunnableC0194a(CampaignUnit campaignUnit) {
                this.f1454a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f1454a;
                if (campaignUnit == null || campaignUnit.getAds() == null || this.f1454a.getAds().size() <= 0) {
                    a aVar = a.this;
                    b.this.a(aVar.d, aVar.b.optString(NotificationCompat.CATEGORY_MESSAGE));
                } else {
                    a aVar2 = a.this;
                    b.this.a(aVar2.c, this.f1454a);
                    b.this.saveRequestTime(this.f1454a.getAds().size());
                }
            }
        }

        public a(String str, JSONObject jSONObject, List list, int i) {
            this.f1453a = str;
            this.b = jSONObject;
            this.c = list;
            this.d = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0194a("v5".equals(this.f1453a) ? com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(this.b.optJSONObject("data")) : com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(this.b.optJSONObject("data"))));
        }
    }

    public abstract void a(int i, String str);

    public void a(String str) {
        this.b = str;
    }

    public abstract void a(List<Frame> list);

    public abstract void a(List<h> list, CampaignUnit campaignUnit);

    public String b() {
        return this.b;
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        a(aVar.f1202a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
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
        int i = this.f1452a;
        if (i == 0) {
            b(aVar.b, eVar.c);
        } else if (i == 1) {
            a(aVar.b, eVar.c);
        }
    }

    private void b(List<h> list, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 != iOptInt) {
            a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
            return;
        }
        calcRequestTime(System.currentTimeMillis());
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(jSONObject.optString("version"), jSONObject, list, iOptInt));
    }

    public void a(int i) {
        this.f1452a = i;
    }

    public int a() {
        return this.f1452a;
    }

    private void a(List<h> list, JSONObject jSONObject) {
        CampaignUnit campaignUnit;
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            if ("v5".equals(jSONObject.optString("version"))) {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseV5CampaignUnit(jSONObject.optJSONObject("data"));
            } else {
                campaignUnit = com.mbridge.msdk.foundation.entity.b.parseCampaignUnit(jSONObject.optJSONObject("data"));
            }
            if (campaignUnit != null && campaignUnit.getListFrames() != null && campaignUnit.getListFrames().size() > 0) {
                a(campaignUnit.getListFrames());
                saveRequestTime(campaignUnit.getListFrames().size());
                return;
            } else {
                a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
                return;
            }
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
