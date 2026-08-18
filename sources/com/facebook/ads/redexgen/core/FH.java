package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class FH extends LinearLayout {
    public static byte[] A0A;
    public static final LinearLayout.LayoutParams A0B;
    public LinearLayout A00;
    public TextView A01;
    public String A02;
    public boolean A03;
    public final int A04;
    public final View.OnClickListener A05;
    public final RelativeLayout A06;
    public final C1828k1 A07;
    public final ViewOnClickListenerC1617gW A08;
    public final C0709Ff A09;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 11);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{-96, -93, -93, -92, -77, -96, -88, -85, -78};
    }

    public abstract void A0D(int i);

    static {
        A01();
        A0B = new LinearLayout.LayoutParams(-2, -2);
    }

    public FH(C1828k1 c1828k1, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, int i, C03912c c03912c, boolean z, String str, A7 a7, DR dr, JL jl, C0647Cv c0647Cv, C03962h c03962h, boolean z2, String str2) {
        super(c1828k1);
        this.A02 = A00(0, 0, 37);
        D3.A0I(this);
        this.A07 = c1828k1;
        this.A04 = i;
        this.A03 = z2;
        this.A02 = str2;
        this.A09 = new C0709Ff(c1828k1);
        D3.A0K(this.A09, 0);
        D3.A0I(this.A09);
        if (z2) {
            this.A00 = new LinearLayout(c1828k1);
            this.A01 = new TextView(c1828k1);
            D3.A0I(this.A01);
        }
        if (viewOnClickListenerC1617gW == null) {
            this.A08 = new ViewOnClickListenerC1617gW(c1828k1, str, c03912c, z, a7, dr, jl, c0647Cv, c03962h);
        } else {
            this.A08 = viewOnClickListenerC1617gW;
        }
        D3.A0E(1001, this.A08);
        this.A05 = AbstractC0720Fq.A03(this.A08, A00(0, 9, 52));
        this.A06 = new RelativeLayout(c1828k1);
        this.A06.setLayoutParams(A0B);
        D3.A0I(this.A06);
    }

    public void A0N() {
        this.A09.setOnClickListener(this.A05);
    }

    public final ViewOnClickListenerC1617gW getCTAButton() {
        return this.A08;
    }

    public View getExpandableLayout() {
        return null;
    }

    public final ImageView getIconView() {
        return this.A09;
    }

    public void setInfo(C03892a c03892a, C03922d c03922d, String str, String str2, CZ cz, FP fp) {
        this.A08.setCta(c03922d, str, new HashMap(), cz, fp);
        new AsyncTaskC1623gc(this.A09, this.A07).A05(this.A04, this.A04).A07(str2);
    }

    public void setTitleMaxLines(int i) {
    }
}
