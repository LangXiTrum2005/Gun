package com.mbridge.msdk.mbbid.out;

/* JADX INFO: loaded from: classes2.dex */
public class BidLossCode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1411a;

    private BidLossCode(int i) {
        f1411a = i;
    }

    public static BidLossCode bidPriceNotHighest() {
        return new BidLossCode(102);
    }

    public static BidLossCode bidTimeOut() {
        return new BidLossCode(2);
    }

    public static BidLossCode bidWinButNotShow() {
        return new BidLossCode(3001);
    }

    public int getCurrentCode() {
        return f1411a;
    }
}
