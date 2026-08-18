package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PQ implements InterfaceC1508ej {
    public static byte[] A07;
    public static String[] A08 = {"Z16lAJXikWhNEVLB7TbNlTWIkixZt69O", "x8BWvnJKkZY12LRW0xsaLDyjlvFaKZ9M", "YkkZSyZAuNxQWrRbBjAJwsc9pw0lbB9X", "uC0LA2AdDEeMxSQcCwrePMe78jx1NV8D", "2OnTtgLqSvUHSfgCuCeaYEqbPB9dHKR8", "qLyOsF0aZf4uxPzAqdSdr5x7hsuXUpsQ", "SGOKETwnnHRPULmcUin3YwIngjuAXgpx", "dTnXmBnDqMR0i06QWD3fpNeqUSszGkXO"};
    public C1515eq A00;
    public boolean A01;
    public final C1519eu A02;
    public final SecureRandom A03;
    public final Cipher A04;
    public final SecretKeySpec A05;
    public final boolean A06;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{24, 28, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A05(HashMap<String, C1507ei> map) throws IOException {
        try {
            C1518et c1518etA03 = this.A02.A03();
            if (this.A00 == null) {
                this.A00 = new C1515eq(c1518etA03);
            } else {
                this.A00.A00(c1518etA03);
            }
            C1515eq c1515eq = this.A00;
            DataOutputStream dataOutputStream = new DataOutputStream(c1515eq);
            dataOutputStream.writeInt(2);
            boolean z = this.A06;
            String[] strArr = A08;
            if (strArr[4].charAt(15) == strArr[0].charAt(15)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[6] = "X3FBm64xbPi7kLcoCSztdikMVUSOqSUd";
            strArr2[1] = "sQ5XcoQVEYuAfLxtC1B2xUlG5tj4rnIK";
            dataOutputStream.writeInt(z ? 1 : 0);
            if (this.A06) {
                byte[] bArr = new byte[16];
                ((SecureRandom) AbstractC1600gE.A0f(this.A03)).nextBytes(bArr);
                dataOutputStream.write(bArr);
                try {
                    ((Cipher) AbstractC1600gE.A0f(this.A04)).init(1, (Key) AbstractC1600gE.A0f(this.A05), new IvParameterSpec(bArr));
                    dataOutputStream.flush();
                    dataOutputStream = new DataOutputStream(new CipherOutputStream(c1515eq, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            }
            dataOutputStream.writeInt(map.size());
            int iA00 = 0;
            for (C1507ei c1507ei : map.values()) {
                A04(c1507ei, dataOutputStream);
                iA00 += A00(c1507ei, 2);
            }
            dataOutputStream.writeInt(iA00);
            this.A02.A06(dataOutputStream);
            AbstractC1600gE.A10(null);
        } catch (Throwable th) {
            AbstractC1600gE.A10(null);
            throw th;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private boolean A06(HashMap<String, C1507ei> map, SparseArray<String> sparseArray) {
        if (!this.A02.A07()) {
            return true;
        }
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(this.A02.A04());
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            int i = dataInputStream.readInt();
            if (i < 0 || i > 2) {
                AbstractC1600gE.A10(dataInputStream);
                return false;
            }
            if ((dataInputStream.readInt() & 1) != 0) {
                if (this.A04 == null) {
                    AbstractC1600gE.A10(dataInputStream);
                    return false;
                }
                byte[] bArr = new byte[16];
                dataInputStream.readFully(bArr);
                try {
                    this.A04.init(2, (Key) AbstractC1600gE.A0f(this.A05), new IvParameterSpec(bArr));
                    dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.A04));
                } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                    throw new IllegalStateException(e);
                }
            } else if (this.A06) {
                this.A01 = true;
            }
            int i2 = dataInputStream.readInt();
            int iA00 = 0;
            for (int i3 = 0; i3 < i2; i3++) {
                C1507ei c1507eiA01 = A01(i, dataInputStream);
                map.put(c1507eiA01.A02, c1507eiA01);
                sparseArray.put(c1507eiA01.A01, c1507eiA01.A02);
                iA00 += A00(c1507eiA01, i);
            }
            int i4 = dataInputStream.readInt();
            boolean z = dataInputStream.read() == -1;
            if (i4 == iA00 && z) {
                AbstractC1600gE.A10(dataInputStream);
                return true;
            }
            AbstractC1600gE.A10(dataInputStream);
            return false;
        } catch (IOException unused) {
            if (0 != 0) {
                AbstractC1600gE.A10(null);
            }
            return false;
        } catch (Throwable th) {
            if (0 != 0) {
                AbstractC1600gE.A10(null);
            }
            throw th;
        }
    }

    static {
        A03();
    }

    public PQ(File file, byte[] bArr, boolean z) {
        AbstractC1517es.A08((bArr == null && z) ? false : true);
        Cipher cipherA06 = null;
        SecretKeySpec secretKeySpec = null;
        if (bArr != null) {
            AbstractC1517es.A07(bArr.length == 16);
            try {
                cipherA06 = C1509ek.A06();
                secretKeySpec = new SecretKeySpec(bArr, A02(0, 3, 114));
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
                throw new IllegalStateException(e);
            }
        } else {
            AbstractC1517es.A07(!z);
        }
        this.A06 = z;
        this.A04 = cipherA06;
        this.A05 = secretKeySpec;
        this.A03 = z ? new SecureRandom() : null;
        this.A02 = new C1519eu(file);
    }

    private int A00(C1507ei c1507ei, int i) {
        int result = c1507ei.A01;
        int i2 = result * 31;
        int result2 = c1507ei.A02.hashCode();
        int result3 = i2 + result2;
        if (i < 2) {
            long jA00 = AbstractC1510el.A00(c1507ei.A03());
            return (result3 * 31) + ((int) ((jA00 >>> 32) ^ jA00));
        }
        return (result3 * 31) + c1507ei.A03().hashCode();
    }

    private C1507ei A01(int i, DataInputStream dataInputStream) throws IOException {
        PO poA02;
        int i2 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i < 2) {
            long length = dataInputStream.readLong();
            C1512en c1512en = new C1512en();
            C1512en.A00(c1512en, length);
            poA02 = PO.A03.A05(c1512en);
        } else {
            poA02 = C1509ek.A02(dataInputStream);
        }
        return new C1507ei(i2, utf, poA02);
    }

    private void A04(C1507ei c1507ei, DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(c1507ei.A01);
        dataOutputStream.writeUTF(c1507ei.A02);
        C1509ek.A08(c1507ei.A03(), dataOutputStream);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void A5f() {
        this.A02.A05();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final boolean A6I() {
        return this.A02.A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AA5(long j) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AAh(HashMap<String, C1507ei> map, SparseArray<String> idToKey) {
        AbstractC1517es.A08(!this.A01);
        if (!A06(map, idToKey)) {
            map.clear();
            idToKey.clear();
            this.A02.A05();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AEn(C1507ei c1507ei, boolean z) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AFS(C1507ei c1507ei) {
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AJN(HashMap<String, C1507ei> map) throws IOException {
        A05(map);
        this.A01 = false;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1508ej
    public final void AJO(HashMap<String, C1507ei> map) throws IOException {
        if (!this.A01) {
            return;
        }
        AJN(map);
    }
}
