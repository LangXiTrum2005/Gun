package com.mbridge.msdk.mbbanner.common.util;

import android.os.Handler;
import android.os.Looper;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static final String c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f1398a = new Handler(Looper.getMainLooper());
    private boolean b;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbbanner.common.util.a$a, reason: collision with other inner class name */
    public class RunnableC0186a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f1399a;
        final /* synthetic */ String b;
        final /* synthetic */ CampaignUnit c;

        public RunnableC0186a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, CampaignUnit campaignUnit) {
            this.f1399a = bVar;
            this.b = str;
            this.c = campaignUnit;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f1399a;
            if (bVar != null) {
                bVar.a(this.b, this.c, a.this.b);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f1400a;
        final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

        public b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f1400a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1400a != null) {
                this.b.b(a.this.b);
                this.f1400a.a(this.b);
            }
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f1401a;
        final /* synthetic */ String b;
        final /* synthetic */ int c;

        public c(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i) {
            this.f1401a = bVar;
            this.b = str;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.mbbanner.common.listener.b bVar = this.f1401a;
            if (bVar != null) {
                bVar.a(this.b, this.c, a.this.b);
            }
        }
    }

    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f1402a;
        final /* synthetic */ com.mbridge.msdk.foundation.error.b b;

        public d(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
            this.f1402a = bVar;
            this.b = bVar2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1402a != null) {
                this.b.b(a.this.b);
                this.f1402a.b(this.b);
            }
        }
    }

    public void b(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        o0.b(c, "postResourceFail unitId=" + bVar2);
        this.f1398a.post(new d(bVar, bVar2));
    }

    public void a(boolean z) {
        this.b = z;
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, CampaignUnit campaignUnit, String str) {
        AbstractC5044xl.s("postCampaignSuccess unitId=", str, c);
        this.f1398a.post(new RunnableC0186a(bVar, str, campaignUnit));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, com.mbridge.msdk.foundation.error.b bVar2) {
        this.f1398a.post(new b(bVar, bVar2));
    }

    public void a(com.mbridge.msdk.mbbanner.common.listener.b bVar, String str, int i) {
        AbstractC5044xl.s("postResourceSuccess unitId=", str, c);
        this.f1398a.post(new c(bVar, str, i));
    }
}
