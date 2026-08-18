package com.mbridge.msdk.thrid.okhttp;

import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f1985a;

    public p(a aVar) {
        List<String> list = aVar.f1986a;
        this.f1985a = (String[]) list.toArray(new String[list.size()]);
    }

    public String a(int i) {
        return this.f1985a[i * 2];
    }

    @Nullable
    public String b(String str) {
        return a(this.f1985a, str);
    }

    public List<String> c(String str) {
        int iB = b();
        ArrayList arrayList = null;
        for (int i = 0; i < iB; i++) {
            if (str.equalsIgnoreCase(a(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(b(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof p) && Arrays.equals(((p) obj).f1985a, this.f1985a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f1985a);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int iB = b();
        for (int i = 0; i < iB; i++) {
            sb.append(a(i));
            sb.append(": ");
            sb.append(b(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<String> f1986a = new ArrayList(20);

        public a a(String str) {
            int iIndexOf = str.indexOf(":", 1);
            if (iIndexOf != -1) {
                return b(str.substring(0, iIndexOf), str.substring(iIndexOf + 1));
            }
            return str.startsWith(":") ? b("", str.substring(1)) : b("", str);
        }

        public a b(String str, String str2) {
            this.f1986a.add(str);
            this.f1986a.add(str2.trim());
            return this;
        }

        public a c(String str, String str2) {
            p.a(str);
            p.a(str2, str);
            b(str);
            b(str, str2);
            return this;
        }

        public a b(String str) {
            int i = 0;
            while (i < this.f1986a.size()) {
                if (str.equalsIgnoreCase(this.f1986a.get(i))) {
                    this.f1986a.remove(i);
                    this.f1986a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a a(String str, String str2) {
            p.a(str);
            p.a(str2, str);
            return b(str, str2);
        }

        public p a() {
            return new p(this);
        }
    }

    public a a() {
        a aVar = new a();
        Collections.addAll(aVar.f1986a, this.f1985a);
        return aVar;
    }

    public int b() {
        return this.f1985a.length / 2;
    }

    public String b(int i) {
        return this.f1985a[(i * 2) + 1];
    }

    private static String a(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static void a(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                int length = str.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt <= ' ' || cCharAt >= 127) {
                        throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str));
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        throw new NullPointerException("name == null");
    }

    public static void a(String str, String str2) {
        if (str != null) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if ((cCharAt <= 31 && cCharAt != '\t') || cCharAt >= 127) {
                    throw new IllegalArgumentException(com.mbridge.msdk.thrid.okhttp.internal.c.a("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(cCharAt), Integer.valueOf(i), str2, str));
                }
            }
            return;
        }
        throw new NullPointerException(DM.B("value for name ", str2, " == null"));
    }
}
