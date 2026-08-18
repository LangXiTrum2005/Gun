package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import androidx.core.content.pm.PackageInfoCompat;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2401Eu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2427Fu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2479Hu;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2803Uh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C2855Wh;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.C3647hp;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f847a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, long j, long j2) {
        this.f847a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        this.d = matcher.matches() ? matcher.group(1) : null;
        this.e = "firebase";
        this.f = j;
        this.g = j2;
    }

    public static JSONObject c(URLConnection uRLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map map, Long l) throws C2401Eu {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new C2401Eu("Fetch failed: Firebase installation id is null.", 1);
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.b);
        Context context = this.f847a;
        Locale locale = context.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(PackageInfoCompat.getLongVersionCode(packageInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, context.getPackageName());
        map2.put("sdkVersion", "21.4.1");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map2.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map2);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.d + "/namespaces/" + this.e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new C2427Fu(e.getMessage(), 1);
        }
    }

    @Keep
    public C2855Wh fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) throws C2427Fu {
        String strBytesToStringUppercase;
        JSONObject jSONObject;
        JSONArray jSONArray;
        JSONObject jSONObject2;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty(HttpRequestHeader.IfNoneMatch, str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        Context context = this.f847a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                context.getPackageName();
                strBytesToStringUppercase = null;
            } else {
                strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            context.getPackageName();
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty(HttpRequestHeader.Accept, "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        try {
            try {
                d(httpURLConnection, a(str, str2, map, l).toString().getBytes("utf-8"));
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 200) {
                    throw new C2479Hu(responseCode, httpURLConnection.getResponseMessage());
                }
                String headerField = httpURLConnection.getHeaderField("ETag");
                JSONObject jSONObjectC = c(httpURLConnection);
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused2) {
                }
                try {
                    C3647hp c3647hpB = C2803Uh.b();
                    c3647hpB.d = date;
                    try {
                        jSONObject = jSONObjectC.getJSONObject("entries");
                    } catch (JSONException unused3) {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        try {
                            c3647hpB.c = new JSONObject(jSONObject.toString());
                        } catch (JSONException unused4) {
                        }
                    }
                    try {
                        jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                    } catch (JSONException unused5) {
                        jSONArray = null;
                    }
                    if (jSONArray != null) {
                        try {
                            c3647hpB.e = new JSONArray(jSONArray.toString());
                        } catch (JSONException unused6) {
                        }
                    }
                    try {
                        jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                    } catch (JSONException unused7) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        try {
                            c3647hpB.b = new JSONObject(jSONObject2.toString());
                        } catch (JSONException unused8) {
                        }
                    }
                    String string = jSONObjectC.has("templateVersion") ? jSONObjectC.getString("templateVersion") : null;
                    if (string != null) {
                        c3647hpB.f4473a = Long.parseLong(string);
                    }
                    C2803Uh c2803Uh = new C2803Uh((JSONObject) c3647hpB.c, (Date) c3647hpB.d, (JSONArray) c3647hpB.e, (JSONObject) c3647hpB.b, c3647hpB.f4473a);
                    try {
                        if (!(!jSONObjectC.get("state").equals("NO_CHANGE"))) {
                            return new C2855Wh(1, c2803Uh, null);
                        }
                    } catch (JSONException unused9) {
                    }
                    return new C2855Wh(0, c2803Uh, headerField);
                } catch (JSONException e) {
                    throw new C2401Eu("Fetch failed: fetch response could not be parsed.", e, 1);
                }
            } catch (IOException | JSONException e2) {
                throw new C2401Eu("The client had an error while calling the backend!", e2, 1);
            }
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused10) {
            }
            throw th;
        }
    }
}
