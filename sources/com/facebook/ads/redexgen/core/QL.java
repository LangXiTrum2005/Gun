package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.umeng.analytics.pro.bc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class QL extends C0997Qx {
    public static String[] A0G = {"MEP0RusGJ", "aisi", "T", "YG0qp9u1qYoiRP5KHMpp78TBUCMtUf0J", "hLF1x9dYc", "pBfQRGaAvNTHENySPCl5ogMBSjCPbpOz", "hQHGakiMTJn5HrhUKsneJmP8PWCXiAuF", "VzzbUY8xO1BM674pyHReQ6MrMnxgDaEs"};
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    @MetaExoPlayerCustomization("D25277746 - If all qualities are filtered out, do not use a fixed selection but differ to adaptive track selection in hero.")
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final SparseArray<Map<C0992Qs, QH>> A0E;
    public final SparseBooleanArray A0F;

    @Deprecated
    public QL() {
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A04();
    }

    public QL(Context context) {
        super(context);
        this.A0E = new SparseArray<>();
        this.A0F = new SparseBooleanArray();
        A04();
    }

    @MetaExoPlayerCustomization("Modified to support setExceedRendererCapabilitiesIfAllFilteredOut")
    public QL(Bundle bundle) {
        super(bundle);
        A04();
        C04855v c04855v = C04855v.A0J;
        A1C(bundle.getBoolean(C04855v.A0D(), c04855v.A0C));
        A16(bundle.getBoolean(C04855v.A0Q, c04855v.A06));
        A17(bundle.getBoolean(C04855v.A0R, c04855v.A07));
        A15(bundle.getBoolean(C04855v.A0P, c04855v.A05));
        A19(bundle.getBoolean(C04855v.A0T, c04855v.A09));
        A12(bundle.getBoolean(C04855v.A0M, c04855v.A02));
        A13(bundle.getBoolean(C04855v.A0N, c04855v.A03));
        A10(bundle.getBoolean(C04855v.A0K, c04855v.A00));
        A11(bundle.getBoolean(C04855v.A0L, c04855v.A01));
        A18(bundle.getBoolean(C04855v.A0S, c04855v.A08));
        A1B(bundle.getBoolean(C04855v.A0V, c04855v.A0B));
        A1D(bundle.getBoolean(C04855v.A0b, c04855v.A0D));
        A14(bundle.getBoolean(C04855v.A0O, c04855v.A04));
        A1A(bundle.getBoolean(C04855v.A09(), c04855v.A0A));
        this.A0E = new SparseArray<>();
        A05(bundle);
        this.A0F = A03(bundle.getIntArray(C04855v.A0X));
    }

    @MetaExoPlayerCustomization("To support exceedRendererCapabilitiesIfAllFilteredOut")
    public QL(C04855v c04855v) {
        super(c04855v);
        this.A0C = c04855v.A0C;
        this.A06 = c04855v.A06;
        this.A07 = c04855v.A07;
        this.A05 = c04855v.A05;
        this.A09 = c04855v.A09;
        this.A02 = c04855v.A02;
        this.A03 = c04855v.A03;
        this.A00 = c04855v.A00;
        this.A01 = c04855v.A01;
        this.A08 = c04855v.A08;
        this.A0B = c04855v.A0B;
        this.A0D = c04855v.A0D;
        this.A04 = c04855v.A04;
        this.A0A = c04855v.A0A;
        this.A0E = A00(c04855v.A0E);
        this.A0F = c04855v.A0F.clone();
    }

    public static SparseArray<Map<C0992Qs, QH>> A00(SparseArray<Map<C0992Qs, QH>> sparseArray) {
        SparseArray<Map<C0992Qs, QH>> sparseArray2 = new SparseArray<>();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
        }
        return sparseArray2;
    }

    private SparseBooleanArray A03(int[] iArr) {
        if (iArr == null) {
            return new SparseBooleanArray();
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
        for (int i : iArr) {
            sparseBooleanArray.append(i, true);
        }
        return sparseBooleanArray;
    }

    @MetaExoPlayerCustomization("To support setting exceedRendererCapabilitiesIfAllFilteredOut")
    private void A04() {
        this.A0C = true;
        this.A06 = false;
        this.A07 = true;
        this.A05 = false;
        this.A09 = true;
        this.A02 = false;
        this.A03 = false;
        this.A00 = false;
        this.A01 = false;
        this.A08 = true;
        this.A0B = true;
        this.A0D = false;
        this.A04 = true;
        this.A0A = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(Bundle bundle) {
        OI oiA01;
        SparseArray<DefaultTrackSelector.SelectionOverride> selectionOverrides;
        int[] intArray = bundle.getIntArray(C04855v.A0Z);
        ArrayList<Bundle> trackGroupArrayBundles = bundle.getParcelableArrayList(C04855v.A0a);
        if (trackGroupArrayBundles == null) {
            oiA01 = OI.A03();
        } else {
            oiA01 = C1523ey.A01(C0992Qs.A05, trackGroupArrayBundles);
        }
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(C04855v.A0Y);
        if (sparseParcelableArray == null) {
            selectionOverrides = new SparseArray<>();
        } else {
            selectionOverrides = C1523ey.A00(QH.A05, sparseParcelableArray);
        }
        if (intArray == null || intArray.length != oiA01.size()) {
            return;
        }
        for (int i = 0; i < intArray.length; i++) {
            A0w(intArray[i], (C0992Qs) oiA01.get(i), (QH) selectionOverrides.get(i));
        }
    }

    @Override // com.facebook.ads.redexgen.core.C0997Qx
    /* JADX INFO: renamed from: A0v, reason: merged with bridge method [inline-methods] */
    public final QL A0q(int i, int i2, boolean z) {
        super.A0q(i, i2, z);
        return this;
    }

    @Deprecated
    public final QL A0w(int i, C0992Qs c0992Qs, QH qh) {
        Map<C0992Qs, QH> map = this.A0E.get(i);
        if (map == null) {
            map = new HashMap<>();
            this.A0E.put(i, map);
        }
        if (map.containsKey(c0992Qs)) {
            boolean zA1E = AbstractC1600gE.A1E(map.get(c0992Qs), qh);
            if (A0G[6].charAt(5) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[0] = "W6btIdXSM";
            strArr[2] = bc.aM;
            if (zA1E) {
                return this;
            }
        }
        map.put(c0992Qs, qh);
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C0997Qx
    /* JADX INFO: renamed from: A0x, reason: merged with bridge method [inline-methods] */
    public final QL A0r(Context context) {
        super.A0r(context);
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C0997Qx
    /* JADX INFO: renamed from: A0y, reason: merged with bridge method [inline-methods] */
    public final QL A0s(Context context, boolean z) {
        super.A0s(context, z);
        return this;
    }

    public final QL A0z(YN yn) {
        super.A0t(yn);
        return this;
    }

    public final QL A10(boolean z) {
        this.A00 = z;
        return this;
    }

    public final QL A11(boolean z) {
        this.A01 = z;
        return this;
    }

    public final QL A12(boolean z) {
        this.A02 = z;
        return this;
    }

    public final QL A13(boolean z) {
        this.A03 = z;
        return this;
    }

    public final QL A14(boolean z) {
        this.A04 = z;
        return this;
    }

    public final QL A15(boolean z) {
        this.A05 = z;
        return this;
    }

    public final QL A16(boolean z) {
        this.A06 = z;
        return this;
    }

    public final QL A17(boolean z) {
        this.A07 = z;
        return this;
    }

    public final QL A18(boolean z) {
        this.A08 = z;
        return this;
    }

    public final QL A19(boolean z) {
        this.A09 = z;
        return this;
    }

    @MetaExoPlayerCustomization("D25277746")
    public final QL A1A(boolean z) {
        this.A0A = z;
        return this;
    }

    public final QL A1B(boolean z) {
        this.A0B = z;
        return this;
    }

    public final QL A1C(boolean z) {
        this.A0C = z;
        return this;
    }

    public final QL A1D(boolean z) {
        this.A0D = z;
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.C0997Qx
    /* JADX INFO: renamed from: A1E, reason: merged with bridge method [inline-methods] */
    public final C04855v A0u() {
        return new C04855v(this);
    }
}
