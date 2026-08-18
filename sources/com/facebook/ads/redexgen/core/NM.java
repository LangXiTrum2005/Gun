package com.facebook.ads.redexgen.core;

import android.media.AudioAttributes;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NM {
    public final AudioAttributes A00;

    public NM(C1209Zm c1209Zm) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1209Zm.A02).setFlags(c1209Zm.A03).setUsage(c1209Zm.A05);
        if (AbstractC1600gE.A02 >= 29) {
            NK.A00(usage, c1209Zm.A01);
        }
        if (AbstractC1600gE.A02 >= 32) {
            NL.A00(usage, c1209Zm.A04);
        }
        this.A00 = usage.build();
    }
}
