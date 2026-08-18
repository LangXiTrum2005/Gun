package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes4.dex */
public final class AdData {
    private final String data;

    private /* synthetic */ AdData(String str) {
        this.data = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AdData m53boximpl(String str) {
        return new AdData(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m54constructorimpl(String str) {
        AbstractC2995aW.q(str, "data");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m55equalsimpl(String str, Object obj) {
        return (obj instanceof AdData) && AbstractC2995aW.i(str, ((AdData) obj).m59unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m56equalsimpl0(String str, String str2) {
        return AbstractC2995aW.i(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m57hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m58toStringimpl(String str) {
        return AbstractC3950lJ.r("AdData(data=", str, ')');
    }

    public boolean equals(Object obj) {
        return m55equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m57hashCodeimpl(this.data);
    }

    public String toString() {
        return m58toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m59unboximpl() {
        return this.data;
    }
}
