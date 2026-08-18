package com.unity3d.services.core.configuration;

import android.app.Application;
import android.content.Context;
import androidx.startup.Initializer;
import com.umeng.analytics.pro.f;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2812Uq;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AdsSdkInitializer implements Initializer<C5033xf0> {
    @Override // androidx.startup.Initializer
    public /* bridge */ /* synthetic */ C5033xf0 create(Context context) {
        create2(context);
        return C5033xf0.f5238a;
    }

    @Override // androidx.startup.Initializer
    public List<Class<? extends Initializer<?>>> dependencies() {
        return C2812Uq.f3846a;
    }

    /* JADX INFO: renamed from: create, reason: avoid collision after fix types in other method */
    public void create2(Context context) {
        AbstractC2995aW.q(context, f.X);
        ClientProperties.setApplicationContext(context.getApplicationContext());
        if (context instanceof Application) {
            ClientProperties.setApplication((Application) context);
        } else if (context.getApplicationContext() instanceof Application) {
            Context applicationContext = context.getApplicationContext();
            AbstractC2995aW.o(applicationContext, "null cannot be cast to non-null type android.app.Application");
            ClientProperties.setApplication((Application) applicationContext);
        }
        SdkProperties.setAppInitializationTimeSinceEpoch(System.currentTimeMillis());
    }
}
