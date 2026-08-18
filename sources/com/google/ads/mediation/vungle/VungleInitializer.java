package com.google.ads.mediation.vungle;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.MobileAds;
import com.vungle.ads.VungleAds$WrapperFramework;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3282di0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3723ij0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ei0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3856kD;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class VungleInitializer implements InterfaceC3856kD {
    public static final VungleInitializer c = new VungleInitializer();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f789a = new AtomicBoolean(false);
    public final ArrayList b = new ArrayList();

    public interface VungleInitializationListener {
        void onInitializeError(AdError adError);

        void onInitializeSuccess();
    }

    public VungleInitializer() {
        C3282di0.setIntegrationName(VungleAds$WrapperFramework.admob, "7.4.3.0".replace('.', '_'));
    }

    @NonNull
    public static VungleInitializer getInstance() {
        return c;
    }

    public void initialize(@NonNull String str, @NonNull Context context, @NonNull VungleInitializationListener vungleInitializationListener) {
        if (VungleSdkWrapper.delegate.isInitialized()) {
            vungleInitializationListener.onInitializeSuccess();
            return;
        }
        boolean andSet = this.f789a.getAndSet(true);
        ArrayList arrayList = this.b;
        if (andSet) {
            arrayList.add(vungleInitializationListener);
            return;
        }
        updateCoppaStatus(MobileAds.getRequestConfiguration().getTagForChildDirectedTreatment());
        VungleSdkWrapper.delegate.init(context, str, this);
        arrayList.add(vungleInitializationListener);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3856kD
    public void onError(@NonNull Ei0 ei0) {
        AdError adError = VungleMediationAdapter.getAdError(ei0);
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((VungleInitializationListener) it.next()).onInitializeError(adError);
        }
        arrayList.clear();
        this.f789a.set(false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3856kD
    public void onSuccess() {
        ArrayList arrayList = this.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((VungleInitializationListener) it.next()).onInitializeSuccess();
        }
        arrayList.clear();
        this.f789a.set(false);
    }

    public void updateCoppaStatus(int i) {
        if (i == 0) {
            C3723ij0.setCOPPAStatus(false);
        } else {
            if (i != 1) {
                return;
            }
            C3723ij0.setCOPPAStatus(true);
        }
    }
}
