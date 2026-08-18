package androidx.lifecycle;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes.dex */
public final class Transformations$switchMap$2$onChanged$1 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ MediatorLiveData $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$switchMap$2$onChanged$1(MediatorLiveData mediatorLiveData) {
        super(1);
        this.$result = mediatorLiveData;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m19invoke(obj);
        return C5033xf0.f5238a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m19invoke(Object obj) {
        this.$result.setValue(obj);
    }
}
