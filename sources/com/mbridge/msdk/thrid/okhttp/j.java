package com.mbridge.msdk.thrid.okhttp;

import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.thrid.okhttp.internal.publicsuffix.PublicSuffixDatabase;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class j {
    private static final Pattern j = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1979a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    private j(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f1979a = str;
        this.b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = z2;
        this.i = z3;
        this.h = z4;
    }

    public String a() {
        return this.f1979a;
    }

    public String b() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return jVar.f1979a.equals(this.f1979a) && jVar.b.equals(this.b) && jVar.d.equals(this.d) && jVar.e.equals(this.e) && jVar.c == this.c && jVar.f == this.f && jVar.g == this.g && jVar.h == this.h && jVar.i == this.i;
    }

    public int hashCode() {
        int iD = DM.d(this.e, DM.d(this.d, DM.d(this.b, DM.d(this.f1979a, 527, 31), 31), 31), 31);
        long j2 = this.c;
        return ((((((((iD + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (!this.f ? 1 : 0)) * 31) + (!this.g ? 1 : 0)) * 31) + (!this.h ? 1 : 0)) * 31) + (!this.i ? 1 : 0);
    }

    public String toString() {
        return a(false);
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.mbridge.msdk.thrid.okhttp.internal.c.d(str);
    }

    private static long b(String str) {
        try {
            long j2 = Long.parseLong(str);
            if (j2 <= 0) {
                return Long.MIN_VALUE;
            }
            return j2;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    @Nullable
    public static j a(q qVar, String str) {
        return a(System.currentTimeMillis(), qVar, str);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c1 A[PHI: r0
  0x00c1: PHI (r0v15 long) = (r0v2 long), (r0v5 long) binds: [B:42:0x00bf, B:53:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    @Nullable
    public static j a(long j2, q qVar, String str) {
        long j3;
        j jVar;
        String str2;
        String strSubstring;
        int length = str.length();
        char c = ';';
        int iA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, length, ';');
        char c2 = '=';
        int iA2 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, 0, iA, '=');
        if (iA2 == iA) {
            return null;
        }
        String strD = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, 0, iA2);
        if (strD.isEmpty() || com.mbridge.msdk.thrid.okhttp.internal.c.c(strD) != -1) {
            return null;
        }
        String strD2 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA2 + 1, iA);
        if (com.mbridge.msdk.thrid.okhttp.internal.c.c(strD2) != -1) {
            return null;
        }
        int i = iA + 1;
        String str3 = null;
        String strA = null;
        long jB = -1;
        long jA = 253402300799999L;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        boolean z4 = false;
        while (i < length) {
            int iA3 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i, length, c);
            int iA4 = com.mbridge.msdk.thrid.okhttp.internal.c.a(str, i, iA3, c2);
            String strD3 = com.mbridge.msdk.thrid.okhttp.internal.c.d(str, i, iA4);
            String strD4 = iA4 < iA3 ? com.mbridge.msdk.thrid.okhttp.internal.c.d(str, iA4 + 1, iA3) : "";
            if (strD3.equalsIgnoreCase("expires")) {
                try {
                    jA = a(strD4, 0, strD4.length());
                    z4 = true;
                } catch (NumberFormatException | IllegalArgumentException unused) {
                }
            } else if (strD3.equalsIgnoreCase("max-age")) {
                jB = b(strD4);
                z4 = true;
            } else if (strD3.equalsIgnoreCase("domain")) {
                strA = a(strD4);
                z3 = false;
            } else if (strD3.equalsIgnoreCase(MBridgeConstans.DYNAMIC_VIEW_WX_PATH)) {
                str3 = strD4;
            } else if (strD3.equalsIgnoreCase("secure")) {
                z = true;
            } else if (strD3.equalsIgnoreCase("httponly")) {
                z2 = true;
            }
            i = iA3 + 1;
            c = ';';
            c2 = '=';
        }
        long j4 = Long.MIN_VALUE;
        if (jB == Long.MIN_VALUE) {
            j3 = j4;
        } else if (jB != -1) {
            j4 = j2 + (jB <= 9223372036854775L ? jB * 1000 : Long.MAX_VALUE);
            if (j4 < j2 || j4 > 253402300799999L) {
                j3 = 253402300799999L;
            } else {
                j3 = j4;
            }
        } else {
            j3 = jA;
        }
        String strG = qVar.g();
        if (strA == null) {
            str2 = strG;
            jVar = null;
        } else {
            if (!a(strG, strA)) {
                return null;
            }
            jVar = null;
            str2 = strA;
        }
        if (strG.length() != str2.length() && PublicSuffixDatabase.a().a(str2) == null) {
            return jVar;
        }
        if (str3 == null || !str3.startsWith("/")) {
            String strC = qVar.c();
            int iLastIndexOf = strC.lastIndexOf(47);
            strSubstring = iLastIndexOf != 0 ? strC.substring(0, iLastIndexOf) : "/";
        } else {
            strSubstring = str3;
        }
        return new j(strD, strD2, j3, str2, strSubstring, z, z2, z3, z4);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0081  */
    private static long a(String str, int i, int i2) {
        int iA = a(str, i, i2, false);
        Matcher matcher = m.matcher(str);
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int iIndexOf = -1;
        int i6 = -1;
        int i7 = -1;
        while (iA < i2) {
            int iA2 = a(str, iA + 1, i2, true);
            matcher.region(iA, iA2);
            if (i4 == -1 && matcher.usePattern(m).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i5 == -1 && matcher.usePattern(l).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
            } else if (iIndexOf == -1) {
                Pattern pattern = k;
                if (matcher.usePattern(pattern).matches()) {
                    iIndexOf = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                } else if (i3 != -1 && matcher.usePattern(j).matches()) {
                    i3 = Integer.parseInt(matcher.group(1));
                }
            } else if (i3 != -1) {
            }
            iA = a(str, iA2 + 1, i2, false);
        }
        if (i3 >= 70 && i3 <= 99) {
            i3 += 1900;
        }
        if (i3 >= 0 && i3 <= 69) {
            i3 += 2000;
        }
        if (i3 < 1601) {
            throw new IllegalArgumentException();
        }
        if (iIndexOf == -1) {
            throw new IllegalArgumentException();
        }
        if (i5 < 1 || i5 > 31) {
            throw new IllegalArgumentException();
        }
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        if (i7 >= 0 && i7 <= 59) {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(com.mbridge.msdk.thrid.okhttp.internal.c.p);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i3);
            gregorianCalendar.set(2, iIndexOf - 1);
            gregorianCalendar.set(5, i5);
            gregorianCalendar.set(11, i4);
            gregorianCalendar.set(12, i6);
            gregorianCalendar.set(13, i7);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || (cCharAt >= '0' && cCharAt <= '9') || ((cCharAt >= 'a' && cCharAt <= 'z') || ((cCharAt >= 'A' && cCharAt <= 'Z') || cCharAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static String a(String str) {
        if (!str.endsWith(".")) {
            if (str.startsWith(".")) {
                str = str.substring(1);
            }
            String strA = com.mbridge.msdk.thrid.okhttp.internal.c.a(str);
            if (strA != null) {
                return strA;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<j> a(q qVar, p pVar) {
        List<String> listC = pVar.c(HttpResponseHeader.SetCookie);
        int size = listC.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            j jVarA = a(qVar, listC.get(i));
            if (jVarA != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(jVarA);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public String a(boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1979a);
        sb.append('=');
        sb.append(this.b);
        if (this.h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(com.mbridge.msdk.thrid.okhttp.internal.http.d.a(new Date(this.c)));
            }
        }
        if (!this.i) {
            sb.append("; domain=");
            if (z) {
                sb.append(".");
            }
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f) {
            sb.append("; secure");
        }
        if (this.g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
