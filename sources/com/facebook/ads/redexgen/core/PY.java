package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class PY implements InterfaceC1435dX {
    public static byte[] A0A;
    public static String[] A0B = {"qVKiPc72Is5lKRYjUx", "42emtlJbxk8rIv09Di6nlKdnQgt", "vgUau6UVNGNDTr4sUQY9yT1FeYehQtdo", "IQrqHyt0FagouRqTEmR4tqdwMKu6mS7k", "PjsEzwzn6OiwkzF1Le3DWSKr1T8IGCGY", "Go05HxhgiLetSRHHRbzNyDTaOFPtJnWn", "fYkoUhN9QTsT8Q8Ywid", "PjbM1ndjMIr2id5j7lRURGvcM2blLD"};
    public long A00;
    public long A01;
    public long A02;
    public C1447dj A03;
    public C1515eq A04;
    public File A05;
    public OutputStream A06;
    public final int A07;
    public final long A08;
    public final InterfaceC1490eR A09;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0B;
            if (strArr[7].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0B[3] = "ZCN1Zjk54dCJvy1OfkYVwz4bthWY4xg6";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 100);
            i4++;
        }
    }

    public static void A02() {
        A0A = new byte[]{-41, -11, -9, -4, -7, -40, -11, 8, -11, -25, -3, 2, -1, 31, 43, 26, 32, 38, 30, 39, 45, 12, 34, 51, 30, -39, 34, 44, -39, 27, 30, 37, 40, 48, -39, 45, 33, 30, -39, 38, 34, 39, 34, 38, 46, 38, -39, 43, 30, 28, 40, 38, 38, 30, 39, 29, 30, 29, -39, 47, 26, 37, 46, 30, -39, 40, 31, -39, -21, -23, -14, -16, -22, -18, -21, -25, -39, cw.k, 33, 34, 44, -39, 38, 26, 50, -39, 28, 26, 46, 44, 30, -39, 41, 40, 40, 43, -39, 28, 26, 28, 33, 30, -39, 41, 30, 43, 31, 40, 43, 38, 26, 39, 28, 30, -25, 18, 30, cw.k, 19, 25, 17, 26, 32, -1, 21, 38, 17, -52, 25, 33, 31, 32, -52, cw.l, 17, -52, 28, 27, 31, 21, 32, 21, 34, 17, -52, 27, 30, -52, -17, -38, -8, -15, -6, -13, 0, -12, 11, 1, -6, -1, -15, 0, -38};
    }

    static {
        A02();
    }

    public PY(InterfaceC1490eR interfaceC1490eR, long j, int i) {
        AbstractC1517es.A0A(j > 0 || j == -1, A00(115, 48, 72));
        if (j != -1 && j < 2097152) {
            AbstractC1561fb.A07(A00(0, 13, 48), A00(13, 102, 85));
        }
        this.A09 = (InterfaceC1490eR) AbstractC1517es.A01(interfaceC1490eR);
        this.A08 = j == -1 ? Long.MAX_VALUE : j;
        this.A07 = i;
    }

    private void A01() throws IOException {
        if (this.A06 == null) {
            return;
        }
        boolean z = false;
        try {
            this.A06.flush();
            boolean z2 = true;
            byte b = b == true ? 1 : 0;
        } finally {
            AbstractC1600gE.A10(this.A06);
            this.A06 = null;
            File file = (File) AbstractC1600gE.A0f(this.A05);
            this.A05 = null;
            if (z) {
                this.A09.A4v(file, this.A02);
            } else {
                file.delete();
            }
        }
    }

    private void A03(C1447dj c1447dj) throws IOException {
        this.A05 = this.A09.AJD((String) AbstractC1600gE.A0f(c1447dj.A08), c1447dj.A04 + this.A00, c1447dj.A03 != -1 ? Math.min(c1447dj.A03 - this.A00, this.A01) : -1L);
        FileOutputStream fileOutputStream = new FileOutputStream(this.A05);
        if (this.A07 > 0) {
            if (this.A04 == null) {
                this.A04 = new C1515eq(fileOutputStream, this.A07);
            } else {
                this.A04.A00(fileOutputStream);
            }
            this.A06 = this.A04;
        } else {
            this.A06 = fileOutputStream;
        }
        this.A02 = 0L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435dX
    public final void AFs(C1447dj c1447dj) throws IOException {
        AbstractC1517es.A01(c1447dj.A08);
        if (c1447dj.A03 == -1 && c1447dj.A06(2)) {
            this.A03 = null;
            return;
        }
        this.A03 = c1447dj;
        this.A01 = c1447dj.A06(4) ? this.A08 : Long.MAX_VALUE;
        if (A0B[0].length() != 18) {
            throw new RuntimeException();
        }
        A0B[4] = "GFm3ofOnFDAAk0uQ4t2jahhm2i2BLupT";
        this.A00 = 0L;
        try {
            A03(c1447dj);
        } catch (IOException e) {
            throw new C0955Pe(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435dX
    public final void close() throws IOException {
        if (this.A03 == null) {
            return;
        }
        try {
            A01();
        } catch (IOException e) {
            throw new C0955Pe(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1435dX
    public final void write(byte[] bArr, int i, int i2) throws C0955Pe {
        C1447dj c1447dj = this.A03;
        if (c1447dj == null) {
            return;
        }
        int i3 = 0;
        while (i3 < i2) {
            try {
                if (this.A02 == this.A01) {
                    A01();
                    A03(c1447dj);
                }
                int iMin = (int) Math.min(i2 - i3, this.A01 - this.A02);
                ((OutputStream) AbstractC1600gE.A0f(this.A06)).write(bArr, i + i3, iMin);
                i3 += iMin;
                this.A02 += (long) iMin;
                this.A00 += (long) iMin;
            } catch (IOException e) {
                throw new C0955Pe(e);
            }
        }
    }
}
