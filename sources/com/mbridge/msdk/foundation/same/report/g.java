package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f1237a = new Handler(Looper.getMainLooper());

    public static void a(CampaignEx campaignEx, String str, String str2, String str3) {
        if (campaignEx == null || !campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m("m_download_end", TextUtils.isEmpty(campaignEx.getMraid()) ^ true ? 1 : 3, "0", "", campaignEx.getId(), str2, str, String.valueOf(campaignEx.getKeyIaRst()));
        mVar.b(campaignEx.getId());
        mVar.n(campaignEx.getRequestId());
        mVar.k(campaignEx.getCurrentLocalRid());
        mVar.o(campaignEx.getRequestIdNotice());
        mVar.a(campaignEx.getAdSpaceT());
        mVar.a(str3);
        mVar.e(7);
        mVar.c(k0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
        mVar.b(campaignEx.isMraid() ? com.mbridge.msdk.foundation.entity.m.N : com.mbridge.msdk.foundation.entity.m.O);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a(mVar, campaignEx);
    }

    public static void b(com.mbridge.msdk.foundation.entity.m mVar, Context context, String str) {
        o.c(mVar);
    }

    public static void c(com.mbridge.msdk.foundation.entity.m mVar, Context context, String str) {
        o.d(mVar);
    }

    public static void d(com.mbridge.msdk.foundation.entity.m mVar, Context context, String str) {
        if (mVar != null) {
            mVar.j("2000060");
            mVar.u(str);
            mVar.c(k0.s(context));
            o.h(mVar);
        }
    }

    public static void b(com.mbridge.msdk.foundation.entity.m mVar, String str, CampaignEx campaignEx) {
        if (mVar != null) {
            mVar.j("2000059");
            mVar.u(str);
            mVar.c(k0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
            mVar.d(com.mbridge.msdk.foundation.tools.f.d());
            o.g(mVar);
        }
    }

    public static void a(com.mbridge.msdk.foundation.entity.m mVar, String str, CampaignEx campaignEx) {
        int adType;
        if (mVar != null) {
            mVar.d(com.mbridge.msdk.foundation.tools.f.d());
            if (campaignEx != null && ((adType = campaignEx.getAdType()) == 94 || adType == 287)) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(mVar, campaignEx);
            } else {
                o.f(mVar);
            }
        }
    }

    public static void a(com.mbridge.msdk.foundation.entity.m mVar, Context context, String str) {
        if (mVar != null) {
            mVar.j("2000063");
            mVar.u(str);
            mVar.c(k0.s(context));
            o.e(mVar);
        }
    }
}
