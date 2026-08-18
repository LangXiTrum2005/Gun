package com.unity3d.ads.core.data.datasource;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ProcessLifecycleOwner;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4995x90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4907w90;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4309pQ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidLifecycleDataSource implements LifecycleDataSource, LifecycleEventObserver {
    private final InterfaceC4309pQ appActive = AbstractC4995x90.a(Boolean.TRUE);

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.core.data.datasource.AndroidLifecycleDataSource$registerAppLifecycle$1", f = "AndroidLifecycleDataSource.kt", l = {}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        int label;

        public AnonymousClass1(InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return AndroidLifecycleDataSource.this.new AnonymousClass1(interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
            ProcessLifecycleOwner.Companion.get().getLifecycle().addObserver(AndroidLifecycleDataSource.this);
            return C5033xf0.f5238a;
        }
    }

    public AndroidLifecycleDataSource() {
        registerAppLifecycle();
    }

    private final void registerAppLifecycle() {
        WD.D(WD.c(), null, 0, new AnonymousClass1(null), 3);
    }

    @Override // com.unity3d.ads.core.data.datasource.LifecycleDataSource
    public boolean appIsForeground() {
        return ((Boolean) ((C4907w90) this.appActive).getValue()).booleanValue();
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) throws IllegalAccessException, InvocationTargetException {
        AbstractC2995aW.q(lifecycleOwner, "source");
        AbstractC2995aW.q(event, NotificationCompat.CATEGORY_EVENT);
        InterfaceC4309pQ interfaceC4309pQ = this.appActive;
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        boolean zBooleanValue = true;
        if (i == 1) {
            zBooleanValue = false;
        } else if (i != 2) {
            zBooleanValue = ((Boolean) ((C4907w90) this.appActive).getValue()).booleanValue();
        }
        ((C4907w90) interfaceC4309pQ).i(Boolean.valueOf(zBooleanValue));
    }
}
