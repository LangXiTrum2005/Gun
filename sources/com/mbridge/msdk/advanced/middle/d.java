package com.mbridge.msdk.advanced.middle;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected NativeAdvancedAdListener f930a;
    protected CampaignEx b;
    protected c c;

    public d(c cVar, NativeAdvancedAdListener nativeAdvancedAdListener, CampaignEx campaignEx) {
        this.c = cVar;
        this.f930a = nativeAdvancedAdListener;
        this.b = campaignEx;
    }

    public void a(MBridgeIds mBridgeIds, String str) {
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), this.b, mBridgeIds.getUnitId(), str);
    }

    public void b(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f930a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onClick(mBridgeIds);
        }
    }

    public void c(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f930a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onClose(mBridgeIds);
            c cVar = this.c;
            if (cVar != null) {
                cVar.E = false;
            }
        }
    }

    public void d(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f930a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLeaveApp(mBridgeIds);
        }
    }

    public void e(MBridgeIds mBridgeIds) {
        c cVar = this.c;
        if (cVar != null) {
            cVar.E = true;
        }
        StringBuffer stringBuffer = new StringBuffer("load_to=0&allow_skip=");
        stringBuffer.append(this.c.f());
        stringBuffer.append("&");
        j.b(com.mbridge.msdk.foundation.controller.c.n().d(), this.b, mBridgeIds.getUnitId(), stringBuffer.toString());
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f930a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLogImpression(mBridgeIds);
        }
    }

    public void f(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f930a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.showFullScreen(mBridgeIds);
        }
    }

    public void a(MBridgeIds mBridgeIds) {
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f930a;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.closeFullScreen(mBridgeIds);
        }
    }
}
