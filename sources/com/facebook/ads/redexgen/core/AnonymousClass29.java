package com.facebook.ads.redexgen.core;

import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.29, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass29 {
    public static byte[] A03;
    public static String[] A04 = {"yonrCQ0uoeCYCSmT5ejKLJLtf9VOp321", "NDuBqnzzJqzb1WeHMragxAHoyIt26Von", "hWL4zdMk8yywijkAtqHNVn2pZmfj34f9", "9i7qyia1evnFwuCuocWilq3mxIKRQ8Gt", "sdkV7vC", "3a", "fP", "wcot"};
    public final LinkedHashSet<String> A01 = new LinkedHashSet<>();
    public JSONObject A00 = new JSONObject();
    public final AtomicReference<String> A02 = new AtomicReference<>(A01(0, 2, 32));

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A03 = new byte[]{-67, -65, -63, -65, -50, -3, 6, -5, 10, 17, 8, 12, -3, -4, -9, -7, -4, -9, 1, -4, -9, 7, 10, 1, -1, 1, 6, -7, 4, -19, -10, -21, -6, 1, -8, -4, -19, -20, -25, -15, -20, 25, cw.k, 36, 11, cw.m, cw.k, 28, 28, 17, cw.n, 11, cw.k, 30, 30, cw.k, 37, 11, 24, 17, 26, 19, 32, 20, 47, 35, 35, 53, 50, 50, 37, 46, 35, 37, 51, -1, -12, 1, -8, -2, -13, 37, 28, 34, 33, 12, 28, cw.n, cw.n, 34, 31, 31, 18, 27, cw.n, 18, 12, 32, 18, cw.n, 32, 30, 21, 27, 26, 5, 22, 11, 24, cw.m, 21, 10};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0A(String str) throws JSONException, C05428b {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                this.A00 = new JSONObject(str);
                HashMap map = new HashMap();
                Iterator<String> itKeys = this.A00.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (this.A00.get(next) instanceof String) {
                        map.put(next, A00(next, new JSONObject((String) this.A00.get(next))));
                    }
                }
                for (Map.Entry entry : map.entrySet()) {
                    this.A00.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
    }

    static {
        A02();
    }

    private final synchronized C03952g A00(String str, JSONObject jSONObject) throws JSONException, C05428b {
        C03952g frequencyCappingData;
        if (str.equals(jSONObject.optString(A01(29, 12, 70), null))) {
            frequencyCappingData = new C03952g(str);
            A03(frequencyCappingData, jSONObject);
        } else {
            C05428b c05428b = new C05428b(new IllegalArgumentException());
            jSONObject.put(A01(5, 24, 86), str);
            c05428b.A07(jSONObject);
            c05428b.A05(1);
            throw c05428b;
        }
        return frequencyCappingData;
    }

    private void A03(C03952g c03952g, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt(A01(75, 6, 77));
        int iOptInt2 = jSONObject.optInt(A01(101, 11, 100));
        int maxCappedArrayLength = jSONObject.optInt(A01(41, 23, 106), 50);
        long jOptLong = jSONObject.optLong(A01(2, 3, 28));
        String strA01 = A01(64, 11, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
        if (jSONObject.has(strA01)) {
            c03952g.A06((JSONArray) jSONObject.get(strA01));
        }
        String strA02 = A01(81, 20, 107);
        if (jSONObject.has(strA02)) {
            int cappingTimeSecs = jSONObject.optInt(strA02);
            c03952g.A04(cappingTimeSecs);
        }
        c03952g.A05(iOptInt, iOptInt2, jOptLong, maxCappedArrayLength);
    }

    public final String A04() {
        String list = this.A02.get();
        if (list != null) {
            return list;
        }
        if (A04[0].charAt(21) != 'J') {
            throw new RuntimeException();
        }
        A04[7] = "Yd8WV87KlA8AS9IbyfadEkj";
        return A01(0, 2, 32);
    }

    public final synchronized JSONObject A05() {
        return this.A00;
    }

    public final synchronized void A06() {
        JSONArray jSONArray = new JSONArray();
        Iterator<String> it = this.A01.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next());
        }
        this.A02.set(jSONArray.toString());
    }

    public final synchronized void A07(String str) {
        if (this.A01.size() >= C03952g.A00()) {
            Iterator<String> it = this.A01.iterator();
            if (it.hasNext()) {
                this.A01.remove(it.next());
            }
        }
        this.A01.add(str);
        C05267k.A03();
    }

    public final synchronized void A08(String str) throws JSONException {
        if (str != null) {
            if (!str.trim().isEmpty()) {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length() && i < C03952g.A00(); i++) {
                    this.A01.add(jSONArray.getString(i));
                }
            }
        }
    }

    public final synchronized void A09(String str) {
        this.A01.remove(str);
        C05267k.A03();
    }

    public final synchronized void A0B(JSONObject jSONObject) throws JSONException {
        C03952g frequencyCappingData;
        String strOptString = jSONObject.optString(A01(29, 12, 70), null);
        if (strOptString == null) {
            return;
        }
        if (this.A00.has(strOptString) && (this.A00.get(strOptString) instanceof C03952g)) {
            frequencyCappingData = (C03952g) this.A00.get(strOptString);
        } else {
            frequencyCappingData = new C03952g(strOptString);
        }
        A03(frequencyCappingData, jSONObject);
        this.A00.put(strOptString, frequencyCappingData);
    }
}
