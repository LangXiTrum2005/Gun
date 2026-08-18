package com.unity3d.ads.adplayer;

import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.WD;

/* JADX INFO: loaded from: classes3.dex */
public final class AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1 implements View.OnAttachStateChangeListener {
    final /* synthetic */ View $this_doOnDetach;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    public AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(View view, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer) {
        this.$this_doOnDetach = view;
        this.this$0 = androidEmbeddableWebViewAdPlayer;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        AbstractC2995aW.q(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        this.$this_doOnDetach.removeOnAttachStateChangeListener(this);
        WD.D(this.this$0.webViewAdPlayer.getScope(), null, 0, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this.this$0, null), 3);
    }
}
