package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0272a> f2380a = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> b = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> c = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> d = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> e = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> f = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> g = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> h = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> i = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, C0272a> j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    public static class C0272a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WindVaneWebView f2381a;
        private boolean b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f2381a = windVaneWebView;
        }

        public WindVaneWebView b() {
            return this.f2381a;
        }

        public boolean c() {
            return this.b;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f2381a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f2381a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public void a(boolean z) {
            this.b = z;
        }
    }

    public static void a(String str, C0272a c0272a, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                h.put(str, c0272a);
                return;
            } else {
                g.put(str, c0272a);
                return;
            }
        }
        if (z2) {
            j.put(str, c0272a);
        } else {
            i.put(str, c0272a);
        }
    }

    public static C0272a b(String str) {
        if (g.containsKey(str)) {
            return g.get(str);
        }
        if (h.containsKey(str)) {
            return h.get(str);
        }
        if (i.containsKey(str)) {
            return i.get(str);
        }
        if (j.containsKey(str)) {
            return j.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0272a> entry : g.entrySet()) {
            if (entry.getKey().contains(str)) {
                g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0272a> entry : h.entrySet()) {
            if (entry.getKey().contains(str)) {
                h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (g.containsKey(str)) {
            g.remove(str);
        }
        if (i.containsKey(str)) {
            i.remove(str);
        }
        if (h.containsKey(str)) {
            h.remove(str);
        }
        if (j.containsKey(str)) {
            j.remove(str);
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    g.remove(str2);
                }
            }
        } else {
            g.clear();
        }
        h.clear();
    }

    public static void b(int i2, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i2 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i2 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0272a> concurrentHashMap = b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0272a> concurrentHashMap2 = e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i2 != 287) {
                if (i2 != 288) {
                    ConcurrentHashMap<String, C0272a> concurrentHashMap3 = f2380a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0272a> concurrentHashMap4 = d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0272a> concurrentHashMap5 = c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0272a> concurrentHashMap6 = f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void a() {
        i.clear();
        j.clear();
    }

    public static C0272a a(int i2, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i2 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i2 != 94) {
                if (i2 != 287) {
                    if (i2 != 288) {
                        ConcurrentHashMap<String, C0272a> concurrentHashMap = f2380a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f2380a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0272a> concurrentHashMap2 = d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0272a> concurrentHashMap3 = c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0272a> concurrentHashMap4 = f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0272a> concurrentHashMap5 = b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0272a> concurrentHashMap6 = e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return e.get(requestIdNotice);
                }
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i2, String str, C0272a c0272a) {
        try {
            if (i2 == 94) {
                if (e == null) {
                    e = new ConcurrentHashMap<>();
                }
                e.put(str, c0272a);
            } else if (i2 == 287) {
                if (f == null) {
                    f = new ConcurrentHashMap<>();
                }
                f.put(str, c0272a);
            } else if (i2 != 288) {
                if (f2380a == null) {
                    f2380a = new ConcurrentHashMap<>();
                }
                f2380a.put(str, c0272a);
            } else {
                if (d == null) {
                    d = new ConcurrentHashMap<>();
                }
                d.put(str, c0272a);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(int i2, String str, C0272a c0272a) {
        try {
            if (i2 == 94) {
                if (b == null) {
                    b = new ConcurrentHashMap<>();
                }
                b.put(str, c0272a);
            } else {
                if (i2 != 287) {
                    return;
                }
                if (c == null) {
                    c = new ConcurrentHashMap<>();
                }
                c.put(str, c0272a);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
        }
    }
}
