package com.unity3d.ads.adplayer;

import com.badlogic.gdx.Input;
import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.services.core.device.StorageEventInfo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3375el;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C5033xf0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ea0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4602sk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2314Bl;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2857Wj;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4514rk;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WG;

/* JADX INFO: loaded from: classes3.dex */
public final class WebViewAdPlayer$storageEventCallback$1 extends WG implements InterfaceC2766Sw {
    final /* synthetic */ WebViewAdPlayer this$0;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1, reason: invalid class name */
    @InterfaceC2314Bl(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", l = {Input.Keys.APOSTROPHE}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends Ea0 implements InterfaceC3567gx {
        final /* synthetic */ StorageEventInfo $it;
        int label;
        final /* synthetic */ WebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, InterfaceC2857Wj interfaceC2857Wj) {
            super(2, interfaceC2857Wj);
            this.this$0 = webViewAdPlayer;
            this.$it = storageEventInfo;
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final InterfaceC2857Wj create(Object obj, InterfaceC2857Wj interfaceC2857Wj) {
            return new AnonymousClass1(this.this$0, this.$it, interfaceC2857Wj);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3567gx
        public final Object invoke(InterfaceC4514rk interfaceC4514rk, InterfaceC2857Wj interfaceC2857Wj) {
            return ((AnonymousClass1) create(interfaceC4514rk, interfaceC2857Wj)).invokeSuspend(C5033xf0.f5238a);
        }

        @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3677i9
        public final Object invokeSuspend(Object obj) {
            EnumC4602sk enumC4602sk = EnumC4602sk.f4993a;
            int i = this.label;
            if (i == 0) {
                AbstractC3375el.b0(obj);
                WebViewBridge webViewBridge = this.this$0.bridge;
                OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                this.label = 1;
                if (webViewBridge.sendEvent(onStorageEvent, this) == enumC4602sk) {
                    return enumC4602sk;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC3375el.b0(obj);
            }
            return C5033xf0.f5238a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewAdPlayer$storageEventCallback$1(WebViewAdPlayer webViewAdPlayer) {
        super(1);
        this.this$0 = webViewAdPlayer;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2766Sw
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((StorageEventInfo) obj);
        return C5033xf0.f5238a;
    }

    public final void invoke(StorageEventInfo storageEventInfo) {
        AbstractC2995aW.q(storageEventInfo, "it");
        WD.D(this.this$0.getScope(), null, 0, new AnonymousClass1(this.this$0, storageEventInfo, null), 3);
    }
}
