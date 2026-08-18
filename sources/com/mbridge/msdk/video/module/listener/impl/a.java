package com.mbridge.msdk.video.module.listener.impl;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.o0;

/* JADX INFO: loaded from: classes2.dex */
public class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f2264a;
    private CampaignEx b;

    public a(Activity activity, CampaignEx campaignEx) {
        this.f2264a = activity;
        this.b = campaignEx;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        if (i != 106 || this.f2264a == null || this.b == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            String strA = com.mbridge.msdk.click.c.a(this.b.getClickURL(), "-999", "-999");
            if (!TextUtils.isEmpty(strA)) {
                intent.setData(Uri.parse(strA));
                this.f2264a.startActivity(intent);
            }
        } catch (Throwable th) {
            o0.b("NotifyListener", th.getMessage(), th);
        }
        this.f2264a.finish();
    }
}
