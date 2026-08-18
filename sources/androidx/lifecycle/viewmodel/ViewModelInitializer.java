package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelInitializer<T extends ViewModel> {
    private final Class<T> clazz;
    private final InterfaceC2766Sw initializer;

    public ViewModelInitializer(Class<T> cls, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(cls, "clazz");
        AbstractC2995aW.q(interfaceC2766Sw, "initializer");
        this.clazz = cls;
        this.initializer = interfaceC2766Sw;
    }

    public final Class<T> getClazz$lifecycle_viewmodel_release() {
        return this.clazz;
    }

    public final InterfaceC2766Sw getInitializer$lifecycle_viewmodel_release() {
        return this.initializer;
    }
}
