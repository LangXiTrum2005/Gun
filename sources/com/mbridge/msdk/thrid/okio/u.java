package com.mbridge.msdk.thrid.okio;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f2018a = Charset.forName(C.UTF8_NAME);

    public static int a(int i) {
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    public static short a(short s) {
        return (short) (((s & 255) << 8) | ((65280 & s) >>> 8));
    }

    public static void a(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sbP = DM.p("size=", j, " offset=");
            sbP.append(j2);
            sbP.append(" byteCount=");
            sbP.append(j3);
            throw new ArrayIndexOutOfBoundsException(sbP.toString());
        }
    }

    public static void a(Throwable th) throws Throwable {
        b(th);
    }

    public static boolean a(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    private static <T extends Throwable> void b(Throwable th) throws Throwable {
        throw th;
    }
}
