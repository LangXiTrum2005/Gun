package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import android.util.Pair;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B9 {
    public static byte[] A08;
    public static String[] A09 = {"gkSyaXwR", "2VU3Nz3voiV1lmdRee4U2QJOpqB0EmXx", "l2PJ1mhNLKomP6h8XAPCJTvwOfm7DNfm", "U14uMoZpedA5MoqMp8wF", "ZGFJtzG5houIZuhA5wVIi53yZAjLLlX2", "TKuU0S0TRmpOZ7a0gUh222TH0KiJMCsX", "Ntgwe7QRVjptK5Vt0gMbvLxTukJluaCr", "4nIPbhAhAn1Dg8Q4wgXTfE5Yoh5xfpBP"};
    public static final D6 A0A;
    public static final Executor A0B;
    public static final AtomicReference<BD> A0C;
    public long A00;
    public long A01;
    public B8 A02;
    public Map<String, String> A03;
    public final C04213g A04;
    public final C1828k1 A05;
    public final BA A06;
    public final String A07;

    public static String A06(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{108, 106, 110, 115, -101, -99, 112, 114, -32, -15, -17, -21, -19, -25, -16, -19, -23, -14, -8, 3, -10, -23, -11, -7, -23, -9, -8, 3, -19, -24, -126, -84, 89, -117, -121, 115, 89, -62, -61, -108, -70, -67, -64, -64, -108, -26, -39, -41, -39, -35, -22, -39, -40, -39, -6, -85, -47, -12, -9, -9, -85, -16, -3, -3, -6, -3, -85, -18, -6, -17, -16, -85, -26, -80, -2, -24, -85, -80, -2, -33, -35, -26, -35, -22, -31, -37, -57, -66, -51, -48, -56, -53, -60, 10, 11, -30, 5, 8, 8, -28, 11, 11, 7, -35, -33, -36, -29, -42, -47, -46};
    }

    static {
        A0B();
        A0A = new D6();
        A0B = Executors.newCachedThreadPool(A0A);
        A0C = new AtomicReference<>();
    }

    public B9(C1828k1 c1828k1) {
        this(c1828k1, AbstractC04223h.A00(c1828k1.A02()));
    }

    public B9(C1828k1 c1828k1, C04213g c04213g) {
        this.A01 = -1L;
        this.A00 = -1L;
        this.A05 = c1828k1;
        this.A06 = BA.A00();
        this.A07 = BE.A01(c1828k1);
        this.A04 = c04213g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1734iU A03(long j, B6 b6) {
        return new C1734iU(this, b6, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A() {
        if (this.A05 == null || !C0817Jj.A0A(this.A05)) {
            return;
        }
        C05428b c05428b = new C05428b(A06(8, 5, 102));
        c05428b.A05(1);
        this.A05.A08().AAu(A06(86, 7, 32), AbstractC05418a.A1x, c05428b);
    }

    private void A0C(int i, String str) {
        String strA06 = A06(37, 16, 59);
        String strA07 = A06(0, 8, 1);
        String strA08 = A06(93, 10, 99);
        AbstractC0606Au.A05(strA08, strA06, strA07);
        AbstractC0606Au.A04(strA08, String.format(Locale.US, A06(53, 26, 82), Integer.valueOf(i), str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C0597Ag c0597Ag) {
        if (this.A02 != null) {
            this.A02.AD4(c0597Ag);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C0597Ag c0597Ag) {
        ExecutorC0649Cx.A00(new C1732iS(this, c0597Ag));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(C1731iR c1731iR) {
        if (this.A02 != null) {
            this.A02.AFG(c1731iR);
        } else {
            if (c1731iR.A00() == null || c1731iR.A00().A06() == null) {
                return;
            }
            C0614Bh.A00(this.A05).A0D(c1731iR.A00().A06().toString(), c1731iR.A00().A0B());
        }
    }

    private void A0M(C1731iR c1731iR) {
        C8B syncModule;
        ExecutorC0649Cx.A00(new C1733iT(this, c1731iR));
        if (C05789m.A2U(this.A05) && (syncModule = this.A05.A06()) != null) {
            syncModule.A6T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N(String str, long j, B6 b6) {
        String clientChallenge;
        try {
            try {
                BC bcA07 = this.A06.A07(this.A05, str, j);
                C05608t c05608tA00 = bcA07.A00();
                if (c05608tA00 != null) {
                    C05789m.A0U(this.A05).A2w(c05608tA00.A0A());
                    if (C05789m.A0w(this.A05) && c05608tA00.A08() != null) {
                        AnonymousClass93.A04(this.A05.A02(), c05608tA00.A08());
                    }
                    if (C05789m.A0x(this.A05) && c05608tA00.A0D() != null) {
                        AnonymousClass93.A05(this.A05.A02(), c05608tA00.A0D());
                    }
                    this.A05.A08().ABl();
                    this.A04.A0N(c05608tA00.A07());
                    B5.A05(c05608tA00.A05().A0B(), b6);
                    DH.A01(this.A05, A0B, c05608tA00);
                    C05428b c05428b = new C05428b(A06(30, 7, 0) + CQ.A02());
                    c05428b.A06(1);
                    c05428b.A0A(false);
                    this.A05.A08().ABU(A06(79, 7, 63), AbstractC05418a.A1W, c05428b);
                }
                switch (bcA07.A01()) {
                    case A02:
                        C1731iR c1731iR = (C1731iR) bcA07;
                        if (c05608tA00 != null) {
                            if (c05608tA00.A05().A0E()) {
                                B5.A07(str, b6);
                            }
                            if (this.A03 != null) {
                                clientChallenge = this.A03.get(A06(13, 17, 107));
                            } else {
                                clientChallenge = null;
                            }
                            if (!TextUtils.isEmpty(bcA07.A02()) && !TextUtils.isEmpty(clientChallenge)) {
                                this.A05.A03().AHo(this.A05, clientChallenge, bcA07.A02());
                            }
                        }
                        this.A05.A0F().A3N(C0646Cu.A01(this.A01), C0646Cu.A02(this.A01, this.A00));
                        A0M(c1731iR);
                        return;
                    case A03:
                        C1730iQ c1730iQ = (C1730iQ) bcA07;
                        String strA04 = c1730iQ.A04();
                        AdErrorType adErrorTypeAdErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1730iQ.A03(), AdErrorType.ERROR_MESSAGE);
                        A0C(c1730iQ.A03(), strA04);
                        if (strA04 == null) {
                            strA04 = str;
                        }
                        this.A05.A0F().A3M(C0646Cu.A01(this.A01), adErrorTypeAdErrorTypeFromCode.getErrorCode(), strA04, adErrorTypeAdErrorTypeFromCode.isPublicError());
                        A0E(C0597Ag.A01(adErrorTypeAdErrorTypeFromCode, strA04));
                        return;
                    default:
                        AdErrorType adErrorType = AdErrorType.UNKNOWN_RESPONSE;
                        this.A05.A0F().A3M(C0646Cu.A01(this.A01), adErrorType.getErrorCode(), str, adErrorType.isPublicError());
                        A0E(C0597Ag.A01(adErrorType, str));
                        return;
                }
            } catch (Exception e) {
                e = e;
                String message = e.getMessage();
                AdErrorType adErrorType2 = AdErrorType.PARSER_FAILURE;
                C1828k1 c1828k1 = this.A05;
                if (A09[0].length() == 29) {
                    throw new RuntimeException();
                }
                A09[0] = "STn1t4NLUPoQ";
                c1828k1.A0F().A3M(C0646Cu.A01(this.A01), adErrorType2.getErrorCode(), message, adErrorType2.isPublicError());
                A0E(C0597Ag.A01(adErrorType2, message));
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O(String str, long j, B6 b6) {
        A0B.execute(new C1735iV(this, str, j, b6));
    }

    private boolean A0P(B6 b6) {
        String string = b6.A06().toString();
        if (C0614Bh.A00(this.A05).A0F(string)) {
            return false;
        }
        int iA0A = C0614Bh.A00(this.A05).A0A(string);
        int storedAdsCount = C05789m.A0I(this.A05);
        int iA09 = C0614Bh.A00(this.A05).A09(string);
        if (iA0A >= storedAdsCount || iA0A > iA09) {
            C0614Bh c0614BhA00 = C0614Bh.A00(this.A05);
            String type = b6.A06().toString();
            Pair<String, String> pairA0B = c0614BhA00.A0B(type);
            if (pairA0B != null) {
                Object obj = pairA0B.second;
                String[] strArr = A09;
                String str = strArr[1];
                String str2 = strArr[4];
                int storedAdsCount2 = str.charAt(27);
                if (storedAdsCount2 == str2.charAt(27)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A09;
                strArr2[5] = "wxWvHA1chxzz72CPhzVDSI5kTKVxH7gh";
                strArr2[2] = "qa9WwGn6xu1bvFfukLGFlV7cMdAOaohF";
                if (obj != null && pairA0B.first != null) {
                    A0O(pairA0B.second.toString(), 0L, b6);
                    return true;
                }
            }
        }
        return false;
    }

    public final void A0Q(B6 b6) {
        this.A01 = System.currentTimeMillis();
        C05518k.A0B(this.A05);
        A0C.get();
        if (0 != 0) {
            throw new NullPointerException(A06(103, 7, 52));
        }
        if (C05789m.A02(this.A05) > 0 && A0P(b6)) {
            return;
        }
        if (B5.A08(b6)) {
            D8.A06.execute(new C1737iX(this));
            String strA02 = B5.A02(b6);
            if (strA02 != null) {
                this.A05.A0F().AJl();
                A0O(strA02, 0L, b6);
                return;
            } else {
                AdErrorType error = AdErrorType.LOAD_TOO_FREQUENTLY;
                this.A05.A0F().A3M(C0646Cu.A01(this.A01), error.getErrorCode(), error.getDefaultErrorMessage(), error.isPublicError());
                A0E(C0597Ag.A01(error, null));
                return;
            }
        }
        A0B.execute(new C1736iW(this, b6));
    }

    public final void A0R(B8 b8) {
        this.A02 = b8;
    }
}
