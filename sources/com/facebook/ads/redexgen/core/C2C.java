package com.facebook.ads.redexgen.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.umeng.analytics.pro.cw;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2C, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2C extends BroadcastReceiver {
    public static byte[] A04;
    public InterfaceC2016n9 A00;
    public C2B A01;
    public C1828k1 A02;
    public String A03;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{120, 66, 78, 76, cw.m, 71, 64, 66, 68, 67, 78, 78, 74, cw.m, 64, 69, 82, cw.m, 67, 64, 79, 79, 68, 83, cw.m, 66, 77, 72, 66, 74, 68, 69};
    }

    public C2C(C1828k1 c1828k1, String str, InterfaceC2016n9 interfaceC2016n9, C2B c2b) {
        this.A02 = c1828k1;
        this.A03 = str;
        this.A01 = c2b;
        this.A00 = interfaceC2016n9;
    }

    public final void A02() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(A00(1, 31, 48) + A00(0, 1, 83) + this.A03);
        AnonymousClass42.A00(this.A02).A06(this, intentFilter);
    }

    public final void A03() {
        AnonymousClass42.A00(this.A02).A05(this);
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        String intentAction = A00(0, 1, 83);
        String[] parts = action.split(intentAction);
        String str = parts[0];
        if (str == null) {
            return;
        }
        String intentAction2 = A00(1, 31, 48);
        if (intentAction2.equals(str)) {
            this.A01.ACU(this.A00);
        }
    }
}
