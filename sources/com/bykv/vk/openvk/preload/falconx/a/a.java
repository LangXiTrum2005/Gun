package com.bykv.vk.openvk.preload.falconx.a;

import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bykv.vk.openvk.preload.a.b.a.m;
import com.bykv.vk.openvk.preload.a.d.c;
import com.bykv.vk.openvk.preload.a.h;
import com.bykv.vk.openvk.preload.a.i;
import com.bykv.vk.openvk.preload.a.j;
import com.bykv.vk.openvk.preload.a.l;
import com.bykv.vk.openvk.preload.a.o;
import com.bykv.vk.openvk.preload.b.b.b;
import com.bykv.vk.openvk.preload.b.d;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<? extends d<?, ?>>, b> f315a = new HashMap();

    public static WebResourceResponse a(InputStream inputStream, Map<String, String> map) {
        if (inputStream == null) {
            return null;
        }
        try {
            String strReplace = map.get("content-type");
            String[] strArrSplit = new String[0];
            if (TextUtils.isEmpty(strReplace)) {
                strReplace = map.get("Content-Type");
            }
            if (!TextUtils.isEmpty(strReplace) && strReplace != null) {
                strReplace = strReplace.replace(" ", "");
                strArrSplit = strReplace.split(";");
            }
            String str = "";
            String strSubstring = str;
            for (String str2 : strArrSplit) {
                if (!TextUtils.isEmpty(str2)) {
                    int iIndexOf = str2.indexOf("=");
                    if (iIndexOf == -1) {
                        str = str2;
                    } else if (str2.contains("charset")) {
                        strSubstring = str2.substring(iIndexOf + 1);
                    }
                }
            }
            if (strReplace != null ? strReplace.contains("font/ttf") : false) {
                return new WebResourceResponse(str, strSubstring, 200, "OK", map, inputStream);
            }
            WebResourceResponse webResourceResponse = new WebResourceResponse(str, strSubstring, inputStream);
            webResourceResponse.setResponseHeaders(map);
            return webResourceResponse;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(Class<? extends d<?, ?>> cls, com.bykv.vk.openvk.preload.b.b.a aVar) {
        synchronized (this.f315a) {
            try {
                b bVar = this.f315a.get(cls);
                if (bVar == null) {
                    bVar = new b(new com.bykv.vk.openvk.preload.b.b.a[0]);
                    this.f315a.put(cls, bVar);
                }
                bVar.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final com.bykv.vk.openvk.preload.b.b.a a(Class<? extends d<?, ?>> cls) {
        b bVar;
        synchronized (this.f315a) {
            bVar = this.f315a.get(cls);
        }
        return bVar;
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static DateFormat a(int i, int i2) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        if (i == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i == 1) {
            str = "MMMM d, yyyy";
        } else if (i == 2) {
            str = "MMM d, yyyy";
        } else if (i == 3) {
            str = "M/d/yy";
        } else {
            throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i)));
        }
        sb.append(str);
        sb.append(" ");
        if (i2 == 0 || i2 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i2 == 2) {
            str2 = "h:mm:ss a";
        } else if (i2 == 3) {
            str2 = "h:mm a";
        } else {
            throw new IllegalArgumentException("Unknown DateFormat style: ".concat(String.valueOf(i2)));
        }
        sb.append(str2);
        return new SimpleDateFormat(sb.toString(), Locale.US);
    }

    public static h a(com.bykv.vk.openvk.preload.a.d.a aVar) throws l {
        boolean z;
        try {
            try {
                aVar.f();
                z = false;
                try {
                    return m.A.a(aVar);
                } catch (EOFException e) {
                    e = e;
                    if (z) {
                        return j.f300a;
                    }
                    throw new o(e);
                }
            } catch (com.bykv.vk.openvk.preload.a.d.d e2) {
                throw new o(e2);
            } catch (IOException e3) {
                throw new i(e3);
            } catch (NumberFormatException e4) {
                throw new o(e4);
            }
        } catch (EOFException e5) {
            e = e5;
            z = true;
        }
    }

    public static void a(h hVar, c cVar) throws IOException {
        m.A.a(cVar, hVar);
    }
}
