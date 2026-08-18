package com.facebook.ads.redexgen.core;

import android.net.Uri;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class WN implements InterfaceC1086Uo {
    public final byte[] A00 = new byte[4096];

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final /* synthetic */ int AHv(O9 o9, int i, boolean z) {
        return AbstractC1084Ul.A00(this, o9, i, z);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final /* synthetic */ void AHx(C1576fq c1576fq, int i) {
        AbstractC1084Ul.A01(this, c1576fq, i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final void A6U(ZM zm) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final int AHw(O9 o9, int i, boolean z, int i2) throws IOException {
        int bytesSkipped = o9.read(this.A00, 0, Math.min(this.A00.length, i));
        if (bytesSkipped == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return bytesSkipped;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final void AHy(C1576fq c1576fq, int i, int i2) {
        c1576fq.A0g(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    public final void AI0(long j, int i, int i2, int i3, C1085Um c1085Um) {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1086Uo
    @MetaExoPlayerCustomization("New API added for Meta")
    public final void AJk(Uri uri) {
    }
}
