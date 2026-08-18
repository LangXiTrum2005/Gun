package com.facebook.ads.redexgen.core;

import android.content.res.Resources;
import android.widget.LinearLayout;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N5<NativeViewabilityLogger> implements InterfaceC2016n9 {
    public static byte[] A0J;
    public static String[] A0K = {"NhwOmA8H17maQr2Thm3XPPVG1xwEsLhZ", "rranxCubAcBFDRhPr2LDrxoK3htxcyeL", "LmhV8", "ZLGOK7uKxyyp5W3sNEqoBEODv8zXcPE1", "dNK0bBZMrDk2YJmjrhSzlk1RMTFmUAsD", "q33l17MPfjO0fzYSahPh7EE95Ux5x03H", "4VfBn9Mh4W5rafl7A4va0uDeREUgOp63", "NLrbv196ww605txiYhOndsfSQjY"};
    public static final String A0L;
    public C2B A00;
    public C2C A01;
    public C1993mm A02;
    public C0901Mx A03;
    public M5 A04;
    public A7 A05;
    public EnumC0599Aj A06;
    public F4 A08;
    public C1625ge A09;
    public LI A0A;
    public JK A0B;
    public JL A0C;
    public String A0E;
    public final String A0I = UUID.randomUUID().toString();
    public boolean A0F = false;
    public boolean A0G = false;
    public boolean A0H = false;
    public C0647Cv A07 = new C0647Cv();
    public Boolean A0D = false;

    public static String A08(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0J, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 106);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A0J = new byte[]{28, 40, 38, -25, 31, 26, 28, 30, 27, 40, 40, 36, -25, 26, 29, 44, -25, 27, 26, 39, 39, 30, 43, -25, 28, 37, 34, 28, 36, 30, 29, -15, -30, -11, -15, -84, -27, -15, -22, -23, -21, -22, -36, -93, -82};
    }

    static {
        A0B();
        A0L = N5.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0A() {
        if (this.A00 != null && this.A0A != null && this.A03 != null && this.A03.A1F()) {
            this.A00.ACV(this, this.A0A);
        }
        if (this.A00 != null) {
            boolean z = this.A0F;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "pcQhCrMOoUvf1wSUiS8eXhj7G6bioSrh";
            strArr[4] = "JWZBC7ZhFf7k7YrTz5pa22tV9NT1Mc4w";
            if (z && (this.A0G || !this.A0H)) {
                C2B c2b = this.A00;
                if (A0K[3].charAt(25) != 'G') {
                    A0K[3] = "irPj8aYnTZH6GsdLYSbTyVfXBLXHQnPh";
                    c2b.ACV(this, this.A09);
                } else {
                    A0K[3] = "5PA9hoTjlgD01Tr6eTkR8jxCvDfXc2RO";
                    c2b.ACV(this, this.A09);
                }
            }
        }
        this.A04.A0F().A4E(this.A00 != null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    public void A0C(int i, C05618u c05618u) {
        C2013n6 c2013n6 = new C2013n6(this);
        this.A0A = new LI(this.A04, this.A05, c2013n6, this.A03, A08(0, 31, 79), 2, this.A07);
        this.A0B = new C2012n5(this);
        this.A0C = new JL(this.A0A, c05618u.A04(), c05618u.A09(), true, new WeakReference(this.A0B), this.A04);
        this.A0C.A0W(this.A03.A0U());
        this.A0C.A0X(this.A03.A0V());
        this.A0A.setVisibility(0);
        this.A04.getResources();
        this.A0A.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        this.A0A.AJI();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0F(C05618u c05618u, JSONObject jSONObject, EnumC0599Aj enumC0599Aj) {
        this.A0G = false;
        C1995mo c1995moA00 = C1995mo.A00(this.A04, jSONObject);
        this.A0E = c1995moA00.A7E();
        if (AbstractC03881z.A06(this.A04, c1995moA00, this.A05)) {
            this.A04.A0F().A4s();
            this.A00.ADc(this, C0597Ag.A00(AdErrorType.NO_FILL));
            return;
        }
        this.A08 = new N6(this, c1995moA00);
        this.A09 = new C1625ge(this.A04, (WeakReference<F4>) new WeakReference(this.A08), c05618u.A04(), A7E());
        this.A09.A0G(c05618u.A07(), c05618u.A08());
        AnonymousClass26 impressionHelper = new C2011n4(this);
        this.A02 = new C1993mm(this.A04, this.A05, this.A09, this.A09.getViewabilityChecker(), impressionHelper, enumC0599Aj);
        this.A02.A0A(c1995moA00);
        this.A09.loadDataWithBaseURL(F7.A01(AdInternalSettings.getUrlPrefix()), c1995moA00.A04(), A08(31, 9, 19), A08(40, 5, 12), null);
        this.A0F = true;
        A0A();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053 A[PHI: r1
  0x0053: PHI (r1v13 int) = (r1v10 int), (r1v17 int) binds: [B:20:0x0079, B:12:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    private void A0G(EnumC0599Aj enumC0599Aj, C05618u c05618u) {
        int i;
        int bannerHeight;
        if (this.A03 != null) {
            A7 a7 = this.A05;
            if (A0K[1].charAt(21) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0K;
            strArr[6] = "0asQ5nS3mEJJFXqECkaJp8czAINd5ojj";
            strArr[4] = "wkfCN0fAVUFan65EWCqz3ffd3K2ZXjjS";
            if (a7 == null) {
                return;
            }
            int iA03 = enumC0599Aj.A03();
            if (A0K[3].charAt(25) != 'G') {
                A0K[5] = "7AAzPingpmVfFCqSXKHauNoNKo9Xv93Z";
                i = (int) (iA03 * Resources.getSystem().getDisplayMetrics().density);
                if (C05789m.A28(this.A04)) {
                    bannerHeight = C7J.A0A(this.A03.A0u()) ? 1 : 0;
                }
                if (bannerHeight == 0) {
                    A0C(i, c05618u);
                } else {
                    new C7J(new C05357t(this.A04), this.A03.A0u(), this.A03.A0i(), this.A03.A0r(), true, new C2015n8(this, i, c05618u, this)).A0B();
                }
            }
            i = (int) (iA03 * Resources.getSystem().getDisplayMetrics().density);
            if (C05789m.A28(this.A04)) {
                if (C7J.A0A(this.A03.A0u())) {
                }
            }
            if (bannerHeight == 0) {
                A0C(i, c05618u);
            } else {
                new C7J(new C05357t(this.A04), this.A03.A0u(), this.A03.A0i(), this.A03.A0r(), true, new C2015n8(this, i, c05618u, this)).A0B();
            }
            if (bannerHeight == 0) {
                A0C(i, c05618u);
            } else {
                new C7J(new C05357t(this.A04), this.A03.A0u(), this.A03.A0i(), this.A03.A0r(), true, new C2015n8(this, i, c05618u, this)).A0B();
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final String A7E() {
        return this.A0E;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final AdPlacementType A8a() {
        if (C05789m.A18(this.A04)) {
            EnumC0599Aj enumC0599Aj = this.A06;
            String[] strArr = A0K;
            if (strArr[2].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            A0K[0] = "gRyzGCsQg6apk2eHBZ3N290V4KDgGwY2";
            if (enumC0599Aj != null && this.A06 == EnumC0599Aj.A09) {
                return AdPlacementType.MEDIUM_RECTANGLE;
            }
        }
        return AdPlacementType.BANNER;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2016n9
    public final void AAi(M5 m5, A7 a7, EnumC0599Aj enumC0599Aj, C2B c2b, JSONObject jSONObject, C05618u c05618u) {
        m5.A0F().A4D();
        this.A04 = m5;
        this.A05 = a7;
        this.A00 = c2b;
        this.A06 = enumC0599Aj;
        this.A0H = C05789m.A1h(this.A04.getApplicationContext());
        this.A03 = C0901Mx.A02(jSONObject, this.A04);
        if (this.A03.A1F()) {
            A0G(enumC0599Aj, c05618u);
        } else {
            A0F(c05618u, jSONObject, enumC0599Aj);
        }
        this.A01 = new C2C(this.A04, this.A0I, this, c2b);
        this.A01.A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final boolean AJQ() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.N5 != com.facebook.ads.internal.adapters.FacebookBannerAdapter<NativeViewabilityLogger> */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final void onDestroy() {
        this.A04.A0F().A4B(this.A09 != null);
        if (this.A09 != null) {
            this.A09.destroy();
            this.A09 = null;
            this.A08 = null;
        }
        if (this.A01 != null) {
            this.A01.A03();
        }
    }
}
