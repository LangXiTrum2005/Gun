package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.components.ComponentRegistrar;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2709Qr;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3190ch;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3315e4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3605hO;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4266ou;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5226zo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ExecutorC3030ap0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.G7;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3227d4;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3543gh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4320pa0;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC3227d4 lambda$getComponents$0(InterfaceC3543gh interfaceC3543gh) {
        C4266ou c4266ou = (C4266ou) interfaceC3543gh.a(C4266ou.class);
        Context context = (Context) interfaceC3543gh.a(Context.class);
        InterfaceC4320pa0 interfaceC4320pa0 = (InterfaceC4320pa0) interfaceC3543gh.a(InterfaceC4320pa0.class);
        Preconditions.checkNotNull(c4266ou);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(interfaceC4320pa0);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (C3315e4.b == null) {
            synchronized (C3315e4.class) {
                try {
                    if (C3315e4.b == null) {
                        Bundle bundle = new Bundle(1);
                        c4266ou.a();
                        if ("[DEFAULT]".equals(c4266ou.b)) {
                            ((C2709Qr) interfaceC4320pa0).a(ExecutorC3030ap0.f4144a, G7.n);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c4266ou.g());
                        }
                        C3315e4.b = new C3315e4(zzef.zzg(context, null, null, null, bundle).zzd());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return C3315e4.b;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<C3190ch> getComponents() {
        C3605hO c3605hOA = C3190ch.a(InterfaceC3227d4.class);
        c3605hOA.b(C5226zo.a(C4266ou.class));
        c3605hOA.b(C5226zo.a(Context.class));
        c3605hOA.b(C5226zo.a(InterfaceC4320pa0.class));
        c3605hOA.f = G7.o;
        c3605hOA.m(2);
        return Arrays.asList(c3605hOA.c(), AbstractC3375el.u("fire-analytics", "21.3.0"));
    }
}
