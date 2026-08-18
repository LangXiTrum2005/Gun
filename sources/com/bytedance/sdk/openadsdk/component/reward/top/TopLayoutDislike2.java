package com.bytedance.sdk.openadsdk.component.reward.top;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.core.JXs.JXs;
import com.bytedance.sdk.openadsdk.core.JXs.OY;
import com.bytedance.sdk.openadsdk.core.JXs.ZU;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.model.eK;
import com.bytedance.sdk.openadsdk.core.settings.VVE;
import com.bytedance.sdk.openadsdk.core.widget.ebl;
import com.bytedance.sdk.openadsdk.utils.QAg;
import com.bytedance.sdk.openadsdk.utils.le;
import com.umeng.analytics.pro.bc;

/* JADX INFO: loaded from: classes2.dex */
public class TopLayoutDislike2 extends JXs implements Lxb<TopLayoutDislike2> {
    private boolean hasCutDown;
    private boolean hasShowClose;
    private boolean isVast;
    private ZU mCloseBtn;
    private View mImgDislike;
    private ImageView mImgSound;
    private boolean mIsSoundMute;
    private CharSequence mProgressStr;
    private ImageView mSkipIV;
    private TextView mTextViewCountDown;
    private LD mTopListener;
    private boolean shouldShowSkipTime;
    private int skipTime;
    private int videoDuration;

    public TopLayoutDislike2(@NonNull Context context) {
        this(context, null);
    }

    private ImageView getCommonRingBGImageView() {
        ZU zu = new ZU(getContext());
        int iLk = le.lk(getContext(), 5.0f);
        zu.setPadding(iLk, iLk, iLk, iLk);
        zu.setScaleType(ImageView.ScaleType.CENTER);
        zu.setBackground(com.bytedance.sdk.openadsdk.core.widget.ZU.Lxb());
        return zu;
    }

