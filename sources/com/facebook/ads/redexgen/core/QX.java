package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.Timeline;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class QX implements InterfaceC1408d6 {
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    @MetaExoPlayerCustomization("This is no longer set in the constructor")
    public final InterfaceC1430dS A08;
    public final InterfaceC1524ez A09;
    public final int A0A;

    public QX() {
        this(10000, 25000, 25000, 0.75f);
    }

    public QX(int i, int i2, int i3, float f) {
        this(null, -1, i, i2, i3, 1279, 719, f, 0.75f, 2000L, InterfaceC1524ez.A00);
    }

    public QX(InterfaceC1430dS interfaceC1430dS) {
        this(interfaceC1430dS, -1, 10000, 25000, 25000, 1279, 719, 0.75f, 0.75f, 2000L, InterfaceC1524ez.A00);
    }

    public QX(@MetaExoPlayerCustomization("No longer set through factory") InterfaceC1430dS interfaceC1430dS, @MetaExoPlayerCustomization("Non standard variable; used in oculus") int i, @MetaExoPlayerCustomization("Removed from upstream") int i2, int i3, int i4, int i5, int i6, float f, float f2, long j, InterfaceC1524ez interfaceC1524ez) {
        this.A08 = interfaceC1430dS;
        this.A0A = i;
        this.A05 = i2;
        this.A02 = i3;
        this.A06 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = j;
        this.A09 = interfaceC1524ez;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint> */
    private final C03580u A00(C1175Yc c1175Yc, int[] iArr, int i, InterfaceC1430dS interfaceC1430dS, OI<C1390co> oi) {
        return new C03580u(c1175Yc, iArr, i, interfaceC1430dS, this.A0A, this.A05, this.A02, this.A06, this.A04, this.A03, this.A00, this.A01, this.A07, oi, this.A09);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.OI != com.google.common.collect.ImmutableList<com.google.common.collect.ImmutableList<com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection$AdaptationCheckpoint>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1408d6
    public final QD[] A5R(C1407d5[] c1407d5Arr, InterfaceC1430dS interfaceC1430dS, R5 r5, Timeline timeline) {
        QD qdA00;
        OI oiA00 = C03580u.A00(c1407d5Arr);
        QD[] qdArr = new QD[c1407d5Arr.length];
        for (int i = 0; i < c1407d5Arr.length; i++) {
            C1407d5 c1407d5 = c1407d5Arr[i];
            if (c1407d5 != null && c1407d5.A02.length != 0) {
                if (c1407d5.A02.length == 1) {
                    qdA00 = new C03570t(c1407d5.A01, c1407d5.A02[0], c1407d5.A00);
                } else {
                    qdA00 = A00(c1407d5.A01, c1407d5.A02, c1407d5.A00, interfaceC1430dS, (OI) oiA00.get(i));
                }
                qdArr[i] = qdA00;
            }
        }
        return qdArr;
    }
}
