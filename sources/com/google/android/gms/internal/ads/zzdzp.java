package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.google.android.gms.common.util.IOUtils;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdzp implements zzffr {
    protected final Context zza;
    protected final String zzb;

    public zzdzp(Context context, String str, zzbvs zzbvsVar, int i) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzffr
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzdzo zza(zzdzn zzdznVar) throws zzdvy {
        return zzc(zzdznVar.zza, zzdznVar.zzb, zzdznVar.zzc, zzdznVar.zzd, zzdznVar.zze, com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());
    }

    public final zzdzo zzc(String str, int i, Map map, byte[] bArr, String str2, long j) throws MalformedURLException, zzdvy {
        HttpURLConnection httpURLConnection;
        URL url;
        InputStreamReader inputStreamReader;
        try {
            zzdzo zzdzoVar = new zzdzo();
            com.google.android.gms.ads.internal.util.client.zzo.zzi("SDK version: " + this.zzb);
            com.google.android.gms.ads.internal.util.client.zzo.zze("AdRequestServiceImpl: Sending request: " + str);
            URL url2 = new URL(str);
            HashMap map2 = new HashMap();
            int i2 = 0;
            while (true) {
                httpURLConnection = (HttpURLConnection) url2.openConnection();
                try {
                    try {
                        com.google.android.gms.ads.internal.zzv.zzq().zzf(this.zza, this.zzb, false, httpURLConnection, false, i);
                        for (Map.Entry entry : map.entrySet()) {
                            httpURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            httpURLConnection.setRequestProperty("Content-Type", str2);
                        }
                        BufferedOutputStream bufferedOutputStream = null;
                        com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                        try {
                            zzlVar.zzc(httpURLConnection, bArr);
                        } catch (Throwable th) {
                            com.google.android.gms.ads.internal.util.client.zzo.zzh("Network request logging failed.", th);
                            com.google.android.gms.ads.internal.zzv.zzp().zzv(th, "HttpRequestFunction.logAdRequest");
                        }
                        int length = bArr.length;
                        if (length > 0) {
                            httpURLConnection.setDoOutput(true);
                            httpURLConnection.setFixedLengthStreamingMode(length);
                            try {
                                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(httpURLConnection.getOutputStream());
                                try {
                                    bufferedOutputStream2.write(bArr);
                                    IOUtils.closeQuietly(bufferedOutputStream2);
                                } catch (Throwable th2) {
                                    th = th2;
                                    bufferedOutputStream = bufferedOutputStream2;
                                    IOUtils.closeQuietly(bufferedOutputStream);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        }
                        int responseCode = httpURLConnection.getResponseCode();
                        for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                            String key = entry2.getKey();
                            List<String> value = entry2.getValue();
                            if (map2.containsKey(key)) {
                                ((List) map2.get(key)).addAll(value);
                            } else {
                                map2.put(key, new ArrayList(value));
                            }
                        }
                        zzlVar.zze(httpURLConnection, responseCode);
                        zzdzoVar.zza = responseCode;
                        zzdzoVar.zzb = map2;
                        zzdzoVar.zzc = "";
                        if (responseCode >= 200 && responseCode < 300) {
                            try {
                                InputStreamReader inputStreamReader2 = new InputStreamReader(httpURLConnection.getInputStream());
                                try {
                                    com.google.android.gms.ads.internal.zzv.zzq();
                                    StringBuilder sb = new StringBuilder(8192);
                                    char[] cArr = new char[2048];
                                    while (true) {
                                        int i3 = inputStreamReader2.read(cArr);
                                        if (i3 == -1) {
                                            break;
                                        }
                                        sb.append(cArr, 0, i3);
                                    }
                                    String string = sb.toString();
                                    IOUtils.closeQuietly(inputStreamReader2);
                                    zzlVar.zzg(string);
                                    zzdzoVar.zzc = string;
                                    if (TextUtils.isEmpty(string)) {
                                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfv)).booleanValue()) {
                                            throw new zzdvy(3);
                                        }
                                    }
                                    zzdzoVar.zzd = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j;
                                    break;
                                } catch (Throwable th4) {
                                    th = th4;
                                    inputStreamReader = inputStreamReader2;
                                    IOUtils.closeQuietly(inputStreamReader);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                inputStreamReader = null;
                            }
                        } else {
                            if (responseCode < 300 || responseCode >= 400) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Received error HTTP response code: " + responseCode);
                                throw new zzdvy(1, "Received error HTTP response code: " + responseCode);
                            }
                            String headerField = httpURLConnection.getHeaderField(HttpResponseHeader.Location);
                            if (TextUtils.isEmpty(headerField)) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("No location header to follow redirect.");
                                throw new zzdvy(1, "No location header to follow redirect");
                            }
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzhH)).booleanValue()) {
                                try {
                                    url = new URI(headerField).toURL();
                                } catch (URISyntaxException e) {
                                    throw new zzdvy(1, e.getMessage(), e);
                                }
                            } else {
                                url = new URL(headerField);
                            }
                            i2++;
                            if (i2 > ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfb)).intValue()) {
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Too many redirects.");
                                throw new zzdvy(1, "Too many redirects");
                            }
                            httpURLConnection.disconnect();
                            url2 = url;
                        }
                    } catch (zzdvy e2) {
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzih)).booleanValue()) {
                            throw e2;
                        }
                        zzdzoVar.zzd = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - j;
                    }
                } catch (Throwable th6) {
                    httpURLConnection.disconnect();
                    throw th6;
                }
            }
            httpURLConnection.disconnect();
            return zzdzoVar;
        } catch (IOException e3) {
            String strConcat = "Error while connecting to ad server: ".concat(String.valueOf(e3.getMessage()));
            com.google.android.gms.ads.internal.util.client.zzo.zzj(strConcat);
            throw new zzdvy(1, strConcat, e3);
        }
    }
}
