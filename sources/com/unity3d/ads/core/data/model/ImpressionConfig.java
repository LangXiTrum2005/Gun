package com.unity3d.ads.core.data.model;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;

/* JADX INFO: loaded from: classes4.dex */
public final class ImpressionConfig {
    private final String data;

    private /* synthetic */ ImpressionConfig(String str) {
        this.data = str;
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ImpressionConfig m67boximpl(String str) {
        return new ImpressionConfig(str);
    }

    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static String m68constructorimpl(String str) {
        AbstractC2995aW.q(str, "data");
        return str;
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m69equalsimpl(String str, Object obj) {
        return (obj instanceof ImpressionConfig) && AbstractC2995aW.i(str, ((ImpressionConfig) obj).m73unboximpl());
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m70equalsimpl0(String str, String str2) {
        return AbstractC2995aW.i(str, str2);
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m71hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m72toStringimpl(String str) {
        return AbstractC3950lJ.r("ImpressionConfig(data=", str, ')');
    }

    public boolean equals(Object obj) {
        return m69equalsimpl(this.data, obj);
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        return m71hashCodeimpl(this.data);
    }

    public String toString() {
        return m72toStringimpl(this.data);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m73unboximpl() {
        return this.data;
    }
}
