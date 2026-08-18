package com.google.android.exoplayer2.extractor;

import android.net.Uri;
import com.badlogic.gdx.Input;
import com.facebook.ads.redexgen.core.C1020Ru;
import com.facebook.ads.redexgen.core.C1050Sy;
import com.facebook.ads.redexgen.core.C1052Ta;
import com.facebook.ads.redexgen.core.C1053Tb;
import com.facebook.ads.redexgen.core.C1065To;
import com.facebook.ads.redexgen.core.C1114Vs;
import com.facebook.ads.redexgen.core.C1590g4;
import com.facebook.ads.redexgen.core.MetaExoPlayerCustomizedCollections;
import com.facebook.ads.redexgen.core.P0;
import com.facebook.ads.redexgen.core.S6;
import com.facebook.ads.redexgen.core.SV;
import com.facebook.ads.redexgen.core.T0;
import com.facebook.ads.redexgen.core.T3;
import com.facebook.ads.redexgen.core.T6;
import com.facebook.ads.redexgen.core.TU;
import com.facebook.ads.redexgen.core.UF;
import com.facebook.ads.redexgen.core.UG;
import com.facebook.ads.redexgen.core.UK;
import com.facebook.ads.redexgen.core.UO;
import com.facebook.ads.redexgen.core.VC;
import com.facebook.ads.redexgen.core.VW;
import com.facebook.ads.redexgen.core.ZM;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DefaultExtractorsFactory implements UO {
    public static byte[] A0D;
    public static String[] A0E = {"ClrkhcWADC8kVOqRD8woyHnTUaZ8Zlx0", "hwvlnLov7mEUxeCjcn213RSGDt", "", "4BcCja8PeJXtbv3jh", "YDrqYimlE3", "FRRbwYAqxkuGOgLuyhimO8EU4cJHuoW", "k3q2lY", "SHo"};
    public static final UG A0F;
    public static final UG A0G;
    public static final int[] A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08 = 1;
    public int A09 = 112800;

    @MetaExoPlayerCustomization("Replaces ImmutableList with List")
    public List<ZM> A0A = MetaExoPlayerCustomizedCollections.A03(new ZM[0]);
    public boolean A0B;
    public boolean A0C;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A0D = new byte[]{22, 34, 32, -31, 26, 34, 34, 26, 31, 24, -31, 20, 33, 23, 37, 34, 28, 23, -31, 24, 43, 34, 35, 31, 20, 44, 24, 37, -27, -31, 23, 24, 22, 34, 23, 24, 37, -31, 32, 28, 23, 28, -31, 0, 28, 23, 28, -8, 43, 39, 37, 20, 22, 39, 34, 37, -6, 6, 4, -59, -2, 6, 6, -2, 3, -4, -59, -8, 5, -5, 9, 6, 0, -5, -59, -4, cw.m, 6, 7, 3, -8, cw.n, -4, 9, -55, -59, -4, cw.m, 11, -59, -3, 3, -8, -6, -59, -35, 3, -8, -6, -36, cw.m, 11, 9, -8, -6, 11, 6, 9, -33, -21, -23, -86, -29, -21, -21, -29, -24, -31, -86, -35, -22, -32, -18, -21, -27, -32, -86, -31, -12, -21, -20, -24, -35, -11, -31, -18, -82, -86, -31, -12, -16, -86, -30, -24, -35, -33, -86, -62, -24, -35, -33, -56, -27, -34, -18, -35, -18, -11, -68, -58, -108, -55, -76, -68, -65, -76, -75, -65, -72};
    }

    static {
        A05();
        A0H = new int[]{5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};
        A0F = new UG(new UF() { // from class: com.facebook.ads.redexgen.X.WU
            @Override // com.facebook.ads.redexgen.core.UF
            public final Constructor A7H() {
                return DefaultExtractorsFactory.A01();
            }
        });
        A0G = new UG(new UF() { // from class: com.facebook.ads.redexgen.X.WQ
            @Override // com.facebook.ads.redexgen.core.UF
            public final Constructor A7H() {
                return DefaultExtractorsFactory.A02();
            }
        });
    }

    @MetaExoPlayerCustomization("Replaces ImmutableList.of with MetaExoPlayerCustomizedCollections")
    public DefaultExtractorsFactory() {
    }

    public static Constructor<? extends UK> A01() throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        boolean isFlacNativeLibraryAvailable = Boolean.TRUE.equals(Class.forName(A00(108, 50, 63)).getMethod(A00(Input.Keys.NUMPAD_DOT, 11, 22), new Class[0]).invoke(null, new Object[0]));
        if (!isFlacNativeLibraryAvailable) {
            return null;
        }
        return Class.forName(A00(56, 52, 90)).asSubclass(UK.class).getConstructor(Integer.TYPE);
    }

    public static Constructor<? extends UK> A02() throws NoSuchMethodException, ClassNotFoundException {
        return Class.forName(A00(0, 56, EnumC4719u30.PROTOBUF_SERIALIZATION_ERROR_VALUE)).asSubclass(UK.class).getConstructor(new Class[0]);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    @MetaExoPlayerCustomization("Removed AVI and JPEG extractors")
    private void A06(int i, List<UK> list) {
        int i2 = 2;
        int i3 = 1;
        switch (i) {
            case 0:
                list.add(new T6());
                return;
            case 1:
                list.add(new T3());
                return;
            case 2:
                int i4 = (this.A0C ? 1 : 0) | this.A00;
                if (!this.A0B) {
                    i2 = 0;
                }
                list.add(new T0(i2 | i4));
                return;
            case 3:
                int i5 = this.A01;
                if (A0E[6].length() != 6) {
                    A0E[1] = "x";
                    if (!this.A0C) {
                        i3 = 0;
                    }
                } else {
                    A0E[1] = "q4R";
                    if (!this.A0C) {
                        i3 = 0;
                    }
                }
                int i6 = i3 | i5;
                if (!this.A0B) {
                    i2 = 0;
                }
                list.add(new C1114Vs(i2 | i6));
                return;
            case 4:
                UG ug = A0F;
                if (A0E[2].length() == 0) {
                    A0E[5] = "IgXmtDHExDsQ3gvh";
                    UK flacExtractor = ug.A03(Integer.valueOf(this.A02));
                    if (flacExtractor != null) {
                        list.add(flacExtractor);
                        return;
                    } else {
                        UK flacExtractor2 = new VW(this.A02);
                        list.add(flacExtractor2);
                        return;
                    }
                }
                break;
            case 5:
                UK flacExtractor3 = new VC();
                list.add(flacExtractor3);
                return;
            case 6:
                UK flacExtractor4 = new MatroskaExtractor(this.A04);
                list.add(flacExtractor4);
                return;
            case 7:
                int i7 = (this.A0C ? 1 : 0) | this.A05;
                boolean z = this.A0B;
                if (A0E[1].length() != 32) {
                    A0E[1] = "7OJzYywc5A175";
                    if (!z) {
                        i2 = 0;
                    }
                    list.add(new C1065To(i2 | i7));
                    return;
                }
                break;
            case 8:
                list.add(new C1052Ta().A01(this.A03));
                list.add(new C1053Tb(this.A06));
                return;
            case 9:
                list.add(new TU());
                return;
            case 10:
                list.add(new SV());
                return;
            case 11:
                list.add(new S6(this.A08, new C1590g4(0L), new C1050Sy(this.A07, this.A0A), this.A09));
                return;
            case 12:
                list.add(new C1020Ru());
                return;
            case 13:
            case 14:
            default:
                return;
            case 15:
                UK midiExtractor = A0G.A03(new Object[0]);
                if (midiExtractor == null) {
                    return;
                }
                list.add(midiExtractor);
                return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final synchronized UK[] A5D() {
        return A5E(Uri.EMPTY, new HashMap());
    }

    @Override // com.facebook.ads.redexgen.core.UO
    public final synchronized UK[] A5E(Uri uri, Map<String, List<String>> responseHeaders) {
        List<Extractor> extractors;
        extractors = new ArrayList<>(A0H.length);
        int fileType = P0.A02(responseHeaders);
        if (fileType != -1) {
            A06(fileType, extractors);
        }
        int iA00 = P0.A00(uri);
        if (iA00 != -1 && iA00 != fileType) {
            A06(iA00, extractors);
        }
        for (int responseHeadersInferredFileType : A0H) {
            if (responseHeadersInferredFileType != fileType && responseHeadersInferredFileType != iA00) {
                A06(responseHeadersInferredFileType, extractors);
            }
        }
        return (UK[]) extractors.toArray(new UK[extractors.size()]);
    }
}
