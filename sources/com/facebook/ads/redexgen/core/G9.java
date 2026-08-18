package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class G9 {
    public static byte[] A0H;
    public static String[] A0I = {"pFRbUbIPvfwTsTWtR68DyqtfsQzo0Y9e", "Jmt0yS7cxIqywVTLVazlNOZqViG4fijG", "7JVXgwFSulrh0z9RNSntkrow2", "W96LwBzZpPkBapcy7gGTKWs8B4GUDBcq", "br88nFbBZbLJ3vTh4p9wwCNTIA57FmIY", "mzQptMR0Z3d1fPQPbwNf4EthVYWzR3DW", "IPE7BiI9pZn923UUuncSvZhUL3wMHGrT", "br6hrssh6VRKiVV1vNUkmhf3WWjX02F0"};
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final int A0B;
    public final C2P A0C;
    public final C03892a A0D;
    public final C03932e A0E;
    public final C1828k1 A0F;
    public final DR A0G;
    public int A03 = 16;
    public int A02 = 12;
    public int A01 = 10;
    public int A04 = 20;
    public int A05 = 40;
    public int A06 = 52;
    public int A00 = 10;
    public int A07 = 8;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0H, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            int i5 = bArrCopyOfRange[i4] ^ i3;
            if (A0I[2].length() != 25) {
                throw new RuntimeException();
            }
            String[] strArr = A0I;
            strArr[3] = "XwNXbwlUcFi7qEktIehGuIyqazGrk614";
            strArr[1] = "hx9Csixc74t4pIrSAOrr1o5nquGlqFF4";
            bArrCopyOfRange[i4] = (byte) (i5 ^ 30);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0H = new byte[]{109, 118, 126, 126, 126, 126, 126, 126, 126, 4, 97, 97, 23, 23, 23, 23, 23, 23, 37, 41, 43, 104, 32, 39, 37, 35, 36, 41, 41, 45, 104, 39, 34, 53, 104, 47, 40, 50, 35, 52, 53, 50, 47, 50, 47, 39, 42, 104, 32, 47, 40, 47, 53, 46, 25, 39, 37, 50, 47, 48, 47, 50, 63, 42, 50, 48, 41};
    }

    static {
        A03();
    }

    public G9(C1828k1 c1828k1, AbstractC1984md abstractC1984md, DR dr) {
        this.A0F = c1828k1;
        this.A0G = dr;
        this.A0D = abstractC1984md.A1b().A0G();
        this.A0E = abstractC1984md.A1b().A0I();
        this.A0C = abstractC1984md.A1a();
        this.A0A = abstractC1984md.A1p();
        this.A09 = abstractC1984md.A1o();
        this.A0B = I1.A00(c1828k1.getResources().getDisplayMetrics());
        A02();
    }

    private ImageView A00(final ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        Bitmap scaledBitmap = Bitmap.createScaledBitmap(DC.A01(DB.OTHER_SKIP), this.A04, this.A04, true);
        ImageView imageView = new ImageView(this.A0F);
        imageView.setImageBitmap(scaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A01(0, 9, 80)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A01, this.A01, this.A01, this.A01);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.G6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                viewOnClickListenerC1617gW.A0A(G9.A01(63, 4, 71));
            }
        });
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setLayoutParams(layoutParams);
        imageView.setVisibility(0);
        return imageView;
    }

    private void A02() {
        this.A03 *= this.A0B;
        this.A02 *= this.A0B;
        this.A01 *= this.A0B;
        this.A04 *= this.A0B;
        this.A05 *= this.A0B;
        this.A06 *= this.A0B;
        this.A00 *= this.A0B;
        this.A07 *= this.A0B;
    }

    private void A04(FrameLayout frameLayout) {
        View view = new View(this.A0F);
        view.setBackgroundColor(Color.parseColor(A01(9, 9, 57)));
        view.setAlpha(0.8f);
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00c5  */
    private void A05(FrameLayout frameLayout, ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        View viewA00;
        FrameLayout frameLayout2 = new FrameLayout(this.A0F);
        frameLayout2.setPadding(0, this.A06, this.A02, this.A02);
        if (this.A0A) {
            frameLayout2.setOnClickListener(new G8(this, viewOnClickListenerC1617gW));
        }
        Bitmap bitmap = DC.A01(DB.NAV_CROSS);
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, this.A04, this.A04, true);
        ImageView imageView = new ImageView(this.A0F);
        imageView.setImageBitmap(bitmapCreateScaledBitmap);
        imageView.setColorFilter(-1);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.parseColor(A01(0, 9, 80)));
        imageView.setBackground(gradientDrawable);
        imageView.setPadding(this.A01, this.A01, this.A01, this.A01);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388661);
        layoutParams.setMargins(0, 0, 0, 0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.ads.redexgen.X.G5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.A00.A0A(view);
            }
        });
        long jA00 = this.A0E.A00();
        if (this.A08) {
            C03932e c03932e = this.A0E;
            if (A0I[2].length() != 25) {
                throw new RuntimeException();
            }
            A0I[2] = "EDg5a4vgNKTBN5Vd4K7j2JAWQ";
            jA00 = c03932e.A01();
        }
        String[] strArr = A0I;
        if (strArr[3].charAt(26) != strArr[1].charAt(26)) {
            String[] strArr2 = A0I;
            strArr2[4] = "b3oecF17Vr0ETjxWpa6eT7xUY7TKGzpN";
            strArr2[7] = "bDd6Okr1h1scp4h6gPnTJrQws996nCht";
            if (jA00 > 0) {
                viewA00 = null;
                if (this.A09 && viewOnClickListenerC1617gW != null) {
                    viewA00 = A00(viewOnClickListenerC1617gW);
                    frameLayout2.addView(viewA00);
                }
                I1.A01(this.A0F, imageView, jA00, viewA00);
            }
        } else {
            String[] strArr3 = A0I;
            strArr3[0] = "wMkw7uDsuhpEAhy55DDXkTN35R2eGLVW";
            strArr3[6] = "HDeBQ28ZWrMMDEXcUdCCcU9zvuA6m47B";
            if (jA00 > 0) {
                viewA00 = null;
                if (this.A09) {
                    viewA00 = A00(viewOnClickListenerC1617gW);
                    frameLayout2.addView(viewA00);
                }
                I1.A01(this.A0F, imageView, jA00, viewA00);
            }
        }
        frameLayout2.addView(imageView, layoutParams);
        frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -2, 48));
    }

    private void A06(ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        viewOnClickListenerC1617gW.setCornerRadiusPx(this.A00);
        viewOnClickListenerC1617gW.setPadding(this.A04, this.A03, this.A04, this.A03);
        viewOnClickListenerC1617gW.setTextSize(14.0f);
        viewOnClickListenerC1617gW.setRoundedCornersEnabled(true);
        viewOnClickListenerC1617gW.A09();
        viewOnClickListenerC1617gW.setIncludeFontPadding(true);
        viewOnClickListenerC1617gW.setLayoutParams(layoutParams);
        viewOnClickListenerC1617gW.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        viewOnClickListenerC1617gW.setId(View.generateViewId());
        if (viewOnClickListenerC1617gW.getParent() != null) {
            ((ViewGroup) viewOnClickListenerC1617gW.getParent()).removeView(viewOnClickListenerC1617gW);
        }
    }

    public final View A08(ViewOnClickListenerC1617gW viewOnClickListenerC1617gW) {
        return A09(viewOnClickListenerC1617gW, null);
    }

    public final View A09(ViewOnClickListenerC1617gW viewOnClickListenerC1617gW, ImageView imageView) {
        this.A08 = imageView != null;
        FrameLayout frameLayout = new FrameLayout(this.A0F);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        C0715Fl c0715Fl = new C0715Fl(this.A0F, this.A0C.A01(), true, false, false);
        c0715Fl.A04(this.A0D.A0F(), this.A0D.A0D().toLowerCase(Locale.getDefault()), null, false, false);
        c0715Fl.setAlignment(17);
        c0715Fl.setTitleTextSize(28);
        c0715Fl.setDescriptionTextSize(13);
        c0715Fl.A02();
        c0715Fl.setPadding(this.A05, 0, this.A05, 0);
        LinearLayout linearLayout = new LinearLayout(this.A0F);
        linearLayout.setClickable(true);
        if (C05789m.A1B(this.A0F)) {
            linearLayout.setOnClickListener(new G7(this, viewOnClickListenerC1617gW));
        }
        linearLayout.setPadding(0, -this.A04, 0, 0);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        if (imageView != null) {
            if (imageView.getParent() != null) {
                ((ViewGroup) imageView.getParent()).removeView(imageView);
            }
            linearLayout.addView(imageView);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(0, this.A07, 0, this.A07);
        linearLayout.addView(c0715Fl, layoutParams);
        if (viewOnClickListenerC1617gW != null) {
            A06(viewOnClickListenerC1617gW);
            linearLayout.addView(viewOnClickListenerC1617gW, layoutParams);
            if (TextUtils.isEmpty(viewOnClickListenerC1617gW.getText())) {
                D3.A0F(viewOnClickListenerC1617gW);
            }
        }
        linearLayout.setAlpha(1.0f);
        A04(frameLayout);
        frameLayout.addView(linearLayout);
        A05(frameLayout, viewOnClickListenerC1617gW);
        return frameLayout;
    }

    public final /* synthetic */ void A0A(View view) {
        this.A0G.A4Z(A01(18, 45, 88));
    }
}
