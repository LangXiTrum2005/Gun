package androidx.activity;

import androidx.annotation.MainThread;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3069bH;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityViewModelLazyKt {

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1, reason: invalid class name */
    public static final class AnonymousClass1 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2, reason: invalid class name */
    public static final class AnonymousClass2 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final CreationExtras invoke() {
            return this.$this_viewModels.getDefaultViewModelCreationExtras();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3, reason: invalid class name */
    public static final class AnonymousClass3 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4, reason: invalid class name */
    public static final class AnonymousClass4 extends WG implements InterfaceC2714Qw {
        final /* synthetic */ InterfaceC2714Qw $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(InterfaceC2714Qw interfaceC2714Qw, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = interfaceC2714Qw;
            this.$this_viewModels = componentActivity;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            InterfaceC2714Qw interfaceC2714Qw = this.$extrasProducer;
            return (interfaceC2714Qw == null || (creationExtras = (CreationExtras) interfaceC2714Qw.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC3069bH viewModels(ComponentActivity componentActivity, InterfaceC2714Qw interfaceC2714Qw) {
        if (interfaceC2714Qw == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC2995aW.w0();
        throw null;
    }

    public static InterfaceC3069bH viewModels$default(ComponentActivity componentActivity, InterfaceC2714Qw interfaceC2714Qw, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC2714Qw = null;
        }
        if (interfaceC2714Qw == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        AbstractC2995aW.w0();
        throw null;
    }

    @MainThread
    public static final <VM extends ViewModel> InterfaceC3069bH viewModels(ComponentActivity componentActivity, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2714Qw interfaceC2714Qw2) {
        if (interfaceC2714Qw2 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC2995aW.w0();
        throw null;
    }

    public static InterfaceC3069bH viewModels$default(ComponentActivity componentActivity, InterfaceC2714Qw interfaceC2714Qw, InterfaceC2714Qw interfaceC2714Qw2, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC2714Qw2 = null;
        }
        if (interfaceC2714Qw2 == null) {
            new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        AbstractC2995aW.w0();
        throw null;
    }
}
