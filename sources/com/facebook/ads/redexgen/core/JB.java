package com.facebook.ads.redexgen.core;

import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JB implements View.OnTouchListener {
    public final /* synthetic */ TextureViewSurfaceTextureListenerC1268an A00;

    public JB(TextureViewSurfaceTextureListenerC1268an textureViewSurfaceTextureListenerC1268an) {
        this.A00 = textureViewSurfaceTextureListenerC1268an;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.A00.A09 != null && motionEvent.getAction() == 1) {
            if (this.A00.A09.isShowing()) {
                this.A00.A09.hide();
            } else {
                this.A00.A09.show();
            }
        }
        return true;
    }
}
