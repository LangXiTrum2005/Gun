package com.unity3d.ads.core.domain;

import android.net.Uri;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;

/* JADX INFO: loaded from: classes4.dex */
public final class AndroidRemoveUrlQuery implements RemoveUrlQuery {
    @Override // com.unity3d.ads.core.domain.RemoveUrlQuery
    public String invoke(String str) {
        AbstractC2995aW.q(str, "url");
        String string = Uri.parse(str).buildUpon().clearQuery().build().toString();
        AbstractC2995aW.p(string, "parse(url).buildUpon().c…uery().build().toString()");
        return string;
    }
}
