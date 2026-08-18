package com.mbridge.msdk.mbbanner.common.response;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.entity.b;
import com.mbridge.msdk.foundation.same.net.c;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.tracker.network.h;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends c<JSONObject> {
    private static final String b = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f1394a = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a, reason: collision with other inner class name */
    public class RunnableC0184a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f1395a;
        final /* synthetic */ JSONObject b;
        final /* synthetic */ int c;

        /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.response.a$a$a, reason: collision with other inner class name */
        public class RunnableC0185a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ CampaignUnit f1396a;

            public RunnableC0185a(CampaignUnit campaignUnit) {
                this.f1396a = campaignUnit;
            }

            @Override // java.lang.Runnable
            public void run() {
                CampaignUnit campaignUnit = this.f1396a;
                if (campaignUnit != null && campaignUnit.getAds() != null && this.f1396a.getAds().size() > 0) {
                    a.this.a(this.f1396a);
                    if (!TextUtils.isEmpty(a.this.f1394a)) {
                        a.this.saveHbState(1);
                    }
                    a.this.saveRequestTime(this.f1396a.getAds().size());
                    return;
                }
                CampaignUnit campaignUnit2 = this.f1396a;
                String msg = campaignUnit2 != null ? campaignUnit2.getMsg() : null;
                if (TextUtils.isEmpty(msg)) {
                    msg = RunnableC0184a.this.b.optString(NotificationCompat.CATEGORY_MESSAGE);
                }
                RunnableC0184a runnableC0184a = RunnableC0184a.this;
                a.this.a(runnableC0184a.c, msg);
            }
        }

        public RunnableC0184a(String str, JSONObject jSONObject, int i) {
            this.f1395a = str;
            this.b = jSONObject;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.foundation.same.threadpool.a.c().post(new RunnableC0185a("v5".equals(this.f1395a) ? b.parseV5CampaignUnit(this.b.optJSONObject("data"), a.this.f1394a) : b.parseCampaignUnit(this.b.optJSONObject("data"), a.this.f1394a)));
        }
    }

    public abstract void a(int i, String str);

    public abstract void a(CampaignUnit campaignUnit);

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onError(com.mbridge.msdk.foundation.same.net.exception.a aVar) {
        o0.c(b, "onFailed errorCode = " + aVar.f1202a);
        a(aVar.f1202a, com.mbridge.msdk.foundation.same.net.utils.a.a(aVar));
    }

    @Override // com.mbridge.msdk.foundation.same.net.c, com.mbridge.msdk.foundation.same.net.b
    public void onSuccess(e<JSONObject> eVar) {
        super.onSuccess(eVar);
        a(eVar.b.b, eVar.c);
    }

    public void a(String str) {
        this.f1394a = str;
    }

    private void a(List<h> list, JSONObject jSONObject) {
        o0.c(b, "parseLoad content = " + jSONObject);
        int iOptInt = jSONObject.optInt(NotificationCompat.CATEGORY_STATUS);
        if (1 == iOptInt) {
            calcRequestTime(System.currentTimeMillis());
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new RunnableC0184a(jSONObject.optString("version"), jSONObject, iOptInt));
            return;
        }
        a(iOptInt, jSONObject.optString(NotificationCompat.CATEGORY_MESSAGE));
    }
}
