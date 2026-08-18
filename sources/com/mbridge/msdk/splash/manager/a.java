package com.mbridge.msdk.splash.manager;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.dycreator.bridge.MBSplashData;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.splash.view.MBSplashNativeView;
import com.mbridge.msdk.splash.view.MBSplashView;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: com.mbridge.msdk.splash.manager.a$a, reason: collision with other inner class name */
    public class C0240a implements com.mbridge.msdk.foundation.feedback.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.splash.middle.a f1824a;
        final /* synthetic */ int b;

        public C0240a(com.mbridge.msdk.splash.middle.a aVar, int i) {
            this.f1824a = aVar;
            this.b = i;
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            this.f1824a.a(2, this.b);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void showed() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void summit(String str) {
            this.f1824a.a(2, this.b);
        }
    }

    public void a(List<String> list, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        throw null;
    }

    public void a(MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        Context context = mBSplashView.getContext();
        if (context == null) {
            context = com.mbridge.msdk.foundation.controller.c.n().d();
        }
        if (cVar == null && aVar != null) {
            aVar.onError("The render parameters is unavailable.");
            return;
        }
        String strA = (cVar == null || cVar.b() == null) ? "" : x.a(cVar.b().getAdZip());
        if (TextUtils.isEmpty(strA)) {
            a(context, mBSplashView, cVar, aVar);
            return;
        }
        if (cVar == null || cVar.b() == null) {
            return;
        }
        if (TextUtils.isEmpty(cVar.b().getAdZip())) {
            a(context, mBSplashView, cVar, aVar);
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(strA);
            a(arrayList, mBSplashView, cVar, aVar);
        } catch (Exception unused) {
            a(context, mBSplashView, cVar, aVar);
        }
    }

    public void a(com.mbridge.msdk.splash.middle.a aVar, CampaignEx campaignEx, com.mbridge.msdk.dycreator.viewdata.base.a aVar2) {
        if (campaignEx != null) {
            String campaignUnitId = campaignEx.getCampaignUnitId();
            String requestId = campaignEx.getRequestId();
            int currentCountDown = aVar2 != null ? aVar2.getEffectData().getCurrentCountDown() : 0;
            aVar.a(1, currentCountDown);
            com.mbridge.msdk.foundation.feedback.bean.a aVarB = com.mbridge.msdk.foundation.feedback.b.b().b(campaignUnitId + "_" + requestId);
            if (aVarB != null) {
                aVarB.a(campaignEx);
                com.mbridge.msdk.foundation.feedback.b.b().a(DM.i(campaignUnitId, "_", requestId), new C0240a(aVar, currentCountDown));
                aVarB.p();
            }
        }
    }

    public void a(com.mbridge.msdk.dycreator.viewdata.base.a aVar, com.mbridge.msdk.splash.middle.a aVar2, CampaignEx campaignEx) {
        float f;
        int clickType;
        float f2;
        if (aVar == null || !(aVar instanceof MBSplashData)) {
            f = 0.0f;
            clickType = 0;
            f2 = 0.0f;
        } else {
            MBSplashData mBSplashData = (MBSplashData) aVar;
            f = mBSplashData.getxInScreen();
            f2 = mBSplashData.getyInScreen();
            clickType = mBSplashData.getClickType();
        }
        if (aVar2 != null) {
            try {
                aVar2.a(com.mbridge.msdk.splash.common.util.a.a(com.mbridge.msdk.splash.common.util.a.a(clickType, f, f2), campaignEx));
            } catch (Throwable th) {
                th.printStackTrace();
                aVar2.a(campaignEx);
            }
        }
    }

    public void a(Context context, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar, com.mbridge.msdk.splash.inter.a aVar) {
        try {
            MBSplashNativeView mBSplashNativeView = new MBSplashNativeView(context, mBSplashView, cVar);
            if (aVar != null) {
                aVar.a(mBSplashNativeView);
            }
        } catch (Throwable unused) {
            if (aVar != null) {
                aVar.onError("View render error.");
            }
        }
    }
}
