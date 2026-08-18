package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class R1 implements InterfaceC1309bV, InterfaceC1310bW {
    public final int A00;
    public final /* synthetic */ C05237h A01;

    public R1(C05237h c05237h, int i) {
        this.A01 = c05237h;
        this.A00 = i;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1310bW
    @MetaExoPlayerCustomization("Added in D21840558 for FBVP")
    public final long A7z() {
        return this.A01.A0L[this.A00].A0S();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1309bV
    public final boolean AAT() {
        return this.A01.A0f(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1309bV
    public final void ABm() throws IOException {
        this.A01.A0d(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1309bV
    public final int AGX(P6 p6, C1143Ww c1143Ww, int i) {
        return this.A01.A0Y(this.A00, p6, c1143Ww, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1309bV
    public final int AJ8(long j) {
        return this.A01.A0X(this.A00, j);
    }
}
