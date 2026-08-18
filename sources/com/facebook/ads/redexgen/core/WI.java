package com.facebook.ads.redexgen.core;

import com.google.android.exoplayer2.DrmInitData;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WI {
    public static String[] A0A = {"6iG2pzuEQycoVFq725g4qJVnVpIWZtlR", "55l141mBLH5WkPDbxXMnALrHQI6q7lEr", "qJTDm2F9TSXG", "DtWX", "J", "d1C1KGlOvszMCpNlse9bACflAWEVGthH", "0mTI1KWBNfYIDi0cnokbmIS0fHm5LYjn", "iC8Ub00tDVOO7seA02PucuhNsAEH3abh"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public WC A04;
    public WZ A05;
    public final InterfaceC1086Uo A06;
    public final C1123Wb A07 = new C1123Wb();
    public final C1576fq A09 = new C1576fq(1);
    public final C1576fq A08 = new C1576fq();

    public WI(InterfaceC1086Uo interfaceC1086Uo) {
        this.A06 = interfaceC1086Uo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1122Wa A00() {
        C1122Wa encryptionBox;
        int i = this.A07.A06.A02;
        if (this.A07.A07 != null) {
            encryptionBox = this.A07.A07;
        } else {
            encryptionBox = this.A05.A00(i);
        }
        if (encryptionBox == null || !encryptionBox.A03) {
            return null;
        }
        return encryptionBox;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        C1122Wa c1122WaA00 = A00();
        if (c1122WaA00 == null) {
            return;
        }
        C1576fq c1576fq = this.A07.A0H;
        if (c1122WaA00.A00 != 0) {
            c1576fq.A0g(c1122WaA00.A00);
        }
        if (this.A07.A06(this.A01)) {
            c1576fq.A0g(c1576fq.A0M() * 6);
        }
    }

    public final int A04() {
        C1576fq c1576fq;
        int vectorSize;
        C1122Wa c1122WaA00 = A00();
        if (c1122WaA00 == null) {
            return 0;
        }
        if (c1122WaA00.A00 != 0) {
            c1576fq = this.A07.A0H;
            vectorSize = c1122WaA00.A00;
        } else {
            byte[] initVectorData = c1122WaA00.A04;
            this.A08.A0j(initVectorData, initVectorData.length);
            c1576fq = this.A08;
            vectorSize = initVectorData.length;
        }
        boolean zA06 = this.A07.A06(this.A01);
        this.A09.A00[0] = (byte) ((zA06 ? 128 : 0) | vectorSize);
        this.A09.A0f(0);
        InterfaceC1086Uo interfaceC1086Uo = this.A06;
        C1576fq initializationVectorData = this.A09;
        interfaceC1086Uo.AHx(initializationVectorData, 1);
        this.A06.AHx(c1576fq, vectorSize);
        if (!zA06) {
            return vectorSize + 1;
        }
        C1576fq c1576fq2 = this.A07.A0H;
        int iA0M = c1576fq2.A0M();
        c1576fq2.A0g(-2);
        int i = (iA0M * 6) + 2;
        this.A06.AHx(c1576fq2, i);
        return vectorSize + 1 + i;
    }

    public final void A05() {
        this.A07.A01();
        this.A01 = 0;
        this.A02 = 0;
        this.A00 = 0;
        this.A03 = 0;
    }

    public final void A06(long j) {
        for (int i = this.A01; i < searchIndex && this.A07.A00(i) < j; i++) {
            if (this.A07.A0G[i]) {
                this.A03 = i;
            }
        }
    }

    public final void A07(DrmInitData drmInitData) {
        C1122Wa encryptionBox = this.A05.A00(this.A07.A06.A02);
        String str = encryptionBox != null ? encryptionBox.A02 : null;
        InterfaceC1086Uo interfaceC1086Uo = this.A06;
        ZM zm = this.A05.A07;
        String[] strArr = A0A;
        String schemeType = strArr[0];
        if (schemeType.charAt(0) == strArr[1].charAt(0)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[6] = "lpqHmBvcUgjM3Ysqc1Ebun64n1SVP7eZ";
        strArr2[5] = "0GYMuHaUcEVaktTpZSAbFa1nNlov1DMX";
        interfaceC1086Uo.A6U(zm.A09(drmInitData.A01(str)));
    }

    public final void A08(WZ wz, WC wc) {
        this.A05 = (WZ) AbstractC1517es.A01(wz);
        this.A04 = (WC) AbstractC1517es.A01(wc);
        this.A06.A6U(wz.A07);
        A05();
    }

    public final boolean A09() {
        this.A01++;
        this.A00++;
        if (this.A00 != this.A07.A0C[this.A02]) {
            return true;
        }
        this.A02++;
        this.A00 = 0;
        return false;
    }
}
