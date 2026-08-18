package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;

/* JADX INFO: loaded from: classes2.dex */
public class g0 {
    public static boolean a(int i) {
        return (i == -1 || ((-16777216) & i) == 0 || (i & 16711680) == 0) ? false : true;
    }

    public static int a(Context context, String str, String str2) {
        String packageName = "";
        try {
            try {
                packageName = com.mbridge.msdk.foundation.controller.c.n().h();
            } catch (Exception unused) {
                o0.b("ResourceUtil", "MBSDKContext.getInstance() is null resName:" + str);
            }
            if (y0.a(packageName) && context != null) {
                packageName = context.getPackageName();
            }
            if (y0.a(packageName) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, packageName);
        } catch (Exception unused2) {
            AbstractC5044xl.s("Resource not found resName:", str, "ResourceUtil");
            return -1;
        }
    }

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e) {
                AbstractC3888ke0.q(e, new StringBuilder("Resource error:"), "ResourceUtil");
            }
        }
        return null;
    }
}
