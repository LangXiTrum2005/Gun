package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0I, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0I extends C0M {
    @Override // com.facebook.ads.redexgen.core.C04474g
    public final C04634y A07(View view, C04634y c04634y) {
        WindowInsets result = (WindowInsets) C04634y.A01(c04634y);
        WindowInsets unwrapped = view.dispatchApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C04634y.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C04474g
    public final C04634y A08(View view, C04634y c04634y) {
        WindowInsets result = (WindowInsets) C04634y.A01(c04634y);
        WindowInsets unwrapped = view.onApplyWindowInsets(result);
        if (unwrapped != result) {
            result = new WindowInsets(unwrapped);
        }
        return C04634y.A00(result);
    }

    @Override // com.facebook.ads.redexgen.core.C04474g
    public final void A0A(View view) {
        view.stopNestedScroll();
    }

    @Override // com.facebook.ads.redexgen.core.C04474g
    public final void A0E(View view, final C4R c4r) {
        if (c4r == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.ads.redexgen.X.4f
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    C04634y compatInsets = c4r.ACE(view2, C04634y.A00(windowInsets));
                    return (WindowInsets) C04634y.A01(compatInsets);
                }
            });
        }
    }
}
