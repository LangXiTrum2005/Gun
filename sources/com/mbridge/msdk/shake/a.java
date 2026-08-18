package com.mbridge.msdk.shake;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.report.metrics.d;
import com.mbridge.msdk.foundation.tools.o0;
import com.umeng.analytics.pro.bc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SensorManager f1817a;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static a f1818a = new a();
    }

    public static a a() {
        return b.f1818a;
    }

    public void b(SensorEventListener sensorEventListener) {
        SensorManager sensorManager = this.f1817a;
        if (sensorManager != null) {
            try {
                sensorManager.unregisterListener(sensorEventListener);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private a() {
    }

    public void a(SensorEventListener sensorEventListener) {
        a(sensorEventListener, null, 2);
    }

    public void a(SensorEventListener sensorEventListener, Sensor sensor, int i) {
        Context contextD = c.n().d();
        if (contextD != null) {
            try {
                if (this.f1817a == null) {
                    this.f1817a = (SensorManager) contextD.getSystemService(bc.ac);
                }
                if (sensor == null) {
                    sensor = this.f1817a.getDefaultSensor(1);
                }
                this.f1817a.registerListener(sensorEventListener, sensor, i);
            } catch (Exception e) {
                e.printStackTrace();
                a(contextD, e.getMessage());
            }
        }
    }

    private static void a(Context context, String str) {
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("key", "2000106");
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.V)) {
                    jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, com.mbridge.msdk.foundation.same.a.V);
                }
                if (!TextUtils.isEmpty(com.mbridge.msdk.foundation.same.a.g)) {
                    jSONObject.put(bc.aL, com.mbridge.msdk.foundation.same.a.g);
                }
                jSONObject.put("reason", str);
                d.b().a(jSONObject);
            } catch (Throwable th) {
                o0.b("NativeShakeManager", th.getMessage());
            }
        }
    }
}
