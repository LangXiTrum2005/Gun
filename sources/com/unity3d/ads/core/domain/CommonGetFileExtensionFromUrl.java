package com.unity3d.ads.core.domain;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3089ba0;

/* JADX INFO: loaded from: classes4.dex */
public final class CommonGetFileExtensionFromUrl implements GetFileExtensionFromUrl {
    private final RemoveUrlQuery removeUrlQuery;

    public CommonGetFileExtensionFromUrl(RemoveUrlQuery removeUrlQuery) {
        AbstractC2995aW.q(removeUrlQuery, "removeUrlQuery");
        this.removeUrlQuery = removeUrlQuery;
    }

    public final RemoveUrlQuery getRemoveUrlQuery() {
        return this.removeUrlQuery;
    }

    @Override // com.unity3d.ads.core.domain.GetFileExtensionFromUrl
    public String invoke(String str) {
        AbstractC2995aW.q(str, "url");
        String strInvoke = this.removeUrlQuery.invoke(str);
        if (strInvoke == null) {
            return null;
        }
        String strS0 = AbstractC3089ba0.S0(strInvoke, '/');
        if (!AbstractC3089ba0.k0(strS0, '.')) {
            return null;
        }
        String strS1 = AbstractC3089ba0.S0(strS0, '.');
        if (strS1.length() == 0) {
            return null;
        }
        return strS1;
    }
}
