package com.mbridge.msdk.mbsignalcommon.Report;

import android.content.Context;
import android.util.Base64;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.entity.m;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    private static final String c = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1455a = 0;
    int b = 1;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.Report.a$a, reason: collision with other inner class name */
    public static final class C0195a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static a f1456a = new a();
    }

    public static a a() {
        return C0195a.f1456a;
    }

    public void a(Object obj, String str, JSONArray jSONArray, int i) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        JSONObject jSONObjectOptJSONObject5;
        JSONObject jSONObjectOptJSONObject6;
        JSONObject jSONObjectOptJSONObject7;
        JSONObject jSONObjectOptJSONObject8;
        JSONObject jSONObjectOptJSONObject9;
        JSONObject jSONObjectOptJSONObject10;
        JSONObject jSONObjectOptJSONObject11;
        int i2;
        try {
            if (jSONArray == null) {
                a(this.b, "called reporter failed, params empty", obj);
                return;
            }
            int length = jSONArray.length();
            if (length == 0) {
                a(this.b, "called reporter failed, params empty", obj);
                return;
            }
            int i3 = 0;
            if ("reportMessageR".equalsIgnoreCase(str)) {
                StringBuffer stringBuffer = new StringBuffer();
                while (true) {
                    i2 = length - 1;
                    if (i3 >= i2) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject12 = jSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject12 != null) {
                        stringBuffer.append(jSONObjectOptJSONObject12.optString("key"));
                        stringBuffer.append("=");
                        stringBuffer.append(jSONObjectOptJSONObject12.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                        stringBuffer.append("&");
                    }
                    i3++;
                }
                JSONObject jSONObjectOptJSONObject13 = jSONArray.optJSONObject(i2);
                if (jSONObjectOptJSONObject13 != null) {
                    stringBuffer.append(jSONObjectOptJSONObject13.optString("key"));
                    stringBuffer.append("=");
                    stringBuffer.append(jSONObjectOptJSONObject13.opt(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                }
                a(stringBuffer.toString());
            } else if ("reportMessageD".equalsIgnoreCase(str)) {
                String string = "";
                String string2 = (length <= 0 || (jSONObjectOptJSONObject11 = jSONArray.optJSONObject(0)) == null) ? "" : jSONObjectOptJSONObject11.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i4 = (length <= 1 || (jSONObjectOptJSONObject10 = jSONArray.optJSONObject(1)) == null) ? -1 : jSONObjectOptJSONObject10.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i5 = (length <= 2 || (jSONObjectOptJSONObject9 = jSONArray.optJSONObject(2)) == null) ? -1 : jSONObjectOptJSONObject9.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i6 = (length <= 3 || (jSONObjectOptJSONObject8 = jSONArray.optJSONObject(3)) == null) ? -1 : jSONObjectOptJSONObject8.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i7 = (length <= 4 || (jSONObjectOptJSONObject7 = jSONArray.optJSONObject(4)) == null) ? -1 : jSONObjectOptJSONObject7.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                String string3 = (length <= 5 || (jSONObjectOptJSONObject6 = jSONArray.optJSONObject(5)) == null) ? "" : jSONObjectOptJSONObject6.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                String string4 = (length <= 6 || (jSONObjectOptJSONObject5 = jSONArray.optJSONObject(6)) == null) ? "" : jSONObjectOptJSONObject5.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i8 = (length <= 7 || (jSONObjectOptJSONObject4 = jSONArray.optJSONObject(7)) == null) ? -1 : jSONObjectOptJSONObject4.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                String string5 = (length <= 8 || (jSONObjectOptJSONObject3 = jSONArray.optJSONObject(8)) == null) ? "" : jSONObjectOptJSONObject3.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                int i9 = (length <= 9 || (jSONObjectOptJSONObject2 = jSONArray.optJSONObject(9)) == null) ? -1 : jSONObjectOptJSONObject2.getInt(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                if (length > 10 && (jSONObjectOptJSONObject = jSONArray.optJSONObject(10)) != null) {
                    string = jSONObjectOptJSONObject.getString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
                }
                a(string2, i4, i5, i6, i7, string3, string4, i8, string5, i9, string);
            }
            a(this.f1455a, "called reporter success", obj);
        } catch (Throwable th) {
            o0.a(c, th.getMessage());
            a(this.b, "exception: " + th.getMessage(), obj);
        }
    }

    public void a(String str) {
        d.b().d(str);
    }

    public void a(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        try {
            Context contextD = c.n().d();
            if (contextD != null) {
                n.a(g.a(contextD)).a(new m(str, i, i2, i3, i4, str2, str3, i5, str4, i6, str5));
            }
        } catch (Throwable th) {
            o0.a(c, th.getMessage());
        }
    }

    public void a(int i, String str, Object obj) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, str);
            f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (JSONException e) {
            o0.a(c, e.getMessage());
        } catch (Throwable th) {
            o0.a(c, th.getMessage());
        }
    }
}
