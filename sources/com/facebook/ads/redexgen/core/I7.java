package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardData;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class I7 {
    public static byte[] A05;
    public Executor A00 = D8.A06;
    public final C1828k1 A01;
    public final DR A02;
    public final EC A03;
    public final String A04;

    static {
        A04();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 76);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{5, 20, 20, cw.k, 8, 19, 31, 31, 27, 30, -27, -38, -38, 34, 34, 34, -39, -48, 30, -39, 17, 12, cw.l, cw.n, cw.k, 26, 26, 22, -39, cw.l, 26, 24, -38, 12, 32, cw.m, 20, cw.n, 25, cw.l, cw.n, 10, 25, cw.n, 31, 34, 26, 29, 22, -38, 30, cw.n, 29, 33, cw.n, 29, 10, 30, 20, cw.m, cw.n, 10, 29, cw.n, 34, 12, 29, cw.m, -31, -19, -19, -23, -20, -77, -88, -88, -16, -16, -16, -89, -33, -38, -36, -34, -37, -24, -24, -28, -89, -36, -24, -26, -88, -38, -18, -35, -30, -34, -25, -36, -34, -40, -25, -34, -19, -16, -24, -21, -28, -88, -20, -34, -21, -17, -34, -21, -40, -20, -30, -35, -34, -40, -21, -34, -16, -38, -21, -35, 20, 7, 31, 35, 24, 19, 42, 47, 35, 30};
    }

    public I7(C1828k1 c1828k1, EC ec, String str, DR dr) {
        this.A01 = c1828k1;
        this.A03 = ec;
        this.A04 = str;
        this.A02 = dr;
    }

    public static String A03(RewardData rewardData, String str, String str2) {
        String urlPrefix;
        if (rewardData != null) {
            String serverSideProxyURL = AdSettings.getUrlPrefix();
            if (serverSideProxyURL == null || serverSideProxyURL.isEmpty()) {
                urlPrefix = A02(68, 60, 45);
            } else {
                String urlPrefix2 = A02(5, 63, 95);
                urlPrefix = String.format(Locale.US, urlPrefix2, serverSideProxyURL);
            }
            Uri uriA00 = C5.A00(urlPrefix);
            Uri.Builder uriBuilder = new Uri.Builder();
            String urlPrefix3 = uriA00.getScheme();
            uriBuilder.scheme(urlPrefix3);
            String urlPrefix4 = uriA00.getAuthority();
            uriBuilder.authority(urlPrefix4);
            String urlPrefix5 = uriA00.getPath();
            uriBuilder.path(urlPrefix5);
            String urlPrefix6 = uriA00.getQuery();
            uriBuilder.query(urlPrefix6);
            String urlPrefix7 = uriA00.getFragment();
            uriBuilder.fragment(urlPrefix7);
            String serverSideProxyURL2 = A02(134, 4, 110);
            String urlPrefix8 = rewardData.getUserID();
            uriBuilder.appendQueryParameter(serverSideProxyURL2, urlPrefix8);
            String serverSideProxyURL3 = A02(128, 2, 88);
            String urlPrefix9 = rewardData.getCurrency();
            uriBuilder.appendQueryParameter(serverSideProxyURL3, urlPrefix9);
            String urlPrefix10 = A02(130, 4, 99);
            uriBuilder.appendQueryParameter(urlPrefix10, str);
            String urlPrefix11 = A02(0, 5, 88);
            uriBuilder.appendQueryParameter(urlPrefix11, str2);
            String urlPrefix12 = uriBuilder.build().toString();
            return urlPrefix12;
        }
        return null;
    }

    public final void A05() {
        if (!TextUtils.isEmpty(this.A04)) {
            AsyncTaskC0819Jl asyncTaskC0819Jl = new AsyncTaskC0819Jl(this.A01, new HashMap());
            asyncTaskC0819Jl.A07(new C1370cU(this));
            asyncTaskC0819Jl.executeOnExecutor(this.A00, this.A04);
        }
    }
}
