package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class N8 extends AbstractC2023nG {
    public static byte[] A02;
    public static String[] A03 = {"FXNBCWXiStej7hPExkUYAqHU7xYJWQz0", "1k", "9V456DvY4LqOh9I9hdT7Vdo5", "hY2FptqSd7XbZZsJCz2yOGxQcUuE9Eo6", "F2N3RsuOcTrAQaEUExDI4U65CqttWDRl", "hYiRMwjZqKFmNKhRfgQ6FfhFwFErfvFO", "BBwXtDWFWjLC6NycZYUWGAP3M0YJ", ""};
    public static final String A04;
    public final Uri A00;
    public final Map<String, String> A01;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 84);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-100, -73, -65, -62, -69, -70, 118, -54, -59, 118, -59, -58, -69, -60, 118, -62, -65, -60, -63, 118, -53, -56, -62, -112, 118, -45, -48, -43, -46};
        if (A03[3].charAt(0) == 'g') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[4] = "n2WgzR0RMCkX50JDMRkryQ8YygezODnU";
        strArr[5] = "Oz9myBlwI7NBoyftyrFAavzWMm25M0Ie";
    }

    static {
        A01();
        A04 = N8.class.getSimpleName();
    }

    public N8(C1828k1 c1828k1, A7 a7, String str, Uri uri, Map<String, String> mExtraData, AnonymousClass22 anonymousClass22, boolean z) {
        super(c1828k1, a7, str, anonymousClass22, z);
        this.A00 = uri;
        this.A01 = mExtraData;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2023nG
    public final EnumC03831u A0D() {
        EnumC03831u enumC03831uA0G = EnumC03831u.A09;
        if (this.A03) {
            enumC03831uA0G = A0G();
        }
        if (!D3.A0e(((AbstractC03841v) this).A00, enumC03831uA0G, this.A01)) {
            A0E(this.A01, enumC03831uA0G);
        }
        return enumC03831uA0G;
    }

    public final EnumC03831u A0G() {
        if (A0F(this.A00)) {
            EnumC03831u actionOutcome = EnumC03831u.A0A;
            return actionOutcome;
        }
        try {
            EnumC03831u actionOutcome2 = C2.A05(new C2(), ((AbstractC03841v) this).A00, C5.A00(this.A00.getQueryParameter(A00(25, 4, 19))), ((AbstractC03841v) this).A02, this.A01);
            return actionOutcome2;
        } catch (Exception unused) {
            String str = A00(0, 25, 2) + this.A00.toString();
            EnumC03831u actionOutcome3 = EnumC03831u.A04;
            return actionOutcome3;
        }
    }
}
