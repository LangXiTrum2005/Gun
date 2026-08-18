package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import androidx.core.view.PointerIconCompat;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.RewardData;
import java.util.EnumSet;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class MX extends AbstractC1951m5 {
    public static final C3J A02 = new C1939ls();
    public C1945ly A00;
    public final C1941lu A01;

    public MX(C1941lu c1941lu, String str) {
        super(c1941lu.A05(), str, A02.A5J(c1941lu));
        this.A01 = c1941lu;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1951m5
    public final void A08() {
        if (this.A00 != null) {
            this.A00.destroy();
        }
        super.A00.AIS(C3D.A03);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1951m5
    public final void A09() {
        this.A00 = new C1945ly(this.A01, this, A04());
        this.A00.A0G(this.A01.A0B(), this.A01.A07());
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1951m5
    public final void A0D(boolean z) {
        this.A05.AIt(z);
    }

    public final void A0E(InterstitialAd interstitialAd, EnumSet<CacheFlag> cacheFlags, String str) {
        if (super.A00.A6K()) {
            return;
        }
        this.A01.A0D(interstitialAd);
        if (this.A00 != null) {
            this.A00.A0G(cacheFlags, str);
            return;
        }
        this.A01.A0K(cacheFlags);
        this.A01.A0H(str);
        if (AbstractC05819p.A07(this.A02) && AbstractC05819p.A08(this.A02)) {
            A05();
        } else {
            A09();
        }
    }

    public final void A0F(RewardData rewardData) {
        this.A01.A0F(rewardData);
        if (super.A01.A01) {
            super.A01.A0F(PointerIconCompat.TYPE_ALL_SCROLL, C3Y.A00(new Bundle(), rewardData));
        }
    }

    public final boolean A0G() {
        if (this.A00 != null) {
            return this.A00.A0H();
        }
        return this.A01.A00() > 0 && C0646Cu.A00() > this.A01.A00();
    }

    public final boolean A0H() {
        if (this.A00 != null) {
            return this.A00.A0I();
        }
        return super.A00.A6f() == C3D.A05;
    }

    public final boolean A0I(InterstitialAd interstitialAd, InterstitialAd.InterstitialShowAdConfig interstitialShowAdConfig) {
        if (super.A00.A6L()) {
            return false;
        }
        this.A01.A0D(interstitialAd);
        if (super.A01.A01) {
            A0A(-1);
            return true;
        }
        if (this.A00 != null) {
            return this.A00.A0J();
        }
        this.A00 = new C1945ly(this.A01, this, A04());
        this.A00.A0J();
        return false;
    }
}
