package com.mbridge.msdk.video.module.listener.impl;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.k0;
import com.mbridge.msdk.foundation.tools.o0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes2.dex */
public class e implements com.mbridge.msdk.foundation.same.image.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected ImageView f2265a;
    private CampaignEx b;
    private String c;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f2266a;

        public a(String str) {
            this.f2266a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.n().d()));
                if (e.this.b == null) {
                    o0.a("ImageLoaderListener", "campaign is null");
                    return;
                }
                com.mbridge.msdk.foundation.entity.m mVar = new com.mbridge.msdk.foundation.entity.m();
                mVar.j("2000044");
                mVar.c(k0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
                mVar.b(e.this.b.getId());
                mVar.i(e.this.b.getImageUrl());
                mVar.n(e.this.b.getRequestId());
                mVar.o(e.this.b.getRequestIdNotice());
                mVar.u(e.this.c);
                mVar.m(this.f2266a);
                nVarA.a(mVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public e(ImageView imageView) {
        this.f2265a = imageView;
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onFailedLoad(String str, String str2) {
        a aVar = new a(str);
        if (com.mbridge.msdk.foundation.controller.d.a().e()) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
        } else {
            aVar.run();
        }
        AbstractC5044xl.s("desc:", str, "ImageLoaderListener");
    }

    @Override // com.mbridge.msdk.foundation.same.image.c
    public void onSuccessLoad(Bitmap bitmap, String str) {
        try {
            if (bitmap == null) {
                o0.b("ImageLoaderListener", "bitmap=null");
            } else {
                if (this.f2265a == null || bitmap.isRecycled()) {
                    return;
                }
                this.f2265a.setImageBitmap(bitmap);
                this.f2265a.setVisibility(0);
            }
        } catch (Throwable th) {
            if (MBridgeConstans.DEBUG) {
                th.printStackTrace();
            }
        }
    }

    public e(ImageView imageView, CampaignEx campaignEx, String str) {
        this.f2265a = imageView;
        this.b = campaignEx;
        this.c = str;
    }
}
