package androidx.lifecycle;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.viewmodel.CreationExtras;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2471Hm;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3156cG;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class ViewModelLazy<VM extends ViewModel> implements InterfaceC3069bH {
    private VM cached;
    private final InterfaceC2714Qw extrasProducer;
    private final InterfaceC2714Qw factoryProducer;
    private final InterfaceC2714Qw storeProducer;
    private final InterfaceC3156cG viewModelClass;

    /* JADX INFO: renamed from: androidx.lifecycle.ViewModelLazy$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2714Qw {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final CreationExtras.Empty invoke() {
            return CreationExtras.Empty.INSTANCE;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelLazy(InterfaceC3156cG interfaceC3156cG, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2714Qw interfaceC2714Qw2) {
        this(interfaceC3156cG, interfaceC2714Qw, interfaceC2714Qw2, null, 8, null);
        AbstractC2995aW.q(interfaceC3156cG, "viewModelClass");
        AbstractC2995aW.q(interfaceC2714Qw, "storeProducer");
        AbstractC2995aW.q(interfaceC2714Qw2, "factoryProducer");
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    public ViewModelLazy(InterfaceC3156cG interfaceC3156cG, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2714Qw interfaceC2714Qw2, InterfaceC2714Qw interfaceC2714Qw3) {
        AbstractC2995aW.q(interfaceC3156cG, "viewModelClass");
        AbstractC2995aW.q(interfaceC2714Qw, "storeProducer");
        AbstractC2995aW.q(interfaceC2714Qw2, "factoryProducer");
        AbstractC2995aW.q(interfaceC2714Qw3, "extrasProducer");
        this.viewModelClass = interfaceC3156cG;
        this.storeProducer = interfaceC2714Qw;
        this.factoryProducer = interfaceC2714Qw2;
        this.extrasProducer = interfaceC2714Qw3;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider((ViewModelStore) this.storeProducer.invoke(), (ViewModelProvider.Factory) this.factoryProducer.invoke(), (CreationExtras) this.extrasProducer.invoke()).get(AbstractC2995aW.K(this.viewModelClass));
        this.cached = vm2;
        return vm2;
    }

    public /* synthetic */ ViewModelLazy(InterfaceC3156cG interfaceC3156cG, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2714Qw interfaceC2714Qw2, InterfaceC2714Qw interfaceC2714Qw3, int i, AbstractC2471Hm abstractC2471Hm) {
        this(interfaceC3156cG, interfaceC2714Qw, interfaceC2714Qw2, (i & 8) != 0 ? AnonymousClass1.INSTANCE : interfaceC2714Qw3);
    }
}
