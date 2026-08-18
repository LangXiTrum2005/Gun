package com.facebook.ads.redexgen.core;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.badlogic.gdx.Input;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NA extends AbstractC2023nG {
    public static byte[] A04;
    public static String[] A05 = {"b4EbQiKGBOPn48tIsiPL5n4N5SxNZ1EN", "C4qAvqPXqcx1", "av0PnThHX1ufh2ncI3f6iPLWfGZcgSDj", "l1hdtvJdt41N", "aFghpyqA523JYmrsO", "P4eeegJbz09MXnMZrJhy5IVHeFKKR7Ef", "fwPno9KqPJ0g1dx57vycq8IipA21WGGJ", "Ava7qu9S1KN"};
    public static final String A06;
    public CL A00;
    public final Uri A01;
    public final C03962h A02;
    public final Map<String, String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 41);
        }
        return new String(bArrCopyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final List<Intent> A06() {
        List<AnonymousClass20> listA05 = A05();
        ArrayList arrayList = new ArrayList();
        if (listA05 != null) {
            Iterator<AnonymousClass20> it = listA05.iterator();
            while (it.hasNext()) {
                Intent intentA00 = A00(it.next());
                if (intentA00 != null) {
                    arrayList.add(intentA00);
                }
            }
        }
        return arrayList;
    }

    public static void A07() {
        A04 = new byte[]{88, 111, 111, 114, 111, 61, 109, 124, 111, 110, 116, 115, 122, 61, 124, 109, 109, 110, 116, 105, 120, 66, 121, 124, 105, 124, 51, 20, 28, 25, cw.n, 17, 85, 1, 26, 85, 26, 5, cw.n, 27, 85, 24, 20, 7, 30, cw.n, 1, 85, 0, 7, 25, 79, 85, 51, 53, 8, 7, cw.k, 27, 6, 0, cw.k, 63, 48, 58, 44, 49, 55, 58, 112, 55, 48, 42, 59, 48, 42, 112, 63, 61, 42, 55, 49, 48, 112, 26, 23, 31, 18, 5, 10, 0, 22, 11, cw.k, 0, 74, cw.k, 10, cw.n, 1, 10, cw.n, 74, 5, 7, cw.n, cw.k, 11, 10, 74, 50, 45, 33, 51, 34, 51, 51, 48, 42, 55, 38, 28, 39, 34, 55, 34, 79, 64, 69, 79, 71, 115, 95, 67, 89, 94, 79, 73, 25, 21, 6, 31, 17, 0, 78, 91, 91, cw.n, 17, 0, 21, 29, 24, 7, 75, 29, cw.n, 73, 81, 7, 125, 98, 119, 124, 119, 118, 77, 118, 119, 119, 98, 126, 123, 124, 121, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 114, 117, 120, 120, 118, 117, 119, 127, 75, 97, 102, 120, 123, 100, 113, 122, 113, 112, 75, 103, 96, 123, 102, 113, 75, 97, 102, 120, 82, 67, 80, 81, 75, 76, 69, 56, 63, 36, 57, 46, 20, 34, 47, 81, 86, 77, 80, 71, 125, 87, 80, 78, 60, 59, 32, 61, 42, cw.n, 58, 61, 35, cw.n, 56, 42, 45, cw.n, 41, 46, 35, 35, 45, 46, 44, 36, 23, 6, cw.m, 89, 24, 9, 0, 28, 30, 3, 1, 28, 24, 86, 1, 7, 17, 6, 23, 24, 29, 23, 31};
    }

    static {
        A07();
        A06 = NA.class.getSimpleName();
    }

    public NA(C1828k1 c1828k1, A7 a7, String str, Uri uri, Map<String, String> extraData, AnonymousClass22 anonymousClass22, boolean z, C03962h c03962h) {
        super(c1828k1, a7, str, anonymousClass22, z);
        this.A01 = uri;
        this.A03 = extraData;
        this.A02 = c03962h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3.startsWith(r0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.content.Intent A00(com.facebook.ads.redexgen.core.AnonymousClass20 r12) {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.NA.A00(com.facebook.ads.redexgen.X.20):android.content.Intent");
    }

    private Intent A01(AnonymousClass20 anonymousClass20) {
        Intent intent = new Intent(A04(88, 26, 77));
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(anonymousClass20.A05()) && !TextUtils.isEmpty(anonymousClass20.A04())) {
            intent.setComponent(new ComponentName(anonymousClass20.A05(), anonymousClass20.A04()));
        }
        if (!TextUtils.isEmpty(anonymousClass20.A03())) {
            intent.setData(C5.A00(anonymousClass20.A03()));
        }
        return intent;
    }

    private final Uri A02() {
        String queryParameter = this.A01.getQueryParameter(A04(231, 9, 11));
        if (!TextUtils.isEmpty(queryParameter)) {
            return C5.A00(queryParameter);
        }
        Uri uri = this.A01;
        String storeUrl = A04(EnumC4719u30.STALE_CACHED_RESPONSE_VALUE, 8, 98);
        String storeId = uri.getQueryParameter(storeUrl);
        Locale locale = Locale.US;
        Object[] objArr = {storeId};
        String storeUrl2 = A04(138, 22, 93);
        return C5.A00(String.format(locale, storeUrl2, objArr));
    }

    private EnumC03831u A03() throws C0618Bo {
        C2 c2 = new C2();
        try {
            return C2.A05(c2, ((AbstractC03841v) this).A00, A02(), ((AbstractC03841v) this).A02, this.A03);
        } catch (C0618Bo unused) {
            String str = A04(26, 27, 92) + this.A01.toString();
            String queryParameter = this.A01.getQueryParameter(A04(PsExtractor.VIDEO_STREAM_MASK, 22, 102));
            if (queryParameter != null && queryParameter.length() > 0) {
                C2.A0D(c2, ((AbstractC03841v) this).A00, C5.A00(queryParameter), ((AbstractC03841v) this).A02);
            }
            return EnumC03831u.A09;
        }
    }

    private List<AnonymousClass20> A05() {
        String queryParameter = this.A01.getQueryParameter(A04(114, 12, 106));
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String appsiteDataString = A04(53, 2, 65);
        if (appsiteDataString.equals(queryParameter)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        try {
            JSONObject jSONObject = new JSONObject(queryParameter);
            String appsiteDataString2 = A04(55, 7, 64);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(appsiteDataString2);
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    AnonymousClass20 anonymousClass20A00 = AnonymousClass20.A00(jSONArrayOptJSONArray.optJSONObject(i));
                    if (anonymousClass20A00 != null) {
                        arrayList.add(anonymousClass20A00);
                    }
                }
            }
        } catch (JSONException e) {
            C8Z c8zA08 = ((AbstractC03841v) this).A00.A08();
            int i2 = AbstractC05418a.A24;
            C05428b c05428b = new C05428b(e);
            String appsiteDataString3 = A04(EnumC4719u30.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 7, 11);
            c8zA08.AAu(appsiteDataString3, i2, c05428b);
            String str = A06;
            String appsiteDataString4 = A04(0, 26, 52);
            Log.w(str, appsiteDataString4, e);
        }
        return arrayList;
    }

    private boolean A08() {
        List<Intent> appLaunchIntents = A06();
        if (appLaunchIntents == null) {
            return false;
        }
        Iterator<Intent> it = appLaunchIntents.iterator();
        while (it.hasNext()) {
            try {
                if (C0620Bq.A0D(((AbstractC03841v) this).A00, it.next())) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean A09(C1828k1 c1828k1, String str) {
        return Build.VERSION.SDK_INT >= 30 && str != null && C05789m.A21(c1828k1);
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2023nG
    public final EnumC03831u A0D() {
        EnumC03831u enumC03831uA0G = EnumC03831u.A09;
        if (super.A03) {
            enumC03831uA0G = A0G();
        } else {
            this.A03.put(A04(200, 16, 61), String.valueOf(true));
        }
        C1828k1 c1828k1 = ((AbstractC03841v) this).A00;
        if (A05[2].charAt(5) != 'T') {
            throw new RuntimeException();
        }
        A05[4] = "kOq5WVrOOgnK8qBpA";
        if (!D3.A0e(c1828k1, enumC03831uA0G, this.A03)) {
            A0E(this.A03, enumC03831uA0G);
            C03962h.A06(this.A02, ((AbstractC03841v) this).A00);
        } else {
            EnumC03831u actionOutcome = EnumC03831u.A08;
            if (enumC03831uA0G != actionOutcome && this.A00 != null) {
                String str = this.A03.get(A04(EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 12, 5));
                if (A04(276, 9, 93) == str) {
                    this.A00.A0C(str, this.A02, ((AbstractC03841v) this).A02);
                } else {
                    this.A00.A0D(str, this.A02, ((AbstractC03841v) this).A02);
                }
            }
        }
        return enumC03831uA0G;
    }

    public final EnumC03831u A0G() {
        EnumC03831u enumC03831uA03 = EnumC03831u.A09;
        String strA04 = A04(Input.Keys.NUMPAD_ENTER, 15, 59);
        boolean zA0F = A0F(this.A01);
        if (!zA0F) {
            zA0F = A08();
        }
        if (!zA0F) {
            try {
                enumC03831uA03 = A03();
                if (enumC03831uA03 != EnumC03831u.A09) {
                    strA04 = A04(200, 16, 61);
                } else {
                    strA04 = A04(175, 25, 61);
                }
            } catch (Exception unused) {
                enumC03831uA03 = EnumC03831u.A04;
            }
        }
        Map<String, String> map = this.A03;
        String redirectionAction = String.valueOf(true);
        map.put(strA04, redirectionAction);
        return enumC03831uA03;
    }

    public final void A0H(CL cl) {
        this.A00 = cl;
    }
}
