package com.unity3d.ads.core.domain;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.umeng.analytics.pro.f;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidHandleOpenUrl implements HandleOpenUrl {
    private final Context context;

    public AndroidHandleOpenUrl(Context context) {
        AbstractC2995aW.q(context, f.X);
        this.context = context;
    }

    @Override // com.unity3d.ads.core.domain.HandleOpenUrl
    public void invoke(String str, String str2) {
        AbstractC2995aW.q(str, "url");
        Intent intent = new Intent();
        if (str2 == null || str2.length() <= 0) {
            str2 = null;
        }
        intent.setPackage(str2);
        intent.setAction("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        this.context.startActivity(intent);
    }
}
