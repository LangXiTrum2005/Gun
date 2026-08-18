package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.LD.Lxb;
import com.bytedance.sdk.openadsdk.core.NXR.LD.lc;
import com.bytedance.sdk.openadsdk.core.model.tD;
import com.bytedance.sdk.openadsdk.utils.lk;

/* JADX INFO: loaded from: classes2.dex */
public class PAGVideoMediaView extends PAGMediaView implements Lxb.InterfaceC0093Lxb {
    private lc LD;
    private tD ZU;
    private final com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lk;

    public PAGVideoMediaView(Context context, @Nullable View view, @Nullable com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb) {
        super(context);
        Lxb(view);
        this.lk = lxb;
    }

    private boolean LD() {
        lc lcVar = this.LD;
        if (lcVar != null) {
            return lcVar.sLN();
        }
        return false;
    }

    private void Lxb(View view) {
        if (view instanceof lc) {
            lc lcVar = (lc) view;
            this.LD = lcVar;
            addView(lcVar, -1, -1);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void close() {
        lc lcVar = this.LD;
        if (lcVar != null) {
            lcVar.IeN();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.LD.Lxb.InterfaceC0093Lxb
    public long getVideoProgress() {
        lc lcVar = this.LD;
        if (lcVar == null || lcVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.LD.getNativeVideoController().JXs();
    }

    public void handleInterruptVideo() {
        if (LD()) {
            return;
        }
        Lxb();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        lk.Lxb(this, this.ZU);
    }

    public void setMaterialMeta(tD tDVar) {
        this.ZU = tDVar;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener instanceof Lxb) {
            ((Lxb) onClickListener).Lxb((Lxb.InterfaceC0093Lxb) this);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
    public void setVideoAdListener(final PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.Lxb.LD.Lxb lxb = this.lk;
        if (lxb == null) {
            return;
        }
        lxb.Lxb(new PAGVideoAdListener() { // from class: com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView.1
            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdComplete() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPaused() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoAdPlay() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener
            public void onVideoError() {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }
        });
    }

    private void Lxb() {
        lc lcVar = this.LD;
        if (lcVar != null) {
            lcVar.STP();
        }
    }
}
