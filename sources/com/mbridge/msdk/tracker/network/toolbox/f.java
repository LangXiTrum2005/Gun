package com.mbridge.msdk.tracker.network.toolbox;

import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.mbridge.msdk.tracker.network.e0;
import com.mbridge.msdk.tracker.network.r;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static com.mbridge.msdk.tracker.network.b.a a(r rVar) {
        boolean z;
        long j;
        long j2;
        long j3;
        long j4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        Map<String, String> map = rVar.c;
        if (map == null) {
            return null;
        }
        String str = map.get("Date");
        long jB = str != null ? b(str) : 0L;
        String str2 = map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] strArrSplit = str2.split(",", 0);
            z = false;
            j = 0;
            j2 = 0;
            while (i < strArrSplit.length) {
                String strTrim = strArrSplit[i].trim();
                if (strTrim.equals("no-cache") || strTrim.equals("no-store")) {
                    return null;
                }
                if (strTrim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(strTrim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (strTrim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(strTrim.substring(23));
                } else if (strTrim.equals("must-revalidate") || strTrim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            i = 1;
        } else {
            z = false;
            j = 0;
            j2 = 0;
        }
        String str3 = map.get(HttpResponseHeader.Expires);
        long jB2 = str3 != null ? b(str3) : 0L;
        String str4 = map.get(HttpResponseHeader.LastModified);
        long jB3 = str4 != null ? b(str4) : 0L;
        String str5 = map.get("ETag");
        if (i != 0) {
            j4 = jCurrentTimeMillis + (j * 1000);
            if (z) {
                j3 = j4;
            } else {
                Long.signum(j2);
                j3 = j4;
                j4 = (j2 * 1000) + j4;
            }
        } else {
            j3 = 0;
            if (jB <= 0 || jB2 < jB) {
                j4 = 0;
            } else {
                j4 = jCurrentTimeMillis + (jB2 - jB);
                j3 = j4;
            }
        }
        com.mbridge.msdk.tracker.network.b.a aVar = new com.mbridge.msdk.tracker.network.b.a();
        aVar.f2039a = rVar.b;
        aVar.b = str5;
        aVar.f = j3;
        aVar.e = j4;
        aVar.c = jB;
        aVar.d = jB3;
        aVar.g = map;
        aVar.h = rVar.d;
        return aVar;
    }

    public static long b(String str) {
        try {
            Date date = a("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str);
            if (date != null) {
                return date.getTime();
            }
            return 0L;
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                e0.d("Unable to parse dateStr: %s, falling back to 0", str);
            } else {
                e0.a(e, "Unable to parse dateStr: %s, falling back to 0", str);
            }
            return 0L;
        }
    }

    public static String a(long j) {
        return a("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat a(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public static String a(Map<String, String> map, String str) {
        String str2;
        if (map != null && (str2 = map.get("Content-Type")) != null) {
            String[] strArrSplit = str2.split(";", 0);
            for (int i = 1; i < strArrSplit.length; i++) {
                String[] strArrSplit2 = strArrSplit[i].trim().split("=", 0);
                if (strArrSplit2.length == 2 && strArrSplit2[0].equals("charset")) {
                    return strArrSplit2[1];
                }
            }
        }
        return str;
    }

    public static String a(Map<String, String> map) {
        return a(map, "ISO-8859-1");
    }

    public static List<com.mbridge.msdk.tracker.network.h> a(List<com.mbridge.msdk.tracker.network.h> list, com.mbridge.msdk.tracker.network.b.a aVar) {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator<com.mbridge.msdk.tracker.network.h> it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().a());
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List<com.mbridge.msdk.tracker.network.h> list2 = aVar.h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (com.mbridge.msdk.tracker.network.h hVar : aVar.h) {
                    if (!treeSet.contains(hVar.a())) {
                        arrayList.add(hVar);
                    }
                }
            }
        } else if (!aVar.g.isEmpty()) {
            for (Map.Entry<String, String> entry : aVar.g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.h(entry.getKey(), entry.getValue()));
                }
            }
        }
        return arrayList;
    }

    public static Map<String, String> a(com.mbridge.msdk.tracker.network.b.a aVar) {
        if (aVar == null) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap();
        String str = aVar.b;
        if (str != null) {
            map.put(HttpRequestHeader.IfNoneMatch, str);
        }
        long j = aVar.d;
        if (j > 0) {
            map.put(HttpRequestHeader.IfModifiedSince, a(j));
        }
        return map;
    }
}
