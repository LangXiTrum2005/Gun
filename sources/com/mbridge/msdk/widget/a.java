package com.mbridge.msdk.widget;

import android.view.View;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements View.OnClickListener {
    public static final int MIN_CLICK_DELAY_TIME = 2000;
    private long lastClickTime = 0;

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.lastClickTime > 2000) {
            this.lastClickTime = timeInMillis;
            onNoDoubleClick(view);
        }
    }

    public abstract void onNoDoubleClick(View view);
}
