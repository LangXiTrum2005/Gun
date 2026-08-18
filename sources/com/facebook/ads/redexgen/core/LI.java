package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.badlogic.gdx.Input;
import com.facebook.ads.internal.util.activity.AdActivityIntent;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LI extends FrameLayout implements InterfaceC1540fG {
    public static byte[] A0A;
    public static String[] A0B = {"cNW8ZlUzhquZSz6XSi", "gKIjGDOIeaOzZR9qeyStr8duZ", "mQKfIuNnQZgt5ES8sx19fjwTYxycx0Lp", "WvoZHe7VElSdYX15O8PPMcOC5YskUK4l", "BfRVnLJiFu3hDnD", "WxgvJAZOXh", "crPtNK55mSnLeOXFeJGYeBq3ABMrpYK", "K6RBlZSEjGoukPcRXJY4znE0whNpCjIj"};
    public JL A00;
    public final int A01;
    public final AbstractC1984md A02;
    public final C1828k1 A03;
    public final A7 A04;
    public final C0647Cv A05;
    public final InterfaceC0736Gg A06;
    public final C0747Gr A07;
    public final String A08;
    public final boolean A09;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0A = new byte[]{100, 70, 73, 0, 83, 7, 84, 83, 70, 85, 83, 7, 102, 82, 67, 78, 66, 73, 68, 66, 105, 66, 83, 80, 72, 85, 76, 102, 68, 83, 78, 81, 78, 83, 94, 9, 7, 106, 70, 76, 66, 7, 84, 82, 85, 66, 7, 83, 79, 70, 83, 7, 78, 83, 0, 84, 7, 78, 73, 7, 94, 72, 82, 85, 7, 102, 73, 67, 85, 72, 78, 67, 106, 70, 73, 78, 65, 66, 84, 83, 9, 95, 74, 75, 7, 65, 78, 75, 66, 9, 24, 28, 31, 43, 58, 55, 59, 48, 61, 59, cw.n, 59, 42, 41, 49, 44, 53, 69, 74, 123, 69, 71, 80, 77, 82, 77, 80, 93, 4, 11, cw.l, 4, 12, 56, 20, 8, 18, 21, 4, 2, 90, 85, 64, 93, 66, 81, 117, 80, 112, 85, 64, 85, 118, 65, 90, 80, 88, 81, 27, 29, 11, 28, cw.k, 2, 7, cw.k, 5, 22, 9, 5, 23, 52, 25, cw.n, 5};
    }

    static {
        A02();
    }

    public LI(C1828k1 c1828k1, A7 a7, InterfaceC0736Gg interfaceC0736Gg, AbstractC1984md abstractC1984md, String str, int i, C0647Cv c0647Cv) {
        super(c1828k1);
        this.A03 = c1828k1;
        this.A04 = a7;
        this.A02 = abstractC1984md;
        this.A08 = str;
        this.A06 = interfaceC0736Gg;
        this.A01 = i;
        C0747Gr preloadedDynamicWebViewController = AbstractC0748Gs.A02(abstractC1984md.A0r());
        if (preloadedDynamicWebViewController != null) {
            this.A07 = preloadedDynamicWebViewController;
            this.A09 = true;
        } else {
            this.A07 = new C0747Gr(this.A03, abstractC1984md, a7, i);
            AbstractC0748Gs.A03(abstractC1984md, this.A07);
            this.A09 = false;
        }
        if (c0647Cv != null) {
            this.A05 = c0647Cv;
            this.A07.A0Z(c0647Cv);
        } else {
            this.A05 = this.A07.A0L();
        }
        this.A07.A0c(new C1547fN(this));
        this.A07.A0a(interfaceC0736Gg);
        CU.A04(this, CU.A0B);
        if (C05789m.A1s(c1828k1)) {
            c1828k1.A0B().AJu(this.A07.A0O(), abstractC1984md.A1g(), false, false, true);
        }
        A04();
    }

    private final void A03() {
        this.A07.A0d(this);
        if (!this.A09) {
            this.A03.A0F().A5w();
            this.A07.A0X();
        } else {
            this.A03.A0F().A5x();
            if (this.A07.A0k()) {
                if (this.A01 == 4) {
                    if (this.A06 != null) {
                        this.A06.AD1(this);
                    }
                    if (C05789m.A1s(this.A03)) {
                        AJ ajA0B = this.A03.A0B();
                        if (A0B[1].length() != 25) {
                            throw new RuntimeException();
                        }
                        A0B[5] = "";
                        ajA0B.ACq();
                    }
                } else {
                    AJI();
                }
            }
        }
        A08();
    }

    private final void A04() {
        C0747Gr.A0B().incrementAndGet();
        A03();
        this.A07.A0W();
    }

    private void A05(Intent intent, AbstractC1984md abstractC1984md) {
        intent.putExtra(A01(Input.Keys.NUMPAD_ADD, 8, 110), BG.A07);
        intent.putExtra(A01(130, 18, 58), abstractC1984md);
        intent.addFlags(268435456);
    }

    private final void A06(AbstractC1984md abstractC1984md) {
        AdActivityIntent adActivityIntentA05 = C0620Bq.A05(this.A03);
        A05(adActivityIntentA05, abstractC1984md);
        try {
            C0620Bq.A0B(this.A03, adActivityIntentA05);
        } catch (Exception e) {
            this.A03.A08().AAu(A01(107, 11, 42), AbstractC05418a.A0D, new C05428b(e));
            Log.e(A01(90, 17, 80), A01(0, 90, 41), e);
        }
    }

    private void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        FQ fq = new FQ(this.A03, this.A08, this.A00, this.A05, this.A04, this.A02.A1c());
        HashMap map = new HashMap();
        map.put(A01(EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE, 12, 105), A01(Input.Keys.NUMPAD_4, 9, 96));
        fq.A08(this.A02.A1g(), str, map);
    }

    public final void A08() {
        D3.A0H(this.A07.A0O());
        addView(this.A07.A0O(), new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void A9V() {
        A07(this.A02.A1b().A0H().A05());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void A9W(String str) {
        A07(str);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void A9a() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void AAb() {
        new Handler(Looper.getMainLooper()).post(new C1546fM(this));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void ADF() {
        A06(this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void ADJ() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void AE9(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void AF8() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void AFf(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void AFh(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void AFw(String str) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void AJI() {
        if (this.A06 != null) {
            this.A06.AD1(this);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1540fG
    public final void close() {
    }

    public A7 getAdEventManager() {
        return this.A04;
    }

    public C0747Gr getDynamicWebViewController() {
        return this.A07;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setAdViewabilityChecker(JL jl) {
        this.A00 = jl;
        this.A07.A0e(jl);
    }
}
