package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;

/* JADX INFO: loaded from: classes.dex */
public final class InitializerViewModelFactoryKt {
    public static final <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(initializerViewModelFactoryBuilder, "<this>");
        AbstractC2995aW.q(interfaceC2766Sw, "initializer");
        AbstractC2995aW.w0();
        throw null;
    }

    public static final ViewModelProvider.Factory viewModelFactory(InterfaceC2766Sw interfaceC2766Sw) {
        AbstractC2995aW.q(interfaceC2766Sw, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        interfaceC2766Sw.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
