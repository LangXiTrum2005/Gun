package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class BY implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<BO> A04;
    public final BM A00;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{44, 11, cw.n, cw.n, 31, 28, 18, 27, 94, 29, 12, 27, 31, 10, 27, 26, 80, 94, 42, 22, 12, 27, 31, 26, 68, 94};
    }

    public abstract void A05();

    static {
        A01();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public BY() {
        if (A03.get()) {
            this.A00 = C0611Bd.A01(new C0610Bc(A00(0, 26, 94) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A02(boolean z) {
        A03.set(z);
    }

    public static void A03(boolean z, BO bo) {
        A02.set(z);
        A04.set(bo);
    }

    public final BM A04() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                C0611Bd.A03(this);
            }
            try {
                A05();
            } catch (Throwable th) {
                if (A02.get()) {
                    Bf.A00().AAm(3301, th);
                    BO bo = A04.get();
                    if (bo != null) {
                        bo.AHf(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                C0611Bd.A04(this);
            }
        } catch (Throwable th2) {
            BQ.A00(th2, this);
        }
    }
}
