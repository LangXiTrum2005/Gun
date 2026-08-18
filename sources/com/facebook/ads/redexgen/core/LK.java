package com.facebook.ads.redexgen.core;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class LK extends AbstractC1574fo implements CJ {
    public static byte[] A0L;
    public static String[] A0M = {"XgHadHW09EVAxZ9Csjyh8Iwd", "cGY", "0gnHO0byxZtUV0t5q6", "nitlVKI6s75UlUdu4qHy2TBluRJ6Vnqb", "dqu", "CAnKNEP5j3LNWAO1IgUwk41cBq", "Gj8h5dX0pUMTu0Q6FRM85YsFx7LjGw4a", "ydUjPQqek3X4wwrCfoz9Rz5n"};
    public static final int A0N;
    public static final int A0O;
    public static final int A0P;
    public RelativeLayout A00;
    public E0 A01;
    public GV A02;
    public C1420dI A03;
    public C0760He A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final Paint A08;
    public final Path A09;
    public final RectF A0A;
    public final C1828k1 A0B;
    public final CL A0C;
    public final DR A0D;
    public final C0727Fx A0E;
    public final AbstractC1343c3 A0F;
    public final AbstractC1337bx A0G;
    public final AbstractC1335bv A0H;
    public final AbstractC1333bt A0I;
    public final AbstractC1324bk A0J;
    public final String A0K;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0M;
            if (strArr[0].length() != strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0M;
            strArr2[1] = "5LW";
            strArr2[4] = "hlZ";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 11);
            i4++;
        }
    }

    public static void A03() {
        A0L = new byte[]{68, 70, 85, 72, 82, 84, 66, 75, 120, 68, 70, 85, 67};
    }

    public abstract void A1H(C1828k1 c1828k1);

    static {
        A03();
        A0O = (int) (CP.A02 * 1.0f);
        A0P = (int) (CP.A02 * 4.0f);
        A0N = (int) (CP.A02 * 6.0f);
    }

    public LK(C0727Fx c0727Fx, boolean z, String str, C1420dI c1420dI) {
        super(c0727Fx, z);
        this.A09 = new Path();
        this.A0A = new RectF();
        this.A0J = new LP(this);
        this.A0F = new LO(this);
        this.A0H = new LN(this);
        this.A0G = new LM(this);
        this.A0I = new LL(this);
        this.A0D = c0727Fx.A0C();
        this.A0E = c0727Fx;
        this.A03 = c1420dI;
        this.A0K = str;
        this.A0B = c0727Fx.A05();
        this.A0C = CL.A01(c0727Fx.A05(), c0727Fx.A04(), this);
        setGravity(17);
        setPadding(A0O, 0, A0O, A0O);
        D3.A0K(this, 0);
        setUpView(this.A0B);
        this.A08 = new Paint();
        this.A08.setColor(ViewCompat.MEASURED_STATE_MASK);
        this.A08.setStyle(Paint.Style.FILL);
        this.A08.setAlpha(16);
        this.A08.setAntiAlias(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        if (this.A02 == null) {
            return;
        }
        if ((A1F() && this.A07) || (!A1F() && this.A06)) {
            this.A02.ACH();
        }
    }

    private void A04(View view) {
        view.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        D3.A0I(view);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public boolean A0A() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final void A0z() {
        super.A0z();
        this.A0C.A0B();
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC0723Ft
    public final boolean A17() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1574fo
    public final void A1B() {
        if (A1F()) {
            this.A04.A01();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1574fo
    public final void A1C() {
        if (A1F()) {
            A1D();
            C0760He c0760He = this.A04;
            IP ip = IP.A02;
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "GrzUS";
            c0760He.A05(ip);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1574fo
    public final void A1D() {
        float volume = this.A03.A0P().getVolume();
        if (A1F()) {
            float newVolume = this.A04.getVolume();
            if (volume != newVolume) {
                C0760He c0760He = this.A04;
                if (A0M[5].length() == 9) {
                    throw new RuntimeException();
                }
                String[] strArr = A0M;
                strArr[1] = "cdp";
                strArr[4] = "iOc";
                c0760He.setVolume(volume);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1574fo
    public final boolean A1E() {
        if (A1F()) {
            boolean zA06 = this.A04.A06();
            if (A0M[2].length() == 4) {
                throw new RuntimeException();
            }
            A0M[2] = "SbvNib3Q04NWLkmSI4CaBbpy";
            if (zA06) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1574fo
    public final boolean A1F() {
        return this.A05;
    }

    public final /* synthetic */ void A1G(View view) {
        getCtaButton().A0A(A01(0, 13, 44));
    }

    public final void A1I(Map<String, String> extraParams) {
        this.A04.A02();
        if (A1F()) {
            this.A04.A04(getAdEventManager(), this.A0K, extraParams);
        }
    }

    @Override // com.facebook.ads.redexgen.core.CJ
    public final void ADz() {
        this.A0D.A4Z(this.A0E.A04().A0e());
    }

    public final RelativeLayout getMediaContainer() {
        return this.A00;
    }

    public final C0760He getVideoView() {
        return this.A04;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        this.A09.reset();
        this.A0A.set(0.0f, 0.0f, getWidth(), getHeight());
        this.A09.addRoundRect(this.A0A, A0N, A0N, Path.Direction.CW);
        canvas.drawPath(this.A09, this.A08);
        this.A0A.set(A0O, 0.0f, getWidth() - A0O, getHeight() - A0O);
        this.A09.addRoundRect(this.A0A, A0P, A0P, Path.Direction.CW);
        canvas.clipPath(this.A09);
        super.onDraw(canvas);
    }

    public void setAdTitleAndDescription(String str, String str2) {
        getTitleDescContainer().A04(str, str2, null, true, false);
    }

    public void setCTAInfo(C03922d c03922d, Map<String, String> extraData) {
        getCtaButton().setCta(c03922d, this.A0K, extraData);
    }

    public void setImageUrl(String str) {
        this.A01.setVisibility(0);
        this.A04.setVisibility(8);
        new AsyncTaskC1623gc(this.A01, this.A0B).A04().A06(new C1573fn(this, null)).A07(str);
    }

    public void setIsVideo(boolean z) {
        this.A05 = z;
    }

    public void setOnAssetsLoadedListener(GV gv) {
        this.A02 = gv;
    }

    public void setUpImageView(C1828k1 c1828k1) {
        this.A01 = new E0(c1828k1);
        if (C05789m.A1G(c1828k1)) {
            FE.A00(this.A01, C05789m.A1H(c1828k1), new ViewOnClickListenerC0731Gb(this));
        }
        A04(this.A01);
    }

    public void setUpMediaContainer(C1828k1 c1828k1) {
        this.A00 = new RelativeLayout(c1828k1);
        A04(this.A00);
        CK ckA0A = this.A0C.A0A(this.A0E.A04());
        this.A0E.A05().A0H().A00(ckA0A.A01);
        getCtaButton().setCreativeAsCtaLoggingHelper(this.A0C);
        if (this.A0E.A04().A1D() && C05789m.A2m(this.A0B)) {
            this.A00.setOnClickListener(new ViewOnClickListenerC0730Ga(this));
        } else {
            if (!ckA0A.A00) {
                return;
            }
            this.A00.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.GZ
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.A00.A1G(view);
                }
            });
        }
    }

    public void setUpVideoView(C1828k1 c1828k1) {
        this.A04 = new C0760He(c1828k1, new AF(this.A0K, getAdEventManager()));
        if (C05789m.A1I(c1828k1)) {
            FE.A00(this.A04, C05789m.A1J(c1828k1), new ViewOnClickListenerC0732Gc(this));
        }
        A04(this.A04);
    }

    private void setUpView(C1828k1 c1828k1) {
        setUpImageView(c1828k1);
        setUpVideoView(c1828k1);
        setUpMediaContainer(c1828k1);
        this.A00.addView(this.A01);
        this.A00.addView(this.A04);
        A1H(c1828k1);
    }

    public void setVideoPlaceholderUrl(String str) {
        this.A04.setPlaceholderUrl(str);
    }

    public void setVideoUrl(String str) {
        this.A01.setVisibility(8);
        this.A04.setVisibility(0);
        this.A04.setVideoURI(str);
        this.A04.A03(this.A0J);
        this.A04.A03(this.A0F);
        this.A04.A03(this.A0H);
        this.A04.A03(this.A0G);
        this.A04.A03(this.A0I);
    }
}
