package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public enum InitializationState {
    NOT_INITIALIZED,
    INITIALIZING,
    INITIALIZED,
    FAILED;

    @Override // java.lang.Enum
    public String toString() {
        String string = super.toString();
        Locale locale = Locale.getDefault();
        AbstractC2995aW.p(locale, "getDefault()");
        String lowerCase = string.toLowerCase(locale);
        AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }
}
