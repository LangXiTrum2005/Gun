package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N4 implements InterfaceC2016n9 {
    public static byte[] A09;
    public static String[] A0A = {"0TFgGHCmbDEnT", "P3BoNX3HbYs3p91Xznd9cH02Ego1LEzw", "OWrFl7C0gkEmqIZvATANnxtRvMpHSetZ", "XjLJU23F7IQ7TgYJbWjoa78", "8eUGin29aZrVydG4hLQZ04ng176drDiv", "tE42BGb8ExLW22Y3fw0IicKZ4ID1w2IZ", "N0c3cK9W7W98ikBdYu66t8J", "EarR2SOYmotvRVJvY11PbnGgxllwGrNq"};
    public C2B A01;
    public C2C A02;
    public C1992ml A03;
    public C1989mi A04;
    public M5 A05;
    public InterfaceC0664Dm A06;
    public C0665Dn A07;
    public final String A08 = UUID.randomUUID().toString();
    public long A00 = -1;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 16);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A09 = new byte[]{-81, -64, -11, -19, -20, -15, -3, -11, -25, -6, -19, -21, -4, -23, -10, -17, -12, -19};
    }

    static {
        A04();
    }

    private void A05(M5 m5, C1989mi c1989mi, C05357t c05357t, C2B c2b, C0665Dn c0665Dn) {
        String strA7E = c1989mi.A7E();
        if (!TextUtils.isEmpty(strA7E)) {
            c05357t.A0d(new AF(strA7E, m5.A0A()));
        }
        AU auA0F = c1989mi.A0F();
        String[] strArr = A0A;
        String clientToken = strArr[3];
        if (clientToken.length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[3] = "l0iKT0z7S0YTo68xxrsf1qJ";
        strArr2[6] = "FTb7Q8n5ne47CtPUjUxYv1n";
        if (auA0F != null) {
            C05337r c05337r = new C05337r(c1989mi.A0F().getUrl(), c1989mi.A0F().getHeight(), c1989mi.A0F().getWidth(), c1989mi.A0Y(), A03(2, 16, 120));
            c05337r.A00 = new C7z(false, -1, -1);
            c05357t.A0V();
            c05357t.A0b(c05337r);
        }
        if (c1989mi.A0E() != null) {
            c05357t.A0b(new C05337r(c1989mi.A0E().getUrl(), c1989mi.A0E().getHeight(), c1989mi.A0E().getWidth(), c1989mi.A0Y(), A03(2, 16, 120)));
        }
        String strA0b = c1989mi.A0b();
        if (strA0b != null && !TextUtils.isEmpty(strA0b)) {
            c05357t.A0a(new C05317p(strA0b, c1989mi.A0Y(), A03(2, 16, 120), c1989mi.A0A()));
        }
        C2004mx c2004mx = new C2004mx(this, c0665Dn, c2b, m5);
        String strA0Y = c1989mi.A0Y();
        String clientToken2 = A03(2, 16, 120);
        c05357t.A0W(c2004mx, new C05287m(strA0Y, clientToken2));
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final String A7E() {
        if (this.A04 == null) {
            return null;
        }
        return this.A04.A7E();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final AdPlacementType A8a() {
        return AdPlacementType.MEDIUM_RECTANGLE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2016n9
    public final void AAi(M5 m5, A7 a7, EnumC0599Aj enumC0599Aj, C2B c2b, JSONObject jSONObject, C05618u c05618u) {
        m5.A0F().A4D();
        this.A05 = m5;
        this.A01 = c2b;
        C05357t c05357t = new C05357t(m5);
        this.A00 = System.currentTimeMillis();
        C1989mi c1989miA00 = C2K.A00(m5, jSONObject, CV.A02(jSONObject, A03(0, 2, 60)));
        this.A04 = c1989miA00;
        if (!AbstractC03881z.A06(m5, c1989miA00, a7)) {
            InterfaceC0664Dm adViewListener = new C2006mz(this, m5);
            this.A06 = adViewListener;
            C0665Dn c0665Dn = new C0665Dn(m5, a7, c05357t, new WeakReference(adViewListener), c05618u.A04(), c05618u.A07(), c05618u.A08(), c05618u.A09(), c1989miA00, this.A08);
            this.A07 = c0665Dn;
            this.A03 = new C1992ml(m5, new C2005my(this, m5, c2b), c0665Dn.getViewabilityChecker(), a7, c1989miA00);
            A05(m5, c1989miA00, c05357t, c2b, c0665Dn);
            this.A02 = new C2C(m5, this.A08, this, c2b);
            this.A02.A02();
            return;
        }
        m5.A0F().A4s();
        c2b.ADc(this, C0597Ag.A00(AdErrorType.NO_FILL));
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final boolean AJQ() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass23
    public final void onDestroy() {
        if (this.A05 != null) {
            InterfaceC2034nR interfaceC2034nRA0F = this.A05.A0F();
            String[] strArr = A0A;
            if (strArr[1].charAt(24) == strArr[4].charAt(24)) {
                throw new RuntimeException();
            }
            A0A[7] = "tMGyCfr9ucO4oWdztKDfdPlDfRrhkMp8";
            interfaceC2034nRA0F.A4B(this.A07 != null);
        }
        if (this.A07 != null) {
            this.A07.A0I();
            this.A07 = null;
            this.A06 = null;
        }
        C2C c2c = this.A02;
        if (A0A[0].length() == 16) {
            throw new RuntimeException();
        }
        A0A[7] = "5ZoCIskAsYlLTmabnaeKVzywNB4LbbVC";
        if (c2c != null) {
            this.A02.A03();
        }
    }
}
