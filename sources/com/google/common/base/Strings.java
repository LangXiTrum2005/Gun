package com.google.common.base;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: assets/audience_network.dex */
@ElementTypesAreNonnullByDefault
public final class Strings {
    public static byte[] A00;
    public static String[] A01 = {"", "rJg0GTHRX", "K9dQxfkFvyPrqanCyvVi9t8TsdGmyNgC", "tUuj0V7XDkeAi6SkgPTUgMEzqoPOG2wI", "s5Ev4BEaYYaheBbHJPARkFomt6p83FKm", "U0fqfbzQ6IMhOxnuinQg0kR", "WEAQUpFs2V4MiUsuqBnPNaxCCDrbqZTD", "9mERPiqnqMQrbOPuWUaYAoq2giX9Yyaq"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 2);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{124, 7, 85, 1, 29, 7, cw.n, 2, 85, 20, 66, 108, 11, 38, 46, 33, 39, 48, 31, 25, 109, 42, 49, 40, 40, 74, 70, 18, 122, 48, cw.k, 22, cw.n, 5, 1, 28, 26, 27, 85, 17, 0, 7, 28, 27, 18, 85, 25, cw.n, 27, 28, cw.n, 27, 1, 51, 26, 7, 24, 20, 1, 85, 19, 26, 7, 85, 38, 42, 40, 107, 34, 42, 42, 34, 41, 32, 107, 38, 42, 40, 40, 42, 43, 107, 39, 36, 54, 32, 107, 22, 49, 55, 44, 43, 34, 54, 59, 32, 57, 57};
    }

    static {
        A03();
    }

    public static String A01(@CheckForNull Object o) {
        if (o == null) {
            return A00(94, 4, 87);
        }
        try {
            return o.toString();
        } catch (Exception e) {
            String str = o.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(o));
            Logger.getLogger(A00(64, 30, 71)).log(Level.WARNING, A00(29, 35, EnumC4719u30.JSON_ENCODE_ERROR_VALUE) + str, (Throwable) e);
            return A00(27, 1, 44) + str + A00(2, 7, EnumC4719u30.JSON_ENCODE_ERROR_VALUE) + e.getClass().getName() + A00(28, 1, 70);
        }
    }

    public static String A02(@CheckForNull String template, @CheckForNull Object... args) {
        int i;
        String strValueOf = String.valueOf(template);
        if (args == null) {
            args = new Object[]{A00(11, 14, 70)};
        } else {
            for (int templateStart = 0; templateStart < i; templateStart++) {
                args[templateStart] = A01(args[templateStart]);
            }
        }
        StringBuilder sb = new StringBuilder(strValueOf.length() + (args.length * 16));
        int i2 = 0;
        int i3 = 0;
        while (i3 < args.length && (i = strValueOf.indexOf(A00(9, 2, 51), i2)) != -1) {
            sb.append((CharSequence) strValueOf, i2, i);
            int templateStart2 = i3 + 1;
            sb.append(args[i3]);
            i2 = i + 2;
            i3 = templateStart2;
        }
        sb.append((CharSequence) strValueOf, i2, strValueOf.length());
        if (i3 < args.length) {
            sb.append(A00(0, 2, 94));
            int i4 = i3 + 1;
            sb.append(args[i3]);
            while (i4 < args.length) {
                sb.append(A00(25, 2, 100));
                int templateStart3 = i4 + 1;
                sb.append(args[i4]);
                i4 = templateStart3;
            }
            sb.append(']');
        }
        String string = sb.toString();
        String[] strArr = A01;
        String str = strArr[6];
        String str2 = strArr[2];
        int templateStart4 = str.charAt(10);
        int i5 = str2.charAt(10);
        if (templateStart4 == i5) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[3] = "Qm2mYSTY5Rq3J9usgP1HZ6PJLyEDSebu";
        strArr2[4] = "9oyFi5AVRUYlh10JePir3xWfNUiO2b4f";
        return string;
    }
}
