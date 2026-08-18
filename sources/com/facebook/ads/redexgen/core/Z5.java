package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Log;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z5 {
    public static byte[] A03;
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<Z3> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ Z6 A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{94, 99, 120, 126, 107, 111, 114, 116, 117, 59, 108, 115, 126, 117, 59, 111, 105, 98, 114, 117, 124, 59, 111, 116, 59, 114, 117, 104, 111, 122, 117, 111, 114, 122, 111, 126, 59, 62, 104, 33, 59, 62, 104, 77, 101, 100, 105, 97, 67, 111, 100, 101, 99, 80, 111, 111, 108, 79, 112, 116, 105, 109, 105, 122, 101, 100, 90, 77, 77, 80, 77, 18, 72, 87, 86, 83, 90, 18, 77, 90, 83, 90, 94, 76, 90, 18, 92, 80, 91, 90, 92, 18, 89, 77, 80, 82, 18, 76, 90, 75, 18, 89, 86, 81, 94, 83, 83, 70, 5, 31, 26, 76, 117, 98, 98, 127, 98, 61, 103, 120, 121, 124, 117, 61, 98, 117, 124, 117, 113, 99, 117, 61, 115, 127, 116, 117, 115, 61, 118, 98, 127, 125, 61, 99, 117, 100, 42, 48, 53, 99, 20, 9, 30, 1, 29, cw.n, 8, 20, 3, 67, 95, cw.n, 7, 64, 95, 2, 3, 18, 95, 53, cw.n, 7, 64, 21, 60, 20, 21, 24, cw.n, 50, 30, 21, 20, 18, 48, 21, cw.n, 1, 5, 20, 3};
    }

    public Z5(Z6 z6) {
        this.A02 = z6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1197Yz A02(boolean z, C0889Mg c0889Mg, EnumC0886Mb enumC0886Mb, String str) throws Exception {
        Set<InterfaceC1197Yz> set;
        if (this.A02.A0I(z, c0889Mg) && Z6.A0G(str, c0889Mg)) {
            synchronized (this.A02.A04) {
                set = this.A02.A04.get(str);
            }
            if (set != null) {
                synchronized (set) {
                    if (!set.isEmpty()) {
                        this.A02.A00--;
                        Iterator<InterfaceC1197Yz> it = set.iterator();
                        InterfaceC1197Yz ret = it.next();
                        it.remove();
                        this.A02.A01().A08(z, str, enumC0886Mb, ret.hashCode());
                        return ret;
                    }
                }
            }
        }
        try {
            MZ mzA03 = this.A02.A01().A03(z, str, enumC0886Mb);
            InterfaceC1197Yz interfaceC1197YzA03 = A03(z, str);
            this.A02.A01().A04(mzA03, interfaceC1197YzA03.hashCode());
            return interfaceC1197YzA03;
        } catch (Exception e) {
            throw new MediaCodecInitializationException(str, e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC1197Yz A03(boolean z, String str) throws Exception {
        String strA04 = A04(Input.Keys.NUMPAD_6, 41, 81);
        if (z && Z6.A0E(str)) {
            try {
                return (InterfaceC1197Yz) Class.forName(strA04).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e) {
                Log.w(A04(43, 23, 32), String.format(A04(0, 43, 59), strA04, e.getMessage()));
            }
        }
        return new RQ(MediaCodec.createByCodecName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A06, reason: merged with bridge method [inline-methods] */
    public void A0B(EnumC0886Mb enumC0886Mb) {
        String strA04;
        String str;
        Z6 z6;
        Set<InterfaceC1197Yz> set;
        for (Z3 z3 : this.A01) {
            try {
                try {
                    if (!z3.A05) {
                        A07(z3.A00, enumC0886Mb, Boolean.valueOf(z3.A04), z3.A01);
                    } else {
                        try {
                            try {
                                this.A02.A05 = SystemClock.elapsedRealtime();
                                z3.A01.reset();
                                z6 = this.A02;
                            } catch (IllegalStateException unused) {
                                A09(z3.A02, z3.A01);
                                z6 = this.A02;
                            }
                            z6.A05 = -1L;
                            if (z3.A03) {
                                synchronized (this.A02.A04) {
                                    set = this.A02.A04.get(z3.A02);
                                }
                                if (set != null) {
                                    synchronized (set) {
                                        set.add(z3.A01);
                                        this.A02.A00++;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            this.A02.A05 = -1L;
                            throw th;
                        }
                    }
                    try {
                        synchronized (this.A01) {
                            try {
                                this.A01.remove(z3);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Exception e) {
                        strA04 = A04(43, 23, 32);
                        str = String.format(A04(66, 46, 31), e.getMessage());
                        Log.w(strA04, str);
                    }
                } catch (Throwable th3) {
                    try {
                        synchronized (this.A01) {
                            this.A01.remove(z3);
                            throw th3;
                        }
                    } catch (Exception e2) {
                        Log.w(A04(43, 23, 32), String.format(A04(66, 46, 31), e2.getMessage()));
                    }
                }
            } catch (Exception e3) {
                Log.w(A04(43, 23, 32), String.format(A04(112, 38, 48), e3.getMessage()));
                try {
                    synchronized (this.A01) {
                        try {
                            this.A01.remove(z3);
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                } catch (Exception e4) {
                    strA04 = A04(43, 23, 32);
                    str = String.format(A04(66, 46, 31), e4.getMessage());
                    Log.w(strA04, str);
                }
            }
        }
    }

    private void A07(C0889Mg c0889Mg, EnumC0886Mb enumC0886Mb, Boolean bool, InterfaceC1197Yz interfaceC1197Yz) {
        try {
            if (!c0889Mg.A0Q || (!bool.booleanValue() && !c0889Mg.A0P)) {
                interfaceC1197Yz.stop();
            }
        } finally {
            this.A02.A01().A06(enumC0886Mb, interfaceC1197Yz.hashCode());
            interfaceC1197Yz.AGj();
            this.A02.A01().A05(enumC0886Mb, interfaceC1197Yz.hashCode());
        }
    }

    private void A09(String str, InterfaceC1197Yz interfaceC1197Yz) {
        Set<InterfaceC1197Yz> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(interfaceC1197Yz)) {
                    this.A02.A00--;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x00de */
    /* JADX WARN: Code duplicated, block: B:103:0x011e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:90:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(boolean r24, com.facebook.ads.redexgen.core.C0889Mg r25, final com.facebook.ads.redexgen.core.EnumC0886Mb r26, java.lang.String r27, com.facebook.ads.redexgen.core.InterfaceC1197Yz r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.Z5.A0A(boolean, com.facebook.ads.redexgen.X.Mg, com.facebook.ads.redexgen.X.Mb, java.lang.String, com.facebook.ads.redexgen.X.Yz):void");
    }
}