    private void initListener() {
        View view = this.mImgDislike;
        if (view != null) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.lk(view2);
                    }
                }
            });
        }
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    Drawable drawableLxb;
                    TopLayoutDislike2 topLayoutDislike2 = TopLayoutDislike2.this;
                    topLayoutDislike2.mIsSoundMute = !topLayoutDislike2.mIsSoundMute;
                    if (TopLayoutDislike2.this.mSkipIV != null) {
                        drawableLxb = TopLayoutDislike2.this.mIsSoundMute ? tD.lk(TopLayoutDislike2.this.getContext(), "tt_reward_full_mute") : tD.lk(TopLayoutDislike2.this.getContext(), "tt_reward_full_unmute");
                    } else {
                        drawableLxb = TopLayoutDislike2.this.mIsSoundMute ? QAg.Lxb(TopLayoutDislike2.this.getContext(), "tt_mute_wrapper") : QAg.Lxb(TopLayoutDislike2.this.getContext(), "tt_unmute_wrapper");
                    }
                    TopLayoutDislike2.this.mImgSound.setImageDrawable(drawableLxb);
                    if (TopLayoutDislike2.this.mImgSound.getDrawable() != null) {
                        TopLayoutDislike2.this.mImgSound.getDrawable().setAutoMirrored(true);
                    }
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.LD(view2);
                    }
                }
            });
        }
        ImageView imageView2 = this.mSkipIV;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.Lxb(view2);
                    }
                }
            });
        } else {
            TextView textView = this.mTextViewCountDown;
            if (textView != null) {
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.4
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (TopLayoutDislike2.this.mTopListener != null) {
                            TopLayoutDislike2.this.mTopListener.Lxb(view2);
                        }
                    }
                });
            }
        }
        ZU zu = this.mCloseBtn;
        if (zu != null) {
            zu.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.top.TopLayoutDislike2.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    if (TopLayoutDislike2.this.mTopListener != null) {
                        TopLayoutDislike2.this.mTopListener.ZU(view2);
                    }
                }
            });
        }
    }

    private void initView() {
        int iLk = le.lk(getContext(), 16.0f);
        int iLk2 = le.lk(getContext(), 20.0f);
        int iLk3 = le.lk(getContext(), 28.0f);
        this.mImgSound = getCommonRingBGImageView();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iLk3, iLk3);
        layoutParams.leftMargin = iLk;
        layoutParams.topMargin = iLk2;
        this.mImgSound.setLayoutParams(layoutParams);
        ImageView commonRingBGImageView = getCommonRingBGImageView();
        this.mImgDislike = commonRingBGImageView;
        commonRingBGImageView.setId(520093713);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iLk3, iLk3);
        layoutParams2.topMargin = iLk2;
        layoutParams2.leftMargin = iLk;
        this.mImgDislike.setLayoutParams(layoutParams2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        view.setLayoutParams(layoutParams3);
        OY oy = new OY(getContext());
        this.mTextViewCountDown = oy;
        oy.setBackground(com.bytedance.sdk.openadsdk.core.widget.ZU.LD());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, le.lk(getContext(), 28.0f));
        layoutParams4.topMargin = le.lk(getContext(), 20.0f);
        int iLk4 = le.lk(getContext(), 16.0f);
        layoutParams2.rightMargin = iLk4;
        layoutParams4.rightMargin = iLk4;
        int iLk5 = le.lk(getContext(), 12.0f);
        le.lk(getContext(), 5.0f);
        this.mTextViewCountDown.setPadding(iLk5, 0, iLk5, 0);
        this.mTextViewCountDown.setLayoutParams(layoutParams4);
        this.mTextViewCountDown.setGravity(17);
        this.mTextViewCountDown.setTextColor(-1);
        this.mTextViewCountDown.setTextSize(14.0f);
        this.mTextViewCountDown.setVisibility(8);
        ImageView commonRingBGImageView2 = getCommonRingBGImageView();
        this.mSkipIV = commonRingBGImageView2;
        commonRingBGImageView2.setId(520093714);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(iLk3, iLk3);
        layoutParams5.topMargin = iLk2;
        layoutParams5.rightMargin = iLk;
        this.mSkipIV.setLayoutParams(layoutParams5);
        this.mSkipIV.setScaleType(ImageView.ScaleType.CENTER_CROP);
        ZU zuLD = ebl.LD(getContext());
        this.mCloseBtn = zuLD;
        zuLD.setId(520093708);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams6.gravity = 8388661;
        layoutParams6.topMargin = le.lk(getContext(), 20.0f);
        layoutParams6.rightMargin = le.lk(getContext(), 24.0f);
        this.mCloseBtn.setLayoutParams(layoutParams6);
        this.mCloseBtn.setContentDescription(tD.Lxb(getContext(), "tt_ad_close_text"));
        this.mCloseBtn.setVisibility(8);
        addView(this.mImgSound);
        addView(this.mImgDislike);
        addView(view);
        addView(this.mTextViewCountDown);
        addView(this.mSkipIV);
        addView(this.mCloseBtn);
    }

    private void updateTime(boolean z) {
        if (this.hasShowClose) {
            return;
        }
        if (this.shouldShowSkipTime) {
            this.mSkipIV.setVisibility(8);
            this.mTextViewCountDown.setVisibility(0);
        } else if (z) {
            this.mTextViewCountDown.setVisibility(0);
            this.mSkipIV.setVisibility(8);
        } else {
            this.mTextViewCountDown.setVisibility(8);
            this.mSkipIV.setVisibility(0);
        }
    }

    public void clickDislike() {
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void clickSkip() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.performClick();
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void clickSound() {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.performClick();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public View getCloseButton() {
        return this.mCloseBtn;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setListener(LD ld) {
        this.mTopListener = ld;
    }

    public void setShouldShowSkipTime(boolean z) {
        this.shouldShowSkipTime = z;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setShowDislike(boolean z) {
        View view = this.mImgDislike;
        if (view == null || this.isVast) {
            return;
        }
        view.setVisibility(z ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setShowSkip(boolean z) {
        TextView textView = this.mTextViewCountDown;
        if (textView == null) {
            return;
        }
        if (!z) {
            textView.setText("");
        }
        if (this.mSkipIV.getVisibility() == 4) {
            return;
        }
        this.hasShowClose = !z;
        this.mSkipIV.setVisibility((z && this.hasCutDown) ? 0 : 8);
        this.mTextViewCountDown.setVisibility(z & (TextUtils.isEmpty(this.mTextViewCountDown.getText()) ^ true) ? 0 : 8);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setShowSound(boolean z) {
        ImageView imageView = this.mImgSound;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setSkipEnable(boolean z) {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setEnabled(z);
            this.mSkipIV.setClickable(z);
            return;
        }
        TextView textView = this.mTextViewCountDown;
        if (textView != null) {
            textView.setEnabled(z);
            this.mTextViewCountDown.setClickable(z);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setSkipInvisiable() {
        this.mTextViewCountDown.setWidth(20);
        this.mTextViewCountDown.setVisibility(4);
        this.mSkipIV.setVisibility(4);
        this.hasShowClose = true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setSkipText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        this.mTextViewCountDown.setText(charSequence);
        if (this.mTextViewCountDown.getVisibility() != 0) {
            this.mTextViewCountDown.setVisibility(0);
        }
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void setSoundMute(boolean z) {
        Drawable drawableLxb;
        this.mIsSoundMute = z;
        if (this.mSkipIV != null) {
            drawableLxb = z ? tD.lk(getContext(), "tt_reward_full_mute") : tD.lk(getContext(), "tt_reward_full_unmute");
        } else {
            drawableLxb = z ? QAg.Lxb(getContext(), "tt_mute_wrapper") : QAg.Lxb(getContext(), "tt_unmute_wrapper");
        }
        this.mImgSound.setImageDrawable(drawableLxb);
        if (this.mImgSound.getDrawable() != null) {
            this.mImgSound.getDrawable().setAutoMirrored(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    @SuppressLint({"SetTextI18n"})
    public void setTime(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.mProgressStr = charSequence;
        }
        if (this.mSkipIV == null) {
            return;
        }
        this.hasCutDown = true;
        if (this.shouldShowSkipTime) {
            this.mTextViewCountDown.setText(((Object) this.mProgressStr) + bc.aH);
            updateTime(false);
            return;
        }
        String str = (String) this.mProgressStr;
        try {
            int i = this.skipTime;
            int i2 = i == 0 ? Integer.parseInt(str) : i - (this.videoDuration - Integer.parseInt(str));
            if (i2 <= 0) {
                this.mTextViewCountDown.setText(((Object) this.mProgressStr) + bc.aH);
                updateTime(false);
                return;
            }
            if (this.skipTime == 0) {
                updateTime(false);
                return;
            }
            this.mTextViewCountDown.setText(i2 + bc.aH);
            updateTime(true);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void showCloseButton() {
        setSkipInvisiable();
        this.mSkipIV.setVisibility(8);
        this.mCloseBtn.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void showCountDownText() {
        this.mTextViewCountDown.setVisibility(0);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.top.Lxb
    public void showSkipButton() {
        ImageView imageView = this.mSkipIV;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.mTextViewCountDown.setVisibility(8);
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopLayoutDislike2 load(@NonNull com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        initView();
        this.mImgDislike.setVisibility(0);
        ((ImageView) this.mImgDislike).setImageResource(tD.ZU(kqm.Lxb(), "tt_reward_full_feedback"));
        if (!VVE.TA().STP(String.valueOf(tDVar.Td())) || tDVar.kqm() == 5 || tDVar.kqm() == 6) {
            this.mSkipIV.setImageResource(tD.ZU(kqm.Lxb(), "tt_close_btn"));
        } else {
            this.mSkipIV.setImageResource(tD.ZU(kqm.Lxb(), "tt_skip_btn"));
        }
        if (this.mSkipIV.getDrawable() != null) {
            this.mSkipIV.getDrawable().setAutoMirrored(true);
        }
        this.mSkipIV.setVisibility(8);
        this.videoDuration = tDVar.JJ() == null ? 0 : ((int) tDVar.JJ().d) * tDVar.JJ().r;
        if (com.bytedance.sdk.openadsdk.core.model.kqm.ZU(tDVar) && tDVar.QAg() != null) {
            this.videoDuration = (int) tDVar.QAg().LD();
        } else if (com.bytedance.sdk.openadsdk.core.model.kqm.JXs(tDVar) && tDVar.QAg() != null) {
            this.videoDuration = (int) tDVar.QAg().ZU();
        }
        if (this.videoDuration <= 0) {
            this.videoDuration = 10;
        }
        if (tDVar.lJ() != 8 || tDVar.hg() == null) {
            this.skipTime = kqm.ZU().nBu(tDVar.hg().getCodeId());
        } else {
            this.skipTime = kqm.ZU().tD(tDVar.hg().getCodeId());
        }
        if (eK.lk(tDVar)) {
            this.skipTime = kqm.ZU().Lxb(String.valueOf(tDVar.Td()), tDVar.cR());
            this.videoDuration = tDVar.Rt();
        }
        int i = this.skipTime;
        this.shouldShowSkipTime = i == -1 || i >= this.videoDuration;
        if (tDVar.chu()) {
            this.mImgDislike.setVisibility(8);
            this.isVast = true;
        }
        this.mTextViewCountDown.setVisibility(4);
        this.mTextViewCountDown.setText("");
        this.mTextViewCountDown.setEnabled(false);
        this.mTextViewCountDown.setClickable(false);
        initListener();
        return this;
    }

    public TopLayoutDislike2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mProgressStr = "";
        setOrientation(0);
    }
}
