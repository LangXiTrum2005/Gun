package com.facebook.ads.redexgen.core;

import android.view.View;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class M6 extends C1873kk {
    public M6(C04946e c04946e) {
        super(c04946e);
    }

    @Override // com.facebook.ads.redexgen.core.C1873kk, com.facebook.ads.redexgen.core.DR
    public final /* bridge */ /* synthetic */ void A3u(View view, int i, RelativeLayout.LayoutParams layoutParams) {
        super.A3u(view, i, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1873kk, com.facebook.ads.redexgen.core.DR
    public final /* bridge */ /* synthetic */ void A3v(View view, RelativeLayout.LayoutParams layoutParams) {
        super.A3v(view, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1873kk, com.facebook.ads.redexgen.core.DR
    public final void A4Z(String str) {
        super.A4Z(str);
        if (this.A00.get() == null) {
            return;
        }
        String strA03 = IV.A08.A03();
        String rewardedVideoError = IV.A09.A03();
        if (str.equals(strA03)) {
            this.A00.get().finish(11);
        } else if (str.equals(rewardedVideoError)) {
            this.A00.get().finish(12);
        }
    }

    @Override // com.facebook.ads.redexgen.core.C1873kk, com.facebook.ads.redexgen.core.DR
    public final /* bridge */ /* synthetic */ void A4a(String str, C9I c9i) {
        super.A4a(str, c9i);
    }

    @Override // com.facebook.ads.redexgen.core.C1873kk, com.facebook.ads.redexgen.core.DR
    public final /* bridge */ /* synthetic */ void AAd(String str, C04022n c04022n) {
        super.AAd(str, c04022n);
    }

    @Override // com.facebook.ads.redexgen.core.C1873kk, com.facebook.ads.redexgen.core.DR
    public final /* bridge */ /* synthetic */ void ACY(int i) {
        super.ACY(i);
    }
}
