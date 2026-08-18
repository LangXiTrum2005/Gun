package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QN extends AbstractC1403d1<QN> implements Comparable<QN> {
    public static String[] A0I = {"oAw7EOk8LxirhsuMH4obyEeoWZy5IFRn", "vcyRganIlaiMVhNuds7mGdI90mZVu3NA", "5YZeVHK79K0wQm9Vf", "asZs0y1pCjnB3FyLQ1", "OxHrpq7nJKQohiaCdR", "sbhzoPka74", "9rlCTY1eQKrv2gum0kQuDOznhW4nV4", "WhbW8DWUolPaZGRRoAmIfShF"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final C04855v A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public QN(int i, C1175Yc c1175Yc, int i2, C04855v c04855v, int i3, boolean z, InterfaceC1719iE<ZM> interfaceC1719iE) {
        super(i, c1175Yc, i2);
        this.A0A = c04855v;
        this.A0B = C04845u.A0K(super.A02.A0V);
        this.A0F = C04845u.A0S(i3, false);
        int i4 = 0;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < c04855v.A0I.size(); i6++) {
            int iA02 = C04845u.A02(super.A02, c04855v.A0I.get(i6), false);
            if (iA02 > 0) {
                i5 = i6;
                i4 = iA02;
                break;
            }
        }
        this.A04 = i5;
        this.A05 = i4;
        this.A07 = C04845u.A00(super.A02.A0E, ((YN) c04855v).A0B);
        this.A0C = super.A02.A0E == 0 || (super.A02.A0E & 1) != 0;
        this.A0D = (super.A02.A0H & 1) != 0;
        this.A01 = super.A02.A06;
        this.A08 = super.A02.A0G;
        this.A00 = super.A02.A05;
        this.A0E = (super.A02.A05 == -1 || super.A02.A05 <= ((YN) c04855v).A01) && (super.A02.A06 == -1 || super.A02.A06 <= ((YN) c04855v).A02) && interfaceC1719iE.A42(super.A02);
        String[] strArrA1L = AbstractC1600gE.A1L();
        int i7 = Integer.MAX_VALUE;
        int i8 = 0;
        for (int i9 = 0; i9 < strArrA1L.length; i9++) {
            int iA03 = C04845u.A02(super.A02, strArrA1L[i9], false);
            if (iA03 > 0) {
                i7 = i9;
                i8 = iA03;
                break;
            }
        }
        this.A02 = i7;
        this.A03 = i8;
        int i10 = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < c04855v.A0J.size(); i11++) {
            if (super.A02.A0W != null && super.A02.A0W.equals(c04855v.A0J.get(i11))) {
                i10 = i11;
                break;
            }
        }
        this.A06 = i10;
        this.A0H = AbstractC0976Qb.A02(i3) == 128;
        this.A0G = AbstractC0976Qb.A04(i3) == 64;
        this.A09 = A00(i3, z);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A02(List<QN> list, List<QN> list2) {
        return ((QN) Collections.max(list)).compareTo((QN) Collections.max(list2));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static OI<QN> A03(int i, C1175Yc c1175Yc, C04855v c04855v, int[] iArr, boolean z, InterfaceC1719iE<ZM> interfaceC1719iE) {
        C4T c4tA01 = OI.A01();
        for (int i2 = 0; i2 < c1175Yc.A01; i2++) {
            c4tA01.A04(new QN(i, c1175Yc, i2, c04855v, iArr[i2], z, interfaceC1719iE));
        }
        return c4tA01.A05();
    }

    private int A00(int i, boolean z) {
        if (!C04845u.A0S(i, this.A0A.A0B)) {
            return 0;
        }
        if (!this.A0E) {
            C04855v c04855v = this.A0A;
            if (A0I[7].length() == 1) {
                throw new RuntimeException();
            }
            A0I[7] = "L8ddb";
            if (!c04855v.A09) {
                return 0;
            }
        }
        if (C04845u.A0S(i, false) && this.A0E && super.A02.A05 != -1 && !this.A0A.A0N && !this.A0A.A0O && (this.A0A.A04 || !z)) {
            return 2;
        }
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.nY != com.google.common.collect.Ordering<java.lang.Integer> */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final int compareTo(QN qn) {
        AbstractC2041nY abstractC2041nYA06;
        AbstractC2041nY abstractC2041nYA07 = (this.A0E && this.A0F) ? C04845u.A09 : C04845u.A09.A06();
        AbstractC1895l7 abstractC1895l7A08 = AbstractC1895l7.A01().A09(this.A0F, qn.A0F).A08(Integer.valueOf(this.A04), Integer.valueOf(qn.A04), AbstractC2041nY.A03().A06()).A06(this.A05, qn.A05).A06(this.A07, qn.A07).A09(this.A0D, qn.A0D).A09(this.A0C, qn.A0C).A08(Integer.valueOf(this.A02), Integer.valueOf(qn.A02), AbstractC2041nY.A03().A06()).A06(this.A03, qn.A03).A09(this.A0E, qn.A0E).A08(Integer.valueOf(this.A06), Integer.valueOf(qn.A06), AbstractC2041nY.A03().A06());
        Integer numValueOf = Integer.valueOf(this.A00);
        Integer numValueOf2 = Integer.valueOf(qn.A00);
        if (this.A0A.A0O) {
            abstractC2041nYA06 = C04845u.A09.A06();
        } else {
            abstractC2041nYA06 = C04845u.A0A;
        }
        AbstractC1895l7 abstractC1895l7A09 = abstractC1895l7A08.A08(numValueOf, numValueOf2, abstractC2041nYA06).A09(this.A0H, qn.A0H).A09(this.A0G, qn.A0G).A08(Integer.valueOf(this.A01), Integer.valueOf(qn.A01), abstractC2041nYA07).A08(Integer.valueOf(this.A08), Integer.valueOf(qn.A08), abstractC2041nYA07);
        Integer numValueOf3 = Integer.valueOf(this.A00);
        Integer numValueOf4 = Integer.valueOf(qn.A00);
        if (!AbstractC1600gE.A1E(this.A0B, qn.A0B)) {
            abstractC2041nYA07 = C04845u.A0A;
        }
        return abstractC1895l7A09.A08(numValueOf3, numValueOf4, abstractC2041nYA07).A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC1403d1
    /* JADX INFO: renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final boolean A09(QN qn) {
        if ((this.A0A.A00 || (super.A02.A06 != -1 && super.A02.A06 == ((AbstractC1403d1) qn).A02.A06)) && (this.A0A.A02 || (super.A02.A0W != null && TextUtils.equals(super.A02.A0W, ((AbstractC1403d1) qn).A02.A0W)))) {
            if (!this.A0A.A03) {
                int i = super.A02.A0G;
                if (A0I[7].length() != 1) {
                    A0I[6] = "mRXMNxFunMjm1MynMm1HvBx6RXkDa";
                    if (i != -1 && super.A02.A0G == ((AbstractC1403d1) qn).A02.A0G) {
                    }
                }
                throw new RuntimeException();
            }
            if (!this.A0A.A01) {
                if (this.A0H == qn.A0H) {
                    boolean z = this.A0G;
                    if (A0I[7].length() != 1) {
                        String[] strArr = A0I;
                        strArr[3] = "56qH6gxk7yd0c8ZnXu";
                        strArr[4] = "AAQMuhNNXcozHmi4np";
                        if (z == qn.A0G) {
                        }
                    }
                    throw new RuntimeException();
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1403d1
    public final int A08() {
        return this.A09;
    }
}
