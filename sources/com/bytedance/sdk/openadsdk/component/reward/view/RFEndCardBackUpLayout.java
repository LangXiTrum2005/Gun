package com.bytedance.sdk.openadsdk.component.reward.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.component.utils.tD;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.DY;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.VVE;
import com.bytedance.sdk.openadsdk.core.widget.kqm;
import com.bytedance.sdk.openadsdk.utils.STP;
import com.bytedance.sdk.openadsdk.utils.le;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.JXs.lk {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb adContext;
    private PAGLogoView adLogo;
    private kqm ivIcon;
    private boolean mInit;
    private VVE rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.JXs.OY tvDesc;
    private com.bytedance.sdk.openadsdk.core.JXs.OY tvDownload;
    private TextView tvTitle;

    public static final class Lxb extends Drawable {
        private final Drawable LD;
        Path Lxb = new Path();
        private final int lk;

        public Lxb(Context context) {
            this.LD = tD.lk(context, "tt_ad_bg_header_gradient");
            this.lk = le.lk(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            canvas.clipPath(this.Lxb);
            canvas.drawColor(-1);
            this.LD.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i, int i2, int i3, int i4) {
            super.setBounds(i, i2, i3, i4);
            float f = i3;
            this.LD.setBounds(i, i2, i3, (int) (((1.0f * f) / this.LD.getIntrinsicWidth()) * this.LD.getIntrinsicHeight()));
            this.Lxb.reset();
            Path path = this.Lxb;
            RectF rectF = new RectF(0.0f, 0.0f, f, i4);
            int i5 = this.lk;
            path.addRoundRect(rectF, i5, i5, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
        }
    }

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(STP.wCT);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.JXs.OY oy, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (oy == null) {
            return;
        }
        String strAe = tDVar.ae();
        if (TextUtils.isEmpty(strAe)) {
            return;
        }
        oy.setText(strAe);
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.JXs.ZU zu, com.bytedance.sdk.openadsdk.core.model.tD tDVar) {
        if (zu == null || tDVar.Lpq() == null || TextUtils.isEmpty(tDVar.Lpq().Lxb())) {
            return;
        }
        com.bytedance.sdk.openadsdk.kqm.lk.Lxb().Lxb(tDVar.Lpq(), zu, tDVar);
    }

    private void bindTitleData(TextView textView, com.bytedance.sdk.openadsdk.core.model.tD tDVar, String str) {
        if (textView != null) {
            if (tDVar.MGT() == null || TextUtils.isEmpty(tDVar.MGT().LD())) {
                textView.setText(str);
            } else {
                textView.setText(tDVar.MGT().LD());
            }
        }
    }

    private void initData(com.bytedance.sdk.openadsdk.core.model.tD tDVar, com.bytedance.sdk.openadsdk.core.JXs.OY oy) {
        setDownloadButtonData(oy, tDVar, -1);
        bindIconData(this.ivIcon, tDVar);
        kqm kqmVar = this.ivIcon;
        if (kqmVar != null) {
            kqmVar.setOnClickListener(this.adContext.KPU.JXs());
        }
        VVE vve = this.rbScore;
        if (vve != null) {
            le.Lxb((TextView) null, vve, tDVar);
            if (tDVar.MGT() != null) {
                this.rbScore.setVisibility(0);
            }
            this.rbScore.setOnClickListener(this.adContext.KPU.JXs());
        }
        if (this.tvTitle != null) {
            if (tDVar.MGT() != null && !TextUtils.isEmpty(tDVar.MGT().LD())) {
                this.tvTitle.setText(tDVar.MGT().LD());
            } else if (TextUtils.isEmpty(tDVar.VU())) {
                this.tvTitle.setVisibility(8);
            } else {
                this.tvTitle.setText(tDVar.VU());
            }
            this.tvTitle.setOnClickListener(this.adContext.KPU.JXs());
        }
        if (this.tvDesc != null) {
            String strFD = tDVar.FD();
            if (TextUtils.isEmpty(strFD)) {
                this.tvDesc.setVisibility(8);
            } else {
                this.tvDesc.setText(strFD);
            }
            this.tvDesc.setOnClickListener(this.adContext.KPU.JXs());
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.Lxb(RFEndCardBackUpLayout.this.adContext.Pw, RFEndCardBackUpLayout.this.adContext.LD, RFEndCardBackUpLayout.this.adContext.JXs);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(le.lk(context, 16.0f), 0, le.lk(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(jXs, layoutParams);
        if (this.adContext.Ns == 2) {
            com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
            jXs2.setOrientation(0);
            jXs.addView(jXs2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(jXs2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(jXs);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(jXs);
        }
        View pAGLogoView = new PAGLogoView(this.adContext.Pw);
        pAGLogoView.setId(520093757);
        jXs.addView(pAGLogoView);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.Lxb(RFEndCardBackUpLayout.this.adContext.Pw, RFEndCardBackUpLayout.this.adContext.LD, RFEndCardBackUpLayout.this.adContext.JXs);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.JXs.JXs jXs) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.adContext.LD;
        if (tDVar instanceof DY) {
            List<com.bytedance.sdk.openadsdk.core.model.tD> listZU = ((DY) tDVar).foF().ZU();
            for (int i = 0; i < listZU.size() && i < 3; i++) {
                initSingleCardInThreeCardStyle(jXs, listZU.get(i), i);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.JXs.JXs jXs) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.adContext.LD;
        if (tDVar instanceof DY) {
            List<com.bytedance.sdk.openadsdk.core.model.tD> listZU = ((DY) tDVar).foF().ZU();
            for (int i = 0; i < listZU.size() && i < 2; i++) {
                initSingleCardInTwoCardStyle(jXs, listZU.get(i), i);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.JXs.JXs jXs, int i) {
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.adContext.LD;
        if (tDVar instanceof DY) {
            List<com.bytedance.sdk.openadsdk.core.model.tD> listZU = ((DY) tDVar).foF().ZU();
            for (int i2 = 0; i2 < listZU.size() && i2 < i && i2 < 3; i2++) {
                initSingleCardInTwoCardStyleLandscape(jXs, listZU.get(i2), i2, i);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.JXs.JXs jXs, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs2.setOrientation(1);
        jXs2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? le.lk(context, 12.0f) : 0, 0, 0);
        jXs2.setBackground(new Lxb(context));
        jXs.addView(jXs2, layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs3 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs3.setOrientation(0);
        jXs3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = le.lk(context, 20.0f);
        layoutParams2.leftMargin = le.lk(context, 17.0f);
        layoutParams2.rightMargin = le.lk(context, 30.0f);
        jXs2.addView(jXs3, layoutParams2);
        kqm kqmVar = new kqm(context);
        jXs3.addView(kqmVar, new FrameLayout.LayoutParams(le.lk(context, 70.0f), le.lk(context, 63.0f)));
        bindIconData(kqmVar, tDVar);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs4 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = le.lk(context, 7.0f);
        jXs3.addView(jXs4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy.setEllipsize(truncateAt);
        oy.setTextSize(18.0f);
        oy.setTextColor(Color.parseColor("#161823"));
        oy.setGravity(GravityCompat.START);
        oy.setTypeface(null, 1);
        jXs4.addView(oy, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(oy, tDVar, tDVar.VU());
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy2.setSingleLine(true);
        oy2.setEllipsize(truncateAt);
        oy2.setTextSize(16.0f);
        oy2.setTextColor(Color.parseColor("#80161823"));
        jXs4.addView(oy2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(oy2, tDVar);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs5 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs5.setOrientation(0);
        jXs5.setGravity(16);
        jXs4.addView(jXs5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy3.setTextSize(16.0f);
        oy3.setTextColor(Color.parseColor("#80161823"));
        jXs5.addView(oy3, new ViewGroup.LayoutParams(-2, -2));
        VVE vve = new VVE(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = le.lk(context, 8.0f);
        jXs5.addView(vve, layoutParams4);
        le.Lxb(oy3, vve, tDVar, 18);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy4 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy4.setGravity(17);
        oy4.setId(520093707);
        oy4.setText(tD.Lxb(context, "tt_video_download_apk"));
        oy4.setTextColor(-1);
        oy4.setTextSize(2, 16.0f);
        oy4.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, le.lk(context, 36.0f));
        layoutParams5.setMargins(le.lk(context, 20.0f), le.lk(context, 22.0f), le.lk(context, 20.0f), le.lk(context, 20.0f));
        jXs2.addView(oy4, layoutParams5);
        setDownloadButtonData(oy4, tDVar, i);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.JXs.JXs jXs, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs2.setOrientation(1);
        jXs2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i > 0 ? le.lk(context, 12.0f) : 0, 0, 0);
        jXs2.setBackground(new Lxb(context));
        jXs.addView(jXs2, layoutParams);
        kqm kqmVar = new kqm(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(le.lk(context, 70.0f), le.lk(context, 63.0f));
        layoutParams2.setMargins(0, le.lk(context, 24.0f), 0, le.lk(context, 12.0f));
        jXs2.addView(kqmVar, layoutParams2);
        bindIconData(kqmVar, tDVar);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy.setEllipsize(truncateAt);
        oy.setTextSize(18.0f);
        oy.setTextColor(Color.parseColor("#161823"));
        oy.setGravity(17);
        oy.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(le.lk(context, 56.0f), 0, le.lk(context, 56.0f), 0);
        jXs2.addView(oy, layoutParams3);
        bindTitleData(oy, tDVar, tDVar.VU());
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy2.setSingleLine(true);
        oy2.setEllipsize(truncateAt);
        oy2.setTextSize(16.0f);
        oy2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(le.lk(context, 56.0f), le.lk(context, 4.0f), le.lk(context, 56.0f), 0);
        jXs2.addView(oy2, layoutParams4);
        bindDescData(oy2, tDVar);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs3 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs3.setOrientation(0);
        jXs3.setGravity(16);
        jXs2.addView(jXs3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy3.setTextSize(16.0f);
        oy3.setTextColor(Color.parseColor("#80161823"));
        jXs3.addView(oy3, new ViewGroup.LayoutParams(-2, -2));
        VVE vve = new VVE(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = le.lk(context, 8.0f);
        jXs3.addView(vve, layoutParams5);
        le.Lxb(oy3, vve, tDVar, 18);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy4 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy4.setGravity(17);
        oy4.setId(520093707);
        oy4.setText(tD.Lxb(context, "tt_video_download_apk"));
        oy4.setTextColor(-1);
        oy4.setTextSize(2, 16.0f);
        oy4.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, le.lk(context, 36.0f));
        layoutParams6.setMargins(le.lk(context, 20.0f), le.lk(context, 36.0f), le.lk(context, 20.0f), le.lk(context, 20.0f));
        jXs2.addView(oy4, layoutParams6);
        setDownloadButtonData(oy4, tDVar, i);
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.JXs.JXs jXs, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i, int i2) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs2 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs2.setOrientation(1);
        jXs2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i > 0) {
            layoutParams.setMargins(le.lk(context, 12.0f), 0, 0, 0);
        }
        jXs2.setBackground(new Lxb(context));
        jXs.addView(jXs2, layoutParams);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs3 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs3.setOrientation(0);
        jXs3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = le.lk(context, 20.0f);
        layoutParams2.leftMargin = le.lk(context, 17.0f);
        layoutParams2.rightMargin = le.lk(context, 30.0f);
        jXs2.addView(jXs3, layoutParams2);
        kqm kqmVar = new kqm(context);
        jXs3.addView(kqmVar, new FrameLayout.LayoutParams(le.lk(context, 44.0f), le.lk(context, 44.0f)));
        bindIconData(kqmVar, tDVar);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs4 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = le.lk(context, 7.0f);
        jXs3.addView(jXs4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy.setEllipsize(truncateAt);
        oy.setTextSize(18.0f);
        oy.setTextColor(Color.parseColor("#161823"));
        oy.setGravity(GravityCompat.START);
        oy.setTypeface(null, 1);
        jXs4.addView(oy, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(oy, tDVar, tDVar.VU());
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs5 = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs5.setOrientation(0);
        jXs5.setGravity(16);
        jXs4.addView(jXs5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy2.setTextSize(16.0f);
        oy2.setTextColor(Color.parseColor("#80161823"));
        jXs5.addView(oy2, new ViewGroup.LayoutParams(-2, -2));
        VVE vve = new VVE(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = le.lk(context, 8.0f);
        jXs5.addView(vve, layoutParams4);
        le.Lxb(oy2, vve, tDVar, 18);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        if (i2 == 2) {
            oy3.setSingleLine(true);
        } else {
            oy3.setLines(2);
        }
        oy3.setEllipsize(truncateAt);
        oy3.setTextSize(16.0f);
        oy3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i3 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i3;
        layoutParams5.leftMargin = i3;
        layoutParams5.topMargin = le.lk(context, 12.0f);
        jXs2.addView(oy3, layoutParams5);
        bindDescData(oy3, tDVar);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy4 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        oy4.setGravity(17);
        oy4.setId(520093707);
        oy4.setText(tD.Lxb(context, "tt_video_download_apk"));
        oy4.setTextColor(-1);
        oy4.setTextSize(2, 16.0f);
        oy4.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, le.lk(context, 36.0f));
        layoutParams6.setMargins(le.lk(context, 20.0f), le.lk(context, 22.0f), le.lk(context, 20.0f), le.lk(context, 20.0f));
        jXs2.addView(oy4, layoutParams6);
        setDownloadButtonData(oy4, tDVar, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void initViews() {
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        if (this.adContext.LD.LYC() && this.shownAdCount > 1) {
            initOneSlotMultipleAdsLayout();
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.tD tDVar = this.adContext.LD;
        if (tDVar.chu()) {
            initViewsForVast();
        } else {
            initViewsDefault();
            initData(tDVar, this.tvDownload);
        }
    }

    private void initViewsDefault() {
        Context context = getContext();
        boolean z = this.adContext.LD.wCT() == 1;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.JXs.JXs jXs = new com.bytedance.sdk.openadsdk.core.JXs.JXs(context);
        jXs.setGravity(1);
        jXs.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(le.lk(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iLk = le.lk(context, 24.0f);
        layoutParams.rightMargin = iLk;
        layoutParams.leftMargin = iLk;
        addView(jXs, layoutParams);
        kqm kqmVar = new kqm(context);
        this.ivIcon = kqmVar;
        kqmVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(le.lk(context, 80.0f), le.lk(context, 80.0f));
        layoutParams2.bottomMargin = le.lk(context, 12.0f);
        jXs.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.tvTitle = oy;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        oy.setEllipsize(truncateAt);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(le.lk(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        jXs.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.JXs.OY oy2 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.tvDesc = oy2;
        oy2.setEllipsize(truncateAt);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = le.lk(context, 8.0f);
        jXs.addView(this.tvDesc, layoutParams3);
        this.rbScore = new VVE(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, le.lk(context, 16.0f));
        layoutParams4.topMargin = le.lk(context, 12.0f);
        this.rbScore.setVisibility(8);
        jXs.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.JXs.OY oy3 = new com.bytedance.sdk.openadsdk.core.JXs.OY(context);
        this.tvDownload = oy3;
        oy3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(tD.Lxb(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.QAg.Lxb(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, le.lk(context, 44.0f));
        layoutParams5.topMargin = le.lk(context, 54.0f);
        jXs.addView(this.tvDownload, layoutParams5);
        this.adLogo = new PAGLogoView(context);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, le.lk(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = le.lk(context, 18.0f);
        if (z) {
            layoutParams6.bottomMargin = le.lk(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = le.lk(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.JXs.ZU zu = new com.bytedance.sdk.openadsdk.core.JXs.ZU(context);
        zu.setId(STP.OY);
        zu.setVisibility(8);
        addView(zu, new FrameLayout.LayoutParams(-1, -1));
        View zu2 = new com.bytedance.sdk.component.QAg.ZU(context, true);
        zu2.setVisibility(8);
        zu2.setId(STP.QAg);
        addView(zu2, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.JXs.OY oy, com.bytedance.sdk.openadsdk.core.model.tD tDVar, int i) {
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb = this.adContext;
        com.bytedance.sdk.openadsdk.core.LD.JXs jXsLxb = lxb.KPU.Lxb(lxb, tDVar);
        com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb2 = this.adContext;
        jXsLxb.Lxb(com.bytedance.sdk.openadsdk.brP.Lxb.Lxb.ebl.Lxb(lxb2.Pw, tDVar, lxb2.JXs));
        if (i != -1) {
            HashMap map = new HashMap();
            map.put("ad_show_order", Integer.valueOf(i + 1));
            jXsLxb.Lxb(map);
        }
        oy.setOnClickListener(jXsLxb);
        oy.setOnTouchListener(jXsLxb);
        CharSequence charSequenceXr = tDVar.xr();
        if (TextUtils.isEmpty(charSequenceXr)) {
            return;
        }
        oy.setText(charSequenceXr);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.Lxb.Lxb lxb) {
        this.adContext = lxb;
        if (lxb.LD.chu()) {
            initViews();
        }
    }

    public void setShownAdCount(int i) {
        this.shownAdCount = i;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            initViews();
        }
    }
}
