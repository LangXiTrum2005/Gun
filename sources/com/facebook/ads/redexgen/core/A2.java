package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.api.AudienceNetworkRemoteServiceApi;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A2 extends Handler {
    public static byte[] A04;
    public static String[] A05 = {"4udqyVbWZXJvSc0AlbflTWwfFOYrDaDf", "2YLZ8zu95yTf3T209", "2VJPb0Yp69Qd6undQokFBSWI7sS3NGkE", "Nq0QHebF7aCImjCS8", "WfWu3jj6ZslW8HMUv7JinXygwhejXyBb", "C4PEiJW5iwJTin2vYgbWRkUl1o", "sWvNSKALPWxj", "lJrPEKSWvzui7DJNo"};
    public static final String A06;
    public final Context A00;
    public final AudienceNetworkRemoteServiceApi.MessageHandler A01;
    public final AudienceNetworkRemoteServiceApi.PackageVerifier A02;
    public final C1774j9 A03;

    public static String A03(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        byte[] bArr = {-8, -16, -13, -5, -16, -14, -66, -53, -53, -56, -37, -59, -49, -37, -62, -47, -54, -54, -63, -56, -37, -56, -53, -61, -61, -63, -64, -13, -12, -14, -1, -31, -28, -1, -23, -28, -1, -21, -27, -7, 17, 18, cw.n, 29, 0, 19, 12, 2, 10, 3, 29, 9, 3, 23, -48, -47, -49, -36, -48, -62, -49, -45, -58, -64, -62, -36, -62, -43, -47, -49, -66, -48, 21, 22, 20, 33, 21, 7, 20, 24, 11, 5, 7, 33, 21, 6, cw.k, 33, 24, 7, 20, 21, 11, 17, cw.n};
        if (A05[5].length() == 23) {
            throw new RuntimeException();
        }
        A05[5] = "AJ3";
        A04 = bArr;
    }

    static {
        A04();
        A06 = A2.class.getSimpleName();
    }

    public A2(Context context, AudienceNetworkRemoteServiceApi.MessageHandler messageHandler, AudienceNetworkRemoteServiceApi.PackageVerifier packageVerifier) {
        super(Looper.getMainLooper());
        this.A00 = context;
        this.A02 = packageVerifier;
        this.A03 = C1774j9.A00();
        this.A01 = messageHandler;
    }

    public static Bundle A00() {
        Bundle bundle = new Bundle();
        bundle.putString(A03(72, 23, 92), A03(0, 6, 92));
        bundle.putString(A03(54, 18, 23), new JSONObject().toString());
        return bundle;
    }

    private C1945ly A01(C1941lu c1941lu, String str) {
        C1945ly c1945ly = new C1945ly(c1941lu, this.A03, str);
        c1945ly.A0G(c1941lu.A0B(), c1941lu.A07());
        return c1945ly;
    }

    private C1942lv A02(C1929li c1929li, String str) {
        C1942lv c1942lv = new C1942lv(c1929li, this.A03, str);
        c1942lv.A0J(c1929li.A05, c1929li.A02, c1929li.A08);
        return c1942lv;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) throws Throwable {
        String strVerifyPackage;
        if (BQ.A02(this)) {
            return;
        }
        try {
            if (this.A01 != null && this.A01.handleMessage(msg)) {
                return;
            }
            Messenger messenger = msg.replyTo;
            if (msg.what == 1) {
                if (messenger != null) {
                    C1774j9.A00().A07(2, null, A00(), messenger);
                    return;
                }
                return;
            }
            String callingAppPackage = msg.getData().getString(A03(27, 13, 58));
            if (callingAppPackage == null) {
                return;
            }
            C1828k1 c1828k1A05 = C05056p.A05(this.A00, callingAppPackage);
            c1828k1A05.A0F().AIY(msg.getData().getBoolean(A03(6, 21, 22), false));
            if (this.A02 != null) {
                strVerifyPackage = this.A02.verifyPackage(this.A00, msg, msg.getData().getString(A03(40, 14, 88)));
            } else {
                strVerifyPackage = null;
            }
            if (strVerifyPackage == null) {
                if (messenger != null) {
                    C1774j9.A00().A07(20, callingAppPackage, null, messenger);
                }
                c1828k1A05.A0F().AH2();
                return;
            }
            switch (msg.what) {
                case 1010:
                    if (messenger == null) {
                        return;
                    }
                    C05919z c05919zA04 = C1774j9.A00().A04(callingAppPackage);
                    if (c05919zA04 == null) {
                        c05919zA04 = C1774j9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C1941lu intAdModel = C3X.A04(c1828k1A05, msg.getData(), strVerifyPackage);
                    if (c05919zA04.A00 == null) {
                        c05919zA04.A00 = A01(intAdModel, callingAppPackage);
                    } else if (c05919zA04.A00 instanceof C1945ly) {
                        ((C1945ly) c05919zA04.A00).A0G(intAdModel.A0B(), intAdModel.A07());
                    }
                    C1774j9.A00().A07(1011, callingAppPackage, A00(), messenger);
                    return;
                case 1012:
                case 2002:
                    C1774j9.A00().A08(callingAppPackage);
                    return;
                case 2000:
                    if (messenger == null) {
                        return;
                    }
                    C05919z c05919zA05 = C1774j9.A00().A04(callingAppPackage);
                    if (c05919zA05 == null) {
                        c05919zA05 = C1774j9.A00().A05(callingAppPackage, messenger, strVerifyPackage);
                    }
                    C1929li c1929liA05 = C3X.A05(c1828k1A05, msg.getData(), strVerifyPackage);
                    if (c05919zA05.A00 == null) {
                        c05919zA05.A00 = A02(c1929liA05, callingAppPackage);
                    } else if (c05919zA05.A00 instanceof C1942lv) {
                        C1942lv c1942lv = (C1942lv) c05919zA05.A00;
                        String adId = c1929liA05.A05;
                        c1942lv.A0J(adId, c1929liA05.A02, c1929liA05.A08);
                    }
                    C1774j9.A00().A07(2001, callingAppPackage, A00(), messenger);
                    return;
                case 2003:
                    C3G c3gA03 = C1774j9.A00().A03(callingAppPackage);
                    if (c3gA03 instanceof C1942lv) {
                        RewardData rewardDataA01 = C3Y.A01(msg.getData());
                        C1942lv c1942lv2 = (C1942lv) c3gA03;
                        if (rewardDataA01 != null) {
                            c1942lv2.A0I(rewardDataA01);
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable th) {
            if (A05[5].length() == 23) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "nIV8RMn07Ah5";
            strArr[1] = "ZacTvu5dUvRq7FGBf";
            BQ.A00(th, this);
        }
    }
}
