package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
final class zzcdp extends zzfr implements zzgt {
    private static final Pattern zza = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference zzb = new AtomicReference();
    private final SSLSocketFactory zzc;
    private final int zzd;
    private final int zze;
    private final String zzf;
    private final zzgs zzg;
    private zzgd zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private int zzq;
    private final Set zzr;

    public zzcdp(String str, zzgy zzgyVar, int i, int i2, int i3) {
        super(true);
        this.zzc = new zzcdo(this);
        this.zzr = new HashSet();
        zzcw.zzc(str);
        this.zzf = str;
        this.zzg = new zzgs();
        this.zzd = i;
        this.zze = i2;
        this.zzq = i3;
        if (zzgyVar != null) {
            zzf(zzgyVar);
        }
    }

    private final void zzn() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007b A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0081  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082 A[Catch: IOException -> 0x001b, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x0088 A[Catch: IOException -> 0x001b, TRY_LEAVE, TryCatch #0 {IOException -> 0x001b, blocks: (B:2:0x0000, B:23:0x005a, B:25:0x0062, B:28:0x006d, B:29:0x0073, B:31:0x007b, B:34:0x0082, B:35:0x0087, B:36:0x0088, B:5:0x000b, B:7:0x0016, B:10:0x001e, B:12:0x0026, B:15:0x003c, B:16:0x0046, B:17:0x004b, B:18:0x004c, B:19:0x0051, B:20:0x0052), top: B:40:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws zzgp {
        int i3;
        try {
            if (this.zzo != this.zzm) {
                byte[] bArr2 = (byte[]) zzb.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j = this.zzo;
                    long j2 = this.zzm;
                    if (j == j2) {
                        zzb.set(bArr2);
                        break;
                    }
                    int i4 = this.zzj.read(bArr2, 0, (int) Math.min(j2 - j, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i4 == -1) {
                        throw new EOFException();
                    }
                    this.zzo += (long) i4;
                    zzg(i4);
                }
            }
            if (i2 == 0) {
                return 0;
            }
            long j3 = this.zzn;
            if (j3 != -1) {
                long j4 = j3 - this.zzp;
                if (j4 != 0) {
                    i2 = (int) Math.min(i2, j4);
                    i3 = this.zzj.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.zzp += (long) i3;
                        zzg(i3);
                        return i3;
                    }
                    if (this.zzn == -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i3 = this.zzj.read(bArr, i, i2);
                if (i3 == -1) {
                    this.zzp += (long) i3;
                    zzg(i3);
                    return i3;
                }
                if (this.zzn == -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e) {
            throw new zzgp(e, this.zzh, 2000, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x026f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00bc A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:21:0x0082, B:23:0x009c, B:24:0x00ae, B:25:0x00b3, B:27:0x00bc, B:28:0x00c3, B:41:0x00ee, B:94:0x0233, B:96:0x023e, B:98:0x024f, B:101:0x0258, B:102:0x0267, B:104:0x026f, B:105:0x0276, B:106:0x0277, B:107:0x028d), top: B:118:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x023e A[Catch: IOException -> 0x003c, TryCatch #4 {IOException -> 0x003c, blocks: (B:3:0x000e, B:4:0x0023, B:6:0x0029, B:8:0x0033, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:21:0x0082, B:23:0x009c, B:24:0x00ae, B:25:0x00b3, B:27:0x00bc, B:28:0x00c3, B:41:0x00ee, B:94:0x0233, B:96:0x023e, B:98:0x024f, B:101:0x0258, B:102:0x0267, B:104:0x026f, B:105:0x0276, B:106:0x0277, B:107:0x028d), top: B:118:0x000e }] */
    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(zzgd zzgdVar) throws zzgp {
        int responseCode;
        String headerField;
        String protocol;
        long j;
        long jMax;
        this.zzh = zzgdVar;
        long j2 = 0;
        this.zzp = 0L;
        this.zzo = 0L;
        try {
            URL url = new URL(zzgdVar.zza.toString());
            long j3 = zzgdVar.zze;
            long j4 = zzgdVar.zzf;
            boolean zZzb = zzgdVar.zzb(1);
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i > 20) {
                    throw new NoRouteToHostException("Too many redirects: " + i2);
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.zzc);
                }
                httpURLConnection.setConnectTimeout(this.zzd);
                httpURLConnection.setReadTimeout(this.zze);
                for (Map.Entry entry : this.zzg.zza().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j3 == j2) {
                    if (j4 != -1) {
                    }
                    httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                    if (!zZzb) {
                        httpURLConnection.setRequestProperty(HttpRequestHeader.AcceptEncoding, "identity");
                    }
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode == 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.zzi = httpURLConnection;
                        try {
                            int responseCode2 = httpURLConnection.getResponseCode();
                            this.zzl = responseCode2;
                            if (responseCode2 < 200 || responseCode2 > 299) {
                                Map<String, List<String>> headerFields = this.zzi.getHeaderFields();
                                zzn();
                                zzgr zzgrVar = new zzgr(this.zzl, null, null, headerFields, zzgdVar, zzei.zzf);
                                if (this.zzl != 416) {
                                    throw zzgrVar;
                                }
                                zzgrVar.initCause(new zzfz(2008));
                                throw zzgrVar;
                            }
                            if (responseCode2 == 200) {
                                j = zzgdVar.zze;
                                if (j == 0) {
                                    j = 0;
                                }
                            } else {
                                j = 0;
                            }
                            this.zzm = j;
                            if (zzgdVar.zzb(1)) {
                                this.zzn = zzgdVar.zzf;
                            } else {
                                long j5 = zzgdVar.zzf;
                                if (j5 != -1) {
                                    this.zzn = j5;
                                } else {
                                    HttpURLConnection httpURLConnection2 = this.zzi;
                                    String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                    if (TextUtils.isEmpty(headerField2)) {
                                        jMax = -1;
                                    } else {
                                        try {
                                            jMax = Long.parseLong(headerField2);
                                        } catch (NumberFormatException unused) {
                                            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected Content-Length [" + headerField2 + "]");
                                            jMax = -1;
                                        }
                                    }
                                    String headerField3 = httpURLConnection2.getHeaderField(HttpResponseHeader.ContentRange);
                                    if (!TextUtils.isEmpty(headerField3)) {
                                        Matcher matcher = zza.matcher(headerField3);
                                        if (matcher.find()) {
                                            try {
                                                long j6 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                                if (jMax < 0) {
                                                    jMax = j6;
                                                } else if (jMax != j6) {
                                                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Inconsistent headers [" + headerField2 + "] [" + headerField3 + "]");
                                                    jMax = Math.max(jMax, j6);
                                                }
                                            } catch (NumberFormatException unused2) {
                                                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unexpected Content-Range [" + headerField3 + "]");
                                            }
                                        }
                                    }
                                    this.zzn = jMax != -1 ? jMax - this.zzm : -1L;
                                }
                            }
                            try {
                                this.zzj = this.zzi.getInputStream();
                                this.zzk = true;
                                zzj(zzgdVar);
                                return this.zzn;
                            } catch (IOException e) {
                                zzn();
                                throw new zzgp(e, zzgdVar, 2000, 1);
                            }
                        } catch (IOException e2) {
                            zzn();
                            throw new zzgp("Unable to connect to ".concat(String.valueOf(zzgdVar.zza.toString())), e2, zzgdVar, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField(HttpResponseHeader.Location);
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i = i2;
                    j2 = 0;
                } else {
                    j2 = j3;
                }
                String string = "bytes=" + j2 + "-";
                if (j4 != -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append((j2 + j4) - 1);
                    string = sb.toString();
                }
                httpURLConnection.setRequestProperty("Range", string);
                httpURLConnection.setRequestProperty("User-Agent", this.zzf);
                if (!zZzb) {
                    httpURLConnection.setRequestProperty(HttpRequestHeader.AcceptEncoding, "identity");
                }
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode == 300) {
                }
                headerField = httpURLConnection.getHeaderField(HttpResponseHeader.Location);
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i = i2;
                j2 = 0;
            }
        } catch (IOException e3) {
            throw new zzgp("Unable to connect to ".concat(String.valueOf(zzgdVar.zza.toString())), e3, zzgdVar, 2000, 1);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() throws zzgp {
        try {
            InputStream inputStream = this.zzj;
            if (inputStream != null) {
                int i = zzei.zza;
                try {
                    inputStream.close();
                } catch (IOException e) {
                    throw new zzgp(e, this.zzh, 2000, 3);
                }
            }
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
        } catch (Throwable th) {
            this.zzj = null;
            zzn();
            if (this.zzk) {
                this.zzk = false;
                zzh();
            }
            this.zzr.clear();
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfr, com.google.android.gms.internal.ads.zzfy
    @Nullable
    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    public final void zzm(int i) {
        this.zzq = i;
        for (Socket socket : this.zzr) {
            if (!socket.isClosed()) {
                try {
                    socket.setReceiveBufferSize(this.zzq);
                } catch (SocketException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to update receive buffer size.", e);
                }
            }
        }
    }
}
