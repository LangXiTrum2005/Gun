package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ph0;

/* JADX INFO: loaded from: classes.dex */
public final class InitializerViewModelFactory implements ViewModelProvider.Factory {
    private final ViewModelInitializer<?>[] initializers;

    public InitializerViewModelFactory(ViewModelInitializer<?>... viewModelInitializerArr) {
        AbstractC2995aW.q(viewModelInitializerArr, "initializers");
        this.initializers = viewModelInitializerArr;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls) {
        return Ph0.a(this, cls);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, CreationExtras creationExtras) {
        AbstractC2995aW.q(cls, "modelClass");
        AbstractC2995aW.q(creationExtras, "extras");
        T t = null;
        for (ViewModelInitializer<?> viewModelInitializer : this.initializers) {
            if (AbstractC2995aW.i(viewModelInitializer.getClazz$lifecycle_viewmodel_release(), cls)) {
                Object objInvoke = viewModelInitializer.getInitializer$lifecycle_viewmodel_release().invoke(creationExtras);
                t = objInvoke instanceof ViewModel ? (T) objInvoke : null;
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }
}
