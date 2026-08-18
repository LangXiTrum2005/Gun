package com.facebook.ads.redexgen.core;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class U6 {
    public static byte[] A06;
    public static String[] A07 = {"tdwCV", "CsHNQ", "LprjeldzzXrUjUCPTr90gimg9ZxWSalE", "sIWogN0x5RKOvGxiUfuEjzE8WeyVqqEU", "TzNkpNhi6gV5WnrFGvDc3O4IIUyPUNhJ", "3W5nyFVL5dECgpmHHkfZ8EmLFqVP9FZJ", "Pa3HX2rRihBuaWsXSuUsjIC6IF", "l34tEvAUNpO9kM24Tp8EFI3kk3"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final List<byte[]> A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static U6 A00(C1576fq c1576fq) throws Q6 {
        try {
            c1576fq.A0g(4);
            int iA0I = (c1576fq.A0I() & 3) + 1;
            if (iA0I == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iA0I2 = c1576fq.A0I() & 31;
            String[] strArr = A07;
            if (strArr[1].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "dYfFF5wESFNhTGKHVrACzTmqap";
            strArr2[7] = "SP6cNON7mwmmNEsJfMC1ATt8uH";
            for (int i = 0; i < iA0I2; i++) {
                arrayList.add(A03(c1576fq));
            }
            int iA0I3 = c1576fq.A0I();
            for (int i2 = 0; i2 < iA0I3; i2++) {
                arrayList.add(A03(c1576fq));
            }
            int i3 = -1;
            int i4 = -1;
            float f = 1.0f;
            String strA01 = null;
            if (iA0I2 > 0) {
                C1077Uc c1077UcA09 = AbstractC1078Ud.A09((byte[]) arrayList.get(0), iA0I, ((byte[]) arrayList.get(0)).length);
                i3 = c1077UcA09.A0A;
                i4 = c1077UcA09.A03;
                f = c1077UcA09.A00;
                strA01 = AbstractC1525f0.A01(c1077UcA09.A08, c1077UcA09.A01, c1077UcA09.A04);
            }
            return new U6(arrayList, iA0I, i3, i4, f, strA01);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw Q6.A01(A01(0, 24, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), e);
        }
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 72);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A06 = new byte[]{120, 79, 79, 82, 79, 29, 77, 92, 79, 78, 84, 83, 90, 29, 124, 107, 126, 29, 94, 82, 83, 91, 84, 90};
    }

    static {
        A02();
    }

    public U6(List<byte[]> initializationData, int i, int i2, int i3, float f, String str) {
        this.A05 = initializationData;
        this.A02 = i;
        this.A03 = i2;
        this.A01 = i3;
        this.A00 = f;
        this.A04 = str;
    }

    public static byte[] A03(C1576fq c1576fq) {
        int iA0M = c1576fq.A0M();
        int offset = c1576fq.A09();
        c1576fq.A0g(iA0M);
        return AbstractC1525f0.A07(c1576fq.A0l(), offset, iA0M);
    }
}
