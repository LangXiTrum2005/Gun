package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import com.badlogic.gdx.Input;
import com.google.android.exoplayer2.offline.DownloadRequest;
import com.umeng.analytics.pro.cw;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RL implements InterfaceC1240aJ {
    public static byte[] A02;
    public static String[] A03 = {"Ulq9k3xGQBCBjyPP0kXtwtb56IG", "4zW3cybUTANcrI", "E48BpRIrDfgBXEJqLj9s", "TfRbV1RzUu6tuiFHojOJ", "DMtCCmYNgsf9oVPruwtmcMDh8qrQiIiv", "yICYaZTzLhdkG2", "nFyYLsyOyT0Yp5xYmRcA13RlJDX8TddY", "b0Owjge10VTCc21YLtM4gKm1t5xX54HI"};
    public static final SparseArray<Constructor<? extends InterfaceC1238aH>> A04;
    public final PX A00;
    public final Executor A01;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A03;
            if (strArr[5].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[4] = "HkoHSSoTSOJPHKCGZfPEBPIcuo54aoHm";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 97);
            i4++;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Constructor<? extends InterfaceC1238aH> A03(Class<?> cls) {
        try {
            return cls.asSubclass(InterfaceC1238aH.class).getConstructor(ZE.class, PX.class, Executor.class);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(A02(0, 30, 30), e);
        }
    }

    public static void A04() {
        A02 = new byte[]{59, cw.n, 8, 17, 19, cw.n, 30, 27, 26, cw.k, 95, 28, cw.n, 17, 12, 11, cw.k, 10, 28, 11, cw.n, cw.k, 95, 18, 22, 12, 12, 22, 17, 24, 37, 2, 10, cw.m, 6, 7, 67, 23, 12, 67, 10, cw.k, cw.n, 23, 2, cw.k, 23, 10, 2, 23, 6, 67, 7, 12, 20, cw.k, cw.m, 12, 2, 7, 6, 17, 67, 5, 12, 17, 67, 0, 12, cw.k, 23, 6, cw.k, 23, 67, 23, 26, 19, 6, 67, 63, 29, 22, 7, 30, 23, 82, 31, 27, 1, 1, 27, 28, 21, 82, 20, 29, 0, 82, 17, 29, 28, 6, 23, 28, 6, 82, 6, 11, 2, 23, 82, 107, 80, 77, 75, 78, 78, 81, 76, 74, 91, 90, 30, 74, 71, 78, 91, 4, 30, 46, 34, 32, 99, 42, 34, 34, 42, 33, 40, 99, 44, 35, 41, 63, 34, 36, 41, 99, 40, 53, 34, 61, 33, 44, 52, 40, 63, 127, 99, 62, 34, 56, 63, 46, 40, 99, 41, 44, 62, 37, 99, 34, 43, 43, 33, 36, 35, 40, 99, 9, 44, 62, 37, 9, 34, 58, 35, 33, 34, 44, 41, 40, 63, 40, 36, 38, 101, 44, 36, 36, 44, 39, 46, 101, 42, 37, 47, 57, 36, 34, 47, 101, 46, 51, 36, 59, 39, 42, 50, 46, 57, 121, 101, 56, 36, 62, 57, 40, 46, 101, 35, 39, 56, 101, 36, 45, 45, 39, 34, 37, 46, 101, 3, 39, 56, cw.m, 36, 60, 37, 39, 36, 42, 47, 46, 57, 87, 91, 89, 26, 83, 91, 91, 83, 88, 81, 26, 85, 90, 80, 70, 91, 93, 80, 26, 81, 76, 91, 68, 88, 85, 77, 81, 70, 6, 26, 71, 91, 65, 70, 87, 81, 26, 71, 89, 91, 91, 64, 92, 71, 64, 70, 81, 85, 89, 93, 90, 83, 26, 91, 82, 82, 88, 93, 90, 81, 26, 103, 71, 112, 91, 67, 90, 88, 91, 85, 80, 81, 70};
    }

    static {
        A04();
        A04 = A00();
    }

    public RL(PX px, Executor executor) {
        this.A00 = (PX) AbstractC1517es.A01(px);
        this.A01 = (Executor) AbstractC1517es.A01(executor);
    }

    public static SparseArray<Constructor<? extends InterfaceC1238aH>> A00() {
        SparseArray<Constructor<? extends InterfaceC1238aH>> sparseArray = new SparseArray<>();
        try {
            sparseArray.put(0, A03(Class.forName(A02(130, 64, 44))));
        } catch (ClassNotFoundException unused) {
        }
        try {
            sparseArray.put(2, A03(Class.forName(A02(Input.Keys.F24, 62, 42))));
        } catch (ClassNotFoundException unused2) {
        }
        try {
            sparseArray.put(1, A03(Class.forName(A02(256, 73, 85))));
        } catch (ClassNotFoundException unused3) {
        }
        return sparseArray;
    }

    private InterfaceC1238aH A01(DownloadRequest downloadRequest, int i) {
        Constructor<? extends InterfaceC1238aH> constructor = A04.get(i);
        if (constructor != null) {
            try {
                return constructor.newInstance(new PH().A00(downloadRequest.A00).A04(downloadRequest.A04).A02(downloadRequest.A01).A05(), this.A00, this.A01);
            } catch (Exception e) {
                throw new IllegalStateException(A02(30, 50, 2) + i, e);
            }
        }
        throw new IllegalStateException(A02(80, 32, 19) + i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1240aJ
    public final InterfaceC1238aH A5C(DownloadRequest downloadRequest) {
        int iA0B = AbstractC1600gE.A0B(downloadRequest.A00, downloadRequest.A03);
        switch (iA0B) {
            case 0:
            case 1:
            case 2:
                InterfaceC1238aH interfaceC1238aHA01 = A01(downloadRequest, iA0B);
                if (A03[4].charAt(30) == 'x') {
                    throw new RuntimeException();
                }
                String[] strArr = A03;
                strArr[2] = "5qkQ9TiBqAoy97Dxm7VN";
                strArr[3] = "3DoYFcbxlhnwupfJ1YAA";
                return interfaceC1238aHA01;
            case 3:
            default:
                throw new IllegalArgumentException(A02(112, 18, 95) + iA0B);
            case 4:
                return new RE(new PH().A00(downloadRequest.A00).A02(downloadRequest.A01).A05(), this.A00, this.A01);
        }
    }
}
