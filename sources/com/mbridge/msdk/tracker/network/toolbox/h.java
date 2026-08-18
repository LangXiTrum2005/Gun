package com.mbridge.msdk.tracker.network.toolbox;

import com.badlogic.gdx.Net;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.tracker.network.u;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes2.dex */
public class h extends com.mbridge.msdk.tracker.network.toolbox.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f2054a;

    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f2055a;

        public a(HttpURLConnection httpURLConnection) {
            super(h.b(httpURLConnection));
            this.f2055a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f2055a.disconnect();
        }
    }

    public interface b {
    }

    public h() {
        this(null);
    }

    private static boolean a(int i, int i2) {
        return (i == 4 || (100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    public h(b bVar) {
        this(bVar, null);
    }

    public h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f2054a = sSLSocketFactory;
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.a
    public g a(u<?> uVar, Map<String, String> map) throws IOException {
        String strA = uVar.g() == 0 ? d.a(uVar.t(), uVar) : uVar.t();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(uVar.f());
        HttpsURLConnection httpsURLConnectionA = a(new URL(strA), uVar);
        try {
            for (String str : map2.keySet()) {
                httpsURLConnectionA.setRequestProperty(str, (String) map2.get(str));
            }
            b(httpsURLConnectionA, uVar);
            int responseCode = httpsURLConnectionA.getResponseCode();
            if (responseCode != -1) {
                if (!a(uVar.g(), responseCode)) {
                    g gVar = new g(responseCode, a(httpsURLConnectionA.getHeaderFields()));
                    httpsURLConnectionA.disconnect();
                    return gVar;
                }
                return new g(responseCode, a(httpsURLConnectionA.getHeaderFields()), httpsURLConnectionA.getContentLength(), a(uVar, httpsURLConnectionA));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                httpsURLConnectionA.disconnect();
            }
            throw th;
        }
    }

    public void b(HttpURLConnection httpURLConnection, u<?> uVar) throws IOException {
        switch (uVar.g()) {
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                a(httpURLConnection, uVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod(Net.HttpMethods.PUT);
                a(httpURLConnection, uVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod(Net.HttpMethods.DELETE);
                return;
            case 4:
                httpURLConnection.setRequestMethod(Net.HttpMethods.HEAD);
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod(Net.HttpMethods.PATCH);
                a(httpURLConnection, uVar);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    public static List<com.mbridge.msdk.tracker.network.h> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.mbridge.msdk.tracker.network.h(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    public InputStream a(u<?> uVar, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    public HttpsURLConnection a(URL url) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(url));
        httpsURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpsURLConnection;
    }

    private HttpsURLConnection a(URL url, u<?> uVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpsURLConnection httpsURLConnectionA = a(url);
        int iQ = uVar.q();
        httpsURLConnectionA.setConnectTimeout(iQ);
        httpsURLConnectionA.setReadTimeout(iQ);
        httpsURLConnectionA.setUseCaches(false);
        httpsURLConnectionA.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f2054a) != null) {
            httpsURLConnectionA.setSSLSocketFactory(sSLSocketFactory);
        }
        return httpsURLConnectionA;
    }

    private void a(HttpURLConnection httpURLConnection, u<?> uVar) throws IOException {
        byte[] bArrB = uVar.b();
        if (bArrB != null) {
            a(httpURLConnection, uVar, bArrB);
        }
    }

    private void a(HttpURLConnection httpURLConnection, u<?> uVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", uVar.c());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(a(uVar, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    public OutputStream a(u<?> uVar, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }
}
