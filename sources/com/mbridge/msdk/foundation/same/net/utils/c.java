package com.mbridge.msdk.foundation.same.net.utils;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.e;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbbid.out.BidResponsed;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f1212a;
    private int b;
    private ConcurrentHashMap<String, b> c;
    private ArrayList<Integer> d;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1213a;
        public String b;
        public long c;

        public b(long j, int i, String str) {
            this.c = j;
            this.f1213a = i;
            this.b = str;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.utils.c$c, reason: collision with other inner class name */
    public static class C0171c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final c f1214a = new c();
    }

    private List<Integer> a() {
        return Arrays.asList(-1, -10, -1201, -1202, -1203, -1205, -1206, -1208, -1301, -1302, -1305, -1306, -1307, -1915, 10602, 10603, 10604, 10609, 10610, 10616);
    }

    public static c b() {
        return C0171c.f1214a;
    }

    private c() {
        this.f1212a = "IDErrorUtil";
        this.c = new ConcurrentHashMap<>();
        this.d = new ArrayList<>();
        g gVarF = AbstractC3888ke0.f(h.b());
        gVarF = gVarF == null ? h.b().a() : gVarF;
        this.b = gVarF.t() * 1000;
        if (gVarF.x() == null || gVarF.x().size() <= 0) {
            o0.b("IDErrorUtil", "Setting ercd is EMPTY and use default code list.");
            this.d.addAll(a());
        } else {
            o0.b("IDErrorUtil", "Setting ercd not EMPTY will use setting.");
            this.d.addAll(gVarF.x());
        }
    }

    public e b(String str, String str2, String str3, String str4, String str5) {
        return a(str, str2, str3, str4, str5);
    }

    public synchronized void a(String str, int i, String str2, long j) {
        if (this.c.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.d.contains(Integer.valueOf(i))) {
            o0.b("IDErrorUtil", "addErrorInfo : " + str + " " + str2);
            this.c.put(str, new b(j, i, str2));
        }
    }

    public e a(com.mbridge.msdk.foundation.same.net.wrapper.e eVar) {
        String str = eVar.a().get("app_id");
        String str2 = eVar.a().get("placement_id");
        String str3 = TextUtils.isEmpty(str2) ? "" : str2;
        String strReplace = eVar.a().get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(strReplace)) {
            strReplace = eVar.a().get("unit_ids");
            if (!TextUtils.isEmpty(strReplace)) {
                strReplace = strReplace.replace("[", "").replace("]", "");
            }
        }
        String str4 = strReplace;
        String str5 = eVar.a().get("ad_type");
        if (TextUtils.isEmpty(str5)) {
            str5 = "0";
        }
        return a(str, str4, str3, eVar.a().get(BidResponsed.KEY_TOKEN), str5);
    }

    private e a(String str, String str2, String str3, String str4, String str5) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(str3);
        sb.append("_");
        sb.append(str2);
        String strM = DM.m(sb, "_", str5);
        b bVarA = a(strM);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.mbridge.msdk.tracker.network.h("data_res_type", "1"));
        if (bVarA != null && !TextUtils.isEmpty(bVarA.b)) {
            try {
                if (bVarA.f1213a != -1) {
                    return e.a(new JSONObject(bVarA.b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.b.getBytes(), arrayList));
                }
                if (!TextUtils.isEmpty(str4)) {
                    return null;
                }
                if (str5 != null && !TextUtils.isEmpty(str5) && (i = Integer.parseInt(str5)) != 287 && i != 94) {
                    if (System.currentTimeMillis() < ((long) (h.b().c(str, str2).u() * 1000)) + bVarA.c) {
                        return e.a(new JSONObject(bVarA.b), new com.mbridge.msdk.foundation.same.net.toolbox.a(200, bVarA.b.getBytes(), arrayList));
                    }
                    this.c.remove(strM);
                    return null;
                }
            } catch (Exception e) {
                o0.b("IDErrorUtil", e.getMessage());
            }
        }
        o0.b("IDErrorUtil", "getErrorInfo RETURN NULL");
        return null;
    }

    private synchronized b a(String str) {
        b bVar;
        o0.b("IDErrorUtil", "getErrorInfo : " + str);
        if (!this.c.containsKey(str) || (bVar = this.c.get(str)) == null) {
            return null;
        }
        if (bVar.f1213a == -1) {
            return bVar;
        }
        if (System.currentTimeMillis() > bVar.c + ((long) this.b)) {
            this.c.remove(str);
            if (this.c.size() > 0) {
                for (Map.Entry<String, b> entry : this.c.entrySet()) {
                    o0.b("IDErrorUtil", "getErrorInfo : delete timeout entry");
                    if (System.currentTimeMillis() - entry.getValue().c > this.b) {
                        this.c.remove(entry.getKey());
                    }
                }
            }
            return null;
        }
        o0.b("IDErrorUtil", "getErrorInfo : " + bVar.b);
        return bVar;
    }
}
