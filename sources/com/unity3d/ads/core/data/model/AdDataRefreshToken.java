package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes4.dex */
public final class AdDataRefreshToken {
    private final String data;

    private /* synthetic */ AdDataRefreshToken(String str) {
        this.data = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdDataRefreshToken m60boximpl(String str) {
        return new AdDataRefreshToken(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m61constructorimpl(String str) {
        AbstractC2995aW.q(str, "data");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m62equalsimpl(String str, Object obj) {
        return (obj instanceof AdDataRefreshToken) && AbstractC2995aW.i(str, ((AdDataRefreshToken) obj).m66unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m63equalsimpl0(String str, String str2) {
        return AbstractC2995aW.i(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m64hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m65toStringimpl(String str) {
        return AbstractC3950lJ.r("AdDataRefreshToken(data=", str, ')');
    }

    public boolean equals(Object obj) {
        return m62equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m64hashCodeimpl(this.data);
    }

    public String toString() {
        return m65toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m66unboximpl() {
        return this.data;
    }
}
