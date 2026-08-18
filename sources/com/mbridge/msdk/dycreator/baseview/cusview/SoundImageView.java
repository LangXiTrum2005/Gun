package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.g0;

/* JADX INFO: loaded from: classes2.dex */
public class SoundImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f1026a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1026a = true;
    }

    public boolean getStatus() {
        return this.f1026a;
    }

    public void setSoundStatus(boolean z) {
        this.f1026a = z;
        if (z) {
            setImageResource(g0.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(g0.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1026a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f1026a = true;
    }
}
