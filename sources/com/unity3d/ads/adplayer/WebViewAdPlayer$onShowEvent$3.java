package com.unity3d.ads.adplayer;

import com.unity3d.ads.adplayer.model.ShowStatus;
import com.unity3d.ads.core.data.model.ShowEvent;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$onShowEvent$3", f = "WebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
public final class WebViewAdPlayer$onShowEvent$3 extends Ea0 implements InterfaceC3655hx {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public WebViewAdPlayer$onShowEvent$3(InterfaceC2857Wj interfaceC2857Wj) {
        super(3, interfaceC2857Wj);
    }

    public final Object invoke(ShowEvent showEvent, boolean z, InterfaceC2857Wj interfaceC2857Wj) {
        WebViewAdPlayer$onShowEvent$3 webViewAdPlayer$onShowEvent$3 = new WebViewAdPlayer$onShowEvent$3(interfaceC2857Wj);
        webViewAdPlayer$onShowEvent$3.L$0 = showEvent;
        webViewAdPlayer$onShowEvent$3.Z$0 = z;
        return webViewAdPlayer$onShowEvent$3.invokeSuspend(C5033xf0.f5238a);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC3375el.b0(obj);
        return this.Z$0 ? new ShowEvent.Completed(ShowStatus.COMPLETED) : (ShowEvent) this.L$0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3655hx
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ShowEvent) obj, ((Boolean) obj2).booleanValue(), (InterfaceC2857Wj) obj3);
    }
}
