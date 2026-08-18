package com.bytedance.sdk.openadsdk.api.nativeAd;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes2.dex */
public class PAGMediaView extends FrameLayout {
    protected Integer Lxb;

    public PAGMediaView(@NonNull Context context) {
        super(context);
    }

    public void close() {
    }

    public void setMrcTrackerKey(Integer num) {
        this.Lxb = num;
    }

    public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
    }

    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @RequiresApi(api = 21)
    public PAGMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
