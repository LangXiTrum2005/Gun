package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.utils.le;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;

/* JADX INFO: loaded from: classes2.dex */
public class TTAdDislikeToast extends com.bytedance.sdk.openadsdk.core.JXs.lk {
    private static String sDislikeSendTip;
    private static String sDislikeTip;
    private static String sSkipText;
    private final Handler mHandler;
    private TextView mTextView;

    public TTAdDislikeToast(Context context) {
        this(context, null);
    }

    public static String getDislikeSendTip() {
        if (sDislikeSendTip == null) {
            Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
            sDislikeSendTip = tD.Lxb(contextLxb, "tt_feedback_thank_text") + "\n" + tD.Lxb(contextLxb, "tt_feedback_experience_text");
        }
        return sDislikeSendTip;
    }

    public static String getDislikeTip() {
        if (sDislikeTip == null) {
            sDislikeTip = tD.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), "tt_feedback_submit_text");
        }
        return sDislikeTip;
    }

    public static String getSkipText() {
        if (sSkipText == null) {
            sSkipText = tD.Lxb(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), "tt_reward_screen_skip_tx");
        }
        return sSkipText;
    }

    private void initToast(Context context) {
        TextView textView = new TextView(context);
        this.mTextView = textView;
        textView.setClickable(false);
        this.mTextView.setFocusable(false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = le.lk(getContext(), 75.0f);
        int iLk = le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 16.0f);
        int iLk2 = le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 12.0f);
        this.mTextView.setPadding(iLk, iLk2, iLk, iLk2);
        this.mTextView.setLayoutParams(layoutParams);
        this.mTextView.setTextColor(-1);
        this.mTextView.setTextSize(16.0f);
        this.mTextView.setGravity(GravityCompat.START);
        Drawable drawableLk = tD.lk(getContext(), "tt_dislike_toast");
        int iLk3 = le.lk(getContext(), 16.0f);
        drawableLk.setBounds(0, 0, iLk3, iLk3);
        this.mTextView.setCompoundDrawablePadding(iLk3 / 2);
        this.mTextView.setCompoundDrawables(drawableLk, null, null, null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.argb(EnumC4719u30.INVALID_JSON_BID_PAYLOAD_VALUE, 37, 37, 37));
        gradientDrawable.setCornerRadius(le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb(), 12.0f));
        this.mTextView.setBackground(gradientDrawable);
        addView(this.mTextView);
    }

    public static void onResourceUpdated() {
        Context contextLxb = com.bytedance.sdk.openadsdk.core.kqm.Lxb();
        sSkipText = tD.Lxb(contextLxb, "tt_reward_screen_skip_tx");
        sDislikeTip = tD.Lxb(contextLxb, "tt_feedback_submit_text");
        sDislikeSendTip = tD.Lxb(contextLxb, "tt_feedback_thank_text") + "\n" + tD.Lxb(contextLxb, "tt_feedback_experience_text");
    }

    public void hide() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void onDestroy() {
        setVisibility(8);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void show(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mHandler.removeCallbacksAndMessages(null);
        this.mHandler.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.1
            @Override // java.lang.Runnable
            public void run() {
                if (TTAdDislikeToast.this.mTextView != null) {
                    TTAdDislikeToast.this.mTextView.setText(String.valueOf(str));
                }
                TTAdDislikeToast.this.setVisibility(0);
            }
        });
        this.mHandler.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.TTAdDislikeToast.2
            @Override // java.lang.Runnable
            public void run() {
                TTAdDislikeToast.this.setVisibility(8);
            }
        }, 2000L);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TTAdDislikeToast(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mHandler = new Handler(Looper.getMainLooper());
        setVisibility(8);
        setClickable(false);
        setFocusable(false);
        initToast(context);
    }
}
