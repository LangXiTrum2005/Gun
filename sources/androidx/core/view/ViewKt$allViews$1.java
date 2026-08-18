package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4809v40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C4721u40;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.GZ;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC2314Bl(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
public final class ViewKt$allViews$1 extends GZ implements InterfaceC3567gx {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, InterfaceC2857Wj interfaceC2857Wj) {
        super(2, interfaceC2857Wj);
        this.$this_allViews = view;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.$this_allViews, interfaceC2857Wj);
        viewKt$allViews$1.L$0 = obj;
        return viewKt$allViews$1;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
    public final Object invoke(AbstractC4809v40 abstractC4809v40, InterfaceC2857Wj interfaceC2857Wj) {
        return ((ViewKt$allViews$1) create(abstractC4809v40, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
        int i = this.label;
        if (i == 0) {
            AbstractC3375el.b0(obj);
            AbstractC4809v40 abstractC4809v40 = (AbstractC4809v40) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = abstractC4809v40;
            this.label = 1;
            C4721u40 c4721u40 = (C4721u40) abstractC4809v40;
            c4721u40.b = view;
            c4721u40.f5063a = 3;
            c4721u40.d = this;
            return enumC4602sk;
        }
        C5033xf0 c5033xf0 = C5033xf0.f5238a;
        if (i == 1) {
            AbstractC4809v40 abstractC4809v41 = (AbstractC4809v40) this.L$0;
            AbstractC3375el.b0(obj);
            View view2 = this.$this_allViews;
            if (view2 instanceof ViewGroup) {
                InterfaceC4545s40 descendants = ViewGroupKt.getDescendants((ViewGroup) view2);
                this.L$0 = null;
                this.label = 2;
                abstractC4809v41.getClass();
                Iterator it = descendants.iterator();
                C4721u40 c4721u41 = (C4721u40) abstractC4809v41;
                if (it.hasNext()) {
                    c4721u41.c = it;
                    c4721u41.f5063a = 2;
                    c4721u41.d = this;
                    obj2 = enumC4602sk;
                } else {
                    obj2 = c5033xf0;
                }
                if (obj2 != enumC4602sk) {
                    obj2 = c5033xf0;
                }
                if (obj2 == enumC4602sk) {
                    return enumC4602sk;
                }
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC3375el.b0(obj);
        }
        return c5033xf0;
    }
}
