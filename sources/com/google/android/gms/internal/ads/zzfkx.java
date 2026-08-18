package com.google.android.gms.internal.ads;

import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;

/* JADX INFO: loaded from: classes3.dex */
public enum zzfkx {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(MRAIDCommunicatorUtil.KEY_VIEWABLE),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zzj;

    zzfkx(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}
