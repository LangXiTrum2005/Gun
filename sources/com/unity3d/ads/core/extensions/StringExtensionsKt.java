package com.unity3d.ads.core.extensions;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2307Be;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2995aW;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3971lc;
import java.net.URLConnection;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class StringExtensionsKt {
    public static final String getSHA256Hash(String str) {
        AbstractC2995aW.q(str, "<this>");
        byte[] bytes = str.getBytes(AbstractC2307Be.f2881a);
        AbstractC2995aW.p(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrCopyOf = Arrays.copyOf(bytes, bytes.length);
        C3971lc c3971lc = C3971lc.d;
        AbstractC2995aW.q(bArrCopyOf, "data");
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, bArrCopyOf.length);
        AbstractC2995aW.p(bArrCopyOf2, "java.util.Arrays.copyOf(this, size)");
        String strD = new C3971lc(bArrCopyOf2).b("SHA-256").d();
        AbstractC2995aW.p(strD, "bytes.sha256().hex()");
        return strD;
    }

    public static final String guessMimeType(String str) {
        AbstractC2995aW.q(str, "<this>");
        String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(str);
        AbstractC2995aW.p(strGuessContentTypeFromName, "guessMimeType");
        return strGuessContentTypeFromName;
    }
}
