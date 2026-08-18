package com.bytedance.sdk.openadsdk.adapter;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.os.Build;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.JXs.ZU;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class NiceImageView extends ZU {
    private RectF DY;
    private final Paint HD;
    private int IeN;
    private int JVA;
    private int JXs;
    private boolean LD;
    private final Context Lxb;
    private int NXR;
    private int OY;
    private int QAg;
    private final Xfermode STP;
    private final RectF Sfi;
    private int VVE;
    private int ZU;
    private Path aH;
    private final float[] brP;
    private final Path eK;
    private int ebl;
    private float kqm;
    private int lc;
    private boolean lk;
    private int nBu;
    private int sLN;
    private final float[] tD;

    public NiceImageView(Context context) {
        this(context, null);
    }

    private void LD() {
        if (!this.LD) {
            this.DY.set(0.0f, 0.0f, this.IeN, this.VVE);
            if (this.lk) {
                this.DY = this.Sfi;
                return;
            }
            return;
        }
        float fMin = Math.min(this.IeN, this.VVE) / 2.0f;
        this.kqm = fMin;
        RectF rectF = this.DY;
        int i = this.IeN;
        int i2 = this.VVE;
        rectF.set((i / 2.0f) - fMin, (i2 / 2.0f) - fMin, (i / 2.0f) + fMin, (i2 / 2.0f) + fMin);
    }

    private void Lxb(Canvas canvas) {
        if (!this.LD) {
            int i = this.ZU;
            if (i > 0) {
                Lxb(canvas, i, this.JXs, this.Sfi, this.brP);
                return;
            }
            return;
        }
        int i2 = this.ZU;
        if (i2 > 0) {
            Lxb(canvas, i2, this.JXs, this.kqm - (i2 / 2.0f));
        }
        int i3 = this.lc;
        if (i3 > 0) {
            Lxb(canvas, i3, this.ebl, (this.kqm - this.ZU) - (i3 / 2.0f));
        }
    }

    private void ZU() {
        if (this.LD) {
            return;
        }
        this.lc = 0;
    }

    private void lk() {
        if (this.LD) {
            return;
        }
        int i = 0;
        if (this.OY <= 0) {
            float[] fArr = this.brP;
            int i2 = this.QAg;
            float f = i2;
            fArr[1] = f;
            fArr[0] = f;
            int i3 = this.nBu;
            float f2 = i3;
            fArr[3] = f2;
            fArr[2] = f2;
            int i4 = this.sLN;
            float f3 = i4;
            fArr[5] = f3;
            fArr[4] = f3;
            int i5 = this.JVA;
            float f4 = i5;
            fArr[7] = f4;
            fArr[6] = f4;
            float[] fArr2 = this.tD;
            int i6 = this.ZU;
            float f5 = i2 - (i6 / 2.0f);
            fArr2[1] = f5;
            fArr2[0] = f5;
            float f6 = i3 - (i6 / 2.0f);
            fArr2[3] = f6;
            fArr2[2] = f6;
            float f7 = i4 - (i6 / 2.0f);
            fArr2[5] = f7;
            fArr2[4] = f7;
            float f8 = i5 - (i6 / 2.0f);
            fArr2[7] = f8;
            fArr2[6] = f8;
            return;
        }
        while (true) {
            float[] fArr3 = this.brP;
            if (i >= fArr3.length) {
                return;
            }
            int i7 = this.OY;
            fArr3[i] = i7;
            this.tD[i] = i7 - (this.ZU / 2.0f);
            i++;
        }
    }

    public void isCircle(boolean z) {
        this.LD = z;
        ZU();
        LD();
        invalidate();
    }

    public void isCoverSrc(boolean z) {
        this.lk = z;
        LD();
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        canvas.saveLayer(this.DY, null, 31);
        if (!this.lk) {
            int i = this.IeN;
            int i2 = this.ZU;
            int i3 = this.lc;
            int i4 = this.VVE;
            canvas.scale((((i - (i2 * 2)) - (i3 * 2)) * 1.0f) / i, (((i4 - (i2 * 2)) - (i3 * 2)) * 1.0f) / i4, i / 2.0f, i4 / 2.0f);
        }
        super.onDraw(canvas);
        this.HD.reset();
        this.eK.reset();
        if (this.LD) {
            this.eK.addCircle(this.IeN / 2.0f, this.VVE / 2.0f, this.kqm, Path.Direction.CCW);
        } else {
            this.eK.addRoundRect(this.DY, this.tD, Path.Direction.CCW);
        }
        this.HD.setAntiAlias(true);
        this.HD.setStyle(Paint.Style.FILL);
        this.HD.setXfermode(this.STP);
        if (Build.VERSION.SDK_INT <= 27) {
            canvas.drawPath(this.eK, this.HD);
        } else {
            this.aH.addRect(this.DY, Path.Direction.CCW);
            this.aH.op(this.eK, Path.Op.DIFFERENCE);
            canvas.drawPath(this.aH, this.HD);
        }
        this.HD.setXfermode(null);
        int i5 = this.NXR;
        if (i5 != 0) {
            this.HD.setColor(i5);
            canvas.drawPath(this.eK, this.HD);
        }
        canvas.restore();
        Lxb(canvas);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.IeN = i;
        this.VVE = i2;
        Lxb();
        LD();
    }

    public void setBorderColor(@ColorInt int i) {
        this.JXs = i;
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.ZU = le.lk(this.Lxb, i);
        Lxb(false);
    }

    public void setCornerBottomLeftRadius(int i) {
        this.JVA = le.lk(this.Lxb, i);
        Lxb(true);
    }

    public void setCornerBottomRightRadius(int i) {
        this.sLN = le.lk(this.Lxb, i);
        Lxb(true);
    }

    public void setCornerRadius(int i) {
        this.OY = le.lk(this.Lxb, i);
        Lxb(false);
    }

    public void setCornerTopLeftRadius(int i) {
        this.QAg = le.lk(this.Lxb, i);
        Lxb(true);
    }

    public void setCornerTopRightRadius(int i) {
        this.nBu = le.lk(this.Lxb, i);
        Lxb(true);
    }

    public void setInnerBorderColor(@ColorInt int i) {
        this.ebl = i;
        invalidate();
    }

    public void setInnerBorderWidth(int i) {
        this.lc = le.lk(this.Lxb, i);
        ZU();
        invalidate();
    }

    public void setMaskColor(@ColorInt int i) {
        this.NXR = i;
        invalidate();
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NiceImageView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.JXs = -1;
        this.ebl = -1;
        this.Lxb = context;
        this.OY = le.lk(context, 10.0f);
        this.brP = new float[8];
        this.tD = new float[8];
        this.Sfi = new RectF();
        this.DY = new RectF();
        this.HD = new Paint();
        this.eK = new Path();
        if (Build.VERSION.SDK_INT <= 27) {
            this.STP = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        } else {
            this.STP = new PorterDuffXfermode(PorterDuff.Mode.DST_OUT);
            this.aH = new Path();
        }
        lk();
        ZU();
    }

    private void Lxb(Canvas canvas, int i, int i2, float f) {
        Lxb(i, i2);
        this.eK.addCircle(this.IeN / 2.0f, this.VVE / 2.0f, f, Path.Direction.CCW);
        canvas.drawPath(this.eK, this.HD);
    }

    private void Lxb(Canvas canvas, int i, int i2, RectF rectF, float[] fArr) {
        Lxb(i, i2);
        this.eK.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(this.eK, this.HD);
    }

    private void Lxb(int i, int i2) {
        this.eK.reset();
        this.HD.setStrokeWidth(i);
        this.HD.setColor(i2);
        this.HD.setStyle(Paint.Style.STROKE);
    }

    private void Lxb() {
        if (this.LD) {
            return;
        }
        RectF rectF = this.Sfi;
        int i = this.ZU;
        rectF.set(i / 2.0f, i / 2.0f, this.IeN - (i / 2.0f), this.VVE - (i / 2.0f));
    }

    private void Lxb(boolean z) {
        if (z) {
            this.OY = 0;
        }
        lk();
        Lxb();
        invalidate();
    }
}
